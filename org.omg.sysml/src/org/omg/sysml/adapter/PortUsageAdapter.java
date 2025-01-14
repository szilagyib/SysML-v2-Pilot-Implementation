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

import org.omg.sysml.lang.sysml.PartDefinition;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.PortDefinition;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.Type;

public class PortUsageAdapter extends UsageAdapter {

	public PortUsageAdapter(PortUsage element) {
		super(element);
	}
	
	public PortUsage getTarget() {
		return (PortUsage)super.getTarget();
	}

	@Override
	protected String getDefaultSupertype() {
		return isPortOnPart()?
					getDefaultSupertype("portOnPart"):
			   isSubport()?
					getDefaultSupertype("subport"):
					getDefaultSupertype("base");
	}
	
	public boolean isPortOnPart() {
		Type owningType = getTarget().getOwningType();
		return owningType instanceof PartDefinition || owningType instanceof PartUsage;		
	}
	
	public boolean isSubport() {
		Type owningType = getTarget().getOwningType();
		return owningType instanceof PortDefinition || owningType instanceof PortUsage;
	}
	
	@Override
	public void doTransform() {
		super.doTransform();
		addDefaultMultiplicity();
	}
	
}
