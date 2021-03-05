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

import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class FeatureReferenceExpressionTransformer extends ExpressionTransformer {

	public FeatureReferenceExpressionTransformer(FeatureReferenceExpression element) {
		super(element);
	}
	
	@Override
	public FeatureReferenceExpression getElement() {
		return (FeatureReferenceExpression)super.getElement();
	}
	
	protected void addReferenceConnector() {
		FeatureReferenceExpression expression = getElement();
		TransformerUtil.addBindingConnectorTo(expression, expression.getReferent(), expression.getResult());
	}

	protected void addResultSubsetting() {
		FeatureReferenceExpression expression = getElement();
		Feature result = expression.getResult();
		if (TransformerUtil.hasReferentFeature(expression)) {
			TransformerUtil.addGeneralTypeTo(result,
					SysMLPackage.eINSTANCE.getSubsetting(), expression.getReferent());
		}
	}
	
	@Override
	public void transform() {
		super.transform();
		addReferenceConnector();
		// Add subsetting in order to inherit typing of referent.
		addResultSubsetting();
	}
	
}