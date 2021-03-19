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

package org.omg.sysml.adapter;

import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.CalculationUsage;

public class CalculationUsageAdapter extends ActionUsageAdapter {

	public static final String CALCULATION_SUBSETTING_BASE_DEFAULT = "Calculations::calculations";
	public static final String CALCULATION_SUBSETTING_SUBCALCULATION_DEFAULT = "Calculations::Calculation::subcalculations";

	protected BindingConnector resultConnector = null;

	public CalculationUsageAdapter(CalculationUsage element) {
		super(element);
	}
	
	public CalculationUsage getTarget() {
		return (CalculationUsage)super.getTarget();
	}
	
	@Override
	protected String getDefaultSupertype() {
		return isSubperformance()? 
					CALCULATION_SUBSETTING_SUBCALCULATION_DEFAULT:
					CALCULATION_SUBSETTING_BASE_DEFAULT;
	}
	
	@Override
	public void doTransform() {
		super.doTransform();
		addResultParameter();
		createResultConnector(getTarget().getResult());
	}
}
