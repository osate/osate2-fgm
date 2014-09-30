package org.osate.xtext.aadl2.featuregroupmapping.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.osate.xtext.aadl2.featuregroupmapping.services.FeatureGroupMappingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFeatureGroupMappingParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_35", "KEYWORD_34", "KEYWORD_32", "KEYWORD_33", "KEYWORD_27", "KEYWORD_28", "KEYWORD_29", "KEYWORD_30", "KEYWORD_31", "KEYWORD_24", "KEYWORD_25", "KEYWORD_26", "KEYWORD_23", "KEYWORD_19", "KEYWORD_20", "KEYWORD_21", "KEYWORD_22", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "KEYWORD_18", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "RULE_SL_COMMENT", "RULE_ID", "RULE_WS", "RULE_DIGIT", "RULE_EXPONENT", "RULE_INT_EXPONENT", "RULE_REAL_LIT", "RULE_BASED_INTEGER", "RULE_INTEGER_LIT", "RULE_EXTENDED_DIGIT", "RULE_STRING"
    };
    public static final int RULE_ID=40;
    public static final int RULE_INTEGER_LIT=47;
    public static final int RULE_REAL_LIT=45;
    public static final int KEYWORD_19=17;
    public static final int KEYWORD_17=24;
    public static final int KEYWORD_18=25;
    public static final int KEYWORD_15=22;
    public static final int KEYWORD_16=23;
    public static final int KEYWORD_13=38;
    public static final int KEYWORD_14=21;
    public static final int KEYWORD_11=36;
    public static final int KEYWORD_12=37;
    public static final int EOF=-1;
    public static final int KEYWORD_10=35;
    public static final int KEYWORD_6=31;
    public static final int KEYWORD_7=32;
    public static final int KEYWORD_8=33;
    public static final int KEYWORD_9=34;
    public static final int KEYWORD_28=9;
    public static final int KEYWORD_29=10;
    public static final int KEYWORD_24=13;
    public static final int KEYWORD_25=14;
    public static final int KEYWORD_26=15;
    public static final int KEYWORD_27=8;
    public static final int KEYWORD_20=18;
    public static final int KEYWORD_21=19;
    public static final int KEYWORD_22=20;
    public static final int KEYWORD_23=16;
    public static final int RULE_EXTENDED_DIGIT=48;
    public static final int KEYWORD_30=11;
    public static final int KEYWORD_1=26;
    public static final int KEYWORD_34=5;
    public static final int KEYWORD_5=30;
    public static final int KEYWORD_33=7;
    public static final int KEYWORD_4=29;
    public static final int KEYWORD_32=6;
    public static final int KEYWORD_3=28;
    public static final int KEYWORD_31=12;
    public static final int KEYWORD_2=27;
    public static final int RULE_BASED_INTEGER=46;
    public static final int RULE_SL_COMMENT=39;
    public static final int KEYWORD_35=4;
    public static final int RULE_STRING=49;
    public static final int RULE_EXPONENT=43;
    public static final int RULE_INT_EXPONENT=44;
    public static final int RULE_WS=41;
    public static final int RULE_DIGIT=42;

    // delegates
    // delegators


        public InternalFeatureGroupMappingParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFeatureGroupMappingParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFeatureGroupMappingParser.tokenNames; }
    public String getGrammarFileName() { return "../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g"; }




    	private FeatureGroupMappingGrammarAccess grammarAccess;
    	 	
    	public InternalFeatureGroupMappingParser(TokenStream input, FeatureGroupMappingGrammarAccess grammarAccess) {
    		this(input);
    		this.grammarAccess = grammarAccess;
    		registerRules(grammarAccess.getGrammar());
    	}
    	
    	@Override
    	protected String getFirstRuleName() {
    		return "FGMGrammarRoot";	
    	} 
    	   	   	
    	@Override
    	protected FeatureGroupMappingGrammarAccess getGrammarAccess() {
    		return grammarAccess;
    	}



    // $ANTLR start "entryRuleFGMGrammarRoot"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:61:1: entryRuleFGMGrammarRoot returns [EObject current=null] : iv_ruleFGMGrammarRoot= ruleFGMGrammarRoot EOF ;
    public final EObject entryRuleFGMGrammarRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFGMGrammarRoot = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:62:2: (iv_ruleFGMGrammarRoot= ruleFGMGrammarRoot EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:63:2: iv_ruleFGMGrammarRoot= ruleFGMGrammarRoot EOF
            {
             newCompositeNode(grammarAccess.getFGMGrammarRootRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFGMGrammarRoot_in_entryRuleFGMGrammarRoot67);
            iv_ruleFGMGrammarRoot=ruleFGMGrammarRoot();

            state._fsp--;

             current =iv_ruleFGMGrammarRoot; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFGMGrammarRoot77); 

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
    // $ANTLR end "entryRuleFGMGrammarRoot"


    // $ANTLR start "ruleFGMGrammarRoot"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:70:1: ruleFGMGrammarRoot returns [EObject current=null] : ( (otherlv_0= KEYWORD_31 ( (lv_fgml_1_0= ruleFGMLibrary ) ) ) | ( (lv_fgmsc_2_0= ruleFGMSubclause ) ) ) ;
    public final EObject ruleFGMGrammarRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_fgml_1_0 = null;

        EObject lv_fgmsc_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:73:28: ( ( (otherlv_0= KEYWORD_31 ( (lv_fgml_1_0= ruleFGMLibrary ) ) ) | ( (lv_fgmsc_2_0= ruleFGMSubclause ) ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:74:1: ( (otherlv_0= KEYWORD_31 ( (lv_fgml_1_0= ruleFGMLibrary ) ) ) | ( (lv_fgmsc_2_0= ruleFGMSubclause ) ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:74:1: ( (otherlv_0= KEYWORD_31 ( (lv_fgml_1_0= ruleFGMLibrary ) ) ) | ( (lv_fgmsc_2_0= ruleFGMSubclause ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==KEYWORD_31) ) {
                alt1=1;
            }
            else if ( (LA1_0==KEYWORD_22) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:74:2: (otherlv_0= KEYWORD_31 ( (lv_fgml_1_0= ruleFGMLibrary ) ) )
                    {
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:74:2: (otherlv_0= KEYWORD_31 ( (lv_fgml_1_0= ruleFGMLibrary ) ) )
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:75:2: otherlv_0= KEYWORD_31 ( (lv_fgml_1_0= ruleFGMLibrary ) )
                    {
                    otherlv_0=(Token)match(input,KEYWORD_31,FollowSets000.FOLLOW_KEYWORD_31_in_ruleFGMGrammarRoot116); 

                        	newLeafNode(otherlv_0, grammarAccess.getFGMGrammarRootAccess().getLibraryKeyword_0_0());
                        
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:79:1: ( (lv_fgml_1_0= ruleFGMLibrary ) )
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:80:1: (lv_fgml_1_0= ruleFGMLibrary )
                    {
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:80:1: (lv_fgml_1_0= ruleFGMLibrary )
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:81:3: lv_fgml_1_0= ruleFGMLibrary
                    {
                     
                    	        newCompositeNode(grammarAccess.getFGMGrammarRootAccess().getFgmlFGMLibraryParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFGMLibrary_in_ruleFGMGrammarRoot136);
                    lv_fgml_1_0=ruleFGMLibrary();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFGMGrammarRootRule());
                    	        }
                           		set(
                           			current, 
                           			"fgml",
                            		lv_fgml_1_0, 
                            		"FGMLibrary");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:98:6: ( (lv_fgmsc_2_0= ruleFGMSubclause ) )
                    {
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:98:6: ( (lv_fgmsc_2_0= ruleFGMSubclause ) )
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:99:1: (lv_fgmsc_2_0= ruleFGMSubclause )
                    {
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:99:1: (lv_fgmsc_2_0= ruleFGMSubclause )
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:100:3: lv_fgmsc_2_0= ruleFGMSubclause
                    {
                     
                    	        newCompositeNode(grammarAccess.getFGMGrammarRootAccess().getFgmscFGMSubclauseParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFGMSubclause_in_ruleFGMGrammarRoot164);
                    lv_fgmsc_2_0=ruleFGMSubclause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFGMGrammarRootRule());
                    	        }
                           		set(
                           			current, 
                           			"fgmsc",
                            		lv_fgmsc_2_0, 
                            		"FGMSubclause");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleFGMGrammarRoot"


    // $ANTLR start "entryRuleFGMLibrary"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:124:1: entryRuleFGMLibrary returns [EObject current=null] : iv_ruleFGMLibrary= ruleFGMLibrary EOF ;
    public final EObject entryRuleFGMLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFGMLibrary = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:125:2: (iv_ruleFGMLibrary= ruleFGMLibrary EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:126:2: iv_ruleFGMLibrary= ruleFGMLibrary EOF
            {
             newCompositeNode(grammarAccess.getFGMLibraryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFGMLibrary_in_entryRuleFGMLibrary199);
            iv_ruleFGMLibrary=ruleFGMLibrary();

            state._fsp--;

             current =iv_ruleFGMLibrary; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFGMLibrary209); 

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
    // $ANTLR end "entryRuleFGMLibrary"


    // $ANTLR start "ruleFGMLibrary"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:133:1: ruleFGMLibrary returns [EObject current=null] : ( (lv_featuremappingset_0_0= ruleFeatureMappingset ) )+ ;
    public final EObject ruleFGMLibrary() throws RecognitionException {
        EObject current = null;

        EObject lv_featuremappingset_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:136:28: ( ( (lv_featuremappingset_0_0= ruleFeatureMappingset ) )+ )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:137:1: ( (lv_featuremappingset_0_0= ruleFeatureMappingset ) )+
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:137:1: ( (lv_featuremappingset_0_0= ruleFeatureMappingset ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:138:1: (lv_featuremappingset_0_0= ruleFeatureMappingset )
            	    {
            	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:138:1: (lv_featuremappingset_0_0= ruleFeatureMappingset )
            	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:139:3: lv_featuremappingset_0_0= ruleFeatureMappingset
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFGMLibraryAccess().getFeaturemappingsetFeatureMappingsetParserRuleCall_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleFeatureMappingset_in_ruleFGMLibrary254);
            	    lv_featuremappingset_0_0=ruleFeatureMappingset();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFGMLibraryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"featuremappingset",
            	            		lv_featuremappingset_0_0, 
            	            		"FeatureMappingset");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // $ANTLR end "ruleFGMLibrary"


    // $ANTLR start "entryRuleFeatureMappingset"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:163:1: entryRuleFeatureMappingset returns [EObject current=null] : iv_ruleFeatureMappingset= ruleFeatureMappingset EOF ;
    public final EObject entryRuleFeatureMappingset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureMappingset = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:164:2: (iv_ruleFeatureMappingset= ruleFeatureMappingset EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:165:2: iv_ruleFeatureMappingset= ruleFeatureMappingset EOF
            {
             newCompositeNode(grammarAccess.getFeatureMappingsetRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeatureMappingset_in_entryRuleFeatureMappingset289);
            iv_ruleFeatureMappingset=ruleFeatureMappingset();

            state._fsp--;

             current =iv_ruleFeatureMappingset; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeatureMappingset299); 

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
    // $ANTLR end "entryRuleFeatureMappingset"


    // $ANTLR start "ruleFeatureMappingset"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:172:1: ruleFeatureMappingset returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= KEYWORD_8 otherlv_2= KEYWORD_33 (otherlv_3= KEYWORD_30 ( ( ruleQFGTMREF ) ) )? ( (lv_mapping_5_0= ruleFeatureMapping ) ) otherlv_6= KEYWORD_21 otherlv_7= KEYWORD_33 otherlv_8= KEYWORD_9 ) ;
    public final EObject ruleFeatureMappingset() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_mapping_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:175:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= KEYWORD_8 otherlv_2= KEYWORD_33 (otherlv_3= KEYWORD_30 ( ( ruleQFGTMREF ) ) )? ( (lv_mapping_5_0= ruleFeatureMapping ) ) otherlv_6= KEYWORD_21 otherlv_7= KEYWORD_33 otherlv_8= KEYWORD_9 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:176:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= KEYWORD_8 otherlv_2= KEYWORD_33 (otherlv_3= KEYWORD_30 ( ( ruleQFGTMREF ) ) )? ( (lv_mapping_5_0= ruleFeatureMapping ) ) otherlv_6= KEYWORD_21 otherlv_7= KEYWORD_33 otherlv_8= KEYWORD_9 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:176:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= KEYWORD_8 otherlv_2= KEYWORD_33 (otherlv_3= KEYWORD_30 ( ( ruleQFGTMREF ) ) )? ( (lv_mapping_5_0= ruleFeatureMapping ) ) otherlv_6= KEYWORD_21 otherlv_7= KEYWORD_33 otherlv_8= KEYWORD_9 )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:176:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= KEYWORD_8 otherlv_2= KEYWORD_33 (otherlv_3= KEYWORD_30 ( ( ruleQFGTMREF ) ) )? ( (lv_mapping_5_0= ruleFeatureMapping ) ) otherlv_6= KEYWORD_21 otherlv_7= KEYWORD_33 otherlv_8= KEYWORD_9
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:176:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:177:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:177:1: (lv_name_0_0= RULE_ID )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:178:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFeatureMappingset341); 

            			newLeafNode(lv_name_0_0, grammarAccess.getFeatureMappingsetAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureMappingsetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,KEYWORD_8,FollowSets000.FOLLOW_KEYWORD_8_in_ruleFeatureMappingset359); 

                	newLeafNode(otherlv_1, grammarAccess.getFeatureMappingsetAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,KEYWORD_33,FollowSets000.FOLLOW_KEYWORD_33_in_ruleFeatureMappingset371); 

                	newLeafNode(otherlv_2, grammarAccess.getFeatureMappingsetAccess().getMappingsKeyword_2());
                
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:204:1: (otherlv_3= KEYWORD_30 ( ( ruleQFGTMREF ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==KEYWORD_30) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:205:2: otherlv_3= KEYWORD_30 ( ( ruleQFGTMREF ) )
                    {
                    otherlv_3=(Token)match(input,KEYWORD_30,FollowSets000.FOLLOW_KEYWORD_30_in_ruleFeatureMappingset384); 

                        	newLeafNode(otherlv_3, grammarAccess.getFeatureMappingsetAccess().getExtendsKeyword_3_0());
                        
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:209:1: ( ( ruleQFGTMREF ) )
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:210:1: ( ruleQFGTMREF )
                    {
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:210:1: ( ruleQFGTMREF )
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:211:3: ruleQFGTMREF
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureMappingsetRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getFeatureMappingsetAccess().getMappingsetFeatureMappingsetCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQFGTMREF_in_ruleFeatureMappingset406);
                    ruleQFGTMREF();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:224:4: ( (lv_mapping_5_0= ruleFeatureMapping ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:225:1: (lv_mapping_5_0= ruleFeatureMapping )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:225:1: (lv_mapping_5_0= ruleFeatureMapping )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:226:3: lv_mapping_5_0= ruleFeatureMapping
            {
             
            	        newCompositeNode(grammarAccess.getFeatureMappingsetAccess().getMappingFeatureMappingParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFeatureMapping_in_ruleFeatureMappingset429);
            lv_mapping_5_0=ruleFeatureMapping();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFeatureMappingsetRule());
            	        }
                   		add(
                   			current, 
                   			"mapping",
                    		lv_mapping_5_0, 
                    		"FeatureMapping");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,KEYWORD_21,FollowSets000.FOLLOW_KEYWORD_21_in_ruleFeatureMappingset442); 

                	newLeafNode(otherlv_6, grammarAccess.getFeatureMappingsetAccess().getEndKeyword_5());
                
            otherlv_7=(Token)match(input,KEYWORD_33,FollowSets000.FOLLOW_KEYWORD_33_in_ruleFeatureMappingset454); 

                	newLeafNode(otherlv_7, grammarAccess.getFeatureMappingsetAccess().getMappingsKeyword_6());
                
            otherlv_8=(Token)match(input,KEYWORD_9,FollowSets000.FOLLOW_KEYWORD_9_in_ruleFeatureMappingset466); 

                	newLeafNode(otherlv_8, grammarAccess.getFeatureMappingsetAccess().getSemicolonKeyword_7());
                

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
    // $ANTLR end "ruleFeatureMappingset"


    // $ANTLR start "entryRuleFGMSubclause"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:265:1: entryRuleFGMSubclause returns [EObject current=null] : iv_ruleFGMSubclause= ruleFGMSubclause EOF ;
    public final EObject entryRuleFGMSubclause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFGMSubclause = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:266:2: (iv_ruleFGMSubclause= ruleFGMSubclause EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:267:2: iv_ruleFGMSubclause= ruleFGMSubclause EOF
            {
             newCompositeNode(grammarAccess.getFGMSubclauseRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFGMSubclause_in_entryRuleFGMSubclause500);
            iv_ruleFGMSubclause=ruleFGMSubclause();

            state._fsp--;

             current =iv_ruleFGMSubclause; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFGMSubclause510); 

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
    // $ANTLR end "entryRuleFGMSubclause"


    // $ANTLR start "ruleFGMSubclause"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:274:1: ruleFGMSubclause returns [EObject current=null] : (otherlv_0= KEYWORD_22 otherlv_1= KEYWORD_33 ( ( ruleQFGTMREF ) ) otherlv_3= KEYWORD_9 ) ;
    public final EObject ruleFGMSubclause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:277:28: ( (otherlv_0= KEYWORD_22 otherlv_1= KEYWORD_33 ( ( ruleQFGTMREF ) ) otherlv_3= KEYWORD_9 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:278:1: (otherlv_0= KEYWORD_22 otherlv_1= KEYWORD_33 ( ( ruleQFGTMREF ) ) otherlv_3= KEYWORD_9 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:278:1: (otherlv_0= KEYWORD_22 otherlv_1= KEYWORD_33 ( ( ruleQFGTMREF ) ) otherlv_3= KEYWORD_9 )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:279:2: otherlv_0= KEYWORD_22 otherlv_1= KEYWORD_33 ( ( ruleQFGTMREF ) ) otherlv_3= KEYWORD_9
            {
            otherlv_0=(Token)match(input,KEYWORD_22,FollowSets000.FOLLOW_KEYWORD_22_in_ruleFGMSubclause548); 

                	newLeafNode(otherlv_0, grammarAccess.getFGMSubclauseAccess().getUseKeyword_0());
                
            otherlv_1=(Token)match(input,KEYWORD_33,FollowSets000.FOLLOW_KEYWORD_33_in_ruleFGMSubclause560); 

                	newLeafNode(otherlv_1, grammarAccess.getFGMSubclauseAccess().getMappingsKeyword_1());
                
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:288:1: ( ( ruleQFGTMREF ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:289:1: ( ruleQFGTMREF )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:289:1: ( ruleQFGTMREF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:290:3: ruleQFGTMREF
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFGMSubclauseRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getFGMSubclauseAccess().getMappingsetFeatureMappingsetCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQFGTMREF_in_ruleFGMSubclause582);
            ruleQFGTMREF();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,KEYWORD_9,FollowSets000.FOLLOW_KEYWORD_9_in_ruleFGMSubclause595); 

                	newLeafNode(otherlv_3, grammarAccess.getFGMSubclauseAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleFGMSubclause"


    // $ANTLR start "entryRuleFeatureMapping"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:324:1: entryRuleFeatureMapping returns [EObject current=null] : iv_ruleFeatureMapping= ruleFeatureMapping EOF ;
    public final EObject entryRuleFeatureMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureMapping = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:325:2: (iv_ruleFeatureMapping= ruleFeatureMapping EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:326:2: iv_ruleFeatureMapping= ruleFeatureMapping EOF
            {
             newCompositeNode(grammarAccess.getFeatureMappingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeatureMapping_in_entryRuleFeatureMapping637);
            iv_ruleFeatureMapping=ruleFeatureMapping();

            state._fsp--;

             current =iv_ruleFeatureMapping; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeatureMapping647); 

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
    // $ANTLR end "entryRuleFeatureMapping"


    // $ANTLR start "ruleFeatureMapping"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:333:1: ruleFeatureMapping returns [EObject current=null] : ( ( (lv_left_0_0= ruleFeaturePath ) ) otherlv_1= KEYWORD_20 ( (lv_right_2_0= ruleFeaturePath ) ) otherlv_3= KEYWORD_9 ) ;
    public final EObject ruleFeatureMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:336:28: ( ( ( (lv_left_0_0= ruleFeaturePath ) ) otherlv_1= KEYWORD_20 ( (lv_right_2_0= ruleFeaturePath ) ) otherlv_3= KEYWORD_9 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:337:1: ( ( (lv_left_0_0= ruleFeaturePath ) ) otherlv_1= KEYWORD_20 ( (lv_right_2_0= ruleFeaturePath ) ) otherlv_3= KEYWORD_9 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:337:1: ( ( (lv_left_0_0= ruleFeaturePath ) ) otherlv_1= KEYWORD_20 ( (lv_right_2_0= ruleFeaturePath ) ) otherlv_3= KEYWORD_9 )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:337:2: ( (lv_left_0_0= ruleFeaturePath ) ) otherlv_1= KEYWORD_20 ( (lv_right_2_0= ruleFeaturePath ) ) otherlv_3= KEYWORD_9
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:337:2: ( (lv_left_0_0= ruleFeaturePath ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:338:1: (lv_left_0_0= ruleFeaturePath )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:338:1: (lv_left_0_0= ruleFeaturePath )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:339:3: lv_left_0_0= ruleFeaturePath
            {
             
            	        newCompositeNode(grammarAccess.getFeatureMappingAccess().getLeftFeaturePathParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFeaturePath_in_ruleFeatureMapping693);
            lv_left_0_0=ruleFeaturePath();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFeatureMappingRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_0_0, 
                    		"FeaturePath");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,KEYWORD_20,FollowSets000.FOLLOW_KEYWORD_20_in_ruleFeatureMapping706); 

                	newLeafNode(otherlv_1, grammarAccess.getFeatureMappingAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1());
                
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:360:1: ( (lv_right_2_0= ruleFeaturePath ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:361:1: (lv_right_2_0= ruleFeaturePath )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:361:1: (lv_right_2_0= ruleFeaturePath )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:362:3: lv_right_2_0= ruleFeaturePath
            {
             
            	        newCompositeNode(grammarAccess.getFeatureMappingAccess().getRightFeaturePathParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFeaturePath_in_ruleFeatureMapping726);
            lv_right_2_0=ruleFeaturePath();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFeatureMappingRule());
            	        }
                   		set(
                   			current, 
                   			"right",
                    		lv_right_2_0, 
                    		"FeaturePath");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,KEYWORD_9,FollowSets000.FOLLOW_KEYWORD_9_in_ruleFeatureMapping739); 

                	newLeafNode(otherlv_3, grammarAccess.getFeatureMappingAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleFeatureMapping"


    // $ANTLR start "entryRuleFeaturePath"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:391:1: entryRuleFeaturePath returns [EObject current=null] : iv_ruleFeaturePath= ruleFeaturePath EOF ;
    public final EObject entryRuleFeaturePath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeaturePath = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:392:2: (iv_ruleFeaturePath= ruleFeaturePath EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:393:2: iv_ruleFeaturePath= ruleFeaturePath EOF
            {
             newCompositeNode(grammarAccess.getFeaturePathRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeaturePath_in_entryRuleFeaturePath773);
            iv_ruleFeaturePath=ruleFeaturePath();

            state._fsp--;

             current =iv_ruleFeaturePath; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeaturePath783); 

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
    // $ANTLR end "entryRuleFeaturePath"


    // $ANTLR start "ruleFeaturePath"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:400:1: ruleFeaturePath returns [EObject current=null] : ( ( ( ( ruleQFGTMREF ) ) otherlv_1= KEYWORD_7 ) ( (lv_featureReference_2_0= ruleFeatureReference ) )+ ) ;
    public final EObject ruleFeaturePath() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_featureReference_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:403:28: ( ( ( ( ( ruleQFGTMREF ) ) otherlv_1= KEYWORD_7 ) ( (lv_featureReference_2_0= ruleFeatureReference ) )+ ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:404:1: ( ( ( ( ruleQFGTMREF ) ) otherlv_1= KEYWORD_7 ) ( (lv_featureReference_2_0= ruleFeatureReference ) )+ )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:404:1: ( ( ( ( ruleQFGTMREF ) ) otherlv_1= KEYWORD_7 ) ( (lv_featureReference_2_0= ruleFeatureReference ) )+ )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:404:2: ( ( ( ruleQFGTMREF ) ) otherlv_1= KEYWORD_7 ) ( (lv_featureReference_2_0= ruleFeatureReference ) )+
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:404:2: ( ( ( ruleQFGTMREF ) ) otherlv_1= KEYWORD_7 )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:404:3: ( ( ruleQFGTMREF ) ) otherlv_1= KEYWORD_7
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:404:3: ( ( ruleQFGTMREF ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:405:1: ( ruleQFGTMREF )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:405:1: ( ruleQFGTMREF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:406:3: ruleQFGTMREF
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFeaturePathRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getFeaturePathAccess().getFeatureGroupTypeFeatureGroupTypeCrossReference_0_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQFGTMREF_in_ruleFeaturePath832);
            ruleQFGTMREF();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,KEYWORD_7,FollowSets000.FOLLOW_KEYWORD_7_in_ruleFeaturePath845); 

                	newLeafNode(otherlv_1, grammarAccess.getFeaturePathAccess().getFullStopKeyword_0_1());
                

            }

            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:424:2: ( (lv_featureReference_2_0= ruleFeatureReference ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:425:1: (lv_featureReference_2_0= ruleFeatureReference )
            	    {
            	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:425:1: (lv_featureReference_2_0= ruleFeatureReference )
            	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:426:3: lv_featureReference_2_0= ruleFeatureReference
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFeaturePathAccess().getFeatureReferenceFeatureReferenceParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleFeatureReference_in_ruleFeaturePath866);
            	    lv_featureReference_2_0=ruleFeatureReference();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFeaturePathRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"featureReference",
            	            		lv_featureReference_2_0, 
            	            		"FeatureReference");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // $ANTLR end "ruleFeaturePath"


    // $ANTLR start "entryRuleFeatureReference"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:450:1: entryRuleFeatureReference returns [EObject current=null] : iv_ruleFeatureReference= ruleFeatureReference EOF ;
    public final EObject entryRuleFeatureReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureReference = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:451:2: (iv_ruleFeatureReference= ruleFeatureReference EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:452:2: iv_ruleFeatureReference= ruleFeatureReference EOF
            {
             newCompositeNode(grammarAccess.getFeatureReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeatureReference_in_entryRuleFeatureReference902);
            iv_ruleFeatureReference=ruleFeatureReference();

            state._fsp--;

             current =iv_ruleFeatureReference; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeatureReference912); 

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
    // $ANTLR end "entryRuleFeatureReference"


    // $ANTLR start "ruleFeatureReference"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:459:1: ruleFeatureReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleFeatureReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:462:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:463:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:463:1: ( (otherlv_0= RULE_ID ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:464:1: (otherlv_0= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:464:1: (otherlv_0= RULE_ID )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:465:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureReferenceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFeatureReference956); 

            		newLeafNode(otherlv_0, grammarAccess.getFeatureReferenceAccess().getFeatureFeatureCrossReference_0()); 
            	

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
    // $ANTLR end "ruleFeatureReference"


    // $ANTLR start "entryRuleQFGTMREF"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:484:1: entryRuleQFGTMREF returns [String current=null] : iv_ruleQFGTMREF= ruleQFGTMREF EOF ;
    public final String entryRuleQFGTMREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQFGTMREF = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:485:1: (iv_ruleQFGTMREF= ruleQFGTMREF EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:486:2: iv_ruleQFGTMREF= ruleQFGTMREF EOF
            {
             newCompositeNode(grammarAccess.getQFGTMREFRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQFGTMREF_in_entryRuleQFGTMREF991);
            iv_ruleQFGTMREF=ruleQFGTMREF();

            state._fsp--;

             current =iv_ruleQFGTMREF.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQFGTMREF1002); 

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
    // $ANTLR end "entryRuleQFGTMREF"


    // $ANTLR start "ruleQFGTMREF"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:493:1: ruleQFGTMREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= KEYWORD_15 )* this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQFGTMREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:497:6: ( ( (this_ID_0= RULE_ID kw= KEYWORD_15 )* this_ID_2= RULE_ID ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:498:1: ( (this_ID_0= RULE_ID kw= KEYWORD_15 )* this_ID_2= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:498:1: ( (this_ID_0= RULE_ID kw= KEYWORD_15 )* this_ID_2= RULE_ID )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:498:2: (this_ID_0= RULE_ID kw= KEYWORD_15 )* this_ID_2= RULE_ID
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:498:2: (this_ID_0= RULE_ID kw= KEYWORD_15 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==KEYWORD_15) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:498:7: this_ID_0= RULE_ID kw= KEYWORD_15
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQFGTMREF1043); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getQFGTMREFAccess().getIDTerminalRuleCall_0_0()); 
            	        
            	    kw=(Token)match(input,KEYWORD_15,FollowSets000.FOLLOW_KEYWORD_15_in_ruleQFGTMREF1061); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQFGTMREFAccess().getColonColonKeyword_0_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQFGTMREF1078); 

            		current.merge(this_ID_2);
                
             
                newLeafNode(this_ID_2, grammarAccess.getQFGTMREFAccess().getIDTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleQFGTMREF"


    // $ANTLR start "entryRuleContainedPropertyAssociation"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:528:1: entryRuleContainedPropertyAssociation returns [EObject current=null] : iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF ;
    public final EObject entryRuleContainedPropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainedPropertyAssociation = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:529:2: (iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:530:2: iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF
            {
             newCompositeNode(grammarAccess.getContainedPropertyAssociationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContainedPropertyAssociation_in_entryRuleContainedPropertyAssociation1124);
            iv_ruleContainedPropertyAssociation=ruleContainedPropertyAssociation();

            state._fsp--;

             current =iv_ruleContainedPropertyAssociation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContainedPropertyAssociation1134); 

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
    // $ANTLR end "entryRuleContainedPropertyAssociation"


    // $ANTLR start "ruleContainedPropertyAssociation"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:537:1: ruleContainedPropertyAssociation returns [EObject current=null] : ( ( ( ruleQPREF ) ) (otherlv_1= KEYWORD_16 | ( (lv_append_2_0= KEYWORD_19 ) ) ) ( (lv_constant_3_0= KEYWORD_32 ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= KEYWORD_5 ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) (otherlv_7= KEYWORD_27 otherlv_8= KEYWORD_18 ( (lv_appliesTo_9_0= ruleContainmentPath ) ) (otherlv_10= KEYWORD_5 ( (lv_appliesTo_11_0= ruleContainmentPath ) ) )* )? (otherlv_12= KEYWORD_17 otherlv_13= KEYWORD_28 otherlv_14= KEYWORD_1 ( ( ruleQCREF ) ) otherlv_16= KEYWORD_2 )? otherlv_17= KEYWORD_9 ) ;
    public final EObject ruleContainedPropertyAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_append_2_0=null;
        Token lv_constant_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_ownedValue_4_0 = null;

        EObject lv_ownedValue_6_0 = null;

        EObject lv_appliesTo_9_0 = null;

        EObject lv_appliesTo_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:540:28: ( ( ( ( ruleQPREF ) ) (otherlv_1= KEYWORD_16 | ( (lv_append_2_0= KEYWORD_19 ) ) ) ( (lv_constant_3_0= KEYWORD_32 ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= KEYWORD_5 ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) (otherlv_7= KEYWORD_27 otherlv_8= KEYWORD_18 ( (lv_appliesTo_9_0= ruleContainmentPath ) ) (otherlv_10= KEYWORD_5 ( (lv_appliesTo_11_0= ruleContainmentPath ) ) )* )? (otherlv_12= KEYWORD_17 otherlv_13= KEYWORD_28 otherlv_14= KEYWORD_1 ( ( ruleQCREF ) ) otherlv_16= KEYWORD_2 )? otherlv_17= KEYWORD_9 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:541:1: ( ( ( ruleQPREF ) ) (otherlv_1= KEYWORD_16 | ( (lv_append_2_0= KEYWORD_19 ) ) ) ( (lv_constant_3_0= KEYWORD_32 ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= KEYWORD_5 ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) (otherlv_7= KEYWORD_27 otherlv_8= KEYWORD_18 ( (lv_appliesTo_9_0= ruleContainmentPath ) ) (otherlv_10= KEYWORD_5 ( (lv_appliesTo_11_0= ruleContainmentPath ) ) )* )? (otherlv_12= KEYWORD_17 otherlv_13= KEYWORD_28 otherlv_14= KEYWORD_1 ( ( ruleQCREF ) ) otherlv_16= KEYWORD_2 )? otherlv_17= KEYWORD_9 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:541:1: ( ( ( ruleQPREF ) ) (otherlv_1= KEYWORD_16 | ( (lv_append_2_0= KEYWORD_19 ) ) ) ( (lv_constant_3_0= KEYWORD_32 ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= KEYWORD_5 ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) (otherlv_7= KEYWORD_27 otherlv_8= KEYWORD_18 ( (lv_appliesTo_9_0= ruleContainmentPath ) ) (otherlv_10= KEYWORD_5 ( (lv_appliesTo_11_0= ruleContainmentPath ) ) )* )? (otherlv_12= KEYWORD_17 otherlv_13= KEYWORD_28 otherlv_14= KEYWORD_1 ( ( ruleQCREF ) ) otherlv_16= KEYWORD_2 )? otherlv_17= KEYWORD_9 )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:541:2: ( ( ruleQPREF ) ) (otherlv_1= KEYWORD_16 | ( (lv_append_2_0= KEYWORD_19 ) ) ) ( (lv_constant_3_0= KEYWORD_32 ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= KEYWORD_5 ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) (otherlv_7= KEYWORD_27 otherlv_8= KEYWORD_18 ( (lv_appliesTo_9_0= ruleContainmentPath ) ) (otherlv_10= KEYWORD_5 ( (lv_appliesTo_11_0= ruleContainmentPath ) ) )* )? (otherlv_12= KEYWORD_17 otherlv_13= KEYWORD_28 otherlv_14= KEYWORD_1 ( ( ruleQCREF ) ) otherlv_16= KEYWORD_2 )? otherlv_17= KEYWORD_9
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:541:2: ( ( ruleQPREF ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:542:1: ( ruleQPREF )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:542:1: ( ruleQPREF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:543:3: ruleQPREF
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getPropertyPropertyCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQPREF_in_ruleContainedPropertyAssociation1182);
            ruleQPREF();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:556:2: (otherlv_1= KEYWORD_16 | ( (lv_append_2_0= KEYWORD_19 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==KEYWORD_16) ) {
                alt6=1;
            }
            else if ( (LA6_0==KEYWORD_19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:557:2: otherlv_1= KEYWORD_16
                    {
                    otherlv_1=(Token)match(input,KEYWORD_16,FollowSets000.FOLLOW_KEYWORD_16_in_ruleContainedPropertyAssociation1196); 

                        	newLeafNode(otherlv_1, grammarAccess.getContainedPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:562:6: ( (lv_append_2_0= KEYWORD_19 ) )
                    {
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:562:6: ( (lv_append_2_0= KEYWORD_19 ) )
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:563:1: (lv_append_2_0= KEYWORD_19 )
                    {
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:563:1: (lv_append_2_0= KEYWORD_19 )
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:564:3: lv_append_2_0= KEYWORD_19
                    {
                    lv_append_2_0=(Token)match(input,KEYWORD_19,FollowSets000.FOLLOW_KEYWORD_19_in_ruleContainedPropertyAssociation1220); 

                            newLeafNode(lv_append_2_0, grammarAccess.getContainedPropertyAssociationAccess().getAppendPlusSignEqualsSignGreaterThanSignKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
                    	        }
                           		setWithLastConsumed(current, "append", true, "+=>");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:578:3: ( (lv_constant_3_0= KEYWORD_32 ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==KEYWORD_32) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:579:1: (lv_constant_3_0= KEYWORD_32 )
                    {
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:579:1: (lv_constant_3_0= KEYWORD_32 )
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:580:3: lv_constant_3_0= KEYWORD_32
                    {
                    lv_constant_3_0=(Token)match(input,KEYWORD_32,FollowSets000.FOLLOW_KEYWORD_32_in_ruleContainedPropertyAssociation1251); 

                            newLeafNode(lv_constant_3_0, grammarAccess.getContainedPropertyAssociationAccess().getConstantConstantKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
                    	        }
                           		setWithLastConsumed(current, "constant", true, "constant");
                    	    

                    }


                    }
                    break;

            }

            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:594:3: ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= KEYWORD_5 ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:594:4: ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= KEYWORD_5 ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )*
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:594:4: ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:595:1: (lv_ownedValue_4_0= ruleOptionalModalPropertyValue )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:595:1: (lv_ownedValue_4_0= ruleOptionalModalPropertyValue )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:596:3: lv_ownedValue_4_0= ruleOptionalModalPropertyValue
            {
             
            	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOptionalModalPropertyValue_in_ruleContainedPropertyAssociation1285);
            lv_ownedValue_4_0=ruleOptionalModalPropertyValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
            	        }
                   		add(
                   			current, 
                   			"ownedValue",
                    		lv_ownedValue_4_0, 
                    		"OptionalModalPropertyValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:612:2: (otherlv_5= KEYWORD_5 ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==KEYWORD_5) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:613:2: otherlv_5= KEYWORD_5 ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) )
            	    {
            	    otherlv_5=(Token)match(input,KEYWORD_5,FollowSets000.FOLLOW_KEYWORD_5_in_ruleContainedPropertyAssociation1299); 

            	        	newLeafNode(otherlv_5, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_3_1_0());
            	        
            	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:617:1: ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) )
            	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:618:1: (lv_ownedValue_6_0= ruleOptionalModalPropertyValue )
            	    {
            	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:618:1: (lv_ownedValue_6_0= ruleOptionalModalPropertyValue )
            	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:619:3: lv_ownedValue_6_0= ruleOptionalModalPropertyValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOptionalModalPropertyValue_in_ruleContainedPropertyAssociation1319);
            	    lv_ownedValue_6_0=ruleOptionalModalPropertyValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ownedValue",
            	            		lv_ownedValue_6_0, 
            	            		"OptionalModalPropertyValue");
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

            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:635:5: (otherlv_7= KEYWORD_27 otherlv_8= KEYWORD_18 ( (lv_appliesTo_9_0= ruleContainmentPath ) ) (otherlv_10= KEYWORD_5 ( (lv_appliesTo_11_0= ruleContainmentPath ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==KEYWORD_27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:636:2: otherlv_7= KEYWORD_27 otherlv_8= KEYWORD_18 ( (lv_appliesTo_9_0= ruleContainmentPath ) ) (otherlv_10= KEYWORD_5 ( (lv_appliesTo_11_0= ruleContainmentPath ) ) )*
                    {
                    otherlv_7=(Token)match(input,KEYWORD_27,FollowSets000.FOLLOW_KEYWORD_27_in_ruleContainedPropertyAssociation1336); 

                        	newLeafNode(otherlv_7, grammarAccess.getContainedPropertyAssociationAccess().getAppliesKeyword_4_0());
                        
                    otherlv_8=(Token)match(input,KEYWORD_18,FollowSets000.FOLLOW_KEYWORD_18_in_ruleContainedPropertyAssociation1348); 

                        	newLeafNode(otherlv_8, grammarAccess.getContainedPropertyAssociationAccess().getToKeyword_4_1());
                        
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:645:1: ( (lv_appliesTo_9_0= ruleContainmentPath ) )
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:646:1: (lv_appliesTo_9_0= ruleContainmentPath )
                    {
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:646:1: (lv_appliesTo_9_0= ruleContainmentPath )
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:647:3: lv_appliesTo_9_0= ruleContainmentPath
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleContainmentPath_in_ruleContainedPropertyAssociation1368);
                    lv_appliesTo_9_0=ruleContainmentPath();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
                    	        }
                           		add(
                           			current, 
                           			"appliesTo",
                            		lv_appliesTo_9_0, 
                            		"ContainmentPath");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:663:2: (otherlv_10= KEYWORD_5 ( (lv_appliesTo_11_0= ruleContainmentPath ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==KEYWORD_5) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:664:2: otherlv_10= KEYWORD_5 ( (lv_appliesTo_11_0= ruleContainmentPath ) )
                    	    {
                    	    otherlv_10=(Token)match(input,KEYWORD_5,FollowSets000.FOLLOW_KEYWORD_5_in_ruleContainedPropertyAssociation1382); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:668:1: ( (lv_appliesTo_11_0= ruleContainmentPath ) )
                    	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:669:1: (lv_appliesTo_11_0= ruleContainmentPath )
                    	    {
                    	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:669:1: (lv_appliesTo_11_0= ruleContainmentPath )
                    	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:670:3: lv_appliesTo_11_0= ruleContainmentPath
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleContainmentPath_in_ruleContainedPropertyAssociation1402);
                    	    lv_appliesTo_11_0=ruleContainmentPath();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"appliesTo",
                    	            		lv_appliesTo_11_0, 
                    	            		"ContainmentPath");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:686:6: (otherlv_12= KEYWORD_17 otherlv_13= KEYWORD_28 otherlv_14= KEYWORD_1 ( ( ruleQCREF ) ) otherlv_16= KEYWORD_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==KEYWORD_17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:687:2: otherlv_12= KEYWORD_17 otherlv_13= KEYWORD_28 otherlv_14= KEYWORD_1 ( ( ruleQCREF ) ) otherlv_16= KEYWORD_2
                    {
                    otherlv_12=(Token)match(input,KEYWORD_17,FollowSets000.FOLLOW_KEYWORD_17_in_ruleContainedPropertyAssociation1420); 

                        	newLeafNode(otherlv_12, grammarAccess.getContainedPropertyAssociationAccess().getInKeyword_5_0());
                        
                    otherlv_13=(Token)match(input,KEYWORD_28,FollowSets000.FOLLOW_KEYWORD_28_in_ruleContainedPropertyAssociation1432); 

                        	newLeafNode(otherlv_13, grammarAccess.getContainedPropertyAssociationAccess().getBindingKeyword_5_1());
                        
                    otherlv_14=(Token)match(input,KEYWORD_1,FollowSets000.FOLLOW_KEYWORD_1_in_ruleContainedPropertyAssociation1444); 

                        	newLeafNode(otherlv_14, grammarAccess.getContainedPropertyAssociationAccess().getLeftParenthesisKeyword_5_2());
                        
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:701:1: ( ( ruleQCREF ) )
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:702:1: ( ruleQCREF )
                    {
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:702:1: ( ruleQCREF )
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:703:3: ruleQCREF
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getInBindingClassifierCrossReference_5_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQCREF_in_ruleContainedPropertyAssociation1466);
                    ruleQCREF();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_16=(Token)match(input,KEYWORD_2,FollowSets000.FOLLOW_KEYWORD_2_in_ruleContainedPropertyAssociation1479); 

                        	newLeafNode(otherlv_16, grammarAccess.getContainedPropertyAssociationAccess().getRightParenthesisKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_17=(Token)match(input,KEYWORD_9,FollowSets000.FOLLOW_KEYWORD_9_in_ruleContainedPropertyAssociation1493); 

                	newLeafNode(otherlv_17, grammarAccess.getContainedPropertyAssociationAccess().getSemicolonKeyword_6());
                

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
    // $ANTLR end "ruleContainedPropertyAssociation"


    // $ANTLR start "entryRuleContainmentPath"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:738:1: entryRuleContainmentPath returns [EObject current=null] : iv_ruleContainmentPath= ruleContainmentPath EOF ;
    public final EObject entryRuleContainmentPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainmentPath = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:739:2: (iv_ruleContainmentPath= ruleContainmentPath EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:740:2: iv_ruleContainmentPath= ruleContainmentPath EOF
            {
             newCompositeNode(grammarAccess.getContainmentPathRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContainmentPath_in_entryRuleContainmentPath1531);
            iv_ruleContainmentPath=ruleContainmentPath();

            state._fsp--;

             current =iv_ruleContainmentPath; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContainmentPath1541); 

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
    // $ANTLR end "entryRuleContainmentPath"


    // $ANTLR start "ruleContainmentPath"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:747:1: ruleContainmentPath returns [EObject current=null] : ( (lv_path_0_0= ruleContainmentPathElement ) ) ;
    public final EObject ruleContainmentPath() throws RecognitionException {
        EObject current = null;

        EObject lv_path_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:750:28: ( ( (lv_path_0_0= ruleContainmentPathElement ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:751:1: ( (lv_path_0_0= ruleContainmentPathElement ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:751:1: ( (lv_path_0_0= ruleContainmentPathElement ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:752:1: (lv_path_0_0= ruleContainmentPathElement )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:752:1: (lv_path_0_0= ruleContainmentPathElement )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:753:3: lv_path_0_0= ruleContainmentPathElement
            {
             
            	        newCompositeNode(grammarAccess.getContainmentPathAccess().getPathContainmentPathElementParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleContainmentPathElement_in_ruleContainmentPath1586);
            lv_path_0_0=ruleContainmentPathElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContainmentPathRule());
            	        }
                   		set(
                   			current, 
                   			"path",
                    		lv_path_0_0, 
                    		"ContainmentPathElement");
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
    // $ANTLR end "ruleContainmentPath"


    // $ANTLR start "entryRuleOptionalModalPropertyValue"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:779:1: entryRuleOptionalModalPropertyValue returns [EObject current=null] : iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF ;
    public final EObject entryRuleOptionalModalPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalModalPropertyValue = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:780:2: (iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:781:2: iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF
            {
             newCompositeNode(grammarAccess.getOptionalModalPropertyValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOptionalModalPropertyValue_in_entryRuleOptionalModalPropertyValue1622);
            iv_ruleOptionalModalPropertyValue=ruleOptionalModalPropertyValue();

            state._fsp--;

             current =iv_ruleOptionalModalPropertyValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOptionalModalPropertyValue1632); 

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
    // $ANTLR end "entryRuleOptionalModalPropertyValue"


    // $ANTLR start "ruleOptionalModalPropertyValue"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:788:1: ruleOptionalModalPropertyValue returns [EObject current=null] : ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) (otherlv_1= KEYWORD_17 otherlv_2= KEYWORD_26 otherlv_3= KEYWORD_1 ( (otherlv_4= RULE_ID ) ) (otherlv_5= KEYWORD_5 ( (otherlv_6= RULE_ID ) ) )* otherlv_7= KEYWORD_2 )? ) ;
    public final EObject ruleOptionalModalPropertyValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_ownedValue_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:791:28: ( ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) (otherlv_1= KEYWORD_17 otherlv_2= KEYWORD_26 otherlv_3= KEYWORD_1 ( (otherlv_4= RULE_ID ) ) (otherlv_5= KEYWORD_5 ( (otherlv_6= RULE_ID ) ) )* otherlv_7= KEYWORD_2 )? ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:792:1: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) (otherlv_1= KEYWORD_17 otherlv_2= KEYWORD_26 otherlv_3= KEYWORD_1 ( (otherlv_4= RULE_ID ) ) (otherlv_5= KEYWORD_5 ( (otherlv_6= RULE_ID ) ) )* otherlv_7= KEYWORD_2 )? )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:792:1: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) (otherlv_1= KEYWORD_17 otherlv_2= KEYWORD_26 otherlv_3= KEYWORD_1 ( (otherlv_4= RULE_ID ) ) (otherlv_5= KEYWORD_5 ( (otherlv_6= RULE_ID ) ) )* otherlv_7= KEYWORD_2 )? )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:792:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) ) (otherlv_1= KEYWORD_17 otherlv_2= KEYWORD_26 otherlv_3= KEYWORD_1 ( (otherlv_4= RULE_ID ) ) (otherlv_5= KEYWORD_5 ( (otherlv_6= RULE_ID ) ) )* otherlv_7= KEYWORD_2 )?
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:792:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:793:1: (lv_ownedValue_0_0= rulePropertyExpression )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:793:1: (lv_ownedValue_0_0= rulePropertyExpression )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:794:3: lv_ownedValue_0_0= rulePropertyExpression
            {
             
            	        newCompositeNode(grammarAccess.getOptionalModalPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePropertyExpression_in_ruleOptionalModalPropertyValue1678);
            lv_ownedValue_0_0=rulePropertyExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptionalModalPropertyValueRule());
            	        }
                   		set(
                   			current, 
                   			"ownedValue",
                    		lv_ownedValue_0_0, 
                    		"PropertyExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:810:2: (otherlv_1= KEYWORD_17 otherlv_2= KEYWORD_26 otherlv_3= KEYWORD_1 ( (otherlv_4= RULE_ID ) ) (otherlv_5= KEYWORD_5 ( (otherlv_6= RULE_ID ) ) )* otherlv_7= KEYWORD_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==KEYWORD_17) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==KEYWORD_26) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:811:2: otherlv_1= KEYWORD_17 otherlv_2= KEYWORD_26 otherlv_3= KEYWORD_1 ( (otherlv_4= RULE_ID ) ) (otherlv_5= KEYWORD_5 ( (otherlv_6= RULE_ID ) ) )* otherlv_7= KEYWORD_2
                    {
                    otherlv_1=(Token)match(input,KEYWORD_17,FollowSets000.FOLLOW_KEYWORD_17_in_ruleOptionalModalPropertyValue1692); 

                        	newLeafNode(otherlv_1, grammarAccess.getOptionalModalPropertyValueAccess().getInKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,KEYWORD_26,FollowSets000.FOLLOW_KEYWORD_26_in_ruleOptionalModalPropertyValue1704); 

                        	newLeafNode(otherlv_2, grammarAccess.getOptionalModalPropertyValueAccess().getModesKeyword_1_1());
                        
                    otherlv_3=(Token)match(input,KEYWORD_1,FollowSets000.FOLLOW_KEYWORD_1_in_ruleOptionalModalPropertyValue1716); 

                        	newLeafNode(otherlv_3, grammarAccess.getOptionalModalPropertyValueAccess().getLeftParenthesisKeyword_1_2());
                        
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:825:1: ( (otherlv_4= RULE_ID ) )
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:826:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:826:1: (otherlv_4= RULE_ID )
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:827:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleOptionalModalPropertyValue1735); 

                    		newLeafNode(otherlv_4, grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_3_0()); 
                    	

                    }


                    }

                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:838:2: (otherlv_5= KEYWORD_5 ( (otherlv_6= RULE_ID ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==KEYWORD_5) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:839:2: otherlv_5= KEYWORD_5 ( (otherlv_6= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,KEYWORD_5,FollowSets000.FOLLOW_KEYWORD_5_in_ruleOptionalModalPropertyValue1749); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getOptionalModalPropertyValueAccess().getCommaKeyword_1_4_0());
                    	        
                    	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:843:1: ( (otherlv_6= RULE_ID ) )
                    	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:844:1: (otherlv_6= RULE_ID )
                    	    {
                    	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:844:1: (otherlv_6= RULE_ID )
                    	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:845:3: otherlv_6= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
                    	    	        }
                    	            
                    	    otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleOptionalModalPropertyValue1768); 

                    	    		newLeafNode(otherlv_6, grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_4_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,KEYWORD_2,FollowSets000.FOLLOW_KEYWORD_2_in_ruleOptionalModalPropertyValue1783); 

                        	newLeafNode(otherlv_7, grammarAccess.getOptionalModalPropertyValueAccess().getRightParenthesisKeyword_1_5());
                        

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
    // $ANTLR end "ruleOptionalModalPropertyValue"


    // $ANTLR start "entryRulePropertyValue"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:869:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:870:2: (iv_rulePropertyValue= rulePropertyValue EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:871:2: iv_rulePropertyValue= rulePropertyValue EOF
            {
             newCompositeNode(grammarAccess.getPropertyValueRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePropertyValue_in_entryRulePropertyValue1819);
            iv_rulePropertyValue=rulePropertyValue();

            state._fsp--;

             current =iv_rulePropertyValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePropertyValue1829); 

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
    // $ANTLR end "entryRulePropertyValue"


    // $ANTLR start "rulePropertyValue"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:878:1: rulePropertyValue returns [EObject current=null] : ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedValue_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:881:28: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:882:1: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:882:1: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:883:1: (lv_ownedValue_0_0= rulePropertyExpression )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:883:1: (lv_ownedValue_0_0= rulePropertyExpression )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:884:3: lv_ownedValue_0_0= rulePropertyExpression
            {
             
            	        newCompositeNode(grammarAccess.getPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePropertyExpression_in_rulePropertyValue1874);
            lv_ownedValue_0_0=rulePropertyExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyValueRule());
            	        }
                   		set(
                   			current, 
                   			"ownedValue",
                    		lv_ownedValue_0_0, 
                    		"PropertyExpression");
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
    // $ANTLR end "rulePropertyValue"


    // $ANTLR start "entryRulePropertyExpression"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:908:1: entryRulePropertyExpression returns [EObject current=null] : iv_rulePropertyExpression= rulePropertyExpression EOF ;
    public final EObject entryRulePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyExpression = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:909:2: (iv_rulePropertyExpression= rulePropertyExpression EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:910:2: iv_rulePropertyExpression= rulePropertyExpression EOF
            {
             newCompositeNode(grammarAccess.getPropertyExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePropertyExpression_in_entryRulePropertyExpression1908);
            iv_rulePropertyExpression=rulePropertyExpression();

            state._fsp--;

             current =iv_rulePropertyExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePropertyExpression1918); 

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
    // $ANTLR end "entryRulePropertyExpression"


    // $ANTLR start "rulePropertyExpression"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:917:1: rulePropertyExpression returns [EObject current=null] : (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm ) ;
    public final EObject rulePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RecordTerm_0 = null;

        EObject this_ReferenceTerm_1 = null;

        EObject this_ComponentClassifierTerm_2 = null;

        EObject this_ComputedTerm_3 = null;

        EObject this_StringTerm_4 = null;

        EObject this_NumericRangeTerm_5 = null;

        EObject this_RealTerm_6 = null;

        EObject this_IntegerTerm_7 = null;

        EObject this_ListTerm_8 = null;

        EObject this_BooleanLiteral_9 = null;

        EObject this_LiteralorReferenceTerm_10 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:920:28: ( (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:921:1: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:921:1: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )
            int alt14=11;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:922:5: this_RecordTerm_0= ruleRecordTerm
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getRecordTermParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRecordTerm_in_rulePropertyExpression1965);
                    this_RecordTerm_0=ruleRecordTerm();

                    state._fsp--;


                            current = this_RecordTerm_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:932:5: this_ReferenceTerm_1= ruleReferenceTerm
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getReferenceTermParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleReferenceTerm_in_rulePropertyExpression1992);
                    this_ReferenceTerm_1=ruleReferenceTerm();

                    state._fsp--;


                            current = this_ReferenceTerm_1;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:942:5: this_ComponentClassifierTerm_2= ruleComponentClassifierTerm
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getComponentClassifierTermParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleComponentClassifierTerm_in_rulePropertyExpression2019);
                    this_ComponentClassifierTerm_2=ruleComponentClassifierTerm();

                    state._fsp--;


                            current = this_ComponentClassifierTerm_2;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:952:5: this_ComputedTerm_3= ruleComputedTerm
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getComputedTermParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleComputedTerm_in_rulePropertyExpression2046);
                    this_ComputedTerm_3=ruleComputedTerm();

                    state._fsp--;


                            current = this_ComputedTerm_3;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:962:5: this_StringTerm_4= ruleStringTerm
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getStringTermParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStringTerm_in_rulePropertyExpression2073);
                    this_StringTerm_4=ruleStringTerm();

                    state._fsp--;


                            current = this_StringTerm_4;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:972:5: this_NumericRangeTerm_5= ruleNumericRangeTerm
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getNumericRangeTermParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumericRangeTerm_in_rulePropertyExpression2100);
                    this_NumericRangeTerm_5=ruleNumericRangeTerm();

                    state._fsp--;


                            current = this_NumericRangeTerm_5;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:982:5: this_RealTerm_6= ruleRealTerm
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getRealTermParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRealTerm_in_rulePropertyExpression2127);
                    this_RealTerm_6=ruleRealTerm();

                    state._fsp--;


                            current = this_RealTerm_6;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:992:5: this_IntegerTerm_7= ruleIntegerTerm
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getIntegerTermParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerTerm_in_rulePropertyExpression2154);
                    this_IntegerTerm_7=ruleIntegerTerm();

                    state._fsp--;


                            current = this_IntegerTerm_7;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1002:5: this_ListTerm_8= ruleListTerm
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getListTermParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleListTerm_in_rulePropertyExpression2181);
                    this_ListTerm_8=ruleListTerm();

                    state._fsp--;


                            current = this_ListTerm_8;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1012:5: this_BooleanLiteral_9= ruleBooleanLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getBooleanLiteralParserRuleCall_9()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteral_in_rulePropertyExpression2208);
                    this_BooleanLiteral_9=ruleBooleanLiteral();

                    state._fsp--;


                            current = this_BooleanLiteral_9;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1022:5: this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getLiteralorReferenceTermParserRuleCall_10()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralorReferenceTerm_in_rulePropertyExpression2235);
                    this_LiteralorReferenceTerm_10=ruleLiteralorReferenceTerm();

                    state._fsp--;


                            current = this_LiteralorReferenceTerm_10;
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
    // $ANTLR end "rulePropertyExpression"


    // $ANTLR start "entryRuleLiteralorReferenceTerm"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1038:1: entryRuleLiteralorReferenceTerm returns [EObject current=null] : iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF ;
    public final EObject entryRuleLiteralorReferenceTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralorReferenceTerm = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1039:2: (iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1040:2: iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF
            {
             newCompositeNode(grammarAccess.getLiteralorReferenceTermRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralorReferenceTerm_in_entryRuleLiteralorReferenceTerm2269);
            iv_ruleLiteralorReferenceTerm=ruleLiteralorReferenceTerm();

            state._fsp--;

             current =iv_ruleLiteralorReferenceTerm; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralorReferenceTerm2279); 

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
    // $ANTLR end "entryRuleLiteralorReferenceTerm"


    // $ANTLR start "ruleLiteralorReferenceTerm"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1047:1: ruleLiteralorReferenceTerm returns [EObject current=null] : ( ( ruleQPREF ) ) ;
    public final EObject ruleLiteralorReferenceTerm() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1050:28: ( ( ( ruleQPREF ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1051:1: ( ( ruleQPREF ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1051:1: ( ( ruleQPREF ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1052:1: ( ruleQPREF )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1052:1: ( ruleQPREF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1053:3: ruleQPREF
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLiteralorReferenceTermRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLiteralorReferenceTermAccess().getNamedValueAbstractNamedValueCrossReference_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQPREF_in_ruleLiteralorReferenceTerm2326);
            ruleQPREF();

            state._fsp--;

             
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
    // $ANTLR end "ruleLiteralorReferenceTerm"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1074:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1075:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1076:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral2360);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanLiteral2370); 

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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1083:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= KEYWORD_23 ) ) | otherlv_2= KEYWORD_25 ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1086:28: ( ( () ( ( (lv_value_1_0= KEYWORD_23 ) ) | otherlv_2= KEYWORD_25 ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1087:1: ( () ( ( (lv_value_1_0= KEYWORD_23 ) ) | otherlv_2= KEYWORD_25 ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1087:1: ( () ( ( (lv_value_1_0= KEYWORD_23 ) ) | otherlv_2= KEYWORD_25 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1087:2: () ( ( (lv_value_1_0= KEYWORD_23 ) ) | otherlv_2= KEYWORD_25 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1087:2: ()
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1088:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
                        current);
                

            }

            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1093:2: ( ( (lv_value_1_0= KEYWORD_23 ) ) | otherlv_2= KEYWORD_25 )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==KEYWORD_23) ) {
                alt15=1;
            }
            else if ( (LA15_0==KEYWORD_25) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1093:3: ( (lv_value_1_0= KEYWORD_23 ) )
                    {
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1093:3: ( (lv_value_1_0= KEYWORD_23 ) )
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1094:1: (lv_value_1_0= KEYWORD_23 )
                    {
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1094:1: (lv_value_1_0= KEYWORD_23 )
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1095:3: lv_value_1_0= KEYWORD_23
                    {
                    lv_value_1_0=(Token)match(input,KEYWORD_23,FollowSets000.FOLLOW_KEYWORD_23_in_ruleBooleanLiteral2424); 

                            newLeafNode(lv_value_1_0, grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "value", true, "true");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1111:2: otherlv_2= KEYWORD_25
                    {
                    otherlv_2=(Token)match(input,KEYWORD_25,FollowSets000.FOLLOW_KEYWORD_25_in_ruleBooleanLiteral2454); 

                        	newLeafNode(otherlv_2, grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1());
                        

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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleConstantValue"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1123:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1124:2: (iv_ruleConstantValue= ruleConstantValue EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1125:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
             newCompositeNode(grammarAccess.getConstantValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstantValue_in_entryRuleConstantValue2489);
            iv_ruleConstantValue=ruleConstantValue();

            state._fsp--;

             current =iv_ruleConstantValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantValue2499); 

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
    // $ANTLR end "entryRuleConstantValue"


    // $ANTLR start "ruleConstantValue"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1132:1: ruleConstantValue returns [EObject current=null] : ( ( ruleQPREF ) ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1135:28: ( ( ( ruleQPREF ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1136:1: ( ( ruleQPREF ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1136:1: ( ( ruleQPREF ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1137:1: ( ruleQPREF )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1137:1: ( ruleQPREF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1138:3: ruleQPREF
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConstantValueRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getConstantValueAccess().getNamedValuePropertyConstantCrossReference_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQPREF_in_ruleConstantValue2546);
            ruleQPREF();

            state._fsp--;

             
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
    // $ANTLR end "ruleConstantValue"


    // $ANTLR start "entryRuleReferenceTerm"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1159:1: entryRuleReferenceTerm returns [EObject current=null] : iv_ruleReferenceTerm= ruleReferenceTerm EOF ;
    public final EObject entryRuleReferenceTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceTerm = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1160:2: (iv_ruleReferenceTerm= ruleReferenceTerm EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1161:2: iv_ruleReferenceTerm= ruleReferenceTerm EOF
            {
             newCompositeNode(grammarAccess.getReferenceTermRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReferenceTerm_in_entryRuleReferenceTerm2580);
            iv_ruleReferenceTerm=ruleReferenceTerm();

            state._fsp--;

             current =iv_ruleReferenceTerm; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReferenceTerm2590); 

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
    // $ANTLR end "entryRuleReferenceTerm"


    // $ANTLR start "ruleReferenceTerm"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1168:1: ruleReferenceTerm returns [EObject current=null] : (otherlv_0= KEYWORD_34 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= KEYWORD_2 ) ;
    public final EObject ruleReferenceTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_path_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1171:28: ( (otherlv_0= KEYWORD_34 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= KEYWORD_2 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1172:1: (otherlv_0= KEYWORD_34 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= KEYWORD_2 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1172:1: (otherlv_0= KEYWORD_34 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= KEYWORD_2 )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1173:2: otherlv_0= KEYWORD_34 otherlv_1= KEYWORD_1 ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_34,FollowSets000.FOLLOW_KEYWORD_34_in_ruleReferenceTerm2628); 

                	newLeafNode(otherlv_0, grammarAccess.getReferenceTermAccess().getReferenceKeyword_0());
                
            otherlv_1=(Token)match(input,KEYWORD_1,FollowSets000.FOLLOW_KEYWORD_1_in_ruleReferenceTerm2640); 

                	newLeafNode(otherlv_1, grammarAccess.getReferenceTermAccess().getLeftParenthesisKeyword_1());
                
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1182:1: ( (lv_path_2_0= ruleContainmentPathElement ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1183:1: (lv_path_2_0= ruleContainmentPathElement )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1183:1: (lv_path_2_0= ruleContainmentPathElement )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1184:3: lv_path_2_0= ruleContainmentPathElement
            {
             
            	        newCompositeNode(grammarAccess.getReferenceTermAccess().getPathContainmentPathElementParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleContainmentPathElement_in_ruleReferenceTerm2660);
            lv_path_2_0=ruleContainmentPathElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReferenceTermRule());
            	        }
                   		set(
                   			current, 
                   			"path",
                    		lv_path_2_0, 
                    		"ContainmentPathElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,KEYWORD_2,FollowSets000.FOLLOW_KEYWORD_2_in_ruleReferenceTerm2673); 

                	newLeafNode(otherlv_3, grammarAccess.getReferenceTermAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleReferenceTerm"


    // $ANTLR start "entryRuleRecordTerm"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1213:1: entryRuleRecordTerm returns [EObject current=null] : iv_ruleRecordTerm= ruleRecordTerm EOF ;
    public final EObject entryRuleRecordTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordTerm = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1214:2: (iv_ruleRecordTerm= ruleRecordTerm EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1215:2: iv_ruleRecordTerm= ruleRecordTerm EOF
            {
             newCompositeNode(grammarAccess.getRecordTermRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRecordTerm_in_entryRuleRecordTerm2707);
            iv_ruleRecordTerm=ruleRecordTerm();

            state._fsp--;

             current =iv_ruleRecordTerm; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRecordTerm2717); 

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
    // $ANTLR end "entryRuleRecordTerm"


    // $ANTLR start "ruleRecordTerm"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1222:1: ruleRecordTerm returns [EObject current=null] : (otherlv_0= KEYWORD_10 ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= KEYWORD_11 ) ;
    public final EObject ruleRecordTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedFieldValue_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1225:28: ( (otherlv_0= KEYWORD_10 ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= KEYWORD_11 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1226:1: (otherlv_0= KEYWORD_10 ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= KEYWORD_11 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1226:1: (otherlv_0= KEYWORD_10 ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= KEYWORD_11 )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1227:2: otherlv_0= KEYWORD_10 ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= KEYWORD_11
            {
            otherlv_0=(Token)match(input,KEYWORD_10,FollowSets000.FOLLOW_KEYWORD_10_in_ruleRecordTerm2755); 

                	newLeafNode(otherlv_0, grammarAccess.getRecordTermAccess().getLeftSquareBracketKeyword_0());
                
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1231:1: ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1232:1: (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation )
            	    {
            	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1232:1: (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation )
            	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1233:3: lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRecordTermAccess().getOwnedFieldValueFieldPropertyAssociationParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleFieldPropertyAssociation_in_ruleRecordTerm2775);
            	    lv_ownedFieldValue_1_0=ruleFieldPropertyAssociation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRecordTermRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ownedFieldValue",
            	            		lv_ownedFieldValue_1_0, 
            	            		"FieldPropertyAssociation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            otherlv_2=(Token)match(input,KEYWORD_11,FollowSets000.FOLLOW_KEYWORD_11_in_ruleRecordTerm2789); 

                	newLeafNode(otherlv_2, grammarAccess.getRecordTermAccess().getRightSquareBracketKeyword_2());
                

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
    // $ANTLR end "ruleRecordTerm"


    // $ANTLR start "entryRuleComputedTerm"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1264:1: entryRuleComputedTerm returns [EObject current=null] : iv_ruleComputedTerm= ruleComputedTerm EOF ;
    public final EObject entryRuleComputedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputedTerm = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1265:2: (iv_ruleComputedTerm= ruleComputedTerm EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1266:2: iv_ruleComputedTerm= ruleComputedTerm EOF
            {
             newCompositeNode(grammarAccess.getComputedTermRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComputedTerm_in_entryRuleComputedTerm2825);
            iv_ruleComputedTerm=ruleComputedTerm();

            state._fsp--;

             current =iv_ruleComputedTerm; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComputedTerm2835); 

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
    // $ANTLR end "entryRuleComputedTerm"


    // $ANTLR start "ruleComputedTerm"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1273:1: ruleComputedTerm returns [EObject current=null] : (otherlv_0= KEYWORD_29 otherlv_1= KEYWORD_1 ( (lv_function_2_0= RULE_ID ) ) otherlv_3= KEYWORD_2 ) ;
    public final EObject ruleComputedTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_function_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1276:28: ( (otherlv_0= KEYWORD_29 otherlv_1= KEYWORD_1 ( (lv_function_2_0= RULE_ID ) ) otherlv_3= KEYWORD_2 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1277:1: (otherlv_0= KEYWORD_29 otherlv_1= KEYWORD_1 ( (lv_function_2_0= RULE_ID ) ) otherlv_3= KEYWORD_2 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1277:1: (otherlv_0= KEYWORD_29 otherlv_1= KEYWORD_1 ( (lv_function_2_0= RULE_ID ) ) otherlv_3= KEYWORD_2 )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1278:2: otherlv_0= KEYWORD_29 otherlv_1= KEYWORD_1 ( (lv_function_2_0= RULE_ID ) ) otherlv_3= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_29,FollowSets000.FOLLOW_KEYWORD_29_in_ruleComputedTerm2873); 

                	newLeafNode(otherlv_0, grammarAccess.getComputedTermAccess().getComputeKeyword_0());
                
            otherlv_1=(Token)match(input,KEYWORD_1,FollowSets000.FOLLOW_KEYWORD_1_in_ruleComputedTerm2885); 

                	newLeafNode(otherlv_1, grammarAccess.getComputedTermAccess().getLeftParenthesisKeyword_1());
                
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1287:1: ( (lv_function_2_0= RULE_ID ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1288:1: (lv_function_2_0= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1288:1: (lv_function_2_0= RULE_ID )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1289:3: lv_function_2_0= RULE_ID
            {
            lv_function_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleComputedTerm2901); 

            			newLeafNode(lv_function_2_0, grammarAccess.getComputedTermAccess().getFunctionIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComputedTermRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"function",
                    		lv_function_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,KEYWORD_2,FollowSets000.FOLLOW_KEYWORD_2_in_ruleComputedTerm2919); 

                	newLeafNode(otherlv_3, grammarAccess.getComputedTermAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleComputedTerm"


    // $ANTLR start "entryRuleComponentClassifierTerm"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1318:1: entryRuleComponentClassifierTerm returns [EObject current=null] : iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF ;
    public final EObject entryRuleComponentClassifierTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentClassifierTerm = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1319:2: (iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1320:2: iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF
            {
             newCompositeNode(grammarAccess.getComponentClassifierTermRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComponentClassifierTerm_in_entryRuleComponentClassifierTerm2953);
            iv_ruleComponentClassifierTerm=ruleComponentClassifierTerm();

            state._fsp--;

             current =iv_ruleComponentClassifierTerm; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComponentClassifierTerm2963); 

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
    // $ANTLR end "entryRuleComponentClassifierTerm"


    // $ANTLR start "ruleComponentClassifierTerm"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1327:1: ruleComponentClassifierTerm returns [EObject current=null] : (otherlv_0= KEYWORD_35 otherlv_1= KEYWORD_1 ( ( ruleQCREF ) ) otherlv_3= KEYWORD_2 ) ;
    public final EObject ruleComponentClassifierTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1330:28: ( (otherlv_0= KEYWORD_35 otherlv_1= KEYWORD_1 ( ( ruleQCREF ) ) otherlv_3= KEYWORD_2 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1331:1: (otherlv_0= KEYWORD_35 otherlv_1= KEYWORD_1 ( ( ruleQCREF ) ) otherlv_3= KEYWORD_2 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1331:1: (otherlv_0= KEYWORD_35 otherlv_1= KEYWORD_1 ( ( ruleQCREF ) ) otherlv_3= KEYWORD_2 )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1332:2: otherlv_0= KEYWORD_35 otherlv_1= KEYWORD_1 ( ( ruleQCREF ) ) otherlv_3= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_35,FollowSets000.FOLLOW_KEYWORD_35_in_ruleComponentClassifierTerm3001); 

                	newLeafNode(otherlv_0, grammarAccess.getComponentClassifierTermAccess().getClassifierKeyword_0());
                
            otherlv_1=(Token)match(input,KEYWORD_1,FollowSets000.FOLLOW_KEYWORD_1_in_ruleComponentClassifierTerm3013); 

                	newLeafNode(otherlv_1, grammarAccess.getComponentClassifierTermAccess().getLeftParenthesisKeyword_1());
                
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1341:1: ( ( ruleQCREF ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1342:1: ( ruleQCREF )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1342:1: ( ruleQCREF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1343:3: ruleQCREF
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentClassifierTermRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getComponentClassifierTermAccess().getClassifierComponentClassifierCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQCREF_in_ruleComponentClassifierTerm3035);
            ruleQCREF();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,KEYWORD_2,FollowSets000.FOLLOW_KEYWORD_2_in_ruleComponentClassifierTerm3048); 

                	newLeafNode(otherlv_3, grammarAccess.getComponentClassifierTermAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleComponentClassifierTerm"


    // $ANTLR start "entryRuleListTerm"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1369:1: entryRuleListTerm returns [EObject current=null] : iv_ruleListTerm= ruleListTerm EOF ;
    public final EObject entryRuleListTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListTerm = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1370:2: (iv_ruleListTerm= ruleListTerm EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1371:2: iv_ruleListTerm= ruleListTerm EOF
            {
             newCompositeNode(grammarAccess.getListTermRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleListTerm_in_entryRuleListTerm3082);
            iv_ruleListTerm=ruleListTerm();

            state._fsp--;

             current =iv_ruleListTerm; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleListTerm3092); 

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
    // $ANTLR end "entryRuleListTerm"


    // $ANTLR start "ruleListTerm"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1378:1: ruleListTerm returns [EObject current=null] : ( () otherlv_1= KEYWORD_1 ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= KEYWORD_2 ) ;
    public final EObject ruleListTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedListElement_2_0 = null;

        EObject lv_ownedListElement_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1381:28: ( ( () otherlv_1= KEYWORD_1 ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= KEYWORD_2 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1382:1: ( () otherlv_1= KEYWORD_1 ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= KEYWORD_2 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1382:1: ( () otherlv_1= KEYWORD_1 ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= KEYWORD_2 )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1382:2: () otherlv_1= KEYWORD_1 ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= KEYWORD_2
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1382:2: ()
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1383:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getListTermAccess().getListValueAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,KEYWORD_1,FollowSets000.FOLLOW_KEYWORD_1_in_ruleListTerm3139); 

                	newLeafNode(otherlv_1, grammarAccess.getListTermAccess().getLeftParenthesisKeyword_1());
                
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1393:1: ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=KEYWORD_35 && LA18_0<=KEYWORD_34)||LA18_0==KEYWORD_29||LA18_0==KEYWORD_25||LA18_0==KEYWORD_23||LA18_0==KEYWORD_1||LA18_0==KEYWORD_4||LA18_0==KEYWORD_6||LA18_0==KEYWORD_10||LA18_0==RULE_ID||LA18_0==RULE_REAL_LIT||LA18_0==RULE_INTEGER_LIT||LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1393:2: ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )*
                    {
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1393:2: ( (lv_ownedListElement_2_0= rulePropertyExpression ) )
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1394:1: (lv_ownedListElement_2_0= rulePropertyExpression )
                    {
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1394:1: (lv_ownedListElement_2_0= rulePropertyExpression )
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1395:3: lv_ownedListElement_2_0= rulePropertyExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePropertyExpression_in_ruleListTerm3160);
                    lv_ownedListElement_2_0=rulePropertyExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getListTermRule());
                    	        }
                           		add(
                           			current, 
                           			"ownedListElement",
                            		lv_ownedListElement_2_0, 
                            		"PropertyExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1411:2: (otherlv_3= KEYWORD_5 ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==KEYWORD_5) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1412:2: otherlv_3= KEYWORD_5 ( (lv_ownedListElement_4_0= rulePropertyExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,KEYWORD_5,FollowSets000.FOLLOW_KEYWORD_5_in_ruleListTerm3174); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getListTermAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1416:1: ( (lv_ownedListElement_4_0= rulePropertyExpression ) )
                    	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1417:1: (lv_ownedListElement_4_0= rulePropertyExpression )
                    	    {
                    	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1417:1: (lv_ownedListElement_4_0= rulePropertyExpression )
                    	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1418:3: lv_ownedListElement_4_0= rulePropertyExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_rulePropertyExpression_in_ruleListTerm3194);
                    	    lv_ownedListElement_4_0=rulePropertyExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getListTermRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"ownedListElement",
                    	            		lv_ownedListElement_4_0, 
                    	            		"PropertyExpression");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,KEYWORD_2,FollowSets000.FOLLOW_KEYWORD_2_in_ruleListTerm3211); 

                	newLeafNode(otherlv_5, grammarAccess.getListTermAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleListTerm"


    // $ANTLR start "entryRuleFieldPropertyAssociation"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1447:1: entryRuleFieldPropertyAssociation returns [EObject current=null] : iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF ;
    public final EObject entryRuleFieldPropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldPropertyAssociation = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1448:2: (iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1449:2: iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF
            {
             newCompositeNode(grammarAccess.getFieldPropertyAssociationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFieldPropertyAssociation_in_entryRuleFieldPropertyAssociation3245);
            iv_ruleFieldPropertyAssociation=ruleFieldPropertyAssociation();

            state._fsp--;

             current =iv_ruleFieldPropertyAssociation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFieldPropertyAssociation3255); 

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
    // $ANTLR end "entryRuleFieldPropertyAssociation"


    // $ANTLR start "ruleFieldPropertyAssociation"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1456:1: ruleFieldPropertyAssociation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= KEYWORD_16 ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= KEYWORD_9 ) ;
    public final EObject ruleFieldPropertyAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1459:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= KEYWORD_16 ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= KEYWORD_9 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1460:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= KEYWORD_16 ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= KEYWORD_9 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1460:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= KEYWORD_16 ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= KEYWORD_9 )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1460:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= KEYWORD_16 ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= KEYWORD_9
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1460:2: ( (otherlv_0= RULE_ID ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1461:1: (otherlv_0= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1461:1: (otherlv_0= RULE_ID )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1462:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldPropertyAssociationRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFieldPropertyAssociation3300); 

            		newLeafNode(otherlv_0, grammarAccess.getFieldPropertyAssociationAccess().getPropertyBasicPropertyCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,KEYWORD_16,FollowSets000.FOLLOW_KEYWORD_16_in_ruleFieldPropertyAssociation3313); 

                	newLeafNode(otherlv_1, grammarAccess.getFieldPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1());
                
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1478:1: ( (lv_ownedValue_2_0= rulePropertyExpression ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1479:1: (lv_ownedValue_2_0= rulePropertyExpression )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1479:1: (lv_ownedValue_2_0= rulePropertyExpression )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1480:3: lv_ownedValue_2_0= rulePropertyExpression
            {
             
            	        newCompositeNode(grammarAccess.getFieldPropertyAssociationAccess().getOwnedValuePropertyExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePropertyExpression_in_ruleFieldPropertyAssociation3333);
            lv_ownedValue_2_0=rulePropertyExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFieldPropertyAssociationRule());
            	        }
                   		set(
                   			current, 
                   			"ownedValue",
                    		lv_ownedValue_2_0, 
                    		"PropertyExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,KEYWORD_9,FollowSets000.FOLLOW_KEYWORD_9_in_ruleFieldPropertyAssociation3346); 

                	newLeafNode(otherlv_3, grammarAccess.getFieldPropertyAssociationAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleFieldPropertyAssociation"


    // $ANTLR start "entryRuleContainmentPathElement"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1509:1: entryRuleContainmentPathElement returns [EObject current=null] : iv_ruleContainmentPathElement= ruleContainmentPathElement EOF ;
    public final EObject entryRuleContainmentPathElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainmentPathElement = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1510:2: (iv_ruleContainmentPathElement= ruleContainmentPathElement EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1511:2: iv_ruleContainmentPathElement= ruleContainmentPathElement EOF
            {
             newCompositeNode(grammarAccess.getContainmentPathElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContainmentPathElement_in_entryRuleContainmentPathElement3380);
            iv_ruleContainmentPathElement=ruleContainmentPathElement();

            state._fsp--;

             current =iv_ruleContainmentPathElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContainmentPathElement3390); 

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
    // $ANTLR end "entryRuleContainmentPathElement"


    // $ANTLR start "ruleContainmentPathElement"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1518:1: ruleContainmentPathElement returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )? ) (otherlv_2= KEYWORD_7 ( (lv_path_3_0= ruleContainmentPathElement ) ) )? ) ;
    public final EObject ruleContainmentPathElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arrayRange_1_0 = null;

        EObject lv_path_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1521:28: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )? ) (otherlv_2= KEYWORD_7 ( (lv_path_3_0= ruleContainmentPathElement ) ) )? ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1522:1: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )? ) (otherlv_2= KEYWORD_7 ( (lv_path_3_0= ruleContainmentPathElement ) ) )? )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1522:1: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )? ) (otherlv_2= KEYWORD_7 ( (lv_path_3_0= ruleContainmentPathElement ) ) )? )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1522:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )? ) (otherlv_2= KEYWORD_7 ( (lv_path_3_0= ruleContainmentPathElement ) ) )?
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1522:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )? )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1522:3: ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )?
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1522:3: ( (otherlv_0= RULE_ID ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1523:1: (otherlv_0= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1523:1: (otherlv_0= RULE_ID )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1524:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContainmentPathElementRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleContainmentPathElement3436); 

            		newLeafNode(otherlv_0, grammarAccess.getContainmentPathElementAccess().getNamedElementNamedElementCrossReference_0_0_0()); 
            	

            }


            }

            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1535:2: ( (lv_arrayRange_1_0= ruleArrayRange ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==KEYWORD_10) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1536:1: (lv_arrayRange_1_0= ruleArrayRange )
                    {
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1536:1: (lv_arrayRange_1_0= ruleArrayRange )
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1537:3: lv_arrayRange_1_0= ruleArrayRange
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainmentPathElementAccess().getArrayRangeArrayRangeParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleArrayRange_in_ruleContainmentPathElement3457);
                    lv_arrayRange_1_0=ruleArrayRange();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContainmentPathElementRule());
                    	        }
                           		add(
                           			current, 
                           			"arrayRange",
                            		lv_arrayRange_1_0, 
                            		"ArrayRange");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }

            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1553:4: (otherlv_2= KEYWORD_7 ( (lv_path_3_0= ruleContainmentPathElement ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==KEYWORD_7) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1554:2: otherlv_2= KEYWORD_7 ( (lv_path_3_0= ruleContainmentPathElement ) )
                    {
                    otherlv_2=(Token)match(input,KEYWORD_7,FollowSets000.FOLLOW_KEYWORD_7_in_ruleContainmentPathElement3473); 

                        	newLeafNode(otherlv_2, grammarAccess.getContainmentPathElementAccess().getFullStopKeyword_1_0());
                        
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1558:1: ( (lv_path_3_0= ruleContainmentPathElement ) )
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1559:1: (lv_path_3_0= ruleContainmentPathElement )
                    {
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1559:1: (lv_path_3_0= ruleContainmentPathElement )
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1560:3: lv_path_3_0= ruleContainmentPathElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainmentPathElementAccess().getPathContainmentPathElementParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleContainmentPathElement_in_ruleContainmentPathElement3493);
                    lv_path_3_0=ruleContainmentPathElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContainmentPathElementRule());
                    	        }
                           		set(
                           			current, 
                           			"path",
                            		lv_path_3_0, 
                            		"ContainmentPathElement");
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
    // $ANTLR end "ruleContainmentPathElement"


    // $ANTLR start "entryRulePlusMinus"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1586:1: entryRulePlusMinus returns [String current=null] : iv_rulePlusMinus= rulePlusMinus EOF ;
    public final String entryRulePlusMinus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePlusMinus = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1587:1: (iv_rulePlusMinus= rulePlusMinus EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1588:2: iv_rulePlusMinus= rulePlusMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusMinusRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePlusMinus_in_entryRulePlusMinus3533);
            iv_rulePlusMinus=rulePlusMinus();

            state._fsp--;

             current =iv_rulePlusMinus.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePlusMinus3544); 

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
    // $ANTLR end "entryRulePlusMinus"


    // $ANTLR start "rulePlusMinus"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1595:1: rulePlusMinus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_4 | kw= KEYWORD_6 ) ;
    public final AntlrDatatypeRuleToken rulePlusMinus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1599:6: ( (kw= KEYWORD_4 | kw= KEYWORD_6 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1600:1: (kw= KEYWORD_4 | kw= KEYWORD_6 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1600:1: (kw= KEYWORD_4 | kw= KEYWORD_6 )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==KEYWORD_4) ) {
                alt21=1;
            }
            else if ( (LA21_0==KEYWORD_6) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1601:2: kw= KEYWORD_4
                    {
                    kw=(Token)match(input,KEYWORD_4,FollowSets000.FOLLOW_KEYWORD_4_in_rulePlusMinus3582); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1608:2: kw= KEYWORD_6
                    {
                    kw=(Token)match(input,KEYWORD_6,FollowSets000.FOLLOW_KEYWORD_6_in_rulePlusMinus3601); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1()); 
                        

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
    // $ANTLR end "rulePlusMinus"


    // $ANTLR start "entryRuleStringTerm"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1621:1: entryRuleStringTerm returns [EObject current=null] : iv_ruleStringTerm= ruleStringTerm EOF ;
    public final EObject entryRuleStringTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringTerm = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1622:2: (iv_ruleStringTerm= ruleStringTerm EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1623:2: iv_ruleStringTerm= ruleStringTerm EOF
            {
             newCompositeNode(grammarAccess.getStringTermRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStringTerm_in_entryRuleStringTerm3640);
            iv_ruleStringTerm=ruleStringTerm();

            state._fsp--;

             current =iv_ruleStringTerm; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringTerm3650); 

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
    // $ANTLR end "entryRuleStringTerm"


    // $ANTLR start "ruleStringTerm"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1630:1: ruleStringTerm returns [EObject current=null] : ( (lv_value_0_0= ruleNoQuoteString ) ) ;
    public final EObject ruleStringTerm() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1633:28: ( ( (lv_value_0_0= ruleNoQuoteString ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1634:1: ( (lv_value_0_0= ruleNoQuoteString ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1634:1: ( (lv_value_0_0= ruleNoQuoteString ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1635:1: (lv_value_0_0= ruleNoQuoteString )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1635:1: (lv_value_0_0= ruleNoQuoteString )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1636:3: lv_value_0_0= ruleNoQuoteString
            {
             
            	        newCompositeNode(grammarAccess.getStringTermAccess().getValueNoQuoteStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleNoQuoteString_in_ruleStringTerm3695);
            lv_value_0_0=ruleNoQuoteString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStringTermRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"NoQuoteString");
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
    // $ANTLR end "ruleStringTerm"


    // $ANTLR start "entryRuleNoQuoteString"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1660:1: entryRuleNoQuoteString returns [String current=null] : iv_ruleNoQuoteString= ruleNoQuoteString EOF ;
    public final String entryRuleNoQuoteString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoQuoteString = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1661:1: (iv_ruleNoQuoteString= ruleNoQuoteString EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1662:2: iv_ruleNoQuoteString= ruleNoQuoteString EOF
            {
             newCompositeNode(grammarAccess.getNoQuoteStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoQuoteString_in_entryRuleNoQuoteString3730);
            iv_ruleNoQuoteString=ruleNoQuoteString();

            state._fsp--;

             current =iv_ruleNoQuoteString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoQuoteString3741); 

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
    // $ANTLR end "entryRuleNoQuoteString"


    // $ANTLR start "ruleNoQuoteString"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1669:1: ruleNoQuoteString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleNoQuoteString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1673:6: (this_STRING_0= RULE_STRING )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1674:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleNoQuoteString3780); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getNoQuoteStringAccess().getSTRINGTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleNoQuoteString"


    // $ANTLR start "entryRuleArrayRange"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1689:1: entryRuleArrayRange returns [EObject current=null] : iv_ruleArrayRange= ruleArrayRange EOF ;
    public final EObject entryRuleArrayRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayRange = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1690:2: (iv_ruleArrayRange= ruleArrayRange EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1691:2: iv_ruleArrayRange= ruleArrayRange EOF
            {
             newCompositeNode(grammarAccess.getArrayRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArrayRange_in_entryRuleArrayRange3823);
            iv_ruleArrayRange=ruleArrayRange();

            state._fsp--;

             current =iv_ruleArrayRange; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArrayRange3833); 

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
    // $ANTLR end "entryRuleArrayRange"


    // $ANTLR start "ruleArrayRange"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1698:1: ruleArrayRange returns [EObject current=null] : ( () otherlv_1= KEYWORD_10 ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= KEYWORD_14 ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= KEYWORD_11 ) ;
    public final EObject ruleArrayRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_lowerBound_2_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1701:28: ( ( () otherlv_1= KEYWORD_10 ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= KEYWORD_14 ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= KEYWORD_11 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1702:1: ( () otherlv_1= KEYWORD_10 ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= KEYWORD_14 ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= KEYWORD_11 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1702:1: ( () otherlv_1= KEYWORD_10 ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= KEYWORD_14 ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= KEYWORD_11 )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1702:2: () otherlv_1= KEYWORD_10 ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= KEYWORD_14 ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= KEYWORD_11
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1702:2: ()
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1703:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getArrayRangeAccess().getArrayRangeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,KEYWORD_10,FollowSets000.FOLLOW_KEYWORD_10_in_ruleArrayRange3880); 

                	newLeafNode(otherlv_1, grammarAccess.getArrayRangeAccess().getLeftSquareBracketKeyword_1());
                
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1713:1: ( (lv_lowerBound_2_0= ruleINTVALUE ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1714:1: (lv_lowerBound_2_0= ruleINTVALUE )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1714:1: (lv_lowerBound_2_0= ruleINTVALUE )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1715:3: lv_lowerBound_2_0= ruleINTVALUE
            {
             
            	        newCompositeNode(grammarAccess.getArrayRangeAccess().getLowerBoundINTVALUEParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleINTVALUE_in_ruleArrayRange3900);
            lv_lowerBound_2_0=ruleINTVALUE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArrayRangeRule());
            	        }
                   		set(
                   			current, 
                   			"lowerBound",
                    		lv_lowerBound_2_0, 
                    		"INTVALUE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1731:2: (otherlv_3= KEYWORD_14 ( (lv_upperBound_4_0= ruleINTVALUE ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==KEYWORD_14) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1732:2: otherlv_3= KEYWORD_14 ( (lv_upperBound_4_0= ruleINTVALUE ) )
                    {
                    otherlv_3=(Token)match(input,KEYWORD_14,FollowSets000.FOLLOW_KEYWORD_14_in_ruleArrayRange3914); 

                        	newLeafNode(otherlv_3, grammarAccess.getArrayRangeAccess().getFullStopFullStopKeyword_3_0());
                        
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1736:1: ( (lv_upperBound_4_0= ruleINTVALUE ) )
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1737:1: (lv_upperBound_4_0= ruleINTVALUE )
                    {
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1737:1: (lv_upperBound_4_0= ruleINTVALUE )
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1738:3: lv_upperBound_4_0= ruleINTVALUE
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayRangeAccess().getUpperBoundINTVALUEParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleINTVALUE_in_ruleArrayRange3934);
                    lv_upperBound_4_0=ruleINTVALUE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrayRangeRule());
                    	        }
                           		set(
                           			current, 
                           			"upperBound",
                            		lv_upperBound_4_0, 
                            		"INTVALUE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,KEYWORD_11,FollowSets000.FOLLOW_KEYWORD_11_in_ruleArrayRange3949); 

                	newLeafNode(otherlv_5, grammarAccess.getArrayRangeAccess().getRightSquareBracketKeyword_4());
                

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
    // $ANTLR end "ruleArrayRange"


    // $ANTLR start "entryRuleSignedConstant"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1767:1: entryRuleSignedConstant returns [EObject current=null] : iv_ruleSignedConstant= ruleSignedConstant EOF ;
    public final EObject entryRuleSignedConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignedConstant = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1768:2: (iv_ruleSignedConstant= ruleSignedConstant EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1769:2: iv_ruleSignedConstant= ruleSignedConstant EOF
            {
             newCompositeNode(grammarAccess.getSignedConstantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSignedConstant_in_entryRuleSignedConstant3983);
            iv_ruleSignedConstant=ruleSignedConstant();

            state._fsp--;

             current =iv_ruleSignedConstant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSignedConstant3993); 

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
    // $ANTLR end "entryRuleSignedConstant"


    // $ANTLR start "ruleSignedConstant"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1776:1: ruleSignedConstant returns [EObject current=null] : ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) ) ;
    public final EObject ruleSignedConstant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_ownedPropertyExpression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1779:28: ( ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1780:1: ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1780:1: ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1780:2: ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1780:2: ( (lv_op_0_0= rulePlusMinus ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1781:1: (lv_op_0_0= rulePlusMinus )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1781:1: (lv_op_0_0= rulePlusMinus )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1782:3: lv_op_0_0= rulePlusMinus
            {
             
            	        newCompositeNode(grammarAccess.getSignedConstantAccess().getOpPlusMinusParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePlusMinus_in_ruleSignedConstant4039);
            lv_op_0_0=rulePlusMinus();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSignedConstantRule());
            	        }
                   		set(
                   			current, 
                   			"op",
                    		lv_op_0_0, 
                    		"PlusMinus");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1798:2: ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1799:1: (lv_ownedPropertyExpression_1_0= ruleConstantValue )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1799:1: (lv_ownedPropertyExpression_1_0= ruleConstantValue )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1800:3: lv_ownedPropertyExpression_1_0= ruleConstantValue
            {
             
            	        newCompositeNode(grammarAccess.getSignedConstantAccess().getOwnedPropertyExpressionConstantValueParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleConstantValue_in_ruleSignedConstant4060);
            lv_ownedPropertyExpression_1_0=ruleConstantValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSignedConstantRule());
            	        }
                   		add(
                   			current, 
                   			"ownedPropertyExpression",
                    		lv_ownedPropertyExpression_1_0, 
                    		"ConstantValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleSignedConstant"


    // $ANTLR start "entryRuleIntegerTerm"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1824:1: entryRuleIntegerTerm returns [EObject current=null] : iv_ruleIntegerTerm= ruleIntegerTerm EOF ;
    public final EObject entryRuleIntegerTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerTerm = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1825:2: (iv_ruleIntegerTerm= ruleIntegerTerm EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1826:2: iv_ruleIntegerTerm= ruleIntegerTerm EOF
            {
             newCompositeNode(grammarAccess.getIntegerTermRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerTerm_in_entryRuleIntegerTerm4095);
            iv_ruleIntegerTerm=ruleIntegerTerm();

            state._fsp--;

             current =iv_ruleIntegerTerm; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerTerm4105); 

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
    // $ANTLR end "entryRuleIntegerTerm"


    // $ANTLR start "ruleIntegerTerm"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1833:1: ruleIntegerTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleIntegerTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1836:28: ( ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1837:1: ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1837:1: ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1837:2: ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )?
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1837:2: ( (lv_value_0_0= ruleSignedInt ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1838:1: (lv_value_0_0= ruleSignedInt )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1838:1: (lv_value_0_0= ruleSignedInt )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1839:3: lv_value_0_0= ruleSignedInt
            {
             
            	        newCompositeNode(grammarAccess.getIntegerTermAccess().getValueSignedIntParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSignedInt_in_ruleIntegerTerm4151);
            lv_value_0_0=ruleSignedInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerTermRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"SignedInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1855:2: ( (otherlv_1= RULE_ID ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1856:1: (otherlv_1= RULE_ID )
                    {
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1856:1: (otherlv_1= RULE_ID )
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1857:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerTermRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleIntegerTerm4171); 

                    		newLeafNode(otherlv_1, grammarAccess.getIntegerTermAccess().getUnitUnitLiteralCrossReference_1_0()); 
                    	

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
    // $ANTLR end "ruleIntegerTerm"


    // $ANTLR start "entryRuleSignedInt"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1876:1: entryRuleSignedInt returns [String current=null] : iv_ruleSignedInt= ruleSignedInt EOF ;
    public final String entryRuleSignedInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedInt = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1877:1: (iv_ruleSignedInt= ruleSignedInt EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1878:2: iv_ruleSignedInt= ruleSignedInt EOF
            {
             newCompositeNode(grammarAccess.getSignedIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSignedInt_in_entryRuleSignedInt4208);
            iv_ruleSignedInt=ruleSignedInt();

            state._fsp--;

             current =iv_ruleSignedInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSignedInt4219); 

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
    // $ANTLR end "entryRuleSignedInt"


    // $ANTLR start "ruleSignedInt"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1885:1: ruleSignedInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= KEYWORD_4 | kw= KEYWORD_6 )? this_INTEGER_LIT_2= RULE_INTEGER_LIT ) ;
    public final AntlrDatatypeRuleToken ruleSignedInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INTEGER_LIT_2=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1889:6: ( ( (kw= KEYWORD_4 | kw= KEYWORD_6 )? this_INTEGER_LIT_2= RULE_INTEGER_LIT ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1890:1: ( (kw= KEYWORD_4 | kw= KEYWORD_6 )? this_INTEGER_LIT_2= RULE_INTEGER_LIT )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1890:1: ( (kw= KEYWORD_4 | kw= KEYWORD_6 )? this_INTEGER_LIT_2= RULE_INTEGER_LIT )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1890:2: (kw= KEYWORD_4 | kw= KEYWORD_6 )? this_INTEGER_LIT_2= RULE_INTEGER_LIT
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1890:2: (kw= KEYWORD_4 | kw= KEYWORD_6 )?
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==KEYWORD_4) ) {
                alt24=1;
            }
            else if ( (LA24_0==KEYWORD_6) ) {
                alt24=2;
            }
            switch (alt24) {
                case 1 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1891:2: kw= KEYWORD_4
                    {
                    kw=(Token)match(input,KEYWORD_4,FollowSets000.FOLLOW_KEYWORD_4_in_ruleSignedInt4258); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignedIntAccess().getPlusSignKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1898:2: kw= KEYWORD_6
                    {
                    kw=(Token)match(input,KEYWORD_6,FollowSets000.FOLLOW_KEYWORD_6_in_ruleSignedInt4277); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignedIntAccess().getHyphenMinusKeyword_0_1()); 
                        

                    }
                    break;

            }

            this_INTEGER_LIT_2=(Token)match(input,RULE_INTEGER_LIT,FollowSets000.FOLLOW_RULE_INTEGER_LIT_in_ruleSignedInt4294); 

            		current.merge(this_INTEGER_LIT_2);
                
             
                newLeafNode(this_INTEGER_LIT_2, grammarAccess.getSignedIntAccess().getINTEGER_LITTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleSignedInt"


    // $ANTLR start "entryRuleRealTerm"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1918:1: entryRuleRealTerm returns [EObject current=null] : iv_ruleRealTerm= ruleRealTerm EOF ;
    public final EObject entryRuleRealTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealTerm = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1919:2: (iv_ruleRealTerm= ruleRealTerm EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1920:2: iv_ruleRealTerm= ruleRealTerm EOF
            {
             newCompositeNode(grammarAccess.getRealTermRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRealTerm_in_entryRuleRealTerm4338);
            iv_ruleRealTerm=ruleRealTerm();

            state._fsp--;

             current =iv_ruleRealTerm; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRealTerm4348); 

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
    // $ANTLR end "entryRuleRealTerm"


    // $ANTLR start "ruleRealTerm"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1927:1: ruleRealTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleRealTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1930:28: ( ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1931:1: ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1931:1: ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1931:2: ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )?
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1931:2: ( (lv_value_0_0= ruleSignedReal ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1932:1: (lv_value_0_0= ruleSignedReal )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1932:1: (lv_value_0_0= ruleSignedReal )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1933:3: lv_value_0_0= ruleSignedReal
            {
             
            	        newCompositeNode(grammarAccess.getRealTermAccess().getValueSignedRealParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSignedReal_in_ruleRealTerm4394);
            lv_value_0_0=ruleSignedReal();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRealTermRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"SignedReal");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1949:2: ( (otherlv_1= RULE_ID ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1950:1: (otherlv_1= RULE_ID )
                    {
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1950:1: (otherlv_1= RULE_ID )
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1951:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRealTermRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRealTerm4414); 

                    		newLeafNode(otherlv_1, grammarAccess.getRealTermAccess().getUnitUnitLiteralCrossReference_1_0()); 
                    	

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
    // $ANTLR end "ruleRealTerm"


    // $ANTLR start "entryRuleSignedReal"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1970:1: entryRuleSignedReal returns [String current=null] : iv_ruleSignedReal= ruleSignedReal EOF ;
    public final String entryRuleSignedReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedReal = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1971:1: (iv_ruleSignedReal= ruleSignedReal EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1972:2: iv_ruleSignedReal= ruleSignedReal EOF
            {
             newCompositeNode(grammarAccess.getSignedRealRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSignedReal_in_entryRuleSignedReal4451);
            iv_ruleSignedReal=ruleSignedReal();

            state._fsp--;

             current =iv_ruleSignedReal.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSignedReal4462); 

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
    // $ANTLR end "entryRuleSignedReal"


    // $ANTLR start "ruleSignedReal"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1979:1: ruleSignedReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= KEYWORD_4 | kw= KEYWORD_6 )? this_REAL_LIT_2= RULE_REAL_LIT ) ;
    public final AntlrDatatypeRuleToken ruleSignedReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_REAL_LIT_2=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1983:6: ( ( (kw= KEYWORD_4 | kw= KEYWORD_6 )? this_REAL_LIT_2= RULE_REAL_LIT ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1984:1: ( (kw= KEYWORD_4 | kw= KEYWORD_6 )? this_REAL_LIT_2= RULE_REAL_LIT )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1984:1: ( (kw= KEYWORD_4 | kw= KEYWORD_6 )? this_REAL_LIT_2= RULE_REAL_LIT )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1984:2: (kw= KEYWORD_4 | kw= KEYWORD_6 )? this_REAL_LIT_2= RULE_REAL_LIT
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1984:2: (kw= KEYWORD_4 | kw= KEYWORD_6 )?
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==KEYWORD_4) ) {
                alt26=1;
            }
            else if ( (LA26_0==KEYWORD_6) ) {
                alt26=2;
            }
            switch (alt26) {
                case 1 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1985:2: kw= KEYWORD_4
                    {
                    kw=(Token)match(input,KEYWORD_4,FollowSets000.FOLLOW_KEYWORD_4_in_ruleSignedReal4501); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignedRealAccess().getPlusSignKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:1992:2: kw= KEYWORD_6
                    {
                    kw=(Token)match(input,KEYWORD_6,FollowSets000.FOLLOW_KEYWORD_6_in_ruleSignedReal4520); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignedRealAccess().getHyphenMinusKeyword_0_1()); 
                        

                    }
                    break;

            }

            this_REAL_LIT_2=(Token)match(input,RULE_REAL_LIT,FollowSets000.FOLLOW_RULE_REAL_LIT_in_ruleSignedReal4537); 

            		current.merge(this_REAL_LIT_2);
                
             
                newLeafNode(this_REAL_LIT_2, grammarAccess.getSignedRealAccess().getREAL_LITTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleSignedReal"


    // $ANTLR start "entryRuleNumericRangeTerm"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2012:1: entryRuleNumericRangeTerm returns [EObject current=null] : iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF ;
    public final EObject entryRuleNumericRangeTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericRangeTerm = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2013:2: (iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2014:2: iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF
            {
             newCompositeNode(grammarAccess.getNumericRangeTermRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumericRangeTerm_in_entryRuleNumericRangeTerm4581);
            iv_ruleNumericRangeTerm=ruleNumericRangeTerm();

            state._fsp--;

             current =iv_ruleNumericRangeTerm; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumericRangeTerm4591); 

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
    // $ANTLR end "entryRuleNumericRangeTerm"


    // $ANTLR start "ruleNumericRangeTerm"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2021:1: ruleNumericRangeTerm returns [EObject current=null] : ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= KEYWORD_14 ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= KEYWORD_24 ( (lv_delta_4_0= ruleNumAlt ) ) )? ) ;
    public final EObject ruleNumericRangeTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_minimum_0_0 = null;

        EObject lv_maximum_2_0 = null;

        EObject lv_delta_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2024:28: ( ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= KEYWORD_14 ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= KEYWORD_24 ( (lv_delta_4_0= ruleNumAlt ) ) )? ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2025:1: ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= KEYWORD_14 ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= KEYWORD_24 ( (lv_delta_4_0= ruleNumAlt ) ) )? )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2025:1: ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= KEYWORD_14 ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= KEYWORD_24 ( (lv_delta_4_0= ruleNumAlt ) ) )? )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2025:2: ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= KEYWORD_14 ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= KEYWORD_24 ( (lv_delta_4_0= ruleNumAlt ) ) )?
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2025:2: ( (lv_minimum_0_0= ruleNumAlt ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2026:1: (lv_minimum_0_0= ruleNumAlt )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2026:1: (lv_minimum_0_0= ruleNumAlt )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2027:3: lv_minimum_0_0= ruleNumAlt
            {
             
            	        newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMinimumNumAltParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleNumAlt_in_ruleNumericRangeTerm4637);
            lv_minimum_0_0=ruleNumAlt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
            	        }
                   		set(
                   			current, 
                   			"minimum",
                    		lv_minimum_0_0, 
                    		"NumAlt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,KEYWORD_14,FollowSets000.FOLLOW_KEYWORD_14_in_ruleNumericRangeTerm4650); 

                	newLeafNode(otherlv_1, grammarAccess.getNumericRangeTermAccess().getFullStopFullStopKeyword_1());
                
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2048:1: ( (lv_maximum_2_0= ruleNumAlt ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2049:1: (lv_maximum_2_0= ruleNumAlt )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2049:1: (lv_maximum_2_0= ruleNumAlt )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2050:3: lv_maximum_2_0= ruleNumAlt
            {
             
            	        newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMaximumNumAltParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleNumAlt_in_ruleNumericRangeTerm4670);
            lv_maximum_2_0=ruleNumAlt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
            	        }
                   		set(
                   			current, 
                   			"maximum",
                    		lv_maximum_2_0, 
                    		"NumAlt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2066:2: (otherlv_3= KEYWORD_24 ( (lv_delta_4_0= ruleNumAlt ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==KEYWORD_24) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2067:2: otherlv_3= KEYWORD_24 ( (lv_delta_4_0= ruleNumAlt ) )
                    {
                    otherlv_3=(Token)match(input,KEYWORD_24,FollowSets000.FOLLOW_KEYWORD_24_in_ruleNumericRangeTerm4684); 

                        	newLeafNode(otherlv_3, grammarAccess.getNumericRangeTermAccess().getDeltaKeyword_3_0());
                        
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2071:1: ( (lv_delta_4_0= ruleNumAlt ) )
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2072:1: (lv_delta_4_0= ruleNumAlt )
                    {
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2072:1: (lv_delta_4_0= ruleNumAlt )
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2073:3: lv_delta_4_0= ruleNumAlt
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumericRangeTermAccess().getDeltaNumAltParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNumAlt_in_ruleNumericRangeTerm4704);
                    lv_delta_4_0=ruleNumAlt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
                    	        }
                           		set(
                           			current, 
                           			"delta",
                            		lv_delta_4_0, 
                            		"NumAlt");
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
    // $ANTLR end "ruleNumericRangeTerm"


    // $ANTLR start "entryRuleNumAlt"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2097:1: entryRuleNumAlt returns [EObject current=null] : iv_ruleNumAlt= ruleNumAlt EOF ;
    public final EObject entryRuleNumAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumAlt = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2098:2: (iv_ruleNumAlt= ruleNumAlt EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2099:2: iv_ruleNumAlt= ruleNumAlt EOF
            {
             newCompositeNode(grammarAccess.getNumAltRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumAlt_in_entryRuleNumAlt4741);
            iv_ruleNumAlt=ruleNumAlt();

            state._fsp--;

             current =iv_ruleNumAlt; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumAlt4751); 

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
    // $ANTLR end "entryRuleNumAlt"


    // $ANTLR start "ruleNumAlt"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2106:1: ruleNumAlt returns [EObject current=null] : (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue ) ;
    public final EObject ruleNumAlt() throws RecognitionException {
        EObject current = null;

        EObject this_RealTerm_0 = null;

        EObject this_IntegerTerm_1 = null;

        EObject this_SignedConstant_2 = null;

        EObject this_ConstantValue_3 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2109:28: ( (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2110:1: (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2110:1: (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue )
            int alt28=4;
            switch ( input.LA(1) ) {
            case KEYWORD_4:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    alt28=3;
                    }
                    break;
                case RULE_INTEGER_LIT:
                    {
                    alt28=2;
                    }
                    break;
                case RULE_REAL_LIT:
                    {
                    alt28=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }

                }
                break;
            case KEYWORD_6:
                {
                switch ( input.LA(2) ) {
                case RULE_REAL_LIT:
                    {
                    alt28=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt28=3;
                    }
                    break;
                case RULE_INTEGER_LIT:
                    {
                    alt28=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_REAL_LIT:
                {
                alt28=1;
                }
                break;
            case RULE_INTEGER_LIT:
                {
                alt28=2;
                }
                break;
            case RULE_ID:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2111:5: this_RealTerm_0= ruleRealTerm
                    {
                     
                            newCompositeNode(grammarAccess.getNumAltAccess().getRealTermParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRealTerm_in_ruleNumAlt4798);
                    this_RealTerm_0=ruleRealTerm();

                    state._fsp--;


                            current = this_RealTerm_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2121:5: this_IntegerTerm_1= ruleIntegerTerm
                    {
                     
                            newCompositeNode(grammarAccess.getNumAltAccess().getIntegerTermParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerTerm_in_ruleNumAlt4825);
                    this_IntegerTerm_1=ruleIntegerTerm();

                    state._fsp--;


                            current = this_IntegerTerm_1;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2131:5: this_SignedConstant_2= ruleSignedConstant
                    {
                     
                            newCompositeNode(grammarAccess.getNumAltAccess().getSignedConstantParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSignedConstant_in_ruleNumAlt4852);
                    this_SignedConstant_2=ruleSignedConstant();

                    state._fsp--;


                            current = this_SignedConstant_2;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2141:5: this_ConstantValue_3= ruleConstantValue
                    {
                     
                            newCompositeNode(grammarAccess.getNumAltAccess().getConstantValueParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConstantValue_in_ruleNumAlt4879);
                    this_ConstantValue_3=ruleConstantValue();

                    state._fsp--;


                            current = this_ConstantValue_3;
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
    // $ANTLR end "ruleNumAlt"


    // $ANTLR start "entryRuleINTVALUE"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2157:1: entryRuleINTVALUE returns [String current=null] : iv_ruleINTVALUE= ruleINTVALUE EOF ;
    public final String entryRuleINTVALUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTVALUE = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2158:1: (iv_ruleINTVALUE= ruleINTVALUE EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2159:2: iv_ruleINTVALUE= ruleINTVALUE EOF
            {
             newCompositeNode(grammarAccess.getINTVALUERule()); 
            pushFollow(FollowSets000.FOLLOW_ruleINTVALUE_in_entryRuleINTVALUE4914);
            iv_ruleINTVALUE=ruleINTVALUE();

            state._fsp--;

             current =iv_ruleINTVALUE.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleINTVALUE4925); 

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
    // $ANTLR end "entryRuleINTVALUE"


    // $ANTLR start "ruleINTVALUE"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2166:1: ruleINTVALUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INTEGER_LIT_0= RULE_INTEGER_LIT ;
    public final AntlrDatatypeRuleToken ruleINTVALUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTEGER_LIT_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2170:6: (this_INTEGER_LIT_0= RULE_INTEGER_LIT )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2171:5: this_INTEGER_LIT_0= RULE_INTEGER_LIT
            {
            this_INTEGER_LIT_0=(Token)match(input,RULE_INTEGER_LIT,FollowSets000.FOLLOW_RULE_INTEGER_LIT_in_ruleINTVALUE4964); 

            		current.merge(this_INTEGER_LIT_0);
                
             
                newLeafNode(this_INTEGER_LIT_0, grammarAccess.getINTVALUEAccess().getINTEGER_LITTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleINTVALUE"


    // $ANTLR start "entryRuleQPREF"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2188:1: entryRuleQPREF returns [String current=null] : iv_ruleQPREF= ruleQPREF EOF ;
    public final String entryRuleQPREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQPREF = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2189:1: (iv_ruleQPREF= ruleQPREF EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2190:2: iv_ruleQPREF= ruleQPREF EOF
            {
             newCompositeNode(grammarAccess.getQPREFRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQPREF_in_entryRuleQPREF5010);
            iv_ruleQPREF=ruleQPREF();

            state._fsp--;

             current =iv_ruleQPREF.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQPREF5021); 

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
    // $ANTLR end "entryRuleQPREF"


    // $ANTLR start "ruleQPREF"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2197:1: ruleQPREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= KEYWORD_15 this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQPREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2201:6: ( (this_ID_0= RULE_ID (kw= KEYWORD_15 this_ID_2= RULE_ID )? ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2202:1: (this_ID_0= RULE_ID (kw= KEYWORD_15 this_ID_2= RULE_ID )? )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2202:1: (this_ID_0= RULE_ID (kw= KEYWORD_15 this_ID_2= RULE_ID )? )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2202:6: this_ID_0= RULE_ID (kw= KEYWORD_15 this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQPREF5061); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2209:1: (kw= KEYWORD_15 this_ID_2= RULE_ID )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==KEYWORD_15) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2210:2: kw= KEYWORD_15 this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,KEYWORD_15,FollowSets000.FOLLOW_KEYWORD_15_in_ruleQPREF5080); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQPREFAccess().getColonColonKeyword_1_0()); 
                        
                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQPREF5095); 

                    		current.merge(this_ID_2);
                        
                     
                        newLeafNode(this_ID_2, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_1_1()); 
                        

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
    // $ANTLR end "ruleQPREF"


    // $ANTLR start "entryRuleQCREF"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2230:1: entryRuleQCREF returns [String current=null] : iv_ruleQCREF= ruleQCREF EOF ;
    public final String entryRuleQCREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQCREF = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2231:1: (iv_ruleQCREF= ruleQCREF EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2232:2: iv_ruleQCREF= ruleQCREF EOF
            {
             newCompositeNode(grammarAccess.getQCREFRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQCREF_in_entryRuleQCREF5142);
            iv_ruleQCREF=ruleQCREF();

            state._fsp--;

             current =iv_ruleQCREF.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQCREF5153); 

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
    // $ANTLR end "entryRuleQCREF"


    // $ANTLR start "ruleQCREF"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2239:1: ruleQCREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= KEYWORD_15 )* this_ID_2= RULE_ID (kw= KEYWORD_7 this_ID_4= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQCREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2243:6: ( ( (this_ID_0= RULE_ID kw= KEYWORD_15 )* this_ID_2= RULE_ID (kw= KEYWORD_7 this_ID_4= RULE_ID )? ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2244:1: ( (this_ID_0= RULE_ID kw= KEYWORD_15 )* this_ID_2= RULE_ID (kw= KEYWORD_7 this_ID_4= RULE_ID )? )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2244:1: ( (this_ID_0= RULE_ID kw= KEYWORD_15 )* this_ID_2= RULE_ID (kw= KEYWORD_7 this_ID_4= RULE_ID )? )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2244:2: (this_ID_0= RULE_ID kw= KEYWORD_15 )* this_ID_2= RULE_ID (kw= KEYWORD_7 this_ID_4= RULE_ID )?
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2244:2: (this_ID_0= RULE_ID kw= KEYWORD_15 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1==KEYWORD_15) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2244:7: this_ID_0= RULE_ID kw= KEYWORD_15
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQCREF5194); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_0_0()); 
            	        
            	    kw=(Token)match(input,KEYWORD_15,FollowSets000.FOLLOW_KEYWORD_15_in_ruleQCREF5212); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQCREFAccess().getColonColonKeyword_0_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQCREF5229); 

            		current.merge(this_ID_2);
                
             
                newLeafNode(this_ID_2, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_1()); 
                
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2264:1: (kw= KEYWORD_7 this_ID_4= RULE_ID )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==KEYWORD_7) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2265:2: kw= KEYWORD_7 this_ID_4= RULE_ID
                    {
                    kw=(Token)match(input,KEYWORD_7,FollowSets000.FOLLOW_KEYWORD_7_in_ruleQCREF5248); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQCREFAccess().getFullStopKeyword_2_0()); 
                        
                    this_ID_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQCREF5263); 

                    		current.merge(this_ID_4);
                        
                     
                        newLeafNode(this_ID_4, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_2_1()); 
                        

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
    // $ANTLR end "ruleQCREF"


    // $ANTLR start "entryRuleSTAR"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2285:1: entryRuleSTAR returns [String current=null] : iv_ruleSTAR= ruleSTAR EOF ;
    public final String entryRuleSTAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTAR = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2286:1: (iv_ruleSTAR= ruleSTAR EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2287:2: iv_ruleSTAR= ruleSTAR EOF
            {
             newCompositeNode(grammarAccess.getSTARRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSTAR_in_entryRuleSTAR5310);
            iv_ruleSTAR=ruleSTAR();

            state._fsp--;

             current =iv_ruleSTAR.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSTAR5321); 

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
    // $ANTLR end "entryRuleSTAR"


    // $ANTLR start "ruleSTAR"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2294:1: ruleSTAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_3 ;
    public final AntlrDatatypeRuleToken ruleSTAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2298:6: (kw= KEYWORD_3 )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:2300:2: kw= KEYWORD_3
            {
            kw=(Token)match(input,KEYWORD_3,FollowSets000.FOLLOW_KEYWORD_3_in_ruleSTAR5358); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSTARAccess().getAsteriskKeyword()); 
                

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
    // $ANTLR end "ruleSTAR"

    // Delegated rules


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\25\uffff";
    static final String DFA14_eofS =
        "\10\uffff\1\17\1\21\1\23\3\uffff\1\17\1\uffff\1\21\3\uffff\1\23";
    static final String DFA14_minS =
        "\1\4\5\uffff\2\50\3\10\3\uffff\1\10\1\uffff\1\10\1\uffff\1\50\1"+
        "\uffff\1\10";
    static final String DFA14_maxS =
        "\1\61\5\uffff\2\57\2\50\1\42\3\uffff\1\42\1\uffff\1\42\1\uffff"+
        "\1\50\1\uffff\1\42";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\5\uffff\1\11\1\12\1\6\1\uffff\1\7"+
        "\1\uffff\1\10\1\uffff\1\13\1\uffff";
    static final String DFA14_specialS =
        "\25\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\3\1\2\4\uffff\1\4\3\uffff\1\14\1\uffff\1\14\11\uffff\1\13"+
            "\2\uffff\1\6\1\uffff\1\7\3\uffff\1\1\4\uffff\1\12\4\uffff\1"+
            "\10\1\uffff\1\11\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "\1\15\4\uffff\1\10\1\uffff\1\11",
            "\1\15\4\uffff\1\10\1\uffff\1\11",
            "\1\17\14\uffff\1\15\2\uffff\1\17\2\uffff\1\17\2\uffff\1\17"+
            "\3\uffff\1\17\5\uffff\1\16",
            "\1\21\14\uffff\1\15\2\uffff\1\21\2\uffff\1\21\2\uffff\1\21"+
            "\3\uffff\1\21\5\uffff\1\20",
            "\1\23\14\uffff\1\15\1\22\1\uffff\1\23\2\uffff\1\23\2\uffff"+
            "\1\23\3\uffff\1\23",
            "",
            "",
            "",
            "\1\17\14\uffff\1\15\2\uffff\1\17\2\uffff\1\17\2\uffff\1\17"+
            "\3\uffff\1\17",
            "",
            "\1\21\14\uffff\1\15\2\uffff\1\21\2\uffff\1\21\2\uffff\1\21"+
            "\3\uffff\1\21",
            "",
            "\1\24",
            "",
            "\1\23\14\uffff\1\15\2\uffff\1\23\2\uffff\1\23\2\uffff\1\23"+
            "\3\uffff\1\23"
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "921:1: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleFGMGrammarRoot_in_entryRuleFGMGrammarRoot67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFGMGrammarRoot77 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_31_in_ruleFGMGrammarRoot116 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_ruleFGMLibrary_in_ruleFGMGrammarRoot136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFGMSubclause_in_ruleFGMGrammarRoot164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFGMLibrary_in_entryRuleFGMLibrary199 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFGMLibrary209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeatureMappingset_in_ruleFGMLibrary254 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_ruleFeatureMappingset_in_entryRuleFeatureMappingset289 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeatureMappingset299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureMappingset341 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_KEYWORD_8_in_ruleFeatureMappingset359 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_KEYWORD_33_in_ruleFeatureMappingset371 = new BitSet(new long[]{0x0000010000000800L});
        public static final BitSet FOLLOW_KEYWORD_30_in_ruleFeatureMappingset384 = new BitSet(new long[]{0x0000010000000800L});
        public static final BitSet FOLLOW_ruleQFGTMREF_in_ruleFeatureMappingset406 = new BitSet(new long[]{0x0000010000000800L});
        public static final BitSet FOLLOW_ruleFeatureMapping_in_ruleFeatureMappingset429 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_KEYWORD_21_in_ruleFeatureMappingset442 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_KEYWORD_33_in_ruleFeatureMappingset454 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_KEYWORD_9_in_ruleFeatureMappingset466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFGMSubclause_in_entryRuleFGMSubclause500 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFGMSubclause510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_22_in_ruleFGMSubclause548 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_KEYWORD_33_in_ruleFGMSubclause560 = new BitSet(new long[]{0x0000010000000800L});
        public static final BitSet FOLLOW_ruleQFGTMREF_in_ruleFGMSubclause582 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_KEYWORD_9_in_ruleFGMSubclause595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeatureMapping_in_entryRuleFeatureMapping637 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeatureMapping647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeaturePath_in_ruleFeatureMapping693 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_KEYWORD_20_in_ruleFeatureMapping706 = new BitSet(new long[]{0x0000010000000800L});
        public static final BitSet FOLLOW_ruleFeaturePath_in_ruleFeatureMapping726 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_KEYWORD_9_in_ruleFeatureMapping739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeaturePath_in_entryRuleFeaturePath773 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeaturePath783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQFGTMREF_in_ruleFeaturePath832 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_KEYWORD_7_in_ruleFeaturePath845 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_ruleFeatureReference_in_ruleFeaturePath866 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_ruleFeatureReference_in_entryRuleFeatureReference902 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeatureReference912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureReference956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQFGTMREF_in_entryRuleQFGTMREF991 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQFGTMREF1002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQFGTMREF1043 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_KEYWORD_15_in_ruleQFGTMREF1061 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQFGTMREF1078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContainedPropertyAssociation_in_entryRuleContainedPropertyAssociation1124 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContainedPropertyAssociation1134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQPREF_in_ruleContainedPropertyAssociation1182 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_KEYWORD_16_in_ruleContainedPropertyAssociation1196 = new BitSet(new long[]{0x0002A108A4014470L});
        public static final BitSet FOLLOW_KEYWORD_19_in_ruleContainedPropertyAssociation1220 = new BitSet(new long[]{0x0002A108A4014470L});
        public static final BitSet FOLLOW_KEYWORD_32_in_ruleContainedPropertyAssociation1251 = new BitSet(new long[]{0x0002A108A4014470L});
        public static final BitSet FOLLOW_ruleOptionalModalPropertyValue_in_ruleContainedPropertyAssociation1285 = new BitSet(new long[]{0x0000000441000100L});
        public static final BitSet FOLLOW_KEYWORD_5_in_ruleContainedPropertyAssociation1299 = new BitSet(new long[]{0x0002A108A4014470L});
        public static final BitSet FOLLOW_ruleOptionalModalPropertyValue_in_ruleContainedPropertyAssociation1319 = new BitSet(new long[]{0x0000000441000100L});
        public static final BitSet FOLLOW_KEYWORD_27_in_ruleContainedPropertyAssociation1336 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_KEYWORD_18_in_ruleContainedPropertyAssociation1348 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_ruleContainmentPath_in_ruleContainedPropertyAssociation1368 = new BitSet(new long[]{0x0000000441000000L});
        public static final BitSet FOLLOW_KEYWORD_5_in_ruleContainedPropertyAssociation1382 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_ruleContainmentPath_in_ruleContainedPropertyAssociation1402 = new BitSet(new long[]{0x0000000441000000L});
        public static final BitSet FOLLOW_KEYWORD_17_in_ruleContainedPropertyAssociation1420 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_KEYWORD_28_in_ruleContainedPropertyAssociation1432 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_KEYWORD_1_in_ruleContainedPropertyAssociation1444 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_ruleQCREF_in_ruleContainedPropertyAssociation1466 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_KEYWORD_2_in_ruleContainedPropertyAssociation1479 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_KEYWORD_9_in_ruleContainedPropertyAssociation1493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContainmentPath_in_entryRuleContainmentPath1531 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContainmentPath1541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContainmentPathElement_in_ruleContainmentPath1586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOptionalModalPropertyValue_in_entryRuleOptionalModalPropertyValue1622 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOptionalModalPropertyValue1632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyExpression_in_ruleOptionalModalPropertyValue1678 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_KEYWORD_17_in_ruleOptionalModalPropertyValue1692 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_KEYWORD_26_in_ruleOptionalModalPropertyValue1704 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_KEYWORD_1_in_ruleOptionalModalPropertyValue1716 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleOptionalModalPropertyValue1735 = new BitSet(new long[]{0x0000000048000000L});
        public static final BitSet FOLLOW_KEYWORD_5_in_ruleOptionalModalPropertyValue1749 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleOptionalModalPropertyValue1768 = new BitSet(new long[]{0x0000000048000000L});
        public static final BitSet FOLLOW_KEYWORD_2_in_ruleOptionalModalPropertyValue1783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyValue_in_entryRulePropertyValue1819 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePropertyValue1829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyExpression_in_rulePropertyValue1874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyExpression_in_entryRulePropertyExpression1908 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePropertyExpression1918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecordTerm_in_rulePropertyExpression1965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferenceTerm_in_rulePropertyExpression1992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComponentClassifierTerm_in_rulePropertyExpression2019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComputedTerm_in_rulePropertyExpression2046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringTerm_in_rulePropertyExpression2073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumericRangeTerm_in_rulePropertyExpression2100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRealTerm_in_rulePropertyExpression2127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerTerm_in_rulePropertyExpression2154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleListTerm_in_rulePropertyExpression2181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanLiteral_in_rulePropertyExpression2208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralorReferenceTerm_in_rulePropertyExpression2235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralorReferenceTerm_in_entryRuleLiteralorReferenceTerm2269 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralorReferenceTerm2279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQPREF_in_ruleLiteralorReferenceTerm2326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral2360 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral2370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_23_in_ruleBooleanLiteral2424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_25_in_ruleBooleanLiteral2454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantValue_in_entryRuleConstantValue2489 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantValue2499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQPREF_in_ruleConstantValue2546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferenceTerm_in_entryRuleReferenceTerm2580 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReferenceTerm2590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_34_in_ruleReferenceTerm2628 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_KEYWORD_1_in_ruleReferenceTerm2640 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_ruleContainmentPathElement_in_ruleReferenceTerm2660 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_KEYWORD_2_in_ruleReferenceTerm2673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecordTerm_in_entryRuleRecordTerm2707 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRecordTerm2717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_10_in_ruleRecordTerm2755 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_ruleFieldPropertyAssociation_in_ruleRecordTerm2775 = new BitSet(new long[]{0x0000011000000000L});
        public static final BitSet FOLLOW_KEYWORD_11_in_ruleRecordTerm2789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComputedTerm_in_entryRuleComputedTerm2825 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComputedTerm2835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_29_in_ruleComputedTerm2873 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_KEYWORD_1_in_ruleComputedTerm2885 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleComputedTerm2901 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_KEYWORD_2_in_ruleComputedTerm2919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComponentClassifierTerm_in_entryRuleComponentClassifierTerm2953 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComponentClassifierTerm2963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_35_in_ruleComponentClassifierTerm3001 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_KEYWORD_1_in_ruleComponentClassifierTerm3013 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_ruleQCREF_in_ruleComponentClassifierTerm3035 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_KEYWORD_2_in_ruleComponentClassifierTerm3048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleListTerm_in_entryRuleListTerm3082 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleListTerm3092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_1_in_ruleListTerm3139 = new BitSet(new long[]{0x0002A108AC014470L});
        public static final BitSet FOLLOW_rulePropertyExpression_in_ruleListTerm3160 = new BitSet(new long[]{0x0000000048000000L});
        public static final BitSet FOLLOW_KEYWORD_5_in_ruleListTerm3174 = new BitSet(new long[]{0x0002A108A4014470L});
        public static final BitSet FOLLOW_rulePropertyExpression_in_ruleListTerm3194 = new BitSet(new long[]{0x0000000048000000L});
        public static final BitSet FOLLOW_KEYWORD_2_in_ruleListTerm3211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFieldPropertyAssociation_in_entryRuleFieldPropertyAssociation3245 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFieldPropertyAssociation3255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFieldPropertyAssociation3300 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_KEYWORD_16_in_ruleFieldPropertyAssociation3313 = new BitSet(new long[]{0x0002A108A4014470L});
        public static final BitSet FOLLOW_rulePropertyExpression_in_ruleFieldPropertyAssociation3333 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_KEYWORD_9_in_ruleFieldPropertyAssociation3346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContainmentPathElement_in_entryRuleContainmentPathElement3380 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContainmentPathElement3390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleContainmentPathElement3436 = new BitSet(new long[]{0x0000000900000002L});
        public static final BitSet FOLLOW_ruleArrayRange_in_ruleContainmentPathElement3457 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_KEYWORD_7_in_ruleContainmentPathElement3473 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_ruleContainmentPathElement_in_ruleContainmentPathElement3493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePlusMinus_in_entryRulePlusMinus3533 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePlusMinus3544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_4_in_rulePlusMinus3582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_6_in_rulePlusMinus3601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringTerm_in_entryRuleStringTerm3640 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringTerm3650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoQuoteString_in_ruleStringTerm3695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoQuoteString_in_entryRuleNoQuoteString3730 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoQuoteString3741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleNoQuoteString3780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArrayRange_in_entryRuleArrayRange3823 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArrayRange3833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_10_in_ruleArrayRange3880 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_ruleINTVALUE_in_ruleArrayRange3900 = new BitSet(new long[]{0x0000001000200000L});
        public static final BitSet FOLLOW_KEYWORD_14_in_ruleArrayRange3914 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_ruleINTVALUE_in_ruleArrayRange3934 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_KEYWORD_11_in_ruleArrayRange3949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignedConstant_in_entryRuleSignedConstant3983 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSignedConstant3993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePlusMinus_in_ruleSignedConstant4039 = new BitSet(new long[]{0x0000A100A0000000L});
        public static final BitSet FOLLOW_ruleConstantValue_in_ruleSignedConstant4060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerTerm_in_entryRuleIntegerTerm4095 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerTerm4105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignedInt_in_ruleIntegerTerm4151 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleIntegerTerm4171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignedInt_in_entryRuleSignedInt4208 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSignedInt4219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_4_in_ruleSignedInt4258 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_KEYWORD_6_in_ruleSignedInt4277 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_RULE_INTEGER_LIT_in_ruleSignedInt4294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRealTerm_in_entryRuleRealTerm4338 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRealTerm4348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignedReal_in_ruleRealTerm4394 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRealTerm4414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignedReal_in_entryRuleSignedReal4451 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSignedReal4462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_4_in_ruleSignedReal4501 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_KEYWORD_6_in_ruleSignedReal4520 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_RULE_REAL_LIT_in_ruleSignedReal4537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumericRangeTerm_in_entryRuleNumericRangeTerm4581 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumericRangeTerm4591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumAlt_in_ruleNumericRangeTerm4637 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_KEYWORD_14_in_ruleNumericRangeTerm4650 = new BitSet(new long[]{0x0000A100A0000000L});
        public static final BitSet FOLLOW_ruleNumAlt_in_ruleNumericRangeTerm4670 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_KEYWORD_24_in_ruleNumericRangeTerm4684 = new BitSet(new long[]{0x0000A100A0000000L});
        public static final BitSet FOLLOW_ruleNumAlt_in_ruleNumericRangeTerm4704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumAlt_in_entryRuleNumAlt4741 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumAlt4751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRealTerm_in_ruleNumAlt4798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerTerm_in_ruleNumAlt4825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignedConstant_in_ruleNumAlt4852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantValue_in_ruleNumAlt4879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleINTVALUE_in_entryRuleINTVALUE4914 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleINTVALUE4925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INTEGER_LIT_in_ruleINTVALUE4964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQPREF_in_entryRuleQPREF5010 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQPREF5021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQPREF5061 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_KEYWORD_15_in_ruleQPREF5080 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQPREF5095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQCREF_in_entryRuleQCREF5142 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQCREF5153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQCREF5194 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_KEYWORD_15_in_ruleQCREF5212 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQCREF5229 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_KEYWORD_7_in_ruleQCREF5248 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQCREF5263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSTAR_in_entryRuleSTAR5310 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSTAR5321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_3_in_ruleSTAR5358 = new BitSet(new long[]{0x0000000000000002L});
    }


}