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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_9", "KEYWORD_7", "KEYWORD_8", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_3", "KEYWORD_1", "KEYWORD_2", "RULE_SL_COMMENT", "RULE_ID", "RULE_WS"
    };
    public static final int RULE_ID=14;
    public static final int KEYWORD_6=9;
    public static final int KEYWORD_7=5;
    public static final int KEYWORD_8=6;
    public static final int KEYWORD_9=4;
    public static final int KEYWORD_1=11;
    public static final int KEYWORD_5=8;
    public static final int KEYWORD_4=7;
    public static final int KEYWORD_3=10;
    public static final int KEYWORD_2=12;
    public static final int RULE_WS=15;
    public static final int RULE_SL_COMMENT=13;
    public static final int EOF=-1;

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
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:70:1: ruleFGMGrammarRoot returns [EObject current=null] : ( (otherlv_0= KEYWORD_8 ( (lv_fgml_1_0= ruleFGMLibrary ) ) ) | ( (lv_fgmsc_2_0= ruleFGMSubclause ) ) ) ;
    public final EObject ruleFGMGrammarRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_fgml_1_0 = null;

        EObject lv_fgmsc_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:73:28: ( ( (otherlv_0= KEYWORD_8 ( (lv_fgml_1_0= ruleFGMLibrary ) ) ) | ( (lv_fgmsc_2_0= ruleFGMSubclause ) ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:74:1: ( (otherlv_0= KEYWORD_8 ( (lv_fgml_1_0= ruleFGMLibrary ) ) ) | ( (lv_fgmsc_2_0= ruleFGMSubclause ) ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:74:1: ( (otherlv_0= KEYWORD_8 ( (lv_fgml_1_0= ruleFGMLibrary ) ) ) | ( (lv_fgmsc_2_0= ruleFGMSubclause ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==KEYWORD_8) ) {
                alt1=1;
            }
            else if ( (LA1_0==KEYWORD_6) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:74:2: (otherlv_0= KEYWORD_8 ( (lv_fgml_1_0= ruleFGMLibrary ) ) )
                    {
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:74:2: (otherlv_0= KEYWORD_8 ( (lv_fgml_1_0= ruleFGMLibrary ) ) )
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:75:2: otherlv_0= KEYWORD_8 ( (lv_fgml_1_0= ruleFGMLibrary ) )
                    {
                    otherlv_0=(Token)match(input,KEYWORD_8,FollowSets000.FOLLOW_KEYWORD_8_in_ruleFGMGrammarRoot116); 

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
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:133:1: ruleFGMLibrary returns [EObject current=null] : ( (lv_fgtmappingset_0_0= ruleFGTMappingset ) )+ ;
    public final EObject ruleFGMLibrary() throws RecognitionException {
        EObject current = null;

        EObject lv_fgtmappingset_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:136:28: ( ( (lv_fgtmappingset_0_0= ruleFGTMappingset ) )+ )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:137:1: ( (lv_fgtmappingset_0_0= ruleFGTMappingset ) )+
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:137:1: ( (lv_fgtmappingset_0_0= ruleFGTMappingset ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==KEYWORD_9) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:138:1: (lv_fgtmappingset_0_0= ruleFGTMappingset )
            	    {
            	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:138:1: (lv_fgtmappingset_0_0= ruleFGTMappingset )
            	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:139:3: lv_fgtmappingset_0_0= ruleFGTMappingset
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFGMLibraryAccess().getFgtmappingsetFGTMappingsetParserRuleCall_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleFGTMappingset_in_ruleFGMLibrary254);
            	    lv_fgtmappingset_0_0=ruleFGTMappingset();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFGMLibraryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fgtmappingset",
            	            		lv_fgtmappingset_0_0, 
            	            		"FGTMappingset");
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


    // $ANTLR start "entryRuleFGTMappingset"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:163:1: entryRuleFGTMappingset returns [EObject current=null] : iv_ruleFGTMappingset= ruleFGTMappingset EOF ;
    public final EObject entryRuleFGTMappingset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFGTMappingset = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:164:2: (iv_ruleFGTMappingset= ruleFGTMappingset EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:165:2: iv_ruleFGTMappingset= ruleFGTMappingset EOF
            {
             newCompositeNode(grammarAccess.getFGTMappingsetRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFGTMappingset_in_entryRuleFGTMappingset289);
            iv_ruleFGTMappingset=ruleFGTMappingset();

            state._fsp--;

             current =iv_ruleFGTMappingset; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFGTMappingset299); 

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
    // $ANTLR end "entryRuleFGTMappingset"


    // $ANTLR start "ruleFGTMappingset"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:172:1: ruleFGTMappingset returns [EObject current=null] : (otherlv_0= KEYWORD_9 ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= KEYWORD_7 ( ( ruleQFGTMREF ) ) )? ( (lv_mapping_4_0= ruleFGMMapping ) ) otherlv_5= KEYWORD_5 otherlv_6= KEYWORD_9 otherlv_7= KEYWORD_2 ) ;
    public final EObject ruleFGTMappingset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_mapping_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:175:28: ( (otherlv_0= KEYWORD_9 ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= KEYWORD_7 ( ( ruleQFGTMREF ) ) )? ( (lv_mapping_4_0= ruleFGMMapping ) ) otherlv_5= KEYWORD_5 otherlv_6= KEYWORD_9 otherlv_7= KEYWORD_2 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:176:1: (otherlv_0= KEYWORD_9 ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= KEYWORD_7 ( ( ruleQFGTMREF ) ) )? ( (lv_mapping_4_0= ruleFGMMapping ) ) otherlv_5= KEYWORD_5 otherlv_6= KEYWORD_9 otherlv_7= KEYWORD_2 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:176:1: (otherlv_0= KEYWORD_9 ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= KEYWORD_7 ( ( ruleQFGTMREF ) ) )? ( (lv_mapping_4_0= ruleFGMMapping ) ) otherlv_5= KEYWORD_5 otherlv_6= KEYWORD_9 otherlv_7= KEYWORD_2 )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:177:2: otherlv_0= KEYWORD_9 ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= KEYWORD_7 ( ( ruleQFGTMREF ) ) )? ( (lv_mapping_4_0= ruleFGMMapping ) ) otherlv_5= KEYWORD_5 otherlv_6= KEYWORD_9 otherlv_7= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_9,FollowSets000.FOLLOW_KEYWORD_9_in_ruleFGTMappingset337); 

                	newLeafNode(otherlv_0, grammarAccess.getFGTMappingsetAccess().getMappingsKeyword_0());
                
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:181:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:182:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:182:1: (lv_name_1_0= RULE_ID )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:183:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFGTMappingset353); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFGTMappingsetAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFGTMappingsetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:199:2: (otherlv_2= KEYWORD_7 ( ( ruleQFGTMREF ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==KEYWORD_7) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:200:2: otherlv_2= KEYWORD_7 ( ( ruleQFGTMREF ) )
                    {
                    otherlv_2=(Token)match(input,KEYWORD_7,FollowSets000.FOLLOW_KEYWORD_7_in_ruleFGTMappingset372); 

                        	newLeafNode(otherlv_2, grammarAccess.getFGTMappingsetAccess().getExtendsKeyword_2_0());
                        
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:204:1: ( ( ruleQFGTMREF ) )
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:205:1: ( ruleQFGTMREF )
                    {
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:205:1: ( ruleQFGTMREF )
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:206:3: ruleQFGTMREF
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFGTMappingsetRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getFGTMappingsetAccess().getMappingsetFGTMappingsetCrossReference_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQFGTMREF_in_ruleFGTMappingset394);
                    ruleQFGTMREF();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:219:4: ( (lv_mapping_4_0= ruleFGMMapping ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:220:1: (lv_mapping_4_0= ruleFGMMapping )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:220:1: (lv_mapping_4_0= ruleFGMMapping )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:221:3: lv_mapping_4_0= ruleFGMMapping
            {
             
            	        newCompositeNode(grammarAccess.getFGTMappingsetAccess().getMappingFGMMappingParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFGMMapping_in_ruleFGTMappingset417);
            lv_mapping_4_0=ruleFGMMapping();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFGTMappingsetRule());
            	        }
                   		add(
                   			current, 
                   			"mapping",
                    		lv_mapping_4_0, 
                    		"FGMMapping");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,KEYWORD_5,FollowSets000.FOLLOW_KEYWORD_5_in_ruleFGTMappingset430); 

                	newLeafNode(otherlv_5, grammarAccess.getFGTMappingsetAccess().getEndKeyword_4());
                
            otherlv_6=(Token)match(input,KEYWORD_9,FollowSets000.FOLLOW_KEYWORD_9_in_ruleFGTMappingset442); 

                	newLeafNode(otherlv_6, grammarAccess.getFGTMappingsetAccess().getMappingsKeyword_5());
                
            otherlv_7=(Token)match(input,KEYWORD_2,FollowSets000.FOLLOW_KEYWORD_2_in_ruleFGTMappingset454); 

                	newLeafNode(otherlv_7, grammarAccess.getFGTMappingsetAccess().getSemicolonKeyword_6());
                

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
    // $ANTLR end "ruleFGTMappingset"


    // $ANTLR start "entryRuleFGMSubclause"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:260:1: entryRuleFGMSubclause returns [EObject current=null] : iv_ruleFGMSubclause= ruleFGMSubclause EOF ;
    public final EObject entryRuleFGMSubclause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFGMSubclause = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:261:2: (iv_ruleFGMSubclause= ruleFGMSubclause EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:262:2: iv_ruleFGMSubclause= ruleFGMSubclause EOF
            {
             newCompositeNode(grammarAccess.getFGMSubclauseRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFGMSubclause_in_entryRuleFGMSubclause488);
            iv_ruleFGMSubclause=ruleFGMSubclause();

            state._fsp--;

             current =iv_ruleFGMSubclause; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFGMSubclause498); 

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
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:269:1: ruleFGMSubclause returns [EObject current=null] : (otherlv_0= KEYWORD_6 otherlv_1= KEYWORD_9 ( ( ruleQFGTMREF ) ) otherlv_3= KEYWORD_2 ) ;
    public final EObject ruleFGMSubclause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:272:28: ( (otherlv_0= KEYWORD_6 otherlv_1= KEYWORD_9 ( ( ruleQFGTMREF ) ) otherlv_3= KEYWORD_2 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:273:1: (otherlv_0= KEYWORD_6 otherlv_1= KEYWORD_9 ( ( ruleQFGTMREF ) ) otherlv_3= KEYWORD_2 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:273:1: (otherlv_0= KEYWORD_6 otherlv_1= KEYWORD_9 ( ( ruleQFGTMREF ) ) otherlv_3= KEYWORD_2 )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:274:2: otherlv_0= KEYWORD_6 otherlv_1= KEYWORD_9 ( ( ruleQFGTMREF ) ) otherlv_3= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_6,FollowSets000.FOLLOW_KEYWORD_6_in_ruleFGMSubclause536); 

                	newLeafNode(otherlv_0, grammarAccess.getFGMSubclauseAccess().getUseKeyword_0());
                
            otherlv_1=(Token)match(input,KEYWORD_9,FollowSets000.FOLLOW_KEYWORD_9_in_ruleFGMSubclause548); 

                	newLeafNode(otherlv_1, grammarAccess.getFGMSubclauseAccess().getMappingsKeyword_1());
                
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:283:1: ( ( ruleQFGTMREF ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:284:1: ( ruleQFGTMREF )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:284:1: ( ruleQFGTMREF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:285:3: ruleQFGTMREF
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFGMSubclauseRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getFGMSubclauseAccess().getMappingsetFGTMappingsetCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQFGTMREF_in_ruleFGMSubclause570);
            ruleQFGTMREF();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,KEYWORD_2,FollowSets000.FOLLOW_KEYWORD_2_in_ruleFGMSubclause583); 

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


    // $ANTLR start "entryRuleFGMMapping"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:319:1: entryRuleFGMMapping returns [EObject current=null] : iv_ruleFGMMapping= ruleFGMMapping EOF ;
    public final EObject entryRuleFGMMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFGMMapping = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:320:2: (iv_ruleFGMMapping= ruleFGMMapping EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:321:2: iv_ruleFGMMapping= ruleFGMMapping EOF
            {
             newCompositeNode(grammarAccess.getFGMMappingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFGMMapping_in_entryRuleFGMMapping625);
            iv_ruleFGMMapping=ruleFGMMapping();

            state._fsp--;

             current =iv_ruleFGMMapping; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFGMMapping635); 

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
    // $ANTLR end "entryRuleFGMMapping"


    // $ANTLR start "ruleFGMMapping"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:328:1: ruleFGMMapping returns [EObject current=null] : ( ( (lv_left_0_0= ruleFeaturePath ) ) otherlv_1= KEYWORD_4 ( (lv_right_2_0= ruleFeaturePath ) ) otherlv_3= KEYWORD_2 ) ;
    public final EObject ruleFGMMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:331:28: ( ( ( (lv_left_0_0= ruleFeaturePath ) ) otherlv_1= KEYWORD_4 ( (lv_right_2_0= ruleFeaturePath ) ) otherlv_3= KEYWORD_2 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:332:1: ( ( (lv_left_0_0= ruleFeaturePath ) ) otherlv_1= KEYWORD_4 ( (lv_right_2_0= ruleFeaturePath ) ) otherlv_3= KEYWORD_2 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:332:1: ( ( (lv_left_0_0= ruleFeaturePath ) ) otherlv_1= KEYWORD_4 ( (lv_right_2_0= ruleFeaturePath ) ) otherlv_3= KEYWORD_2 )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:332:2: ( (lv_left_0_0= ruleFeaturePath ) ) otherlv_1= KEYWORD_4 ( (lv_right_2_0= ruleFeaturePath ) ) otherlv_3= KEYWORD_2
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:332:2: ( (lv_left_0_0= ruleFeaturePath ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:333:1: (lv_left_0_0= ruleFeaturePath )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:333:1: (lv_left_0_0= ruleFeaturePath )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:334:3: lv_left_0_0= ruleFeaturePath
            {
             
            	        newCompositeNode(grammarAccess.getFGMMappingAccess().getLeftFeaturePathParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFeaturePath_in_ruleFGMMapping681);
            lv_left_0_0=ruleFeaturePath();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFGMMappingRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_0_0, 
                    		"FeaturePath");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,KEYWORD_4,FollowSets000.FOLLOW_KEYWORD_4_in_ruleFGMMapping694); 

                	newLeafNode(otherlv_1, grammarAccess.getFGMMappingAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1());
                
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:355:1: ( (lv_right_2_0= ruleFeaturePath ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:356:1: (lv_right_2_0= ruleFeaturePath )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:356:1: (lv_right_2_0= ruleFeaturePath )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:357:3: lv_right_2_0= ruleFeaturePath
            {
             
            	        newCompositeNode(grammarAccess.getFGMMappingAccess().getRightFeaturePathParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFeaturePath_in_ruleFGMMapping714);
            lv_right_2_0=ruleFeaturePath();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFGMMappingRule());
            	        }
                   		set(
                   			current, 
                   			"right",
                    		lv_right_2_0, 
                    		"FeaturePath");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,KEYWORD_2,FollowSets000.FOLLOW_KEYWORD_2_in_ruleFGMMapping727); 

                	newLeafNode(otherlv_3, grammarAccess.getFGMMappingAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleFGMMapping"


    // $ANTLR start "entryRuleFeaturePath"
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:386:1: entryRuleFeaturePath returns [EObject current=null] : iv_ruleFeaturePath= ruleFeaturePath EOF ;
    public final EObject entryRuleFeaturePath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeaturePath = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:387:2: (iv_ruleFeaturePath= ruleFeaturePath EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:388:2: iv_ruleFeaturePath= ruleFeaturePath EOF
            {
             newCompositeNode(grammarAccess.getFeaturePathRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeaturePath_in_entryRuleFeaturePath761);
            iv_ruleFeaturePath=ruleFeaturePath();

            state._fsp--;

             current =iv_ruleFeaturePath; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeaturePath771); 

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
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:395:1: ruleFeaturePath returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= KEYWORD_1 ) ( (lv_featureReference_2_0= ruleFeatureReference ) )+ ) ;
    public final EObject ruleFeaturePath() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_featureReference_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:398:28: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= KEYWORD_1 ) ( (lv_featureReference_2_0= ruleFeatureReference ) )+ ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:399:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= KEYWORD_1 ) ( (lv_featureReference_2_0= ruleFeatureReference ) )+ )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:399:1: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= KEYWORD_1 ) ( (lv_featureReference_2_0= ruleFeatureReference ) )+ )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:399:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= KEYWORD_1 ) ( (lv_featureReference_2_0= ruleFeatureReference ) )+
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:399:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= KEYWORD_1 )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:399:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= KEYWORD_1
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:399:3: ( (otherlv_0= RULE_ID ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:400:1: (otherlv_0= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:400:1: (otherlv_0= RULE_ID )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:401:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFeaturePathRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFeaturePath817); 

            		newLeafNode(otherlv_0, grammarAccess.getFeaturePathAccess().getFeatureGroupTypeFeatureGroupTypeCrossReference_0_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,KEYWORD_1,FollowSets000.FOLLOW_KEYWORD_1_in_ruleFeaturePath830); 

                	newLeafNode(otherlv_1, grammarAccess.getFeaturePathAccess().getFullStopKeyword_0_1());
                

            }

            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:417:2: ( (lv_featureReference_2_0= ruleFeatureReference ) )+
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
            	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:418:1: (lv_featureReference_2_0= ruleFeatureReference )
            	    {
            	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:418:1: (lv_featureReference_2_0= ruleFeatureReference )
            	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:419:3: lv_featureReference_2_0= ruleFeatureReference
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFeaturePathAccess().getFeatureReferenceFeatureReferenceParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleFeatureReference_in_ruleFeaturePath851);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:443:1: entryRuleFeatureReference returns [EObject current=null] : iv_ruleFeatureReference= ruleFeatureReference EOF ;
    public final EObject entryRuleFeatureReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureReference = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:444:2: (iv_ruleFeatureReference= ruleFeatureReference EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:445:2: iv_ruleFeatureReference= ruleFeatureReference EOF
            {
             newCompositeNode(grammarAccess.getFeatureReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeatureReference_in_entryRuleFeatureReference887);
            iv_ruleFeatureReference=ruleFeatureReference();

            state._fsp--;

             current =iv_ruleFeatureReference; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeatureReference897); 

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
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:452:1: ruleFeatureReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleFeatureReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:455:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:456:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:456:1: ( (otherlv_0= RULE_ID ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:457:1: (otherlv_0= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:457:1: (otherlv_0= RULE_ID )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:458:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureReferenceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFeatureReference941); 

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
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:477:1: entryRuleQFGTMREF returns [String current=null] : iv_ruleQFGTMREF= ruleQFGTMREF EOF ;
    public final String entryRuleQFGTMREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQFGTMREF = null;


        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:478:1: (iv_ruleQFGTMREF= ruleQFGTMREF EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:479:2: iv_ruleQFGTMREF= ruleQFGTMREF EOF
            {
             newCompositeNode(grammarAccess.getQFGTMREFRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQFGTMREF_in_entryRuleQFGTMREF976);
            iv_ruleQFGTMREF=ruleQFGTMREF();

            state._fsp--;

             current =iv_ruleQFGTMREF.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQFGTMREF987); 

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
    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:486:1: ruleQFGTMREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= KEYWORD_3 )* this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQFGTMREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:490:6: ( ( (this_ID_0= RULE_ID kw= KEYWORD_3 )* this_ID_2= RULE_ID ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:491:1: ( (this_ID_0= RULE_ID kw= KEYWORD_3 )* this_ID_2= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:491:1: ( (this_ID_0= RULE_ID kw= KEYWORD_3 )* this_ID_2= RULE_ID )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:491:2: (this_ID_0= RULE_ID kw= KEYWORD_3 )* this_ID_2= RULE_ID
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:491:2: (this_ID_0= RULE_ID kw= KEYWORD_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==KEYWORD_3) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/internal/InternalFeatureGroupMappingParser.g:491:7: this_ID_0= RULE_ID kw= KEYWORD_3
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQFGTMREF1028); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getQFGTMREFAccess().getIDTerminalRuleCall_0_0()); 
            	        
            	    kw=(Token)match(input,KEYWORD_3,FollowSets000.FOLLOW_KEYWORD_3_in_ruleQFGTMREF1046); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQFGTMREFAccess().getColonColonKeyword_0_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQFGTMREF1063); 

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
        public static final BitSet FOLLOW_KEYWORD_8_in_ruleFGMGrammarRoot116 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFGMLibrary_in_ruleFGMGrammarRoot136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFGMSubclause_in_ruleFGMGrammarRoot164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFGMLibrary_in_entryRuleFGMLibrary199 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFGMLibrary209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFGTMappingset_in_ruleFGMLibrary254 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_ruleFGTMappingset_in_entryRuleFGTMappingset289 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFGTMappingset299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_9_in_ruleFGTMappingset337 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFGTMappingset353 = new BitSet(new long[]{0x0000000000004020L});
        public static final BitSet FOLLOW_KEYWORD_7_in_ruleFGTMappingset372 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleQFGTMREF_in_ruleFGTMappingset394 = new BitSet(new long[]{0x0000000000004020L});
        public static final BitSet FOLLOW_ruleFGMMapping_in_ruleFGTMappingset417 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_KEYWORD_5_in_ruleFGTMappingset430 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_KEYWORD_9_in_ruleFGTMappingset442 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_KEYWORD_2_in_ruleFGTMappingset454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFGMSubclause_in_entryRuleFGMSubclause488 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFGMSubclause498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_6_in_ruleFGMSubclause536 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_KEYWORD_9_in_ruleFGMSubclause548 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleQFGTMREF_in_ruleFGMSubclause570 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_KEYWORD_2_in_ruleFGMSubclause583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFGMMapping_in_entryRuleFGMMapping625 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFGMMapping635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeaturePath_in_ruleFGMMapping681 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_KEYWORD_4_in_ruleFGMMapping694 = new BitSet(new long[]{0x0000000000004020L});
        public static final BitSet FOLLOW_ruleFeaturePath_in_ruleFGMMapping714 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_KEYWORD_2_in_ruleFGMMapping727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeaturePath_in_entryRuleFeaturePath761 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeaturePath771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFeaturePath817 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_KEYWORD_1_in_ruleFeaturePath830 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleFeatureReference_in_ruleFeaturePath851 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_ruleFeatureReference_in_entryRuleFeatureReference887 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeatureReference897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFeatureReference941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQFGTMREF_in_entryRuleQFGTMREF976 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQFGTMREF987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQFGTMREF1028 = new BitSet(new long[]{0x0000000000000400L});
        public static final BitSet FOLLOW_KEYWORD_3_in_ruleQFGTMREF1046 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQFGTMREF1063 = new BitSet(new long[]{0x0000000000000002L});
    }


}