/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018 Model Driven Solutions, Inc.
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
 *  Ed Seidewitz
 * 
 *****************************************************************************/

package org.omg.sysml.owl.qvt;

import java.nio.file.Paths;

import org.omg.sysml.AlfStandaloneSetup;
import org.omg.sysml.behaviors.BehaviorsPackage;
import org.omg.sysml.classification.ClassificationPackage;
import org.omg.sysml.core.CorePackage;
import org.omg.sysml.groups.GroupsPackage;
import org.omg.sysml.owl.OwlStandaloneSetup;
import org.omg.sysml.owl.owl.OwlPackage;
import org.omg.sysml.qvt.QVTRunner;

public class Alf2OWL extends QVTRunner {

	@SuppressWarnings("unused")
	protected void initialize() {
		super.initialize();
		
	    CorePackage core = CorePackage.eINSTANCE;
	    GroupsPackage group = GroupsPackage.eINSTANCE;
	    ClassificationPackage classification = ClassificationPackage.eINSTANCE;
	    BehaviorsPackage behavior = BehaviorsPackage.eINSTANCE;
	    
	    AlfStandaloneSetup.doSetup();
	    
	    OwlPackage owl = OwlPackage.eINSTANCE;
	    OwlStandaloneSetup.doSetup();
	}
	
	@Override
	protected String constructOutputPath(final String... resourcePaths) {
		int n = resourcePaths.length;
		
		// Second to last resource path is presumed to be the input file path.
		String fileName = Paths.get(resourcePaths[n - 2]).getFileName().toString();
		int i = fileName.indexOf('.');
		if (i >= 0) {
			fileName = fileName.substring(0, i);
		}
		
		// Last resource path is presumed to be the output directory path,
		// to which the input file name is appended.
		return resourcePaths[n - 1] + "/" + fileName + ".owl";
	}
	
	public static void main(String[] args) {
		new Alf2OWL().run(args, 3, "Alf2OWL [-l logPath] qvtPath inputPaths outputPath");
	}

}