package org.kermeta.language.sample.cellularautomata.rules.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.kermeta.language.sample.cellularautomata.rules.services.InitGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalInitParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Neumann'", "'Moore'", "'init'", "'by'", "'{'", "'}'", "','", "'('", "')'", "'..'", "'positionOn'", "'['", "']'", "'regularGeometry'", "'x'", "'if'", "'else'", "'|'", "'&'", "'=='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'circular'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=4;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalInitParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalInitParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalInitParser.tokenNames; }
    public String getGrammarFileName() { return "../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g"; }


     
     	private InitGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(InitGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleCellularAutomataInitialization"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:60:1: entryRuleCellularAutomataInitialization : ruleCellularAutomataInitialization EOF ;
    public final void entryRuleCellularAutomataInitialization() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:61:1: ( ruleCellularAutomataInitialization EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:62:1: ruleCellularAutomataInitialization EOF
            {
             before(grammarAccess.getCellularAutomataInitializationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCellularAutomataInitialization_in_entryRuleCellularAutomataInitialization61);
            ruleCellularAutomataInitialization();

            state._fsp--;

             after(grammarAccess.getCellularAutomataInitializationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCellularAutomataInitialization68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCellularAutomataInitialization"


    // $ANTLR start "ruleCellularAutomataInitialization"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:69:1: ruleCellularAutomataInitialization : ( ( rule__CellularAutomataInitialization__Group__0 ) ) ;
    public final void ruleCellularAutomataInitialization() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:73:2: ( ( ( rule__CellularAutomataInitialization__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:74:1: ( ( rule__CellularAutomataInitialization__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:74:1: ( ( rule__CellularAutomataInitialization__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:75:1: ( rule__CellularAutomataInitialization__Group__0 )
            {
             before(grammarAccess.getCellularAutomataInitializationAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:76:1: ( rule__CellularAutomataInitialization__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:76:2: rule__CellularAutomataInitialization__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CellularAutomataInitialization__Group__0_in_ruleCellularAutomataInitialization94);
            rule__CellularAutomataInitialization__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCellularAutomataInitializationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCellularAutomataInitialization"


    // $ANTLR start "entryRuleRule"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:88:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:89:1: ( ruleRule EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:90:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_entryRuleRule121);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRule128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:97:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:101:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:102:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:102:1: ( ( rule__Rule__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:103:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:104:1: ( rule__Rule__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:104:2: rule__Rule__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__0_in_ruleRule154);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleCoordinateRanges"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:116:1: entryRuleCoordinateRanges : ruleCoordinateRanges EOF ;
    public final void entryRuleCoordinateRanges() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:117:1: ( ruleCoordinateRanges EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:118:1: ruleCoordinateRanges EOF
            {
             before(grammarAccess.getCoordinateRangesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCoordinateRanges_in_entryRuleCoordinateRanges181);
            ruleCoordinateRanges();

            state._fsp--;

             after(grammarAccess.getCoordinateRangesRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCoordinateRanges188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCoordinateRanges"


    // $ANTLR start "ruleCoordinateRanges"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:125:1: ruleCoordinateRanges : ( ( rule__CoordinateRanges__Group__0 ) ) ;
    public final void ruleCoordinateRanges() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:129:2: ( ( ( rule__CoordinateRanges__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:130:1: ( ( rule__CoordinateRanges__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:130:1: ( ( rule__CoordinateRanges__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:131:1: ( rule__CoordinateRanges__Group__0 )
            {
             before(grammarAccess.getCoordinateRangesAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:132:1: ( rule__CoordinateRanges__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:132:2: rule__CoordinateRanges__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRanges__Group__0_in_ruleCoordinateRanges214);
            rule__CoordinateRanges__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCoordinateRangesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoordinateRanges"


    // $ANTLR start "entryRuleCoordinateRange"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:144:1: entryRuleCoordinateRange : ruleCoordinateRange EOF ;
    public final void entryRuleCoordinateRange() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:145:1: ( ruleCoordinateRange EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:146:1: ruleCoordinateRange EOF
            {
             before(grammarAccess.getCoordinateRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCoordinateRange_in_entryRuleCoordinateRange241);
            ruleCoordinateRange();

            state._fsp--;

             after(grammarAccess.getCoordinateRangeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCoordinateRange248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCoordinateRange"


    // $ANTLR start "ruleCoordinateRange"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:153:1: ruleCoordinateRange : ( ( rule__CoordinateRange__Group__0 ) ) ;
    public final void ruleCoordinateRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:157:2: ( ( ( rule__CoordinateRange__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:158:1: ( ( rule__CoordinateRange__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:158:1: ( ( rule__CoordinateRange__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:159:1: ( rule__CoordinateRange__Group__0 )
            {
             before(grammarAccess.getCoordinateRangeAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:160:1: ( rule__CoordinateRange__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:160:2: rule__CoordinateRange__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRange__Group__0_in_ruleCoordinateRange274);
            rule__CoordinateRange__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCoordinateRangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoordinateRange"


    // $ANTLR start "entryRuleDimensionRange"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:172:1: entryRuleDimensionRange : ruleDimensionRange EOF ;
    public final void entryRuleDimensionRange() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:173:1: ( ruleDimensionRange EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:174:1: ruleDimensionRange EOF
            {
             before(grammarAccess.getDimensionRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDimensionRange_in_entryRuleDimensionRange301);
            ruleDimensionRange();

            state._fsp--;

             after(grammarAccess.getDimensionRangeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDimensionRange308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDimensionRange"


    // $ANTLR start "ruleDimensionRange"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:181:1: ruleDimensionRange : ( ( rule__DimensionRange__Group__0 ) ) ;
    public final void ruleDimensionRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:185:2: ( ( ( rule__DimensionRange__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:186:1: ( ( rule__DimensionRange__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:186:1: ( ( rule__DimensionRange__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:187:1: ( rule__DimensionRange__Group__0 )
            {
             before(grammarAccess.getDimensionRangeAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:188:1: ( rule__DimensionRange__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:188:2: rule__DimensionRange__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DimensionRange__Group__0_in_ruleDimensionRange334);
            rule__DimensionRange__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDimensionRangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDimensionRange"


    // $ANTLR start "entryRuleLiteralsExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:200:1: entryRuleLiteralsExpression : ruleLiteralsExpression EOF ;
    public final void entryRuleLiteralsExpression() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:201:1: ( ruleLiteralsExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:202:1: ruleLiteralsExpression EOF
            {
             before(grammarAccess.getLiteralsExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_entryRuleLiteralsExpression361);
            ruleLiteralsExpression();

            state._fsp--;

             after(grammarAccess.getLiteralsExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralsExpression368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteralsExpression"


    // $ANTLR start "ruleLiteralsExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:209:1: ruleLiteralsExpression : ( ( rule__LiteralsExpression__Alternatives ) ) ;
    public final void ruleLiteralsExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:213:2: ( ( ( rule__LiteralsExpression__Alternatives ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:214:1: ( ( rule__LiteralsExpression__Alternatives ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:214:1: ( ( rule__LiteralsExpression__Alternatives ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:215:1: ( rule__LiteralsExpression__Alternatives )
            {
             before(grammarAccess.getLiteralsExpressionAccess().getAlternatives()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:216:1: ( rule__LiteralsExpression__Alternatives )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:216:2: rule__LiteralsExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Alternatives_in_ruleLiteralsExpression394);
            rule__LiteralsExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralsExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralsExpression"


    // $ANTLR start "entryRulePositionLiteral"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:228:1: entryRulePositionLiteral : rulePositionLiteral EOF ;
    public final void entryRulePositionLiteral() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:229:1: ( rulePositionLiteral EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:230:1: rulePositionLiteral EOF
            {
             before(grammarAccess.getPositionLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePositionLiteral_in_entryRulePositionLiteral421);
            rulePositionLiteral();

            state._fsp--;

             after(grammarAccess.getPositionLiteralRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePositionLiteral428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePositionLiteral"


    // $ANTLR start "rulePositionLiteral"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:237:1: rulePositionLiteral : ( ( rule__PositionLiteral__Group__0 ) ) ;
    public final void rulePositionLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:241:2: ( ( ( rule__PositionLiteral__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:242:1: ( ( rule__PositionLiteral__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:242:1: ( ( rule__PositionLiteral__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:243:1: ( rule__PositionLiteral__Group__0 )
            {
             before(grammarAccess.getPositionLiteralAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:244:1: ( rule__PositionLiteral__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:244:2: rule__PositionLiteral__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PositionLiteral__Group__0_in_rulePositionLiteral454);
            rule__PositionLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPositionLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePositionLiteral"


    // $ANTLR start "entryRuleRegularGeometry"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:256:1: entryRuleRegularGeometry : ruleRegularGeometry EOF ;
    public final void entryRuleRegularGeometry() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:257:1: ( ruleRegularGeometry EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:258:1: ruleRegularGeometry EOF
            {
             before(grammarAccess.getRegularGeometryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRegularGeometry_in_entryRuleRegularGeometry481);
            ruleRegularGeometry();

            state._fsp--;

             after(grammarAccess.getRegularGeometryRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRegularGeometry488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRegularGeometry"


    // $ANTLR start "ruleRegularGeometry"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:265:1: ruleRegularGeometry : ( ( rule__RegularGeometry__Group__0 ) ) ;
    public final void ruleRegularGeometry() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:269:2: ( ( ( rule__RegularGeometry__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:270:1: ( ( rule__RegularGeometry__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:270:1: ( ( rule__RegularGeometry__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:271:1: ( rule__RegularGeometry__Group__0 )
            {
             before(grammarAccess.getRegularGeometryAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:272:1: ( rule__RegularGeometry__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:272:2: rule__RegularGeometry__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group__0_in_ruleRegularGeometry514);
            rule__RegularGeometry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegularGeometryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegularGeometry"


    // $ANTLR start "entryRuleDimension"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:284:1: entryRuleDimension : ruleDimension EOF ;
    public final void entryRuleDimension() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:285:1: ( ruleDimension EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:286:1: ruleDimension EOF
            {
             before(grammarAccess.getDimensionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDimension_in_entryRuleDimension541);
            ruleDimension();

            state._fsp--;

             after(grammarAccess.getDimensionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDimension548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDimension"


    // $ANTLR start "ruleDimension"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:293:1: ruleDimension : ( ( rule__Dimension__Group__0 ) ) ;
    public final void ruleDimension() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:297:2: ( ( ( rule__Dimension__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:298:1: ( ( rule__Dimension__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:298:1: ( ( rule__Dimension__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:299:1: ( rule__Dimension__Group__0 )
            {
             before(grammarAccess.getDimensionAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:300:1: ( rule__Dimension__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:300:2: rule__Dimension__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dimension__Group__0_in_ruleDimension574);
            rule__Dimension__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDimensionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDimension"


    // $ANTLR start "entryRuleConditional"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:312:1: entryRuleConditional : ruleConditional EOF ;
    public final void entryRuleConditional() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:313:1: ( ruleConditional EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:314:1: ruleConditional EOF
            {
             before(grammarAccess.getConditionalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_entryRuleConditional601);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getConditionalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConditional608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:321:1: ruleConditional : ( ( rule__Conditional__Alternatives ) ) ;
    public final void ruleConditional() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:325:2: ( ( ( rule__Conditional__Alternatives ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:326:1: ( ( rule__Conditional__Alternatives ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:326:1: ( ( rule__Conditional__Alternatives ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:327:1: ( rule__Conditional__Alternatives )
            {
             before(grammarAccess.getConditionalAccess().getAlternatives()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:328:1: ( rule__Conditional__Alternatives )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:328:2: rule__Conditional__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Alternatives_in_ruleConditional634);
            rule__Conditional__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleOrExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:340:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:341:1: ( ruleOrExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:342:1: ruleOrExpression EOF
            {
             before(grammarAccess.getOrExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_entryRuleOrExpression661);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrExpression668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:349:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:353:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:354:1: ( ( rule__OrExpression__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:354:1: ( ( rule__OrExpression__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:355:1: ( rule__OrExpression__Group__0 )
            {
             before(grammarAccess.getOrExpressionAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:356:1: ( rule__OrExpression__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:356:2: rule__OrExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression694);
            rule__OrExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:368:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:369:1: ( ruleAndExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:370:1: ruleAndExpression EOF
            {
             before(grammarAccess.getAndExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_entryRuleAndExpression721);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndExpression728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:377:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:381:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:382:1: ( ( rule__AndExpression__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:382:1: ( ( rule__AndExpression__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:383:1: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:384:1: ( rule__AndExpression__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:384:2: rule__AndExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression754);
            rule__AndExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqualExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:396:1: entryRuleEqualExpression : ruleEqualExpression EOF ;
    public final void entryRuleEqualExpression() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:397:1: ( ruleEqualExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:398:1: ruleEqualExpression EOF
            {
             before(grammarAccess.getEqualExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_entryRuleEqualExpression781);
            ruleEqualExpression();

            state._fsp--;

             after(grammarAccess.getEqualExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEqualExpression788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEqualExpression"


    // $ANTLR start "ruleEqualExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:405:1: ruleEqualExpression : ( ( rule__EqualExpression__Group__0 ) ) ;
    public final void ruleEqualExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:409:2: ( ( ( rule__EqualExpression__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:410:1: ( ( rule__EqualExpression__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:410:1: ( ( rule__EqualExpression__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:411:1: ( rule__EqualExpression__Group__0 )
            {
             before(grammarAccess.getEqualExpressionAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:412:1: ( rule__EqualExpression__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:412:2: rule__EqualExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group__0_in_ruleEqualExpression814);
            rule__EqualExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEqualExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:424:1: entryRuleComparisonExpression : ruleComparisonExpression EOF ;
    public final void entryRuleComparisonExpression() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:425:1: ( ruleComparisonExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:426:1: ruleComparisonExpression EOF
            {
             before(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression841);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparisonExpression848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:433:1: ruleComparisonExpression : ( ( rule__ComparisonExpression__Group__0 ) ) ;
    public final void ruleComparisonExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:437:2: ( ( ( rule__ComparisonExpression__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:438:1: ( ( rule__ComparisonExpression__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:438:1: ( ( rule__ComparisonExpression__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:439:1: ( rule__ComparisonExpression__Group__0 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:440:1: ( rule__ComparisonExpression__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:440:2: rule__ComparisonExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group__0_in_ruleComparisonExpression874);
            rule__ComparisonExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleAddExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:452:1: entryRuleAddExpression : ruleAddExpression EOF ;
    public final void entryRuleAddExpression() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:453:1: ( ruleAddExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:454:1: ruleAddExpression EOF
            {
             before(grammarAccess.getAddExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_entryRuleAddExpression901);
            ruleAddExpression();

            state._fsp--;

             after(grammarAccess.getAddExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddExpression908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddExpression"


    // $ANTLR start "ruleAddExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:461:1: ruleAddExpression : ( ( rule__AddExpression__Group__0 ) ) ;
    public final void ruleAddExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:465:2: ( ( ( rule__AddExpression__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:466:1: ( ( rule__AddExpression__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:466:1: ( ( rule__AddExpression__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:467:1: ( rule__AddExpression__Group__0 )
            {
             before(grammarAccess.getAddExpressionAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:468:1: ( rule__AddExpression__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:468:2: rule__AddExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__0_in_ruleAddExpression934);
            rule__AddExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleMultExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:480:1: entryRuleMultExpression : ruleMultExpression EOF ;
    public final void entryRuleMultExpression() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:481:1: ( ruleMultExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:482:1: ruleMultExpression EOF
            {
             before(grammarAccess.getMultExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_entryRuleMultExpression961);
            ruleMultExpression();

            state._fsp--;

             after(grammarAccess.getMultExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultExpression968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultExpression"


    // $ANTLR start "ruleMultExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:489:1: ruleMultExpression : ( ( rule__MultExpression__Group__0 ) ) ;
    public final void ruleMultExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:493:2: ( ( ( rule__MultExpression__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:494:1: ( ( rule__MultExpression__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:494:1: ( ( rule__MultExpression__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:495:1: ( rule__MultExpression__Group__0 )
            {
             before(grammarAccess.getMultExpressionAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:496:1: ( rule__MultExpression__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:496:2: rule__MultExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__0_in_ruleMultExpression994);
            rule__MultExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:508:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:509:1: ( ruleUnaryExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:510:1: ruleUnaryExpression EOF
            {
             before(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression1021);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryExpression1028); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:517:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Alternatives ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:521:2: ( ( ( rule__UnaryExpression__Alternatives ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:522:1: ( ( rule__UnaryExpression__Alternatives ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:522:1: ( ( rule__UnaryExpression__Alternatives ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:523:1: ( rule__UnaryExpression__Alternatives )
            {
             before(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:524:1: ( rule__UnaryExpression__Alternatives )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:524:2: rule__UnaryExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Alternatives_in_ruleUnaryExpression1054);
            rule__UnaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleIntegerLiteral"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:536:1: entryRuleIntegerLiteral : ruleIntegerLiteral EOF ;
    public final void entryRuleIntegerLiteral() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:537:1: ( ruleIntegerLiteral EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:538:1: ruleIntegerLiteral EOF
            {
             before(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral1081);
            ruleIntegerLiteral();

            state._fsp--;

             after(grammarAccess.getIntegerLiteralRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerLiteral1088); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:545:1: ruleIntegerLiteral : ( ( rule__IntegerLiteral__ValAssignment ) ) ;
    public final void ruleIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:549:2: ( ( ( rule__IntegerLiteral__ValAssignment ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:550:1: ( ( rule__IntegerLiteral__ValAssignment ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:550:1: ( ( rule__IntegerLiteral__ValAssignment ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:551:1: ( rule__IntegerLiteral__ValAssignment )
            {
             before(grammarAccess.getIntegerLiteralAccess().getValAssignment()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:552:1: ( rule__IntegerLiteral__ValAssignment )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:552:2: rule__IntegerLiteral__ValAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__IntegerLiteral__ValAssignment_in_ruleIntegerLiteral1114);
            rule__IntegerLiteral__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntegerLiteralAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleEInt"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:564:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:565:1: ( ruleEInt EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:566:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1141);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1148); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:573:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:577:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:578:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:578:1: ( ( rule__EInt__Group__0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:579:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:580:1: ( rule__EInt__Group__0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:580:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt1174);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleNeighborhood"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:593:1: ruleNeighborhood : ( ( rule__Neighborhood__Alternatives ) ) ;
    public final void ruleNeighborhood() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:597:1: ( ( ( rule__Neighborhood__Alternatives ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:598:1: ( ( rule__Neighborhood__Alternatives ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:598:1: ( ( rule__Neighborhood__Alternatives ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:599:1: ( rule__Neighborhood__Alternatives )
            {
             before(grammarAccess.getNeighborhoodAccess().getAlternatives()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:600:1: ( rule__Neighborhood__Alternatives )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:600:2: rule__Neighborhood__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Neighborhood__Alternatives_in_ruleNeighborhood1211);
            rule__Neighborhood__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNeighborhoodAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNeighborhood"


    // $ANTLR start "rule__LiteralsExpression__Alternatives"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:611:1: rule__LiteralsExpression__Alternatives : ( ( ( rule__LiteralsExpression__Group_0__0 ) ) | ( rulePositionLiteral ) | ( ruleIntegerLiteral ) );
    public final void rule__LiteralsExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:615:1: ( ( ( rule__LiteralsExpression__Group_0__0 ) ) | ( rulePositionLiteral ) | ( ruleIntegerLiteral ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt1=1;
                }
                break;
            case 21:
                {
                alt1=2;
                }
                break;
            case RULE_INT:
            case 34:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:616:1: ( ( rule__LiteralsExpression__Group_0__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:616:1: ( ( rule__LiteralsExpression__Group_0__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:617:1: ( rule__LiteralsExpression__Group_0__0 )
                    {
                     before(grammarAccess.getLiteralsExpressionAccess().getGroup_0()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:618:1: ( rule__LiteralsExpression__Group_0__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:618:2: rule__LiteralsExpression__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Group_0__0_in_rule__LiteralsExpression__Alternatives1246);
                    rule__LiteralsExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralsExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:622:6: ( rulePositionLiteral )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:622:6: ( rulePositionLiteral )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:623:1: rulePositionLiteral
                    {
                     before(grammarAccess.getLiteralsExpressionAccess().getPositionLiteralParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_rulePositionLiteral_in_rule__LiteralsExpression__Alternatives1264);
                    rulePositionLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralsExpressionAccess().getPositionLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:628:6: ( ruleIntegerLiteral )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:628:6: ( ruleIntegerLiteral )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:629:1: ruleIntegerLiteral
                    {
                     before(grammarAccess.getLiteralsExpressionAccess().getIntegerLiteralParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerLiteral_in_rule__LiteralsExpression__Alternatives1281);
                    ruleIntegerLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralsExpressionAccess().getIntegerLiteralParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralsExpression__Alternatives"


    // $ANTLR start "rule__Conditional__Alternatives"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:639:1: rule__Conditional__Alternatives : ( ( ruleOrExpression ) | ( ( rule__Conditional__Group_1__0 ) ) );
    public final void rule__Conditional__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:643:1: ( ( ruleOrExpression ) | ( ( rule__Conditional__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT||LA2_0==18||LA2_0==21||LA2_0==34||LA2_0==38) ) {
                alt2=1;
            }
            else if ( (LA2_0==26) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:644:1: ( ruleOrExpression )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:644:1: ( ruleOrExpression )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:645:1: ruleOrExpression
                    {
                     before(grammarAccess.getConditionalAccess().getOrExpressionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_rule__Conditional__Alternatives1313);
                    ruleOrExpression();

                    state._fsp--;

                     after(grammarAccess.getConditionalAccess().getOrExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:650:6: ( ( rule__Conditional__Group_1__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:650:6: ( ( rule__Conditional__Group_1__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:651:1: ( rule__Conditional__Group_1__0 )
                    {
                     before(grammarAccess.getConditionalAccess().getGroup_1()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:652:1: ( rule__Conditional__Group_1__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:652:2: rule__Conditional__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__0_in_rule__Conditional__Alternatives1330);
                    rule__Conditional__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionalAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Alternatives"


    // $ANTLR start "rule__ComparisonExpression__Alternatives_1_0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:661:1: rule__ComparisonExpression__Alternatives_1_0 : ( ( ( rule__ComparisonExpression__Group_1_0_0__0 ) ) | ( ( rule__ComparisonExpression__Group_1_0_1__0 ) ) );
    public final void rule__ComparisonExpression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:665:1: ( ( ( rule__ComparisonExpression__Group_1_0_0__0 ) ) | ( ( rule__ComparisonExpression__Group_1_0_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==31) ) {
                alt3=1;
            }
            else if ( (LA3_0==32) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:666:1: ( ( rule__ComparisonExpression__Group_1_0_0__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:666:1: ( ( rule__ComparisonExpression__Group_1_0_0__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:667:1: ( rule__ComparisonExpression__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getComparisonExpressionAccess().getGroup_1_0_0()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:668:1: ( rule__ComparisonExpression__Group_1_0_0__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:668:2: rule__ComparisonExpression__Group_1_0_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_0__0_in_rule__ComparisonExpression__Alternatives_1_01363);
                    rule__ComparisonExpression__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonExpressionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:672:6: ( ( rule__ComparisonExpression__Group_1_0_1__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:672:6: ( ( rule__ComparisonExpression__Group_1_0_1__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:673:1: ( rule__ComparisonExpression__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getComparisonExpressionAccess().getGroup_1_0_1()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:674:1: ( rule__ComparisonExpression__Group_1_0_1__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:674:2: rule__ComparisonExpression__Group_1_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_1__0_in_rule__ComparisonExpression__Alternatives_1_01381);
                    rule__ComparisonExpression__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonExpressionAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Alternatives_1_0"


    // $ANTLR start "rule__AddExpression__Alternatives_1_0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:683:1: rule__AddExpression__Alternatives_1_0 : ( ( ( rule__AddExpression__Group_1_0_0__0 ) ) | ( ( rule__AddExpression__Group_1_0_1__0 ) ) );
    public final void rule__AddExpression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:687:1: ( ( ( rule__AddExpression__Group_1_0_0__0 ) ) | ( ( rule__AddExpression__Group_1_0_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==33) ) {
                alt4=1;
            }
            else if ( (LA4_0==34) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:688:1: ( ( rule__AddExpression__Group_1_0_0__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:688:1: ( ( rule__AddExpression__Group_1_0_0__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:689:1: ( rule__AddExpression__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getAddExpressionAccess().getGroup_1_0_0()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:690:1: ( rule__AddExpression__Group_1_0_0__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:690:2: rule__AddExpression__Group_1_0_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_0__0_in_rule__AddExpression__Alternatives_1_01414);
                    rule__AddExpression__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAddExpressionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:694:6: ( ( rule__AddExpression__Group_1_0_1__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:694:6: ( ( rule__AddExpression__Group_1_0_1__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:695:1: ( rule__AddExpression__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getAddExpressionAccess().getGroup_1_0_1()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:696:1: ( rule__AddExpression__Group_1_0_1__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:696:2: rule__AddExpression__Group_1_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_1__0_in_rule__AddExpression__Alternatives_1_01432);
                    rule__AddExpression__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAddExpressionAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Alternatives_1_0"


    // $ANTLR start "rule__MultExpression__Alternatives_1_0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:705:1: rule__MultExpression__Alternatives_1_0 : ( ( ( rule__MultExpression__Group_1_0_0__0 ) ) | ( ( rule__MultExpression__Group_1_0_1__0 ) ) | ( ( rule__MultExpression__Group_1_0_2__0 ) ) );
    public final void rule__MultExpression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:709:1: ( ( ( rule__MultExpression__Group_1_0_0__0 ) ) | ( ( rule__MultExpression__Group_1_0_1__0 ) ) | ( ( rule__MultExpression__Group_1_0_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt5=1;
                }
                break;
            case 36:
                {
                alt5=2;
                }
                break;
            case 37:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:710:1: ( ( rule__MultExpression__Group_1_0_0__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:710:1: ( ( rule__MultExpression__Group_1_0_0__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:711:1: ( rule__MultExpression__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMultExpressionAccess().getGroup_1_0_0()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:712:1: ( rule__MultExpression__Group_1_0_0__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:712:2: rule__MultExpression__Group_1_0_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_0__0_in_rule__MultExpression__Alternatives_1_01465);
                    rule__MultExpression__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultExpressionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:716:6: ( ( rule__MultExpression__Group_1_0_1__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:716:6: ( ( rule__MultExpression__Group_1_0_1__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:717:1: ( rule__MultExpression__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMultExpressionAccess().getGroup_1_0_1()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:718:1: ( rule__MultExpression__Group_1_0_1__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:718:2: rule__MultExpression__Group_1_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_1__0_in_rule__MultExpression__Alternatives_1_01483);
                    rule__MultExpression__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultExpressionAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:722:6: ( ( rule__MultExpression__Group_1_0_2__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:722:6: ( ( rule__MultExpression__Group_1_0_2__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:723:1: ( rule__MultExpression__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getMultExpressionAccess().getGroup_1_0_2()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:724:1: ( rule__MultExpression__Group_1_0_2__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:724:2: rule__MultExpression__Group_1_0_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_2__0_in_rule__MultExpression__Alternatives_1_01501);
                    rule__MultExpression__Group_1_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultExpressionAccess().getGroup_1_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Alternatives_1_0"


    // $ANTLR start "rule__UnaryExpression__Alternatives"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:733:1: rule__UnaryExpression__Alternatives : ( ( ruleLiteralsExpression ) | ( ( rule__UnaryExpression__Group_1__0 ) ) | ( ( rule__UnaryExpression__Group_2__0 ) ) );
    public final void rule__UnaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:737:1: ( ( ruleLiteralsExpression ) | ( ( rule__UnaryExpression__Group_1__0 ) ) | ( ( rule__UnaryExpression__Group_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 18:
            case 21:
                {
                alt6=1;
                }
                break;
            case 34:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==RULE_INT) ) {
                    alt6=1;
                }
                else if ( (LA6_2==18||LA6_2==21||LA6_2==34) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                alt6=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:738:1: ( ruleLiteralsExpression )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:738:1: ( ruleLiteralsExpression )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:739:1: ruleLiteralsExpression
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getLiteralsExpressionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_rule__UnaryExpression__Alternatives1534);
                    ruleLiteralsExpression();

                    state._fsp--;

                     after(grammarAccess.getUnaryExpressionAccess().getLiteralsExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:744:6: ( ( rule__UnaryExpression__Group_1__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:744:6: ( ( rule__UnaryExpression__Group_1__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:745:1: ( rule__UnaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getGroup_1()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:746:1: ( rule__UnaryExpression__Group_1__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:746:2: rule__UnaryExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_1__0_in_rule__UnaryExpression__Alternatives1551);
                    rule__UnaryExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:750:6: ( ( rule__UnaryExpression__Group_2__0 ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:750:6: ( ( rule__UnaryExpression__Group_2__0 ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:751:1: ( rule__UnaryExpression__Group_2__0 )
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getGroup_2()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:752:1: ( rule__UnaryExpression__Group_2__0 )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:752:2: rule__UnaryExpression__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_2__0_in_rule__UnaryExpression__Alternatives1569);
                    rule__UnaryExpression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Alternatives"


    // $ANTLR start "rule__Neighborhood__Alternatives"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:761:1: rule__Neighborhood__Alternatives : ( ( ( 'Neumann' ) ) | ( ( 'Moore' ) ) );
    public final void rule__Neighborhood__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:765:1: ( ( ( 'Neumann' ) ) | ( ( 'Moore' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            else if ( (LA7_0==12) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:766:1: ( ( 'Neumann' ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:766:1: ( ( 'Neumann' ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:767:1: ( 'Neumann' )
                    {
                     before(grammarAccess.getNeighborhoodAccess().getNeumannEnumLiteralDeclaration_0()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:768:1: ( 'Neumann' )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:768:3: 'Neumann'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__Neighborhood__Alternatives1603); 

                    }

                     after(grammarAccess.getNeighborhoodAccess().getNeumannEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:773:6: ( ( 'Moore' ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:773:6: ( ( 'Moore' ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:774:1: ( 'Moore' )
                    {
                     before(grammarAccess.getNeighborhoodAccess().getMooreEnumLiteralDeclaration_1()); 
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:775:1: ( 'Moore' )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:775:3: 'Moore'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__Neighborhood__Alternatives1624); 

                    }

                     after(grammarAccess.getNeighborhoodAccess().getMooreEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Neighborhood__Alternatives"


    // $ANTLR start "rule__CellularAutomataInitialization__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:787:1: rule__CellularAutomataInitialization__Group__0 : rule__CellularAutomataInitialization__Group__0__Impl rule__CellularAutomataInitialization__Group__1 ;
    public final void rule__CellularAutomataInitialization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:791:1: ( rule__CellularAutomataInitialization__Group__0__Impl rule__CellularAutomataInitialization__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:792:2: rule__CellularAutomataInitialization__Group__0__Impl rule__CellularAutomataInitialization__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CellularAutomataInitialization__Group__0__Impl_in_rule__CellularAutomataInitialization__Group__01657);
            rule__CellularAutomataInitialization__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CellularAutomataInitialization__Group__1_in_rule__CellularAutomataInitialization__Group__01660);
            rule__CellularAutomataInitialization__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellularAutomataInitialization__Group__0"


    // $ANTLR start "rule__CellularAutomataInitialization__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:799:1: rule__CellularAutomataInitialization__Group__0__Impl : ( () ) ;
    public final void rule__CellularAutomataInitialization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:803:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:804:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:804:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:805:1: ()
            {
             before(grammarAccess.getCellularAutomataInitializationAccess().getCellularAutomataInitializationAction_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:806:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:808:1: 
            {
            }

             after(grammarAccess.getCellularAutomataInitializationAccess().getCellularAutomataInitializationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellularAutomataInitialization__Group__0__Impl"


    // $ANTLR start "rule__CellularAutomataInitialization__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:818:1: rule__CellularAutomataInitialization__Group__1 : rule__CellularAutomataInitialization__Group__1__Impl rule__CellularAutomataInitialization__Group__2 ;
    public final void rule__CellularAutomataInitialization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:822:1: ( rule__CellularAutomataInitialization__Group__1__Impl rule__CellularAutomataInitialization__Group__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:823:2: rule__CellularAutomataInitialization__Group__1__Impl rule__CellularAutomataInitialization__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CellularAutomataInitialization__Group__1__Impl_in_rule__CellularAutomataInitialization__Group__11718);
            rule__CellularAutomataInitialization__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CellularAutomataInitialization__Group__2_in_rule__CellularAutomataInitialization__Group__11721);
            rule__CellularAutomataInitialization__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellularAutomataInitialization__Group__1"


    // $ANTLR start "rule__CellularAutomataInitialization__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:830:1: rule__CellularAutomataInitialization__Group__1__Impl : ( ( rule__CellularAutomataInitialization__GeometryAssignment_1 )? ) ;
    public final void rule__CellularAutomataInitialization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:834:1: ( ( ( rule__CellularAutomataInitialization__GeometryAssignment_1 )? ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:835:1: ( ( rule__CellularAutomataInitialization__GeometryAssignment_1 )? )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:835:1: ( ( rule__CellularAutomataInitialization__GeometryAssignment_1 )? )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:836:1: ( rule__CellularAutomataInitialization__GeometryAssignment_1 )?
            {
             before(grammarAccess.getCellularAutomataInitializationAccess().getGeometryAssignment_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:837:1: ( rule__CellularAutomataInitialization__GeometryAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:837:2: rule__CellularAutomataInitialization__GeometryAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__CellularAutomataInitialization__GeometryAssignment_1_in_rule__CellularAutomataInitialization__Group__1__Impl1748);
                    rule__CellularAutomataInitialization__GeometryAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCellularAutomataInitializationAccess().getGeometryAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellularAutomataInitialization__Group__1__Impl"


    // $ANTLR start "rule__CellularAutomataInitialization__Group__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:847:1: rule__CellularAutomataInitialization__Group__2 : rule__CellularAutomataInitialization__Group__2__Impl rule__CellularAutomataInitialization__Group__3 ;
    public final void rule__CellularAutomataInitialization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:851:1: ( rule__CellularAutomataInitialization__Group__2__Impl rule__CellularAutomataInitialization__Group__3 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:852:2: rule__CellularAutomataInitialization__Group__2__Impl rule__CellularAutomataInitialization__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CellularAutomataInitialization__Group__2__Impl_in_rule__CellularAutomataInitialization__Group__21779);
            rule__CellularAutomataInitialization__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CellularAutomataInitialization__Group__3_in_rule__CellularAutomataInitialization__Group__21782);
            rule__CellularAutomataInitialization__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellularAutomataInitialization__Group__2"


    // $ANTLR start "rule__CellularAutomataInitialization__Group__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:859:1: rule__CellularAutomataInitialization__Group__2__Impl : ( ( rule__CellularAutomataInitialization__SeedRulesAssignment_2 ) ) ;
    public final void rule__CellularAutomataInitialization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:863:1: ( ( ( rule__CellularAutomataInitialization__SeedRulesAssignment_2 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:864:1: ( ( rule__CellularAutomataInitialization__SeedRulesAssignment_2 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:864:1: ( ( rule__CellularAutomataInitialization__SeedRulesAssignment_2 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:865:1: ( rule__CellularAutomataInitialization__SeedRulesAssignment_2 )
            {
             before(grammarAccess.getCellularAutomataInitializationAccess().getSeedRulesAssignment_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:866:1: ( rule__CellularAutomataInitialization__SeedRulesAssignment_2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:866:2: rule__CellularAutomataInitialization__SeedRulesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CellularAutomataInitialization__SeedRulesAssignment_2_in_rule__CellularAutomataInitialization__Group__2__Impl1809);
            rule__CellularAutomataInitialization__SeedRulesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCellularAutomataInitializationAccess().getSeedRulesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellularAutomataInitialization__Group__2__Impl"


    // $ANTLR start "rule__CellularAutomataInitialization__Group__3"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:876:1: rule__CellularAutomataInitialization__Group__3 : rule__CellularAutomataInitialization__Group__3__Impl ;
    public final void rule__CellularAutomataInitialization__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:880:1: ( rule__CellularAutomataInitialization__Group__3__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:881:2: rule__CellularAutomataInitialization__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CellularAutomataInitialization__Group__3__Impl_in_rule__CellularAutomataInitialization__Group__31839);
            rule__CellularAutomataInitialization__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellularAutomataInitialization__Group__3"


    // $ANTLR start "rule__CellularAutomataInitialization__Group__3__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:887:1: rule__CellularAutomataInitialization__Group__3__Impl : ( ( rule__CellularAutomataInitialization__SeedRulesAssignment_3 )* ) ;
    public final void rule__CellularAutomataInitialization__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:891:1: ( ( ( rule__CellularAutomataInitialization__SeedRulesAssignment_3 )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:892:1: ( ( rule__CellularAutomataInitialization__SeedRulesAssignment_3 )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:892:1: ( ( rule__CellularAutomataInitialization__SeedRulesAssignment_3 )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:893:1: ( rule__CellularAutomataInitialization__SeedRulesAssignment_3 )*
            {
             before(grammarAccess.getCellularAutomataInitializationAccess().getSeedRulesAssignment_3()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:894:1: ( rule__CellularAutomataInitialization__SeedRulesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==13) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:894:2: rule__CellularAutomataInitialization__SeedRulesAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__CellularAutomataInitialization__SeedRulesAssignment_3_in_rule__CellularAutomataInitialization__Group__3__Impl1866);
            	    rule__CellularAutomataInitialization__SeedRulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getCellularAutomataInitializationAccess().getSeedRulesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellularAutomataInitialization__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:912:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:916:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:917:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__01905);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__01908);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:924:1: rule__Rule__Group__0__Impl : ( 'init' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:928:1: ( ( 'init' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:929:1: ( 'init' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:929:1: ( 'init' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:930:1: 'init'
            {
             before(grammarAccess.getRuleAccess().getInitKeyword_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Rule__Group__0__Impl1936); 
             after(grammarAccess.getRuleAccess().getInitKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:943:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:947:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:948:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__11967);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__11970);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:955:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__FilterAssignment_1 )? ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:959:1: ( ( ( rule__Rule__FilterAssignment_1 )? ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:960:1: ( ( rule__Rule__FilterAssignment_1 )? )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:960:1: ( ( rule__Rule__FilterAssignment_1 )? )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:961:1: ( rule__Rule__FilterAssignment_1 )?
            {
             before(grammarAccess.getRuleAccess().getFilterAssignment_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:962:1: ( rule__Rule__FilterAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:962:2: rule__Rule__FilterAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Rule__FilterAssignment_1_in_rule__Rule__Group__1__Impl1997);
                    rule__Rule__FilterAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getFilterAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:972:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:976:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:977:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__22028);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__22031);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:984:1: rule__Rule__Group__2__Impl : ( 'by' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:988:1: ( ( 'by' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:989:1: ( 'by' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:989:1: ( 'by' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:990:1: 'by'
            {
             before(grammarAccess.getRuleAccess().getByKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Rule__Group__2__Impl2059); 
             after(grammarAccess.getRuleAccess().getByKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1003:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1007:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1008:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32090);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__32093);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1015:1: rule__Rule__Group__3__Impl : ( '{' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1019:1: ( ( '{' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1020:1: ( '{' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1020:1: ( '{' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1021:1: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Rule__Group__3__Impl2121); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1034:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1038:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1039:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__42152);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__42155);
            rule__Rule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1046:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__EvaluatedValAssignment_4 ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1050:1: ( ( ( rule__Rule__EvaluatedValAssignment_4 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1051:1: ( ( rule__Rule__EvaluatedValAssignment_4 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1051:1: ( ( rule__Rule__EvaluatedValAssignment_4 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1052:1: ( rule__Rule__EvaluatedValAssignment_4 )
            {
             before(grammarAccess.getRuleAccess().getEvaluatedValAssignment_4()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1053:1: ( rule__Rule__EvaluatedValAssignment_4 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1053:2: rule__Rule__EvaluatedValAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__EvaluatedValAssignment_4_in_rule__Rule__Group__4__Impl2182);
            rule__Rule__EvaluatedValAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getEvaluatedValAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1063:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1067:1: ( rule__Rule__Group__5__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1068:2: rule__Rule__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__52212);
            rule__Rule__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1074:1: rule__Rule__Group__5__Impl : ( '}' ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1078:1: ( ( '}' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1079:1: ( '}' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1079:1: ( '}' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1080:1: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Rule__Group__5__Impl2240); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__CoordinateRanges__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1105:1: rule__CoordinateRanges__Group__0 : rule__CoordinateRanges__Group__0__Impl rule__CoordinateRanges__Group__1 ;
    public final void rule__CoordinateRanges__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1109:1: ( rule__CoordinateRanges__Group__0__Impl rule__CoordinateRanges__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1110:2: rule__CoordinateRanges__Group__0__Impl rule__CoordinateRanges__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRanges__Group__0__Impl_in_rule__CoordinateRanges__Group__02283);
            rule__CoordinateRanges__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRanges__Group__1_in_rule__CoordinateRanges__Group__02286);
            rule__CoordinateRanges__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRanges__Group__0"


    // $ANTLR start "rule__CoordinateRanges__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1117:1: rule__CoordinateRanges__Group__0__Impl : ( () ) ;
    public final void rule__CoordinateRanges__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1121:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1122:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1122:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1123:1: ()
            {
             before(grammarAccess.getCoordinateRangesAccess().getCoordinateRangesAction_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1124:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1126:1: 
            {
            }

             after(grammarAccess.getCoordinateRangesAccess().getCoordinateRangesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRanges__Group__0__Impl"


    // $ANTLR start "rule__CoordinateRanges__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1136:1: rule__CoordinateRanges__Group__1 : rule__CoordinateRanges__Group__1__Impl rule__CoordinateRanges__Group__2 ;
    public final void rule__CoordinateRanges__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1140:1: ( rule__CoordinateRanges__Group__1__Impl rule__CoordinateRanges__Group__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1141:2: rule__CoordinateRanges__Group__1__Impl rule__CoordinateRanges__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRanges__Group__1__Impl_in_rule__CoordinateRanges__Group__12344);
            rule__CoordinateRanges__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRanges__Group__2_in_rule__CoordinateRanges__Group__12347);
            rule__CoordinateRanges__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRanges__Group__1"


    // $ANTLR start "rule__CoordinateRanges__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1148:1: rule__CoordinateRanges__Group__1__Impl : ( ( rule__CoordinateRanges__CoordinateRangesAssignment_1 ) ) ;
    public final void rule__CoordinateRanges__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1152:1: ( ( ( rule__CoordinateRanges__CoordinateRangesAssignment_1 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1153:1: ( ( rule__CoordinateRanges__CoordinateRangesAssignment_1 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1153:1: ( ( rule__CoordinateRanges__CoordinateRangesAssignment_1 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1154:1: ( rule__CoordinateRanges__CoordinateRangesAssignment_1 )
            {
             before(grammarAccess.getCoordinateRangesAccess().getCoordinateRangesAssignment_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1155:1: ( rule__CoordinateRanges__CoordinateRangesAssignment_1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1155:2: rule__CoordinateRanges__CoordinateRangesAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRanges__CoordinateRangesAssignment_1_in_rule__CoordinateRanges__Group__1__Impl2374);
            rule__CoordinateRanges__CoordinateRangesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCoordinateRangesAccess().getCoordinateRangesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRanges__Group__1__Impl"


    // $ANTLR start "rule__CoordinateRanges__Group__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1165:1: rule__CoordinateRanges__Group__2 : rule__CoordinateRanges__Group__2__Impl ;
    public final void rule__CoordinateRanges__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1169:1: ( rule__CoordinateRanges__Group__2__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1170:2: rule__CoordinateRanges__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRanges__Group__2__Impl_in_rule__CoordinateRanges__Group__22404);
            rule__CoordinateRanges__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRanges__Group__2"


    // $ANTLR start "rule__CoordinateRanges__Group__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1176:1: rule__CoordinateRanges__Group__2__Impl : ( ( rule__CoordinateRanges__Group_2__0 )* ) ;
    public final void rule__CoordinateRanges__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1180:1: ( ( ( rule__CoordinateRanges__Group_2__0 )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1181:1: ( ( rule__CoordinateRanges__Group_2__0 )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1181:1: ( ( rule__CoordinateRanges__Group_2__0 )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1182:1: ( rule__CoordinateRanges__Group_2__0 )*
            {
             before(grammarAccess.getCoordinateRangesAccess().getGroup_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1183:1: ( rule__CoordinateRanges__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1183:2: rule__CoordinateRanges__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__CoordinateRanges__Group_2__0_in_rule__CoordinateRanges__Group__2__Impl2431);
            	    rule__CoordinateRanges__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getCoordinateRangesAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRanges__Group__2__Impl"


    // $ANTLR start "rule__CoordinateRanges__Group_2__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1199:1: rule__CoordinateRanges__Group_2__0 : rule__CoordinateRanges__Group_2__0__Impl rule__CoordinateRanges__Group_2__1 ;
    public final void rule__CoordinateRanges__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1203:1: ( rule__CoordinateRanges__Group_2__0__Impl rule__CoordinateRanges__Group_2__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1204:2: rule__CoordinateRanges__Group_2__0__Impl rule__CoordinateRanges__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRanges__Group_2__0__Impl_in_rule__CoordinateRanges__Group_2__02468);
            rule__CoordinateRanges__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRanges__Group_2__1_in_rule__CoordinateRanges__Group_2__02471);
            rule__CoordinateRanges__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRanges__Group_2__0"


    // $ANTLR start "rule__CoordinateRanges__Group_2__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1211:1: rule__CoordinateRanges__Group_2__0__Impl : ( ',' ) ;
    public final void rule__CoordinateRanges__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1215:1: ( ( ',' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1216:1: ( ',' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1216:1: ( ',' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1217:1: ','
            {
             before(grammarAccess.getCoordinateRangesAccess().getCommaKeyword_2_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__CoordinateRanges__Group_2__0__Impl2499); 
             after(grammarAccess.getCoordinateRangesAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRanges__Group_2__0__Impl"


    // $ANTLR start "rule__CoordinateRanges__Group_2__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1230:1: rule__CoordinateRanges__Group_2__1 : rule__CoordinateRanges__Group_2__1__Impl ;
    public final void rule__CoordinateRanges__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1234:1: ( rule__CoordinateRanges__Group_2__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1235:2: rule__CoordinateRanges__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRanges__Group_2__1__Impl_in_rule__CoordinateRanges__Group_2__12530);
            rule__CoordinateRanges__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRanges__Group_2__1"


    // $ANTLR start "rule__CoordinateRanges__Group_2__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1241:1: rule__CoordinateRanges__Group_2__1__Impl : ( ( rule__CoordinateRanges__CoordinateRangesAssignment_2_1 ) ) ;
    public final void rule__CoordinateRanges__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1245:1: ( ( ( rule__CoordinateRanges__CoordinateRangesAssignment_2_1 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1246:1: ( ( rule__CoordinateRanges__CoordinateRangesAssignment_2_1 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1246:1: ( ( rule__CoordinateRanges__CoordinateRangesAssignment_2_1 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1247:1: ( rule__CoordinateRanges__CoordinateRangesAssignment_2_1 )
            {
             before(grammarAccess.getCoordinateRangesAccess().getCoordinateRangesAssignment_2_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1248:1: ( rule__CoordinateRanges__CoordinateRangesAssignment_2_1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1248:2: rule__CoordinateRanges__CoordinateRangesAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRanges__CoordinateRangesAssignment_2_1_in_rule__CoordinateRanges__Group_2__1__Impl2557);
            rule__CoordinateRanges__CoordinateRangesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCoordinateRangesAccess().getCoordinateRangesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRanges__Group_2__1__Impl"


    // $ANTLR start "rule__CoordinateRange__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1262:1: rule__CoordinateRange__Group__0 : rule__CoordinateRange__Group__0__Impl rule__CoordinateRange__Group__1 ;
    public final void rule__CoordinateRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1266:1: ( rule__CoordinateRange__Group__0__Impl rule__CoordinateRange__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1267:2: rule__CoordinateRange__Group__0__Impl rule__CoordinateRange__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRange__Group__0__Impl_in_rule__CoordinateRange__Group__02591);
            rule__CoordinateRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRange__Group__1_in_rule__CoordinateRange__Group__02594);
            rule__CoordinateRange__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__0"


    // $ANTLR start "rule__CoordinateRange__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1274:1: rule__CoordinateRange__Group__0__Impl : ( '(' ) ;
    public final void rule__CoordinateRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1278:1: ( ( '(' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1279:1: ( '(' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1279:1: ( '(' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1280:1: '('
            {
             before(grammarAccess.getCoordinateRangeAccess().getLeftParenthesisKeyword_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__CoordinateRange__Group__0__Impl2622); 
             after(grammarAccess.getCoordinateRangeAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__0__Impl"


    // $ANTLR start "rule__CoordinateRange__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1293:1: rule__CoordinateRange__Group__1 : rule__CoordinateRange__Group__1__Impl rule__CoordinateRange__Group__2 ;
    public final void rule__CoordinateRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1297:1: ( rule__CoordinateRange__Group__1__Impl rule__CoordinateRange__Group__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1298:2: rule__CoordinateRange__Group__1__Impl rule__CoordinateRange__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRange__Group__1__Impl_in_rule__CoordinateRange__Group__12653);
            rule__CoordinateRange__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRange__Group__2_in_rule__CoordinateRange__Group__12656);
            rule__CoordinateRange__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__1"


    // $ANTLR start "rule__CoordinateRange__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1305:1: rule__CoordinateRange__Group__1__Impl : ( ( rule__CoordinateRange__DimensionRangesAssignment_1 ) ) ;
    public final void rule__CoordinateRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1309:1: ( ( ( rule__CoordinateRange__DimensionRangesAssignment_1 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1310:1: ( ( rule__CoordinateRange__DimensionRangesAssignment_1 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1310:1: ( ( rule__CoordinateRange__DimensionRangesAssignment_1 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1311:1: ( rule__CoordinateRange__DimensionRangesAssignment_1 )
            {
             before(grammarAccess.getCoordinateRangeAccess().getDimensionRangesAssignment_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1312:1: ( rule__CoordinateRange__DimensionRangesAssignment_1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1312:2: rule__CoordinateRange__DimensionRangesAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRange__DimensionRangesAssignment_1_in_rule__CoordinateRange__Group__1__Impl2683);
            rule__CoordinateRange__DimensionRangesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCoordinateRangeAccess().getDimensionRangesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__1__Impl"


    // $ANTLR start "rule__CoordinateRange__Group__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1322:1: rule__CoordinateRange__Group__2 : rule__CoordinateRange__Group__2__Impl rule__CoordinateRange__Group__3 ;
    public final void rule__CoordinateRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1326:1: ( rule__CoordinateRange__Group__2__Impl rule__CoordinateRange__Group__3 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1327:2: rule__CoordinateRange__Group__2__Impl rule__CoordinateRange__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRange__Group__2__Impl_in_rule__CoordinateRange__Group__22713);
            rule__CoordinateRange__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRange__Group__3_in_rule__CoordinateRange__Group__22716);
            rule__CoordinateRange__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__2"


    // $ANTLR start "rule__CoordinateRange__Group__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1334:1: rule__CoordinateRange__Group__2__Impl : ( ',' ) ;
    public final void rule__CoordinateRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1338:1: ( ( ',' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1339:1: ( ',' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1339:1: ( ',' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1340:1: ','
            {
             before(grammarAccess.getCoordinateRangeAccess().getCommaKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__CoordinateRange__Group__2__Impl2744); 
             after(grammarAccess.getCoordinateRangeAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__2__Impl"


    // $ANTLR start "rule__CoordinateRange__Group__3"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1353:1: rule__CoordinateRange__Group__3 : rule__CoordinateRange__Group__3__Impl rule__CoordinateRange__Group__4 ;
    public final void rule__CoordinateRange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1357:1: ( rule__CoordinateRange__Group__3__Impl rule__CoordinateRange__Group__4 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1358:2: rule__CoordinateRange__Group__3__Impl rule__CoordinateRange__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRange__Group__3__Impl_in_rule__CoordinateRange__Group__32775);
            rule__CoordinateRange__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRange__Group__4_in_rule__CoordinateRange__Group__32778);
            rule__CoordinateRange__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__3"


    // $ANTLR start "rule__CoordinateRange__Group__3__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1365:1: rule__CoordinateRange__Group__3__Impl : ( ( rule__CoordinateRange__DimensionRangesAssignment_3 ) ) ;
    public final void rule__CoordinateRange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1369:1: ( ( ( rule__CoordinateRange__DimensionRangesAssignment_3 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1370:1: ( ( rule__CoordinateRange__DimensionRangesAssignment_3 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1370:1: ( ( rule__CoordinateRange__DimensionRangesAssignment_3 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1371:1: ( rule__CoordinateRange__DimensionRangesAssignment_3 )
            {
             before(grammarAccess.getCoordinateRangeAccess().getDimensionRangesAssignment_3()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1372:1: ( rule__CoordinateRange__DimensionRangesAssignment_3 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1372:2: rule__CoordinateRange__DimensionRangesAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRange__DimensionRangesAssignment_3_in_rule__CoordinateRange__Group__3__Impl2805);
            rule__CoordinateRange__DimensionRangesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCoordinateRangeAccess().getDimensionRangesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__3__Impl"


    // $ANTLR start "rule__CoordinateRange__Group__4"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1382:1: rule__CoordinateRange__Group__4 : rule__CoordinateRange__Group__4__Impl ;
    public final void rule__CoordinateRange__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1386:1: ( rule__CoordinateRange__Group__4__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1387:2: rule__CoordinateRange__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CoordinateRange__Group__4__Impl_in_rule__CoordinateRange__Group__42835);
            rule__CoordinateRange__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__4"


    // $ANTLR start "rule__CoordinateRange__Group__4__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1393:1: rule__CoordinateRange__Group__4__Impl : ( ')' ) ;
    public final void rule__CoordinateRange__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1397:1: ( ( ')' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1398:1: ( ')' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1398:1: ( ')' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1399:1: ')'
            {
             before(grammarAccess.getCoordinateRangeAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__CoordinateRange__Group__4__Impl2863); 
             after(grammarAccess.getCoordinateRangeAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__Group__4__Impl"


    // $ANTLR start "rule__DimensionRange__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1422:1: rule__DimensionRange__Group__0 : rule__DimensionRange__Group__0__Impl rule__DimensionRange__Group__1 ;
    public final void rule__DimensionRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1426:1: ( rule__DimensionRange__Group__0__Impl rule__DimensionRange__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1427:2: rule__DimensionRange__Group__0__Impl rule__DimensionRange__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DimensionRange__Group__0__Impl_in_rule__DimensionRange__Group__02904);
            rule__DimensionRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DimensionRange__Group__1_in_rule__DimensionRange__Group__02907);
            rule__DimensionRange__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionRange__Group__0"


    // $ANTLR start "rule__DimensionRange__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1434:1: rule__DimensionRange__Group__0__Impl : ( ( rule__DimensionRange__LowerAssignment_0 ) ) ;
    public final void rule__DimensionRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1438:1: ( ( ( rule__DimensionRange__LowerAssignment_0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1439:1: ( ( rule__DimensionRange__LowerAssignment_0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1439:1: ( ( rule__DimensionRange__LowerAssignment_0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1440:1: ( rule__DimensionRange__LowerAssignment_0 )
            {
             before(grammarAccess.getDimensionRangeAccess().getLowerAssignment_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1441:1: ( rule__DimensionRange__LowerAssignment_0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1441:2: rule__DimensionRange__LowerAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DimensionRange__LowerAssignment_0_in_rule__DimensionRange__Group__0__Impl2934);
            rule__DimensionRange__LowerAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDimensionRangeAccess().getLowerAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionRange__Group__0__Impl"


    // $ANTLR start "rule__DimensionRange__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1451:1: rule__DimensionRange__Group__1 : rule__DimensionRange__Group__1__Impl ;
    public final void rule__DimensionRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1455:1: ( rule__DimensionRange__Group__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1456:2: rule__DimensionRange__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DimensionRange__Group__1__Impl_in_rule__DimensionRange__Group__12964);
            rule__DimensionRange__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionRange__Group__1"


    // $ANTLR start "rule__DimensionRange__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1462:1: rule__DimensionRange__Group__1__Impl : ( ( rule__DimensionRange__Group_1__0 )? ) ;
    public final void rule__DimensionRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1466:1: ( ( ( rule__DimensionRange__Group_1__0 )? ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1467:1: ( ( rule__DimensionRange__Group_1__0 )? )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1467:1: ( ( rule__DimensionRange__Group_1__0 )? )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1468:1: ( rule__DimensionRange__Group_1__0 )?
            {
             before(grammarAccess.getDimensionRangeAccess().getGroup_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1469:1: ( rule__DimensionRange__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1469:2: rule__DimensionRange__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DimensionRange__Group_1__0_in_rule__DimensionRange__Group__1__Impl2991);
                    rule__DimensionRange__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDimensionRangeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionRange__Group__1__Impl"


    // $ANTLR start "rule__DimensionRange__Group_1__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1483:1: rule__DimensionRange__Group_1__0 : rule__DimensionRange__Group_1__0__Impl rule__DimensionRange__Group_1__1 ;
    public final void rule__DimensionRange__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1487:1: ( rule__DimensionRange__Group_1__0__Impl rule__DimensionRange__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1488:2: rule__DimensionRange__Group_1__0__Impl rule__DimensionRange__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DimensionRange__Group_1__0__Impl_in_rule__DimensionRange__Group_1__03026);
            rule__DimensionRange__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DimensionRange__Group_1__1_in_rule__DimensionRange__Group_1__03029);
            rule__DimensionRange__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionRange__Group_1__0"


    // $ANTLR start "rule__DimensionRange__Group_1__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1495:1: rule__DimensionRange__Group_1__0__Impl : ( '..' ) ;
    public final void rule__DimensionRange__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1499:1: ( ( '..' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1500:1: ( '..' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1500:1: ( '..' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1501:1: '..'
            {
             before(grammarAccess.getDimensionRangeAccess().getFullStopFullStopKeyword_1_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__DimensionRange__Group_1__0__Impl3057); 
             after(grammarAccess.getDimensionRangeAccess().getFullStopFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionRange__Group_1__0__Impl"


    // $ANTLR start "rule__DimensionRange__Group_1__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1514:1: rule__DimensionRange__Group_1__1 : rule__DimensionRange__Group_1__1__Impl ;
    public final void rule__DimensionRange__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1518:1: ( rule__DimensionRange__Group_1__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1519:2: rule__DimensionRange__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DimensionRange__Group_1__1__Impl_in_rule__DimensionRange__Group_1__13088);
            rule__DimensionRange__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionRange__Group_1__1"


    // $ANTLR start "rule__DimensionRange__Group_1__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1525:1: rule__DimensionRange__Group_1__1__Impl : ( ( rule__DimensionRange__UpperAssignment_1_1 ) ) ;
    public final void rule__DimensionRange__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1529:1: ( ( ( rule__DimensionRange__UpperAssignment_1_1 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1530:1: ( ( rule__DimensionRange__UpperAssignment_1_1 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1530:1: ( ( rule__DimensionRange__UpperAssignment_1_1 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1531:1: ( rule__DimensionRange__UpperAssignment_1_1 )
            {
             before(grammarAccess.getDimensionRangeAccess().getUpperAssignment_1_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1532:1: ( rule__DimensionRange__UpperAssignment_1_1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1532:2: rule__DimensionRange__UpperAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DimensionRange__UpperAssignment_1_1_in_rule__DimensionRange__Group_1__1__Impl3115);
            rule__DimensionRange__UpperAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDimensionRangeAccess().getUpperAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionRange__Group_1__1__Impl"


    // $ANTLR start "rule__LiteralsExpression__Group_0__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1546:1: rule__LiteralsExpression__Group_0__0 : rule__LiteralsExpression__Group_0__0__Impl rule__LiteralsExpression__Group_0__1 ;
    public final void rule__LiteralsExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1550:1: ( rule__LiteralsExpression__Group_0__0__Impl rule__LiteralsExpression__Group_0__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1551:2: rule__LiteralsExpression__Group_0__0__Impl rule__LiteralsExpression__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Group_0__0__Impl_in_rule__LiteralsExpression__Group_0__03149);
            rule__LiteralsExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Group_0__1_in_rule__LiteralsExpression__Group_0__03152);
            rule__LiteralsExpression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralsExpression__Group_0__0"


    // $ANTLR start "rule__LiteralsExpression__Group_0__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1558:1: rule__LiteralsExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__LiteralsExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1562:1: ( ( '(' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1563:1: ( '(' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1563:1: ( '(' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1564:1: '('
            {
             before(grammarAccess.getLiteralsExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__LiteralsExpression__Group_0__0__Impl3180); 
             after(grammarAccess.getLiteralsExpressionAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralsExpression__Group_0__0__Impl"


    // $ANTLR start "rule__LiteralsExpression__Group_0__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1577:1: rule__LiteralsExpression__Group_0__1 : rule__LiteralsExpression__Group_0__1__Impl rule__LiteralsExpression__Group_0__2 ;
    public final void rule__LiteralsExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1581:1: ( rule__LiteralsExpression__Group_0__1__Impl rule__LiteralsExpression__Group_0__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1582:2: rule__LiteralsExpression__Group_0__1__Impl rule__LiteralsExpression__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Group_0__1__Impl_in_rule__LiteralsExpression__Group_0__13211);
            rule__LiteralsExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Group_0__2_in_rule__LiteralsExpression__Group_0__13214);
            rule__LiteralsExpression__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralsExpression__Group_0__1"


    // $ANTLR start "rule__LiteralsExpression__Group_0__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1589:1: rule__LiteralsExpression__Group_0__1__Impl : ( ruleConditional ) ;
    public final void rule__LiteralsExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1593:1: ( ( ruleConditional ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1594:1: ( ruleConditional )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1594:1: ( ruleConditional )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1595:1: ruleConditional
            {
             before(grammarAccess.getLiteralsExpressionAccess().getConditionalParserRuleCall_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_rule__LiteralsExpression__Group_0__1__Impl3241);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getLiteralsExpressionAccess().getConditionalParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralsExpression__Group_0__1__Impl"


    // $ANTLR start "rule__LiteralsExpression__Group_0__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1606:1: rule__LiteralsExpression__Group_0__2 : rule__LiteralsExpression__Group_0__2__Impl ;
    public final void rule__LiteralsExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1610:1: ( rule__LiteralsExpression__Group_0__2__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1611:2: rule__LiteralsExpression__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LiteralsExpression__Group_0__2__Impl_in_rule__LiteralsExpression__Group_0__23270);
            rule__LiteralsExpression__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralsExpression__Group_0__2"


    // $ANTLR start "rule__LiteralsExpression__Group_0__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1617:1: rule__LiteralsExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__LiteralsExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1621:1: ( ( ')' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1622:1: ( ')' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1622:1: ( ')' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1623:1: ')'
            {
             before(grammarAccess.getLiteralsExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__LiteralsExpression__Group_0__2__Impl3298); 
             after(grammarAccess.getLiteralsExpressionAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralsExpression__Group_0__2__Impl"


    // $ANTLR start "rule__PositionLiteral__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1642:1: rule__PositionLiteral__Group__0 : rule__PositionLiteral__Group__0__Impl rule__PositionLiteral__Group__1 ;
    public final void rule__PositionLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1646:1: ( rule__PositionLiteral__Group__0__Impl rule__PositionLiteral__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1647:2: rule__PositionLiteral__Group__0__Impl rule__PositionLiteral__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PositionLiteral__Group__0__Impl_in_rule__PositionLiteral__Group__03335);
            rule__PositionLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PositionLiteral__Group__1_in_rule__PositionLiteral__Group__03338);
            rule__PositionLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionLiteral__Group__0"


    // $ANTLR start "rule__PositionLiteral__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1654:1: rule__PositionLiteral__Group__0__Impl : ( () ) ;
    public final void rule__PositionLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1658:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1659:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1659:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1660:1: ()
            {
             before(grammarAccess.getPositionLiteralAccess().getPositionLiteralAction_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1661:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1663:1: 
            {
            }

             after(grammarAccess.getPositionLiteralAccess().getPositionLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionLiteral__Group__0__Impl"


    // $ANTLR start "rule__PositionLiteral__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1673:1: rule__PositionLiteral__Group__1 : rule__PositionLiteral__Group__1__Impl rule__PositionLiteral__Group__2 ;
    public final void rule__PositionLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1677:1: ( rule__PositionLiteral__Group__1__Impl rule__PositionLiteral__Group__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1678:2: rule__PositionLiteral__Group__1__Impl rule__PositionLiteral__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PositionLiteral__Group__1__Impl_in_rule__PositionLiteral__Group__13396);
            rule__PositionLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PositionLiteral__Group__2_in_rule__PositionLiteral__Group__13399);
            rule__PositionLiteral__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionLiteral__Group__1"


    // $ANTLR start "rule__PositionLiteral__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1685:1: rule__PositionLiteral__Group__1__Impl : ( 'positionOn' ) ;
    public final void rule__PositionLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1689:1: ( ( 'positionOn' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1690:1: ( 'positionOn' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1690:1: ( 'positionOn' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1691:1: 'positionOn'
            {
             before(grammarAccess.getPositionLiteralAccess().getPositionOnKeyword_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__PositionLiteral__Group__1__Impl3427); 
             after(grammarAccess.getPositionLiteralAccess().getPositionOnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionLiteral__Group__1__Impl"


    // $ANTLR start "rule__PositionLiteral__Group__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1704:1: rule__PositionLiteral__Group__2 : rule__PositionLiteral__Group__2__Impl rule__PositionLiteral__Group__3 ;
    public final void rule__PositionLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1708:1: ( rule__PositionLiteral__Group__2__Impl rule__PositionLiteral__Group__3 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1709:2: rule__PositionLiteral__Group__2__Impl rule__PositionLiteral__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PositionLiteral__Group__2__Impl_in_rule__PositionLiteral__Group__23458);
            rule__PositionLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PositionLiteral__Group__3_in_rule__PositionLiteral__Group__23461);
            rule__PositionLiteral__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionLiteral__Group__2"


    // $ANTLR start "rule__PositionLiteral__Group__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1716:1: rule__PositionLiteral__Group__2__Impl : ( '[' ) ;
    public final void rule__PositionLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1720:1: ( ( '[' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1721:1: ( '[' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1721:1: ( '[' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1722:1: '['
            {
             before(grammarAccess.getPositionLiteralAccess().getLeftSquareBracketKeyword_2()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__PositionLiteral__Group__2__Impl3489); 
             after(grammarAccess.getPositionLiteralAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionLiteral__Group__2__Impl"


    // $ANTLR start "rule__PositionLiteral__Group__3"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1735:1: rule__PositionLiteral__Group__3 : rule__PositionLiteral__Group__3__Impl rule__PositionLiteral__Group__4 ;
    public final void rule__PositionLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1739:1: ( rule__PositionLiteral__Group__3__Impl rule__PositionLiteral__Group__4 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1740:2: rule__PositionLiteral__Group__3__Impl rule__PositionLiteral__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PositionLiteral__Group__3__Impl_in_rule__PositionLiteral__Group__33520);
            rule__PositionLiteral__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PositionLiteral__Group__4_in_rule__PositionLiteral__Group__33523);
            rule__PositionLiteral__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionLiteral__Group__3"


    // $ANTLR start "rule__PositionLiteral__Group__3__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1747:1: rule__PositionLiteral__Group__3__Impl : ( ( rule__PositionLiteral__DimensionIndexAssignment_3 ) ) ;
    public final void rule__PositionLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1751:1: ( ( ( rule__PositionLiteral__DimensionIndexAssignment_3 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1752:1: ( ( rule__PositionLiteral__DimensionIndexAssignment_3 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1752:1: ( ( rule__PositionLiteral__DimensionIndexAssignment_3 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1753:1: ( rule__PositionLiteral__DimensionIndexAssignment_3 )
            {
             before(grammarAccess.getPositionLiteralAccess().getDimensionIndexAssignment_3()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1754:1: ( rule__PositionLiteral__DimensionIndexAssignment_3 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1754:2: rule__PositionLiteral__DimensionIndexAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PositionLiteral__DimensionIndexAssignment_3_in_rule__PositionLiteral__Group__3__Impl3550);
            rule__PositionLiteral__DimensionIndexAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPositionLiteralAccess().getDimensionIndexAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionLiteral__Group__3__Impl"


    // $ANTLR start "rule__PositionLiteral__Group__4"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1764:1: rule__PositionLiteral__Group__4 : rule__PositionLiteral__Group__4__Impl ;
    public final void rule__PositionLiteral__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1768:1: ( rule__PositionLiteral__Group__4__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1769:2: rule__PositionLiteral__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PositionLiteral__Group__4__Impl_in_rule__PositionLiteral__Group__43580);
            rule__PositionLiteral__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionLiteral__Group__4"


    // $ANTLR start "rule__PositionLiteral__Group__4__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1775:1: rule__PositionLiteral__Group__4__Impl : ( ']' ) ;
    public final void rule__PositionLiteral__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1779:1: ( ( ']' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1780:1: ( ']' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1780:1: ( ']' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1781:1: ']'
            {
             before(grammarAccess.getPositionLiteralAccess().getRightSquareBracketKeyword_4()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__PositionLiteral__Group__4__Impl3608); 
             after(grammarAccess.getPositionLiteralAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionLiteral__Group__4__Impl"


    // $ANTLR start "rule__RegularGeometry__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1804:1: rule__RegularGeometry__Group__0 : rule__RegularGeometry__Group__0__Impl rule__RegularGeometry__Group__1 ;
    public final void rule__RegularGeometry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1808:1: ( rule__RegularGeometry__Group__0__Impl rule__RegularGeometry__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1809:2: rule__RegularGeometry__Group__0__Impl rule__RegularGeometry__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group__0__Impl_in_rule__RegularGeometry__Group__03649);
            rule__RegularGeometry__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group__1_in_rule__RegularGeometry__Group__03652);
            rule__RegularGeometry__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group__0"


    // $ANTLR start "rule__RegularGeometry__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1816:1: rule__RegularGeometry__Group__0__Impl : ( () ) ;
    public final void rule__RegularGeometry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1820:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1821:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1821:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1822:1: ()
            {
             before(grammarAccess.getRegularGeometryAccess().getRegularGeometryAction_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1823:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1825:1: 
            {
            }

             after(grammarAccess.getRegularGeometryAccess().getRegularGeometryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group__0__Impl"


    // $ANTLR start "rule__RegularGeometry__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1835:1: rule__RegularGeometry__Group__1 : rule__RegularGeometry__Group__1__Impl rule__RegularGeometry__Group__2 ;
    public final void rule__RegularGeometry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1839:1: ( rule__RegularGeometry__Group__1__Impl rule__RegularGeometry__Group__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1840:2: rule__RegularGeometry__Group__1__Impl rule__RegularGeometry__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group__1__Impl_in_rule__RegularGeometry__Group__13710);
            rule__RegularGeometry__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group__2_in_rule__RegularGeometry__Group__13713);
            rule__RegularGeometry__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group__1"


    // $ANTLR start "rule__RegularGeometry__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1847:1: rule__RegularGeometry__Group__1__Impl : ( 'regularGeometry' ) ;
    public final void rule__RegularGeometry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1851:1: ( ( 'regularGeometry' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1852:1: ( 'regularGeometry' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1852:1: ( 'regularGeometry' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1853:1: 'regularGeometry'
            {
             before(grammarAccess.getRegularGeometryAccess().getRegularGeometryKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__RegularGeometry__Group__1__Impl3741); 
             after(grammarAccess.getRegularGeometryAccess().getRegularGeometryKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group__1__Impl"


    // $ANTLR start "rule__RegularGeometry__Group__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1866:1: rule__RegularGeometry__Group__2 : rule__RegularGeometry__Group__2__Impl rule__RegularGeometry__Group__3 ;
    public final void rule__RegularGeometry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1870:1: ( rule__RegularGeometry__Group__2__Impl rule__RegularGeometry__Group__3 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1871:2: rule__RegularGeometry__Group__2__Impl rule__RegularGeometry__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group__2__Impl_in_rule__RegularGeometry__Group__23772);
            rule__RegularGeometry__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group__3_in_rule__RegularGeometry__Group__23775);
            rule__RegularGeometry__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group__2"


    // $ANTLR start "rule__RegularGeometry__Group__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1878:1: rule__RegularGeometry__Group__2__Impl : ( ( rule__RegularGeometry__NeighborsAssignment_2 ) ) ;
    public final void rule__RegularGeometry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1882:1: ( ( ( rule__RegularGeometry__NeighborsAssignment_2 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1883:1: ( ( rule__RegularGeometry__NeighborsAssignment_2 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1883:1: ( ( rule__RegularGeometry__NeighborsAssignment_2 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1884:1: ( rule__RegularGeometry__NeighborsAssignment_2 )
            {
             before(grammarAccess.getRegularGeometryAccess().getNeighborsAssignment_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1885:1: ( rule__RegularGeometry__NeighborsAssignment_2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1885:2: rule__RegularGeometry__NeighborsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__NeighborsAssignment_2_in_rule__RegularGeometry__Group__2__Impl3802);
            rule__RegularGeometry__NeighborsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRegularGeometryAccess().getNeighborsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group__2__Impl"


    // $ANTLR start "rule__RegularGeometry__Group__3"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1895:1: rule__RegularGeometry__Group__3 : rule__RegularGeometry__Group__3__Impl rule__RegularGeometry__Group__4 ;
    public final void rule__RegularGeometry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1899:1: ( rule__RegularGeometry__Group__3__Impl rule__RegularGeometry__Group__4 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1900:2: rule__RegularGeometry__Group__3__Impl rule__RegularGeometry__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group__3__Impl_in_rule__RegularGeometry__Group__33832);
            rule__RegularGeometry__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group__4_in_rule__RegularGeometry__Group__33835);
            rule__RegularGeometry__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group__3"


    // $ANTLR start "rule__RegularGeometry__Group__3__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1907:1: rule__RegularGeometry__Group__3__Impl : ( '{' ) ;
    public final void rule__RegularGeometry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1911:1: ( ( '{' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1912:1: ( '{' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1912:1: ( '{' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1913:1: '{'
            {
             before(grammarAccess.getRegularGeometryAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__RegularGeometry__Group__3__Impl3863); 
             after(grammarAccess.getRegularGeometryAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group__3__Impl"


    // $ANTLR start "rule__RegularGeometry__Group__4"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1926:1: rule__RegularGeometry__Group__4 : rule__RegularGeometry__Group__4__Impl rule__RegularGeometry__Group__5 ;
    public final void rule__RegularGeometry__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1930:1: ( rule__RegularGeometry__Group__4__Impl rule__RegularGeometry__Group__5 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1931:2: rule__RegularGeometry__Group__4__Impl rule__RegularGeometry__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group__4__Impl_in_rule__RegularGeometry__Group__43894);
            rule__RegularGeometry__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group__5_in_rule__RegularGeometry__Group__43897);
            rule__RegularGeometry__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group__4"


    // $ANTLR start "rule__RegularGeometry__Group__4__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1938:1: rule__RegularGeometry__Group__4__Impl : ( ( rule__RegularGeometry__DimensionsAssignment_4 ) ) ;
    public final void rule__RegularGeometry__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1942:1: ( ( ( rule__RegularGeometry__DimensionsAssignment_4 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1943:1: ( ( rule__RegularGeometry__DimensionsAssignment_4 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1943:1: ( ( rule__RegularGeometry__DimensionsAssignment_4 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1944:1: ( rule__RegularGeometry__DimensionsAssignment_4 )
            {
             before(grammarAccess.getRegularGeometryAccess().getDimensionsAssignment_4()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1945:1: ( rule__RegularGeometry__DimensionsAssignment_4 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1945:2: rule__RegularGeometry__DimensionsAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__DimensionsAssignment_4_in_rule__RegularGeometry__Group__4__Impl3924);
            rule__RegularGeometry__DimensionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRegularGeometryAccess().getDimensionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group__4__Impl"


    // $ANTLR start "rule__RegularGeometry__Group__5"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1955:1: rule__RegularGeometry__Group__5 : rule__RegularGeometry__Group__5__Impl rule__RegularGeometry__Group__6 ;
    public final void rule__RegularGeometry__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1959:1: ( rule__RegularGeometry__Group__5__Impl rule__RegularGeometry__Group__6 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1960:2: rule__RegularGeometry__Group__5__Impl rule__RegularGeometry__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group__5__Impl_in_rule__RegularGeometry__Group__53954);
            rule__RegularGeometry__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group__6_in_rule__RegularGeometry__Group__53957);
            rule__RegularGeometry__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group__5"


    // $ANTLR start "rule__RegularGeometry__Group__5__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1967:1: rule__RegularGeometry__Group__5__Impl : ( ( rule__RegularGeometry__Group_5__0 )* ) ;
    public final void rule__RegularGeometry__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1971:1: ( ( ( rule__RegularGeometry__Group_5__0 )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1972:1: ( ( rule__RegularGeometry__Group_5__0 )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1972:1: ( ( rule__RegularGeometry__Group_5__0 )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1973:1: ( rule__RegularGeometry__Group_5__0 )*
            {
             before(grammarAccess.getRegularGeometryAccess().getGroup_5()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1974:1: ( rule__RegularGeometry__Group_5__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1974:2: rule__RegularGeometry__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group_5__0_in_rule__RegularGeometry__Group__5__Impl3984);
            	    rule__RegularGeometry__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getRegularGeometryAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group__5__Impl"


    // $ANTLR start "rule__RegularGeometry__Group__6"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1984:1: rule__RegularGeometry__Group__6 : rule__RegularGeometry__Group__6__Impl ;
    public final void rule__RegularGeometry__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1988:1: ( rule__RegularGeometry__Group__6__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1989:2: rule__RegularGeometry__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group__6__Impl_in_rule__RegularGeometry__Group__64015);
            rule__RegularGeometry__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group__6"


    // $ANTLR start "rule__RegularGeometry__Group__6__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1995:1: rule__RegularGeometry__Group__6__Impl : ( '}' ) ;
    public final void rule__RegularGeometry__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:1999:1: ( ( '}' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2000:1: ( '}' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2000:1: ( '}' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2001:1: '}'
            {
             before(grammarAccess.getRegularGeometryAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__RegularGeometry__Group__6__Impl4043); 
             after(grammarAccess.getRegularGeometryAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group__6__Impl"


    // $ANTLR start "rule__RegularGeometry__Group_5__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2028:1: rule__RegularGeometry__Group_5__0 : rule__RegularGeometry__Group_5__0__Impl rule__RegularGeometry__Group_5__1 ;
    public final void rule__RegularGeometry__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2032:1: ( rule__RegularGeometry__Group_5__0__Impl rule__RegularGeometry__Group_5__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2033:2: rule__RegularGeometry__Group_5__0__Impl rule__RegularGeometry__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group_5__0__Impl_in_rule__RegularGeometry__Group_5__04088);
            rule__RegularGeometry__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group_5__1_in_rule__RegularGeometry__Group_5__04091);
            rule__RegularGeometry__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group_5__0"


    // $ANTLR start "rule__RegularGeometry__Group_5__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2040:1: rule__RegularGeometry__Group_5__0__Impl : ( 'x' ) ;
    public final void rule__RegularGeometry__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2044:1: ( ( 'x' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2045:1: ( 'x' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2045:1: ( 'x' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2046:1: 'x'
            {
             before(grammarAccess.getRegularGeometryAccess().getXKeyword_5_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__RegularGeometry__Group_5__0__Impl4119); 
             after(grammarAccess.getRegularGeometryAccess().getXKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group_5__0__Impl"


    // $ANTLR start "rule__RegularGeometry__Group_5__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2059:1: rule__RegularGeometry__Group_5__1 : rule__RegularGeometry__Group_5__1__Impl ;
    public final void rule__RegularGeometry__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2063:1: ( rule__RegularGeometry__Group_5__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2064:2: rule__RegularGeometry__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__Group_5__1__Impl_in_rule__RegularGeometry__Group_5__14150);
            rule__RegularGeometry__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group_5__1"


    // $ANTLR start "rule__RegularGeometry__Group_5__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2070:1: rule__RegularGeometry__Group_5__1__Impl : ( ( rule__RegularGeometry__DimensionsAssignment_5_1 ) ) ;
    public final void rule__RegularGeometry__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2074:1: ( ( ( rule__RegularGeometry__DimensionsAssignment_5_1 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2075:1: ( ( rule__RegularGeometry__DimensionsAssignment_5_1 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2075:1: ( ( rule__RegularGeometry__DimensionsAssignment_5_1 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2076:1: ( rule__RegularGeometry__DimensionsAssignment_5_1 )
            {
             before(grammarAccess.getRegularGeometryAccess().getDimensionsAssignment_5_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2077:1: ( rule__RegularGeometry__DimensionsAssignment_5_1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2077:2: rule__RegularGeometry__DimensionsAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RegularGeometry__DimensionsAssignment_5_1_in_rule__RegularGeometry__Group_5__1__Impl4177);
            rule__RegularGeometry__DimensionsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularGeometryAccess().getDimensionsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__Group_5__1__Impl"


    // $ANTLR start "rule__Dimension__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2091:1: rule__Dimension__Group__0 : rule__Dimension__Group__0__Impl rule__Dimension__Group__1 ;
    public final void rule__Dimension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2095:1: ( rule__Dimension__Group__0__Impl rule__Dimension__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2096:2: rule__Dimension__Group__0__Impl rule__Dimension__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dimension__Group__0__Impl_in_rule__Dimension__Group__04211);
            rule__Dimension__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Dimension__Group__1_in_rule__Dimension__Group__04214);
            rule__Dimension__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group__0"


    // $ANTLR start "rule__Dimension__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2103:1: rule__Dimension__Group__0__Impl : ( () ) ;
    public final void rule__Dimension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2107:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2108:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2108:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2109:1: ()
            {
             before(grammarAccess.getDimensionAccess().getDimensionAction_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2110:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2112:1: 
            {
            }

             after(grammarAccess.getDimensionAccess().getDimensionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group__0__Impl"


    // $ANTLR start "rule__Dimension__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2122:1: rule__Dimension__Group__1 : rule__Dimension__Group__1__Impl rule__Dimension__Group__2 ;
    public final void rule__Dimension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2126:1: ( rule__Dimension__Group__1__Impl rule__Dimension__Group__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2127:2: rule__Dimension__Group__1__Impl rule__Dimension__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dimension__Group__1__Impl_in_rule__Dimension__Group__14272);
            rule__Dimension__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Dimension__Group__2_in_rule__Dimension__Group__14275);
            rule__Dimension__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group__1"


    // $ANTLR start "rule__Dimension__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2134:1: rule__Dimension__Group__1__Impl : ( ( rule__Dimension__ExtentAssignment_1 ) ) ;
    public final void rule__Dimension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2138:1: ( ( ( rule__Dimension__ExtentAssignment_1 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2139:1: ( ( rule__Dimension__ExtentAssignment_1 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2139:1: ( ( rule__Dimension__ExtentAssignment_1 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2140:1: ( rule__Dimension__ExtentAssignment_1 )
            {
             before(grammarAccess.getDimensionAccess().getExtentAssignment_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2141:1: ( rule__Dimension__ExtentAssignment_1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2141:2: rule__Dimension__ExtentAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dimension__ExtentAssignment_1_in_rule__Dimension__Group__1__Impl4302);
            rule__Dimension__ExtentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDimensionAccess().getExtentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group__1__Impl"


    // $ANTLR start "rule__Dimension__Group__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2151:1: rule__Dimension__Group__2 : rule__Dimension__Group__2__Impl ;
    public final void rule__Dimension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2155:1: ( rule__Dimension__Group__2__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2156:2: rule__Dimension__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dimension__Group__2__Impl_in_rule__Dimension__Group__24332);
            rule__Dimension__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group__2"


    // $ANTLR start "rule__Dimension__Group__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2162:1: rule__Dimension__Group__2__Impl : ( ( rule__Dimension__IsCircularAssignment_2 )? ) ;
    public final void rule__Dimension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2166:1: ( ( ( rule__Dimension__IsCircularAssignment_2 )? ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2167:1: ( ( rule__Dimension__IsCircularAssignment_2 )? )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2167:1: ( ( rule__Dimension__IsCircularAssignment_2 )? )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2168:1: ( rule__Dimension__IsCircularAssignment_2 )?
            {
             before(grammarAccess.getDimensionAccess().getIsCircularAssignment_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2169:1: ( rule__Dimension__IsCircularAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==39) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2169:2: rule__Dimension__IsCircularAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Dimension__IsCircularAssignment_2_in_rule__Dimension__Group__2__Impl4359);
                    rule__Dimension__IsCircularAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDimensionAccess().getIsCircularAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group__2__Impl"


    // $ANTLR start "rule__Conditional__Group_1__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2185:1: rule__Conditional__Group_1__0 : rule__Conditional__Group_1__0__Impl rule__Conditional__Group_1__1 ;
    public final void rule__Conditional__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2189:1: ( rule__Conditional__Group_1__0__Impl rule__Conditional__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2190:2: rule__Conditional__Group_1__0__Impl rule__Conditional__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__0__Impl_in_rule__Conditional__Group_1__04396);
            rule__Conditional__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__1_in_rule__Conditional__Group_1__04399);
            rule__Conditional__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__0"


    // $ANTLR start "rule__Conditional__Group_1__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2197:1: rule__Conditional__Group_1__0__Impl : ( () ) ;
    public final void rule__Conditional__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2201:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2202:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2202:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2203:1: ()
            {
             before(grammarAccess.getConditionalAccess().getConditionalAction_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2204:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2206:1: 
            {
            }

             after(grammarAccess.getConditionalAccess().getConditionalAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__0__Impl"


    // $ANTLR start "rule__Conditional__Group_1__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2216:1: rule__Conditional__Group_1__1 : rule__Conditional__Group_1__1__Impl rule__Conditional__Group_1__2 ;
    public final void rule__Conditional__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2220:1: ( rule__Conditional__Group_1__1__Impl rule__Conditional__Group_1__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2221:2: rule__Conditional__Group_1__1__Impl rule__Conditional__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__1__Impl_in_rule__Conditional__Group_1__14457);
            rule__Conditional__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__2_in_rule__Conditional__Group_1__14460);
            rule__Conditional__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__1"


    // $ANTLR start "rule__Conditional__Group_1__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2228:1: rule__Conditional__Group_1__1__Impl : ( 'if' ) ;
    public final void rule__Conditional__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2232:1: ( ( 'if' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2233:1: ( 'if' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2233:1: ( 'if' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2234:1: 'if'
            {
             before(grammarAccess.getConditionalAccess().getIfKeyword_1_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Conditional__Group_1__1__Impl4488); 
             after(grammarAccess.getConditionalAccess().getIfKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__1__Impl"


    // $ANTLR start "rule__Conditional__Group_1__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2247:1: rule__Conditional__Group_1__2 : rule__Conditional__Group_1__2__Impl rule__Conditional__Group_1__3 ;
    public final void rule__Conditional__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2251:1: ( rule__Conditional__Group_1__2__Impl rule__Conditional__Group_1__3 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2252:2: rule__Conditional__Group_1__2__Impl rule__Conditional__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__2__Impl_in_rule__Conditional__Group_1__24519);
            rule__Conditional__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__3_in_rule__Conditional__Group_1__24522);
            rule__Conditional__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__2"


    // $ANTLR start "rule__Conditional__Group_1__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2259:1: rule__Conditional__Group_1__2__Impl : ( ( rule__Conditional__ConditionAssignment_1_2 ) ) ;
    public final void rule__Conditional__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2263:1: ( ( ( rule__Conditional__ConditionAssignment_1_2 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2264:1: ( ( rule__Conditional__ConditionAssignment_1_2 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2264:1: ( ( rule__Conditional__ConditionAssignment_1_2 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2265:1: ( rule__Conditional__ConditionAssignment_1_2 )
            {
             before(grammarAccess.getConditionalAccess().getConditionAssignment_1_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2266:1: ( rule__Conditional__ConditionAssignment_1_2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2266:2: rule__Conditional__ConditionAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__ConditionAssignment_1_2_in_rule__Conditional__Group_1__2__Impl4549);
            rule__Conditional__ConditionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getConditionAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__2__Impl"


    // $ANTLR start "rule__Conditional__Group_1__3"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2276:1: rule__Conditional__Group_1__3 : rule__Conditional__Group_1__3__Impl rule__Conditional__Group_1__4 ;
    public final void rule__Conditional__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2280:1: ( rule__Conditional__Group_1__3__Impl rule__Conditional__Group_1__4 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2281:2: rule__Conditional__Group_1__3__Impl rule__Conditional__Group_1__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__3__Impl_in_rule__Conditional__Group_1__34579);
            rule__Conditional__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__4_in_rule__Conditional__Group_1__34582);
            rule__Conditional__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__3"


    // $ANTLR start "rule__Conditional__Group_1__3__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2288:1: rule__Conditional__Group_1__3__Impl : ( '{' ) ;
    public final void rule__Conditional__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2292:1: ( ( '{' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2293:1: ( '{' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2293:1: ( '{' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2294:1: '{'
            {
             before(grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_1_3()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Conditional__Group_1__3__Impl4610); 
             after(grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__3__Impl"


    // $ANTLR start "rule__Conditional__Group_1__4"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2307:1: rule__Conditional__Group_1__4 : rule__Conditional__Group_1__4__Impl rule__Conditional__Group_1__5 ;
    public final void rule__Conditional__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2311:1: ( rule__Conditional__Group_1__4__Impl rule__Conditional__Group_1__5 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2312:2: rule__Conditional__Group_1__4__Impl rule__Conditional__Group_1__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__4__Impl_in_rule__Conditional__Group_1__44641);
            rule__Conditional__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__5_in_rule__Conditional__Group_1__44644);
            rule__Conditional__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__4"


    // $ANTLR start "rule__Conditional__Group_1__4__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2319:1: rule__Conditional__Group_1__4__Impl : ( ( rule__Conditional__IfTrueExpressionAssignment_1_4 ) ) ;
    public final void rule__Conditional__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2323:1: ( ( ( rule__Conditional__IfTrueExpressionAssignment_1_4 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2324:1: ( ( rule__Conditional__IfTrueExpressionAssignment_1_4 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2324:1: ( ( rule__Conditional__IfTrueExpressionAssignment_1_4 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2325:1: ( rule__Conditional__IfTrueExpressionAssignment_1_4 )
            {
             before(grammarAccess.getConditionalAccess().getIfTrueExpressionAssignment_1_4()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2326:1: ( rule__Conditional__IfTrueExpressionAssignment_1_4 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2326:2: rule__Conditional__IfTrueExpressionAssignment_1_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__IfTrueExpressionAssignment_1_4_in_rule__Conditional__Group_1__4__Impl4671);
            rule__Conditional__IfTrueExpressionAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getIfTrueExpressionAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__4__Impl"


    // $ANTLR start "rule__Conditional__Group_1__5"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2336:1: rule__Conditional__Group_1__5 : rule__Conditional__Group_1__5__Impl rule__Conditional__Group_1__6 ;
    public final void rule__Conditional__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2340:1: ( rule__Conditional__Group_1__5__Impl rule__Conditional__Group_1__6 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2341:2: rule__Conditional__Group_1__5__Impl rule__Conditional__Group_1__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__5__Impl_in_rule__Conditional__Group_1__54701);
            rule__Conditional__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__6_in_rule__Conditional__Group_1__54704);
            rule__Conditional__Group_1__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__5"


    // $ANTLR start "rule__Conditional__Group_1__5__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2348:1: rule__Conditional__Group_1__5__Impl : ( '}' ) ;
    public final void rule__Conditional__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2352:1: ( ( '}' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2353:1: ( '}' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2353:1: ( '}' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2354:1: '}'
            {
             before(grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_1_5()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Conditional__Group_1__5__Impl4732); 
             after(grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__5__Impl"


    // $ANTLR start "rule__Conditional__Group_1__6"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2367:1: rule__Conditional__Group_1__6 : rule__Conditional__Group_1__6__Impl rule__Conditional__Group_1__7 ;
    public final void rule__Conditional__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2371:1: ( rule__Conditional__Group_1__6__Impl rule__Conditional__Group_1__7 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2372:2: rule__Conditional__Group_1__6__Impl rule__Conditional__Group_1__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__6__Impl_in_rule__Conditional__Group_1__64763);
            rule__Conditional__Group_1__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__7_in_rule__Conditional__Group_1__64766);
            rule__Conditional__Group_1__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__6"


    // $ANTLR start "rule__Conditional__Group_1__6__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2379:1: rule__Conditional__Group_1__6__Impl : ( 'else' ) ;
    public final void rule__Conditional__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2383:1: ( ( 'else' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2384:1: ( 'else' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2384:1: ( 'else' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2385:1: 'else'
            {
             before(grammarAccess.getConditionalAccess().getElseKeyword_1_6()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Conditional__Group_1__6__Impl4794); 
             after(grammarAccess.getConditionalAccess().getElseKeyword_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__6__Impl"


    // $ANTLR start "rule__Conditional__Group_1__7"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2398:1: rule__Conditional__Group_1__7 : rule__Conditional__Group_1__7__Impl rule__Conditional__Group_1__8 ;
    public final void rule__Conditional__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2402:1: ( rule__Conditional__Group_1__7__Impl rule__Conditional__Group_1__8 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2403:2: rule__Conditional__Group_1__7__Impl rule__Conditional__Group_1__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__7__Impl_in_rule__Conditional__Group_1__74825);
            rule__Conditional__Group_1__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__8_in_rule__Conditional__Group_1__74828);
            rule__Conditional__Group_1__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__7"


    // $ANTLR start "rule__Conditional__Group_1__7__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2410:1: rule__Conditional__Group_1__7__Impl : ( '{' ) ;
    public final void rule__Conditional__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2414:1: ( ( '{' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2415:1: ( '{' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2415:1: ( '{' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2416:1: '{'
            {
             before(grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_1_7()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Conditional__Group_1__7__Impl4856); 
             after(grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_1_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__7__Impl"


    // $ANTLR start "rule__Conditional__Group_1__8"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2429:1: rule__Conditional__Group_1__8 : rule__Conditional__Group_1__8__Impl rule__Conditional__Group_1__9 ;
    public final void rule__Conditional__Group_1__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2433:1: ( rule__Conditional__Group_1__8__Impl rule__Conditional__Group_1__9 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2434:2: rule__Conditional__Group_1__8__Impl rule__Conditional__Group_1__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__8__Impl_in_rule__Conditional__Group_1__84887);
            rule__Conditional__Group_1__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__9_in_rule__Conditional__Group_1__84890);
            rule__Conditional__Group_1__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__8"


    // $ANTLR start "rule__Conditional__Group_1__8__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2441:1: rule__Conditional__Group_1__8__Impl : ( ( rule__Conditional__IfFalseExpressionAssignment_1_8 ) ) ;
    public final void rule__Conditional__Group_1__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2445:1: ( ( ( rule__Conditional__IfFalseExpressionAssignment_1_8 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2446:1: ( ( rule__Conditional__IfFalseExpressionAssignment_1_8 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2446:1: ( ( rule__Conditional__IfFalseExpressionAssignment_1_8 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2447:1: ( rule__Conditional__IfFalseExpressionAssignment_1_8 )
            {
             before(grammarAccess.getConditionalAccess().getIfFalseExpressionAssignment_1_8()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2448:1: ( rule__Conditional__IfFalseExpressionAssignment_1_8 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2448:2: rule__Conditional__IfFalseExpressionAssignment_1_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__IfFalseExpressionAssignment_1_8_in_rule__Conditional__Group_1__8__Impl4917);
            rule__Conditional__IfFalseExpressionAssignment_1_8();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getIfFalseExpressionAssignment_1_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__8__Impl"


    // $ANTLR start "rule__Conditional__Group_1__9"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2458:1: rule__Conditional__Group_1__9 : rule__Conditional__Group_1__9__Impl ;
    public final void rule__Conditional__Group_1__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2462:1: ( rule__Conditional__Group_1__9__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2463:2: rule__Conditional__Group_1__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Conditional__Group_1__9__Impl_in_rule__Conditional__Group_1__94947);
            rule__Conditional__Group_1__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__9"


    // $ANTLR start "rule__Conditional__Group_1__9__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2469:1: rule__Conditional__Group_1__9__Impl : ( '}' ) ;
    public final void rule__Conditional__Group_1__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2473:1: ( ( '}' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2474:1: ( '}' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2474:1: ( '}' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2475:1: '}'
            {
             before(grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_1_9()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Conditional__Group_1__9__Impl4975); 
             after(grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_1_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_1__9__Impl"


    // $ANTLR start "rule__OrExpression__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2508:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2512:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2513:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__05026);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__05029);
            rule__OrExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0"


    // $ANTLR start "rule__OrExpression__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2520:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2524:1: ( ( ruleAndExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2525:1: ( ruleAndExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2525:1: ( ruleAndExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2526:1: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl5056);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0__Impl"


    // $ANTLR start "rule__OrExpression__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2537:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2541:1: ( rule__OrExpression__Group__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2542:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__15085);
            rule__OrExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1"


    // $ANTLR start "rule__OrExpression__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2548:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2552:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2553:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2553:1: ( ( rule__OrExpression__Group_1__0 )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2554:1: ( rule__OrExpression__Group_1__0 )*
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2555:1: ( rule__OrExpression__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2555:2: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl5112);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getOrExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2569:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2573:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2574:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__05147);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__05150);
            rule__OrExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0"


    // $ANTLR start "rule__OrExpression__Group_1__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2581:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2585:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2586:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2586:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2587:1: ()
            {
             before(grammarAccess.getOrExpressionAccess().getOrLeftAction_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2588:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2590:1: 
            {
            }

             after(grammarAccess.getOrExpressionAccess().getOrLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2600:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2604:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2605:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__15208);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__15211);
            rule__OrExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1"


    // $ANTLR start "rule__OrExpression__Group_1__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2612:1: rule__OrExpression__Group_1__1__Impl : ( '|' ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2616:1: ( ( '|' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2617:1: ( '|' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2617:1: ( '|' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2618:1: '|'
            {
             before(grammarAccess.getOrExpressionAccess().getVerticalLineKeyword_1_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__OrExpression__Group_1__1__Impl5239); 
             after(grammarAccess.getOrExpressionAccess().getVerticalLineKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2631:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2635:1: ( rule__OrExpression__Group_1__2__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2636:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__25270);
            rule__OrExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__2"


    // $ANTLR start "rule__OrExpression__Group_1__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2642:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__RightAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2646:1: ( ( ( rule__OrExpression__RightAssignment_1_2 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2647:1: ( ( rule__OrExpression__RightAssignment_1_2 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2647:1: ( ( rule__OrExpression__RightAssignment_1_2 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2648:1: ( rule__OrExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2649:1: ( rule__OrExpression__RightAssignment_1_2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2649:2: rule__OrExpression__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OrExpression__RightAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl5297);
            rule__OrExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2665:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2669:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2670:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__05333);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__05336);
            rule__AndExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2677:1: rule__AndExpression__Group__0__Impl : ( ruleEqualExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2681:1: ( ( ruleEqualExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2682:1: ( ruleEqualExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2682:1: ( ruleEqualExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2683:1: ruleEqualExpression
            {
             before(grammarAccess.getAndExpressionAccess().getEqualExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_rule__AndExpression__Group__0__Impl5363);
            ruleEqualExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getEqualExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2694:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2698:1: ( rule__AndExpression__Group__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2699:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__15392);
            rule__AndExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2705:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2709:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2710:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2710:1: ( ( rule__AndExpression__Group_1__0 )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2711:1: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2712:1: ( rule__AndExpression__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==29) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2712:2: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl5419);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getAndExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2726:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2730:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2731:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__05454);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__05457);
            rule__AndExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0"


    // $ANTLR start "rule__AndExpression__Group_1__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2738:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2742:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2743:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2743:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2744:1: ()
            {
             before(grammarAccess.getAndExpressionAccess().getAndLeftAction_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2745:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2747:1: 
            {
            }

             after(grammarAccess.getAndExpressionAccess().getAndLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2757:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2761:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2762:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__15515);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__15518);
            rule__AndExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1"


    // $ANTLR start "rule__AndExpression__Group_1__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2769:1: rule__AndExpression__Group_1__1__Impl : ( '&' ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2773:1: ( ( '&' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2774:1: ( '&' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2774:1: ( '&' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2775:1: '&'
            {
             before(grammarAccess.getAndExpressionAccess().getAmpersandKeyword_1_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__AndExpression__Group_1__1__Impl5546); 
             after(grammarAccess.getAndExpressionAccess().getAmpersandKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2788:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2792:1: ( rule__AndExpression__Group_1__2__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2793:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__25577);
            rule__AndExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__2"


    // $ANTLR start "rule__AndExpression__Group_1__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2799:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__RightAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2803:1: ( ( ( rule__AndExpression__RightAssignment_1_2 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2804:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2804:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2805:1: ( rule__AndExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2806:1: ( rule__AndExpression__RightAssignment_1_2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2806:2: rule__AndExpression__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AndExpression__RightAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl5604);
            rule__AndExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__EqualExpression__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2822:1: rule__EqualExpression__Group__0 : rule__EqualExpression__Group__0__Impl rule__EqualExpression__Group__1 ;
    public final void rule__EqualExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2826:1: ( rule__EqualExpression__Group__0__Impl rule__EqualExpression__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2827:2: rule__EqualExpression__Group__0__Impl rule__EqualExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group__0__Impl_in_rule__EqualExpression__Group__05640);
            rule__EqualExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group__1_in_rule__EqualExpression__Group__05643);
            rule__EqualExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group__0"


    // $ANTLR start "rule__EqualExpression__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2834:1: rule__EqualExpression__Group__0__Impl : ( ruleComparisonExpression ) ;
    public final void rule__EqualExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2838:1: ( ( ruleComparisonExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2839:1: ( ruleComparisonExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2839:1: ( ruleComparisonExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2840:1: ruleComparisonExpression
            {
             before(grammarAccess.getEqualExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_rule__EqualExpression__Group__0__Impl5670);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getEqualExpressionAccess().getComparisonExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group__0__Impl"


    // $ANTLR start "rule__EqualExpression__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2851:1: rule__EqualExpression__Group__1 : rule__EqualExpression__Group__1__Impl ;
    public final void rule__EqualExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2855:1: ( rule__EqualExpression__Group__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2856:2: rule__EqualExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group__1__Impl_in_rule__EqualExpression__Group__15699);
            rule__EqualExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group__1"


    // $ANTLR start "rule__EqualExpression__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2862:1: rule__EqualExpression__Group__1__Impl : ( ( rule__EqualExpression__Group_1__0 )* ) ;
    public final void rule__EqualExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2866:1: ( ( ( rule__EqualExpression__Group_1__0 )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2867:1: ( ( rule__EqualExpression__Group_1__0 )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2867:1: ( ( rule__EqualExpression__Group_1__0 )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2868:1: ( rule__EqualExpression__Group_1__0 )*
            {
             before(grammarAccess.getEqualExpressionAccess().getGroup_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2869:1: ( rule__EqualExpression__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2869:2: rule__EqualExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group_1__0_in_rule__EqualExpression__Group__1__Impl5726);
            	    rule__EqualExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getEqualExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group__1__Impl"


    // $ANTLR start "rule__EqualExpression__Group_1__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2883:1: rule__EqualExpression__Group_1__0 : rule__EqualExpression__Group_1__0__Impl rule__EqualExpression__Group_1__1 ;
    public final void rule__EqualExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2887:1: ( rule__EqualExpression__Group_1__0__Impl rule__EqualExpression__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2888:2: rule__EqualExpression__Group_1__0__Impl rule__EqualExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group_1__0__Impl_in_rule__EqualExpression__Group_1__05761);
            rule__EqualExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group_1__1_in_rule__EqualExpression__Group_1__05764);
            rule__EqualExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group_1__0"


    // $ANTLR start "rule__EqualExpression__Group_1__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2895:1: rule__EqualExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__EqualExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2899:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2900:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2900:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2901:1: ()
            {
             before(grammarAccess.getEqualExpressionAccess().getEqualLeftAction_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2902:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2904:1: 
            {
            }

             after(grammarAccess.getEqualExpressionAccess().getEqualLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group_1__0__Impl"


    // $ANTLR start "rule__EqualExpression__Group_1__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2914:1: rule__EqualExpression__Group_1__1 : rule__EqualExpression__Group_1__1__Impl rule__EqualExpression__Group_1__2 ;
    public final void rule__EqualExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2918:1: ( rule__EqualExpression__Group_1__1__Impl rule__EqualExpression__Group_1__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2919:2: rule__EqualExpression__Group_1__1__Impl rule__EqualExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group_1__1__Impl_in_rule__EqualExpression__Group_1__15822);
            rule__EqualExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group_1__2_in_rule__EqualExpression__Group_1__15825);
            rule__EqualExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group_1__1"


    // $ANTLR start "rule__EqualExpression__Group_1__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2926:1: rule__EqualExpression__Group_1__1__Impl : ( '==' ) ;
    public final void rule__EqualExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2930:1: ( ( '==' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2931:1: ( '==' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2931:1: ( '==' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2932:1: '=='
            {
             before(grammarAccess.getEqualExpressionAccess().getEqualsSignEqualsSignKeyword_1_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__EqualExpression__Group_1__1__Impl5853); 
             after(grammarAccess.getEqualExpressionAccess().getEqualsSignEqualsSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group_1__1__Impl"


    // $ANTLR start "rule__EqualExpression__Group_1__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2945:1: rule__EqualExpression__Group_1__2 : rule__EqualExpression__Group_1__2__Impl ;
    public final void rule__EqualExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2949:1: ( rule__EqualExpression__Group_1__2__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2950:2: rule__EqualExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__Group_1__2__Impl_in_rule__EqualExpression__Group_1__25884);
            rule__EqualExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group_1__2"


    // $ANTLR start "rule__EqualExpression__Group_1__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2956:1: rule__EqualExpression__Group_1__2__Impl : ( ( rule__EqualExpression__RightAssignment_1_2 ) ) ;
    public final void rule__EqualExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2960:1: ( ( ( rule__EqualExpression__RightAssignment_1_2 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2961:1: ( ( rule__EqualExpression__RightAssignment_1_2 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2961:1: ( ( rule__EqualExpression__RightAssignment_1_2 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2962:1: ( rule__EqualExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualExpressionAccess().getRightAssignment_1_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2963:1: ( rule__EqualExpression__RightAssignment_1_2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2963:2: rule__EqualExpression__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EqualExpression__RightAssignment_1_2_in_rule__EqualExpression__Group_1__2__Impl5911);
            rule__EqualExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2979:1: rule__ComparisonExpression__Group__0 : rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 ;
    public final void rule__ComparisonExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2983:1: ( rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2984:2: rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group__0__Impl_in_rule__ComparisonExpression__Group__05947);
            rule__ComparisonExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group__1_in_rule__ComparisonExpression__Group__05950);
            rule__ComparisonExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__0"


    // $ANTLR start "rule__ComparisonExpression__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2991:1: rule__ComparisonExpression__Group__0__Impl : ( ruleAddExpression ) ;
    public final void rule__ComparisonExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2995:1: ( ( ruleAddExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2996:1: ( ruleAddExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2996:1: ( ruleAddExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:2997:1: ruleAddExpression
            {
             before(grammarAccess.getComparisonExpressionAccess().getAddExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_rule__ComparisonExpression__Group__0__Impl5977);
            ruleAddExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getAddExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3008:1: rule__ComparisonExpression__Group__1 : rule__ComparisonExpression__Group__1__Impl ;
    public final void rule__ComparisonExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3012:1: ( rule__ComparisonExpression__Group__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3013:2: rule__ComparisonExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group__1__Impl_in_rule__ComparisonExpression__Group__16006);
            rule__ComparisonExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__1"


    // $ANTLR start "rule__ComparisonExpression__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3019:1: rule__ComparisonExpression__Group__1__Impl : ( ( rule__ComparisonExpression__Group_1__0 )* ) ;
    public final void rule__ComparisonExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3023:1: ( ( ( rule__ComparisonExpression__Group_1__0 )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3024:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3024:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3025:1: ( rule__ComparisonExpression__Group_1__0 )*
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3026:1: ( rule__ComparisonExpression__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=31 && LA18_0<=32)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3026:2: rule__ComparisonExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1__0_in_rule__ComparisonExpression__Group__1__Impl6033);
            	    rule__ComparisonExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3040:1: rule__ComparisonExpression__Group_1__0 : rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 ;
    public final void rule__ComparisonExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3044:1: ( rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3045:2: rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1__0__Impl_in_rule__ComparisonExpression__Group_1__06068);
            rule__ComparisonExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1__1_in_rule__ComparisonExpression__Group_1__06071);
            rule__ComparisonExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__0"


    // $ANTLR start "rule__ComparisonExpression__Group_1__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3052:1: rule__ComparisonExpression__Group_1__0__Impl : ( ( rule__ComparisonExpression__Alternatives_1_0 ) ) ;
    public final void rule__ComparisonExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3056:1: ( ( ( rule__ComparisonExpression__Alternatives_1_0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3057:1: ( ( rule__ComparisonExpression__Alternatives_1_0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3057:1: ( ( rule__ComparisonExpression__Alternatives_1_0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3058:1: ( rule__ComparisonExpression__Alternatives_1_0 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getAlternatives_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3059:1: ( rule__ComparisonExpression__Alternatives_1_0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3059:2: rule__ComparisonExpression__Alternatives_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Alternatives_1_0_in_rule__ComparisonExpression__Group_1__0__Impl6098);
            rule__ComparisonExpression__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3069:1: rule__ComparisonExpression__Group_1__1 : rule__ComparisonExpression__Group_1__1__Impl ;
    public final void rule__ComparisonExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3073:1: ( rule__ComparisonExpression__Group_1__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3074:2: rule__ComparisonExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1__1__Impl_in_rule__ComparisonExpression__Group_1__16128);
            rule__ComparisonExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__1"


    // $ANTLR start "rule__ComparisonExpression__Group_1__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3080:1: rule__ComparisonExpression__Group_1__1__Impl : ( ( rule__ComparisonExpression__RightAssignment_1_1 ) ) ;
    public final void rule__ComparisonExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3084:1: ( ( ( rule__ComparisonExpression__RightAssignment_1_1 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3085:1: ( ( rule__ComparisonExpression__RightAssignment_1_1 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3085:1: ( ( rule__ComparisonExpression__RightAssignment_1_1 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3086:1: ( rule__ComparisonExpression__RightAssignment_1_1 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightAssignment_1_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3087:1: ( rule__ComparisonExpression__RightAssignment_1_1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3087:2: rule__ComparisonExpression__RightAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__RightAssignment_1_1_in_rule__ComparisonExpression__Group_1__1__Impl6155);
            rule__ComparisonExpression__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1_0_0__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3101:1: rule__ComparisonExpression__Group_1_0_0__0 : rule__ComparisonExpression__Group_1_0_0__0__Impl rule__ComparisonExpression__Group_1_0_0__1 ;
    public final void rule__ComparisonExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3105:1: ( rule__ComparisonExpression__Group_1_0_0__0__Impl rule__ComparisonExpression__Group_1_0_0__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3106:2: rule__ComparisonExpression__Group_1_0_0__0__Impl rule__ComparisonExpression__Group_1_0_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_0__0__Impl_in_rule__ComparisonExpression__Group_1_0_0__06189);
            rule__ComparisonExpression__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_0__1_in_rule__ComparisonExpression__Group_1_0_0__06192);
            rule__ComparisonExpression__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1_0_0__0"


    // $ANTLR start "rule__ComparisonExpression__Group_1_0_0__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3113:1: rule__ComparisonExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__ComparisonExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3117:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3118:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3118:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3119:1: ()
            {
             before(grammarAccess.getComparisonExpressionAccess().getGreaterLeftAction_1_0_0_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3120:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3122:1: 
            {
            }

             after(grammarAccess.getComparisonExpressionAccess().getGreaterLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1_0_0__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3132:1: rule__ComparisonExpression__Group_1_0_0__1 : rule__ComparisonExpression__Group_1_0_0__1__Impl ;
    public final void rule__ComparisonExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3136:1: ( rule__ComparisonExpression__Group_1_0_0__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3137:2: rule__ComparisonExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_0__1__Impl_in_rule__ComparisonExpression__Group_1_0_0__16250);
            rule__ComparisonExpression__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1_0_0__1"


    // $ANTLR start "rule__ComparisonExpression__Group_1_0_0__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3143:1: rule__ComparisonExpression__Group_1_0_0__1__Impl : ( '>' ) ;
    public final void rule__ComparisonExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3147:1: ( ( '>' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3148:1: ( '>' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3148:1: ( '>' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3149:1: '>'
            {
             before(grammarAccess.getComparisonExpressionAccess().getGreaterThanSignKeyword_1_0_0_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__ComparisonExpression__Group_1_0_0__1__Impl6278); 
             after(grammarAccess.getComparisonExpressionAccess().getGreaterThanSignKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1_0_1__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3166:1: rule__ComparisonExpression__Group_1_0_1__0 : rule__ComparisonExpression__Group_1_0_1__0__Impl rule__ComparisonExpression__Group_1_0_1__1 ;
    public final void rule__ComparisonExpression__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3170:1: ( rule__ComparisonExpression__Group_1_0_1__0__Impl rule__ComparisonExpression__Group_1_0_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3171:2: rule__ComparisonExpression__Group_1_0_1__0__Impl rule__ComparisonExpression__Group_1_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_1__0__Impl_in_rule__ComparisonExpression__Group_1_0_1__06313);
            rule__ComparisonExpression__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_1__1_in_rule__ComparisonExpression__Group_1_0_1__06316);
            rule__ComparisonExpression__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1_0_1__0"


    // $ANTLR start "rule__ComparisonExpression__Group_1_0_1__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3178:1: rule__ComparisonExpression__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__ComparisonExpression__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3182:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3183:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3183:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3184:1: ()
            {
             before(grammarAccess.getComparisonExpressionAccess().getLowerLeftAction_1_0_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3185:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3187:1: 
            {
            }

             after(grammarAccess.getComparisonExpressionAccess().getLowerLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1_0_1__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3197:1: rule__ComparisonExpression__Group_1_0_1__1 : rule__ComparisonExpression__Group_1_0_1__1__Impl ;
    public final void rule__ComparisonExpression__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3201:1: ( rule__ComparisonExpression__Group_1_0_1__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3202:2: rule__ComparisonExpression__Group_1_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ComparisonExpression__Group_1_0_1__1__Impl_in_rule__ComparisonExpression__Group_1_0_1__16374);
            rule__ComparisonExpression__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1_0_1__1"


    // $ANTLR start "rule__ComparisonExpression__Group_1_0_1__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3208:1: rule__ComparisonExpression__Group_1_0_1__1__Impl : ( '<' ) ;
    public final void rule__ComparisonExpression__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3212:1: ( ( '<' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3213:1: ( '<' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3213:1: ( '<' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3214:1: '<'
            {
             before(grammarAccess.getComparisonExpressionAccess().getLessThanSignKeyword_1_0_1_1()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__ComparisonExpression__Group_1_0_1__1__Impl6402); 
             after(grammarAccess.getComparisonExpressionAccess().getLessThanSignKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__AddExpression__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3231:1: rule__AddExpression__Group__0 : rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 ;
    public final void rule__AddExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3235:1: ( rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3236:2: rule__AddExpression__Group__0__Impl rule__AddExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__06437);
            rule__AddExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__06440);
            rule__AddExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group__0"


    // $ANTLR start "rule__AddExpression__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3243:1: rule__AddExpression__Group__0__Impl : ( ruleMultExpression ) ;
    public final void rule__AddExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3247:1: ( ( ruleMultExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3248:1: ( ruleMultExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3248:1: ( ruleMultExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3249:1: ruleMultExpression
            {
             before(grammarAccess.getAddExpressionAccess().getMultExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_rule__AddExpression__Group__0__Impl6467);
            ruleMultExpression();

            state._fsp--;

             after(grammarAccess.getAddExpressionAccess().getMultExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group__0__Impl"


    // $ANTLR start "rule__AddExpression__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3260:1: rule__AddExpression__Group__1 : rule__AddExpression__Group__1__Impl ;
    public final void rule__AddExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3264:1: ( rule__AddExpression__Group__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3265:2: rule__AddExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__16496);
            rule__AddExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group__1"


    // $ANTLR start "rule__AddExpression__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3271:1: rule__AddExpression__Group__1__Impl : ( ( rule__AddExpression__Group_1__0 )* ) ;
    public final void rule__AddExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3275:1: ( ( ( rule__AddExpression__Group_1__0 )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3276:1: ( ( rule__AddExpression__Group_1__0 )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3276:1: ( ( rule__AddExpression__Group_1__0 )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3277:1: ( rule__AddExpression__Group_1__0 )*
            {
             before(grammarAccess.getAddExpressionAccess().getGroup_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3278:1: ( rule__AddExpression__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=33 && LA19_0<=34)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3278:2: rule__AddExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl6523);
            	    rule__AddExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getAddExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group__1__Impl"


    // $ANTLR start "rule__AddExpression__Group_1__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3292:1: rule__AddExpression__Group_1__0 : rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 ;
    public final void rule__AddExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3296:1: ( rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3297:2: rule__AddExpression__Group_1__0__Impl rule__AddExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__06558);
            rule__AddExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__06561);
            rule__AddExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1__0"


    // $ANTLR start "rule__AddExpression__Group_1__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3304:1: rule__AddExpression__Group_1__0__Impl : ( ( rule__AddExpression__Alternatives_1_0 ) ) ;
    public final void rule__AddExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3308:1: ( ( ( rule__AddExpression__Alternatives_1_0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3309:1: ( ( rule__AddExpression__Alternatives_1_0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3309:1: ( ( rule__AddExpression__Alternatives_1_0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3310:1: ( rule__AddExpression__Alternatives_1_0 )
            {
             before(grammarAccess.getAddExpressionAccess().getAlternatives_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3311:1: ( rule__AddExpression__Alternatives_1_0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3311:2: rule__AddExpression__Alternatives_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Alternatives_1_0_in_rule__AddExpression__Group_1__0__Impl6588);
            rule__AddExpression__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAddExpressionAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AddExpression__Group_1__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3321:1: rule__AddExpression__Group_1__1 : rule__AddExpression__Group_1__1__Impl ;
    public final void rule__AddExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3325:1: ( rule__AddExpression__Group_1__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3326:2: rule__AddExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__16618);
            rule__AddExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1__1"


    // $ANTLR start "rule__AddExpression__Group_1__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3332:1: rule__AddExpression__Group_1__1__Impl : ( ( rule__AddExpression__RightAssignment_1_1 ) ) ;
    public final void rule__AddExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3336:1: ( ( ( rule__AddExpression__RightAssignment_1_1 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3337:1: ( ( rule__AddExpression__RightAssignment_1_1 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3337:1: ( ( rule__AddExpression__RightAssignment_1_1 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3338:1: ( rule__AddExpression__RightAssignment_1_1 )
            {
             before(grammarAccess.getAddExpressionAccess().getRightAssignment_1_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3339:1: ( rule__AddExpression__RightAssignment_1_1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3339:2: rule__AddExpression__RightAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__RightAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl6645);
            rule__AddExpression__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAddExpressionAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AddExpression__Group_1_0_0__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3353:1: rule__AddExpression__Group_1_0_0__0 : rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1 ;
    public final void rule__AddExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3357:1: ( rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3358:2: rule__AddExpression__Group_1_0_0__0__Impl rule__AddExpression__Group_1_0_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_0__0__Impl_in_rule__AddExpression__Group_1_0_0__06679);
            rule__AddExpression__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_0__1_in_rule__AddExpression__Group_1_0_0__06682);
            rule__AddExpression__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_0_0__0"


    // $ANTLR start "rule__AddExpression__Group_1_0_0__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3365:1: rule__AddExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3369:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3370:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3370:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3371:1: ()
            {
             before(grammarAccess.getAddExpressionAccess().getAddLeftAction_1_0_0_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3372:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3374:1: 
            {
            }

             after(grammarAccess.getAddExpressionAccess().getAddLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__AddExpression__Group_1_0_0__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3384:1: rule__AddExpression__Group_1_0_0__1 : rule__AddExpression__Group_1_0_0__1__Impl ;
    public final void rule__AddExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3388:1: ( rule__AddExpression__Group_1_0_0__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3389:2: rule__AddExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_0__1__Impl_in_rule__AddExpression__Group_1_0_0__16740);
            rule__AddExpression__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_0_0__1"


    // $ANTLR start "rule__AddExpression__Group_1_0_0__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3395:1: rule__AddExpression__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__AddExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3399:1: ( ( '+' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3400:1: ( '+' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3400:1: ( '+' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3401:1: '+'
            {
             before(grammarAccess.getAddExpressionAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__AddExpression__Group_1_0_0__1__Impl6768); 
             after(grammarAccess.getAddExpressionAccess().getPlusSignKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__AddExpression__Group_1_0_1__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3418:1: rule__AddExpression__Group_1_0_1__0 : rule__AddExpression__Group_1_0_1__0__Impl rule__AddExpression__Group_1_0_1__1 ;
    public final void rule__AddExpression__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3422:1: ( rule__AddExpression__Group_1_0_1__0__Impl rule__AddExpression__Group_1_0_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3423:2: rule__AddExpression__Group_1_0_1__0__Impl rule__AddExpression__Group_1_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_1__0__Impl_in_rule__AddExpression__Group_1_0_1__06803);
            rule__AddExpression__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_1__1_in_rule__AddExpression__Group_1_0_1__06806);
            rule__AddExpression__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_0_1__0"


    // $ANTLR start "rule__AddExpression__Group_1_0_1__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3430:1: rule__AddExpression__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__AddExpression__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3434:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3435:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3435:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3436:1: ()
            {
             before(grammarAccess.getAddExpressionAccess().getMinusLeftAction_1_0_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3437:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3439:1: 
            {
            }

             after(grammarAccess.getAddExpressionAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__AddExpression__Group_1_0_1__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3449:1: rule__AddExpression__Group_1_0_1__1 : rule__AddExpression__Group_1_0_1__1__Impl ;
    public final void rule__AddExpression__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3453:1: ( rule__AddExpression__Group_1_0_1__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3454:2: rule__AddExpression__Group_1_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AddExpression__Group_1_0_1__1__Impl_in_rule__AddExpression__Group_1_0_1__16864);
            rule__AddExpression__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_0_1__1"


    // $ANTLR start "rule__AddExpression__Group_1_0_1__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3460:1: rule__AddExpression__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__AddExpression__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3464:1: ( ( '-' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3465:1: ( '-' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3465:1: ( '-' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3466:1: '-'
            {
             before(grammarAccess.getAddExpressionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__AddExpression__Group_1_0_1__1__Impl6892); 
             after(grammarAccess.getAddExpressionAccess().getHyphenMinusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__MultExpression__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3483:1: rule__MultExpression__Group__0 : rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 ;
    public final void rule__MultExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3487:1: ( rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3488:2: rule__MultExpression__Group__0__Impl rule__MultExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__06927);
            rule__MultExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__06930);
            rule__MultExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group__0"


    // $ANTLR start "rule__MultExpression__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3495:1: rule__MultExpression__Group__0__Impl : ( ruleUnaryExpression ) ;
    public final void rule__MultExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3499:1: ( ( ruleUnaryExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3500:1: ( ruleUnaryExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3500:1: ( ruleUnaryExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3501:1: ruleUnaryExpression
            {
             before(grammarAccess.getMultExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_rule__MultExpression__Group__0__Impl6957);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getMultExpressionAccess().getUnaryExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group__0__Impl"


    // $ANTLR start "rule__MultExpression__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3512:1: rule__MultExpression__Group__1 : rule__MultExpression__Group__1__Impl ;
    public final void rule__MultExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3516:1: ( rule__MultExpression__Group__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3517:2: rule__MultExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__16986);
            rule__MultExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group__1"


    // $ANTLR start "rule__MultExpression__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3523:1: rule__MultExpression__Group__1__Impl : ( ( rule__MultExpression__Group_1__0 )* ) ;
    public final void rule__MultExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3527:1: ( ( ( rule__MultExpression__Group_1__0 )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3528:1: ( ( rule__MultExpression__Group_1__0 )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3528:1: ( ( rule__MultExpression__Group_1__0 )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3529:1: ( rule__MultExpression__Group_1__0 )*
            {
             before(grammarAccess.getMultExpressionAccess().getGroup_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3530:1: ( rule__MultExpression__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=35 && LA20_0<=37)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3530:2: rule__MultExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl7013);
            	    rule__MultExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getMultExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group__1__Impl"


    // $ANTLR start "rule__MultExpression__Group_1__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3544:1: rule__MultExpression__Group_1__0 : rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 ;
    public final void rule__MultExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3548:1: ( rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3549:2: rule__MultExpression__Group_1__0__Impl rule__MultExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__07048);
            rule__MultExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__07051);
            rule__MultExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1__0"


    // $ANTLR start "rule__MultExpression__Group_1__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3556:1: rule__MultExpression__Group_1__0__Impl : ( ( rule__MultExpression__Alternatives_1_0 ) ) ;
    public final void rule__MultExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3560:1: ( ( ( rule__MultExpression__Alternatives_1_0 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3561:1: ( ( rule__MultExpression__Alternatives_1_0 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3561:1: ( ( rule__MultExpression__Alternatives_1_0 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3562:1: ( rule__MultExpression__Alternatives_1_0 )
            {
             before(grammarAccess.getMultExpressionAccess().getAlternatives_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3563:1: ( rule__MultExpression__Alternatives_1_0 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3563:2: rule__MultExpression__Alternatives_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Alternatives_1_0_in_rule__MultExpression__Group_1__0__Impl7078);
            rule__MultExpression__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultExpressionAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1__0__Impl"


    // $ANTLR start "rule__MultExpression__Group_1__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3573:1: rule__MultExpression__Group_1__1 : rule__MultExpression__Group_1__1__Impl ;
    public final void rule__MultExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3577:1: ( rule__MultExpression__Group_1__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3578:2: rule__MultExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__17108);
            rule__MultExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1__1"


    // $ANTLR start "rule__MultExpression__Group_1__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3584:1: rule__MultExpression__Group_1__1__Impl : ( ( rule__MultExpression__RightAssignment_1_1 ) ) ;
    public final void rule__MultExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3588:1: ( ( ( rule__MultExpression__RightAssignment_1_1 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3589:1: ( ( rule__MultExpression__RightAssignment_1_1 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3589:1: ( ( rule__MultExpression__RightAssignment_1_1 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3590:1: ( rule__MultExpression__RightAssignment_1_1 )
            {
             before(grammarAccess.getMultExpressionAccess().getRightAssignment_1_1()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3591:1: ( rule__MultExpression__RightAssignment_1_1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3591:2: rule__MultExpression__RightAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__RightAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl7135);
            rule__MultExpression__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultExpressionAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1__1__Impl"


    // $ANTLR start "rule__MultExpression__Group_1_0_0__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3605:1: rule__MultExpression__Group_1_0_0__0 : rule__MultExpression__Group_1_0_0__0__Impl rule__MultExpression__Group_1_0_0__1 ;
    public final void rule__MultExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3609:1: ( rule__MultExpression__Group_1_0_0__0__Impl rule__MultExpression__Group_1_0_0__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3610:2: rule__MultExpression__Group_1_0_0__0__Impl rule__MultExpression__Group_1_0_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_0__0__Impl_in_rule__MultExpression__Group_1_0_0__07169);
            rule__MultExpression__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_0__1_in_rule__MultExpression__Group_1_0_0__07172);
            rule__MultExpression__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_0_0__0"


    // $ANTLR start "rule__MultExpression__Group_1_0_0__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3617:1: rule__MultExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3621:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3622:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3622:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3623:1: ()
            {
             before(grammarAccess.getMultExpressionAccess().getMultLeftAction_1_0_0_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3624:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3626:1: 
            {
            }

             after(grammarAccess.getMultExpressionAccess().getMultLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__MultExpression__Group_1_0_0__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3636:1: rule__MultExpression__Group_1_0_0__1 : rule__MultExpression__Group_1_0_0__1__Impl ;
    public final void rule__MultExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3640:1: ( rule__MultExpression__Group_1_0_0__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3641:2: rule__MultExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_0__1__Impl_in_rule__MultExpression__Group_1_0_0__17230);
            rule__MultExpression__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_0_0__1"


    // $ANTLR start "rule__MultExpression__Group_1_0_0__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3647:1: rule__MultExpression__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__MultExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3651:1: ( ( '*' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3652:1: ( '*' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3652:1: ( '*' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3653:1: '*'
            {
             before(grammarAccess.getMultExpressionAccess().getAsteriskKeyword_1_0_0_1()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__MultExpression__Group_1_0_0__1__Impl7258); 
             after(grammarAccess.getMultExpressionAccess().getAsteriskKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__MultExpression__Group_1_0_1__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3670:1: rule__MultExpression__Group_1_0_1__0 : rule__MultExpression__Group_1_0_1__0__Impl rule__MultExpression__Group_1_0_1__1 ;
    public final void rule__MultExpression__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3674:1: ( rule__MultExpression__Group_1_0_1__0__Impl rule__MultExpression__Group_1_0_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3675:2: rule__MultExpression__Group_1_0_1__0__Impl rule__MultExpression__Group_1_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_1__0__Impl_in_rule__MultExpression__Group_1_0_1__07293);
            rule__MultExpression__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_1__1_in_rule__MultExpression__Group_1_0_1__07296);
            rule__MultExpression__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_0_1__0"


    // $ANTLR start "rule__MultExpression__Group_1_0_1__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3682:1: rule__MultExpression__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3686:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3687:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3687:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3688:1: ()
            {
             before(grammarAccess.getMultExpressionAccess().getDivLeftAction_1_0_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3689:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3691:1: 
            {
            }

             after(grammarAccess.getMultExpressionAccess().getDivLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__MultExpression__Group_1_0_1__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3701:1: rule__MultExpression__Group_1_0_1__1 : rule__MultExpression__Group_1_0_1__1__Impl ;
    public final void rule__MultExpression__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3705:1: ( rule__MultExpression__Group_1_0_1__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3706:2: rule__MultExpression__Group_1_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_1__1__Impl_in_rule__MultExpression__Group_1_0_1__17354);
            rule__MultExpression__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_0_1__1"


    // $ANTLR start "rule__MultExpression__Group_1_0_1__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3712:1: rule__MultExpression__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__MultExpression__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3716:1: ( ( '/' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3717:1: ( '/' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3717:1: ( '/' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3718:1: '/'
            {
             before(grammarAccess.getMultExpressionAccess().getSolidusKeyword_1_0_1_1()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__MultExpression__Group_1_0_1__1__Impl7382); 
             after(grammarAccess.getMultExpressionAccess().getSolidusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__MultExpression__Group_1_0_2__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3735:1: rule__MultExpression__Group_1_0_2__0 : rule__MultExpression__Group_1_0_2__0__Impl rule__MultExpression__Group_1_0_2__1 ;
    public final void rule__MultExpression__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3739:1: ( rule__MultExpression__Group_1_0_2__0__Impl rule__MultExpression__Group_1_0_2__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3740:2: rule__MultExpression__Group_1_0_2__0__Impl rule__MultExpression__Group_1_0_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_2__0__Impl_in_rule__MultExpression__Group_1_0_2__07417);
            rule__MultExpression__Group_1_0_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_2__1_in_rule__MultExpression__Group_1_0_2__07420);
            rule__MultExpression__Group_1_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_0_2__0"


    // $ANTLR start "rule__MultExpression__Group_1_0_2__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3747:1: rule__MultExpression__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__MultExpression__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3751:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3752:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3752:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3753:1: ()
            {
             before(grammarAccess.getMultExpressionAccess().getModLeftAction_1_0_2_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3754:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3756:1: 
            {
            }

             after(grammarAccess.getMultExpressionAccess().getModLeftAction_1_0_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_0_2__0__Impl"


    // $ANTLR start "rule__MultExpression__Group_1_0_2__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3766:1: rule__MultExpression__Group_1_0_2__1 : rule__MultExpression__Group_1_0_2__1__Impl ;
    public final void rule__MultExpression__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3770:1: ( rule__MultExpression__Group_1_0_2__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3771:2: rule__MultExpression__Group_1_0_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultExpression__Group_1_0_2__1__Impl_in_rule__MultExpression__Group_1_0_2__17478);
            rule__MultExpression__Group_1_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_0_2__1"


    // $ANTLR start "rule__MultExpression__Group_1_0_2__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3777:1: rule__MultExpression__Group_1_0_2__1__Impl : ( '%' ) ;
    public final void rule__MultExpression__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3781:1: ( ( '%' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3782:1: ( '%' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3782:1: ( '%' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3783:1: '%'
            {
             before(grammarAccess.getMultExpressionAccess().getPercentSignKeyword_1_0_2_1()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__MultExpression__Group_1_0_2__1__Impl7506); 
             after(grammarAccess.getMultExpressionAccess().getPercentSignKeyword_1_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__Group_1_0_2__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_1__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3800:1: rule__UnaryExpression__Group_1__0 : rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1 ;
    public final void rule__UnaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3804:1: ( rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3805:2: rule__UnaryExpression__Group_1__0__Impl rule__UnaryExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_1__0__Impl_in_rule__UnaryExpression__Group_1__07541);
            rule__UnaryExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_1__1_in_rule__UnaryExpression__Group_1__07544);
            rule__UnaryExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__0"


    // $ANTLR start "rule__UnaryExpression__Group_1__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3812:1: rule__UnaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3816:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3817:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3817:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3818:1: ()
            {
             before(grammarAccess.getUnaryExpressionAccess().getNotAction_1_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3819:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3821:1: 
            {
            }

             after(grammarAccess.getUnaryExpressionAccess().getNotAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__0__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_1__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3831:1: rule__UnaryExpression__Group_1__1 : rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2 ;
    public final void rule__UnaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3835:1: ( rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3836:2: rule__UnaryExpression__Group_1__1__Impl rule__UnaryExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_1__1__Impl_in_rule__UnaryExpression__Group_1__17602);
            rule__UnaryExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_1__2_in_rule__UnaryExpression__Group_1__17605);
            rule__UnaryExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__1"


    // $ANTLR start "rule__UnaryExpression__Group_1__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3843:1: rule__UnaryExpression__Group_1__1__Impl : ( '!' ) ;
    public final void rule__UnaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3847:1: ( ( '!' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3848:1: ( '!' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3848:1: ( '!' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3849:1: '!'
            {
             before(grammarAccess.getUnaryExpressionAccess().getExclamationMarkKeyword_1_1()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__UnaryExpression__Group_1__1__Impl7633); 
             after(grammarAccess.getUnaryExpressionAccess().getExclamationMarkKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_1__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3862:1: rule__UnaryExpression__Group_1__2 : rule__UnaryExpression__Group_1__2__Impl ;
    public final void rule__UnaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3866:1: ( rule__UnaryExpression__Group_1__2__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3867:2: rule__UnaryExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_1__2__Impl_in_rule__UnaryExpression__Group_1__27664);
            rule__UnaryExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__2"


    // $ANTLR start "rule__UnaryExpression__Group_1__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3873:1: rule__UnaryExpression__Group_1__2__Impl : ( ( rule__UnaryExpression__TargetAssignment_1_2 ) ) ;
    public final void rule__UnaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3877:1: ( ( ( rule__UnaryExpression__TargetAssignment_1_2 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3878:1: ( ( rule__UnaryExpression__TargetAssignment_1_2 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3878:1: ( ( rule__UnaryExpression__TargetAssignment_1_2 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3879:1: ( rule__UnaryExpression__TargetAssignment_1_2 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getTargetAssignment_1_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3880:1: ( rule__UnaryExpression__TargetAssignment_1_2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3880:2: rule__UnaryExpression__TargetAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__TargetAssignment_1_2_in_rule__UnaryExpression__Group_1__2__Impl7691);
            rule__UnaryExpression__TargetAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getTargetAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_1__2__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_2__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3896:1: rule__UnaryExpression__Group_2__0 : rule__UnaryExpression__Group_2__0__Impl rule__UnaryExpression__Group_2__1 ;
    public final void rule__UnaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3900:1: ( rule__UnaryExpression__Group_2__0__Impl rule__UnaryExpression__Group_2__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3901:2: rule__UnaryExpression__Group_2__0__Impl rule__UnaryExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_2__0__Impl_in_rule__UnaryExpression__Group_2__07727);
            rule__UnaryExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_2__1_in_rule__UnaryExpression__Group_2__07730);
            rule__UnaryExpression__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_2__0"


    // $ANTLR start "rule__UnaryExpression__Group_2__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3908:1: rule__UnaryExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__UnaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3912:1: ( ( () ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3913:1: ( () )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3913:1: ( () )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3914:1: ()
            {
             before(grammarAccess.getUnaryExpressionAccess().getUMinusAction_2_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3915:1: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3917:1: 
            {
            }

             after(grammarAccess.getUnaryExpressionAccess().getUMinusAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_2__0__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_2__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3927:1: rule__UnaryExpression__Group_2__1 : rule__UnaryExpression__Group_2__1__Impl rule__UnaryExpression__Group_2__2 ;
    public final void rule__UnaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3931:1: ( rule__UnaryExpression__Group_2__1__Impl rule__UnaryExpression__Group_2__2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3932:2: rule__UnaryExpression__Group_2__1__Impl rule__UnaryExpression__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_2__1__Impl_in_rule__UnaryExpression__Group_2__17788);
            rule__UnaryExpression__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_2__2_in_rule__UnaryExpression__Group_2__17791);
            rule__UnaryExpression__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_2__1"


    // $ANTLR start "rule__UnaryExpression__Group_2__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3939:1: rule__UnaryExpression__Group_2__1__Impl : ( '-' ) ;
    public final void rule__UnaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3943:1: ( ( '-' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3944:1: ( '-' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3944:1: ( '-' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3945:1: '-'
            {
             before(grammarAccess.getUnaryExpressionAccess().getHyphenMinusKeyword_2_1()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__UnaryExpression__Group_2__1__Impl7819); 
             after(grammarAccess.getUnaryExpressionAccess().getHyphenMinusKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_2__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_2__2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3958:1: rule__UnaryExpression__Group_2__2 : rule__UnaryExpression__Group_2__2__Impl ;
    public final void rule__UnaryExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3962:1: ( rule__UnaryExpression__Group_2__2__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3963:2: rule__UnaryExpression__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__Group_2__2__Impl_in_rule__UnaryExpression__Group_2__27850);
            rule__UnaryExpression__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_2__2"


    // $ANTLR start "rule__UnaryExpression__Group_2__2__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3969:1: rule__UnaryExpression__Group_2__2__Impl : ( ( rule__UnaryExpression__TargetAssignment_2_2 ) ) ;
    public final void rule__UnaryExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3973:1: ( ( ( rule__UnaryExpression__TargetAssignment_2_2 ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3974:1: ( ( rule__UnaryExpression__TargetAssignment_2_2 ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3974:1: ( ( rule__UnaryExpression__TargetAssignment_2_2 ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3975:1: ( rule__UnaryExpression__TargetAssignment_2_2 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getTargetAssignment_2_2()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3976:1: ( rule__UnaryExpression__TargetAssignment_2_2 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3976:2: rule__UnaryExpression__TargetAssignment_2_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryExpression__TargetAssignment_2_2_in_rule__UnaryExpression__Group_2__2__Impl7877);
            rule__UnaryExpression__TargetAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getTargetAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_2__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3992:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3996:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:3997:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__07913);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__07916);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4004:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4008:1: ( ( ( '-' )? ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4009:1: ( ( '-' )? )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4009:1: ( ( '-' )? )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4010:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4011:1: ( '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4012:2: '-'
                    {
                    match(input,34,FollowSets000.FOLLOW_34_in_rule__EInt__Group__0__Impl7945); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4023:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4027:1: ( rule__EInt__Group__1__Impl )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4028:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__17978);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4034:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4038:1: ( ( RULE_INT ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4039:1: ( RULE_INT )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4039:1: ( RULE_INT )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4040:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl8005); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__CellularAutomataInitialization__GeometryAssignment_1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4056:1: rule__CellularAutomataInitialization__GeometryAssignment_1 : ( ruleRegularGeometry ) ;
    public final void rule__CellularAutomataInitialization__GeometryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4060:1: ( ( ruleRegularGeometry ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4061:1: ( ruleRegularGeometry )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4061:1: ( ruleRegularGeometry )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4062:1: ruleRegularGeometry
            {
             before(grammarAccess.getCellularAutomataInitializationAccess().getGeometryRegularGeometryParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRegularGeometry_in_rule__CellularAutomataInitialization__GeometryAssignment_18043);
            ruleRegularGeometry();

            state._fsp--;

             after(grammarAccess.getCellularAutomataInitializationAccess().getGeometryRegularGeometryParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellularAutomataInitialization__GeometryAssignment_1"


    // $ANTLR start "rule__CellularAutomataInitialization__SeedRulesAssignment_2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4071:1: rule__CellularAutomataInitialization__SeedRulesAssignment_2 : ( ruleRule ) ;
    public final void rule__CellularAutomataInitialization__SeedRulesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4075:1: ( ( ruleRule ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4076:1: ( ruleRule )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4076:1: ( ruleRule )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4077:1: ruleRule
            {
             before(grammarAccess.getCellularAutomataInitializationAccess().getSeedRulesRuleParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_rule__CellularAutomataInitialization__SeedRulesAssignment_28074);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getCellularAutomataInitializationAccess().getSeedRulesRuleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellularAutomataInitialization__SeedRulesAssignment_2"


    // $ANTLR start "rule__CellularAutomataInitialization__SeedRulesAssignment_3"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4086:1: rule__CellularAutomataInitialization__SeedRulesAssignment_3 : ( ruleRule ) ;
    public final void rule__CellularAutomataInitialization__SeedRulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4090:1: ( ( ruleRule ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4091:1: ( ruleRule )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4091:1: ( ruleRule )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4092:1: ruleRule
            {
             before(grammarAccess.getCellularAutomataInitializationAccess().getSeedRulesRuleParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_rule__CellularAutomataInitialization__SeedRulesAssignment_38105);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getCellularAutomataInitializationAccess().getSeedRulesRuleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CellularAutomataInitialization__SeedRulesAssignment_3"


    // $ANTLR start "rule__Rule__FilterAssignment_1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4101:1: rule__Rule__FilterAssignment_1 : ( ruleCoordinateRanges ) ;
    public final void rule__Rule__FilterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4105:1: ( ( ruleCoordinateRanges ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4106:1: ( ruleCoordinateRanges )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4106:1: ( ruleCoordinateRanges )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4107:1: ruleCoordinateRanges
            {
             before(grammarAccess.getRuleAccess().getFilterCoordinateRangesParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCoordinateRanges_in_rule__Rule__FilterAssignment_18136);
            ruleCoordinateRanges();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getFilterCoordinateRangesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__FilterAssignment_1"


    // $ANTLR start "rule__Rule__EvaluatedValAssignment_4"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4116:1: rule__Rule__EvaluatedValAssignment_4 : ( ruleConditional ) ;
    public final void rule__Rule__EvaluatedValAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4120:1: ( ( ruleConditional ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4121:1: ( ruleConditional )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4121:1: ( ruleConditional )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4122:1: ruleConditional
            {
             before(grammarAccess.getRuleAccess().getEvaluatedValConditionalParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_rule__Rule__EvaluatedValAssignment_48167);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getEvaluatedValConditionalParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__EvaluatedValAssignment_4"


    // $ANTLR start "rule__CoordinateRanges__CoordinateRangesAssignment_1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4131:1: rule__CoordinateRanges__CoordinateRangesAssignment_1 : ( ruleCoordinateRange ) ;
    public final void rule__CoordinateRanges__CoordinateRangesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4135:1: ( ( ruleCoordinateRange ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4136:1: ( ruleCoordinateRange )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4136:1: ( ruleCoordinateRange )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4137:1: ruleCoordinateRange
            {
             before(grammarAccess.getCoordinateRangesAccess().getCoordinateRangesCoordinateRangeParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCoordinateRange_in_rule__CoordinateRanges__CoordinateRangesAssignment_18198);
            ruleCoordinateRange();

            state._fsp--;

             after(grammarAccess.getCoordinateRangesAccess().getCoordinateRangesCoordinateRangeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRanges__CoordinateRangesAssignment_1"


    // $ANTLR start "rule__CoordinateRanges__CoordinateRangesAssignment_2_1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4146:1: rule__CoordinateRanges__CoordinateRangesAssignment_2_1 : ( ruleCoordinateRange ) ;
    public final void rule__CoordinateRanges__CoordinateRangesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4150:1: ( ( ruleCoordinateRange ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4151:1: ( ruleCoordinateRange )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4151:1: ( ruleCoordinateRange )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4152:1: ruleCoordinateRange
            {
             before(grammarAccess.getCoordinateRangesAccess().getCoordinateRangesCoordinateRangeParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCoordinateRange_in_rule__CoordinateRanges__CoordinateRangesAssignment_2_18229);
            ruleCoordinateRange();

            state._fsp--;

             after(grammarAccess.getCoordinateRangesAccess().getCoordinateRangesCoordinateRangeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRanges__CoordinateRangesAssignment_2_1"


    // $ANTLR start "rule__CoordinateRange__DimensionRangesAssignment_1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4161:1: rule__CoordinateRange__DimensionRangesAssignment_1 : ( ruleDimensionRange ) ;
    public final void rule__CoordinateRange__DimensionRangesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4165:1: ( ( ruleDimensionRange ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4166:1: ( ruleDimensionRange )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4166:1: ( ruleDimensionRange )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4167:1: ruleDimensionRange
            {
             before(grammarAccess.getCoordinateRangeAccess().getDimensionRangesDimensionRangeParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDimensionRange_in_rule__CoordinateRange__DimensionRangesAssignment_18260);
            ruleDimensionRange();

            state._fsp--;

             after(grammarAccess.getCoordinateRangeAccess().getDimensionRangesDimensionRangeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__DimensionRangesAssignment_1"


    // $ANTLR start "rule__CoordinateRange__DimensionRangesAssignment_3"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4176:1: rule__CoordinateRange__DimensionRangesAssignment_3 : ( ruleDimensionRange ) ;
    public final void rule__CoordinateRange__DimensionRangesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4180:1: ( ( ruleDimensionRange ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4181:1: ( ruleDimensionRange )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4181:1: ( ruleDimensionRange )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4182:1: ruleDimensionRange
            {
             before(grammarAccess.getCoordinateRangeAccess().getDimensionRangesDimensionRangeParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDimensionRange_in_rule__CoordinateRange__DimensionRangesAssignment_38291);
            ruleDimensionRange();

            state._fsp--;

             after(grammarAccess.getCoordinateRangeAccess().getDimensionRangesDimensionRangeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinateRange__DimensionRangesAssignment_3"


    // $ANTLR start "rule__DimensionRange__LowerAssignment_0"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4191:1: rule__DimensionRange__LowerAssignment_0 : ( ruleEInt ) ;
    public final void rule__DimensionRange__LowerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4195:1: ( ( ruleEInt ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4196:1: ( ruleEInt )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4196:1: ( ruleEInt )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4197:1: ruleEInt
            {
             before(grammarAccess.getDimensionRangeAccess().getLowerEIntParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__DimensionRange__LowerAssignment_08322);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDimensionRangeAccess().getLowerEIntParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionRange__LowerAssignment_0"


    // $ANTLR start "rule__DimensionRange__UpperAssignment_1_1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4206:1: rule__DimensionRange__UpperAssignment_1_1 : ( ruleEInt ) ;
    public final void rule__DimensionRange__UpperAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4210:1: ( ( ruleEInt ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4211:1: ( ruleEInt )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4211:1: ( ruleEInt )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4212:1: ruleEInt
            {
             before(grammarAccess.getDimensionRangeAccess().getUpperEIntParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__DimensionRange__UpperAssignment_1_18353);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDimensionRangeAccess().getUpperEIntParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionRange__UpperAssignment_1_1"


    // $ANTLR start "rule__PositionLiteral__DimensionIndexAssignment_3"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4221:1: rule__PositionLiteral__DimensionIndexAssignment_3 : ( ruleEInt ) ;
    public final void rule__PositionLiteral__DimensionIndexAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4225:1: ( ( ruleEInt ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4226:1: ( ruleEInt )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4226:1: ( ruleEInt )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4227:1: ruleEInt
            {
             before(grammarAccess.getPositionLiteralAccess().getDimensionIndexEIntParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__PositionLiteral__DimensionIndexAssignment_38384);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPositionLiteralAccess().getDimensionIndexEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionLiteral__DimensionIndexAssignment_3"


    // $ANTLR start "rule__RegularGeometry__NeighborsAssignment_2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4236:1: rule__RegularGeometry__NeighborsAssignment_2 : ( ruleNeighborhood ) ;
    public final void rule__RegularGeometry__NeighborsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4240:1: ( ( ruleNeighborhood ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4241:1: ( ruleNeighborhood )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4241:1: ( ruleNeighborhood )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4242:1: ruleNeighborhood
            {
             before(grammarAccess.getRegularGeometryAccess().getNeighborsNeighborhoodEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNeighborhood_in_rule__RegularGeometry__NeighborsAssignment_28415);
            ruleNeighborhood();

            state._fsp--;

             after(grammarAccess.getRegularGeometryAccess().getNeighborsNeighborhoodEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__NeighborsAssignment_2"


    // $ANTLR start "rule__RegularGeometry__DimensionsAssignment_4"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4251:1: rule__RegularGeometry__DimensionsAssignment_4 : ( ruleDimension ) ;
    public final void rule__RegularGeometry__DimensionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4255:1: ( ( ruleDimension ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4256:1: ( ruleDimension )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4256:1: ( ruleDimension )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4257:1: ruleDimension
            {
             before(grammarAccess.getRegularGeometryAccess().getDimensionsDimensionParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDimension_in_rule__RegularGeometry__DimensionsAssignment_48446);
            ruleDimension();

            state._fsp--;

             after(grammarAccess.getRegularGeometryAccess().getDimensionsDimensionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__DimensionsAssignment_4"


    // $ANTLR start "rule__RegularGeometry__DimensionsAssignment_5_1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4266:1: rule__RegularGeometry__DimensionsAssignment_5_1 : ( ruleDimension ) ;
    public final void rule__RegularGeometry__DimensionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4270:1: ( ( ruleDimension ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4271:1: ( ruleDimension )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4271:1: ( ruleDimension )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4272:1: ruleDimension
            {
             before(grammarAccess.getRegularGeometryAccess().getDimensionsDimensionParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDimension_in_rule__RegularGeometry__DimensionsAssignment_5_18477);
            ruleDimension();

            state._fsp--;

             after(grammarAccess.getRegularGeometryAccess().getDimensionsDimensionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularGeometry__DimensionsAssignment_5_1"


    // $ANTLR start "rule__Dimension__ExtentAssignment_1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4281:1: rule__Dimension__ExtentAssignment_1 : ( ruleEInt ) ;
    public final void rule__Dimension__ExtentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4285:1: ( ( ruleEInt ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4286:1: ( ruleEInt )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4286:1: ( ruleEInt )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4287:1: ruleEInt
            {
             before(grammarAccess.getDimensionAccess().getExtentEIntParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Dimension__ExtentAssignment_18508);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDimensionAccess().getExtentEIntParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__ExtentAssignment_1"


    // $ANTLR start "rule__Dimension__IsCircularAssignment_2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4296:1: rule__Dimension__IsCircularAssignment_2 : ( ( 'circular' ) ) ;
    public final void rule__Dimension__IsCircularAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4300:1: ( ( ( 'circular' ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4301:1: ( ( 'circular' ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4301:1: ( ( 'circular' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4302:1: ( 'circular' )
            {
             before(grammarAccess.getDimensionAccess().getIsCircularCircularKeyword_2_0()); 
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4303:1: ( 'circular' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4304:1: 'circular'
            {
             before(grammarAccess.getDimensionAccess().getIsCircularCircularKeyword_2_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Dimension__IsCircularAssignment_28544); 
             after(grammarAccess.getDimensionAccess().getIsCircularCircularKeyword_2_0()); 

            }

             after(grammarAccess.getDimensionAccess().getIsCircularCircularKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__IsCircularAssignment_2"


    // $ANTLR start "rule__Conditional__ConditionAssignment_1_2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4319:1: rule__Conditional__ConditionAssignment_1_2 : ( ruleConditional ) ;
    public final void rule__Conditional__ConditionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4323:1: ( ( ruleConditional ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4324:1: ( ruleConditional )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4324:1: ( ruleConditional )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4325:1: ruleConditional
            {
             before(grammarAccess.getConditionalAccess().getConditionConditionalParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_rule__Conditional__ConditionAssignment_1_28583);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getConditionalAccess().getConditionConditionalParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__ConditionAssignment_1_2"


    // $ANTLR start "rule__Conditional__IfTrueExpressionAssignment_1_4"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4334:1: rule__Conditional__IfTrueExpressionAssignment_1_4 : ( ruleConditional ) ;
    public final void rule__Conditional__IfTrueExpressionAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4338:1: ( ( ruleConditional ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4339:1: ( ruleConditional )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4339:1: ( ruleConditional )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4340:1: ruleConditional
            {
             before(grammarAccess.getConditionalAccess().getIfTrueExpressionConditionalParserRuleCall_1_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_rule__Conditional__IfTrueExpressionAssignment_1_48614);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getConditionalAccess().getIfTrueExpressionConditionalParserRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__IfTrueExpressionAssignment_1_4"


    // $ANTLR start "rule__Conditional__IfFalseExpressionAssignment_1_8"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4349:1: rule__Conditional__IfFalseExpressionAssignment_1_8 : ( ruleConditional ) ;
    public final void rule__Conditional__IfFalseExpressionAssignment_1_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4353:1: ( ( ruleConditional ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4354:1: ( ruleConditional )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4354:1: ( ruleConditional )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4355:1: ruleConditional
            {
             before(grammarAccess.getConditionalAccess().getIfFalseExpressionConditionalParserRuleCall_1_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_rule__Conditional__IfFalseExpressionAssignment_1_88645);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getConditionalAccess().getIfFalseExpressionConditionalParserRuleCall_1_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__IfFalseExpressionAssignment_1_8"


    // $ANTLR start "rule__OrExpression__RightAssignment_1_2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4364:1: rule__OrExpression__RightAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4368:1: ( ( ruleAndExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4369:1: ( ruleAndExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4369:1: ( ruleAndExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4370:1: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_rule__OrExpression__RightAssignment_1_28676);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__RightAssignment_1_2"


    // $ANTLR start "rule__AndExpression__RightAssignment_1_2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4379:1: rule__AndExpression__RightAssignment_1_2 : ( ruleEqualExpression ) ;
    public final void rule__AndExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4383:1: ( ( ruleEqualExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4384:1: ( ruleEqualExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4384:1: ( ruleEqualExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4385:1: ruleEqualExpression
            {
             before(grammarAccess.getAndExpressionAccess().getRightEqualExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_rule__AndExpression__RightAssignment_1_28707);
            ruleEqualExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getRightEqualExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__RightAssignment_1_2"


    // $ANTLR start "rule__EqualExpression__RightAssignment_1_2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4394:1: rule__EqualExpression__RightAssignment_1_2 : ( ruleComparisonExpression ) ;
    public final void rule__EqualExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4398:1: ( ( ruleComparisonExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4399:1: ( ruleComparisonExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4399:1: ( ruleComparisonExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4400:1: ruleComparisonExpression
            {
             before(grammarAccess.getEqualExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_rule__EqualExpression__RightAssignment_1_28738);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getEqualExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualExpression__RightAssignment_1_2"


    // $ANTLR start "rule__ComparisonExpression__RightAssignment_1_1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4409:1: rule__ComparisonExpression__RightAssignment_1_1 : ( ruleAddExpression ) ;
    public final void rule__ComparisonExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4413:1: ( ( ruleAddExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4414:1: ( ruleAddExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4414:1: ( ruleAddExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4415:1: ruleAddExpression
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightAddExpressionParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_rule__ComparisonExpression__RightAssignment_1_18769);
            ruleAddExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getRightAddExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__RightAssignment_1_1"


    // $ANTLR start "rule__AddExpression__RightAssignment_1_1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4424:1: rule__AddExpression__RightAssignment_1_1 : ( ruleMultExpression ) ;
    public final void rule__AddExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4428:1: ( ( ruleMultExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4429:1: ( ruleMultExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4429:1: ( ruleMultExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4430:1: ruleMultExpression
            {
             before(grammarAccess.getAddExpressionAccess().getRightMultExpressionParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_rule__AddExpression__RightAssignment_1_18800);
            ruleMultExpression();

            state._fsp--;

             after(grammarAccess.getAddExpressionAccess().getRightMultExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddExpression__RightAssignment_1_1"


    // $ANTLR start "rule__MultExpression__RightAssignment_1_1"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4439:1: rule__MultExpression__RightAssignment_1_1 : ( ruleUnaryExpression ) ;
    public final void rule__MultExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4443:1: ( ( ruleUnaryExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4444:1: ( ruleUnaryExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4444:1: ( ruleUnaryExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4445:1: ruleUnaryExpression
            {
             before(grammarAccess.getMultExpressionAccess().getRightUnaryExpressionParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_rule__MultExpression__RightAssignment_1_18831);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getMultExpressionAccess().getRightUnaryExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultExpression__RightAssignment_1_1"


    // $ANTLR start "rule__UnaryExpression__TargetAssignment_1_2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4454:1: rule__UnaryExpression__TargetAssignment_1_2 : ( ruleLiteralsExpression ) ;
    public final void rule__UnaryExpression__TargetAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4458:1: ( ( ruleLiteralsExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4459:1: ( ruleLiteralsExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4459:1: ( ruleLiteralsExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4460:1: ruleLiteralsExpression
            {
             before(grammarAccess.getUnaryExpressionAccess().getTargetLiteralsExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_rule__UnaryExpression__TargetAssignment_1_28862);
            ruleLiteralsExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionAccess().getTargetLiteralsExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__TargetAssignment_1_2"


    // $ANTLR start "rule__UnaryExpression__TargetAssignment_2_2"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4469:1: rule__UnaryExpression__TargetAssignment_2_2 : ( ruleLiteralsExpression ) ;
    public final void rule__UnaryExpression__TargetAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4473:1: ( ( ruleLiteralsExpression ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4474:1: ( ruleLiteralsExpression )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4474:1: ( ruleLiteralsExpression )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4475:1: ruleLiteralsExpression
            {
             before(grammarAccess.getUnaryExpressionAccess().getTargetLiteralsExpressionParserRuleCall_2_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_rule__UnaryExpression__TargetAssignment_2_28893);
            ruleLiteralsExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionAccess().getTargetLiteralsExpressionParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__TargetAssignment_2_2"


    // $ANTLR start "rule__IntegerLiteral__ValAssignment"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4484:1: rule__IntegerLiteral__ValAssignment : ( ruleEInt ) ;
    public final void rule__IntegerLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4488:1: ( ( ruleEInt ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4489:1: ( ruleEInt )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4489:1: ( ruleEInt )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs.ui/src-gen/org/kermeta/language/sample/cellularautomata/rules/ui/contentassist/antlr/internal/InternalInit.g:4490:1: ruleEInt
            {
             before(grammarAccess.getIntegerLiteralAccess().getValEIntParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__IntegerLiteral__ValAssignment8924);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerLiteralAccess().getValEIntParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerLiteral__ValAssignment"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleCellularAutomataInitialization_in_entryRuleCellularAutomataInitialization61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCellularAutomataInitialization68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CellularAutomataInitialization__Group__0_in_ruleCellularAutomataInitialization94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRule_in_entryRuleRule121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRule128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCoordinateRanges_in_entryRuleCoordinateRanges181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCoordinateRanges188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CoordinateRanges__Group__0_in_ruleCoordinateRanges214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCoordinateRange_in_entryRuleCoordinateRange241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCoordinateRange248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CoordinateRange__Group__0_in_ruleCoordinateRange274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDimensionRange_in_entryRuleDimensionRange301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDimensionRange308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DimensionRange__Group__0_in_ruleDimensionRange334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_entryRuleLiteralsExpression361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralsExpression368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Alternatives_in_ruleLiteralsExpression394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePositionLiteral_in_entryRulePositionLiteral421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePositionLiteral428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PositionLiteral__Group__0_in_rulePositionLiteral454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRegularGeometry_in_entryRuleRegularGeometry481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRegularGeometry488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group__0_in_ruleRegularGeometry514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDimension_in_entryRuleDimension541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDimension548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dimension__Group__0_in_ruleDimension574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditional_in_entryRuleConditional601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConditional608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Alternatives_in_ruleConditional634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_entryRuleEqualExpression781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEqualExpression788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group__0_in_ruleEqualExpression814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparisonExpression848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group__0_in_ruleComparisonExpression874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression901 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__0_in_ruleAddExpression934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression961 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__0_in_ruleMultExpression994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression1021 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression1028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Alternatives_in_ruleUnaryExpression1054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral1081 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral1088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IntegerLiteral__ValAssignment_in_ruleIntegerLiteral1114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1141 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt1174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Neighborhood__Alternatives_in_ruleNeighborhood1211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Group_0__0_in_rule__LiteralsExpression__Alternatives1246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePositionLiteral_in_rule__LiteralsExpression__Alternatives1264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerLiteral_in_rule__LiteralsExpression__Alternatives1281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_rule__Conditional__Alternatives1313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__0_in_rule__Conditional__Alternatives1330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_0__0_in_rule__ComparisonExpression__Alternatives_1_01363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_1__0_in_rule__ComparisonExpression__Alternatives_1_01381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_0__0_in_rule__AddExpression__Alternatives_1_01414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_1__0_in_rule__AddExpression__Alternatives_1_01432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_0__0_in_rule__MultExpression__Alternatives_1_01465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_1__0_in_rule__MultExpression__Alternatives_1_01483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_2__0_in_rule__MultExpression__Alternatives_1_01501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_rule__UnaryExpression__Alternatives1534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__0_in_rule__UnaryExpression__Alternatives1551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__0_in_rule__UnaryExpression__Alternatives1569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Neighborhood__Alternatives1603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Neighborhood__Alternatives1624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CellularAutomataInitialization__Group__0__Impl_in_rule__CellularAutomataInitialization__Group__01657 = new BitSet(new long[]{0x0000000001002000L});
        public static final BitSet FOLLOW_rule__CellularAutomataInitialization__Group__1_in_rule__CellularAutomataInitialization__Group__01660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CellularAutomataInitialization__Group__1__Impl_in_rule__CellularAutomataInitialization__Group__11718 = new BitSet(new long[]{0x0000000001002000L});
        public static final BitSet FOLLOW_rule__CellularAutomataInitialization__Group__2_in_rule__CellularAutomataInitialization__Group__11721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CellularAutomataInitialization__GeometryAssignment_1_in_rule__CellularAutomataInitialization__Group__1__Impl1748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CellularAutomataInitialization__Group__2__Impl_in_rule__CellularAutomataInitialization__Group__21779 = new BitSet(new long[]{0x0000000001002000L});
        public static final BitSet FOLLOW_rule__CellularAutomataInitialization__Group__3_in_rule__CellularAutomataInitialization__Group__21782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CellularAutomataInitialization__SeedRulesAssignment_2_in_rule__CellularAutomataInitialization__Group__2__Impl1809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CellularAutomataInitialization__Group__3__Impl_in_rule__CellularAutomataInitialization__Group__31839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CellularAutomataInitialization__SeedRulesAssignment_3_in_rule__CellularAutomataInitialization__Group__3__Impl1866 = new BitSet(new long[]{0x0000000001002002L});
        public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__01905 = new BitSet(new long[]{0x0000000000044000L});
        public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__01908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Rule__Group__0__Impl1936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__11967 = new BitSet(new long[]{0x0000000000044000L});
        public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__11970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__FilterAssignment_1_in_rule__Rule__Group__1__Impl1997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__22028 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__22031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Rule__Group__2__Impl2059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32090 = new BitSet(new long[]{0x0000004404240010L});
        public static final BitSet FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__32093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Rule__Group__3__Impl2121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__42152 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__42155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__EvaluatedValAssignment_4_in_rule__Rule__Group__4__Impl2182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__52212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Rule__Group__5__Impl2240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CoordinateRanges__Group__0__Impl_in_rule__CoordinateRanges__Group__02283 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__CoordinateRanges__Group__1_in_rule__CoordinateRanges__Group__02286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CoordinateRanges__Group__1__Impl_in_rule__CoordinateRanges__Group__12344 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__CoordinateRanges__Group__2_in_rule__CoordinateRanges__Group__12347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CoordinateRanges__CoordinateRangesAssignment_1_in_rule__CoordinateRanges__Group__1__Impl2374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CoordinateRanges__Group__2__Impl_in_rule__CoordinateRanges__Group__22404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CoordinateRanges__Group_2__0_in_rule__CoordinateRanges__Group__2__Impl2431 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__CoordinateRanges__Group_2__0__Impl_in_rule__CoordinateRanges__Group_2__02468 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__CoordinateRanges__Group_2__1_in_rule__CoordinateRanges__Group_2__02471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__CoordinateRanges__Group_2__0__Impl2499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CoordinateRanges__Group_2__1__Impl_in_rule__CoordinateRanges__Group_2__12530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CoordinateRanges__CoordinateRangesAssignment_2_1_in_rule__CoordinateRanges__Group_2__1__Impl2557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CoordinateRange__Group__0__Impl_in_rule__CoordinateRange__Group__02591 = new BitSet(new long[]{0x0000000400240010L});
        public static final BitSet FOLLOW_rule__CoordinateRange__Group__1_in_rule__CoordinateRange__Group__02594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__CoordinateRange__Group__0__Impl2622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CoordinateRange__Group__1__Impl_in_rule__CoordinateRange__Group__12653 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__CoordinateRange__Group__2_in_rule__CoordinateRange__Group__12656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CoordinateRange__DimensionRangesAssignment_1_in_rule__CoordinateRange__Group__1__Impl2683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CoordinateRange__Group__2__Impl_in_rule__CoordinateRange__Group__22713 = new BitSet(new long[]{0x0000000400240010L});
        public static final BitSet FOLLOW_rule__CoordinateRange__Group__3_in_rule__CoordinateRange__Group__22716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__CoordinateRange__Group__2__Impl2744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CoordinateRange__Group__3__Impl_in_rule__CoordinateRange__Group__32775 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__CoordinateRange__Group__4_in_rule__CoordinateRange__Group__32778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CoordinateRange__DimensionRangesAssignment_3_in_rule__CoordinateRange__Group__3__Impl2805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CoordinateRange__Group__4__Impl_in_rule__CoordinateRange__Group__42835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__CoordinateRange__Group__4__Impl2863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DimensionRange__Group__0__Impl_in_rule__DimensionRange__Group__02904 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__DimensionRange__Group__1_in_rule__DimensionRange__Group__02907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DimensionRange__LowerAssignment_0_in_rule__DimensionRange__Group__0__Impl2934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DimensionRange__Group__1__Impl_in_rule__DimensionRange__Group__12964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DimensionRange__Group_1__0_in_rule__DimensionRange__Group__1__Impl2991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DimensionRange__Group_1__0__Impl_in_rule__DimensionRange__Group_1__03026 = new BitSet(new long[]{0x0000000400240010L});
        public static final BitSet FOLLOW_rule__DimensionRange__Group_1__1_in_rule__DimensionRange__Group_1__03029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__DimensionRange__Group_1__0__Impl3057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DimensionRange__Group_1__1__Impl_in_rule__DimensionRange__Group_1__13088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DimensionRange__UpperAssignment_1_1_in_rule__DimensionRange__Group_1__1__Impl3115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Group_0__0__Impl_in_rule__LiteralsExpression__Group_0__03149 = new BitSet(new long[]{0x0000004404240010L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Group_0__1_in_rule__LiteralsExpression__Group_0__03152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__LiteralsExpression__Group_0__0__Impl3180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Group_0__1__Impl_in_rule__LiteralsExpression__Group_0__13211 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Group_0__2_in_rule__LiteralsExpression__Group_0__13214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditional_in_rule__LiteralsExpression__Group_0__1__Impl3241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LiteralsExpression__Group_0__2__Impl_in_rule__LiteralsExpression__Group_0__23270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__LiteralsExpression__Group_0__2__Impl3298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PositionLiteral__Group__0__Impl_in_rule__PositionLiteral__Group__03335 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__PositionLiteral__Group__1_in_rule__PositionLiteral__Group__03338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PositionLiteral__Group__1__Impl_in_rule__PositionLiteral__Group__13396 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__PositionLiteral__Group__2_in_rule__PositionLiteral__Group__13399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__PositionLiteral__Group__1__Impl3427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PositionLiteral__Group__2__Impl_in_rule__PositionLiteral__Group__23458 = new BitSet(new long[]{0x0000000400240010L});
        public static final BitSet FOLLOW_rule__PositionLiteral__Group__3_in_rule__PositionLiteral__Group__23461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__PositionLiteral__Group__2__Impl3489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PositionLiteral__Group__3__Impl_in_rule__PositionLiteral__Group__33520 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__PositionLiteral__Group__4_in_rule__PositionLiteral__Group__33523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PositionLiteral__DimensionIndexAssignment_3_in_rule__PositionLiteral__Group__3__Impl3550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PositionLiteral__Group__4__Impl_in_rule__PositionLiteral__Group__43580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__PositionLiteral__Group__4__Impl3608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group__0__Impl_in_rule__RegularGeometry__Group__03649 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group__1_in_rule__RegularGeometry__Group__03652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group__1__Impl_in_rule__RegularGeometry__Group__13710 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group__2_in_rule__RegularGeometry__Group__13713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__RegularGeometry__Group__1__Impl3741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group__2__Impl_in_rule__RegularGeometry__Group__23772 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group__3_in_rule__RegularGeometry__Group__23775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegularGeometry__NeighborsAssignment_2_in_rule__RegularGeometry__Group__2__Impl3802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group__3__Impl_in_rule__RegularGeometry__Group__33832 = new BitSet(new long[]{0x0000000400240010L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group__4_in_rule__RegularGeometry__Group__33835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__RegularGeometry__Group__3__Impl3863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group__4__Impl_in_rule__RegularGeometry__Group__43894 = new BitSet(new long[]{0x0000000002010000L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group__5_in_rule__RegularGeometry__Group__43897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegularGeometry__DimensionsAssignment_4_in_rule__RegularGeometry__Group__4__Impl3924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group__5__Impl_in_rule__RegularGeometry__Group__53954 = new BitSet(new long[]{0x0000000002010000L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group__6_in_rule__RegularGeometry__Group__53957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group_5__0_in_rule__RegularGeometry__Group__5__Impl3984 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group__6__Impl_in_rule__RegularGeometry__Group__64015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__RegularGeometry__Group__6__Impl4043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group_5__0__Impl_in_rule__RegularGeometry__Group_5__04088 = new BitSet(new long[]{0x0000000400240010L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group_5__1_in_rule__RegularGeometry__Group_5__04091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__RegularGeometry__Group_5__0__Impl4119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegularGeometry__Group_5__1__Impl_in_rule__RegularGeometry__Group_5__14150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RegularGeometry__DimensionsAssignment_5_1_in_rule__RegularGeometry__Group_5__1__Impl4177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dimension__Group__0__Impl_in_rule__Dimension__Group__04211 = new BitSet(new long[]{0x0000000400240010L});
        public static final BitSet FOLLOW_rule__Dimension__Group__1_in_rule__Dimension__Group__04214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dimension__Group__1__Impl_in_rule__Dimension__Group__14272 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__Dimension__Group__2_in_rule__Dimension__Group__14275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dimension__ExtentAssignment_1_in_rule__Dimension__Group__1__Impl4302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dimension__Group__2__Impl_in_rule__Dimension__Group__24332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Dimension__IsCircularAssignment_2_in_rule__Dimension__Group__2__Impl4359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__0__Impl_in_rule__Conditional__Group_1__04396 = new BitSet(new long[]{0x0000004404240010L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__1_in_rule__Conditional__Group_1__04399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__1__Impl_in_rule__Conditional__Group_1__14457 = new BitSet(new long[]{0x0000004404240010L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__2_in_rule__Conditional__Group_1__14460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Conditional__Group_1__1__Impl4488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__2__Impl_in_rule__Conditional__Group_1__24519 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__3_in_rule__Conditional__Group_1__24522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__ConditionAssignment_1_2_in_rule__Conditional__Group_1__2__Impl4549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__3__Impl_in_rule__Conditional__Group_1__34579 = new BitSet(new long[]{0x0000004404240010L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__4_in_rule__Conditional__Group_1__34582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Conditional__Group_1__3__Impl4610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__4__Impl_in_rule__Conditional__Group_1__44641 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__5_in_rule__Conditional__Group_1__44644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__IfTrueExpressionAssignment_1_4_in_rule__Conditional__Group_1__4__Impl4671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__5__Impl_in_rule__Conditional__Group_1__54701 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__6_in_rule__Conditional__Group_1__54704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Conditional__Group_1__5__Impl4732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__6__Impl_in_rule__Conditional__Group_1__64763 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__7_in_rule__Conditional__Group_1__64766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Conditional__Group_1__6__Impl4794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__7__Impl_in_rule__Conditional__Group_1__74825 = new BitSet(new long[]{0x0000004404240010L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__8_in_rule__Conditional__Group_1__74828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Conditional__Group_1__7__Impl4856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__8__Impl_in_rule__Conditional__Group_1__84887 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__9_in_rule__Conditional__Group_1__84890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__IfFalseExpressionAssignment_1_8_in_rule__Conditional__Group_1__8__Impl4917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Conditional__Group_1__9__Impl_in_rule__Conditional__Group_1__94947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Conditional__Group_1__9__Impl4975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__05026 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__05029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl5056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__15085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl5112 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__05147 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__05150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__15208 = new BitSet(new long[]{0x0000004400240010L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__15211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__OrExpression__Group_1__1__Impl5239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__25270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OrExpression__RightAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl5297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__05333 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__05336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_rule__AndExpression__Group__0__Impl5363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__15392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl5419 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__05454 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__05457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__15515 = new BitSet(new long[]{0x0000004400240010L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__15518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__AndExpression__Group_1__1__Impl5546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__25577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AndExpression__RightAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl5604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group__0__Impl_in_rule__EqualExpression__Group__05640 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group__1_in_rule__EqualExpression__Group__05643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_rule__EqualExpression__Group__0__Impl5670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group__1__Impl_in_rule__EqualExpression__Group__15699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group_1__0_in_rule__EqualExpression__Group__1__Impl5726 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group_1__0__Impl_in_rule__EqualExpression__Group_1__05761 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group_1__1_in_rule__EqualExpression__Group_1__05764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group_1__1__Impl_in_rule__EqualExpression__Group_1__15822 = new BitSet(new long[]{0x0000004400240010L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group_1__2_in_rule__EqualExpression__Group_1__15825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__EqualExpression__Group_1__1__Impl5853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__Group_1__2__Impl_in_rule__EqualExpression__Group_1__25884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EqualExpression__RightAssignment_1_2_in_rule__EqualExpression__Group_1__2__Impl5911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group__0__Impl_in_rule__ComparisonExpression__Group__05947 = new BitSet(new long[]{0x0000000180000000L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group__1_in_rule__ComparisonExpression__Group__05950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_rule__ComparisonExpression__Group__0__Impl5977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group__1__Impl_in_rule__ComparisonExpression__Group__16006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1__0_in_rule__ComparisonExpression__Group__1__Impl6033 = new BitSet(new long[]{0x0000000180000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1__0__Impl_in_rule__ComparisonExpression__Group_1__06068 = new BitSet(new long[]{0x0000004400240010L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1__1_in_rule__ComparisonExpression__Group_1__06071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Alternatives_1_0_in_rule__ComparisonExpression__Group_1__0__Impl6098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1__1__Impl_in_rule__ComparisonExpression__Group_1__16128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__RightAssignment_1_1_in_rule__ComparisonExpression__Group_1__1__Impl6155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_0__0__Impl_in_rule__ComparisonExpression__Group_1_0_0__06189 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_0__1_in_rule__ComparisonExpression__Group_1_0_0__06192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_0__1__Impl_in_rule__ComparisonExpression__Group_1_0_0__16250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__ComparisonExpression__Group_1_0_0__1__Impl6278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_1__0__Impl_in_rule__ComparisonExpression__Group_1_0_1__06313 = new BitSet(new long[]{0x0000000180000000L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_1__1_in_rule__ComparisonExpression__Group_1_0_1__06316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1_0_1__1__Impl_in_rule__ComparisonExpression__Group_1_0_1__16374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__ComparisonExpression__Group_1_0_1__1__Impl6402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__0__Impl_in_rule__AddExpression__Group__06437 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__1_in_rule__AddExpression__Group__06440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_rule__AddExpression__Group__0__Impl6467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group__1__Impl_in_rule__AddExpression__Group__16496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__0_in_rule__AddExpression__Group__1__Impl6523 = new BitSet(new long[]{0x0000000600000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__0__Impl_in_rule__AddExpression__Group_1__06558 = new BitSet(new long[]{0x0000004400240010L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__1_in_rule__AddExpression__Group_1__06561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Alternatives_1_0_in_rule__AddExpression__Group_1__0__Impl6588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1__1__Impl_in_rule__AddExpression__Group_1__16618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__RightAssignment_1_1_in_rule__AddExpression__Group_1__1__Impl6645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_0__0__Impl_in_rule__AddExpression__Group_1_0_0__06679 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_0__1_in_rule__AddExpression__Group_1_0_0__06682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_0__1__Impl_in_rule__AddExpression__Group_1_0_0__16740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__AddExpression__Group_1_0_0__1__Impl6768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_1__0__Impl_in_rule__AddExpression__Group_1_0_1__06803 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_1__1_in_rule__AddExpression__Group_1_0_1__06806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AddExpression__Group_1_0_1__1__Impl_in_rule__AddExpression__Group_1_0_1__16864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__AddExpression__Group_1_0_1__1__Impl6892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__0__Impl_in_rule__MultExpression__Group__06927 = new BitSet(new long[]{0x0000003800000000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__1_in_rule__MultExpression__Group__06930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__MultExpression__Group__0__Impl6957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group__1__Impl_in_rule__MultExpression__Group__16986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__0_in_rule__MultExpression__Group__1__Impl7013 = new BitSet(new long[]{0x0000003800000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__0__Impl_in_rule__MultExpression__Group_1__07048 = new BitSet(new long[]{0x0000004400240010L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__1_in_rule__MultExpression__Group_1__07051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Alternatives_1_0_in_rule__MultExpression__Group_1__0__Impl7078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1__1__Impl_in_rule__MultExpression__Group_1__17108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__RightAssignment_1_1_in_rule__MultExpression__Group_1__1__Impl7135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_0__0__Impl_in_rule__MultExpression__Group_1_0_0__07169 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_0__1_in_rule__MultExpression__Group_1_0_0__07172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_0__1__Impl_in_rule__MultExpression__Group_1_0_0__17230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__MultExpression__Group_1_0_0__1__Impl7258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_1__0__Impl_in_rule__MultExpression__Group_1_0_1__07293 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_1__1_in_rule__MultExpression__Group_1_0_1__07296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_1__1__Impl_in_rule__MultExpression__Group_1_0_1__17354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__MultExpression__Group_1_0_1__1__Impl7382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_2__0__Impl_in_rule__MultExpression__Group_1_0_2__07417 = new BitSet(new long[]{0x0000003800000000L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_2__1_in_rule__MultExpression__Group_1_0_2__07420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultExpression__Group_1_0_2__1__Impl_in_rule__MultExpression__Group_1_0_2__17478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__MultExpression__Group_1_0_2__1__Impl7506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__0__Impl_in_rule__UnaryExpression__Group_1__07541 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__1_in_rule__UnaryExpression__Group_1__07544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__1__Impl_in_rule__UnaryExpression__Group_1__17602 = new BitSet(new long[]{0x0000000400240010L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__2_in_rule__UnaryExpression__Group_1__17605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__UnaryExpression__Group_1__1__Impl7633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_1__2__Impl_in_rule__UnaryExpression__Group_1__27664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__TargetAssignment_1_2_in_rule__UnaryExpression__Group_1__2__Impl7691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__0__Impl_in_rule__UnaryExpression__Group_2__07727 = new BitSet(new long[]{0x0000004400240010L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__1_in_rule__UnaryExpression__Group_2__07730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__1__Impl_in_rule__UnaryExpression__Group_2__17788 = new BitSet(new long[]{0x0000000400240010L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__2_in_rule__UnaryExpression__Group_2__17791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__UnaryExpression__Group_2__1__Impl7819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__Group_2__2__Impl_in_rule__UnaryExpression__Group_2__27850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryExpression__TargetAssignment_2_2_in_rule__UnaryExpression__Group_2__2__Impl7877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__07913 = new BitSet(new long[]{0x0000000400240010L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__07916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__EInt__Group__0__Impl7945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__17978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl8005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRegularGeometry_in_rule__CellularAutomataInitialization__GeometryAssignment_18043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRule_in_rule__CellularAutomataInitialization__SeedRulesAssignment_28074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRule_in_rule__CellularAutomataInitialization__SeedRulesAssignment_38105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCoordinateRanges_in_rule__Rule__FilterAssignment_18136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditional_in_rule__Rule__EvaluatedValAssignment_48167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCoordinateRange_in_rule__CoordinateRanges__CoordinateRangesAssignment_18198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCoordinateRange_in_rule__CoordinateRanges__CoordinateRangesAssignment_2_18229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDimensionRange_in_rule__CoordinateRange__DimensionRangesAssignment_18260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDimensionRange_in_rule__CoordinateRange__DimensionRangesAssignment_38291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__DimensionRange__LowerAssignment_08322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__DimensionRange__UpperAssignment_1_18353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__PositionLiteral__DimensionIndexAssignment_38384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNeighborhood_in_rule__RegularGeometry__NeighborsAssignment_28415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDimension_in_rule__RegularGeometry__DimensionsAssignment_48446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDimension_in_rule__RegularGeometry__DimensionsAssignment_5_18477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Dimension__ExtentAssignment_18508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Dimension__IsCircularAssignment_28544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditional_in_rule__Conditional__ConditionAssignment_1_28583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditional_in_rule__Conditional__IfTrueExpressionAssignment_1_48614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditional_in_rule__Conditional__IfFalseExpressionAssignment_1_88645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__RightAssignment_1_28676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_rule__AndExpression__RightAssignment_1_28707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_rule__EqualExpression__RightAssignment_1_28738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_rule__ComparisonExpression__RightAssignment_1_18769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_rule__AddExpression__RightAssignment_1_18800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__MultExpression__RightAssignment_1_18831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_rule__UnaryExpression__TargetAssignment_1_28862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_rule__UnaryExpression__TargetAssignment_2_28893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__IntegerLiteral__ValAssignment8924 = new BitSet(new long[]{0x0000000000000002L});
    }


}