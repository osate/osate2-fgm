package org.osate.xtext.aadl2.featuregroupmapping.ui.contentassist.antlr.internal; 

import java.util.Map;
import java.util.HashMap;

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
import org.osate.xtext.aadl2.featuregroupmapping.services.FeatureGroupMappingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFeatureGroupMappingParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g"; }


     
     	private FeatureGroupMappingGrammarAccess grammarAccess;
     	
     	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
     	
     	{
    		tokenNameToValue.put("KEYWORD_1", "'.'");
    		tokenNameToValue.put("KEYWORD_2", "':'");
    		tokenNameToValue.put("KEYWORD_3", "';'");
    		tokenNameToValue.put("KEYWORD_4", "'::'");
    		tokenNameToValue.put("KEYWORD_5", "'<=>'");
    		tokenNameToValue.put("KEYWORD_6", "'end'");
    		tokenNameToValue.put("KEYWORD_7", "'use'");
    		tokenNameToValue.put("KEYWORD_8", "'extends'");
    		tokenNameToValue.put("KEYWORD_9", "'library'");
    		tokenNameToValue.put("KEYWORD_10", "'mappings'");
     	}
     	
        public void setGrammarAccess(FeatureGroupMappingGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }

    	@Override
        protected String getValueForTokenName(String tokenName) {
        	String result = tokenNameToValue.get(tokenName);
        	if (result == null)
        		result = tokenName;
        	return result;
        }



    // $ANTLR start "entryRuleFGMGrammarRoot"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:73:1: entryRuleFGMGrammarRoot : ruleFGMGrammarRoot EOF ;
    public final void entryRuleFGMGrammarRoot() throws RecognitionException {
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:74:1: ( ruleFGMGrammarRoot EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:75:1: ruleFGMGrammarRoot EOF
            {
             before(grammarAccess.getFGMGrammarRootRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFGMGrammarRoot_in_entryRuleFGMGrammarRoot54);
            ruleFGMGrammarRoot();

            state._fsp--;

             after(grammarAccess.getFGMGrammarRootRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFGMGrammarRoot61); 

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
    // $ANTLR end "entryRuleFGMGrammarRoot"


    // $ANTLR start "ruleFGMGrammarRoot"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:82:1: ruleFGMGrammarRoot : ( ( rule__FGMGrammarRoot__Alternatives ) ) ;
    public final void ruleFGMGrammarRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:86:5: ( ( ( rule__FGMGrammarRoot__Alternatives ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:87:1: ( ( rule__FGMGrammarRoot__Alternatives ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:87:1: ( ( rule__FGMGrammarRoot__Alternatives ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:88:1: ( rule__FGMGrammarRoot__Alternatives )
            {
             before(grammarAccess.getFGMGrammarRootAccess().getAlternatives()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:89:1: ( rule__FGMGrammarRoot__Alternatives )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:89:2: rule__FGMGrammarRoot__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__FGMGrammarRoot__Alternatives_in_ruleFGMGrammarRoot91);
            rule__FGMGrammarRoot__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFGMGrammarRootAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFGMGrammarRoot"


    // $ANTLR start "entryRuleFGMLibrary"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:101:1: entryRuleFGMLibrary : ruleFGMLibrary EOF ;
    public final void entryRuleFGMLibrary() throws RecognitionException {
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:102:1: ( ruleFGMLibrary EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:103:1: ruleFGMLibrary EOF
            {
             before(grammarAccess.getFGMLibraryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFGMLibrary_in_entryRuleFGMLibrary118);
            ruleFGMLibrary();

            state._fsp--;

             after(grammarAccess.getFGMLibraryRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFGMLibrary125); 

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
    // $ANTLR end "entryRuleFGMLibrary"


    // $ANTLR start "ruleFGMLibrary"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:110:1: ruleFGMLibrary : ( ( ( rule__FGMLibrary__FeaturemappingsetAssignment ) ) ( ( rule__FGMLibrary__FeaturemappingsetAssignment )* ) ) ;
    public final void ruleFGMLibrary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:114:5: ( ( ( ( rule__FGMLibrary__FeaturemappingsetAssignment ) ) ( ( rule__FGMLibrary__FeaturemappingsetAssignment )* ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:115:1: ( ( ( rule__FGMLibrary__FeaturemappingsetAssignment ) ) ( ( rule__FGMLibrary__FeaturemappingsetAssignment )* ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:115:1: ( ( ( rule__FGMLibrary__FeaturemappingsetAssignment ) ) ( ( rule__FGMLibrary__FeaturemappingsetAssignment )* ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:116:1: ( ( rule__FGMLibrary__FeaturemappingsetAssignment ) ) ( ( rule__FGMLibrary__FeaturemappingsetAssignment )* )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:116:1: ( ( rule__FGMLibrary__FeaturemappingsetAssignment ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:117:1: ( rule__FGMLibrary__FeaturemappingsetAssignment )
            {
             before(grammarAccess.getFGMLibraryAccess().getFeaturemappingsetAssignment()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:118:1: ( rule__FGMLibrary__FeaturemappingsetAssignment )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:118:2: rule__FGMLibrary__FeaturemappingsetAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__FGMLibrary__FeaturemappingsetAssignment_in_ruleFGMLibrary157);
            rule__FGMLibrary__FeaturemappingsetAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFGMLibraryAccess().getFeaturemappingsetAssignment()); 

            }

            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:121:1: ( ( rule__FGMLibrary__FeaturemappingsetAssignment )* )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:122:1: ( rule__FGMLibrary__FeaturemappingsetAssignment )*
            {
             before(grammarAccess.getFGMLibraryAccess().getFeaturemappingsetAssignment()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:123:1: ( rule__FGMLibrary__FeaturemappingsetAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:123:2: rule__FGMLibrary__FeaturemappingsetAssignment
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__FGMLibrary__FeaturemappingsetAssignment_in_ruleFGMLibrary169);
            	    rule__FGMLibrary__FeaturemappingsetAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getFGMLibraryAccess().getFeaturemappingsetAssignment()); 

            }


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
    // $ANTLR end "ruleFGMLibrary"


    // $ANTLR start "entryRuleFeatureMappingset"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:136:1: entryRuleFeatureMappingset : ruleFeatureMappingset EOF ;
    public final void entryRuleFeatureMappingset() throws RecognitionException {
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:137:1: ( ruleFeatureMappingset EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:138:1: ruleFeatureMappingset EOF
            {
             before(grammarAccess.getFeatureMappingsetRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeatureMappingset_in_entryRuleFeatureMappingset199);
            ruleFeatureMappingset();

            state._fsp--;

             after(grammarAccess.getFeatureMappingsetRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeatureMappingset206); 

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
    // $ANTLR end "entryRuleFeatureMappingset"


    // $ANTLR start "ruleFeatureMappingset"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:145:1: ruleFeatureMappingset : ( ( rule__FeatureMappingset__Group__0 ) ) ;
    public final void ruleFeatureMappingset() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:149:5: ( ( ( rule__FeatureMappingset__Group__0 ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:150:1: ( ( rule__FeatureMappingset__Group__0 ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:150:1: ( ( rule__FeatureMappingset__Group__0 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:151:1: ( rule__FeatureMappingset__Group__0 )
            {
             before(grammarAccess.getFeatureMappingsetAccess().getGroup()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:152:1: ( rule__FeatureMappingset__Group__0 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:152:2: rule__FeatureMappingset__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__Group__0_in_ruleFeatureMappingset236);
            rule__FeatureMappingset__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureMappingsetAccess().getGroup()); 

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
    // $ANTLR end "ruleFeatureMappingset"


    // $ANTLR start "entryRuleFGMSubclause"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:164:1: entryRuleFGMSubclause : ruleFGMSubclause EOF ;
    public final void entryRuleFGMSubclause() throws RecognitionException {
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:165:1: ( ruleFGMSubclause EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:166:1: ruleFGMSubclause EOF
            {
             before(grammarAccess.getFGMSubclauseRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFGMSubclause_in_entryRuleFGMSubclause263);
            ruleFGMSubclause();

            state._fsp--;

             after(grammarAccess.getFGMSubclauseRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFGMSubclause270); 

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
    // $ANTLR end "entryRuleFGMSubclause"


    // $ANTLR start "ruleFGMSubclause"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:173:1: ruleFGMSubclause : ( ( rule__FGMSubclause__Group__0 ) ) ;
    public final void ruleFGMSubclause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:177:5: ( ( ( rule__FGMSubclause__Group__0 ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:178:1: ( ( rule__FGMSubclause__Group__0 ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:178:1: ( ( rule__FGMSubclause__Group__0 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:179:1: ( rule__FGMSubclause__Group__0 )
            {
             before(grammarAccess.getFGMSubclauseAccess().getGroup()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:180:1: ( rule__FGMSubclause__Group__0 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:180:2: rule__FGMSubclause__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FGMSubclause__Group__0_in_ruleFGMSubclause300);
            rule__FGMSubclause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFGMSubclauseAccess().getGroup()); 

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
    // $ANTLR end "ruleFGMSubclause"


    // $ANTLR start "entryRuleFeatureMapping"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:200:1: entryRuleFeatureMapping : ruleFeatureMapping EOF ;
    public final void entryRuleFeatureMapping() throws RecognitionException {
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:201:1: ( ruleFeatureMapping EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:202:1: ruleFeatureMapping EOF
            {
             before(grammarAccess.getFeatureMappingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeatureMapping_in_entryRuleFeatureMapping335);
            ruleFeatureMapping();

            state._fsp--;

             after(grammarAccess.getFeatureMappingRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeatureMapping342); 

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
    // $ANTLR end "entryRuleFeatureMapping"


    // $ANTLR start "ruleFeatureMapping"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:209:1: ruleFeatureMapping : ( ( rule__FeatureMapping__Group__0 ) ) ;
    public final void ruleFeatureMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:213:5: ( ( ( rule__FeatureMapping__Group__0 ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:214:1: ( ( rule__FeatureMapping__Group__0 ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:214:1: ( ( rule__FeatureMapping__Group__0 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:215:1: ( rule__FeatureMapping__Group__0 )
            {
             before(grammarAccess.getFeatureMappingAccess().getGroup()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:216:1: ( rule__FeatureMapping__Group__0 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:216:2: rule__FeatureMapping__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMapping__Group__0_in_ruleFeatureMapping372);
            rule__FeatureMapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureMappingAccess().getGroup()); 

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
    // $ANTLR end "ruleFeatureMapping"


    // $ANTLR start "entryRuleFeaturePath"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:228:1: entryRuleFeaturePath : ruleFeaturePath EOF ;
    public final void entryRuleFeaturePath() throws RecognitionException {
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:229:1: ( ruleFeaturePath EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:230:1: ruleFeaturePath EOF
            {
             before(grammarAccess.getFeaturePathRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeaturePath_in_entryRuleFeaturePath399);
            ruleFeaturePath();

            state._fsp--;

             after(grammarAccess.getFeaturePathRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeaturePath406); 

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
    // $ANTLR end "entryRuleFeaturePath"


    // $ANTLR start "ruleFeaturePath"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:237:1: ruleFeaturePath : ( ( rule__FeaturePath__Group__0 ) ) ;
    public final void ruleFeaturePath() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:241:5: ( ( ( rule__FeaturePath__Group__0 ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:242:1: ( ( rule__FeaturePath__Group__0 ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:242:1: ( ( rule__FeaturePath__Group__0 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:243:1: ( rule__FeaturePath__Group__0 )
            {
             before(grammarAccess.getFeaturePathAccess().getGroup()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:244:1: ( rule__FeaturePath__Group__0 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:244:2: rule__FeaturePath__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeaturePath__Group__0_in_ruleFeaturePath436);
            rule__FeaturePath__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeaturePathAccess().getGroup()); 

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
    // $ANTLR end "ruleFeaturePath"


    // $ANTLR start "entryRuleFeatureReference"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:256:1: entryRuleFeatureReference : ruleFeatureReference EOF ;
    public final void entryRuleFeatureReference() throws RecognitionException {
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:257:1: ( ruleFeatureReference EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:258:1: ruleFeatureReference EOF
            {
             before(grammarAccess.getFeatureReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeatureReference_in_entryRuleFeatureReference463);
            ruleFeatureReference();

            state._fsp--;

             after(grammarAccess.getFeatureReferenceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeatureReference470); 

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
    // $ANTLR end "entryRuleFeatureReference"


    // $ANTLR start "ruleFeatureReference"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:265:1: ruleFeatureReference : ( ( rule__FeatureReference__FeatureAssignment ) ) ;
    public final void ruleFeatureReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:269:5: ( ( ( rule__FeatureReference__FeatureAssignment ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:270:1: ( ( rule__FeatureReference__FeatureAssignment ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:270:1: ( ( rule__FeatureReference__FeatureAssignment ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:271:1: ( rule__FeatureReference__FeatureAssignment )
            {
             before(grammarAccess.getFeatureReferenceAccess().getFeatureAssignment()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:272:1: ( rule__FeatureReference__FeatureAssignment )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:272:2: rule__FeatureReference__FeatureAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureReference__FeatureAssignment_in_ruleFeatureReference500);
            rule__FeatureReference__FeatureAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFeatureReferenceAccess().getFeatureAssignment()); 

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
    // $ANTLR end "ruleFeatureReference"


    // $ANTLR start "entryRuleQFGTMREF"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:284:1: entryRuleQFGTMREF : ruleQFGTMREF EOF ;
    public final void entryRuleQFGTMREF() throws RecognitionException {
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:285:1: ( ruleQFGTMREF EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:286:1: ruleQFGTMREF EOF
            {
             before(grammarAccess.getQFGTMREFRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQFGTMREF_in_entryRuleQFGTMREF527);
            ruleQFGTMREF();

            state._fsp--;

             after(grammarAccess.getQFGTMREFRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQFGTMREF534); 

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
    // $ANTLR end "entryRuleQFGTMREF"


    // $ANTLR start "ruleQFGTMREF"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:293:1: ruleQFGTMREF : ( ( rule__QFGTMREF__Group__0 ) ) ;
    public final void ruleQFGTMREF() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:297:5: ( ( ( rule__QFGTMREF__Group__0 ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:298:1: ( ( rule__QFGTMREF__Group__0 ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:298:1: ( ( rule__QFGTMREF__Group__0 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:299:1: ( rule__QFGTMREF__Group__0 )
            {
             before(grammarAccess.getQFGTMREFAccess().getGroup()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:300:1: ( rule__QFGTMREF__Group__0 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:300:2: rule__QFGTMREF__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QFGTMREF__Group__0_in_ruleQFGTMREF564);
            rule__QFGTMREF__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQFGTMREFAccess().getGroup()); 

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
    // $ANTLR end "ruleQFGTMREF"


    // $ANTLR start "rule__FGMGrammarRoot__Alternatives"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:312:1: rule__FGMGrammarRoot__Alternatives : ( ( ( rule__FGMGrammarRoot__Group_0__0 ) ) | ( ( rule__FGMGrammarRoot__FgmscAssignment_1 ) ) );
    public final void rule__FGMGrammarRoot__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:316:1: ( ( ( rule__FGMGrammarRoot__Group_0__0 ) ) | ( ( rule__FGMGrammarRoot__FgmscAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==KEYWORD_9) ) {
                alt2=1;
            }
            else if ( (LA2_0==KEYWORD_7) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:317:1: ( ( rule__FGMGrammarRoot__Group_0__0 ) )
                    {
                    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:317:1: ( ( rule__FGMGrammarRoot__Group_0__0 ) )
                    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:318:1: ( rule__FGMGrammarRoot__Group_0__0 )
                    {
                     before(grammarAccess.getFGMGrammarRootAccess().getGroup_0()); 
                    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:319:1: ( rule__FGMGrammarRoot__Group_0__0 )
                    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:319:2: rule__FGMGrammarRoot__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FGMGrammarRoot__Group_0__0_in_rule__FGMGrammarRoot__Alternatives600);
                    rule__FGMGrammarRoot__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFGMGrammarRootAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:323:6: ( ( rule__FGMGrammarRoot__FgmscAssignment_1 ) )
                    {
                    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:323:6: ( ( rule__FGMGrammarRoot__FgmscAssignment_1 ) )
                    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:324:1: ( rule__FGMGrammarRoot__FgmscAssignment_1 )
                    {
                     before(grammarAccess.getFGMGrammarRootAccess().getFgmscAssignment_1()); 
                    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:325:1: ( rule__FGMGrammarRoot__FgmscAssignment_1 )
                    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:325:2: rule__FGMGrammarRoot__FgmscAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FGMGrammarRoot__FgmscAssignment_1_in_rule__FGMGrammarRoot__Alternatives618);
                    rule__FGMGrammarRoot__FgmscAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFGMGrammarRootAccess().getFgmscAssignment_1()); 

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
    // $ANTLR end "rule__FGMGrammarRoot__Alternatives"


    // $ANTLR start "rule__FGMGrammarRoot__Group_0__0"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:337:1: rule__FGMGrammarRoot__Group_0__0 : rule__FGMGrammarRoot__Group_0__0__Impl rule__FGMGrammarRoot__Group_0__1 ;
    public final void rule__FGMGrammarRoot__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:341:1: ( rule__FGMGrammarRoot__Group_0__0__Impl rule__FGMGrammarRoot__Group_0__1 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:342:2: rule__FGMGrammarRoot__Group_0__0__Impl rule__FGMGrammarRoot__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FGMGrammarRoot__Group_0__0__Impl_in_rule__FGMGrammarRoot__Group_0__0650);
            rule__FGMGrammarRoot__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FGMGrammarRoot__Group_0__1_in_rule__FGMGrammarRoot__Group_0__0653);
            rule__FGMGrammarRoot__Group_0__1();

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
    // $ANTLR end "rule__FGMGrammarRoot__Group_0__0"


    // $ANTLR start "rule__FGMGrammarRoot__Group_0__0__Impl"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:349:1: rule__FGMGrammarRoot__Group_0__0__Impl : ( KEYWORD_9 ) ;
    public final void rule__FGMGrammarRoot__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:353:1: ( ( KEYWORD_9 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:354:1: ( KEYWORD_9 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:354:1: ( KEYWORD_9 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:355:1: KEYWORD_9
            {
             before(grammarAccess.getFGMGrammarRootAccess().getLibraryKeyword_0_0()); 
            match(input,KEYWORD_9,FollowSets000.FOLLOW_KEYWORD_9_in_rule__FGMGrammarRoot__Group_0__0__Impl681); 
             after(grammarAccess.getFGMGrammarRootAccess().getLibraryKeyword_0_0()); 

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
    // $ANTLR end "rule__FGMGrammarRoot__Group_0__0__Impl"


    // $ANTLR start "rule__FGMGrammarRoot__Group_0__1"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:368:1: rule__FGMGrammarRoot__Group_0__1 : rule__FGMGrammarRoot__Group_0__1__Impl ;
    public final void rule__FGMGrammarRoot__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:372:1: ( rule__FGMGrammarRoot__Group_0__1__Impl )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:373:2: rule__FGMGrammarRoot__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FGMGrammarRoot__Group_0__1__Impl_in_rule__FGMGrammarRoot__Group_0__1712);
            rule__FGMGrammarRoot__Group_0__1__Impl();

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
    // $ANTLR end "rule__FGMGrammarRoot__Group_0__1"


    // $ANTLR start "rule__FGMGrammarRoot__Group_0__1__Impl"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:379:1: rule__FGMGrammarRoot__Group_0__1__Impl : ( ( rule__FGMGrammarRoot__FgmlAssignment_0_1 ) ) ;
    public final void rule__FGMGrammarRoot__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:383:1: ( ( ( rule__FGMGrammarRoot__FgmlAssignment_0_1 ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:384:1: ( ( rule__FGMGrammarRoot__FgmlAssignment_0_1 ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:384:1: ( ( rule__FGMGrammarRoot__FgmlAssignment_0_1 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:385:1: ( rule__FGMGrammarRoot__FgmlAssignment_0_1 )
            {
             before(grammarAccess.getFGMGrammarRootAccess().getFgmlAssignment_0_1()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:386:1: ( rule__FGMGrammarRoot__FgmlAssignment_0_1 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:386:2: rule__FGMGrammarRoot__FgmlAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FGMGrammarRoot__FgmlAssignment_0_1_in_rule__FGMGrammarRoot__Group_0__1__Impl739);
            rule__FGMGrammarRoot__FgmlAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getFGMGrammarRootAccess().getFgmlAssignment_0_1()); 

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
    // $ANTLR end "rule__FGMGrammarRoot__Group_0__1__Impl"


    // $ANTLR start "rule__FeatureMappingset__Group__0"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:400:1: rule__FeatureMappingset__Group__0 : rule__FeatureMappingset__Group__0__Impl rule__FeatureMappingset__Group__1 ;
    public final void rule__FeatureMappingset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:404:1: ( rule__FeatureMappingset__Group__0__Impl rule__FeatureMappingset__Group__1 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:405:2: rule__FeatureMappingset__Group__0__Impl rule__FeatureMappingset__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__Group__0__Impl_in_rule__FeatureMappingset__Group__0773);
            rule__FeatureMappingset__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__Group__1_in_rule__FeatureMappingset__Group__0776);
            rule__FeatureMappingset__Group__1();

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
    // $ANTLR end "rule__FeatureMappingset__Group__0"


    // $ANTLR start "rule__FeatureMappingset__Group__0__Impl"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:412:1: rule__FeatureMappingset__Group__0__Impl : ( ( rule__FeatureMappingset__NameAssignment_0 ) ) ;
    public final void rule__FeatureMappingset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:416:1: ( ( ( rule__FeatureMappingset__NameAssignment_0 ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:417:1: ( ( rule__FeatureMappingset__NameAssignment_0 ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:417:1: ( ( rule__FeatureMappingset__NameAssignment_0 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:418:1: ( rule__FeatureMappingset__NameAssignment_0 )
            {
             before(grammarAccess.getFeatureMappingsetAccess().getNameAssignment_0()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:419:1: ( rule__FeatureMappingset__NameAssignment_0 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:419:2: rule__FeatureMappingset__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__NameAssignment_0_in_rule__FeatureMappingset__Group__0__Impl803);
            rule__FeatureMappingset__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureMappingsetAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__FeatureMappingset__Group__0__Impl"


    // $ANTLR start "rule__FeatureMappingset__Group__1"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:429:1: rule__FeatureMappingset__Group__1 : rule__FeatureMappingset__Group__1__Impl rule__FeatureMappingset__Group__2 ;
    public final void rule__FeatureMappingset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:433:1: ( rule__FeatureMappingset__Group__1__Impl rule__FeatureMappingset__Group__2 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:434:2: rule__FeatureMappingset__Group__1__Impl rule__FeatureMappingset__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__Group__1__Impl_in_rule__FeatureMappingset__Group__1833);
            rule__FeatureMappingset__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__Group__2_in_rule__FeatureMappingset__Group__1836);
            rule__FeatureMappingset__Group__2();

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
    // $ANTLR end "rule__FeatureMappingset__Group__1"


    // $ANTLR start "rule__FeatureMappingset__Group__1__Impl"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:441:1: rule__FeatureMappingset__Group__1__Impl : ( KEYWORD_2 ) ;
    public final void rule__FeatureMappingset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:445:1: ( ( KEYWORD_2 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:446:1: ( KEYWORD_2 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:446:1: ( KEYWORD_2 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:447:1: KEYWORD_2
            {
             before(grammarAccess.getFeatureMappingsetAccess().getColonKeyword_1()); 
            match(input,KEYWORD_2,FollowSets000.FOLLOW_KEYWORD_2_in_rule__FeatureMappingset__Group__1__Impl864); 
             after(grammarAccess.getFeatureMappingsetAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__FeatureMappingset__Group__1__Impl"


    // $ANTLR start "rule__FeatureMappingset__Group__2"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:460:1: rule__FeatureMappingset__Group__2 : rule__FeatureMappingset__Group__2__Impl rule__FeatureMappingset__Group__3 ;
    public final void rule__FeatureMappingset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:464:1: ( rule__FeatureMappingset__Group__2__Impl rule__FeatureMappingset__Group__3 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:465:2: rule__FeatureMappingset__Group__2__Impl rule__FeatureMappingset__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__Group__2__Impl_in_rule__FeatureMappingset__Group__2895);
            rule__FeatureMappingset__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__Group__3_in_rule__FeatureMappingset__Group__2898);
            rule__FeatureMappingset__Group__3();

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
    // $ANTLR end "rule__FeatureMappingset__Group__2"


    // $ANTLR start "rule__FeatureMappingset__Group__2__Impl"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:472:1: rule__FeatureMappingset__Group__2__Impl : ( KEYWORD_10 ) ;
    public final void rule__FeatureMappingset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:476:1: ( ( KEYWORD_10 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:477:1: ( KEYWORD_10 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:477:1: ( KEYWORD_10 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:478:1: KEYWORD_10
            {
             before(grammarAccess.getFeatureMappingsetAccess().getMappingsKeyword_2()); 
            match(input,KEYWORD_10,FollowSets000.FOLLOW_KEYWORD_10_in_rule__FeatureMappingset__Group__2__Impl926); 
             after(grammarAccess.getFeatureMappingsetAccess().getMappingsKeyword_2()); 

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
    // $ANTLR end "rule__FeatureMappingset__Group__2__Impl"


    // $ANTLR start "rule__FeatureMappingset__Group__3"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:491:1: rule__FeatureMappingset__Group__3 : rule__FeatureMappingset__Group__3__Impl rule__FeatureMappingset__Group__4 ;
    public final void rule__FeatureMappingset__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:495:1: ( rule__FeatureMappingset__Group__3__Impl rule__FeatureMappingset__Group__4 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:496:2: rule__FeatureMappingset__Group__3__Impl rule__FeatureMappingset__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__Group__3__Impl_in_rule__FeatureMappingset__Group__3957);
            rule__FeatureMappingset__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__Group__4_in_rule__FeatureMappingset__Group__3960);
            rule__FeatureMappingset__Group__4();

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
    // $ANTLR end "rule__FeatureMappingset__Group__3"


    // $ANTLR start "rule__FeatureMappingset__Group__3__Impl"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:503:1: rule__FeatureMappingset__Group__3__Impl : ( ( rule__FeatureMappingset__Group_3__0 )? ) ;
    public final void rule__FeatureMappingset__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:507:1: ( ( ( rule__FeatureMappingset__Group_3__0 )? ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:508:1: ( ( rule__FeatureMappingset__Group_3__0 )? )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:508:1: ( ( rule__FeatureMappingset__Group_3__0 )? )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:509:1: ( rule__FeatureMappingset__Group_3__0 )?
            {
             before(grammarAccess.getFeatureMappingsetAccess().getGroup_3()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:510:1: ( rule__FeatureMappingset__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==KEYWORD_8) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:510:2: rule__FeatureMappingset__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__Group_3__0_in_rule__FeatureMappingset__Group__3__Impl987);
                    rule__FeatureMappingset__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureMappingsetAccess().getGroup_3()); 

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
    // $ANTLR end "rule__FeatureMappingset__Group__3__Impl"


    // $ANTLR start "rule__FeatureMappingset__Group__4"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:520:1: rule__FeatureMappingset__Group__4 : rule__FeatureMappingset__Group__4__Impl rule__FeatureMappingset__Group__5 ;
    public final void rule__FeatureMappingset__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:524:1: ( rule__FeatureMappingset__Group__4__Impl rule__FeatureMappingset__Group__5 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:525:2: rule__FeatureMappingset__Group__4__Impl rule__FeatureMappingset__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__Group__4__Impl_in_rule__FeatureMappingset__Group__41018);
            rule__FeatureMappingset__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__Group__5_in_rule__FeatureMappingset__Group__41021);
            rule__FeatureMappingset__Group__5();

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
    // $ANTLR end "rule__FeatureMappingset__Group__4"


    // $ANTLR start "rule__FeatureMappingset__Group__4__Impl"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:532:1: rule__FeatureMappingset__Group__4__Impl : ( ( rule__FeatureMappingset__MappingAssignment_4 ) ) ;
    public final void rule__FeatureMappingset__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:536:1: ( ( ( rule__FeatureMappingset__MappingAssignment_4 ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:537:1: ( ( rule__FeatureMappingset__MappingAssignment_4 ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:537:1: ( ( rule__FeatureMappingset__MappingAssignment_4 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:538:1: ( rule__FeatureMappingset__MappingAssignment_4 )
            {
             before(grammarAccess.getFeatureMappingsetAccess().getMappingAssignment_4()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:539:1: ( rule__FeatureMappingset__MappingAssignment_4 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:539:2: rule__FeatureMappingset__MappingAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__MappingAssignment_4_in_rule__FeatureMappingset__Group__4__Impl1048);
            rule__FeatureMappingset__MappingAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFeatureMappingsetAccess().getMappingAssignment_4()); 

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
    // $ANTLR end "rule__FeatureMappingset__Group__4__Impl"


    // $ANTLR start "rule__FeatureMappingset__Group__5"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:549:1: rule__FeatureMappingset__Group__5 : rule__FeatureMappingset__Group__5__Impl rule__FeatureMappingset__Group__6 ;
    public final void rule__FeatureMappingset__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:553:1: ( rule__FeatureMappingset__Group__5__Impl rule__FeatureMappingset__Group__6 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:554:2: rule__FeatureMappingset__Group__5__Impl rule__FeatureMappingset__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__Group__5__Impl_in_rule__FeatureMappingset__Group__51078);
            rule__FeatureMappingset__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__Group__6_in_rule__FeatureMappingset__Group__51081);
            rule__FeatureMappingset__Group__6();

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
    // $ANTLR end "rule__FeatureMappingset__Group__5"


    // $ANTLR start "rule__FeatureMappingset__Group__5__Impl"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:561:1: rule__FeatureMappingset__Group__5__Impl : ( KEYWORD_6 ) ;
    public final void rule__FeatureMappingset__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:565:1: ( ( KEYWORD_6 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:566:1: ( KEYWORD_6 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:566:1: ( KEYWORD_6 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:567:1: KEYWORD_6
            {
             before(grammarAccess.getFeatureMappingsetAccess().getEndKeyword_5()); 
            match(input,KEYWORD_6,FollowSets000.FOLLOW_KEYWORD_6_in_rule__FeatureMappingset__Group__5__Impl1109); 
             after(grammarAccess.getFeatureMappingsetAccess().getEndKeyword_5()); 

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
    // $ANTLR end "rule__FeatureMappingset__Group__5__Impl"


    // $ANTLR start "rule__FeatureMappingset__Group__6"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:580:1: rule__FeatureMappingset__Group__6 : rule__FeatureMappingset__Group__6__Impl rule__FeatureMappingset__Group__7 ;
    public final void rule__FeatureMappingset__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:584:1: ( rule__FeatureMappingset__Group__6__Impl rule__FeatureMappingset__Group__7 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:585:2: rule__FeatureMappingset__Group__6__Impl rule__FeatureMappingset__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__Group__6__Impl_in_rule__FeatureMappingset__Group__61140);
            rule__FeatureMappingset__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__Group__7_in_rule__FeatureMappingset__Group__61143);
            rule__FeatureMappingset__Group__7();

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
    // $ANTLR end "rule__FeatureMappingset__Group__6"


    // $ANTLR start "rule__FeatureMappingset__Group__6__Impl"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:592:1: rule__FeatureMappingset__Group__6__Impl : ( KEYWORD_10 ) ;
    public final void rule__FeatureMappingset__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:596:1: ( ( KEYWORD_10 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:597:1: ( KEYWORD_10 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:597:1: ( KEYWORD_10 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:598:1: KEYWORD_10
            {
             before(grammarAccess.getFeatureMappingsetAccess().getMappingsKeyword_6()); 
            match(input,KEYWORD_10,FollowSets000.FOLLOW_KEYWORD_10_in_rule__FeatureMappingset__Group__6__Impl1171); 
             after(grammarAccess.getFeatureMappingsetAccess().getMappingsKeyword_6()); 

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
    // $ANTLR end "rule__FeatureMappingset__Group__6__Impl"


    // $ANTLR start "rule__FeatureMappingset__Group__7"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:611:1: rule__FeatureMappingset__Group__7 : rule__FeatureMappingset__Group__7__Impl ;
    public final void rule__FeatureMappingset__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:615:1: ( rule__FeatureMappingset__Group__7__Impl )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:616:2: rule__FeatureMappingset__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__Group__7__Impl_in_rule__FeatureMappingset__Group__71202);
            rule__FeatureMappingset__Group__7__Impl();

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
    // $ANTLR end "rule__FeatureMappingset__Group__7"


    // $ANTLR start "rule__FeatureMappingset__Group__7__Impl"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:622:1: rule__FeatureMappingset__Group__7__Impl : ( KEYWORD_3 ) ;
    public final void rule__FeatureMappingset__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:626:1: ( ( KEYWORD_3 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:627:1: ( KEYWORD_3 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:627:1: ( KEYWORD_3 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:628:1: KEYWORD_3
            {
             before(grammarAccess.getFeatureMappingsetAccess().getSemicolonKeyword_7()); 
            match(input,KEYWORD_3,FollowSets000.FOLLOW_KEYWORD_3_in_rule__FeatureMappingset__Group__7__Impl1230); 
             after(grammarAccess.getFeatureMappingsetAccess().getSemicolonKeyword_7()); 

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
    // $ANTLR end "rule__FeatureMappingset__Group__7__Impl"


    // $ANTLR start "rule__FeatureMappingset__Group_3__0"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:657:1: rule__FeatureMappingset__Group_3__0 : rule__FeatureMappingset__Group_3__0__Impl rule__FeatureMappingset__Group_3__1 ;
    public final void rule__FeatureMappingset__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:661:1: ( rule__FeatureMappingset__Group_3__0__Impl rule__FeatureMappingset__Group_3__1 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:662:2: rule__FeatureMappingset__Group_3__0__Impl rule__FeatureMappingset__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__Group_3__0__Impl_in_rule__FeatureMappingset__Group_3__01277);
            rule__FeatureMappingset__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__Group_3__1_in_rule__FeatureMappingset__Group_3__01280);
            rule__FeatureMappingset__Group_3__1();

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
    // $ANTLR end "rule__FeatureMappingset__Group_3__0"


    // $ANTLR start "rule__FeatureMappingset__Group_3__0__Impl"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:669:1: rule__FeatureMappingset__Group_3__0__Impl : ( KEYWORD_8 ) ;
    public final void rule__FeatureMappingset__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:673:1: ( ( KEYWORD_8 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:674:1: ( KEYWORD_8 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:674:1: ( KEYWORD_8 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:675:1: KEYWORD_8
            {
             before(grammarAccess.getFeatureMappingsetAccess().getExtendsKeyword_3_0()); 
            match(input,KEYWORD_8,FollowSets000.FOLLOW_KEYWORD_8_in_rule__FeatureMappingset__Group_3__0__Impl1308); 
             after(grammarAccess.getFeatureMappingsetAccess().getExtendsKeyword_3_0()); 

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
    // $ANTLR end "rule__FeatureMappingset__Group_3__0__Impl"


    // $ANTLR start "rule__FeatureMappingset__Group_3__1"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:688:1: rule__FeatureMappingset__Group_3__1 : rule__FeatureMappingset__Group_3__1__Impl ;
    public final void rule__FeatureMappingset__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:692:1: ( rule__FeatureMappingset__Group_3__1__Impl )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:693:2: rule__FeatureMappingset__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__Group_3__1__Impl_in_rule__FeatureMappingset__Group_3__11339);
            rule__FeatureMappingset__Group_3__1__Impl();

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
    // $ANTLR end "rule__FeatureMappingset__Group_3__1"


    // $ANTLR start "rule__FeatureMappingset__Group_3__1__Impl"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:699:1: rule__FeatureMappingset__Group_3__1__Impl : ( ( rule__FeatureMappingset__MappingsetAssignment_3_1 ) ) ;
    public final void rule__FeatureMappingset__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:703:1: ( ( ( rule__FeatureMappingset__MappingsetAssignment_3_1 ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:704:1: ( ( rule__FeatureMappingset__MappingsetAssignment_3_1 ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:704:1: ( ( rule__FeatureMappingset__MappingsetAssignment_3_1 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:705:1: ( rule__FeatureMappingset__MappingsetAssignment_3_1 )
            {
             before(grammarAccess.getFeatureMappingsetAccess().getMappingsetAssignment_3_1()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:706:1: ( rule__FeatureMappingset__MappingsetAssignment_3_1 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:706:2: rule__FeatureMappingset__MappingsetAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__MappingsetAssignment_3_1_in_rule__FeatureMappingset__Group_3__1__Impl1366);
            rule__FeatureMappingset__MappingsetAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureMappingsetAccess().getMappingsetAssignment_3_1()); 

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
    // $ANTLR end "rule__FeatureMappingset__Group_3__1__Impl"


    // $ANTLR start "rule__FGMSubclause__Group__0"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:720:1: rule__FGMSubclause__Group__0 : rule__FGMSubclause__Group__0__Impl rule__FGMSubclause__Group__1 ;
    public final void rule__FGMSubclause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:724:1: ( rule__FGMSubclause__Group__0__Impl rule__FGMSubclause__Group__1 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:725:2: rule__FGMSubclause__Group__0__Impl rule__FGMSubclause__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FGMSubclause__Group__0__Impl_in_rule__FGMSubclause__Group__01400);
            rule__FGMSubclause__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FGMSubclause__Group__1_in_rule__FGMSubclause__Group__01403);
            rule__FGMSubclause__Group__1();

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
    // $ANTLR end "rule__FGMSubclause__Group__0"


    // $ANTLR start "rule__FGMSubclause__Group__0__Impl"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:732:1: rule__FGMSubclause__Group__0__Impl : ( KEYWORD_7 ) ;
    public final void rule__FGMSubclause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:736:1: ( ( KEYWORD_7 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:737:1: ( KEYWORD_7 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:737:1: ( KEYWORD_7 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:738:1: KEYWORD_7
            {
             before(grammarAccess.getFGMSubclauseAccess().getUseKeyword_0()); 
            match(input,KEYWORD_7,FollowSets000.FOLLOW_KEYWORD_7_in_rule__FGMSubclause__Group__0__Impl1431); 
             after(grammarAccess.getFGMSubclauseAccess().getUseKeyword_0()); 

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
    // $ANTLR end "rule__FGMSubclause__Group__0__Impl"


    // $ANTLR start "rule__FGMSubclause__Group__1"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:751:1: rule__FGMSubclause__Group__1 : rule__FGMSubclause__Group__1__Impl rule__FGMSubclause__Group__2 ;
    public final void rule__FGMSubclause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:755:1: ( rule__FGMSubclause__Group__1__Impl rule__FGMSubclause__Group__2 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:756:2: rule__FGMSubclause__Group__1__Impl rule__FGMSubclause__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FGMSubclause__Group__1__Impl_in_rule__FGMSubclause__Group__11462);
            rule__FGMSubclause__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FGMSubclause__Group__2_in_rule__FGMSubclause__Group__11465);
            rule__FGMSubclause__Group__2();

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
    // $ANTLR end "rule__FGMSubclause__Group__1"


    // $ANTLR start "rule__FGMSubclause__Group__1__Impl"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:763:1: rule__FGMSubclause__Group__1__Impl : ( KEYWORD_10 ) ;
    public final void rule__FGMSubclause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:767:1: ( ( KEYWORD_10 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:768:1: ( KEYWORD_10 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:768:1: ( KEYWORD_10 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:769:1: KEYWORD_10
            {
             before(grammarAccess.getFGMSubclauseAccess().getMappingsKeyword_1()); 
            match(input,KEYWORD_10,FollowSets000.FOLLOW_KEYWORD_10_in_rule__FGMSubclause__Group__1__Impl1493); 
             after(grammarAccess.getFGMSubclauseAccess().getMappingsKeyword_1()); 

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
    // $ANTLR end "rule__FGMSubclause__Group__1__Impl"


    // $ANTLR start "rule__FGMSubclause__Group__2"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:782:1: rule__FGMSubclause__Group__2 : rule__FGMSubclause__Group__2__Impl rule__FGMSubclause__Group__3 ;
    public final void rule__FGMSubclause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:786:1: ( rule__FGMSubclause__Group__2__Impl rule__FGMSubclause__Group__3 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:787:2: rule__FGMSubclause__Group__2__Impl rule__FGMSubclause__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FGMSubclause__Group__2__Impl_in_rule__FGMSubclause__Group__21524);
            rule__FGMSubclause__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FGMSubclause__Group__3_in_rule__FGMSubclause__Group__21527);
            rule__FGMSubclause__Group__3();

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
    // $ANTLR end "rule__FGMSubclause__Group__2"


    // $ANTLR start "rule__FGMSubclause__Group__2__Impl"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:794:1: rule__FGMSubclause__Group__2__Impl : ( ( rule__FGMSubclause__MappingsetAssignment_2 ) ) ;
    public final void rule__FGMSubclause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:798:1: ( ( ( rule__FGMSubclause__MappingsetAssignment_2 ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:799:1: ( ( rule__FGMSubclause__MappingsetAssignment_2 ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:799:1: ( ( rule__FGMSubclause__MappingsetAssignment_2 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:800:1: ( rule__FGMSubclause__MappingsetAssignment_2 )
            {
             before(grammarAccess.getFGMSubclauseAccess().getMappingsetAssignment_2()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:801:1: ( rule__FGMSubclause__MappingsetAssignment_2 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:801:2: rule__FGMSubclause__MappingsetAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FGMSubclause__MappingsetAssignment_2_in_rule__FGMSubclause__Group__2__Impl1554);
            rule__FGMSubclause__MappingsetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFGMSubclauseAccess().getMappingsetAssignment_2()); 

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
    // $ANTLR end "rule__FGMSubclause__Group__2__Impl"


    // $ANTLR start "rule__FGMSubclause__Group__3"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:811:1: rule__FGMSubclause__Group__3 : rule__FGMSubclause__Group__3__Impl ;
    public final void rule__FGMSubclause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:815:1: ( rule__FGMSubclause__Group__3__Impl )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:816:2: rule__FGMSubclause__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FGMSubclause__Group__3__Impl_in_rule__FGMSubclause__Group__31584);
            rule__FGMSubclause__Group__3__Impl();

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
    // $ANTLR end "rule__FGMSubclause__Group__3"


    // $ANTLR start "rule__FGMSubclause__Group__3__Impl"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:822:1: rule__FGMSubclause__Group__3__Impl : ( KEYWORD_3 ) ;
    public final void rule__FGMSubclause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:826:1: ( ( KEYWORD_3 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:827:1: ( KEYWORD_3 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:827:1: ( KEYWORD_3 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:828:1: KEYWORD_3
            {
             before(grammarAccess.getFGMSubclauseAccess().getSemicolonKeyword_3()); 
            match(input,KEYWORD_3,FollowSets000.FOLLOW_KEYWORD_3_in_rule__FGMSubclause__Group__3__Impl1612); 
             after(grammarAccess.getFGMSubclauseAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__FGMSubclause__Group__3__Impl"


    // $ANTLR start "rule__FeatureMapping__Group__0"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:849:1: rule__FeatureMapping__Group__0 : rule__FeatureMapping__Group__0__Impl rule__FeatureMapping__Group__1 ;
    public final void rule__FeatureMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:853:1: ( rule__FeatureMapping__Group__0__Impl rule__FeatureMapping__Group__1 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:854:2: rule__FeatureMapping__Group__0__Impl rule__FeatureMapping__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMapping__Group__0__Impl_in_rule__FeatureMapping__Group__01651);
            rule__FeatureMapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FeatureMapping__Group__1_in_rule__FeatureMapping__Group__01654);
            rule__FeatureMapping__Group__1();

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
    // $ANTLR end "rule__FeatureMapping__Group__0"


    // $ANTLR start "rule__FeatureMapping__Group__0__Impl"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:861:1: rule__FeatureMapping__Group__0__Impl : ( ( rule__FeatureMapping__LeftAssignment_0 ) ) ;
    public final void rule__FeatureMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:865:1: ( ( ( rule__FeatureMapping__LeftAssignment_0 ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:866:1: ( ( rule__FeatureMapping__LeftAssignment_0 ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:866:1: ( ( rule__FeatureMapping__LeftAssignment_0 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:867:1: ( rule__FeatureMapping__LeftAssignment_0 )
            {
             before(grammarAccess.getFeatureMappingAccess().getLeftAssignment_0()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:868:1: ( rule__FeatureMapping__LeftAssignment_0 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:868:2: rule__FeatureMapping__LeftAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMapping__LeftAssignment_0_in_rule__FeatureMapping__Group__0__Impl1681);
            rule__FeatureMapping__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureMappingAccess().getLeftAssignment_0()); 

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
    // $ANTLR end "rule__FeatureMapping__Group__0__Impl"


    // $ANTLR start "rule__FeatureMapping__Group__1"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:878:1: rule__FeatureMapping__Group__1 : rule__FeatureMapping__Group__1__Impl rule__FeatureMapping__Group__2 ;
    public final void rule__FeatureMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:882:1: ( rule__FeatureMapping__Group__1__Impl rule__FeatureMapping__Group__2 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:883:2: rule__FeatureMapping__Group__1__Impl rule__FeatureMapping__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMapping__Group__1__Impl_in_rule__FeatureMapping__Group__11711);
            rule__FeatureMapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FeatureMapping__Group__2_in_rule__FeatureMapping__Group__11714);
            rule__FeatureMapping__Group__2();

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
    // $ANTLR end "rule__FeatureMapping__Group__1"


    // $ANTLR start "rule__FeatureMapping__Group__1__Impl"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:890:1: rule__FeatureMapping__Group__1__Impl : ( KEYWORD_5 ) ;
    public final void rule__FeatureMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:894:1: ( ( KEYWORD_5 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:895:1: ( KEYWORD_5 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:895:1: ( KEYWORD_5 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:896:1: KEYWORD_5
            {
             before(grammarAccess.getFeatureMappingAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1()); 
            match(input,KEYWORD_5,FollowSets000.FOLLOW_KEYWORD_5_in_rule__FeatureMapping__Group__1__Impl1742); 
             after(grammarAccess.getFeatureMappingAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1()); 

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
    // $ANTLR end "rule__FeatureMapping__Group__1__Impl"


    // $ANTLR start "rule__FeatureMapping__Group__2"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:909:1: rule__FeatureMapping__Group__2 : rule__FeatureMapping__Group__2__Impl rule__FeatureMapping__Group__3 ;
    public final void rule__FeatureMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:913:1: ( rule__FeatureMapping__Group__2__Impl rule__FeatureMapping__Group__3 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:914:2: rule__FeatureMapping__Group__2__Impl rule__FeatureMapping__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMapping__Group__2__Impl_in_rule__FeatureMapping__Group__21773);
            rule__FeatureMapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FeatureMapping__Group__3_in_rule__FeatureMapping__Group__21776);
            rule__FeatureMapping__Group__3();

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
    // $ANTLR end "rule__FeatureMapping__Group__2"


    // $ANTLR start "rule__FeatureMapping__Group__2__Impl"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:921:1: rule__FeatureMapping__Group__2__Impl : ( ( rule__FeatureMapping__RightAssignment_2 ) ) ;
    public final void rule__FeatureMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:925:1: ( ( ( rule__FeatureMapping__RightAssignment_2 ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:926:1: ( ( rule__FeatureMapping__RightAssignment_2 ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:926:1: ( ( rule__FeatureMapping__RightAssignment_2 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:927:1: ( rule__FeatureMapping__RightAssignment_2 )
            {
             before(grammarAccess.getFeatureMappingAccess().getRightAssignment_2()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:928:1: ( rule__FeatureMapping__RightAssignment_2 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:928:2: rule__FeatureMapping__RightAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMapping__RightAssignment_2_in_rule__FeatureMapping__Group__2__Impl1803);
            rule__FeatureMapping__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureMappingAccess().getRightAssignment_2()); 

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
    // $ANTLR end "rule__FeatureMapping__Group__2__Impl"


    // $ANTLR start "rule__FeatureMapping__Group__3"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:938:1: rule__FeatureMapping__Group__3 : rule__FeatureMapping__Group__3__Impl ;
    public final void rule__FeatureMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:942:1: ( rule__FeatureMapping__Group__3__Impl )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:943:2: rule__FeatureMapping__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMapping__Group__3__Impl_in_rule__FeatureMapping__Group__31833);
            rule__FeatureMapping__Group__3__Impl();

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
    // $ANTLR end "rule__FeatureMapping__Group__3"


    // $ANTLR start "rule__FeatureMapping__Group__3__Impl"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:949:1: rule__FeatureMapping__Group__3__Impl : ( KEYWORD_3 ) ;
    public final void rule__FeatureMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:953:1: ( ( KEYWORD_3 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:954:1: ( KEYWORD_3 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:954:1: ( KEYWORD_3 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:955:1: KEYWORD_3
            {
             before(grammarAccess.getFeatureMappingAccess().getSemicolonKeyword_3()); 
            match(input,KEYWORD_3,FollowSets000.FOLLOW_KEYWORD_3_in_rule__FeatureMapping__Group__3__Impl1861); 
             after(grammarAccess.getFeatureMappingAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__FeatureMapping__Group__3__Impl"


    // $ANTLR start "rule__FeaturePath__Group__0"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:976:1: rule__FeaturePath__Group__0 : rule__FeaturePath__Group__0__Impl rule__FeaturePath__Group__1 ;
    public final void rule__FeaturePath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:980:1: ( rule__FeaturePath__Group__0__Impl rule__FeaturePath__Group__1 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:981:2: rule__FeaturePath__Group__0__Impl rule__FeaturePath__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeaturePath__Group__0__Impl_in_rule__FeaturePath__Group__01900);
            rule__FeaturePath__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FeaturePath__Group__1_in_rule__FeaturePath__Group__01903);
            rule__FeaturePath__Group__1();

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
    // $ANTLR end "rule__FeaturePath__Group__0"


    // $ANTLR start "rule__FeaturePath__Group__0__Impl"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:988:1: rule__FeaturePath__Group__0__Impl : ( ( rule__FeaturePath__Group_0__0 ) ) ;
    public final void rule__FeaturePath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:992:1: ( ( ( rule__FeaturePath__Group_0__0 ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:993:1: ( ( rule__FeaturePath__Group_0__0 ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:993:1: ( ( rule__FeaturePath__Group_0__0 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:994:1: ( rule__FeaturePath__Group_0__0 )
            {
             before(grammarAccess.getFeaturePathAccess().getGroup_0()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:995:1: ( rule__FeaturePath__Group_0__0 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:995:2: rule__FeaturePath__Group_0__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeaturePath__Group_0__0_in_rule__FeaturePath__Group__0__Impl1930);
            rule__FeaturePath__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getFeaturePathAccess().getGroup_0()); 

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
    // $ANTLR end "rule__FeaturePath__Group__0__Impl"


    // $ANTLR start "rule__FeaturePath__Group__1"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1005:1: rule__FeaturePath__Group__1 : rule__FeaturePath__Group__1__Impl ;
    public final void rule__FeaturePath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1009:1: ( rule__FeaturePath__Group__1__Impl )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1010:2: rule__FeaturePath__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeaturePath__Group__1__Impl_in_rule__FeaturePath__Group__11960);
            rule__FeaturePath__Group__1__Impl();

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
    // $ANTLR end "rule__FeaturePath__Group__1"


    // $ANTLR start "rule__FeaturePath__Group__1__Impl"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1016:1: rule__FeaturePath__Group__1__Impl : ( ( ( rule__FeaturePath__FeatureReferenceAssignment_1 ) ) ( ( rule__FeaturePath__FeatureReferenceAssignment_1 )* ) ) ;
    public final void rule__FeaturePath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1020:1: ( ( ( ( rule__FeaturePath__FeatureReferenceAssignment_1 ) ) ( ( rule__FeaturePath__FeatureReferenceAssignment_1 )* ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1021:1: ( ( ( rule__FeaturePath__FeatureReferenceAssignment_1 ) ) ( ( rule__FeaturePath__FeatureReferenceAssignment_1 )* ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1021:1: ( ( ( rule__FeaturePath__FeatureReferenceAssignment_1 ) ) ( ( rule__FeaturePath__FeatureReferenceAssignment_1 )* ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1022:1: ( ( rule__FeaturePath__FeatureReferenceAssignment_1 ) ) ( ( rule__FeaturePath__FeatureReferenceAssignment_1 )* )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1022:1: ( ( rule__FeaturePath__FeatureReferenceAssignment_1 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1023:1: ( rule__FeaturePath__FeatureReferenceAssignment_1 )
            {
             before(grammarAccess.getFeaturePathAccess().getFeatureReferenceAssignment_1()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1024:1: ( rule__FeaturePath__FeatureReferenceAssignment_1 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1024:2: rule__FeaturePath__FeatureReferenceAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeaturePath__FeatureReferenceAssignment_1_in_rule__FeaturePath__Group__1__Impl1989);
            rule__FeaturePath__FeatureReferenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeaturePathAccess().getFeatureReferenceAssignment_1()); 

            }

            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1027:1: ( ( rule__FeaturePath__FeatureReferenceAssignment_1 )* )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1028:1: ( rule__FeaturePath__FeatureReferenceAssignment_1 )*
            {
             before(grammarAccess.getFeaturePathAccess().getFeatureReferenceAssignment_1()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1029:1: ( rule__FeaturePath__FeatureReferenceAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1029:2: rule__FeaturePath__FeatureReferenceAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__FeaturePath__FeatureReferenceAssignment_1_in_rule__FeaturePath__Group__1__Impl2001);
            	    rule__FeaturePath__FeatureReferenceAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getFeaturePathAccess().getFeatureReferenceAssignment_1()); 

            }


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
    // $ANTLR end "rule__FeaturePath__Group__1__Impl"


    // $ANTLR start "rule__FeaturePath__Group_0__0"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1044:1: rule__FeaturePath__Group_0__0 : rule__FeaturePath__Group_0__0__Impl rule__FeaturePath__Group_0__1 ;
    public final void rule__FeaturePath__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1048:1: ( rule__FeaturePath__Group_0__0__Impl rule__FeaturePath__Group_0__1 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1049:2: rule__FeaturePath__Group_0__0__Impl rule__FeaturePath__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeaturePath__Group_0__0__Impl_in_rule__FeaturePath__Group_0__02038);
            rule__FeaturePath__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FeaturePath__Group_0__1_in_rule__FeaturePath__Group_0__02041);
            rule__FeaturePath__Group_0__1();

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
    // $ANTLR end "rule__FeaturePath__Group_0__0"


    // $ANTLR start "rule__FeaturePath__Group_0__0__Impl"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1056:1: rule__FeaturePath__Group_0__0__Impl : ( ( rule__FeaturePath__FeatureGroupTypeAssignment_0_0 ) ) ;
    public final void rule__FeaturePath__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1060:1: ( ( ( rule__FeaturePath__FeatureGroupTypeAssignment_0_0 ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1061:1: ( ( rule__FeaturePath__FeatureGroupTypeAssignment_0_0 ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1061:1: ( ( rule__FeaturePath__FeatureGroupTypeAssignment_0_0 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1062:1: ( rule__FeaturePath__FeatureGroupTypeAssignment_0_0 )
            {
             before(grammarAccess.getFeaturePathAccess().getFeatureGroupTypeAssignment_0_0()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1063:1: ( rule__FeaturePath__FeatureGroupTypeAssignment_0_0 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1063:2: rule__FeaturePath__FeatureGroupTypeAssignment_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeaturePath__FeatureGroupTypeAssignment_0_0_in_rule__FeaturePath__Group_0__0__Impl2068);
            rule__FeaturePath__FeatureGroupTypeAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getFeaturePathAccess().getFeatureGroupTypeAssignment_0_0()); 

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
    // $ANTLR end "rule__FeaturePath__Group_0__0__Impl"


    // $ANTLR start "rule__FeaturePath__Group_0__1"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1073:1: rule__FeaturePath__Group_0__1 : rule__FeaturePath__Group_0__1__Impl ;
    public final void rule__FeaturePath__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1077:1: ( rule__FeaturePath__Group_0__1__Impl )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1078:2: rule__FeaturePath__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeaturePath__Group_0__1__Impl_in_rule__FeaturePath__Group_0__12098);
            rule__FeaturePath__Group_0__1__Impl();

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
    // $ANTLR end "rule__FeaturePath__Group_0__1"


    // $ANTLR start "rule__FeaturePath__Group_0__1__Impl"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1084:1: rule__FeaturePath__Group_0__1__Impl : ( KEYWORD_1 ) ;
    public final void rule__FeaturePath__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1088:1: ( ( KEYWORD_1 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1089:1: ( KEYWORD_1 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1089:1: ( KEYWORD_1 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1090:1: KEYWORD_1
            {
             before(grammarAccess.getFeaturePathAccess().getFullStopKeyword_0_1()); 
            match(input,KEYWORD_1,FollowSets000.FOLLOW_KEYWORD_1_in_rule__FeaturePath__Group_0__1__Impl2126); 
             after(grammarAccess.getFeaturePathAccess().getFullStopKeyword_0_1()); 

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
    // $ANTLR end "rule__FeaturePath__Group_0__1__Impl"


    // $ANTLR start "rule__QFGTMREF__Group__0"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1107:1: rule__QFGTMREF__Group__0 : rule__QFGTMREF__Group__0__Impl rule__QFGTMREF__Group__1 ;
    public final void rule__QFGTMREF__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1111:1: ( rule__QFGTMREF__Group__0__Impl rule__QFGTMREF__Group__1 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1112:2: rule__QFGTMREF__Group__0__Impl rule__QFGTMREF__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QFGTMREF__Group__0__Impl_in_rule__QFGTMREF__Group__02161);
            rule__QFGTMREF__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QFGTMREF__Group__1_in_rule__QFGTMREF__Group__02164);
            rule__QFGTMREF__Group__1();

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
    // $ANTLR end "rule__QFGTMREF__Group__0"


    // $ANTLR start "rule__QFGTMREF__Group__0__Impl"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1119:1: rule__QFGTMREF__Group__0__Impl : ( ( rule__QFGTMREF__Group_0__0 )* ) ;
    public final void rule__QFGTMREF__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1123:1: ( ( ( rule__QFGTMREF__Group_0__0 )* ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1124:1: ( ( rule__QFGTMREF__Group_0__0 )* )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1124:1: ( ( rule__QFGTMREF__Group_0__0 )* )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1125:1: ( rule__QFGTMREF__Group_0__0 )*
            {
             before(grammarAccess.getQFGTMREFAccess().getGroup_0()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1126:1: ( rule__QFGTMREF__Group_0__0 )*
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
            	    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1126:2: rule__QFGTMREF__Group_0__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QFGTMREF__Group_0__0_in_rule__QFGTMREF__Group__0__Impl2191);
            	    rule__QFGTMREF__Group_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getQFGTMREFAccess().getGroup_0()); 

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
    // $ANTLR end "rule__QFGTMREF__Group__0__Impl"


    // $ANTLR start "rule__QFGTMREF__Group__1"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1136:1: rule__QFGTMREF__Group__1 : rule__QFGTMREF__Group__1__Impl ;
    public final void rule__QFGTMREF__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1140:1: ( rule__QFGTMREF__Group__1__Impl )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1141:2: rule__QFGTMREF__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QFGTMREF__Group__1__Impl_in_rule__QFGTMREF__Group__12222);
            rule__QFGTMREF__Group__1__Impl();

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
    // $ANTLR end "rule__QFGTMREF__Group__1"


    // $ANTLR start "rule__QFGTMREF__Group__1__Impl"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1147:1: rule__QFGTMREF__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__QFGTMREF__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1151:1: ( ( RULE_ID ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1152:1: ( RULE_ID )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1152:1: ( RULE_ID )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1153:1: RULE_ID
            {
             before(grammarAccess.getQFGTMREFAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QFGTMREF__Group__1__Impl2249); 
             after(grammarAccess.getQFGTMREFAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__QFGTMREF__Group__1__Impl"


    // $ANTLR start "rule__QFGTMREF__Group_0__0"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1168:1: rule__QFGTMREF__Group_0__0 : rule__QFGTMREF__Group_0__0__Impl rule__QFGTMREF__Group_0__1 ;
    public final void rule__QFGTMREF__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1172:1: ( rule__QFGTMREF__Group_0__0__Impl rule__QFGTMREF__Group_0__1 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1173:2: rule__QFGTMREF__Group_0__0__Impl rule__QFGTMREF__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QFGTMREF__Group_0__0__Impl_in_rule__QFGTMREF__Group_0__02282);
            rule__QFGTMREF__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QFGTMREF__Group_0__1_in_rule__QFGTMREF__Group_0__02285);
            rule__QFGTMREF__Group_0__1();

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
    // $ANTLR end "rule__QFGTMREF__Group_0__0"


    // $ANTLR start "rule__QFGTMREF__Group_0__0__Impl"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1180:1: rule__QFGTMREF__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__QFGTMREF__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1184:1: ( ( RULE_ID ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1185:1: ( RULE_ID )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1185:1: ( RULE_ID )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1186:1: RULE_ID
            {
             before(grammarAccess.getQFGTMREFAccess().getIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QFGTMREF__Group_0__0__Impl2312); 
             after(grammarAccess.getQFGTMREFAccess().getIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__QFGTMREF__Group_0__0__Impl"


    // $ANTLR start "rule__QFGTMREF__Group_0__1"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1197:1: rule__QFGTMREF__Group_0__1 : rule__QFGTMREF__Group_0__1__Impl ;
    public final void rule__QFGTMREF__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1201:1: ( rule__QFGTMREF__Group_0__1__Impl )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1202:2: rule__QFGTMREF__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QFGTMREF__Group_0__1__Impl_in_rule__QFGTMREF__Group_0__12341);
            rule__QFGTMREF__Group_0__1__Impl();

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
    // $ANTLR end "rule__QFGTMREF__Group_0__1"


    // $ANTLR start "rule__QFGTMREF__Group_0__1__Impl"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1208:1: rule__QFGTMREF__Group_0__1__Impl : ( KEYWORD_4 ) ;
    public final void rule__QFGTMREF__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1212:1: ( ( KEYWORD_4 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1213:1: ( KEYWORD_4 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1213:1: ( KEYWORD_4 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1214:1: KEYWORD_4
            {
             before(grammarAccess.getQFGTMREFAccess().getColonColonKeyword_0_1()); 
            match(input,KEYWORD_4,FollowSets000.FOLLOW_KEYWORD_4_in_rule__QFGTMREF__Group_0__1__Impl2369); 
             after(grammarAccess.getQFGTMREFAccess().getColonColonKeyword_0_1()); 

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
    // $ANTLR end "rule__QFGTMREF__Group_0__1__Impl"


    // $ANTLR start "rule__FGMGrammarRoot__FgmlAssignment_0_1"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1232:1: rule__FGMGrammarRoot__FgmlAssignment_0_1 : ( ruleFGMLibrary ) ;
    public final void rule__FGMGrammarRoot__FgmlAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1236:1: ( ( ruleFGMLibrary ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1237:1: ( ruleFGMLibrary )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1237:1: ( ruleFGMLibrary )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1238:1: ruleFGMLibrary
            {
             before(grammarAccess.getFGMGrammarRootAccess().getFgmlFGMLibraryParserRuleCall_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFGMLibrary_in_rule__FGMGrammarRoot__FgmlAssignment_0_12409);
            ruleFGMLibrary();

            state._fsp--;

             after(grammarAccess.getFGMGrammarRootAccess().getFgmlFGMLibraryParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__FGMGrammarRoot__FgmlAssignment_0_1"


    // $ANTLR start "rule__FGMGrammarRoot__FgmscAssignment_1"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1247:1: rule__FGMGrammarRoot__FgmscAssignment_1 : ( ruleFGMSubclause ) ;
    public final void rule__FGMGrammarRoot__FgmscAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1251:1: ( ( ruleFGMSubclause ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1252:1: ( ruleFGMSubclause )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1252:1: ( ruleFGMSubclause )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1253:1: ruleFGMSubclause
            {
             before(grammarAccess.getFGMGrammarRootAccess().getFgmscFGMSubclauseParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFGMSubclause_in_rule__FGMGrammarRoot__FgmscAssignment_12440);
            ruleFGMSubclause();

            state._fsp--;

             after(grammarAccess.getFGMGrammarRootAccess().getFgmscFGMSubclauseParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__FGMGrammarRoot__FgmscAssignment_1"


    // $ANTLR start "rule__FGMLibrary__FeaturemappingsetAssignment"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1262:1: rule__FGMLibrary__FeaturemappingsetAssignment : ( ruleFeatureMappingset ) ;
    public final void rule__FGMLibrary__FeaturemappingsetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1266:1: ( ( ruleFeatureMappingset ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1267:1: ( ruleFeatureMappingset )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1267:1: ( ruleFeatureMappingset )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1268:1: ruleFeatureMappingset
            {
             before(grammarAccess.getFGMLibraryAccess().getFeaturemappingsetFeatureMappingsetParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeatureMappingset_in_rule__FGMLibrary__FeaturemappingsetAssignment2471);
            ruleFeatureMappingset();

            state._fsp--;

             after(grammarAccess.getFGMLibraryAccess().getFeaturemappingsetFeatureMappingsetParserRuleCall_0()); 

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
    // $ANTLR end "rule__FGMLibrary__FeaturemappingsetAssignment"


    // $ANTLR start "rule__FeatureMappingset__NameAssignment_0"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1277:1: rule__FeatureMappingset__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FeatureMappingset__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1281:1: ( ( RULE_ID ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1282:1: ( RULE_ID )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1282:1: ( RULE_ID )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1283:1: RULE_ID
            {
             before(grammarAccess.getFeatureMappingsetAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__FeatureMappingset__NameAssignment_02502); 
             after(grammarAccess.getFeatureMappingsetAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__FeatureMappingset__NameAssignment_0"


    // $ANTLR start "rule__FeatureMappingset__MappingsetAssignment_3_1"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1292:1: rule__FeatureMappingset__MappingsetAssignment_3_1 : ( ( ruleQFGTMREF ) ) ;
    public final void rule__FeatureMappingset__MappingsetAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1296:1: ( ( ( ruleQFGTMREF ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1297:1: ( ( ruleQFGTMREF ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1297:1: ( ( ruleQFGTMREF ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1298:1: ( ruleQFGTMREF )
            {
             before(grammarAccess.getFeatureMappingsetAccess().getMappingsetFeatureMappingsetCrossReference_3_1_0()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1299:1: ( ruleQFGTMREF )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1300:1: ruleQFGTMREF
            {
             before(grammarAccess.getFeatureMappingsetAccess().getMappingsetFeatureMappingsetQFGTMREFParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQFGTMREF_in_rule__FeatureMappingset__MappingsetAssignment_3_12537);
            ruleQFGTMREF();

            state._fsp--;

             after(grammarAccess.getFeatureMappingsetAccess().getMappingsetFeatureMappingsetQFGTMREFParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getFeatureMappingsetAccess().getMappingsetFeatureMappingsetCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__FeatureMappingset__MappingsetAssignment_3_1"


    // $ANTLR start "rule__FeatureMappingset__MappingAssignment_4"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1311:1: rule__FeatureMappingset__MappingAssignment_4 : ( ruleFeatureMapping ) ;
    public final void rule__FeatureMappingset__MappingAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1315:1: ( ( ruleFeatureMapping ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1316:1: ( ruleFeatureMapping )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1316:1: ( ruleFeatureMapping )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1317:1: ruleFeatureMapping
            {
             before(grammarAccess.getFeatureMappingsetAccess().getMappingFeatureMappingParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeatureMapping_in_rule__FeatureMappingset__MappingAssignment_42572);
            ruleFeatureMapping();

            state._fsp--;

             after(grammarAccess.getFeatureMappingsetAccess().getMappingFeatureMappingParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__FeatureMappingset__MappingAssignment_4"


    // $ANTLR start "rule__FGMSubclause__MappingsetAssignment_2"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1326:1: rule__FGMSubclause__MappingsetAssignment_2 : ( ( ruleQFGTMREF ) ) ;
    public final void rule__FGMSubclause__MappingsetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1330:1: ( ( ( ruleQFGTMREF ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1331:1: ( ( ruleQFGTMREF ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1331:1: ( ( ruleQFGTMREF ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1332:1: ( ruleQFGTMREF )
            {
             before(grammarAccess.getFGMSubclauseAccess().getMappingsetFeatureMappingsetCrossReference_2_0()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1333:1: ( ruleQFGTMREF )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1334:1: ruleQFGTMREF
            {
             before(grammarAccess.getFGMSubclauseAccess().getMappingsetFeatureMappingsetQFGTMREFParserRuleCall_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQFGTMREF_in_rule__FGMSubclause__MappingsetAssignment_22607);
            ruleQFGTMREF();

            state._fsp--;

             after(grammarAccess.getFGMSubclauseAccess().getMappingsetFeatureMappingsetQFGTMREFParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getFGMSubclauseAccess().getMappingsetFeatureMappingsetCrossReference_2_0()); 

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
    // $ANTLR end "rule__FGMSubclause__MappingsetAssignment_2"


    // $ANTLR start "rule__FeatureMapping__LeftAssignment_0"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1345:1: rule__FeatureMapping__LeftAssignment_0 : ( ruleFeaturePath ) ;
    public final void rule__FeatureMapping__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1349:1: ( ( ruleFeaturePath ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1350:1: ( ruleFeaturePath )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1350:1: ( ruleFeaturePath )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1351:1: ruleFeaturePath
            {
             before(grammarAccess.getFeatureMappingAccess().getLeftFeaturePathParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeaturePath_in_rule__FeatureMapping__LeftAssignment_02642);
            ruleFeaturePath();

            state._fsp--;

             after(grammarAccess.getFeatureMappingAccess().getLeftFeaturePathParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__FeatureMapping__LeftAssignment_0"


    // $ANTLR start "rule__FeatureMapping__RightAssignment_2"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1360:1: rule__FeatureMapping__RightAssignment_2 : ( ruleFeaturePath ) ;
    public final void rule__FeatureMapping__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1364:1: ( ( ruleFeaturePath ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1365:1: ( ruleFeaturePath )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1365:1: ( ruleFeaturePath )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1366:1: ruleFeaturePath
            {
             before(grammarAccess.getFeatureMappingAccess().getRightFeaturePathParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeaturePath_in_rule__FeatureMapping__RightAssignment_22673);
            ruleFeaturePath();

            state._fsp--;

             after(grammarAccess.getFeatureMappingAccess().getRightFeaturePathParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__FeatureMapping__RightAssignment_2"


    // $ANTLR start "rule__FeaturePath__FeatureGroupTypeAssignment_0_0"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1375:1: rule__FeaturePath__FeatureGroupTypeAssignment_0_0 : ( ( ruleQFGTMREF ) ) ;
    public final void rule__FeaturePath__FeatureGroupTypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1379:1: ( ( ( ruleQFGTMREF ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1380:1: ( ( ruleQFGTMREF ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1380:1: ( ( ruleQFGTMREF ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1381:1: ( ruleQFGTMREF )
            {
             before(grammarAccess.getFeaturePathAccess().getFeatureGroupTypeFeatureGroupTypeCrossReference_0_0_0()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1382:1: ( ruleQFGTMREF )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1383:1: ruleQFGTMREF
            {
             before(grammarAccess.getFeaturePathAccess().getFeatureGroupTypeFeatureGroupTypeQFGTMREFParserRuleCall_0_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQFGTMREF_in_rule__FeaturePath__FeatureGroupTypeAssignment_0_02708);
            ruleQFGTMREF();

            state._fsp--;

             after(grammarAccess.getFeaturePathAccess().getFeatureGroupTypeFeatureGroupTypeQFGTMREFParserRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getFeaturePathAccess().getFeatureGroupTypeFeatureGroupTypeCrossReference_0_0_0()); 

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
    // $ANTLR end "rule__FeaturePath__FeatureGroupTypeAssignment_0_0"


    // $ANTLR start "rule__FeaturePath__FeatureReferenceAssignment_1"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1394:1: rule__FeaturePath__FeatureReferenceAssignment_1 : ( ruleFeatureReference ) ;
    public final void rule__FeaturePath__FeatureReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1398:1: ( ( ruleFeatureReference ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1399:1: ( ruleFeatureReference )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1399:1: ( ruleFeatureReference )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1400:1: ruleFeatureReference
            {
             before(grammarAccess.getFeaturePathAccess().getFeatureReferenceFeatureReferenceParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeatureReference_in_rule__FeaturePath__FeatureReferenceAssignment_12743);
            ruleFeatureReference();

            state._fsp--;

             after(grammarAccess.getFeaturePathAccess().getFeatureReferenceFeatureReferenceParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__FeaturePath__FeatureReferenceAssignment_1"


    // $ANTLR start "rule__FeatureReference__FeatureAssignment"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1409:1: rule__FeatureReference__FeatureAssignment : ( ( RULE_ID ) ) ;
    public final void rule__FeatureReference__FeatureAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1413:1: ( ( ( RULE_ID ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1414:1: ( ( RULE_ID ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1414:1: ( ( RULE_ID ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1415:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureReferenceAccess().getFeatureFeatureCrossReference_0()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1416:1: ( RULE_ID )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1417:1: RULE_ID
            {
             before(grammarAccess.getFeatureReferenceAccess().getFeatureFeatureIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__FeatureReference__FeatureAssignment2778); 
             after(grammarAccess.getFeatureReferenceAccess().getFeatureFeatureIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getFeatureReferenceAccess().getFeatureFeatureCrossReference_0()); 

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
    // $ANTLR end "rule__FeatureReference__FeatureAssignment"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleFGMGrammarRoot_in_entryRuleFGMGrammarRoot54 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFGMGrammarRoot61 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FGMGrammarRoot__Alternatives_in_ruleFGMGrammarRoot91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFGMLibrary_in_entryRuleFGMLibrary118 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFGMLibrary125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FGMLibrary__FeaturemappingsetAssignment_in_ruleFGMLibrary157 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__FGMLibrary__FeaturemappingsetAssignment_in_ruleFGMLibrary169 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_ruleFeatureMappingset_in_entryRuleFeatureMappingset199 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeatureMappingset206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group__0_in_ruleFeatureMappingset236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFGMSubclause_in_entryRuleFGMSubclause263 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFGMSubclause270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FGMSubclause__Group__0_in_ruleFGMSubclause300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeatureMapping_in_entryRuleFeatureMapping335 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeatureMapping342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMapping__Group__0_in_ruleFeatureMapping372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeaturePath_in_entryRuleFeaturePath399 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeaturePath406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeaturePath__Group__0_in_ruleFeaturePath436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeatureReference_in_entryRuleFeatureReference463 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeatureReference470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureReference__FeatureAssignment_in_ruleFeatureReference500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQFGTMREF_in_entryRuleQFGTMREF527 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQFGTMREF534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QFGTMREF__Group__0_in_ruleQFGTMREF564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FGMGrammarRoot__Group_0__0_in_rule__FGMGrammarRoot__Alternatives600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FGMGrammarRoot__FgmscAssignment_1_in_rule__FGMGrammarRoot__Alternatives618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FGMGrammarRoot__Group_0__0__Impl_in_rule__FGMGrammarRoot__Group_0__0650 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__FGMGrammarRoot__Group_0__1_in_rule__FGMGrammarRoot__Group_0__0653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_9_in_rule__FGMGrammarRoot__Group_0__0__Impl681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FGMGrammarRoot__Group_0__1__Impl_in_rule__FGMGrammarRoot__Group_0__1712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FGMGrammarRoot__FgmlAssignment_0_1_in_rule__FGMGrammarRoot__Group_0__1__Impl739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group__0__Impl_in_rule__FeatureMappingset__Group__0773 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group__1_in_rule__FeatureMappingset__Group__0776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__NameAssignment_0_in_rule__FeatureMappingset__Group__0__Impl803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group__1__Impl_in_rule__FeatureMappingset__Group__1833 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group__2_in_rule__FeatureMappingset__Group__1836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_2_in_rule__FeatureMappingset__Group__1__Impl864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group__2__Impl_in_rule__FeatureMappingset__Group__2895 = new BitSet(new long[]{0x0000000000008020L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group__3_in_rule__FeatureMappingset__Group__2898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_10_in_rule__FeatureMappingset__Group__2__Impl926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group__3__Impl_in_rule__FeatureMappingset__Group__3957 = new BitSet(new long[]{0x0000000000008020L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group__4_in_rule__FeatureMappingset__Group__3960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group_3__0_in_rule__FeatureMappingset__Group__3__Impl987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group__4__Impl_in_rule__FeatureMappingset__Group__41018 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group__5_in_rule__FeatureMappingset__Group__41021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__MappingAssignment_4_in_rule__FeatureMappingset__Group__4__Impl1048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group__5__Impl_in_rule__FeatureMappingset__Group__51078 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group__6_in_rule__FeatureMappingset__Group__51081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_6_in_rule__FeatureMappingset__Group__5__Impl1109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group__6__Impl_in_rule__FeatureMappingset__Group__61140 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group__7_in_rule__FeatureMappingset__Group__61143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_10_in_rule__FeatureMappingset__Group__6__Impl1171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group__7__Impl_in_rule__FeatureMappingset__Group__71202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_3_in_rule__FeatureMappingset__Group__7__Impl1230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group_3__0__Impl_in_rule__FeatureMappingset__Group_3__01277 = new BitSet(new long[]{0x0000000000008020L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group_3__1_in_rule__FeatureMappingset__Group_3__01280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_8_in_rule__FeatureMappingset__Group_3__0__Impl1308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group_3__1__Impl_in_rule__FeatureMappingset__Group_3__11339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__MappingsetAssignment_3_1_in_rule__FeatureMappingset__Group_3__1__Impl1366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FGMSubclause__Group__0__Impl_in_rule__FGMSubclause__Group__01400 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__FGMSubclause__Group__1_in_rule__FGMSubclause__Group__01403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_7_in_rule__FGMSubclause__Group__0__Impl1431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FGMSubclause__Group__1__Impl_in_rule__FGMSubclause__Group__11462 = new BitSet(new long[]{0x0000000000008020L});
        public static final BitSet FOLLOW_rule__FGMSubclause__Group__2_in_rule__FGMSubclause__Group__11465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_10_in_rule__FGMSubclause__Group__1__Impl1493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FGMSubclause__Group__2__Impl_in_rule__FGMSubclause__Group__21524 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__FGMSubclause__Group__3_in_rule__FGMSubclause__Group__21527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FGMSubclause__MappingsetAssignment_2_in_rule__FGMSubclause__Group__2__Impl1554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FGMSubclause__Group__3__Impl_in_rule__FGMSubclause__Group__31584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_3_in_rule__FGMSubclause__Group__3__Impl1612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMapping__Group__0__Impl_in_rule__FeatureMapping__Group__01651 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rule__FeatureMapping__Group__1_in_rule__FeatureMapping__Group__01654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMapping__LeftAssignment_0_in_rule__FeatureMapping__Group__0__Impl1681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMapping__Group__1__Impl_in_rule__FeatureMapping__Group__11711 = new BitSet(new long[]{0x0000000000008020L});
        public static final BitSet FOLLOW_rule__FeatureMapping__Group__2_in_rule__FeatureMapping__Group__11714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_5_in_rule__FeatureMapping__Group__1__Impl1742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMapping__Group__2__Impl_in_rule__FeatureMapping__Group__21773 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__FeatureMapping__Group__3_in_rule__FeatureMapping__Group__21776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMapping__RightAssignment_2_in_rule__FeatureMapping__Group__2__Impl1803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMapping__Group__3__Impl_in_rule__FeatureMapping__Group__31833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_3_in_rule__FeatureMapping__Group__3__Impl1861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeaturePath__Group__0__Impl_in_rule__FeaturePath__Group__01900 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__FeaturePath__Group__1_in_rule__FeaturePath__Group__01903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeaturePath__Group_0__0_in_rule__FeaturePath__Group__0__Impl1930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeaturePath__Group__1__Impl_in_rule__FeaturePath__Group__11960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeaturePath__FeatureReferenceAssignment_1_in_rule__FeaturePath__Group__1__Impl1989 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__FeaturePath__FeatureReferenceAssignment_1_in_rule__FeaturePath__Group__1__Impl2001 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__FeaturePath__Group_0__0__Impl_in_rule__FeaturePath__Group_0__02038 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__FeaturePath__Group_0__1_in_rule__FeaturePath__Group_0__02041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeaturePath__FeatureGroupTypeAssignment_0_0_in_rule__FeaturePath__Group_0__0__Impl2068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeaturePath__Group_0__1__Impl_in_rule__FeaturePath__Group_0__12098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_1_in_rule__FeaturePath__Group_0__1__Impl2126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QFGTMREF__Group__0__Impl_in_rule__QFGTMREF__Group__02161 = new BitSet(new long[]{0x0000000000008020L});
        public static final BitSet FOLLOW_rule__QFGTMREF__Group__1_in_rule__QFGTMREF__Group__02164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QFGTMREF__Group_0__0_in_rule__QFGTMREF__Group__0__Impl2191 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__QFGTMREF__Group__1__Impl_in_rule__QFGTMREF__Group__12222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QFGTMREF__Group__1__Impl2249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QFGTMREF__Group_0__0__Impl_in_rule__QFGTMREF__Group_0__02282 = new BitSet(new long[]{0x0000000000000400L});
        public static final BitSet FOLLOW_rule__QFGTMREF__Group_0__1_in_rule__QFGTMREF__Group_0__02285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QFGTMREF__Group_0__0__Impl2312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QFGTMREF__Group_0__1__Impl_in_rule__QFGTMREF__Group_0__12341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_4_in_rule__QFGTMREF__Group_0__1__Impl2369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFGMLibrary_in_rule__FGMGrammarRoot__FgmlAssignment_0_12409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFGMSubclause_in_rule__FGMGrammarRoot__FgmscAssignment_12440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeatureMappingset_in_rule__FGMLibrary__FeaturemappingsetAssignment2471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__FeatureMappingset__NameAssignment_02502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQFGTMREF_in_rule__FeatureMappingset__MappingsetAssignment_3_12537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeatureMapping_in_rule__FeatureMappingset__MappingAssignment_42572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQFGTMREF_in_rule__FGMSubclause__MappingsetAssignment_22607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeaturePath_in_rule__FeatureMapping__LeftAssignment_02642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeaturePath_in_rule__FeatureMapping__RightAssignment_22673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQFGTMREF_in_rule__FeaturePath__FeatureGroupTypeAssignment_0_02708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeatureReference_in_rule__FeaturePath__FeatureReferenceAssignment_12743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__FeatureReference__FeatureAssignment2778 = new BitSet(new long[]{0x0000000000000002L});
    }


}