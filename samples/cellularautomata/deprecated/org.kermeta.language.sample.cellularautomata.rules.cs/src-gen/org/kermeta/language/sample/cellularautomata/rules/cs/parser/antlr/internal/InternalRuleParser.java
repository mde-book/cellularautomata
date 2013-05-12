package org.kermeta.language.sample.cellularautomata.rules.cs.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.kermeta.language.sample.cellularautomata.rules.cs.services.RuleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRuleParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'rule'", "'='", "';'", "'['", "','", "']'", "'if'", "'{'", "'}'", "'else'", "'|'", "'&'", "'=='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'('", "')'", "'neighborsMax'", "'neighborsMin'", "'neighborsSum'", "'neighborsSize'", "'CurrentVal'"
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
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=4;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalRuleParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRuleParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRuleParser.tokenNames; }
    public String getGrammarFileName() { return "../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g"; }



     	private RuleGrammarAccess grammarAccess;
     	
        public InternalRuleParser(TokenStream input, RuleGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "CellularAutomata";	
       	}
       	
       	@Override
       	protected RuleGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleCellularAutomata"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:67:1: entryRuleCellularAutomata returns [EObject current=null] : iv_ruleCellularAutomata= ruleCellularAutomata EOF ;
    public final EObject entryRuleCellularAutomata() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellularAutomata = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:68:2: (iv_ruleCellularAutomata= ruleCellularAutomata EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:69:2: iv_ruleCellularAutomata= ruleCellularAutomata EOF
            {
             newCompositeNode(grammarAccess.getCellularAutomataRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCellularAutomata_in_entryRuleCellularAutomata75);
            iv_ruleCellularAutomata=ruleCellularAutomata();

            state._fsp--;

             current =iv_ruleCellularAutomata; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCellularAutomata85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCellularAutomata"


    // $ANTLR start "ruleCellularAutomata"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:76:1: ruleCellularAutomata returns [EObject current=null] : ( (lv_rules_0_0= ruleRule ) )+ ;
    public final EObject ruleCellularAutomata() throws RecognitionException {
        EObject current = null;

        EObject lv_rules_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:79:28: ( ( (lv_rules_0_0= ruleRule ) )+ )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:80:1: ( (lv_rules_0_0= ruleRule ) )+
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:80:1: ( (lv_rules_0_0= ruleRule ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:81:1: (lv_rules_0_0= ruleRule )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:81:1: (lv_rules_0_0= ruleRule )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:82:3: lv_rules_0_0= ruleRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCellularAutomataAccess().getRulesRuleParserRuleCall_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleRule_in_ruleCellularAutomata130);
            	    lv_rules_0_0=ruleRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCellularAutomataRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rules",
            	            		lv_rules_0_0, 
            	            		"Rule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCellularAutomata"


    // $ANTLR start "entryRuleRule"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:106:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:107:2: (iv_ruleRule= ruleRule EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:108:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_entryRuleRule166);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRule176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:115:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_filter_1_0= rulePopulationRange ) )? otherlv_2= '=' ( (lv_nextVal_3_0= ruleConditional ) ) otherlv_4= ';' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_filter_1_0 = null;

        EObject lv_nextVal_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:118:28: ( (otherlv_0= 'rule' ( (lv_filter_1_0= rulePopulationRange ) )? otherlv_2= '=' ( (lv_nextVal_3_0= ruleConditional ) ) otherlv_4= ';' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:119:1: (otherlv_0= 'rule' ( (lv_filter_1_0= rulePopulationRange ) )? otherlv_2= '=' ( (lv_nextVal_3_0= ruleConditional ) ) otherlv_4= ';' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:119:1: (otherlv_0= 'rule' ( (lv_filter_1_0= rulePopulationRange ) )? otherlv_2= '=' ( (lv_nextVal_3_0= ruleConditional ) ) otherlv_4= ';' )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:119:3: otherlv_0= 'rule' ( (lv_filter_1_0= rulePopulationRange ) )? otherlv_2= '=' ( (lv_nextVal_3_0= ruleConditional ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRule213); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
                
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:123:1: ( (lv_filter_1_0= rulePopulationRange ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:124:1: (lv_filter_1_0= rulePopulationRange )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:124:1: (lv_filter_1_0= rulePopulationRange )
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:125:3: lv_filter_1_0= rulePopulationRange
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleAccess().getFilterPopulationRangeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePopulationRange_in_ruleRule234);
                    lv_filter_1_0=rulePopulationRange();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRuleRule());
                    	        }
                           		set(
                           			current, 
                           			"filter",
                            		lv_filter_1_0, 
                            		"PopulationRange");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRule247); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getEqualsSignKeyword_2());
                
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:145:1: ( (lv_nextVal_3_0= ruleConditional ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:146:1: (lv_nextVal_3_0= ruleConditional )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:146:1: (lv_nextVal_3_0= ruleConditional )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:147:3: lv_nextVal_3_0= ruleConditional
            {
             
            	        newCompositeNode(grammarAccess.getRuleAccess().getNextValConditionalParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_ruleRule268);
            lv_nextVal_3_0=ruleConditional();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	        }
                   		set(
                   			current, 
                   			"nextVal",
                    		lv_nextVal_3_0, 
                    		"Conditional");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRule280); 

                	newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRulePopulationRange"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:175:1: entryRulePopulationRange returns [EObject current=null] : iv_rulePopulationRange= rulePopulationRange EOF ;
    public final EObject entryRulePopulationRange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePopulationRange = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:176:2: (iv_rulePopulationRange= rulePopulationRange EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:177:2: iv_rulePopulationRange= rulePopulationRange EOF
            {
             newCompositeNode(grammarAccess.getPopulationRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePopulationRange_in_entryRulePopulationRange316);
            iv_rulePopulationRange=rulePopulationRange();

            state._fsp--;

             current =iv_rulePopulationRange; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePopulationRange326); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePopulationRange"


    // $ANTLR start "rulePopulationRange"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:184:1: rulePopulationRange returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_lowerRange_2_0= ruleEInt ) )? otherlv_3= ',' ( (lv_upperRange_4_0= ruleEInt ) )? otherlv_5= ']' ) ;
    public final EObject rulePopulationRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_lowerRange_2_0 = null;

        AntlrDatatypeRuleToken lv_upperRange_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:187:28: ( ( () otherlv_1= '[' ( (lv_lowerRange_2_0= ruleEInt ) )? otherlv_3= ',' ( (lv_upperRange_4_0= ruleEInt ) )? otherlv_5= ']' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:188:1: ( () otherlv_1= '[' ( (lv_lowerRange_2_0= ruleEInt ) )? otherlv_3= ',' ( (lv_upperRange_4_0= ruleEInt ) )? otherlv_5= ']' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:188:1: ( () otherlv_1= '[' ( (lv_lowerRange_2_0= ruleEInt ) )? otherlv_3= ',' ( (lv_upperRange_4_0= ruleEInt ) )? otherlv_5= ']' )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:188:2: () otherlv_1= '[' ( (lv_lowerRange_2_0= ruleEInt ) )? otherlv_3= ',' ( (lv_upperRange_4_0= ruleEInt ) )? otherlv_5= ']'
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:188:2: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:189:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPopulationRangeAccess().getPopulationRangeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePopulationRange372); 

                	newLeafNode(otherlv_1, grammarAccess.getPopulationRangeAccess().getLeftSquareBracketKeyword_1());
                
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:198:1: ( (lv_lowerRange_2_0= ruleEInt ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT||LA3_0==27) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:199:1: (lv_lowerRange_2_0= ruleEInt )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:199:1: (lv_lowerRange_2_0= ruleEInt )
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:200:3: lv_lowerRange_2_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getPopulationRangeAccess().getLowerRangeEIntParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulePopulationRange393);
                    lv_lowerRange_2_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPopulationRangeRule());
                    	        }
                           		set(
                           			current, 
                           			"lowerRange",
                            		lv_lowerRange_2_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePopulationRange406); 

                	newLeafNode(otherlv_3, grammarAccess.getPopulationRangeAccess().getCommaKeyword_3());
                
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:220:1: ( (lv_upperRange_4_0= ruleEInt ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT||LA4_0==27) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:221:1: (lv_upperRange_4_0= ruleEInt )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:221:1: (lv_upperRange_4_0= ruleEInt )
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:222:3: lv_upperRange_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getPopulationRangeAccess().getUpperRangeEIntParserRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulePopulationRange427);
                    lv_upperRange_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPopulationRangeRule());
                    	        }
                           		set(
                           			current, 
                           			"upperRange",
                            		lv_upperRange_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePopulationRange440); 

                	newLeafNode(otherlv_5, grammarAccess.getPopulationRangeAccess().getRightSquareBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePopulationRange"


    // $ANTLR start "entryRuleConditional"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:250:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:251:2: (iv_ruleConditional= ruleConditional EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:252:2: iv_ruleConditional= ruleConditional EOF
            {
             newCompositeNode(grammarAccess.getConditionalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_entryRuleConditional476);
            iv_ruleConditional=ruleConditional();

            state._fsp--;

             current =iv_ruleConditional; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConditional486); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:259:1: ruleConditional returns [EObject current=null] : (this_OrExpression_0= ruleOrExpression | ( () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}' ) ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject this_OrExpression_0 = null;

        EObject lv_condition_3_0 = null;

        EObject lv_ifTrueExpression_5_0 = null;

        EObject lv_ifFalseExpression_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:262:28: ( (this_OrExpression_0= ruleOrExpression | ( () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}' ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:263:1: (this_OrExpression_0= ruleOrExpression | ( () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}' ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:263:1: (this_OrExpression_0= ruleOrExpression | ( () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT||LA5_0==27||(LA5_0>=31 && LA5_0<=32)||(LA5_0>=34 && LA5_0<=38)) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:264:5: this_OrExpression_0= ruleOrExpression
                    {
                     
                            newCompositeNode(grammarAccess.getConditionalAccess().getOrExpressionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_ruleConditional533);
                    this_OrExpression_0=ruleOrExpression();

                    state._fsp--;

                     
                            current = this_OrExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:273:6: ( () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}' )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:273:6: ( () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}' )
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:273:7: () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}'
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:273:7: ()
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:274:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConditionalAccess().getConditionalAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleConditional560); 

                        	newLeafNode(otherlv_2, grammarAccess.getConditionalAccess().getIfKeyword_1_1());
                        
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:283:1: ( (lv_condition_3_0= ruleConditional ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:284:1: (lv_condition_3_0= ruleConditional )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:284:1: (lv_condition_3_0= ruleConditional )
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:285:3: lv_condition_3_0= ruleConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionalAccess().getConditionConditionalParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConditional_in_ruleConditional581);
                    lv_condition_3_0=ruleConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionalRule());
                    	        }
                           		set(
                           			current, 
                           			"condition",
                            		lv_condition_3_0, 
                            		"Conditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleConditional593); 

                        	newLeafNode(otherlv_4, grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_1_3());
                        
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:305:1: ( (lv_ifTrueExpression_5_0= ruleConditional ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:306:1: (lv_ifTrueExpression_5_0= ruleConditional )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:306:1: (lv_ifTrueExpression_5_0= ruleConditional )
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:307:3: lv_ifTrueExpression_5_0= ruleConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionalAccess().getIfTrueExpressionConditionalParserRuleCall_1_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConditional_in_ruleConditional614);
                    lv_ifTrueExpression_5_0=ruleConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionalRule());
                    	        }
                           		set(
                           			current, 
                           			"ifTrueExpression",
                            		lv_ifTrueExpression_5_0, 
                            		"Conditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleConditional626); 

                        	newLeafNode(otherlv_6, grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_1_5());
                        
                    otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleConditional638); 

                        	newLeafNode(otherlv_7, grammarAccess.getConditionalAccess().getElseKeyword_1_6());
                        
                    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleConditional650); 

                        	newLeafNode(otherlv_8, grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_1_7());
                        
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:335:1: ( (lv_ifFalseExpression_9_0= ruleConditional ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:336:1: (lv_ifFalseExpression_9_0= ruleConditional )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:336:1: (lv_ifFalseExpression_9_0= ruleConditional )
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:337:3: lv_ifFalseExpression_9_0= ruleConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionalAccess().getIfFalseExpressionConditionalParserRuleCall_1_8_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConditional_in_ruleConditional671);
                    lv_ifFalseExpression_9_0=ruleConditional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionalRule());
                    	        }
                           		set(
                           			current, 
                           			"ifFalseExpression",
                            		lv_ifFalseExpression_9_0, 
                            		"Conditional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleConditional683); 

                        	newLeafNode(otherlv_10, grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_1_9());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleOrExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:365:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:366:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:367:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_entryRuleOrExpression720);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrExpression730); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:374:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:377:28: ( (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:378:1: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:378:1: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:379:5: this_AndExpression_0= ruleAndExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleOrExpression777);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;

             
                    current = this_AndExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:387:1: ( () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:387:2: () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:387:2: ()
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:388:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrExpressionAccess().getOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleOrExpression798); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getVerticalLineKeyword_1_1());
            	        
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:397:1: ( (lv_right_3_0= ruleAndExpression ) )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:398:1: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:398:1: (lv_right_3_0= ruleAndExpression )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:399:3: lv_right_3_0= ruleAndExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleOrExpression819);
            	    lv_right_3_0=ruleAndExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"AndExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:423:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:424:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:425:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_entryRuleAndExpression857);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndExpression867); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:432:1: ruleAndExpression returns [EObject current=null] : (this_EqualExpression_0= ruleEqualExpression ( () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EqualExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:435:28: ( (this_EqualExpression_0= ruleEqualExpression ( () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:436:1: (this_EqualExpression_0= ruleEqualExpression ( () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:436:1: (this_EqualExpression_0= ruleEqualExpression ( () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:437:5: this_EqualExpression_0= ruleEqualExpression ( () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_ruleAndExpression914);
            this_EqualExpression_0=ruleEqualExpression();

            state._fsp--;

             
                    current = this_EqualExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:445:1: ( () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:445:2: () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:445:2: ()
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:446:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndExpressionAccess().getAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAndExpression935); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAmpersandKeyword_1_1());
            	        
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:455:1: ( (lv_right_3_0= ruleEqualExpression ) )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:456:1: (lv_right_3_0= ruleEqualExpression )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:456:1: (lv_right_3_0= ruleEqualExpression )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:457:3: lv_right_3_0= ruleEqualExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightEqualExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_ruleAndExpression956);
            	    lv_right_3_0=ruleEqualExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"EqualExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqualExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:481:1: entryRuleEqualExpression returns [EObject current=null] : iv_ruleEqualExpression= ruleEqualExpression EOF ;
    public final EObject entryRuleEqualExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:482:2: (iv_ruleEqualExpression= ruleEqualExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:483:2: iv_ruleEqualExpression= ruleEqualExpression EOF
            {
             newCompositeNode(grammarAccess.getEqualExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_entryRuleEqualExpression994);
            iv_ruleEqualExpression=ruleEqualExpression();

            state._fsp--;

             current =iv_ruleEqualExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEqualExpression1004); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqualExpression"


    // $ANTLR start "ruleEqualExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:490:1: ruleEqualExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleEqualExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ComparisonExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:493:28: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:494:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:494:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:495:5: this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getEqualExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_ruleEqualExpression1051);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;

             
                    current = this_ComparisonExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:503:1: ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:503:2: () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:503:2: ()
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:504:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getEqualExpressionAccess().getEqualLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEqualExpression1072); 

            	        	newLeafNode(otherlv_2, grammarAccess.getEqualExpressionAccess().getEqualsSignEqualsSignKeyword_1_1());
            	        
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:513:1: ( (lv_right_3_0= ruleComparisonExpression ) )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:514:1: (lv_right_3_0= ruleComparisonExpression )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:514:1: (lv_right_3_0= ruleComparisonExpression )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:515:3: lv_right_3_0= ruleComparisonExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqualExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_ruleEqualExpression1093);
            	    lv_right_3_0=ruleComparisonExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEqualExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"ComparisonExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqualExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:539:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:540:2: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:541:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
             newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression1131);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;

             current =iv_ruleComparisonExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparisonExpression1141); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:548:1: ruleComparisonExpression returns [EObject current=null] : (this_AddExpression_0= ruleAddExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) ) )* ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_AddExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:551:28: ( (this_AddExpression_0= ruleAddExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:552:1: (this_AddExpression_0= ruleAddExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:552:1: (this_AddExpression_0= ruleAddExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:553:5: this_AddExpression_0= ruleAddExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getComparisonExpressionAccess().getAddExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_ruleComparisonExpression1188);
            this_AddExpression_0=ruleAddExpression();

            state._fsp--;

             
                    current = this_AddExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:561:1: ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=24 && LA10_0<=25)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:561:2: ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:561:2: ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==24) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==25) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:561:3: ( () otherlv_2= '>' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:561:3: ( () otherlv_2= '>' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:561:4: () otherlv_2= '>'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:561:4: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:562:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getComparisonExpressionAccess().getGreaterLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleComparisonExpression1211); 

            	                	newLeafNode(otherlv_2, grammarAccess.getComparisonExpressionAccess().getGreaterThanSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:572:6: ( () otherlv_4= '<' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:572:6: ( () otherlv_4= '<' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:572:7: () otherlv_4= '<'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:572:7: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:573:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getComparisonExpressionAccess().getLowerLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleComparisonExpression1240); 

            	                	newLeafNode(otherlv_4, grammarAccess.getComparisonExpressionAccess().getLessThanSignKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:582:3: ( (lv_right_5_0= ruleAddExpression ) )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:583:1: (lv_right_5_0= ruleAddExpression )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:583:1: (lv_right_5_0= ruleAddExpression )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:584:3: lv_right_5_0= ruleAddExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightAddExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_ruleComparisonExpression1263);
            	    lv_right_5_0=ruleAddExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"AddExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleAddExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:608:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:609:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:610:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
             newCompositeNode(grammarAccess.getAddExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_entryRuleAddExpression1301);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;

             current =iv_ruleAddExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddExpression1311); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddExpression"


    // $ANTLR start "ruleAddExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:617:1: ruleAddExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MultExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:620:28: ( (this_MultExpression_0= ruleMultExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:621:1: (this_MultExpression_0= ruleMultExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:621:1: (this_MultExpression_0= ruleMultExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:622:5: this_MultExpression_0= ruleMultExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAddExpressionAccess().getMultExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleAddExpression1358);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;

             
                    current = this_MultExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:630:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=26 && LA12_0<=27)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:630:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:630:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==26) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==27) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:630:3: ( () otherlv_2= '+' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:630:3: ( () otherlv_2= '+' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:630:4: () otherlv_2= '+'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:630:4: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:631:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAddExpressionAccess().getAddLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleAddExpression1381); 

            	                	newLeafNode(otherlv_2, grammarAccess.getAddExpressionAccess().getPlusSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:641:6: ( () otherlv_4= '-' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:641:6: ( () otherlv_4= '-' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:641:7: () otherlv_4= '-'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:641:7: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:642:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAddExpressionAccess().getMinusLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAddExpression1410); 

            	                	newLeafNode(otherlv_4, grammarAccess.getAddExpressionAccess().getHyphenMinusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:651:3: ( (lv_right_5_0= ruleMultExpression ) )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:652:1: (lv_right_5_0= ruleMultExpression )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:652:1: (lv_right_5_0= ruleMultExpression )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:653:3: lv_right_5_0= ruleMultExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAddExpressionAccess().getRightMultExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleAddExpression1433);
            	    lv_right_5_0=ruleMultExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAddExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"MultExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleMultExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:677:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:678:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:679:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
             newCompositeNode(grammarAccess.getMultExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_entryRuleMultExpression1471);
            iv_ruleMultExpression=ruleMultExpression();

            state._fsp--;

             current =iv_ruleMultExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultExpression1481); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultExpression"


    // $ANTLR start "ruleMultExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:686:1: ruleMultExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_UnaryExpression_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:689:28: ( (this_UnaryExpression_0= ruleUnaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:690:1: (this_UnaryExpression_0= ruleUnaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:690:1: (this_UnaryExpression_0= ruleUnaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:691:5: this_UnaryExpression_0= ruleUnaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_ruleMultExpression1528);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;

             
                    current = this_UnaryExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:699:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=28 && LA14_0<=30)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:699:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:699:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) )
            	    int alt13=3;
            	    switch ( input.LA(1) ) {
            	    case 28:
            	        {
            	        alt13=1;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt13=2;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt13=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt13) {
            	        case 1 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:699:3: ( () otherlv_2= '*' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:699:3: ( () otherlv_2= '*' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:699:4: () otherlv_2= '*'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:699:4: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:700:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultExpressionAccess().getMultLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMultExpression1551); 

            	                	newLeafNode(otherlv_2, grammarAccess.getMultExpressionAccess().getAsteriskKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:710:6: ( () otherlv_4= '/' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:710:6: ( () otherlv_4= '/' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:710:7: () otherlv_4= '/'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:710:7: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:711:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultExpressionAccess().getDivLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleMultExpression1580); 

            	                	newLeafNode(otherlv_4, grammarAccess.getMultExpressionAccess().getSolidusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:721:6: ( () otherlv_6= '%' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:721:6: ( () otherlv_6= '%' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:721:7: () otherlv_6= '%'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:721:7: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:722:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultExpressionAccess().getModLeftAction_1_0_2_0(),
            	                        current);
            	                

            	            }

            	            otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMultExpression1609); 

            	                	newLeafNode(otherlv_6, grammarAccess.getMultExpressionAccess().getPercentSignKeyword_1_0_2_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:731:3: ( (lv_right_7_0= ruleUnaryExpression ) )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:732:1: (lv_right_7_0= ruleUnaryExpression )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:732:1: (lv_right_7_0= ruleUnaryExpression )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:733:3: lv_right_7_0= ruleUnaryExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultExpressionAccess().getRightUnaryExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_ruleMultExpression1632);
            	    lv_right_7_0=ruleUnaryExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_7_0, 
            	            		"UnaryExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:757:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:758:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:759:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression1670);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryExpression1680); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:766:1: ruleUnaryExpression returns [EObject current=null] : (this_NeighborsExpression_0= ruleNeighborsExpression | ( () otherlv_2= '!' ( (lv_target_3_0= ruleNeighborsExpression ) ) ) | ( () otherlv_5= '-' ( (lv_target_6_0= ruleNeighborsExpression ) ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_NeighborsExpression_0 = null;

        EObject lv_target_3_0 = null;

        EObject lv_target_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:769:28: ( (this_NeighborsExpression_0= ruleNeighborsExpression | ( () otherlv_2= '!' ( (lv_target_3_0= ruleNeighborsExpression ) ) ) | ( () otherlv_5= '-' ( (lv_target_6_0= ruleNeighborsExpression ) ) ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:770:1: (this_NeighborsExpression_0= ruleNeighborsExpression | ( () otherlv_2= '!' ( (lv_target_3_0= ruleNeighborsExpression ) ) ) | ( () otherlv_5= '-' ( (lv_target_6_0= ruleNeighborsExpression ) ) ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:770:1: (this_NeighborsExpression_0= ruleNeighborsExpression | ( () otherlv_2= '!' ( (lv_target_3_0= ruleNeighborsExpression ) ) ) | ( () otherlv_5= '-' ( (lv_target_6_0= ruleNeighborsExpression ) ) ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 32:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
                {
                alt15=1;
                }
                break;
            case 27:
                {
                int LA15_2 = input.LA(2);

                if ( (LA15_2==27||LA15_2==32||(LA15_2>=34 && LA15_2<=38)) ) {
                    alt15=3;
                }
                else if ( (LA15_2==RULE_INT) ) {
                    alt15=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;
                }
                }
                break;
            case 31:
                {
                alt15=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:771:5: this_NeighborsExpression_0= ruleNeighborsExpression
                    {
                     
                            newCompositeNode(grammarAccess.getUnaryExpressionAccess().getNeighborsExpressionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNeighborsExpression_in_ruleUnaryExpression1727);
                    this_NeighborsExpression_0=ruleNeighborsExpression();

                    state._fsp--;

                     
                            current = this_NeighborsExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:780:6: ( () otherlv_2= '!' ( (lv_target_3_0= ruleNeighborsExpression ) ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:780:6: ( () otherlv_2= '!' ( (lv_target_3_0= ruleNeighborsExpression ) ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:780:7: () otherlv_2= '!' ( (lv_target_3_0= ruleNeighborsExpression ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:780:7: ()
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:781:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getUnaryExpressionAccess().getNotAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleUnaryExpression1754); 

                        	newLeafNode(otherlv_2, grammarAccess.getUnaryExpressionAccess().getExclamationMarkKeyword_1_1());
                        
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:790:1: ( (lv_target_3_0= ruleNeighborsExpression ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:791:1: (lv_target_3_0= ruleNeighborsExpression )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:791:1: (lv_target_3_0= ruleNeighborsExpression )
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:792:3: lv_target_3_0= ruleNeighborsExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getTargetNeighborsExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNeighborsExpression_in_ruleUnaryExpression1775);
                    lv_target_3_0=ruleNeighborsExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"target",
                            		lv_target_3_0, 
                            		"NeighborsExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:809:6: ( () otherlv_5= '-' ( (lv_target_6_0= ruleNeighborsExpression ) ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:809:6: ( () otherlv_5= '-' ( (lv_target_6_0= ruleNeighborsExpression ) ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:809:7: () otherlv_5= '-' ( (lv_target_6_0= ruleNeighborsExpression ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:809:7: ()
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:810:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getUnaryExpressionAccess().getUMinusAction_2_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleUnaryExpression1804); 

                        	newLeafNode(otherlv_5, grammarAccess.getUnaryExpressionAccess().getHyphenMinusKeyword_2_1());
                        
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:819:1: ( (lv_target_6_0= ruleNeighborsExpression ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:820:1: (lv_target_6_0= ruleNeighborsExpression )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:820:1: (lv_target_6_0= ruleNeighborsExpression )
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:821:3: lv_target_6_0= ruleNeighborsExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getTargetNeighborsExpressionParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNeighborsExpression_in_ruleUnaryExpression1825);
                    lv_target_6_0=ruleNeighborsExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"target",
                            		lv_target_6_0, 
                            		"NeighborsExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleNeighborsExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:845:1: entryRuleNeighborsExpression returns [EObject current=null] : iv_ruleNeighborsExpression= ruleNeighborsExpression EOF ;
    public final EObject entryRuleNeighborsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNeighborsExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:846:2: (iv_ruleNeighborsExpression= ruleNeighborsExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:847:2: iv_ruleNeighborsExpression= ruleNeighborsExpression EOF
            {
             newCompositeNode(grammarAccess.getNeighborsExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNeighborsExpression_in_entryRuleNeighborsExpression1862);
            iv_ruleNeighborsExpression=ruleNeighborsExpression();

            state._fsp--;

             current =iv_ruleNeighborsExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNeighborsExpression1872); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNeighborsExpression"


    // $ANTLR start "ruleNeighborsExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:854:1: ruleNeighborsExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')' ) | this_Max_3= ruleMax | this_Min_4= ruleMin | this_Sum_5= ruleSum | this_Size_6= ruleSize | this_IntegerLiteral_7= ruleIntegerLiteral | this_CurrentCellPopulation_8= ruleCurrentCellPopulation ) ;
    public final EObject ruleNeighborsExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Conditional_1 = null;

        EObject this_Max_3 = null;

        EObject this_Min_4 = null;

        EObject this_Sum_5 = null;

        EObject this_Size_6 = null;

        EObject this_IntegerLiteral_7 = null;

        EObject this_CurrentCellPopulation_8 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:857:28: ( ( (otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')' ) | this_Max_3= ruleMax | this_Min_4= ruleMin | this_Sum_5= ruleSum | this_Size_6= ruleSize | this_IntegerLiteral_7= ruleIntegerLiteral | this_CurrentCellPopulation_8= ruleCurrentCellPopulation ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:858:1: ( (otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')' ) | this_Max_3= ruleMax | this_Min_4= ruleMin | this_Sum_5= ruleSum | this_Size_6= ruleSize | this_IntegerLiteral_7= ruleIntegerLiteral | this_CurrentCellPopulation_8= ruleCurrentCellPopulation )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:858:1: ( (otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')' ) | this_Max_3= ruleMax | this_Min_4= ruleMin | this_Sum_5= ruleSum | this_Size_6= ruleSize | this_IntegerLiteral_7= ruleIntegerLiteral | this_CurrentCellPopulation_8= ruleCurrentCellPopulation )
            int alt16=7;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt16=1;
                }
                break;
            case 34:
                {
                alt16=2;
                }
                break;
            case 35:
                {
                alt16=3;
                }
                break;
            case 36:
                {
                alt16=4;
                }
                break;
            case 37:
                {
                alt16=5;
                }
                break;
            case RULE_INT:
            case 27:
                {
                alt16=6;
                }
                break;
            case 38:
                {
                alt16=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:858:2: (otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')' )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:858:2: (otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')' )
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:858:4: otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleNeighborsExpression1910); 

                        	newLeafNode(otherlv_0, grammarAccess.getNeighborsExpressionAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getNeighborsExpressionAccess().getConditionalParserRuleCall_0_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConditional_in_ruleNeighborsExpression1932);
                    this_Conditional_1=ruleConditional();

                    state._fsp--;

                     
                            current = this_Conditional_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleNeighborsExpression1943); 

                        	newLeafNode(otherlv_2, grammarAccess.getNeighborsExpressionAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:877:5: this_Max_3= ruleMax
                    {
                     
                            newCompositeNode(grammarAccess.getNeighborsExpressionAccess().getMaxParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMax_in_ruleNeighborsExpression1972);
                    this_Max_3=ruleMax();

                    state._fsp--;

                     
                            current = this_Max_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:887:5: this_Min_4= ruleMin
                    {
                     
                            newCompositeNode(grammarAccess.getNeighborsExpressionAccess().getMinParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMin_in_ruleNeighborsExpression1999);
                    this_Min_4=ruleMin();

                    state._fsp--;

                     
                            current = this_Min_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:897:5: this_Sum_5= ruleSum
                    {
                     
                            newCompositeNode(grammarAccess.getNeighborsExpressionAccess().getSumParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSum_in_ruleNeighborsExpression2026);
                    this_Sum_5=ruleSum();

                    state._fsp--;

                     
                            current = this_Sum_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:907:5: this_Size_6= ruleSize
                    {
                     
                            newCompositeNode(grammarAccess.getNeighborsExpressionAccess().getSizeParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSize_in_ruleNeighborsExpression2053);
                    this_Size_6=ruleSize();

                    state._fsp--;

                     
                            current = this_Size_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:917:5: this_IntegerLiteral_7= ruleIntegerLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getNeighborsExpressionAccess().getIntegerLiteralParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerLiteral_in_ruleNeighborsExpression2080);
                    this_IntegerLiteral_7=ruleIntegerLiteral();

                    state._fsp--;

                     
                            current = this_IntegerLiteral_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:927:5: this_CurrentCellPopulation_8= ruleCurrentCellPopulation
                    {
                     
                            newCompositeNode(grammarAccess.getNeighborsExpressionAccess().getCurrentCellPopulationParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCurrentCellPopulation_in_ruleNeighborsExpression2107);
                    this_CurrentCellPopulation_8=ruleCurrentCellPopulation();

                    state._fsp--;

                     
                            current = this_CurrentCellPopulation_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNeighborsExpression"


    // $ANTLR start "entryRuleMax"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:943:1: entryRuleMax returns [EObject current=null] : iv_ruleMax= ruleMax EOF ;
    public final EObject entryRuleMax() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMax = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:944:2: (iv_ruleMax= ruleMax EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:945:2: iv_ruleMax= ruleMax EOF
            {
             newCompositeNode(grammarAccess.getMaxRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMax_in_entryRuleMax2142);
            iv_ruleMax=ruleMax();

            state._fsp--;

             current =iv_ruleMax; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMax2152); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMax"


    // $ANTLR start "ruleMax"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:952:1: ruleMax returns [EObject current=null] : ( () otherlv_1= 'neighborsMax' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )? ) ;
    public final EObject ruleMax() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_neighborsFilter_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:955:28: ( ( () otherlv_1= 'neighborsMax' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )? ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:956:1: ( () otherlv_1= 'neighborsMax' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )? )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:956:1: ( () otherlv_1= 'neighborsMax' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )? )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:956:2: () otherlv_1= 'neighborsMax' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )?
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:956:2: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:957:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMaxAccess().getMaxAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleMax2198); 

                	newLeafNode(otherlv_1, grammarAccess.getMaxAccess().getNeighborsMaxKeyword_1());
                
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:966:1: ( (lv_neighborsFilter_2_0= rulePopulationRange ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==14) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:967:1: (lv_neighborsFilter_2_0= rulePopulationRange )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:967:1: (lv_neighborsFilter_2_0= rulePopulationRange )
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:968:3: lv_neighborsFilter_2_0= rulePopulationRange
                    {
                     
                    	        newCompositeNode(grammarAccess.getMaxAccess().getNeighborsFilterPopulationRangeParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePopulationRange_in_ruleMax2219);
                    lv_neighborsFilter_2_0=rulePopulationRange();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMaxRule());
                    	        }
                           		set(
                           			current, 
                           			"neighborsFilter",
                            		lv_neighborsFilter_2_0, 
                            		"PopulationRange");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMax"


    // $ANTLR start "entryRuleMin"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:992:1: entryRuleMin returns [EObject current=null] : iv_ruleMin= ruleMin EOF ;
    public final EObject entryRuleMin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMin = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:993:2: (iv_ruleMin= ruleMin EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:994:2: iv_ruleMin= ruleMin EOF
            {
             newCompositeNode(grammarAccess.getMinRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMin_in_entryRuleMin2256);
            iv_ruleMin=ruleMin();

            state._fsp--;

             current =iv_ruleMin; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMin2266); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMin"


    // $ANTLR start "ruleMin"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1001:1: ruleMin returns [EObject current=null] : ( () otherlv_1= 'neighborsMin' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )? ) ;
    public final EObject ruleMin() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_neighborsFilter_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1004:28: ( ( () otherlv_1= 'neighborsMin' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )? ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1005:1: ( () otherlv_1= 'neighborsMin' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )? )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1005:1: ( () otherlv_1= 'neighborsMin' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )? )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1005:2: () otherlv_1= 'neighborsMin' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )?
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1005:2: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1006:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMinAccess().getMinAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleMin2312); 

                	newLeafNode(otherlv_1, grammarAccess.getMinAccess().getNeighborsMinKeyword_1());
                
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1015:1: ( (lv_neighborsFilter_2_0= rulePopulationRange ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==14) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1016:1: (lv_neighborsFilter_2_0= rulePopulationRange )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1016:1: (lv_neighborsFilter_2_0= rulePopulationRange )
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1017:3: lv_neighborsFilter_2_0= rulePopulationRange
                    {
                     
                    	        newCompositeNode(grammarAccess.getMinAccess().getNeighborsFilterPopulationRangeParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePopulationRange_in_ruleMin2333);
                    lv_neighborsFilter_2_0=rulePopulationRange();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMinRule());
                    	        }
                           		set(
                           			current, 
                           			"neighborsFilter",
                            		lv_neighborsFilter_2_0, 
                            		"PopulationRange");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMin"


    // $ANTLR start "entryRuleSum"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1041:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1042:2: (iv_ruleSum= ruleSum EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1043:2: iv_ruleSum= ruleSum EOF
            {
             newCompositeNode(grammarAccess.getSumRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSum_in_entryRuleSum2370);
            iv_ruleSum=ruleSum();

            state._fsp--;

             current =iv_ruleSum; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSum2380); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSum"


    // $ANTLR start "ruleSum"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1050:1: ruleSum returns [EObject current=null] : ( () otherlv_1= 'neighborsSum' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )? ) ;
    public final EObject ruleSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_neighborsFilter_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1053:28: ( ( () otherlv_1= 'neighborsSum' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )? ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1054:1: ( () otherlv_1= 'neighborsSum' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )? )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1054:1: ( () otherlv_1= 'neighborsSum' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )? )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1054:2: () otherlv_1= 'neighborsSum' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )?
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1054:2: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1055:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSumAccess().getSumAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleSum2426); 

                	newLeafNode(otherlv_1, grammarAccess.getSumAccess().getNeighborsSumKeyword_1());
                
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1064:1: ( (lv_neighborsFilter_2_0= rulePopulationRange ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==14) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1065:1: (lv_neighborsFilter_2_0= rulePopulationRange )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1065:1: (lv_neighborsFilter_2_0= rulePopulationRange )
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1066:3: lv_neighborsFilter_2_0= rulePopulationRange
                    {
                     
                    	        newCompositeNode(grammarAccess.getSumAccess().getNeighborsFilterPopulationRangeParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePopulationRange_in_ruleSum2447);
                    lv_neighborsFilter_2_0=rulePopulationRange();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSumRule());
                    	        }
                           		set(
                           			current, 
                           			"neighborsFilter",
                            		lv_neighborsFilter_2_0, 
                            		"PopulationRange");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSum"


    // $ANTLR start "entryRuleSize"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1090:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1091:2: (iv_ruleSize= ruleSize EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1092:2: iv_ruleSize= ruleSize EOF
            {
             newCompositeNode(grammarAccess.getSizeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSize_in_entryRuleSize2484);
            iv_ruleSize=ruleSize();

            state._fsp--;

             current =iv_ruleSize; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSize2494); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSize"


    // $ANTLR start "ruleSize"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1099:1: ruleSize returns [EObject current=null] : ( () otherlv_1= 'neighborsSize' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )? ) ;
    public final EObject ruleSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_neighborsFilter_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1102:28: ( ( () otherlv_1= 'neighborsSize' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )? ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1103:1: ( () otherlv_1= 'neighborsSize' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )? )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1103:1: ( () otherlv_1= 'neighborsSize' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )? )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1103:2: () otherlv_1= 'neighborsSize' ( (lv_neighborsFilter_2_0= rulePopulationRange ) )?
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1103:2: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1104:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSizeAccess().getSizeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleSize2540); 

                	newLeafNode(otherlv_1, grammarAccess.getSizeAccess().getNeighborsSizeKeyword_1());
                
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1113:1: ( (lv_neighborsFilter_2_0= rulePopulationRange ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==14) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1114:1: (lv_neighborsFilter_2_0= rulePopulationRange )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1114:1: (lv_neighborsFilter_2_0= rulePopulationRange )
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1115:3: lv_neighborsFilter_2_0= rulePopulationRange
                    {
                     
                    	        newCompositeNode(grammarAccess.getSizeAccess().getNeighborsFilterPopulationRangeParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePopulationRange_in_ruleSize2561);
                    lv_neighborsFilter_2_0=rulePopulationRange();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSizeRule());
                    	        }
                           		set(
                           			current, 
                           			"neighborsFilter",
                            		lv_neighborsFilter_2_0, 
                            		"PopulationRange");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSize"


    // $ANTLR start "entryRuleCurrentCellPopulation"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1139:1: entryRuleCurrentCellPopulation returns [EObject current=null] : iv_ruleCurrentCellPopulation= ruleCurrentCellPopulation EOF ;
    public final EObject entryRuleCurrentCellPopulation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCurrentCellPopulation = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1140:2: (iv_ruleCurrentCellPopulation= ruleCurrentCellPopulation EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1141:2: iv_ruleCurrentCellPopulation= ruleCurrentCellPopulation EOF
            {
             newCompositeNode(grammarAccess.getCurrentCellPopulationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCurrentCellPopulation_in_entryRuleCurrentCellPopulation2598);
            iv_ruleCurrentCellPopulation=ruleCurrentCellPopulation();

            state._fsp--;

             current =iv_ruleCurrentCellPopulation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCurrentCellPopulation2608); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCurrentCellPopulation"


    // $ANTLR start "ruleCurrentCellPopulation"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1148:1: ruleCurrentCellPopulation returns [EObject current=null] : ( () otherlv_1= 'CurrentVal' ) ;
    public final EObject ruleCurrentCellPopulation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1151:28: ( ( () otherlv_1= 'CurrentVal' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1152:1: ( () otherlv_1= 'CurrentVal' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1152:1: ( () otherlv_1= 'CurrentVal' )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1152:2: () otherlv_1= 'CurrentVal'
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1152:2: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1153:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCurrentCellPopulationAccess().getCurrentCellPopulationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleCurrentCellPopulation2654); 

                	newLeafNode(otherlv_1, grammarAccess.getCurrentCellPopulationAccess().getCurrentValKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCurrentCellPopulation"


    // $ANTLR start "entryRuleIntegerLiteral"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1170:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1171:2: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1172:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral2690);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;

             current =iv_ruleIntegerLiteral; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerLiteral2700); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1179:1: ruleIntegerLiteral returns [EObject current=null] : ( (lv_val_0_0= ruleEInt ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1182:28: ( ( (lv_val_0_0= ruleEInt ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1183:1: ( (lv_val_0_0= ruleEInt ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1183:1: ( (lv_val_0_0= ruleEInt ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1184:1: (lv_val_0_0= ruleEInt )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1184:1: (lv_val_0_0= ruleEInt )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1185:3: lv_val_0_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getIntegerLiteralAccess().getValEIntParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleIntegerLiteral2745);
            lv_val_0_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"val",
                    		lv_val_0_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleEInt"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1209:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1210:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1211:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt2781);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt2792); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1218:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1221:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1222:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1222:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1222:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1222:2: (kw= '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/cs/parser/antlr/internal/InternalRule.g:1223:2: kw= '-'
                    {
                    kw=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEInt2831); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt2848); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleCellularAutomata_in_entryRuleCellularAutomata75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCellularAutomata85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRule_in_ruleCellularAutomata130 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_ruleRule_in_entryRuleRule166 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRule176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleRule213 = new BitSet(new long[]{0x0000000000005000L});
        public static final BitSet FOLLOW_rulePopulationRange_in_ruleRule234 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRule247 = new BitSet(new long[]{0x0000007D88020010L});
        public static final BitSet FOLLOW_ruleConditional_in_ruleRule268 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleRule280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePopulationRange_in_entryRulePopulationRange316 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePopulationRange326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rulePopulationRange372 = new BitSet(new long[]{0x0000000008008010L});
        public static final BitSet FOLLOW_ruleEInt_in_rulePopulationRange393 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePopulationRange406 = new BitSet(new long[]{0x0000000008010010L});
        public static final BitSet FOLLOW_ruleEInt_in_rulePopulationRange427 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_rulePopulationRange440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditional_in_entryRuleConditional476 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConditional486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_ruleConditional533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleConditional560 = new BitSet(new long[]{0x0000007D88020010L});
        public static final BitSet FOLLOW_ruleConditional_in_ruleConditional581 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleConditional593 = new BitSet(new long[]{0x0000007D88020010L});
        public static final BitSet FOLLOW_ruleConditional_in_ruleConditional614 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleConditional626 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleConditional638 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleConditional650 = new BitSet(new long[]{0x0000007D88020010L});
        public static final BitSet FOLLOW_ruleConditional_in_ruleConditional671 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleConditional683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression720 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression777 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_21_in_ruleOrExpression798 = new BitSet(new long[]{0x0000007D88000010L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression819 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression857 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_ruleAndExpression914 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_22_in_ruleAndExpression935 = new BitSet(new long[]{0x0000007D88000010L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_ruleAndExpression956 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_entryRuleEqualExpression994 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEqualExpression1004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleEqualExpression1051 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_23_in_ruleEqualExpression1072 = new BitSet(new long[]{0x0000007D88000010L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleEqualExpression1093 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression1131 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparisonExpression1141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_ruleComparisonExpression1188 = new BitSet(new long[]{0x0000000003000002L});
        public static final BitSet FOLLOW_24_in_ruleComparisonExpression1211 = new BitSet(new long[]{0x0000007D88000010L});
        public static final BitSet FOLLOW_25_in_ruleComparisonExpression1240 = new BitSet(new long[]{0x0000007D88000010L});
        public static final BitSet FOLLOW_ruleAddExpression_in_ruleComparisonExpression1263 = new BitSet(new long[]{0x0000000003000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression1301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression1311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleAddExpression1358 = new BitSet(new long[]{0x000000000C000002L});
        public static final BitSet FOLLOW_26_in_ruleAddExpression1381 = new BitSet(new long[]{0x0000007D88000010L});
        public static final BitSet FOLLOW_27_in_ruleAddExpression1410 = new BitSet(new long[]{0x0000007D88000010L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleAddExpression1433 = new BitSet(new long[]{0x000000000C000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression1471 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression1481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultExpression1528 = new BitSet(new long[]{0x0000000070000002L});
        public static final BitSet FOLLOW_28_in_ruleMultExpression1551 = new BitSet(new long[]{0x0000007D88000010L});
        public static final BitSet FOLLOW_29_in_ruleMultExpression1580 = new BitSet(new long[]{0x0000007D88000010L});
        public static final BitSet FOLLOW_30_in_ruleMultExpression1609 = new BitSet(new long[]{0x0000007D88000010L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultExpression1632 = new BitSet(new long[]{0x0000000070000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression1670 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression1680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNeighborsExpression_in_ruleUnaryExpression1727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleUnaryExpression1754 = new BitSet(new long[]{0x0000007D08000010L});
        public static final BitSet FOLLOW_ruleNeighborsExpression_in_ruleUnaryExpression1775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleUnaryExpression1804 = new BitSet(new long[]{0x0000007D08000010L});
        public static final BitSet FOLLOW_ruleNeighborsExpression_in_ruleUnaryExpression1825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNeighborsExpression_in_entryRuleNeighborsExpression1862 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNeighborsExpression1872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleNeighborsExpression1910 = new BitSet(new long[]{0x0000007D88020010L});
        public static final BitSet FOLLOW_ruleConditional_in_ruleNeighborsExpression1932 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleNeighborsExpression1943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMax_in_ruleNeighborsExpression1972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMin_in_ruleNeighborsExpression1999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSum_in_ruleNeighborsExpression2026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSize_in_ruleNeighborsExpression2053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerLiteral_in_ruleNeighborsExpression2080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCurrentCellPopulation_in_ruleNeighborsExpression2107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMax_in_entryRuleMax2142 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMax2152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleMax2198 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rulePopulationRange_in_ruleMax2219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMin_in_entryRuleMin2256 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMin2266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleMin2312 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rulePopulationRange_in_ruleMin2333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSum_in_entryRuleSum2370 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSum2380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleSum2426 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rulePopulationRange_in_ruleSum2447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSize_in_entryRuleSize2484 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSize2494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleSize2540 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rulePopulationRange_in_ruleSize2561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCurrentCellPopulation_in_entryRuleCurrentCellPopulation2598 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCurrentCellPopulation2608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleCurrentCellPopulation2654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral2690 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral2700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleIntegerLiteral2745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt2792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleEInt2831 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2848 = new BitSet(new long[]{0x0000000000000002L});
    }


}