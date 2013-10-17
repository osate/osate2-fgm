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
    public String getGrammarFileName() { return "../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g"; }


     
     	private FeatureGroupMappingGrammarAccess grammarAccess;
     	
     	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
     	
     	{
    		tokenNameToValue.put("KEYWORD_1", "'.'");
    		tokenNameToValue.put("KEYWORD_2", "';'");
    		tokenNameToValue.put("KEYWORD_3", "'::'");
    		tokenNameToValue.put("KEYWORD_4", "'<=>'");
    		tokenNameToValue.put("KEYWORD_5", "'end'");
    		tokenNameToValue.put("KEYWORD_6", "'use'");
    		tokenNameToValue.put("KEYWORD_7", "'extends'");
    		tokenNameToValue.put("KEYWORD_8", "'library'");
    		tokenNameToValue.put("KEYWORD_9", "'mappings'");
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:72:1: entryRuleFGMGrammarRoot : ruleFGMGrammarRoot EOF ;
    public final void entryRuleFGMGrammarRoot() throws RecognitionException {
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:73:1: ( ruleFGMGrammarRoot EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:74:1: ruleFGMGrammarRoot EOF
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:81:1: ruleFGMGrammarRoot : ( ( rule__FGMGrammarRoot__Alternatives ) ) ;
    public final void ruleFGMGrammarRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:85:5: ( ( ( rule__FGMGrammarRoot__Alternatives ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:86:1: ( ( rule__FGMGrammarRoot__Alternatives ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:86:1: ( ( rule__FGMGrammarRoot__Alternatives ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:87:1: ( rule__FGMGrammarRoot__Alternatives )
            {
             before(grammarAccess.getFGMGrammarRootAccess().getAlternatives()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:88:1: ( rule__FGMGrammarRoot__Alternatives )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:88:2: rule__FGMGrammarRoot__Alternatives
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:100:1: entryRuleFGMLibrary : ruleFGMLibrary EOF ;
    public final void entryRuleFGMLibrary() throws RecognitionException {
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:101:1: ( ruleFGMLibrary EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:102:1: ruleFGMLibrary EOF
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:109:1: ruleFGMLibrary : ( ( ( rule__FGMLibrary__FeaturemappingsetAssignment ) ) ( ( rule__FGMLibrary__FeaturemappingsetAssignment )* ) ) ;
    public final void ruleFGMLibrary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:113:5: ( ( ( ( rule__FGMLibrary__FeaturemappingsetAssignment ) ) ( ( rule__FGMLibrary__FeaturemappingsetAssignment )* ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:114:1: ( ( ( rule__FGMLibrary__FeaturemappingsetAssignment ) ) ( ( rule__FGMLibrary__FeaturemappingsetAssignment )* ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:114:1: ( ( ( rule__FGMLibrary__FeaturemappingsetAssignment ) ) ( ( rule__FGMLibrary__FeaturemappingsetAssignment )* ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:115:1: ( ( rule__FGMLibrary__FeaturemappingsetAssignment ) ) ( ( rule__FGMLibrary__FeaturemappingsetAssignment )* )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:115:1: ( ( rule__FGMLibrary__FeaturemappingsetAssignment ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:116:1: ( rule__FGMLibrary__FeaturemappingsetAssignment )
            {
             before(grammarAccess.getFGMLibraryAccess().getFeaturemappingsetAssignment()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:117:1: ( rule__FGMLibrary__FeaturemappingsetAssignment )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:117:2: rule__FGMLibrary__FeaturemappingsetAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__FGMLibrary__FeaturemappingsetAssignment_in_ruleFGMLibrary157);
            rule__FGMLibrary__FeaturemappingsetAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFGMLibraryAccess().getFeaturemappingsetAssignment()); 

            }

            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:120:1: ( ( rule__FGMLibrary__FeaturemappingsetAssignment )* )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:121:1: ( rule__FGMLibrary__FeaturemappingsetAssignment )*
            {
             before(grammarAccess.getFGMLibraryAccess().getFeaturemappingsetAssignment()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:122:1: ( rule__FGMLibrary__FeaturemappingsetAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==KEYWORD_9) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:122:2: rule__FGMLibrary__FeaturemappingsetAssignment
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:135:1: entryRuleFeatureMappingset : ruleFeatureMappingset EOF ;
    public final void entryRuleFeatureMappingset() throws RecognitionException {
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:136:1: ( ruleFeatureMappingset EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:137:1: ruleFeatureMappingset EOF
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:144:1: ruleFeatureMappingset : ( ( rule__FeatureMappingset__Group__0 ) ) ;
    public final void ruleFeatureMappingset() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:148:5: ( ( ( rule__FeatureMappingset__Group__0 ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:149:1: ( ( rule__FeatureMappingset__Group__0 ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:149:1: ( ( rule__FeatureMappingset__Group__0 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:150:1: ( rule__FeatureMappingset__Group__0 )
            {
             before(grammarAccess.getFeatureMappingsetAccess().getGroup()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:151:1: ( rule__FeatureMappingset__Group__0 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:151:2: rule__FeatureMappingset__Group__0
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:163:1: entryRuleFGMSubclause : ruleFGMSubclause EOF ;
    public final void entryRuleFGMSubclause() throws RecognitionException {
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:164:1: ( ruleFGMSubclause EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:165:1: ruleFGMSubclause EOF
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:172:1: ruleFGMSubclause : ( ( rule__FGMSubclause__Group__0 ) ) ;
    public final void ruleFGMSubclause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:176:5: ( ( ( rule__FGMSubclause__Group__0 ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:177:1: ( ( rule__FGMSubclause__Group__0 ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:177:1: ( ( rule__FGMSubclause__Group__0 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:178:1: ( rule__FGMSubclause__Group__0 )
            {
             before(grammarAccess.getFGMSubclauseAccess().getGroup()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:179:1: ( rule__FGMSubclause__Group__0 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:179:2: rule__FGMSubclause__Group__0
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:199:1: entryRuleFeatureMapping : ruleFeatureMapping EOF ;
    public final void entryRuleFeatureMapping() throws RecognitionException {
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:200:1: ( ruleFeatureMapping EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:201:1: ruleFeatureMapping EOF
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:208:1: ruleFeatureMapping : ( ( rule__FeatureMapping__Group__0 ) ) ;
    public final void ruleFeatureMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:212:5: ( ( ( rule__FeatureMapping__Group__0 ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:213:1: ( ( rule__FeatureMapping__Group__0 ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:213:1: ( ( rule__FeatureMapping__Group__0 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:214:1: ( rule__FeatureMapping__Group__0 )
            {
             before(grammarAccess.getFeatureMappingAccess().getGroup()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:215:1: ( rule__FeatureMapping__Group__0 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:215:2: rule__FeatureMapping__Group__0
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:227:1: entryRuleFeaturePath : ruleFeaturePath EOF ;
    public final void entryRuleFeaturePath() throws RecognitionException {
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:228:1: ( ruleFeaturePath EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:229:1: ruleFeaturePath EOF
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:236:1: ruleFeaturePath : ( ( rule__FeaturePath__Group__0 ) ) ;
    public final void ruleFeaturePath() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:240:5: ( ( ( rule__FeaturePath__Group__0 ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:241:1: ( ( rule__FeaturePath__Group__0 ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:241:1: ( ( rule__FeaturePath__Group__0 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:242:1: ( rule__FeaturePath__Group__0 )
            {
             before(grammarAccess.getFeaturePathAccess().getGroup()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:243:1: ( rule__FeaturePath__Group__0 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:243:2: rule__FeaturePath__Group__0
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:255:1: entryRuleFeatureReference : ruleFeatureReference EOF ;
    public final void entryRuleFeatureReference() throws RecognitionException {
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:256:1: ( ruleFeatureReference EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:257:1: ruleFeatureReference EOF
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:264:1: ruleFeatureReference : ( ( rule__FeatureReference__FeatureAssignment ) ) ;
    public final void ruleFeatureReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:268:5: ( ( ( rule__FeatureReference__FeatureAssignment ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:269:1: ( ( rule__FeatureReference__FeatureAssignment ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:269:1: ( ( rule__FeatureReference__FeatureAssignment ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:270:1: ( rule__FeatureReference__FeatureAssignment )
            {
             before(grammarAccess.getFeatureReferenceAccess().getFeatureAssignment()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:271:1: ( rule__FeatureReference__FeatureAssignment )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:271:2: rule__FeatureReference__FeatureAssignment
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:283:1: entryRuleQFGTMREF : ruleQFGTMREF EOF ;
    public final void entryRuleQFGTMREF() throws RecognitionException {
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:284:1: ( ruleQFGTMREF EOF )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:285:1: ruleQFGTMREF EOF
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:292:1: ruleQFGTMREF : ( ( rule__QFGTMREF__Group__0 ) ) ;
    public final void ruleQFGTMREF() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:296:5: ( ( ( rule__QFGTMREF__Group__0 ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:297:1: ( ( rule__QFGTMREF__Group__0 ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:297:1: ( ( rule__QFGTMREF__Group__0 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:298:1: ( rule__QFGTMREF__Group__0 )
            {
             before(grammarAccess.getQFGTMREFAccess().getGroup()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:299:1: ( rule__QFGTMREF__Group__0 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:299:2: rule__QFGTMREF__Group__0
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:311:1: rule__FGMGrammarRoot__Alternatives : ( ( ( rule__FGMGrammarRoot__Group_0__0 ) ) | ( ( rule__FGMGrammarRoot__FgmscAssignment_1 ) ) );
    public final void rule__FGMGrammarRoot__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:315:1: ( ( ( rule__FGMGrammarRoot__Group_0__0 ) ) | ( ( rule__FGMGrammarRoot__FgmscAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==KEYWORD_8) ) {
                alt2=1;
            }
            else if ( (LA2_0==KEYWORD_6) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:316:1: ( ( rule__FGMGrammarRoot__Group_0__0 ) )
                    {
                    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:316:1: ( ( rule__FGMGrammarRoot__Group_0__0 ) )
                    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:317:1: ( rule__FGMGrammarRoot__Group_0__0 )
                    {
                     before(grammarAccess.getFGMGrammarRootAccess().getGroup_0()); 
                    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:318:1: ( rule__FGMGrammarRoot__Group_0__0 )
                    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:318:2: rule__FGMGrammarRoot__Group_0__0
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
                    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:322:6: ( ( rule__FGMGrammarRoot__FgmscAssignment_1 ) )
                    {
                    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:322:6: ( ( rule__FGMGrammarRoot__FgmscAssignment_1 ) )
                    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:323:1: ( rule__FGMGrammarRoot__FgmscAssignment_1 )
                    {
                     before(grammarAccess.getFGMGrammarRootAccess().getFgmscAssignment_1()); 
                    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:324:1: ( rule__FGMGrammarRoot__FgmscAssignment_1 )
                    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:324:2: rule__FGMGrammarRoot__FgmscAssignment_1
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:336:1: rule__FGMGrammarRoot__Group_0__0 : rule__FGMGrammarRoot__Group_0__0__Impl rule__FGMGrammarRoot__Group_0__1 ;
    public final void rule__FGMGrammarRoot__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:340:1: ( rule__FGMGrammarRoot__Group_0__0__Impl rule__FGMGrammarRoot__Group_0__1 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:341:2: rule__FGMGrammarRoot__Group_0__0__Impl rule__FGMGrammarRoot__Group_0__1
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:348:1: rule__FGMGrammarRoot__Group_0__0__Impl : ( KEYWORD_8 ) ;
    public final void rule__FGMGrammarRoot__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:352:1: ( ( KEYWORD_8 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:353:1: ( KEYWORD_8 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:353:1: ( KEYWORD_8 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:354:1: KEYWORD_8
            {
             before(grammarAccess.getFGMGrammarRootAccess().getLibraryKeyword_0_0()); 
            match(input,KEYWORD_8,FollowSets000.FOLLOW_KEYWORD_8_in_rule__FGMGrammarRoot__Group_0__0__Impl681); 
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:367:1: rule__FGMGrammarRoot__Group_0__1 : rule__FGMGrammarRoot__Group_0__1__Impl ;
    public final void rule__FGMGrammarRoot__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:371:1: ( rule__FGMGrammarRoot__Group_0__1__Impl )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:372:2: rule__FGMGrammarRoot__Group_0__1__Impl
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:378:1: rule__FGMGrammarRoot__Group_0__1__Impl : ( ( rule__FGMGrammarRoot__FgmlAssignment_0_1 ) ) ;
    public final void rule__FGMGrammarRoot__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:382:1: ( ( ( rule__FGMGrammarRoot__FgmlAssignment_0_1 ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:383:1: ( ( rule__FGMGrammarRoot__FgmlAssignment_0_1 ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:383:1: ( ( rule__FGMGrammarRoot__FgmlAssignment_0_1 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:384:1: ( rule__FGMGrammarRoot__FgmlAssignment_0_1 )
            {
             before(grammarAccess.getFGMGrammarRootAccess().getFgmlAssignment_0_1()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:385:1: ( rule__FGMGrammarRoot__FgmlAssignment_0_1 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:385:2: rule__FGMGrammarRoot__FgmlAssignment_0_1
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:399:1: rule__FeatureMappingset__Group__0 : rule__FeatureMappingset__Group__0__Impl rule__FeatureMappingset__Group__1 ;
    public final void rule__FeatureMappingset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:403:1: ( rule__FeatureMappingset__Group__0__Impl rule__FeatureMappingset__Group__1 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:404:2: rule__FeatureMappingset__Group__0__Impl rule__FeatureMappingset__Group__1
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:411:1: rule__FeatureMappingset__Group__0__Impl : ( KEYWORD_9 ) ;
    public final void rule__FeatureMappingset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:415:1: ( ( KEYWORD_9 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:416:1: ( KEYWORD_9 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:416:1: ( KEYWORD_9 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:417:1: KEYWORD_9
            {
             before(grammarAccess.getFeatureMappingsetAccess().getMappingsKeyword_0()); 
            match(input,KEYWORD_9,FollowSets000.FOLLOW_KEYWORD_9_in_rule__FeatureMappingset__Group__0__Impl804); 
             after(grammarAccess.getFeatureMappingsetAccess().getMappingsKeyword_0()); 

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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:430:1: rule__FeatureMappingset__Group__1 : rule__FeatureMappingset__Group__1__Impl rule__FeatureMappingset__Group__2 ;
    public final void rule__FeatureMappingset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:434:1: ( rule__FeatureMappingset__Group__1__Impl rule__FeatureMappingset__Group__2 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:435:2: rule__FeatureMappingset__Group__1__Impl rule__FeatureMappingset__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__Group__1__Impl_in_rule__FeatureMappingset__Group__1835);
            rule__FeatureMappingset__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__Group__2_in_rule__FeatureMappingset__Group__1838);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:442:1: rule__FeatureMappingset__Group__1__Impl : ( ( rule__FeatureMappingset__NameAssignment_1 ) ) ;
    public final void rule__FeatureMappingset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:446:1: ( ( ( rule__FeatureMappingset__NameAssignment_1 ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:447:1: ( ( rule__FeatureMappingset__NameAssignment_1 ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:447:1: ( ( rule__FeatureMappingset__NameAssignment_1 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:448:1: ( rule__FeatureMappingset__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureMappingsetAccess().getNameAssignment_1()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:449:1: ( rule__FeatureMappingset__NameAssignment_1 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:449:2: rule__FeatureMappingset__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__NameAssignment_1_in_rule__FeatureMappingset__Group__1__Impl865);
            rule__FeatureMappingset__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureMappingsetAccess().getNameAssignment_1()); 

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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:459:1: rule__FeatureMappingset__Group__2 : rule__FeatureMappingset__Group__2__Impl rule__FeatureMappingset__Group__3 ;
    public final void rule__FeatureMappingset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:463:1: ( rule__FeatureMappingset__Group__2__Impl rule__FeatureMappingset__Group__3 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:464:2: rule__FeatureMappingset__Group__2__Impl rule__FeatureMappingset__Group__3
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:471:1: rule__FeatureMappingset__Group__2__Impl : ( ( rule__FeatureMappingset__Group_2__0 )? ) ;
    public final void rule__FeatureMappingset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:475:1: ( ( ( rule__FeatureMappingset__Group_2__0 )? ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:476:1: ( ( rule__FeatureMappingset__Group_2__0 )? )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:476:1: ( ( rule__FeatureMappingset__Group_2__0 )? )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:477:1: ( rule__FeatureMappingset__Group_2__0 )?
            {
             before(grammarAccess.getFeatureMappingsetAccess().getGroup_2()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:478:1: ( rule__FeatureMappingset__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==KEYWORD_7) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:478:2: rule__FeatureMappingset__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__Group_2__0_in_rule__FeatureMappingset__Group__2__Impl925);
                    rule__FeatureMappingset__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureMappingsetAccess().getGroup_2()); 

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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:488:1: rule__FeatureMappingset__Group__3 : rule__FeatureMappingset__Group__3__Impl rule__FeatureMappingset__Group__4 ;
    public final void rule__FeatureMappingset__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:492:1: ( rule__FeatureMappingset__Group__3__Impl rule__FeatureMappingset__Group__4 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:493:2: rule__FeatureMappingset__Group__3__Impl rule__FeatureMappingset__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__Group__3__Impl_in_rule__FeatureMappingset__Group__3956);
            rule__FeatureMappingset__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__Group__4_in_rule__FeatureMappingset__Group__3959);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:500:1: rule__FeatureMappingset__Group__3__Impl : ( ( rule__FeatureMappingset__MappingAssignment_3 ) ) ;
    public final void rule__FeatureMappingset__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:504:1: ( ( ( rule__FeatureMappingset__MappingAssignment_3 ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:505:1: ( ( rule__FeatureMappingset__MappingAssignment_3 ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:505:1: ( ( rule__FeatureMappingset__MappingAssignment_3 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:506:1: ( rule__FeatureMappingset__MappingAssignment_3 )
            {
             before(grammarAccess.getFeatureMappingsetAccess().getMappingAssignment_3()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:507:1: ( rule__FeatureMappingset__MappingAssignment_3 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:507:2: rule__FeatureMappingset__MappingAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__MappingAssignment_3_in_rule__FeatureMappingset__Group__3__Impl986);
            rule__FeatureMappingset__MappingAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureMappingsetAccess().getMappingAssignment_3()); 

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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:517:1: rule__FeatureMappingset__Group__4 : rule__FeatureMappingset__Group__4__Impl rule__FeatureMappingset__Group__5 ;
    public final void rule__FeatureMappingset__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:521:1: ( rule__FeatureMappingset__Group__4__Impl rule__FeatureMappingset__Group__5 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:522:2: rule__FeatureMappingset__Group__4__Impl rule__FeatureMappingset__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__Group__4__Impl_in_rule__FeatureMappingset__Group__41016);
            rule__FeatureMappingset__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__Group__5_in_rule__FeatureMappingset__Group__41019);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:529:1: rule__FeatureMappingset__Group__4__Impl : ( KEYWORD_5 ) ;
    public final void rule__FeatureMappingset__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:533:1: ( ( KEYWORD_5 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:534:1: ( KEYWORD_5 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:534:1: ( KEYWORD_5 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:535:1: KEYWORD_5
            {
             before(grammarAccess.getFeatureMappingsetAccess().getEndKeyword_4()); 
            match(input,KEYWORD_5,FollowSets000.FOLLOW_KEYWORD_5_in_rule__FeatureMappingset__Group__4__Impl1047); 
             after(grammarAccess.getFeatureMappingsetAccess().getEndKeyword_4()); 

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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:548:1: rule__FeatureMappingset__Group__5 : rule__FeatureMappingset__Group__5__Impl rule__FeatureMappingset__Group__6 ;
    public final void rule__FeatureMappingset__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:552:1: ( rule__FeatureMappingset__Group__5__Impl rule__FeatureMappingset__Group__6 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:553:2: rule__FeatureMappingset__Group__5__Impl rule__FeatureMappingset__Group__6
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:560:1: rule__FeatureMappingset__Group__5__Impl : ( KEYWORD_9 ) ;
    public final void rule__FeatureMappingset__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:564:1: ( ( KEYWORD_9 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:565:1: ( KEYWORD_9 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:565:1: ( KEYWORD_9 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:566:1: KEYWORD_9
            {
             before(grammarAccess.getFeatureMappingsetAccess().getMappingsKeyword_5()); 
            match(input,KEYWORD_9,FollowSets000.FOLLOW_KEYWORD_9_in_rule__FeatureMappingset__Group__5__Impl1109); 
             after(grammarAccess.getFeatureMappingsetAccess().getMappingsKeyword_5()); 

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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:579:1: rule__FeatureMappingset__Group__6 : rule__FeatureMappingset__Group__6__Impl ;
    public final void rule__FeatureMappingset__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:583:1: ( rule__FeatureMappingset__Group__6__Impl )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:584:2: rule__FeatureMappingset__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__Group__6__Impl_in_rule__FeatureMappingset__Group__61140);
            rule__FeatureMappingset__Group__6__Impl();

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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:590:1: rule__FeatureMappingset__Group__6__Impl : ( KEYWORD_2 ) ;
    public final void rule__FeatureMappingset__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:594:1: ( ( KEYWORD_2 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:595:1: ( KEYWORD_2 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:595:1: ( KEYWORD_2 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:596:1: KEYWORD_2
            {
             before(grammarAccess.getFeatureMappingsetAccess().getSemicolonKeyword_6()); 
            match(input,KEYWORD_2,FollowSets000.FOLLOW_KEYWORD_2_in_rule__FeatureMappingset__Group__6__Impl1168); 
             after(grammarAccess.getFeatureMappingsetAccess().getSemicolonKeyword_6()); 

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


    // $ANTLR start "rule__FeatureMappingset__Group_2__0"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:623:1: rule__FeatureMappingset__Group_2__0 : rule__FeatureMappingset__Group_2__0__Impl rule__FeatureMappingset__Group_2__1 ;
    public final void rule__FeatureMappingset__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:627:1: ( rule__FeatureMappingset__Group_2__0__Impl rule__FeatureMappingset__Group_2__1 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:628:2: rule__FeatureMappingset__Group_2__0__Impl rule__FeatureMappingset__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__Group_2__0__Impl_in_rule__FeatureMappingset__Group_2__01213);
            rule__FeatureMappingset__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__Group_2__1_in_rule__FeatureMappingset__Group_2__01216);
            rule__FeatureMappingset__Group_2__1();

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
    // $ANTLR end "rule__FeatureMappingset__Group_2__0"


    // $ANTLR start "rule__FeatureMappingset__Group_2__0__Impl"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:635:1: rule__FeatureMappingset__Group_2__0__Impl : ( KEYWORD_7 ) ;
    public final void rule__FeatureMappingset__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:639:1: ( ( KEYWORD_7 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:640:1: ( KEYWORD_7 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:640:1: ( KEYWORD_7 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:641:1: KEYWORD_7
            {
             before(grammarAccess.getFeatureMappingsetAccess().getExtendsKeyword_2_0()); 
            match(input,KEYWORD_7,FollowSets000.FOLLOW_KEYWORD_7_in_rule__FeatureMappingset__Group_2__0__Impl1244); 
             after(grammarAccess.getFeatureMappingsetAccess().getExtendsKeyword_2_0()); 

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
    // $ANTLR end "rule__FeatureMappingset__Group_2__0__Impl"


    // $ANTLR start "rule__FeatureMappingset__Group_2__1"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:654:1: rule__FeatureMappingset__Group_2__1 : rule__FeatureMappingset__Group_2__1__Impl ;
    public final void rule__FeatureMappingset__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:658:1: ( rule__FeatureMappingset__Group_2__1__Impl )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:659:2: rule__FeatureMappingset__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__Group_2__1__Impl_in_rule__FeatureMappingset__Group_2__11275);
            rule__FeatureMappingset__Group_2__1__Impl();

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
    // $ANTLR end "rule__FeatureMappingset__Group_2__1"


    // $ANTLR start "rule__FeatureMappingset__Group_2__1__Impl"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:665:1: rule__FeatureMappingset__Group_2__1__Impl : ( ( rule__FeatureMappingset__MappingsetAssignment_2_1 ) ) ;
    public final void rule__FeatureMappingset__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:669:1: ( ( ( rule__FeatureMappingset__MappingsetAssignment_2_1 ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:670:1: ( ( rule__FeatureMappingset__MappingsetAssignment_2_1 ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:670:1: ( ( rule__FeatureMappingset__MappingsetAssignment_2_1 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:671:1: ( rule__FeatureMappingset__MappingsetAssignment_2_1 )
            {
             before(grammarAccess.getFeatureMappingsetAccess().getMappingsetAssignment_2_1()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:672:1: ( rule__FeatureMappingset__MappingsetAssignment_2_1 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:672:2: rule__FeatureMappingset__MappingsetAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMappingset__MappingsetAssignment_2_1_in_rule__FeatureMappingset__Group_2__1__Impl1302);
            rule__FeatureMappingset__MappingsetAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureMappingsetAccess().getMappingsetAssignment_2_1()); 

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
    // $ANTLR end "rule__FeatureMappingset__Group_2__1__Impl"


    // $ANTLR start "rule__FGMSubclause__Group__0"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:686:1: rule__FGMSubclause__Group__0 : rule__FGMSubclause__Group__0__Impl rule__FGMSubclause__Group__1 ;
    public final void rule__FGMSubclause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:690:1: ( rule__FGMSubclause__Group__0__Impl rule__FGMSubclause__Group__1 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:691:2: rule__FGMSubclause__Group__0__Impl rule__FGMSubclause__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FGMSubclause__Group__0__Impl_in_rule__FGMSubclause__Group__01336);
            rule__FGMSubclause__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FGMSubclause__Group__1_in_rule__FGMSubclause__Group__01339);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:698:1: rule__FGMSubclause__Group__0__Impl : ( KEYWORD_6 ) ;
    public final void rule__FGMSubclause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:702:1: ( ( KEYWORD_6 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:703:1: ( KEYWORD_6 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:703:1: ( KEYWORD_6 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:704:1: KEYWORD_6
            {
             before(grammarAccess.getFGMSubclauseAccess().getUseKeyword_0()); 
            match(input,KEYWORD_6,FollowSets000.FOLLOW_KEYWORD_6_in_rule__FGMSubclause__Group__0__Impl1367); 
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:717:1: rule__FGMSubclause__Group__1 : rule__FGMSubclause__Group__1__Impl rule__FGMSubclause__Group__2 ;
    public final void rule__FGMSubclause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:721:1: ( rule__FGMSubclause__Group__1__Impl rule__FGMSubclause__Group__2 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:722:2: rule__FGMSubclause__Group__1__Impl rule__FGMSubclause__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FGMSubclause__Group__1__Impl_in_rule__FGMSubclause__Group__11398);
            rule__FGMSubclause__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FGMSubclause__Group__2_in_rule__FGMSubclause__Group__11401);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:729:1: rule__FGMSubclause__Group__1__Impl : ( KEYWORD_9 ) ;
    public final void rule__FGMSubclause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:733:1: ( ( KEYWORD_9 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:734:1: ( KEYWORD_9 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:734:1: ( KEYWORD_9 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:735:1: KEYWORD_9
            {
             before(grammarAccess.getFGMSubclauseAccess().getMappingsKeyword_1()); 
            match(input,KEYWORD_9,FollowSets000.FOLLOW_KEYWORD_9_in_rule__FGMSubclause__Group__1__Impl1429); 
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:748:1: rule__FGMSubclause__Group__2 : rule__FGMSubclause__Group__2__Impl rule__FGMSubclause__Group__3 ;
    public final void rule__FGMSubclause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:752:1: ( rule__FGMSubclause__Group__2__Impl rule__FGMSubclause__Group__3 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:753:2: rule__FGMSubclause__Group__2__Impl rule__FGMSubclause__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FGMSubclause__Group__2__Impl_in_rule__FGMSubclause__Group__21460);
            rule__FGMSubclause__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FGMSubclause__Group__3_in_rule__FGMSubclause__Group__21463);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:760:1: rule__FGMSubclause__Group__2__Impl : ( ( rule__FGMSubclause__MappingsetAssignment_2 ) ) ;
    public final void rule__FGMSubclause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:764:1: ( ( ( rule__FGMSubclause__MappingsetAssignment_2 ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:765:1: ( ( rule__FGMSubclause__MappingsetAssignment_2 ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:765:1: ( ( rule__FGMSubclause__MappingsetAssignment_2 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:766:1: ( rule__FGMSubclause__MappingsetAssignment_2 )
            {
             before(grammarAccess.getFGMSubclauseAccess().getMappingsetAssignment_2()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:767:1: ( rule__FGMSubclause__MappingsetAssignment_2 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:767:2: rule__FGMSubclause__MappingsetAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FGMSubclause__MappingsetAssignment_2_in_rule__FGMSubclause__Group__2__Impl1490);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:777:1: rule__FGMSubclause__Group__3 : rule__FGMSubclause__Group__3__Impl ;
    public final void rule__FGMSubclause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:781:1: ( rule__FGMSubclause__Group__3__Impl )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:782:2: rule__FGMSubclause__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FGMSubclause__Group__3__Impl_in_rule__FGMSubclause__Group__31520);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:788:1: rule__FGMSubclause__Group__3__Impl : ( KEYWORD_2 ) ;
    public final void rule__FGMSubclause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:792:1: ( ( KEYWORD_2 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:793:1: ( KEYWORD_2 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:793:1: ( KEYWORD_2 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:794:1: KEYWORD_2
            {
             before(grammarAccess.getFGMSubclauseAccess().getSemicolonKeyword_3()); 
            match(input,KEYWORD_2,FollowSets000.FOLLOW_KEYWORD_2_in_rule__FGMSubclause__Group__3__Impl1548); 
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:815:1: rule__FeatureMapping__Group__0 : rule__FeatureMapping__Group__0__Impl rule__FeatureMapping__Group__1 ;
    public final void rule__FeatureMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:819:1: ( rule__FeatureMapping__Group__0__Impl rule__FeatureMapping__Group__1 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:820:2: rule__FeatureMapping__Group__0__Impl rule__FeatureMapping__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMapping__Group__0__Impl_in_rule__FeatureMapping__Group__01587);
            rule__FeatureMapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FeatureMapping__Group__1_in_rule__FeatureMapping__Group__01590);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:827:1: rule__FeatureMapping__Group__0__Impl : ( ( rule__FeatureMapping__LeftAssignment_0 ) ) ;
    public final void rule__FeatureMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:831:1: ( ( ( rule__FeatureMapping__LeftAssignment_0 ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:832:1: ( ( rule__FeatureMapping__LeftAssignment_0 ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:832:1: ( ( rule__FeatureMapping__LeftAssignment_0 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:833:1: ( rule__FeatureMapping__LeftAssignment_0 )
            {
             before(grammarAccess.getFeatureMappingAccess().getLeftAssignment_0()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:834:1: ( rule__FeatureMapping__LeftAssignment_0 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:834:2: rule__FeatureMapping__LeftAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMapping__LeftAssignment_0_in_rule__FeatureMapping__Group__0__Impl1617);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:844:1: rule__FeatureMapping__Group__1 : rule__FeatureMapping__Group__1__Impl rule__FeatureMapping__Group__2 ;
    public final void rule__FeatureMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:848:1: ( rule__FeatureMapping__Group__1__Impl rule__FeatureMapping__Group__2 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:849:2: rule__FeatureMapping__Group__1__Impl rule__FeatureMapping__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMapping__Group__1__Impl_in_rule__FeatureMapping__Group__11647);
            rule__FeatureMapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FeatureMapping__Group__2_in_rule__FeatureMapping__Group__11650);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:856:1: rule__FeatureMapping__Group__1__Impl : ( KEYWORD_4 ) ;
    public final void rule__FeatureMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:860:1: ( ( KEYWORD_4 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:861:1: ( KEYWORD_4 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:861:1: ( KEYWORD_4 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:862:1: KEYWORD_4
            {
             before(grammarAccess.getFeatureMappingAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_1()); 
            match(input,KEYWORD_4,FollowSets000.FOLLOW_KEYWORD_4_in_rule__FeatureMapping__Group__1__Impl1678); 
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:875:1: rule__FeatureMapping__Group__2 : rule__FeatureMapping__Group__2__Impl rule__FeatureMapping__Group__3 ;
    public final void rule__FeatureMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:879:1: ( rule__FeatureMapping__Group__2__Impl rule__FeatureMapping__Group__3 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:880:2: rule__FeatureMapping__Group__2__Impl rule__FeatureMapping__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMapping__Group__2__Impl_in_rule__FeatureMapping__Group__21709);
            rule__FeatureMapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FeatureMapping__Group__3_in_rule__FeatureMapping__Group__21712);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:887:1: rule__FeatureMapping__Group__2__Impl : ( ( rule__FeatureMapping__RightAssignment_2 ) ) ;
    public final void rule__FeatureMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:891:1: ( ( ( rule__FeatureMapping__RightAssignment_2 ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:892:1: ( ( rule__FeatureMapping__RightAssignment_2 ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:892:1: ( ( rule__FeatureMapping__RightAssignment_2 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:893:1: ( rule__FeatureMapping__RightAssignment_2 )
            {
             before(grammarAccess.getFeatureMappingAccess().getRightAssignment_2()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:894:1: ( rule__FeatureMapping__RightAssignment_2 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:894:2: rule__FeatureMapping__RightAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMapping__RightAssignment_2_in_rule__FeatureMapping__Group__2__Impl1739);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:904:1: rule__FeatureMapping__Group__3 : rule__FeatureMapping__Group__3__Impl ;
    public final void rule__FeatureMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:908:1: ( rule__FeatureMapping__Group__3__Impl )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:909:2: rule__FeatureMapping__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeatureMapping__Group__3__Impl_in_rule__FeatureMapping__Group__31769);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:915:1: rule__FeatureMapping__Group__3__Impl : ( KEYWORD_2 ) ;
    public final void rule__FeatureMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:919:1: ( ( KEYWORD_2 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:920:1: ( KEYWORD_2 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:920:1: ( KEYWORD_2 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:921:1: KEYWORD_2
            {
             before(grammarAccess.getFeatureMappingAccess().getSemicolonKeyword_3()); 
            match(input,KEYWORD_2,FollowSets000.FOLLOW_KEYWORD_2_in_rule__FeatureMapping__Group__3__Impl1797); 
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:942:1: rule__FeaturePath__Group__0 : rule__FeaturePath__Group__0__Impl rule__FeaturePath__Group__1 ;
    public final void rule__FeaturePath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:946:1: ( rule__FeaturePath__Group__0__Impl rule__FeaturePath__Group__1 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:947:2: rule__FeaturePath__Group__0__Impl rule__FeaturePath__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeaturePath__Group__0__Impl_in_rule__FeaturePath__Group__01836);
            rule__FeaturePath__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FeaturePath__Group__1_in_rule__FeaturePath__Group__01839);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:954:1: rule__FeaturePath__Group__0__Impl : ( ( rule__FeaturePath__Group_0__0 ) ) ;
    public final void rule__FeaturePath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:958:1: ( ( ( rule__FeaturePath__Group_0__0 ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:959:1: ( ( rule__FeaturePath__Group_0__0 ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:959:1: ( ( rule__FeaturePath__Group_0__0 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:960:1: ( rule__FeaturePath__Group_0__0 )
            {
             before(grammarAccess.getFeaturePathAccess().getGroup_0()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:961:1: ( rule__FeaturePath__Group_0__0 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:961:2: rule__FeaturePath__Group_0__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeaturePath__Group_0__0_in_rule__FeaturePath__Group__0__Impl1866);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:971:1: rule__FeaturePath__Group__1 : rule__FeaturePath__Group__1__Impl ;
    public final void rule__FeaturePath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:975:1: ( rule__FeaturePath__Group__1__Impl )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:976:2: rule__FeaturePath__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeaturePath__Group__1__Impl_in_rule__FeaturePath__Group__11896);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:982:1: rule__FeaturePath__Group__1__Impl : ( ( ( rule__FeaturePath__FeatureReferenceAssignment_1 ) ) ( ( rule__FeaturePath__FeatureReferenceAssignment_1 )* ) ) ;
    public final void rule__FeaturePath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:986:1: ( ( ( ( rule__FeaturePath__FeatureReferenceAssignment_1 ) ) ( ( rule__FeaturePath__FeatureReferenceAssignment_1 )* ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:987:1: ( ( ( rule__FeaturePath__FeatureReferenceAssignment_1 ) ) ( ( rule__FeaturePath__FeatureReferenceAssignment_1 )* ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:987:1: ( ( ( rule__FeaturePath__FeatureReferenceAssignment_1 ) ) ( ( rule__FeaturePath__FeatureReferenceAssignment_1 )* ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:988:1: ( ( rule__FeaturePath__FeatureReferenceAssignment_1 ) ) ( ( rule__FeaturePath__FeatureReferenceAssignment_1 )* )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:988:1: ( ( rule__FeaturePath__FeatureReferenceAssignment_1 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:989:1: ( rule__FeaturePath__FeatureReferenceAssignment_1 )
            {
             before(grammarAccess.getFeaturePathAccess().getFeatureReferenceAssignment_1()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:990:1: ( rule__FeaturePath__FeatureReferenceAssignment_1 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:990:2: rule__FeaturePath__FeatureReferenceAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeaturePath__FeatureReferenceAssignment_1_in_rule__FeaturePath__Group__1__Impl1925);
            rule__FeaturePath__FeatureReferenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeaturePathAccess().getFeatureReferenceAssignment_1()); 

            }

            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:993:1: ( ( rule__FeaturePath__FeatureReferenceAssignment_1 )* )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:994:1: ( rule__FeaturePath__FeatureReferenceAssignment_1 )*
            {
             before(grammarAccess.getFeaturePathAccess().getFeatureReferenceAssignment_1()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:995:1: ( rule__FeaturePath__FeatureReferenceAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:995:2: rule__FeaturePath__FeatureReferenceAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__FeaturePath__FeatureReferenceAssignment_1_in_rule__FeaturePath__Group__1__Impl1937);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1010:1: rule__FeaturePath__Group_0__0 : rule__FeaturePath__Group_0__0__Impl rule__FeaturePath__Group_0__1 ;
    public final void rule__FeaturePath__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1014:1: ( rule__FeaturePath__Group_0__0__Impl rule__FeaturePath__Group_0__1 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1015:2: rule__FeaturePath__Group_0__0__Impl rule__FeaturePath__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeaturePath__Group_0__0__Impl_in_rule__FeaturePath__Group_0__01974);
            rule__FeaturePath__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FeaturePath__Group_0__1_in_rule__FeaturePath__Group_0__01977);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1022:1: rule__FeaturePath__Group_0__0__Impl : ( ( rule__FeaturePath__FeatureGroupTypeAssignment_0_0 ) ) ;
    public final void rule__FeaturePath__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1026:1: ( ( ( rule__FeaturePath__FeatureGroupTypeAssignment_0_0 ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1027:1: ( ( rule__FeaturePath__FeatureGroupTypeAssignment_0_0 ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1027:1: ( ( rule__FeaturePath__FeatureGroupTypeAssignment_0_0 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1028:1: ( rule__FeaturePath__FeatureGroupTypeAssignment_0_0 )
            {
             before(grammarAccess.getFeaturePathAccess().getFeatureGroupTypeAssignment_0_0()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1029:1: ( rule__FeaturePath__FeatureGroupTypeAssignment_0_0 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1029:2: rule__FeaturePath__FeatureGroupTypeAssignment_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeaturePath__FeatureGroupTypeAssignment_0_0_in_rule__FeaturePath__Group_0__0__Impl2004);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1039:1: rule__FeaturePath__Group_0__1 : rule__FeaturePath__Group_0__1__Impl ;
    public final void rule__FeaturePath__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1043:1: ( rule__FeaturePath__Group_0__1__Impl )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1044:2: rule__FeaturePath__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FeaturePath__Group_0__1__Impl_in_rule__FeaturePath__Group_0__12034);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1050:1: rule__FeaturePath__Group_0__1__Impl : ( KEYWORD_1 ) ;
    public final void rule__FeaturePath__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1054:1: ( ( KEYWORD_1 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1055:1: ( KEYWORD_1 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1055:1: ( KEYWORD_1 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1056:1: KEYWORD_1
            {
             before(grammarAccess.getFeaturePathAccess().getFullStopKeyword_0_1()); 
            match(input,KEYWORD_1,FollowSets000.FOLLOW_KEYWORD_1_in_rule__FeaturePath__Group_0__1__Impl2062); 
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1073:1: rule__QFGTMREF__Group__0 : rule__QFGTMREF__Group__0__Impl rule__QFGTMREF__Group__1 ;
    public final void rule__QFGTMREF__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1077:1: ( rule__QFGTMREF__Group__0__Impl rule__QFGTMREF__Group__1 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1078:2: rule__QFGTMREF__Group__0__Impl rule__QFGTMREF__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QFGTMREF__Group__0__Impl_in_rule__QFGTMREF__Group__02097);
            rule__QFGTMREF__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QFGTMREF__Group__1_in_rule__QFGTMREF__Group__02100);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1085:1: rule__QFGTMREF__Group__0__Impl : ( ( rule__QFGTMREF__Group_0__0 )* ) ;
    public final void rule__QFGTMREF__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1089:1: ( ( ( rule__QFGTMREF__Group_0__0 )* ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1090:1: ( ( rule__QFGTMREF__Group_0__0 )* )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1090:1: ( ( rule__QFGTMREF__Group_0__0 )* )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1091:1: ( rule__QFGTMREF__Group_0__0 )*
            {
             before(grammarAccess.getQFGTMREFAccess().getGroup_0()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1092:1: ( rule__QFGTMREF__Group_0__0 )*
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
            	    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1092:2: rule__QFGTMREF__Group_0__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QFGTMREF__Group_0__0_in_rule__QFGTMREF__Group__0__Impl2127);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1102:1: rule__QFGTMREF__Group__1 : rule__QFGTMREF__Group__1__Impl ;
    public final void rule__QFGTMREF__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1106:1: ( rule__QFGTMREF__Group__1__Impl )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1107:2: rule__QFGTMREF__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QFGTMREF__Group__1__Impl_in_rule__QFGTMREF__Group__12158);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1113:1: rule__QFGTMREF__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__QFGTMREF__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1117:1: ( ( RULE_ID ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1118:1: ( RULE_ID )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1118:1: ( RULE_ID )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1119:1: RULE_ID
            {
             before(grammarAccess.getQFGTMREFAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QFGTMREF__Group__1__Impl2185); 
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1134:1: rule__QFGTMREF__Group_0__0 : rule__QFGTMREF__Group_0__0__Impl rule__QFGTMREF__Group_0__1 ;
    public final void rule__QFGTMREF__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1138:1: ( rule__QFGTMREF__Group_0__0__Impl rule__QFGTMREF__Group_0__1 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1139:2: rule__QFGTMREF__Group_0__0__Impl rule__QFGTMREF__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QFGTMREF__Group_0__0__Impl_in_rule__QFGTMREF__Group_0__02218);
            rule__QFGTMREF__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QFGTMREF__Group_0__1_in_rule__QFGTMREF__Group_0__02221);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1146:1: rule__QFGTMREF__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__QFGTMREF__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1150:1: ( ( RULE_ID ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1151:1: ( RULE_ID )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1151:1: ( RULE_ID )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1152:1: RULE_ID
            {
             before(grammarAccess.getQFGTMREFAccess().getIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QFGTMREF__Group_0__0__Impl2248); 
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1163:1: rule__QFGTMREF__Group_0__1 : rule__QFGTMREF__Group_0__1__Impl ;
    public final void rule__QFGTMREF__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1167:1: ( rule__QFGTMREF__Group_0__1__Impl )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1168:2: rule__QFGTMREF__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QFGTMREF__Group_0__1__Impl_in_rule__QFGTMREF__Group_0__12277);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1174:1: rule__QFGTMREF__Group_0__1__Impl : ( KEYWORD_3 ) ;
    public final void rule__QFGTMREF__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1178:1: ( ( KEYWORD_3 ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1179:1: ( KEYWORD_3 )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1179:1: ( KEYWORD_3 )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1180:1: KEYWORD_3
            {
             before(grammarAccess.getQFGTMREFAccess().getColonColonKeyword_0_1()); 
            match(input,KEYWORD_3,FollowSets000.FOLLOW_KEYWORD_3_in_rule__QFGTMREF__Group_0__1__Impl2305); 
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1198:1: rule__FGMGrammarRoot__FgmlAssignment_0_1 : ( ruleFGMLibrary ) ;
    public final void rule__FGMGrammarRoot__FgmlAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1202:1: ( ( ruleFGMLibrary ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1203:1: ( ruleFGMLibrary )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1203:1: ( ruleFGMLibrary )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1204:1: ruleFGMLibrary
            {
             before(grammarAccess.getFGMGrammarRootAccess().getFgmlFGMLibraryParserRuleCall_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFGMLibrary_in_rule__FGMGrammarRoot__FgmlAssignment_0_12345);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1213:1: rule__FGMGrammarRoot__FgmscAssignment_1 : ( ruleFGMSubclause ) ;
    public final void rule__FGMGrammarRoot__FgmscAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1217:1: ( ( ruleFGMSubclause ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1218:1: ( ruleFGMSubclause )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1218:1: ( ruleFGMSubclause )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1219:1: ruleFGMSubclause
            {
             before(grammarAccess.getFGMGrammarRootAccess().getFgmscFGMSubclauseParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFGMSubclause_in_rule__FGMGrammarRoot__FgmscAssignment_12376);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1228:1: rule__FGMLibrary__FeaturemappingsetAssignment : ( ruleFeatureMappingset ) ;
    public final void rule__FGMLibrary__FeaturemappingsetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1232:1: ( ( ruleFeatureMappingset ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1233:1: ( ruleFeatureMappingset )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1233:1: ( ruleFeatureMappingset )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1234:1: ruleFeatureMappingset
            {
             before(grammarAccess.getFGMLibraryAccess().getFeaturemappingsetFeatureMappingsetParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeatureMappingset_in_rule__FGMLibrary__FeaturemappingsetAssignment2407);
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


    // $ANTLR start "rule__FeatureMappingset__NameAssignment_1"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1243:1: rule__FeatureMappingset__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FeatureMappingset__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1247:1: ( ( RULE_ID ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1248:1: ( RULE_ID )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1248:1: ( RULE_ID )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1249:1: RULE_ID
            {
             before(grammarAccess.getFeatureMappingsetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__FeatureMappingset__NameAssignment_12438); 
             after(grammarAccess.getFeatureMappingsetAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__FeatureMappingset__NameAssignment_1"


    // $ANTLR start "rule__FeatureMappingset__MappingsetAssignment_2_1"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1258:1: rule__FeatureMappingset__MappingsetAssignment_2_1 : ( ( ruleQFGTMREF ) ) ;
    public final void rule__FeatureMappingset__MappingsetAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1262:1: ( ( ( ruleQFGTMREF ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1263:1: ( ( ruleQFGTMREF ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1263:1: ( ( ruleQFGTMREF ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1264:1: ( ruleQFGTMREF )
            {
             before(grammarAccess.getFeatureMappingsetAccess().getMappingsetFeatureMappingsetCrossReference_2_1_0()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1265:1: ( ruleQFGTMREF )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1266:1: ruleQFGTMREF
            {
             before(grammarAccess.getFeatureMappingsetAccess().getMappingsetFeatureMappingsetQFGTMREFParserRuleCall_2_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQFGTMREF_in_rule__FeatureMappingset__MappingsetAssignment_2_12473);
            ruleQFGTMREF();

            state._fsp--;

             after(grammarAccess.getFeatureMappingsetAccess().getMappingsetFeatureMappingsetQFGTMREFParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getFeatureMappingsetAccess().getMappingsetFeatureMappingsetCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__FeatureMappingset__MappingsetAssignment_2_1"


    // $ANTLR start "rule__FeatureMappingset__MappingAssignment_3"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1277:1: rule__FeatureMappingset__MappingAssignment_3 : ( ruleFeatureMapping ) ;
    public final void rule__FeatureMappingset__MappingAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1281:1: ( ( ruleFeatureMapping ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1282:1: ( ruleFeatureMapping )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1282:1: ( ruleFeatureMapping )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1283:1: ruleFeatureMapping
            {
             before(grammarAccess.getFeatureMappingsetAccess().getMappingFeatureMappingParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeatureMapping_in_rule__FeatureMappingset__MappingAssignment_32508);
            ruleFeatureMapping();

            state._fsp--;

             after(grammarAccess.getFeatureMappingsetAccess().getMappingFeatureMappingParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__FeatureMappingset__MappingAssignment_3"


    // $ANTLR start "rule__FGMSubclause__MappingsetAssignment_2"
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1292:1: rule__FGMSubclause__MappingsetAssignment_2 : ( ( ruleQFGTMREF ) ) ;
    public final void rule__FGMSubclause__MappingsetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1296:1: ( ( ( ruleQFGTMREF ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1297:1: ( ( ruleQFGTMREF ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1297:1: ( ( ruleQFGTMREF ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1298:1: ( ruleQFGTMREF )
            {
             before(grammarAccess.getFGMSubclauseAccess().getMappingsetFeatureMappingsetCrossReference_2_0()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1299:1: ( ruleQFGTMREF )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1300:1: ruleQFGTMREF
            {
             before(grammarAccess.getFGMSubclauseAccess().getMappingsetFeatureMappingsetQFGTMREFParserRuleCall_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQFGTMREF_in_rule__FGMSubclause__MappingsetAssignment_22543);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1311:1: rule__FeatureMapping__LeftAssignment_0 : ( ruleFeaturePath ) ;
    public final void rule__FeatureMapping__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1315:1: ( ( ruleFeaturePath ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1316:1: ( ruleFeaturePath )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1316:1: ( ruleFeaturePath )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1317:1: ruleFeaturePath
            {
             before(grammarAccess.getFeatureMappingAccess().getLeftFeaturePathParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeaturePath_in_rule__FeatureMapping__LeftAssignment_02578);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1326:1: rule__FeatureMapping__RightAssignment_2 : ( ruleFeaturePath ) ;
    public final void rule__FeatureMapping__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1330:1: ( ( ruleFeaturePath ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1331:1: ( ruleFeaturePath )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1331:1: ( ruleFeaturePath )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1332:1: ruleFeaturePath
            {
             before(grammarAccess.getFeatureMappingAccess().getRightFeaturePathParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeaturePath_in_rule__FeatureMapping__RightAssignment_22609);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1341:1: rule__FeaturePath__FeatureGroupTypeAssignment_0_0 : ( ( ruleQFGTMREF ) ) ;
    public final void rule__FeaturePath__FeatureGroupTypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1345:1: ( ( ( ruleQFGTMREF ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1346:1: ( ( ruleQFGTMREF ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1346:1: ( ( ruleQFGTMREF ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1347:1: ( ruleQFGTMREF )
            {
             before(grammarAccess.getFeaturePathAccess().getFeatureGroupTypeFeatureGroupTypeCrossReference_0_0_0()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1348:1: ( ruleQFGTMREF )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1349:1: ruleQFGTMREF
            {
             before(grammarAccess.getFeaturePathAccess().getFeatureGroupTypeFeatureGroupTypeQFGTMREFParserRuleCall_0_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleQFGTMREF_in_rule__FeaturePath__FeatureGroupTypeAssignment_0_02644);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1360:1: rule__FeaturePath__FeatureReferenceAssignment_1 : ( ruleFeatureReference ) ;
    public final void rule__FeaturePath__FeatureReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1364:1: ( ( ruleFeatureReference ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1365:1: ( ruleFeatureReference )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1365:1: ( ruleFeatureReference )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1366:1: ruleFeatureReference
            {
             before(grammarAccess.getFeaturePathAccess().getFeatureReferenceFeatureReferenceParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeatureReference_in_rule__FeaturePath__FeatureReferenceAssignment_12679);
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
    // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1375:1: rule__FeatureReference__FeatureAssignment : ( ( RULE_ID ) ) ;
    public final void rule__FeatureReference__FeatureAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1379:1: ( ( ( RULE_ID ) ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1380:1: ( ( RULE_ID ) )
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1380:1: ( ( RULE_ID ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1381:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureReferenceAccess().getFeatureFeatureCrossReference_0()); 
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1382:1: ( RULE_ID )
            // ../org.osate.xtext.aadl2.featuregroupmapping.ui/src-gen/org/osate/xtext/aadl2/featuregroupmapping/ui/contentassist/antlr/internal/InternalFeatureGroupMappingParser.g:1383:1: RULE_ID
            {
             before(grammarAccess.getFeatureReferenceAccess().getFeatureFeatureIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__FeatureReference__FeatureAssignment2714); 
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
        public static final BitSet FOLLOW_rule__FGMLibrary__FeaturemappingsetAssignment_in_ruleFGMLibrary157 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__FGMLibrary__FeaturemappingsetAssignment_in_ruleFGMLibrary169 = new BitSet(new long[]{0x0000000000000012L});
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
        public static final BitSet FOLLOW_rule__FGMGrammarRoot__Group_0__0__Impl_in_rule__FGMGrammarRoot__Group_0__0650 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__FGMGrammarRoot__Group_0__1_in_rule__FGMGrammarRoot__Group_0__0653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_8_in_rule__FGMGrammarRoot__Group_0__0__Impl681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FGMGrammarRoot__Group_0__1__Impl_in_rule__FGMGrammarRoot__Group_0__1712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FGMGrammarRoot__FgmlAssignment_0_1_in_rule__FGMGrammarRoot__Group_0__1__Impl739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group__0__Impl_in_rule__FeatureMappingset__Group__0773 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group__1_in_rule__FeatureMappingset__Group__0776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_9_in_rule__FeatureMappingset__Group__0__Impl804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group__1__Impl_in_rule__FeatureMappingset__Group__1835 = new BitSet(new long[]{0x0000000000004020L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group__2_in_rule__FeatureMappingset__Group__1838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__NameAssignment_1_in_rule__FeatureMappingset__Group__1__Impl865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group__2__Impl_in_rule__FeatureMappingset__Group__2895 = new BitSet(new long[]{0x0000000000004020L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group__3_in_rule__FeatureMappingset__Group__2898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group_2__0_in_rule__FeatureMappingset__Group__2__Impl925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group__3__Impl_in_rule__FeatureMappingset__Group__3956 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group__4_in_rule__FeatureMappingset__Group__3959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__MappingAssignment_3_in_rule__FeatureMappingset__Group__3__Impl986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group__4__Impl_in_rule__FeatureMappingset__Group__41016 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group__5_in_rule__FeatureMappingset__Group__41019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_5_in_rule__FeatureMappingset__Group__4__Impl1047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group__5__Impl_in_rule__FeatureMappingset__Group__51078 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group__6_in_rule__FeatureMappingset__Group__51081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_9_in_rule__FeatureMappingset__Group__5__Impl1109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group__6__Impl_in_rule__FeatureMappingset__Group__61140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_2_in_rule__FeatureMappingset__Group__6__Impl1168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group_2__0__Impl_in_rule__FeatureMappingset__Group_2__01213 = new BitSet(new long[]{0x0000000000004020L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group_2__1_in_rule__FeatureMappingset__Group_2__01216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_7_in_rule__FeatureMappingset__Group_2__0__Impl1244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__Group_2__1__Impl_in_rule__FeatureMappingset__Group_2__11275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMappingset__MappingsetAssignment_2_1_in_rule__FeatureMappingset__Group_2__1__Impl1302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FGMSubclause__Group__0__Impl_in_rule__FGMSubclause__Group__01336 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__FGMSubclause__Group__1_in_rule__FGMSubclause__Group__01339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_6_in_rule__FGMSubclause__Group__0__Impl1367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FGMSubclause__Group__1__Impl_in_rule__FGMSubclause__Group__11398 = new BitSet(new long[]{0x0000000000004020L});
        public static final BitSet FOLLOW_rule__FGMSubclause__Group__2_in_rule__FGMSubclause__Group__11401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_9_in_rule__FGMSubclause__Group__1__Impl1429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FGMSubclause__Group__2__Impl_in_rule__FGMSubclause__Group__21460 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__FGMSubclause__Group__3_in_rule__FGMSubclause__Group__21463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FGMSubclause__MappingsetAssignment_2_in_rule__FGMSubclause__Group__2__Impl1490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FGMSubclause__Group__3__Impl_in_rule__FGMSubclause__Group__31520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_2_in_rule__FGMSubclause__Group__3__Impl1548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMapping__Group__0__Impl_in_rule__FeatureMapping__Group__01587 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_rule__FeatureMapping__Group__1_in_rule__FeatureMapping__Group__01590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMapping__LeftAssignment_0_in_rule__FeatureMapping__Group__0__Impl1617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMapping__Group__1__Impl_in_rule__FeatureMapping__Group__11647 = new BitSet(new long[]{0x0000000000004020L});
        public static final BitSet FOLLOW_rule__FeatureMapping__Group__2_in_rule__FeatureMapping__Group__11650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_4_in_rule__FeatureMapping__Group__1__Impl1678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMapping__Group__2__Impl_in_rule__FeatureMapping__Group__21709 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__FeatureMapping__Group__3_in_rule__FeatureMapping__Group__21712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMapping__RightAssignment_2_in_rule__FeatureMapping__Group__2__Impl1739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeatureMapping__Group__3__Impl_in_rule__FeatureMapping__Group__31769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_2_in_rule__FeatureMapping__Group__3__Impl1797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeaturePath__Group__0__Impl_in_rule__FeaturePath__Group__01836 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__FeaturePath__Group__1_in_rule__FeaturePath__Group__01839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeaturePath__Group_0__0_in_rule__FeaturePath__Group__0__Impl1866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeaturePath__Group__1__Impl_in_rule__FeaturePath__Group__11896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeaturePath__FeatureReferenceAssignment_1_in_rule__FeaturePath__Group__1__Impl1925 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__FeaturePath__FeatureReferenceAssignment_1_in_rule__FeaturePath__Group__1__Impl1937 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__FeaturePath__Group_0__0__Impl_in_rule__FeaturePath__Group_0__01974 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__FeaturePath__Group_0__1_in_rule__FeaturePath__Group_0__01977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeaturePath__FeatureGroupTypeAssignment_0_0_in_rule__FeaturePath__Group_0__0__Impl2004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FeaturePath__Group_0__1__Impl_in_rule__FeaturePath__Group_0__12034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_1_in_rule__FeaturePath__Group_0__1__Impl2062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QFGTMREF__Group__0__Impl_in_rule__QFGTMREF__Group__02097 = new BitSet(new long[]{0x0000000000004020L});
        public static final BitSet FOLLOW_rule__QFGTMREF__Group__1_in_rule__QFGTMREF__Group__02100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QFGTMREF__Group_0__0_in_rule__QFGTMREF__Group__0__Impl2127 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_rule__QFGTMREF__Group__1__Impl_in_rule__QFGTMREF__Group__12158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QFGTMREF__Group__1__Impl2185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QFGTMREF__Group_0__0__Impl_in_rule__QFGTMREF__Group_0__02218 = new BitSet(new long[]{0x0000000000000400L});
        public static final BitSet FOLLOW_rule__QFGTMREF__Group_0__1_in_rule__QFGTMREF__Group_0__02221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QFGTMREF__Group_0__0__Impl2248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QFGTMREF__Group_0__1__Impl_in_rule__QFGTMREF__Group_0__12277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_3_in_rule__QFGTMREF__Group_0__1__Impl2305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFGMLibrary_in_rule__FGMGrammarRoot__FgmlAssignment_0_12345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFGMSubclause_in_rule__FGMGrammarRoot__FgmscAssignment_12376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeatureMappingset_in_rule__FGMLibrary__FeaturemappingsetAssignment2407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__FeatureMappingset__NameAssignment_12438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQFGTMREF_in_rule__FeatureMappingset__MappingsetAssignment_2_12473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeatureMapping_in_rule__FeatureMappingset__MappingAssignment_32508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQFGTMREF_in_rule__FGMSubclause__MappingsetAssignment_22543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeaturePath_in_rule__FeatureMapping__LeftAssignment_02578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeaturePath_in_rule__FeatureMapping__RightAssignment_22609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQFGTMREF_in_rule__FeaturePath__FeatureGroupTypeAssignment_0_02644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeatureReference_in_rule__FeaturePath__FeatureReferenceAssignment_12679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__FeatureReference__FeatureAssignment2714 = new BitSet(new long[]{0x0000000000000002L});
    }


}