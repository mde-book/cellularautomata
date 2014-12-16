/*
* generated by Xtext
*/
package org.kermeta.language.sample.cellularautomata.rules.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.kermeta.language.sample.cellularautomata.rules.services.InitGrammarAccess;

public class InitParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private InitGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.kermeta.language.sample.cellularautomata.rules.parser.antlr.internal.InternalInitParser createParser(XtextTokenStream stream) {
		return new org.kermeta.language.sample.cellularautomata.rules.parser.antlr.internal.InternalInitParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "CellularAutomataInitialization";
	}
	
	public InitGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(InitGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
