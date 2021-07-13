/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018 IncQuery Labs Ltd.
 * Copyright (c) 2018-2020 Model Driven Solutions, Inc.
 * Copyright (c) 2018,2019 California Institute of Technology/Jet Propulsion Laboratory
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * 
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 * 
 * Contributors:
 *  Zoltan Kiss, IncQuery
 *  Balazs Grill, IncQuery
 *  Ed Seidewitz, MDS
 *  Miyako Wilson, JPL
 * 
 *****************************************************************************/
package org.omg.kerml.xtext.scoping

import com.google.common.base.Predicates
import com.google.inject.Inject
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.IScope
import org.omg.sysml.lang.sysml.Element
import org.omg.sysml.lang.sysml.Membership
import org.omg.sysml.lang.sysml.SysMLPackage
import org.omg.sysml.lang.sysml.Import
import org.eclipse.xtext.scoping.IGlobalScopeProvider
import org.omg.sysml.lang.sysml.Conjugation
import org.omg.sysml.lang.sysml.Connector
import org.omg.sysml.lang.sysml.Subsetting
import org.omg.sysml.lang.sysml.Namespace
import org.omg.sysml.lang.sysml.Redefinition
import org.omg.sysml.lang.sysml.Expression
import org.omg.sysml.lang.sysml.FeatureReferenceExpression
import org.omg.sysml.lang.sysml.PathStepExpression
import org.omg.sysml.lang.sysml.InvocationExpression
import org.omg.sysml.util.ElementUtil
import org.omg.sysml.lang.sysml.Specialization
import org.omg.sysml.lang.sysml.FeatureChaining

class KerMLScopeProvider extends AbstractKerMLScopeProvider {

	@Inject
	IGlobalScopeProvider globalScope

	// Used to record visited Memberships and Imports.
	Set<Element> visited = newHashSet
	
	def getVisited() {
		visited
	}
	
	def setVisited(Set<Element> visited) {
		this.visited = visited
	}
	
	def addVisited(Element element) {
		visited.add(element)
	}
	
	def removeVisited(Element element) {
		visited.remove(element)
	}
	
	override getScope(EObject context, EReference reference) {
		if (context instanceof Conjugation)
			(context.eContainer as Element).scope_owningNamespace(context, reference)
		else if (context instanceof Subsetting) {
			if (context.eContainer instanceof Membership) {
				return context.owningMembership.scope_owningNamespace(context, reference)
			}
		    var subsettingFeature = context.subsettingFeature
		    if (!(context instanceof Redefinition)) {
			    var owningType = subsettingFeature?.owningType
				if (owningType instanceof Connector) {
			    	if (owningType.connectorEnd.contains(subsettingFeature)) {
			    		return owningType.scope_owningNamespace(context, reference)
			    	}
			    }
		    }
			subsettingFeature.scope_owningNamespace(context, reference)
		} else if (context instanceof Specialization)
			(context.eContainer as Element).scope_owningNamespace(context, reference)
		else if (context instanceof FeatureChaining)
			context.scope_featureChaining(reference)
		else if (context instanceof Membership)
	    	context.scope_relativeNamespace(context.membershipOwningNamespace, context, reference)
		else if (context instanceof Import)
			if (reference === SysMLPackage.eINSTANCE.import_ImportOwningNamespace) scope_import(context)
			else context.scope_Namespace(context.importOwningNamespace, context, reference, true)
		else if (context instanceof Namespace) 
			context.scopeFor(reference, null, true, true, false, null)
		else if (context instanceof Element)
			context.scope_owningNamespace(context, reference)
		else
			super.getScope(context, reference)
	}
	
	def scope_import(Import imp) {
		val ns = imp.importedNamespace
		ns.scopeFor(SysMLPackage.eINSTANCE.import_ImportedNamespace, imp, ns == imp.importOwningNamespace, false, false, null)
	}
	
	def scope_featureChaining(FeatureChaining ch, EReference reference) {
		val featureChained = ch.featureChained
		val ownedFeatureChainings = featureChained.ownedFeatureChaining
		val i = ownedFeatureChainings.indexOf(ch)
		if (i <= 0) 
			featureChained.scope_nonExpressionNamespace(ch, reference)
		else
			ch.scope_Namespace(ownedFeatureChainings.get(i-1).chainingFeature, ch, reference, false)
	}
	
	def static Namespace getParentNamespace(Element element) {
		EcoreUtil2.getContainerOfType(element.eContainer, Namespace)
	}
	
	def static Namespace getNonExpressionNamespace(Element element) {
		var namespace = getParentNamespace(element)
		while (namespace instanceof InvocationExpression || 
			   namespace instanceof FeatureReferenceExpression
		) {
			namespace = getParentNamespace(namespace)
		}
		namespace
	}
	
	def scope_owningNamespace(Element element, EObject context, EReference reference) {
		element.scope_Namespace(element?.parentNamespace, context, reference, true)
	}

	def scope_nonExpressionNamespace(Element element, EObject context, EReference reference) {
		element.scope_Namespace(element?.nonExpressionNamespace, context, reference, true)
	}
	
	def scope_Namespace(Element element, Namespace namespace, EObject context, EReference reference, boolean isInsideScope) {
		if (namespace === null)
			super.getScope(element, reference)		
		else 
			namespace.scopeFor(reference, element, isInsideScope, true,
				reference == SysMLPackage.eINSTANCE.redefinition_RedefinedFeature, 
				if (context instanceof Element) context else null)
	}
	
	def scope_relativeNamespace(Element element, Namespace ns, EObject context, EReference reference) {
		val rel = ns.relativeNamespace
		if (rel === null) {
			element.scope_nonExpressionNamespace(context, reference)
		} else {
			element.scope_Namespace(rel, context, reference, false)
		}
	}

	def static Namespace featureRefNamespace(PathStepExpression qps) {
		var ops = qps.operand
		if (ops.size() >= 2) {
			var op2 = ops.get(1)
			if (op2 instanceof FeatureReferenceExpression) {
				return op2.referent
			}
		}
		return null;
	}

	def static Namespace relativeNamespace(Namespace ns) {
		var Namespace rel = null;
		if (ns instanceof FeatureReferenceExpression) {
			val oe = ns.owner
			if (oe instanceof PathStepExpression) {
				var ops = oe.operand
				if (ops.size() >= 2) {
					var op1 = ops.get(0);
					if (op1 !== ns) {
						if (op1 instanceof PathStepExpression) {
							rel = op1.featureRefNamespace
						} else if (op1 instanceof Expression) {
							ElementUtil.transform(op1)
							rel = op1.result
						}
					}
				}
			}
		}
		return rel;
	}

	def IScope scopeFor(Namespace pack, EReference reference, Element element, boolean isInsideScope, boolean isFirstScope, boolean isRedefinition, Element skip) {
		var outerscope = IScope.NULLSCOPE;
		if (isInsideScope) {
			val parent = pack.parentNamespace
			outerscope = 
				if (parent === null) // Root Package
					globalScope.getScope(pack.eResource, reference, Predicates.alwaysTrue)
				else
					parent.scopeFor(reference, element, true, false, false, skip)
		}	

		new KerMLScope(outerscope, pack, reference.EReferenceType, this, isInsideScope, isFirstScope, isRedefinition, element, skip)
	}
	
}
