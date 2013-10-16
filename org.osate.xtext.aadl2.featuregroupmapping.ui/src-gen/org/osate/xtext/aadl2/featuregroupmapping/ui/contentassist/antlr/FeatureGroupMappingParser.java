/*
* generated by Xtext
*/
package org.osate.xtext.aadl2.featuregroupmapping.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.osate.xtext.aadl2.featuregroupmapping.services.FeatureGroupMappingGrammarAccess;

public class FeatureGroupMappingParser extends AbstractContentAssistParser {
	
	@Inject
	private FeatureGroupMappingGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.osate.xtext.aadl2.featuregroupmapping.ui.contentassist.antlr.internal.InternalFeatureGroupMappingParser createParser() {
		org.osate.xtext.aadl2.featuregroupmapping.ui.contentassist.antlr.internal.InternalFeatureGroupMappingParser result = new org.osate.xtext.aadl2.featuregroupmapping.ui.contentassist.antlr.internal.InternalFeatureGroupMappingParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getFGMGrammarRootAccess().getAlternatives(), "rule__FGMGrammarRoot__Alternatives");
					put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
					put(grammarAccess.getFGMGrammarRootAccess().getGroup_0(), "rule__FGMGrammarRoot__Group_0__0");
					put(grammarAccess.getFeatureMappingsetAccess().getGroup(), "rule__FeatureMappingset__Group__0");
					put(grammarAccess.getFeatureMappingsetAccess().getGroup_2(), "rule__FeatureMappingset__Group_2__0");
					put(grammarAccess.getFGMSubclauseAccess().getGroup(), "rule__FGMSubclause__Group__0");
					put(grammarAccess.getFeatureMappingAccess().getGroup(), "rule__FeatureMapping__Group__0");
					put(grammarAccess.getFeaturePathAccess().getGroup(), "rule__FeaturePath__Group__0");
					put(grammarAccess.getFeaturePathAccess().getGroup_0(), "rule__FeaturePath__Group_0__0");
					put(grammarAccess.getQFGTMREFAccess().getGroup(), "rule__QFGTMREF__Group__0");
					put(grammarAccess.getQFGTMREFAccess().getGroup_0(), "rule__QFGTMREF__Group_0__0");
					put(grammarAccess.getFGMGrammarRootAccess().getFgmlAssignment_0_1(), "rule__FGMGrammarRoot__FgmlAssignment_0_1");
					put(grammarAccess.getFGMGrammarRootAccess().getFgmscAssignment_1(), "rule__FGMGrammarRoot__FgmscAssignment_1");
					put(grammarAccess.getFGMLibraryAccess().getFeaturemappingsetAssignment(), "rule__FGMLibrary__FeaturemappingsetAssignment");
					put(grammarAccess.getFeatureMappingsetAccess().getNameAssignment_1(), "rule__FeatureMappingset__NameAssignment_1");
					put(grammarAccess.getFeatureMappingsetAccess().getMappingsetAssignment_2_1(), "rule__FeatureMappingset__MappingsetAssignment_2_1");
					put(grammarAccess.getFeatureMappingsetAccess().getMappingAssignment_3(), "rule__FeatureMappingset__MappingAssignment_3");
					put(grammarAccess.getFGMSubclauseAccess().getMappingsetAssignment_2(), "rule__FGMSubclause__MappingsetAssignment_2");
					put(grammarAccess.getFeatureMappingAccess().getLeftAssignment_0(), "rule__FeatureMapping__LeftAssignment_0");
					put(grammarAccess.getFeatureMappingAccess().getRightAssignment_2(), "rule__FeatureMapping__RightAssignment_2");
					put(grammarAccess.getFeaturePathAccess().getFeatureGroupTypeAssignment_0_0(), "rule__FeaturePath__FeatureGroupTypeAssignment_0_0");
					put(grammarAccess.getFeaturePathAccess().getFeatureReferenceAssignment_1(), "rule__FeaturePath__FeatureReferenceAssignment_1");
					put(grammarAccess.getFeatureReferenceAccess().getFeatureAssignment(), "rule__FeatureReference__FeatureAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.osate.xtext.aadl2.featuregroupmapping.ui.contentassist.antlr.internal.InternalFeatureGroupMappingParser typedParser = (org.osate.xtext.aadl2.featuregroupmapping.ui.contentassist.antlr.internal.InternalFeatureGroupMappingParser) parser;
			typedParser.entryRuleFGMGrammarRoot();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_SL_COMMENT" };
	}
	
	public FeatureGroupMappingGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(FeatureGroupMappingGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
