/*
 * generated by Xtext 2.18.0.M3
 */
package org.omg.sysml.xtext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SysMLAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/omg/sysml/xtext/parser/antlr/internal/InternalSysML.tokens");
	}
}