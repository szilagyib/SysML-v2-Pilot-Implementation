/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2021 Model Driven Solutions, Inc.
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
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/
/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Viewpoint Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A ViewpointDefinition is a RequirementDefinition that specifies one or more stakeholder concerns that to be satisfied by created a view of a model.</p>
 * 
 * <p>A ViewpointDefinition must subclass, directly or indirectly, the base ViewpointDefinition Viewpoint from the Systems model library.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ViewpointDefinition#getViewpointStakeholder <em>Viewpoint Stakeholder</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewpointDefinition()
 * @model
 * @generated
 */
public interface ViewpointDefinition extends RequirementDefinition {

	/**
	 * Returns the value of the '<em><b>Viewpoint Stakeholder</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.PartUsage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The features that identify the stakeholders with concerns framed by this ViewpointDefinition, derived as the owned and inherited <code>stakeholderParameters</code> of the <code>framedConcerns</code> of this ViewpointDefinition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Viewpoint Stakeholder</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewpointDefinition_ViewpointStakeholder()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='viewpointDefinitionForStakeholder'"
	 * @generated
	 */
	EList<PartUsage> getViewpointStakeholder();
} // ViewpointDefinition
