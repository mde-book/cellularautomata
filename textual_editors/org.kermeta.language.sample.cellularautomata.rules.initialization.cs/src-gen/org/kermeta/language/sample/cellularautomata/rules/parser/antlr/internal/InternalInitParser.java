package org.kermeta.language.sample.cellularautomata.rules.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.kermeta.language.sample.cellularautomata.rules.services.InitGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalInitParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'init'", "'by'", "'{'", "'}'", "','", "'('", "')'", "'..'", "'positionOn'", "'['", "']'", "'regularGeometry'", "'x'", "'circular'", "'if'", "'else'", "'|'", "'&'", "'=='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'Neumann'", "'Moore'"
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
    public String getGrammarFileName() { return "../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g"; }



     	private InitGrammarAccess grammarAccess;
     	
        public InternalInitParser(TokenStream input, InitGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "CellularAutomataInitialization";	
       	}
       	
       	@Override
       	protected InitGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleCellularAutomataInitialization"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:68:1: entryRuleCellularAutomataInitialization returns [EObject current=null] : iv_ruleCellularAutomataInitialization= ruleCellularAutomataInitialization EOF ;
    public final EObject entryRuleCellularAutomataInitialization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCellularAutomataInitialization = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:69:2: (iv_ruleCellularAutomataInitialization= ruleCellularAutomataInitialization EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:70:2: iv_ruleCellularAutomataInitialization= ruleCellularAutomataInitialization EOF
            {
             newCompositeNode(grammarAccess.getCellularAutomataInitializationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCellularAutomataInitialization_in_entryRuleCellularAutomataInitialization75);
            iv_ruleCellularAutomataInitialization=ruleCellularAutomataInitialization();

            state._fsp--;

             current =iv_ruleCellularAutomataInitialization; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCellularAutomataInitialization85); 

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
    // $ANTLR end "entryRuleCellularAutomataInitialization"


    // $ANTLR start "ruleCellularAutomataInitialization"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:77:1: ruleCellularAutomataInitialization returns [EObject current=null] : ( () ( (lv_geometry_1_0= ruleRegularGeometry ) )? ( (lv_seedRules_2_0= ruleRule ) ) ( (lv_seedRules_3_0= ruleRule ) )* ) ;
    public final EObject ruleCellularAutomataInitialization() throws RecognitionException {
        EObject current = null;

        EObject lv_geometry_1_0 = null;

        EObject lv_seedRules_2_0 = null;

        EObject lv_seedRules_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:80:28: ( ( () ( (lv_geometry_1_0= ruleRegularGeometry ) )? ( (lv_seedRules_2_0= ruleRule ) ) ( (lv_seedRules_3_0= ruleRule ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:81:1: ( () ( (lv_geometry_1_0= ruleRegularGeometry ) )? ( (lv_seedRules_2_0= ruleRule ) ) ( (lv_seedRules_3_0= ruleRule ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:81:1: ( () ( (lv_geometry_1_0= ruleRegularGeometry ) )? ( (lv_seedRules_2_0= ruleRule ) ) ( (lv_seedRules_3_0= ruleRule ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:81:2: () ( (lv_geometry_1_0= ruleRegularGeometry ) )? ( (lv_seedRules_2_0= ruleRule ) ) ( (lv_seedRules_3_0= ruleRule ) )*
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:81:2: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCellularAutomataInitializationAccess().getCellularAutomataInitializationAction_0(),
                        current);
                

            }

            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:87:2: ( (lv_geometry_1_0= ruleRegularGeometry ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==22) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:88:1: (lv_geometry_1_0= ruleRegularGeometry )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:88:1: (lv_geometry_1_0= ruleRegularGeometry )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:89:3: lv_geometry_1_0= ruleRegularGeometry
                    {
                     
                    	        newCompositeNode(grammarAccess.getCellularAutomataInitializationAccess().getGeometryRegularGeometryParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRegularGeometry_in_ruleCellularAutomataInitialization140);
                    lv_geometry_1_0=ruleRegularGeometry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCellularAutomataInitializationRule());
                    	        }
                           		set(
                           			current, 
                           			"geometry",
                            		lv_geometry_1_0, 
                            		"RegularGeometry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:105:3: ( (lv_seedRules_2_0= ruleRule ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:106:1: (lv_seedRules_2_0= ruleRule )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:106:1: (lv_seedRules_2_0= ruleRule )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:107:3: lv_seedRules_2_0= ruleRule
            {
             
            	        newCompositeNode(grammarAccess.getCellularAutomataInitializationAccess().getSeedRulesRuleParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_ruleCellularAutomataInitialization162);
            lv_seedRules_2_0=ruleRule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCellularAutomataInitializationRule());
            	        }
                   		add(
                   			current, 
                   			"seedRules",
                    		lv_seedRules_2_0, 
                    		"Rule");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:123:2: ( (lv_seedRules_3_0= ruleRule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:124:1: (lv_seedRules_3_0= ruleRule )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:124:1: (lv_seedRules_3_0= ruleRule )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:125:3: lv_seedRules_3_0= ruleRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCellularAutomataInitializationAccess().getSeedRulesRuleParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleRule_in_ruleCellularAutomataInitialization183);
            	    lv_seedRules_3_0=ruleRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCellularAutomataInitializationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"seedRules",
            	            		lv_seedRules_3_0, 
            	            		"Rule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleCellularAutomataInitialization"


    // $ANTLR start "entryRuleRule"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:149:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:150:2: (iv_ruleRule= ruleRule EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:151:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_entryRuleRule220);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRule230); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:158:1: ruleRule returns [EObject current=null] : (otherlv_0= 'init' ( (lv_filter_1_0= ruleCoordinateRanges ) )? otherlv_2= 'by' otherlv_3= '{' ( (lv_evaluatedVal_4_0= ruleConditional ) ) otherlv_5= '}' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_filter_1_0 = null;

        EObject lv_evaluatedVal_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:161:28: ( (otherlv_0= 'init' ( (lv_filter_1_0= ruleCoordinateRanges ) )? otherlv_2= 'by' otherlv_3= '{' ( (lv_evaluatedVal_4_0= ruleConditional ) ) otherlv_5= '}' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:162:1: (otherlv_0= 'init' ( (lv_filter_1_0= ruleCoordinateRanges ) )? otherlv_2= 'by' otherlv_3= '{' ( (lv_evaluatedVal_4_0= ruleConditional ) ) otherlv_5= '}' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:162:1: (otherlv_0= 'init' ( (lv_filter_1_0= ruleCoordinateRanges ) )? otherlv_2= 'by' otherlv_3= '{' ( (lv_evaluatedVal_4_0= ruleConditional ) ) otherlv_5= '}' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:162:3: otherlv_0= 'init' ( (lv_filter_1_0= ruleCoordinateRanges ) )? otherlv_2= 'by' otherlv_3= '{' ( (lv_evaluatedVal_4_0= ruleConditional ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRule267); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getInitKeyword_0());
                
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:166:1: ( (lv_filter_1_0= ruleCoordinateRanges ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:167:1: (lv_filter_1_0= ruleCoordinateRanges )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:167:1: (lv_filter_1_0= ruleCoordinateRanges )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:168:3: lv_filter_1_0= ruleCoordinateRanges
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleAccess().getFilterCoordinateRangesParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCoordinateRanges_in_ruleRule288);
                    lv_filter_1_0=ruleCoordinateRanges();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRuleRule());
                    	        }
                           		set(
                           			current, 
                           			"filter",
                            		lv_filter_1_0, 
                            		"CoordinateRanges");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRule301); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getByKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRule313); 

                	newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:192:1: ( (lv_evaluatedVal_4_0= ruleConditional ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:193:1: (lv_evaluatedVal_4_0= ruleConditional )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:193:1: (lv_evaluatedVal_4_0= ruleConditional )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:194:3: lv_evaluatedVal_4_0= ruleConditional
            {
             
            	        newCompositeNode(grammarAccess.getRuleAccess().getEvaluatedValConditionalParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_ruleRule334);
            lv_evaluatedVal_4_0=ruleConditional();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	        }
                   		set(
                   			current, 
                   			"evaluatedVal",
                    		lv_evaluatedVal_4_0, 
                    		"Conditional");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRule346); 

                	newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_5());
                

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


    // $ANTLR start "entryRuleCoordinateRanges"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:222:1: entryRuleCoordinateRanges returns [EObject current=null] : iv_ruleCoordinateRanges= ruleCoordinateRanges EOF ;
    public final EObject entryRuleCoordinateRanges() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinateRanges = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:223:2: (iv_ruleCoordinateRanges= ruleCoordinateRanges EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:224:2: iv_ruleCoordinateRanges= ruleCoordinateRanges EOF
            {
             newCompositeNode(grammarAccess.getCoordinateRangesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCoordinateRanges_in_entryRuleCoordinateRanges382);
            iv_ruleCoordinateRanges=ruleCoordinateRanges();

            state._fsp--;

             current =iv_ruleCoordinateRanges; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCoordinateRanges392); 

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
    // $ANTLR end "entryRuleCoordinateRanges"


    // $ANTLR start "ruleCoordinateRanges"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:231:1: ruleCoordinateRanges returns [EObject current=null] : ( () ( (lv_coordinateRanges_1_0= ruleCoordinateRange ) ) (otherlv_2= ',' ( (lv_coordinateRanges_3_0= ruleCoordinateRange ) ) )* ) ;
    public final EObject ruleCoordinateRanges() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_coordinateRanges_1_0 = null;

        EObject lv_coordinateRanges_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:234:28: ( ( () ( (lv_coordinateRanges_1_0= ruleCoordinateRange ) ) (otherlv_2= ',' ( (lv_coordinateRanges_3_0= ruleCoordinateRange ) ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:235:1: ( () ( (lv_coordinateRanges_1_0= ruleCoordinateRange ) ) (otherlv_2= ',' ( (lv_coordinateRanges_3_0= ruleCoordinateRange ) ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:235:1: ( () ( (lv_coordinateRanges_1_0= ruleCoordinateRange ) ) (otherlv_2= ',' ( (lv_coordinateRanges_3_0= ruleCoordinateRange ) ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:235:2: () ( (lv_coordinateRanges_1_0= ruleCoordinateRange ) ) (otherlv_2= ',' ( (lv_coordinateRanges_3_0= ruleCoordinateRange ) ) )*
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:235:2: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:236:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCoordinateRangesAccess().getCoordinateRangesAction_0(),
                        current);
                

            }

            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:241:2: ( (lv_coordinateRanges_1_0= ruleCoordinateRange ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:242:1: (lv_coordinateRanges_1_0= ruleCoordinateRange )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:242:1: (lv_coordinateRanges_1_0= ruleCoordinateRange )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:243:3: lv_coordinateRanges_1_0= ruleCoordinateRange
            {
             
            	        newCompositeNode(grammarAccess.getCoordinateRangesAccess().getCoordinateRangesCoordinateRangeParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleCoordinateRange_in_ruleCoordinateRanges447);
            lv_coordinateRanges_1_0=ruleCoordinateRange();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCoordinateRangesRule());
            	        }
                   		add(
                   			current, 
                   			"coordinateRanges",
                    		lv_coordinateRanges_1_0, 
                    		"CoordinateRange");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:259:2: (otherlv_2= ',' ( (lv_coordinateRanges_3_0= ruleCoordinateRange ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:259:4: otherlv_2= ',' ( (lv_coordinateRanges_3_0= ruleCoordinateRange ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCoordinateRanges460); 

            	        	newLeafNode(otherlv_2, grammarAccess.getCoordinateRangesAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:263:1: ( (lv_coordinateRanges_3_0= ruleCoordinateRange ) )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:264:1: (lv_coordinateRanges_3_0= ruleCoordinateRange )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:264:1: (lv_coordinateRanges_3_0= ruleCoordinateRange )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:265:3: lv_coordinateRanges_3_0= ruleCoordinateRange
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCoordinateRangesAccess().getCoordinateRangesCoordinateRangeParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCoordinateRange_in_ruleCoordinateRanges481);
            	    lv_coordinateRanges_3_0=ruleCoordinateRange();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCoordinateRangesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"coordinateRanges",
            	            		lv_coordinateRanges_3_0, 
            	            		"CoordinateRange");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleCoordinateRanges"


    // $ANTLR start "entryRuleCoordinateRange"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:289:1: entryRuleCoordinateRange returns [EObject current=null] : iv_ruleCoordinateRange= ruleCoordinateRange EOF ;
    public final EObject entryRuleCoordinateRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinateRange = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:290:2: (iv_ruleCoordinateRange= ruleCoordinateRange EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:291:2: iv_ruleCoordinateRange= ruleCoordinateRange EOF
            {
             newCompositeNode(grammarAccess.getCoordinateRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCoordinateRange_in_entryRuleCoordinateRange519);
            iv_ruleCoordinateRange=ruleCoordinateRange();

            state._fsp--;

             current =iv_ruleCoordinateRange; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCoordinateRange529); 

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
    // $ANTLR end "entryRuleCoordinateRange"


    // $ANTLR start "ruleCoordinateRange"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:298:1: ruleCoordinateRange returns [EObject current=null] : (otherlv_0= '(' ( (lv_dimensionRanges_1_0= ruleDimensionRange ) ) otherlv_2= ',' ( (lv_dimensionRanges_3_0= ruleDimensionRange ) ) otherlv_4= ')' ) ;
    public final EObject ruleCoordinateRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dimensionRanges_1_0 = null;

        EObject lv_dimensionRanges_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:301:28: ( (otherlv_0= '(' ( (lv_dimensionRanges_1_0= ruleDimensionRange ) ) otherlv_2= ',' ( (lv_dimensionRanges_3_0= ruleDimensionRange ) ) otherlv_4= ')' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:302:1: (otherlv_0= '(' ( (lv_dimensionRanges_1_0= ruleDimensionRange ) ) otherlv_2= ',' ( (lv_dimensionRanges_3_0= ruleDimensionRange ) ) otherlv_4= ')' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:302:1: (otherlv_0= '(' ( (lv_dimensionRanges_1_0= ruleDimensionRange ) ) otherlv_2= ',' ( (lv_dimensionRanges_3_0= ruleDimensionRange ) ) otherlv_4= ')' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:302:3: otherlv_0= '(' ( (lv_dimensionRanges_1_0= ruleDimensionRange ) ) otherlv_2= ',' ( (lv_dimensionRanges_3_0= ruleDimensionRange ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCoordinateRange566); 

                	newLeafNode(otherlv_0, grammarAccess.getCoordinateRangeAccess().getLeftParenthesisKeyword_0());
                
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:306:1: ( (lv_dimensionRanges_1_0= ruleDimensionRange ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:307:1: (lv_dimensionRanges_1_0= ruleDimensionRange )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:307:1: (lv_dimensionRanges_1_0= ruleDimensionRange )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:308:3: lv_dimensionRanges_1_0= ruleDimensionRange
            {
             
            	        newCompositeNode(grammarAccess.getCoordinateRangeAccess().getDimensionRangesDimensionRangeParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDimensionRange_in_ruleCoordinateRange587);
            lv_dimensionRanges_1_0=ruleDimensionRange();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCoordinateRangeRule());
            	        }
                   		add(
                   			current, 
                   			"dimensionRanges",
                    		lv_dimensionRanges_1_0, 
                    		"DimensionRange");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCoordinateRange599); 

                	newLeafNode(otherlv_2, grammarAccess.getCoordinateRangeAccess().getCommaKeyword_2());
                
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:328:1: ( (lv_dimensionRanges_3_0= ruleDimensionRange ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:329:1: (lv_dimensionRanges_3_0= ruleDimensionRange )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:329:1: (lv_dimensionRanges_3_0= ruleDimensionRange )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:330:3: lv_dimensionRanges_3_0= ruleDimensionRange
            {
             
            	        newCompositeNode(grammarAccess.getCoordinateRangeAccess().getDimensionRangesDimensionRangeParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDimensionRange_in_ruleCoordinateRange620);
            lv_dimensionRanges_3_0=ruleDimensionRange();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCoordinateRangeRule());
            	        }
                   		add(
                   			current, 
                   			"dimensionRanges",
                    		lv_dimensionRanges_3_0, 
                    		"DimensionRange");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleCoordinateRange632); 

                	newLeafNode(otherlv_4, grammarAccess.getCoordinateRangeAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleCoordinateRange"


    // $ANTLR start "entryRuleDimensionRange"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:358:1: entryRuleDimensionRange returns [EObject current=null] : iv_ruleDimensionRange= ruleDimensionRange EOF ;
    public final EObject entryRuleDimensionRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimensionRange = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:359:2: (iv_ruleDimensionRange= ruleDimensionRange EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:360:2: iv_ruleDimensionRange= ruleDimensionRange EOF
            {
             newCompositeNode(grammarAccess.getDimensionRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDimensionRange_in_entryRuleDimensionRange668);
            iv_ruleDimensionRange=ruleDimensionRange();

            state._fsp--;

             current =iv_ruleDimensionRange; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDimensionRange678); 

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
    // $ANTLR end "entryRuleDimensionRange"


    // $ANTLR start "ruleDimensionRange"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:367:1: ruleDimensionRange returns [EObject current=null] : ( ( (lv_lower_0_0= ruleEInt ) ) (otherlv_1= '..' ( (lv_upper_2_0= ruleEInt ) ) )? ) ;
    public final EObject ruleDimensionRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lower_0_0 = null;

        AntlrDatatypeRuleToken lv_upper_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:370:28: ( ( ( (lv_lower_0_0= ruleEInt ) ) (otherlv_1= '..' ( (lv_upper_2_0= ruleEInt ) ) )? ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:371:1: ( ( (lv_lower_0_0= ruleEInt ) ) (otherlv_1= '..' ( (lv_upper_2_0= ruleEInt ) ) )? )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:371:1: ( ( (lv_lower_0_0= ruleEInt ) ) (otherlv_1= '..' ( (lv_upper_2_0= ruleEInt ) ) )? )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:371:2: ( (lv_lower_0_0= ruleEInt ) ) (otherlv_1= '..' ( (lv_upper_2_0= ruleEInt ) ) )?
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:371:2: ( (lv_lower_0_0= ruleEInt ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:372:1: (lv_lower_0_0= ruleEInt )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:372:1: (lv_lower_0_0= ruleEInt )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:373:3: lv_lower_0_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getDimensionRangeAccess().getLowerEIntParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleDimensionRange724);
            lv_lower_0_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDimensionRangeRule());
            	        }
                   		set(
                   			current, 
                   			"lower",
                    		lv_lower_0_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:389:2: (otherlv_1= '..' ( (lv_upper_2_0= ruleEInt ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:389:4: otherlv_1= '..' ( (lv_upper_2_0= ruleEInt ) )
                    {
                    otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDimensionRange737); 

                        	newLeafNode(otherlv_1, grammarAccess.getDimensionRangeAccess().getFullStopFullStopKeyword_1_0());
                        
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:393:1: ( (lv_upper_2_0= ruleEInt ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:394:1: (lv_upper_2_0= ruleEInt )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:394:1: (lv_upper_2_0= ruleEInt )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:395:3: lv_upper_2_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getDimensionRangeAccess().getUpperEIntParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleDimensionRange758);
                    lv_upper_2_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDimensionRangeRule());
                    	        }
                           		set(
                           			current, 
                           			"upper",
                            		lv_upper_2_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleDimensionRange"


    // $ANTLR start "entryRuleLiteralsExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:419:1: entryRuleLiteralsExpression returns [EObject current=null] : iv_ruleLiteralsExpression= ruleLiteralsExpression EOF ;
    public final EObject entryRuleLiteralsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralsExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:420:2: (iv_ruleLiteralsExpression= ruleLiteralsExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:421:2: iv_ruleLiteralsExpression= ruleLiteralsExpression EOF
            {
             newCompositeNode(grammarAccess.getLiteralsExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_entryRuleLiteralsExpression796);
            iv_ruleLiteralsExpression=ruleLiteralsExpression();

            state._fsp--;

             current =iv_ruleLiteralsExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralsExpression806); 

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
    // $ANTLR end "entryRuleLiteralsExpression"


    // $ANTLR start "ruleLiteralsExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:428:1: ruleLiteralsExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')' ) | this_PositionLiteral_3= rulePositionLiteral | this_IntegerLiteral_4= ruleIntegerLiteral ) ;
    public final EObject ruleLiteralsExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Conditional_1 = null;

        EObject this_PositionLiteral_3 = null;

        EObject this_IntegerLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:431:28: ( ( (otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')' ) | this_PositionLiteral_3= rulePositionLiteral | this_IntegerLiteral_4= ruleIntegerLiteral ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:432:1: ( (otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')' ) | this_PositionLiteral_3= rulePositionLiteral | this_IntegerLiteral_4= ruleIntegerLiteral )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:432:1: ( (otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')' ) | this_PositionLiteral_3= rulePositionLiteral | this_IntegerLiteral_4= ruleIntegerLiteral )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            case RULE_INT:
            case 33:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:432:2: (otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')' )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:432:2: (otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')' )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:432:4: otherlv_0= '(' this_Conditional_1= ruleConditional otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleLiteralsExpression844); 

                        	newLeafNode(otherlv_0, grammarAccess.getLiteralsExpressionAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getLiteralsExpressionAccess().getConditionalParserRuleCall_0_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConditional_in_ruleLiteralsExpression866);
                    this_Conditional_1=ruleConditional();

                    state._fsp--;

                     
                            current = this_Conditional_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLiteralsExpression877); 

                        	newLeafNode(otherlv_2, grammarAccess.getLiteralsExpressionAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:451:5: this_PositionLiteral_3= rulePositionLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralsExpressionAccess().getPositionLiteralParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePositionLiteral_in_ruleLiteralsExpression906);
                    this_PositionLiteral_3=rulePositionLiteral();

                    state._fsp--;

                     
                            current = this_PositionLiteral_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:461:5: this_IntegerLiteral_4= ruleIntegerLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralsExpressionAccess().getIntegerLiteralParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerLiteral_in_ruleLiteralsExpression933);
                    this_IntegerLiteral_4=ruleIntegerLiteral();

                    state._fsp--;

                     
                            current = this_IntegerLiteral_4; 
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
    // $ANTLR end "ruleLiteralsExpression"


    // $ANTLR start "entryRulePositionLiteral"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:477:1: entryRulePositionLiteral returns [EObject current=null] : iv_rulePositionLiteral= rulePositionLiteral EOF ;
    public final EObject entryRulePositionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositionLiteral = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:478:2: (iv_rulePositionLiteral= rulePositionLiteral EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:479:2: iv_rulePositionLiteral= rulePositionLiteral EOF
            {
             newCompositeNode(grammarAccess.getPositionLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePositionLiteral_in_entryRulePositionLiteral968);
            iv_rulePositionLiteral=rulePositionLiteral();

            state._fsp--;

             current =iv_rulePositionLiteral; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePositionLiteral978); 

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
    // $ANTLR end "entryRulePositionLiteral"


    // $ANTLR start "rulePositionLiteral"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:486:1: rulePositionLiteral returns [EObject current=null] : ( () otherlv_1= 'positionOn' otherlv_2= '[' ( (lv_dimensionIndex_3_0= ruleEInt ) ) otherlv_4= ']' ) ;
    public final EObject rulePositionLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_dimensionIndex_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:489:28: ( ( () otherlv_1= 'positionOn' otherlv_2= '[' ( (lv_dimensionIndex_3_0= ruleEInt ) ) otherlv_4= ']' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:490:1: ( () otherlv_1= 'positionOn' otherlv_2= '[' ( (lv_dimensionIndex_3_0= ruleEInt ) ) otherlv_4= ']' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:490:1: ( () otherlv_1= 'positionOn' otherlv_2= '[' ( (lv_dimensionIndex_3_0= ruleEInt ) ) otherlv_4= ']' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:490:2: () otherlv_1= 'positionOn' otherlv_2= '[' ( (lv_dimensionIndex_3_0= ruleEInt ) ) otherlv_4= ']'
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:490:2: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:491:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPositionLiteralAccess().getPositionLiteralAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePositionLiteral1024); 

                	newLeafNode(otherlv_1, grammarAccess.getPositionLiteralAccess().getPositionOnKeyword_1());
                
            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulePositionLiteral1036); 

                	newLeafNode(otherlv_2, grammarAccess.getPositionLiteralAccess().getLeftSquareBracketKeyword_2());
                
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:504:1: ( (lv_dimensionIndex_3_0= ruleEInt ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:505:1: (lv_dimensionIndex_3_0= ruleEInt )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:505:1: (lv_dimensionIndex_3_0= ruleEInt )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:506:3: lv_dimensionIndex_3_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getPositionLiteralAccess().getDimensionIndexEIntParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulePositionLiteral1057);
            lv_dimensionIndex_3_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPositionLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"dimensionIndex",
                    		lv_dimensionIndex_3_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_rulePositionLiteral1069); 

                	newLeafNode(otherlv_4, grammarAccess.getPositionLiteralAccess().getRightSquareBracketKeyword_4());
                

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
    // $ANTLR end "rulePositionLiteral"


    // $ANTLR start "entryRuleRegularGeometry"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:534:1: entryRuleRegularGeometry returns [EObject current=null] : iv_ruleRegularGeometry= ruleRegularGeometry EOF ;
    public final EObject entryRuleRegularGeometry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularGeometry = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:535:2: (iv_ruleRegularGeometry= ruleRegularGeometry EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:536:2: iv_ruleRegularGeometry= ruleRegularGeometry EOF
            {
             newCompositeNode(grammarAccess.getRegularGeometryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRegularGeometry_in_entryRuleRegularGeometry1105);
            iv_ruleRegularGeometry=ruleRegularGeometry();

            state._fsp--;

             current =iv_ruleRegularGeometry; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRegularGeometry1115); 

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
    // $ANTLR end "entryRuleRegularGeometry"


    // $ANTLR start "ruleRegularGeometry"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:543:1: ruleRegularGeometry returns [EObject current=null] : ( () otherlv_1= 'regularGeometry' ( (lv_neighbors_2_0= ruleNeighborhood ) ) otherlv_3= '{' ( (lv_dimensions_4_0= ruleDimension ) ) (otherlv_5= 'x' ( (lv_dimensions_6_0= ruleDimension ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleRegularGeometry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_neighbors_2_0 = null;

        EObject lv_dimensions_4_0 = null;

        EObject lv_dimensions_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:546:28: ( ( () otherlv_1= 'regularGeometry' ( (lv_neighbors_2_0= ruleNeighborhood ) ) otherlv_3= '{' ( (lv_dimensions_4_0= ruleDimension ) ) (otherlv_5= 'x' ( (lv_dimensions_6_0= ruleDimension ) ) )* otherlv_7= '}' ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:547:1: ( () otherlv_1= 'regularGeometry' ( (lv_neighbors_2_0= ruleNeighborhood ) ) otherlv_3= '{' ( (lv_dimensions_4_0= ruleDimension ) ) (otherlv_5= 'x' ( (lv_dimensions_6_0= ruleDimension ) ) )* otherlv_7= '}' )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:547:1: ( () otherlv_1= 'regularGeometry' ( (lv_neighbors_2_0= ruleNeighborhood ) ) otherlv_3= '{' ( (lv_dimensions_4_0= ruleDimension ) ) (otherlv_5= 'x' ( (lv_dimensions_6_0= ruleDimension ) ) )* otherlv_7= '}' )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:547:2: () otherlv_1= 'regularGeometry' ( (lv_neighbors_2_0= ruleNeighborhood ) ) otherlv_3= '{' ( (lv_dimensions_4_0= ruleDimension ) ) (otherlv_5= 'x' ( (lv_dimensions_6_0= ruleDimension ) ) )* otherlv_7= '}'
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:547:2: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:548:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRegularGeometryAccess().getRegularGeometryAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleRegularGeometry1161); 

                	newLeafNode(otherlv_1, grammarAccess.getRegularGeometryAccess().getRegularGeometryKeyword_1());
                
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:557:1: ( (lv_neighbors_2_0= ruleNeighborhood ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:558:1: (lv_neighbors_2_0= ruleNeighborhood )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:558:1: (lv_neighbors_2_0= ruleNeighborhood )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:559:3: lv_neighbors_2_0= ruleNeighborhood
            {
             
            	        newCompositeNode(grammarAccess.getRegularGeometryAccess().getNeighborsNeighborhoodEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleNeighborhood_in_ruleRegularGeometry1182);
            lv_neighbors_2_0=ruleNeighborhood();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRegularGeometryRule());
            	        }
                   		set(
                   			current, 
                   			"neighbors",
                    		lv_neighbors_2_0, 
                    		"Neighborhood");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRegularGeometry1194); 

                	newLeafNode(otherlv_3, grammarAccess.getRegularGeometryAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:579:1: ( (lv_dimensions_4_0= ruleDimension ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:580:1: (lv_dimensions_4_0= ruleDimension )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:580:1: (lv_dimensions_4_0= ruleDimension )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:581:3: lv_dimensions_4_0= ruleDimension
            {
             
            	        newCompositeNode(grammarAccess.getRegularGeometryAccess().getDimensionsDimensionParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDimension_in_ruleRegularGeometry1215);
            lv_dimensions_4_0=ruleDimension();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRegularGeometryRule());
            	        }
                   		add(
                   			current, 
                   			"dimensions",
                    		lv_dimensions_4_0, 
                    		"Dimension");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:597:2: (otherlv_5= 'x' ( (lv_dimensions_6_0= ruleDimension ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:597:4: otherlv_5= 'x' ( (lv_dimensions_6_0= ruleDimension ) )
            	    {
            	    otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleRegularGeometry1228); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRegularGeometryAccess().getXKeyword_5_0());
            	        
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:601:1: ( (lv_dimensions_6_0= ruleDimension ) )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:602:1: (lv_dimensions_6_0= ruleDimension )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:602:1: (lv_dimensions_6_0= ruleDimension )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:603:3: lv_dimensions_6_0= ruleDimension
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRegularGeometryAccess().getDimensionsDimensionParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDimension_in_ruleRegularGeometry1249);
            	    lv_dimensions_6_0=ruleDimension();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRegularGeometryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dimensions",
            	            		lv_dimensions_6_0, 
            	            		"Dimension");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRegularGeometry1263); 

                	newLeafNode(otherlv_7, grammarAccess.getRegularGeometryAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleRegularGeometry"


    // $ANTLR start "entryRuleDimension"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:631:1: entryRuleDimension returns [EObject current=null] : iv_ruleDimension= ruleDimension EOF ;
    public final EObject entryRuleDimension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimension = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:632:2: (iv_ruleDimension= ruleDimension EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:633:2: iv_ruleDimension= ruleDimension EOF
            {
             newCompositeNode(grammarAccess.getDimensionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDimension_in_entryRuleDimension1299);
            iv_ruleDimension=ruleDimension();

            state._fsp--;

             current =iv_ruleDimension; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDimension1309); 

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
    // $ANTLR end "entryRuleDimension"


    // $ANTLR start "ruleDimension"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:640:1: ruleDimension returns [EObject current=null] : ( () ( (lv_extent_1_0= ruleEInt ) ) ( (lv_isCircular_2_0= 'circular' ) )? ) ;
    public final EObject ruleDimension() throws RecognitionException {
        EObject current = null;

        Token lv_isCircular_2_0=null;
        AntlrDatatypeRuleToken lv_extent_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:643:28: ( ( () ( (lv_extent_1_0= ruleEInt ) ) ( (lv_isCircular_2_0= 'circular' ) )? ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:644:1: ( () ( (lv_extent_1_0= ruleEInt ) ) ( (lv_isCircular_2_0= 'circular' ) )? )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:644:1: ( () ( (lv_extent_1_0= ruleEInt ) ) ( (lv_isCircular_2_0= 'circular' ) )? )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:644:2: () ( (lv_extent_1_0= ruleEInt ) ) ( (lv_isCircular_2_0= 'circular' ) )?
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:644:2: ()
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:645:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDimensionAccess().getDimensionAction_0(),
                        current);
                

            }

            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:650:2: ( (lv_extent_1_0= ruleEInt ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:651:1: (lv_extent_1_0= ruleEInt )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:651:1: (lv_extent_1_0= ruleEInt )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:652:3: lv_extent_1_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getDimensionAccess().getExtentEIntParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleDimension1364);
            lv_extent_1_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDimensionRule());
            	        }
                   		set(
                   			current, 
                   			"extent",
                    		lv_extent_1_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:668:2: ( (lv_isCircular_2_0= 'circular' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:669:1: (lv_isCircular_2_0= 'circular' )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:669:1: (lv_isCircular_2_0= 'circular' )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:670:3: lv_isCircular_2_0= 'circular'
                    {
                    lv_isCircular_2_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleDimension1382); 

                            newLeafNode(lv_isCircular_2_0, grammarAccess.getDimensionAccess().getIsCircularCircularKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDimensionRule());
                    	        }
                           		setWithLastConsumed(current, "isCircular", true, "circular");
                    	    

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
    // $ANTLR end "ruleDimension"


    // $ANTLR start "entryRuleConditional"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:691:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:692:2: (iv_ruleConditional= ruleConditional EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:693:2: iv_ruleConditional= ruleConditional EOF
            {
             newCompositeNode(grammarAccess.getConditionalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditional_in_entryRuleConditional1432);
            iv_ruleConditional=ruleConditional();

            state._fsp--;

             current =iv_ruleConditional; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConditional1442); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:700:1: ruleConditional returns [EObject current=null] : (this_OrExpression_0= ruleOrExpression | ( () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}' ) ) ;
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
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:703:28: ( (this_OrExpression_0= ruleOrExpression | ( () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}' ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:704:1: (this_OrExpression_0= ruleOrExpression | ( () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}' ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:704:1: (this_OrExpression_0= ruleOrExpression | ( () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT||LA9_0==16||LA9_0==19||LA9_0==33||LA9_0==37) ) {
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
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:705:5: this_OrExpression_0= ruleOrExpression
                    {
                     
                            newCompositeNode(grammarAccess.getConditionalAccess().getOrExpressionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_ruleConditional1489);
                    this_OrExpression_0=ruleOrExpression();

                    state._fsp--;

                     
                            current = this_OrExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:714:6: ( () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}' )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:714:6: ( () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}' )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:714:7: () otherlv_2= 'if' ( (lv_condition_3_0= ruleConditional ) ) otherlv_4= '{' ( (lv_ifTrueExpression_5_0= ruleConditional ) ) otherlv_6= '}' otherlv_7= 'else' otherlv_8= '{' ( (lv_ifFalseExpression_9_0= ruleConditional ) ) otherlv_10= '}'
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:714:7: ()
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:715:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConditionalAccess().getConditionalAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleConditional1516); 

                        	newLeafNode(otherlv_2, grammarAccess.getConditionalAccess().getIfKeyword_1_1());
                        
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:724:1: ( (lv_condition_3_0= ruleConditional ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:725:1: (lv_condition_3_0= ruleConditional )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:725:1: (lv_condition_3_0= ruleConditional )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:726:3: lv_condition_3_0= ruleConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionalAccess().getConditionConditionalParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConditional_in_ruleConditional1537);
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

                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleConditional1549); 

                        	newLeafNode(otherlv_4, grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_1_3());
                        
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:746:1: ( (lv_ifTrueExpression_5_0= ruleConditional ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:747:1: (lv_ifTrueExpression_5_0= ruleConditional )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:747:1: (lv_ifTrueExpression_5_0= ruleConditional )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:748:3: lv_ifTrueExpression_5_0= ruleConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionalAccess().getIfTrueExpressionConditionalParserRuleCall_1_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConditional_in_ruleConditional1570);
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

                    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleConditional1582); 

                        	newLeafNode(otherlv_6, grammarAccess.getConditionalAccess().getRightCurlyBracketKeyword_1_5());
                        
                    otherlv_7=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleConditional1594); 

                        	newLeafNode(otherlv_7, grammarAccess.getConditionalAccess().getElseKeyword_1_6());
                        
                    otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleConditional1606); 

                        	newLeafNode(otherlv_8, grammarAccess.getConditionalAccess().getLeftCurlyBracketKeyword_1_7());
                        
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:776:1: ( (lv_ifFalseExpression_9_0= ruleConditional ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:777:1: (lv_ifFalseExpression_9_0= ruleConditional )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:777:1: (lv_ifFalseExpression_9_0= ruleConditional )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:778:3: lv_ifFalseExpression_9_0= ruleConditional
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionalAccess().getIfFalseExpressionConditionalParserRuleCall_1_8_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConditional_in_ruleConditional1627);
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

                    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleConditional1639); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:806:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:807:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:808:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_entryRuleOrExpression1676);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrExpression1686); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:815:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:818:28: ( (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:819:1: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:819:1: (this_AndExpression_0= ruleAndExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:820:5: this_AndExpression_0= ruleAndExpression ( () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleOrExpression1733);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;

             
                    current = this_AndExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:828:1: ( () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:828:2: () otherlv_2= '|' ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:828:2: ()
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:829:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrExpressionAccess().getOrLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleOrExpression1754); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getVerticalLineKeyword_1_1());
            	        
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:838:1: ( (lv_right_3_0= ruleAndExpression ) )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:839:1: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:839:1: (lv_right_3_0= ruleAndExpression )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:840:3: lv_right_3_0= ruleAndExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleOrExpression1775);
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:864:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:865:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:866:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_entryRuleAndExpression1813);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndExpression1823); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:873:1: ruleAndExpression returns [EObject current=null] : (this_EqualExpression_0= ruleEqualExpression ( () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EqualExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:876:28: ( (this_EqualExpression_0= ruleEqualExpression ( () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:877:1: (this_EqualExpression_0= ruleEqualExpression ( () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:877:1: (this_EqualExpression_0= ruleEqualExpression ( () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:878:5: this_EqualExpression_0= ruleEqualExpression ( () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_ruleAndExpression1870);
            this_EqualExpression_0=ruleEqualExpression();

            state._fsp--;

             
                    current = this_EqualExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:886:1: ( () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:886:2: () otherlv_2= '&' ( (lv_right_3_0= ruleEqualExpression ) )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:886:2: ()
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:887:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndExpressionAccess().getAndLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAndExpression1891); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAmpersandKeyword_1_1());
            	        
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:896:1: ( (lv_right_3_0= ruleEqualExpression ) )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:897:1: (lv_right_3_0= ruleEqualExpression )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:897:1: (lv_right_3_0= ruleEqualExpression )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:898:3: lv_right_3_0= ruleEqualExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightEqualExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_ruleAndExpression1912);
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
            	    break loop11;
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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:922:1: entryRuleEqualExpression returns [EObject current=null] : iv_ruleEqualExpression= ruleEqualExpression EOF ;
    public final EObject entryRuleEqualExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:923:2: (iv_ruleEqualExpression= ruleEqualExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:924:2: iv_ruleEqualExpression= ruleEqualExpression EOF
            {
             newCompositeNode(grammarAccess.getEqualExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_entryRuleEqualExpression1950);
            iv_ruleEqualExpression=ruleEqualExpression();

            state._fsp--;

             current =iv_ruleEqualExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEqualExpression1960); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:931:1: ruleEqualExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleEqualExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ComparisonExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:934:28: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:935:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:935:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:936:5: this_ComparisonExpression_0= ruleComparisonExpression ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getEqualExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_ruleEqualExpression2007);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;

             
                    current = this_ComparisonExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:944:1: ( () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:944:2: () otherlv_2= '==' ( (lv_right_3_0= ruleComparisonExpression ) )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:944:2: ()
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:945:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getEqualExpressionAccess().getEqualLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEqualExpression2028); 

            	        	newLeafNode(otherlv_2, grammarAccess.getEqualExpressionAccess().getEqualsSignEqualsSignKeyword_1_1());
            	        
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:954:1: ( (lv_right_3_0= ruleComparisonExpression ) )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:955:1: (lv_right_3_0= ruleComparisonExpression )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:955:1: (lv_right_3_0= ruleComparisonExpression )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:956:3: lv_right_3_0= ruleComparisonExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqualExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_ruleEqualExpression2049);
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
    // $ANTLR end "ruleEqualExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:980:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:981:2: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:982:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
             newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression2087);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;

             current =iv_ruleComparisonExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparisonExpression2097); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:989:1: ruleComparisonExpression returns [EObject current=null] : (this_AddExpression_0= ruleAddExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) ) )* ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_AddExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:992:28: ( (this_AddExpression_0= ruleAddExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:993:1: (this_AddExpression_0= ruleAddExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:993:1: (this_AddExpression_0= ruleAddExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:994:5: this_AddExpression_0= ruleAddExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getComparisonExpressionAccess().getAddExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_ruleComparisonExpression2144);
            this_AddExpression_0=ruleAddExpression();

            state._fsp--;

             
                    current = this_AddExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1002:1: ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=30 && LA14_0<=31)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1002:2: ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) ) ( (lv_right_5_0= ruleAddExpression ) )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1002:2: ( ( () otherlv_2= '>' ) | ( () otherlv_4= '<' ) )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==30) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==31) ) {
            	        alt13=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1002:3: ( () otherlv_2= '>' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1002:3: ( () otherlv_2= '>' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1002:4: () otherlv_2= '>'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1002:4: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1003:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getComparisonExpressionAccess().getGreaterLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleComparisonExpression2167); 

            	                	newLeafNode(otherlv_2, grammarAccess.getComparisonExpressionAccess().getGreaterThanSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1013:6: ( () otherlv_4= '<' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1013:6: ( () otherlv_4= '<' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1013:7: () otherlv_4= '<'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1013:7: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1014:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getComparisonExpressionAccess().getLowerLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleComparisonExpression2196); 

            	                	newLeafNode(otherlv_4, grammarAccess.getComparisonExpressionAccess().getLessThanSignKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1023:3: ( (lv_right_5_0= ruleAddExpression ) )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1024:1: (lv_right_5_0= ruleAddExpression )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1024:1: (lv_right_5_0= ruleAddExpression )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1025:3: lv_right_5_0= ruleAddExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightAddExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_ruleComparisonExpression2219);
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
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleAddExpression"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1049:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1050:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1051:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
             newCompositeNode(grammarAccess.getAddExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_entryRuleAddExpression2257);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;

             current =iv_ruleAddExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddExpression2267); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1058:1: ruleAddExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MultExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1061:28: ( (this_MultExpression_0= ruleMultExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1062:1: (this_MultExpression_0= ruleMultExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1062:1: (this_MultExpression_0= ruleMultExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1063:5: this_MultExpression_0= ruleMultExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAddExpressionAccess().getMultExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleAddExpression2314);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;

             
                    current = this_MultExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1071:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=32 && LA16_0<=33)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1071:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultExpression ) )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1071:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==32) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==33) ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1071:3: ( () otherlv_2= '+' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1071:3: ( () otherlv_2= '+' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1071:4: () otherlv_2= '+'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1071:4: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1072:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAddExpressionAccess().getAddLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAddExpression2337); 

            	                	newLeafNode(otherlv_2, grammarAccess.getAddExpressionAccess().getPlusSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1082:6: ( () otherlv_4= '-' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1082:6: ( () otherlv_4= '-' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1082:7: () otherlv_4= '-'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1082:7: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1083:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAddExpressionAccess().getMinusLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAddExpression2366); 

            	                	newLeafNode(otherlv_4, grammarAccess.getAddExpressionAccess().getHyphenMinusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1092:3: ( (lv_right_5_0= ruleMultExpression ) )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1093:1: (lv_right_5_0= ruleMultExpression )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1093:1: (lv_right_5_0= ruleMultExpression )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1094:3: lv_right_5_0= ruleMultExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAddExpressionAccess().getRightMultExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleAddExpression2389);
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
            	    break loop16;
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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1118:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1119:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1120:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
             newCompositeNode(grammarAccess.getMultExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_entryRuleMultExpression2427);
            iv_ruleMultExpression=ruleMultExpression();

            state._fsp--;

             current =iv_ruleMultExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultExpression2437); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1127:1: ruleMultExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_UnaryExpression_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1130:28: ( (this_UnaryExpression_0= ruleUnaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) ) )* ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1131:1: (this_UnaryExpression_0= ruleUnaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) ) )* )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1131:1: (this_UnaryExpression_0= ruleUnaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) ) )* )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1132:5: this_UnaryExpression_0= ruleUnaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_ruleMultExpression2484);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;

             
                    current = this_UnaryExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1140:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=34 && LA18_0<=36)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1140:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= ruleUnaryExpression ) )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1140:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) )
            	    int alt17=3;
            	    switch ( input.LA(1) ) {
            	    case 34:
            	        {
            	        alt17=1;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt17=2;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt17=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt17) {
            	        case 1 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1140:3: ( () otherlv_2= '*' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1140:3: ( () otherlv_2= '*' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1140:4: () otherlv_2= '*'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1140:4: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1141:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultExpressionAccess().getMultLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleMultExpression2507); 

            	                	newLeafNode(otherlv_2, grammarAccess.getMultExpressionAccess().getAsteriskKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1151:6: ( () otherlv_4= '/' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1151:6: ( () otherlv_4= '/' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1151:7: () otherlv_4= '/'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1151:7: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1152:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultExpressionAccess().getDivLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleMultExpression2536); 

            	                	newLeafNode(otherlv_4, grammarAccess.getMultExpressionAccess().getSolidusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1162:6: ( () otherlv_6= '%' )
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1162:6: ( () otherlv_6= '%' )
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1162:7: () otherlv_6= '%'
            	            {
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1162:7: ()
            	            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1163:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultExpressionAccess().getModLeftAction_1_0_2_0(),
            	                        current);
            	                

            	            }

            	            otherlv_6=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleMultExpression2565); 

            	                	newLeafNode(otherlv_6, grammarAccess.getMultExpressionAccess().getPercentSignKeyword_1_0_2_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1172:3: ( (lv_right_7_0= ruleUnaryExpression ) )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1173:1: (lv_right_7_0= ruleUnaryExpression )
            	    {
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1173:1: (lv_right_7_0= ruleUnaryExpression )
            	    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1174:3: lv_right_7_0= ruleUnaryExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultExpressionAccess().getRightUnaryExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_ruleMultExpression2588);
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
            	    break loop18;
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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1198:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1199:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1200:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression2626);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryExpression2636); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1207:1: ruleUnaryExpression returns [EObject current=null] : (this_LiteralsExpression_0= ruleLiteralsExpression | ( () otherlv_2= '!' ( (lv_target_3_0= ruleLiteralsExpression ) ) ) | ( () otherlv_5= '-' ( (lv_target_6_0= ruleLiteralsExpression ) ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_LiteralsExpression_0 = null;

        EObject lv_target_3_0 = null;

        EObject lv_target_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1210:28: ( (this_LiteralsExpression_0= ruleLiteralsExpression | ( () otherlv_2= '!' ( (lv_target_3_0= ruleLiteralsExpression ) ) ) | ( () otherlv_5= '-' ( (lv_target_6_0= ruleLiteralsExpression ) ) ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1211:1: (this_LiteralsExpression_0= ruleLiteralsExpression | ( () otherlv_2= '!' ( (lv_target_3_0= ruleLiteralsExpression ) ) ) | ( () otherlv_5= '-' ( (lv_target_6_0= ruleLiteralsExpression ) ) ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1211:1: (this_LiteralsExpression_0= ruleLiteralsExpression | ( () otherlv_2= '!' ( (lv_target_3_0= ruleLiteralsExpression ) ) ) | ( () otherlv_5= '-' ( (lv_target_6_0= ruleLiteralsExpression ) ) ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 16:
            case 19:
                {
                alt19=1;
                }
                break;
            case 33:
                {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==RULE_INT) ) {
                    alt19=1;
                }
                else if ( (LA19_2==16||LA19_2==19||LA19_2==33) ) {
                    alt19=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;
                }
                }
                break;
            case 37:
                {
                alt19=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1212:5: this_LiteralsExpression_0= ruleLiteralsExpression
                    {
                     
                            newCompositeNode(grammarAccess.getUnaryExpressionAccess().getLiteralsExpressionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_ruleUnaryExpression2683);
                    this_LiteralsExpression_0=ruleLiteralsExpression();

                    state._fsp--;

                     
                            current = this_LiteralsExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1221:6: ( () otherlv_2= '!' ( (lv_target_3_0= ruleLiteralsExpression ) ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1221:6: ( () otherlv_2= '!' ( (lv_target_3_0= ruleLiteralsExpression ) ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1221:7: () otherlv_2= '!' ( (lv_target_3_0= ruleLiteralsExpression ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1221:7: ()
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1222:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getUnaryExpressionAccess().getNotAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleUnaryExpression2710); 

                        	newLeafNode(otherlv_2, grammarAccess.getUnaryExpressionAccess().getExclamationMarkKeyword_1_1());
                        
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1231:1: ( (lv_target_3_0= ruleLiteralsExpression ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1232:1: (lv_target_3_0= ruleLiteralsExpression )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1232:1: (lv_target_3_0= ruleLiteralsExpression )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1233:3: lv_target_3_0= ruleLiteralsExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getTargetLiteralsExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_ruleUnaryExpression2731);
                    lv_target_3_0=ruleLiteralsExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"target",
                            		lv_target_3_0, 
                            		"LiteralsExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1250:6: ( () otherlv_5= '-' ( (lv_target_6_0= ruleLiteralsExpression ) ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1250:6: ( () otherlv_5= '-' ( (lv_target_6_0= ruleLiteralsExpression ) ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1250:7: () otherlv_5= '-' ( (lv_target_6_0= ruleLiteralsExpression ) )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1250:7: ()
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1251:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getUnaryExpressionAccess().getUMinusAction_2_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleUnaryExpression2760); 

                        	newLeafNode(otherlv_5, grammarAccess.getUnaryExpressionAccess().getHyphenMinusKeyword_2_1());
                        
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1260:1: ( (lv_target_6_0= ruleLiteralsExpression ) )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1261:1: (lv_target_6_0= ruleLiteralsExpression )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1261:1: (lv_target_6_0= ruleLiteralsExpression )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1262:3: lv_target_6_0= ruleLiteralsExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getTargetLiteralsExpressionParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralsExpression_in_ruleUnaryExpression2781);
                    lv_target_6_0=ruleLiteralsExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"target",
                            		lv_target_6_0, 
                            		"LiteralsExpression");
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


    // $ANTLR start "entryRuleIntegerLiteral"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1286:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1287:2: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1288:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral2818);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;

             current =iv_ruleIntegerLiteral; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerLiteral2828); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1295:1: ruleIntegerLiteral returns [EObject current=null] : ( (lv_val_0_0= ruleEInt ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1298:28: ( ( (lv_val_0_0= ruleEInt ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1299:1: ( (lv_val_0_0= ruleEInt ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1299:1: ( (lv_val_0_0= ruleEInt ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1300:1: (lv_val_0_0= ruleEInt )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1300:1: (lv_val_0_0= ruleEInt )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1301:3: lv_val_0_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getIntegerLiteralAccess().getValEIntParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleIntegerLiteral2873);
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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1325:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1326:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1327:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt2909);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt2920); 

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
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1334:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1337:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1338:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1338:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1338:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1338:2: (kw= '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1339:2: kw= '-'
                    {
                    kw=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleEInt2959); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt2976); 

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


    // $ANTLR start "ruleNeighborhood"
    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1359:1: ruleNeighborhood returns [Enumerator current=null] : ( (enumLiteral_0= 'Neumann' ) | (enumLiteral_1= 'Moore' ) ) ;
    public final Enumerator ruleNeighborhood() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1361:28: ( ( (enumLiteral_0= 'Neumann' ) | (enumLiteral_1= 'Moore' ) ) )
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1362:1: ( (enumLiteral_0= 'Neumann' ) | (enumLiteral_1= 'Moore' ) )
            {
            // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1362:1: ( (enumLiteral_0= 'Neumann' ) | (enumLiteral_1= 'Moore' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            else if ( (LA21_0==39) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1362:2: (enumLiteral_0= 'Neumann' )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1362:2: (enumLiteral_0= 'Neumann' )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1362:4: enumLiteral_0= 'Neumann'
                    {
                    enumLiteral_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleNeighborhood3035); 

                            current = grammarAccess.getNeighborhoodAccess().getNeumannEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getNeighborhoodAccess().getNeumannEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1368:6: (enumLiteral_1= 'Moore' )
                    {
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1368:6: (enumLiteral_1= 'Moore' )
                    // ../org.kermeta.language.sample.cellularautomata.rules.initialization.cs/src-gen/org/kermeta/language/sample/cellularautomata/rules/parser/antlr/internal/InternalInit.g:1368:8: enumLiteral_1= 'Moore'
                    {
                    enumLiteral_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleNeighborhood3052); 

                            current = grammarAccess.getNeighborhoodAccess().getMooreEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getNeighborhoodAccess().getMooreEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleNeighborhood"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleCellularAutomataInitialization_in_entryRuleCellularAutomataInitialization75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCellularAutomataInitialization85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRegularGeometry_in_ruleCellularAutomataInitialization140 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_ruleRule_in_ruleCellularAutomataInitialization162 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_ruleRule_in_ruleCellularAutomataInitialization183 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_ruleRule_in_entryRuleRule220 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRule230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleRule267 = new BitSet(new long[]{0x0000000000011000L});
        public static final BitSet FOLLOW_ruleCoordinateRanges_in_ruleRule288 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRule301 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleRule313 = new BitSet(new long[]{0x0000002202090010L});
        public static final BitSet FOLLOW_ruleConditional_in_ruleRule334 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRule346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCoordinateRanges_in_entryRuleCoordinateRanges382 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCoordinateRanges392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCoordinateRange_in_ruleCoordinateRanges447 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_15_in_ruleCoordinateRanges460 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_ruleCoordinateRange_in_ruleCoordinateRanges481 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_ruleCoordinateRange_in_entryRuleCoordinateRange519 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCoordinateRange529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleCoordinateRange566 = new BitSet(new long[]{0x0000000200090010L});
        public static final BitSet FOLLOW_ruleDimensionRange_in_ruleCoordinateRange587 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleCoordinateRange599 = new BitSet(new long[]{0x0000000200090010L});
        public static final BitSet FOLLOW_ruleDimensionRange_in_ruleCoordinateRange620 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleCoordinateRange632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDimensionRange_in_entryRuleDimensionRange668 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDimensionRange678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleDimensionRange724 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleDimensionRange737 = new BitSet(new long[]{0x0000000200090010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleDimensionRange758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_entryRuleLiteralsExpression796 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralsExpression806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleLiteralsExpression844 = new BitSet(new long[]{0x0000002202090010L});
        public static final BitSet FOLLOW_ruleConditional_in_ruleLiteralsExpression866 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleLiteralsExpression877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePositionLiteral_in_ruleLiteralsExpression906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerLiteral_in_ruleLiteralsExpression933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePositionLiteral_in_entryRulePositionLiteral968 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePositionLiteral978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rulePositionLiteral1024 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_rulePositionLiteral1036 = new BitSet(new long[]{0x0000000200090010L});
        public static final BitSet FOLLOW_ruleEInt_in_rulePositionLiteral1057 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_rulePositionLiteral1069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRegularGeometry_in_entryRuleRegularGeometry1105 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRegularGeometry1115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleRegularGeometry1161 = new BitSet(new long[]{0x000000C000000000L});
        public static final BitSet FOLLOW_ruleNeighborhood_in_ruleRegularGeometry1182 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleRegularGeometry1194 = new BitSet(new long[]{0x0000000200090010L});
        public static final BitSet FOLLOW_ruleDimension_in_ruleRegularGeometry1215 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_23_in_ruleRegularGeometry1228 = new BitSet(new long[]{0x0000000200090010L});
        public static final BitSet FOLLOW_ruleDimension_in_ruleRegularGeometry1249 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_14_in_ruleRegularGeometry1263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDimension_in_entryRuleDimension1299 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDimension1309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleDimension1364 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleDimension1382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditional_in_entryRuleConditional1432 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConditional1442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_ruleConditional1489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleConditional1516 = new BitSet(new long[]{0x0000002202090010L});
        public static final BitSet FOLLOW_ruleConditional_in_ruleConditional1537 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleConditional1549 = new BitSet(new long[]{0x0000002202090010L});
        public static final BitSet FOLLOW_ruleConditional_in_ruleConditional1570 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleConditional1582 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleConditional1594 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleConditional1606 = new BitSet(new long[]{0x0000002202090010L});
        public static final BitSet FOLLOW_ruleConditional_in_ruleConditional1627 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleConditional1639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression1676 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression1686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression1733 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_27_in_ruleOrExpression1754 = new BitSet(new long[]{0x0000002200090010L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression1775 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression1813 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression1823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_ruleAndExpression1870 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleAndExpression1891 = new BitSet(new long[]{0x0000002200090010L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_ruleAndExpression1912 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_entryRuleEqualExpression1950 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEqualExpression1960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleEqualExpression2007 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleEqualExpression2028 = new BitSet(new long[]{0x0000002200090010L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleEqualExpression2049 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression2087 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparisonExpression2097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_ruleComparisonExpression2144 = new BitSet(new long[]{0x00000000C0000002L});
        public static final BitSet FOLLOW_30_in_ruleComparisonExpression2167 = new BitSet(new long[]{0x0000002200090010L});
        public static final BitSet FOLLOW_31_in_ruleComparisonExpression2196 = new BitSet(new long[]{0x0000002200090010L});
        public static final BitSet FOLLOW_ruleAddExpression_in_ruleComparisonExpression2219 = new BitSet(new long[]{0x00000000C0000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression2257 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression2267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleAddExpression2314 = new BitSet(new long[]{0x0000000300000002L});
        public static final BitSet FOLLOW_32_in_ruleAddExpression2337 = new BitSet(new long[]{0x0000002200090010L});
        public static final BitSet FOLLOW_33_in_ruleAddExpression2366 = new BitSet(new long[]{0x0000002200090010L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleAddExpression2389 = new BitSet(new long[]{0x0000000300000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression2427 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression2437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultExpression2484 = new BitSet(new long[]{0x0000001C00000002L});
        public static final BitSet FOLLOW_34_in_ruleMultExpression2507 = new BitSet(new long[]{0x0000002200090010L});
        public static final BitSet FOLLOW_35_in_ruleMultExpression2536 = new BitSet(new long[]{0x0000002200090010L});
        public static final BitSet FOLLOW_36_in_ruleMultExpression2565 = new BitSet(new long[]{0x0000002200090010L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultExpression2588 = new BitSet(new long[]{0x0000001C00000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression2626 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression2636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_ruleUnaryExpression2683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleUnaryExpression2710 = new BitSet(new long[]{0x0000000200090010L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_ruleUnaryExpression2731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleUnaryExpression2760 = new BitSet(new long[]{0x0000000200090010L});
        public static final BitSet FOLLOW_ruleLiteralsExpression_in_ruleUnaryExpression2781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral2818 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral2828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleIntegerLiteral2873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2909 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt2920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleEInt2959 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleNeighborhood3035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleNeighborhood3052 = new BitSet(new long[]{0x0000000000000002L});
    }


}