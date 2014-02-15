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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_10", "KEYWORD_8", "KEYWORD_9", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_4", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "RULE_SL_COMMENT", "RULE_ID", "RULE_WS"
    };
    public static final int RULE_ID=15;
    public static final int KEYWORD_6=8;
    public static final int KEYWORD_7=9;
    public static final int KEYWORD_8=5;
    public static final int KEYWORD_9=6;
    public static final int KEYWORD_1=11;
    public static final int KEYWORD_5=7;
    public static final int KEYWORD_4=10;
    public static final int KEYWORD_3=13;
    public static final int KEYWORD_2=12;
    public static final int RULE_WS=16;
    public static final int RULE_SL_COMMENT=14;
    public static final int EOF=-1;
    public static final int KEYWORD_10=4;

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
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:70:1: ruleFGMGrammarRoot returns [EObject current=null] : ( (otherlv_0= KEYWORD_9 ( (lv_fgml_1_0= ruleFGMLibrary ) ) ) | ( (lv_fgmsc_2_0= ruleFGMSubclause ) ) ) ;
    public final EObject ruleFGMGrammarRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_fgml_1_0 = null;

        EObject lv_fgmsc_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:73:28: ( ( (otherlv_0= KEYWORD_9 ( (lv_fgml_1_0= ruleFGMLibrary ) ) ) | ( (lv_fgmsc_2_0= ruleFGMSubclause ) ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:74:1: ( (otherlv_0= KEYWORD_9 ( (lv_fgml_1_0= ruleFGMLibrary ) ) ) | ( (lv_fgmsc_2_0= ruleFGMSubclause ) ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:74:1: ( (otherlv_0= KEYWORD_9 ( (lv_fgml_1_0= ruleFGMLibrary ) ) ) | ( (lv_fgmsc_2_0= ruleFGMSubclause ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==KEYWORD_9) ) {
                alt1=1;
            }
            else if ( (LA1_0==KEYWORD_7) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:74:2: (otherlv_0= KEYWORD_9 ( (lv_fgml_1_0= ruleFGMLibrary ) ) )
                    {
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:74:2: (otherlv_0= KEYWORD_9 ( (lv_fgml_1_0= ruleFGMLibrary ) ) )
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:75:2: otherlv_0= KEYWORD_9 ( (lv_fgml_1_0= ruleFGMLibrary ) )
                    {
                    otherlv_0=(Token)match(input,KEYWORD_9,FollowSets000.FOLLOW_KEYWORD_9_in_ruleFGMGrammarRoot116); 

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
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:172:1: ruleFeatureMappingset returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= KEYWORD_2 otherlv_2= KEYWORD_10 (otherlv_3= KEYWORD_8 ( ( ruleQFGTMREF ) ) )? ( (lv_mapping_5_0= ruleFeatureMapping ) ) otherlv_6= KEYWORD_6 otherlv_7= KEYWORD_10 otherlv_8= KEYWORD_3 ) ;
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
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:175:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= KEYWORD_2 otherlv_2= KEYWORD_10 (otherlv_3= KEYWORD_8 ( ( ruleQFGTMREF ) ) )? ( (lv_mapping_5_0= ruleFeatureMapping ) ) otherlv_6= KEYWORD_6 otherlv_7= KEYWORD_10 otherlv_8= KEYWORD_3 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:176:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= KEYWORD_2 otherlv_2= KEYWORD_10 (otherlv_3= KEYWORD_8 ( ( ruleQFGTMREF ) ) )? ( (lv_mapping_5_0= ruleFeatureMapping ) ) otherlv_6= KEYWORD_6 otherlv_7= KEYWORD_10 otherlv_8= KEYWORD_3 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:176:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= KEYWORD_2 otherlv_2= KEYWORD_10 (otherlv_3= KEYWORD_8 ( ( ruleQFGTMREF ) ) )? ( (lv_mapping_5_0= ruleFeatureMapping ) ) otherlv_6= KEYWORD_6 otherlv_7= KEYWORD_10 otherlv_8= KEYWORD_3 )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:176:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= KEYWORD_2 otherlv_2= KEYWORD_10 (otherlv_3= KEYWORD_8 ( ( ruleQFGTMREF ) ) )? ( (lv_mapping_5_0= ruleFeatureMapping ) ) otherlv_6= KEYWORD_6 otherlv_7= KEYWORD_10 otherlv_8= KEYWORD_3
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

            otherlv_1=(Token)match(input,KEYWORD_2,FollowSets000.FOLLOW_KEYWORD_2_in_ruleFeatureMappingset359); 

                	newLeafNode(otherlv_1, grammarAccess.getFeatureMappingsetAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,KEYWORD_10,FollowSets000.FOLLOW_KEYWORD_10_in_ruleFeatureMappingset371); 

                	newLeafNode(otherlv_2, grammarAccess.getFeatureMappingsetAccess().getMappingsKeyword_2());
                
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:204:1: (otherlv_3= KEYWORD_8 ( ( ruleQFGTMREF ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==KEYWORD_8) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:205:2: otherlv_3= KEYWORD_8 ( ( ruleQFGTMREF ) )
                    {
                    otherlv_3=(Token)match(input,KEYWORD_8,FollowSets000.FOLLOW_KEYWORD_8_in_ruleFeatureMappingset384); 

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

            otherlv_6=(Token)match(input,KEYWORD_6,FollowSets000.FOLLOW_KEYWORD_6_in_ruleFeatureMappingset442); 

                	newLeafNode(otherlv_6, grammarAccess.getFeatureMappingsetAccess().getEndKeyword_5());
                
            otherlv_7=(Token)match(input,KEYWORD_10,FollowSets000.FOLLOW_KEYWORD_10_in_ruleFeatureMappingset454); 

                	newLeafNode(otherlv_7, grammarAccess.getFeatureMappingsetAccess().getMappingsKeyword_6());
                
            otherlv_8=(Token)match(input,KEYWORD_3,FollowSets000.FOLLOW_KEYWORD_3_in_ruleFeatureMappingset466); 

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
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:274:1: ruleFGMSubclause returns [EObject current=null] : (otherlv_0= KEYWORD_7 otherlv_1= KEYWORD_10 ( ( ruleQFGTMREF ) ) otherlv_3= KEYWORD_3 ) ;
    public final EObject ruleFGMSubclause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:277:28: ( (otherlv_0= KEYWORD_7 otherlv_1= KEYWORD_10 ( ( ruleQFGTMREF ) ) otherlv_3= KEYWORD_3 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:278:1: (otherlv_0= KEYWORD_7 otherlv_1= KEYWORD_10 ( ( ruleQFGTMREF ) ) otherlv_3= KEYWORD_3 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:278:1: (otherlv_0= KEYWORD_7 otherlv_1= KEYWORD_10 ( ( ruleQFGTMREF ) ) otherlv_3= KEYWORD_3 )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:279:2: otherlv_0= KEYWORD_7 otherlv_1= KEYWORD_10 ( ( ruleQFGTMREF ) ) otherlv_3= KEYWORD_3
            {
            otherlv_0=(Token)match(input,KEYWORD_7,FollowSets000.FOLLOW_KEYWORD_7_in_ruleFGMSubclause548); 

                	newLeafNode(otherlv_0, grammarAccess.getFGMSubclauseAccess().getUseKeyword_0());
                
            otherlv_1=(Token)match(input,KEYWORD_10,FollowSets000.FOLLOW_KEYWORD_10_in_ruleFGMSubclause560); 

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

            otherlv_3=(Token)match(input,KEYWORD_3,FollowSets000.FOLLOW_KEYWORD_3_in_ruleFGMSubclause595); 

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
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:333:1: ruleFeatureMapping returns [EObject current=null] : ( ( (lv_left_0_0= ruleFeaturePath ) ) otherlv_1= KEYWORD_5 ( (lv_right_2_0= ruleFeaturePath ) ) otherlv_3= KEYWORD_3 ) ;
    public final EObject ruleFeatureMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:336:28: ( ( ( (lv_left_0_0= ruleFeaturePath ) ) otherlv_1= KEYWORD_5 ( (lv_right_2_0= ruleFeaturePath ) ) otherlv_3= KEYWORD_3 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:337:1: ( ( (lv_left_0_0= ruleFeaturePath ) ) otherlv_1= KEYWORD_5 ( (lv_right_2_0= ruleFeaturePath ) ) otherlv_3= KEYWORD_3 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:337:1: ( ( (lv_left_0_0= ruleFeaturePath ) ) otherlv_1= KEYWORD_5 ( (lv_right_2_0= ruleFeaturePath ) ) otherlv_3= KEYWORD_3 )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:337:2: ( (lv_left_0_0= ruleFeaturePath ) ) otherlv_1= KEYWORD_5 ( (lv_right_2_0= ruleFeaturePath ) ) otherlv_3= KEYWORD_3
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

            otherlv_1=(Token)match(input,KEYWORD_5,FollowSets000.FOLLOW_KEYWORD_5_in_ruleFeatureMapping706); 

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

            otherlv_3=(Token)match(input,KEYWORD_3,FollowSets000.FOLLOW_KEYWORD_3_in_ruleFeatureMapping739); 

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
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:400:1: ruleFeaturePath returns [EObject current=null] : ( ( ( ( ruleQFGTMREF ) ) otherlv_1= KEYWORD_1 ) ( (lv_featureReference_2_0= ruleFeatureReference ) )+ ) ;
    public final EObject ruleFeaturePath() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_featureReference_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:403:28: ( ( ( ( ( ruleQFGTMREF ) ) otherlv_1= KEYWORD_1 ) ( (lv_featureReference_2_0= ruleFeatureReference ) )+ ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:404:1: ( ( ( ( ruleQFGTMREF ) ) otherlv_1= KEYWORD_1 ) ( (lv_featureReference_2_0= ruleFeatureReference ) )+ )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:404:1: ( ( ( ( ruleQFGTMREF ) ) otherlv_1= KEYWORD_1 ) ( (lv_featureReference_2_0= ruleFeatureReference ) )+ )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:404:2: ( ( ( ruleQFGTMREF ) ) otherlv_1= KEYWORD_1 ) ( (lv_featureReference_2_0= ruleFeatureReference ) )+
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:404:2: ( ( ( ruleQFGTMREF ) ) otherlv_1= KEYWORD_1 )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:404:3: ( ( ruleQFGTMREF ) ) otherlv_1= KEYWORD_1
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

            otherlv_1=(Token)match(input,KEYWORD_1,FollowSets000.FOLLOW_KEYWORD_1_in_ruleFeaturePath845); 

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
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:493:1: ruleQFGTMREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= KEYWORD_4 )* this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQFGTMREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:497:6: ( ( (this_ID_0= RULE_ID kw= KEYWORD_4 )* this_ID_2= RULE_ID ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:498:1: ( (this_ID_0= RULE_ID kw= KEYWORD_4 )* this_ID_2= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:498:1: ( (this_ID_0= RULE_ID kw= KEYWORD_4 )* this_ID_2= RULE_ID )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:498:2: (this_ID_0= RULE_ID kw= KEYWORD_4 )* this_ID_2= RULE_ID
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:498:2: (this_ID_0= RULE_ID kw= KEYWORD_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==KEYWORD_4) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:498:7: this_ID_0= RULE_ID kw= KEYWORD_4
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQFGTMREF1043); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getQFGTMREFAccess().getIDTerminalRuleCall_0_0()); 
            	        
            	    kw=(Token)match(input,KEYWORD_4,FollowSets000.FOLLOW_KEYWORD_4_in_ruleQFGTMREF1061); 

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

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleFGMGrammarRoot_in_entryRuleFGMGrammarRoot67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFGMGrammarRoot77 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_9_in_ruleFGMGrammarRoot116 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleFGMLibrary_in_ruleFGMGrammarRoot136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFGMSubclause_in_ruleFGMGrammarRoot164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFGMLibrary_in_entryRuleFGMLibrary199 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFGMLibrary209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeatureMappingset_in_ruleFGMLibrary254 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_ruleFeatureMappingset_in_entryRuleFeatureMappingset289 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeatureMappingset299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureMappingset341 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_KEYWORD_2_in_ruleFeatureMappingset359 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_KEYWORD_10_in_ruleFeatureMappingset371 = new BitSet(new long[]{0x0000000000008020L});
        public static final BitSet FOLLOW_KEYWORD_8_in_ruleFeatureMappingset384 = new BitSet(new long[]{0x0000000000008020L});
        public static final BitSet FOLLOW_ruleQFGTMREF_in_ruleFeatureMappingset406 = new BitSet(new long[]{0x0000000000008020L});
        public static final BitSet FOLLOW_ruleFeatureMapping_in_ruleFeatureMappingset429 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_KEYWORD_6_in_ruleFeatureMappingset442 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_KEYWORD_10_in_ruleFeatureMappingset454 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_KEYWORD_3_in_ruleFeatureMappingset466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFGMSubclause_in_entryRuleFGMSubclause500 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFGMSubclause510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_7_in_ruleFGMSubclause548 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_KEYWORD_10_in_ruleFGMSubclause560 = new BitSet(new long[]{0x0000000000008020L});
        public static final BitSet FOLLOW_ruleQFGTMREF_in_ruleFGMSubclause582 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_KEYWORD_3_in_ruleFGMSubclause595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeatureMapping_in_entryRuleFeatureMapping637 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeatureMapping647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeaturePath_in_ruleFeatureMapping693 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_KEYWORD_5_in_ruleFeatureMapping706 = new BitSet(new long[]{0x0000000000008020L});
        public static final BitSet FOLLOW_ruleFeaturePath_in_ruleFeatureMapping726 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_KEYWORD_3_in_ruleFeatureMapping739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeaturePath_in_entryRuleFeaturePath773 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeaturePath783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQFGTMREF_in_ruleFeaturePath832 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_KEYWORD_1_in_ruleFeaturePath845 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleFeatureReference_in_ruleFeaturePath866 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_ruleFeatureReference_in_entryRuleFeatureReference902 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeatureReference912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureReference956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQFGTMREF_in_entryRuleQFGTMREF991 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQFGTMREF1002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQFGTMREF1043 = new BitSet(new long[]{0x0000000000000400L});
        public static final BitSet FOLLOW_KEYWORD_4_in_ruleQFGTMREF1061 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQFGTMREF1078 = new BitSet(new long[]{0x0000000000000002L});
    }


}