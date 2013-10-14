/*
* generated by Xtext
*/
package org.osate.xtext.aadl2.featuregroupmapping.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.osate.xtext.aadl2.featuregroupmapping.services.FeatureGroupMappingGrammarAccess;

public class FeatureGroupMappingParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private FeatureGroupMappingGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.osate.xtext.aadl2.featuregroupmapping.parser.antlr.internal.InternalFeatureGroupMappingParser createParser(XtextTokenStream stream) {
		return new org.osate.xtext.aadl2.featuregroupmapping.parser.antlr.internal.InternalFeatureGroupMappingParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "FGMGrammarRoot";
	}
	
	public FeatureGroupMappingGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(FeatureGroupMappingGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
