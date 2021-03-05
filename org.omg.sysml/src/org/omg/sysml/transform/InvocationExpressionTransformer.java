/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021 Model Driven Solutions, Inc.
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

package org.omg.sysml.transform;

import java.util.List;

import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.Type;

public class InvocationExpressionTransformer extends ExpressionTransformer {

	public InvocationExpressionTransformer(InvocationExpression element) {
		super(element);
	}
	
	@Override
	public InvocationExpression getElement() {
		return (InvocationExpression)super.getElement();
	}

	@Override
	protected void computeInput() {
		InvocationExpression expression = getElement();
		if (expression.getInput().isEmpty()) {
			Type type = TransformerUtil.getExpressionTypeOf(expression);
			if (type instanceof Function || type instanceof Expression) {
				super.computeInput();
			} else if (type != null) {
				for (Feature typeFeature: TransformerUtil.getTypeFeaturesOf(expression)) {
					createFeatureForParameter(typeFeature);
				}
			}
		}
	}
	
	public static Expression getArgumentForInput(List<Expression> arguments, Feature input, int argIndex) {
		TransformerUtil.forceComputeRedefinitionsFor(input);
		List<Feature> redefinedFeatures = TransformerUtil.getRedefinedFeaturesOf(input);
		if (!redefinedFeatures.isEmpty()) {
			Feature feature = redefinedFeatures.get(0);
			if (feature != null) {
				return TransformerUtil.getArgumentForFeature(arguments, feature, argIndex);
			}
		}
		return null;
	}
	
	public void computeArgumentConnectors() {
		InvocationExpression expression = getElement();
		List<Expression> arguments = expression.getArgument();
		BindingConnector[] argumentConnectors = new BindingConnector[arguments.size()];
		int i = 0;
		for (Feature input: expression.getInput()) {
			if (i >= argumentConnectors.length) {
				break;
			}
			Expression argument = getArgumentForInput(arguments, input, i);
			if (argument != null) {
				argumentConnectors[i] = TransformerUtil.addResultBindingTo(expression, argument, input);
				i++;
			}
		}
	}
	
	@Override
	public void transform() {
		super.transform();
		computeArgumentConnectors();
	}
	
}