/*
* generated by Xtext
*/
package org.kermeta.language.sample.cellularautomata.rules.cs.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class RuleAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.tokens");
	}
}