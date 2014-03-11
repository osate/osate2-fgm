/*
* generated by Xtext
*/
package org.osate.xtext.aadl2.featuregroupmapping.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;


@Singleton
public class FeatureGroupMappingGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class FGMGrammarRootElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FGMGrammarRoot");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cLibraryKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cFgmlAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cFgmlFGMLibraryParserRuleCall_0_1_0 = (RuleCall)cFgmlAssignment_0_1.eContents().get(0);
		private final Assignment cFgmscAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cFgmscFGMSubclauseParserRuleCall_1_0 = (RuleCall)cFgmscAssignment_1.eContents().get(0);
		
		//// Xtext assumes a single grammar root. This rule is not actively interpreted.
		//// We actually have two separate ones, each identified in the Annex Parser interface
		//FGMGrammarRoot:
		//	"library" fgml=FGMLibrary | fgmsc=FGMSubclause;
		public ParserRule getRule() { return rule; }

		//"library" fgml=FGMLibrary | fgmsc=FGMSubclause
		public Alternatives getAlternatives() { return cAlternatives; }

		//"library" fgml=FGMLibrary
		public Group getGroup_0() { return cGroup_0; }

		//"library"
		public Keyword getLibraryKeyword_0_0() { return cLibraryKeyword_0_0; }

		//fgml=FGMLibrary
		public Assignment getFgmlAssignment_0_1() { return cFgmlAssignment_0_1; }

		//FGMLibrary
		public RuleCall getFgmlFGMLibraryParserRuleCall_0_1_0() { return cFgmlFGMLibraryParserRuleCall_0_1_0; }

		//fgmsc=FGMSubclause
		public Assignment getFgmscAssignment_1() { return cFgmscAssignment_1; }

		//FGMSubclause
		public RuleCall getFgmscFGMSubclauseParserRuleCall_1_0() { return cFgmscFGMSubclauseParserRuleCall_1_0; }
	}

	public class FGMLibraryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FGMLibrary");
		private final Assignment cFeaturemappingsetAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cFeaturemappingsetFeatureMappingsetParserRuleCall_0 = (RuleCall)cFeaturemappingsetAssignment.eContents().get(0);
		
		//// the root for  AnnexLibrary parsing
		//FGMLibrary:
		//	featuremappingset+=FeatureMappingset+;
		public ParserRule getRule() { return rule; }

		//featuremappingset+=FeatureMappingset+
		public Assignment getFeaturemappingsetAssignment() { return cFeaturemappingsetAssignment; }

		//FeatureMappingset
		public RuleCall getFeaturemappingsetFeatureMappingsetParserRuleCall_0() { return cFeaturemappingsetFeatureMappingsetParserRuleCall_0; }
	}

	public class FeatureMappingsetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FeatureMappingset");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cMappingsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cExtendsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cMappingsetAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cMappingsetFeatureMappingsetCrossReference_3_1_0 = (CrossReference)cMappingsetAssignment_3_1.eContents().get(0);
		private final RuleCall cMappingsetFeatureMappingsetQFGTMREFParserRuleCall_3_1_0_1 = (RuleCall)cMappingsetFeatureMappingsetCrossReference_3_1_0.eContents().get(1);
		private final Assignment cMappingAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMappingFeatureMappingParserRuleCall_4_0 = (RuleCall)cMappingAssignment_4.eContents().get(0);
		private final Keyword cEndKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cMappingsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//FeatureMappingset:
		//	name=ID ":" "mappings" ("extends" mappingset=[FeatureMappingset|QFGTMREF])? mapping+=FeatureMapping "end" "mappings"
		//	";";
		public ParserRule getRule() { return rule; }

		//name=ID ":" "mappings" ("extends" mappingset=[FeatureMappingset|QFGTMREF])? mapping+=FeatureMapping "end" "mappings" ";"
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }

		//"mappings"
		public Keyword getMappingsKeyword_2() { return cMappingsKeyword_2; }

		//("extends" mappingset=[FeatureMappingset|QFGTMREF])?
		public Group getGroup_3() { return cGroup_3; }

		//"extends"
		public Keyword getExtendsKeyword_3_0() { return cExtendsKeyword_3_0; }

		//mappingset=[FeatureMappingset|QFGTMREF]
		public Assignment getMappingsetAssignment_3_1() { return cMappingsetAssignment_3_1; }

		//[FeatureMappingset|QFGTMREF]
		public CrossReference getMappingsetFeatureMappingsetCrossReference_3_1_0() { return cMappingsetFeatureMappingsetCrossReference_3_1_0; }

		//QFGTMREF
		public RuleCall getMappingsetFeatureMappingsetQFGTMREFParserRuleCall_3_1_0_1() { return cMappingsetFeatureMappingsetQFGTMREFParserRuleCall_3_1_0_1; }

		//mapping+=FeatureMapping
		public Assignment getMappingAssignment_4() { return cMappingAssignment_4; }

		//FeatureMapping
		public RuleCall getMappingFeatureMappingParserRuleCall_4_0() { return cMappingFeatureMappingParserRuleCall_4_0; }

		//"end"
		public Keyword getEndKeyword_5() { return cEndKeyword_5; }

		//"mappings"
		public Keyword getMappingsKeyword_6() { return cMappingsKeyword_6; }

		//";"
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class FGMSubclauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FGMSubclause");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cMappingsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cMappingsetAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cMappingsetFeatureMappingsetCrossReference_2_0 = (CrossReference)cMappingsetAssignment_2.eContents().get(0);
		private final RuleCall cMappingsetFeatureMappingsetQFGTMREFParserRuleCall_2_0_1 = (RuleCall)cMappingsetFeatureMappingsetCrossReference_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//FGMSubclause:
		//	"use" "mappings" mappingset=[FeatureMappingset|QFGTMREF] ";";
		public ParserRule getRule() { return rule; }

		//"use" "mappings" mappingset=[FeatureMappingset|QFGTMREF] ";"
		public Group getGroup() { return cGroup; }

		//"use"
		public Keyword getUseKeyword_0() { return cUseKeyword_0; }

		//"mappings"
		public Keyword getMappingsKeyword_1() { return cMappingsKeyword_1; }

		//mappingset=[FeatureMappingset|QFGTMREF]
		public Assignment getMappingsetAssignment_2() { return cMappingsetAssignment_2; }

		//[FeatureMappingset|QFGTMREF]
		public CrossReference getMappingsetFeatureMappingsetCrossReference_2_0() { return cMappingsetFeatureMappingsetCrossReference_2_0; }

		//QFGTMREF
		public RuleCall getMappingsetFeatureMappingsetQFGTMREFParserRuleCall_2_0_1() { return cMappingsetFeatureMappingsetQFGTMREFParserRuleCall_2_0_1; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}

	public class AnnexLibraryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AnnexLibrary");
		private final RuleCall cFGMLibraryParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//AnnexLibrary returns aadl2::AnnexLibrary:
		//	FGMLibrary;
		public ParserRule getRule() { return rule; }

		//FGMLibrary
		public RuleCall getFGMLibraryParserRuleCall() { return cFGMLibraryParserRuleCall; }
	}

	public class AnnexSubclauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AnnexSubclause");
		private final RuleCall cFGMSubclauseParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//AnnexSubclause returns aadl2::AnnexSubclause:
		//	FGMSubclause;
		public ParserRule getRule() { return rule; }

		//FGMSubclause
		public RuleCall getFGMSubclauseParserRuleCall() { return cFGMSubclauseParserRuleCall; }
	}

	public class NamedElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NamedElement");
		private final RuleCall cFeatureMappingsetParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//// FGMLibrary is a named element that can be referenced by others	 
		//NamedElement returns aadl2::NamedElement:
		//	FeatureMappingset;
		public ParserRule getRule() { return rule; }

		//FeatureMappingset
		public RuleCall getFeatureMappingsetParserRuleCall() { return cFeatureMappingsetParserRuleCall; }
	}

	public class ElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Element");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cFeatureMappingParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cFeaturePathParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cFeatureReferenceParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//// all the other FGM elements must be a subclass of (aadl2) Element
		//Element returns aadl2::Element:
		//	FeatureMapping | FeaturePath | FeatureReference;
		public ParserRule getRule() { return rule; }

		//FeatureMapping | FeaturePath | FeatureReference
		public Alternatives getAlternatives() { return cAlternatives; }

		//FeatureMapping
		public RuleCall getFeatureMappingParserRuleCall_0() { return cFeatureMappingParserRuleCall_0; }

		//FeaturePath
		public RuleCall getFeaturePathParserRuleCall_1() { return cFeaturePathParserRuleCall_1; }

		//FeatureReference
		public RuleCall getFeatureReferenceParserRuleCall_2() { return cFeatureReferenceParserRuleCall_2; }
	}

	public class FeatureMappingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FeatureMapping");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLeftAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLeftFeaturePathParserRuleCall_0_0 = (RuleCall)cLeftAssignment_0.eContents().get(0);
		private final Keyword cLessThanSignEqualsSignGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cRightAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cRightFeaturePathParserRuleCall_2_0 = (RuleCall)cRightAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//FeatureMapping:
		//	left=FeaturePath "<=>" right=FeaturePath ";";
		public ParserRule getRule() { return rule; }

		//left=FeaturePath "<=>" right=FeaturePath ";"
		public Group getGroup() { return cGroup; }

		//left=FeaturePath
		public Assignment getLeftAssignment_0() { return cLeftAssignment_0; }

		//FeaturePath
		public RuleCall getLeftFeaturePathParserRuleCall_0_0() { return cLeftFeaturePathParserRuleCall_0_0; }

		//"<=>"
		public Keyword getLessThanSignEqualsSignGreaterThanSignKeyword_1() { return cLessThanSignEqualsSignGreaterThanSignKeyword_1; }

		//right=FeaturePath
		public Assignment getRightAssignment_2() { return cRightAssignment_2; }

		//FeaturePath
		public RuleCall getRightFeaturePathParserRuleCall_2_0() { return cRightFeaturePathParserRuleCall_2_0; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}

	public class FeaturePathElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FeaturePath");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Assignment cFeatureGroupTypeAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final CrossReference cFeatureGroupTypeFeatureGroupTypeCrossReference_0_0_0 = (CrossReference)cFeatureGroupTypeAssignment_0_0.eContents().get(0);
		private final RuleCall cFeatureGroupTypeFeatureGroupTypeQFGTMREFParserRuleCall_0_0_0_1 = (RuleCall)cFeatureGroupTypeFeatureGroupTypeCrossReference_0_0_0.eContents().get(1);
		private final Keyword cFullStopKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cFeatureReferenceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFeatureReferenceFeatureReferenceParserRuleCall_1_0 = (RuleCall)cFeatureReferenceAssignment_1.eContents().get(0);
		
		//FeaturePath:
		//	(featureGroupType=[aadl2::FeatureGroupType|QFGTMREF] ".") featureReference+=FeatureReference+;
		public ParserRule getRule() { return rule; }

		//(featureGroupType=[aadl2::FeatureGroupType|QFGTMREF] ".") featureReference+=FeatureReference+
		public Group getGroup() { return cGroup; }

		//featureGroupType=[aadl2::FeatureGroupType|QFGTMREF] "."
		public Group getGroup_0() { return cGroup_0; }

		//featureGroupType=[aadl2::FeatureGroupType|QFGTMREF]
		public Assignment getFeatureGroupTypeAssignment_0_0() { return cFeatureGroupTypeAssignment_0_0; }

		//[aadl2::FeatureGroupType|QFGTMREF]
		public CrossReference getFeatureGroupTypeFeatureGroupTypeCrossReference_0_0_0() { return cFeatureGroupTypeFeatureGroupTypeCrossReference_0_0_0; }

		//QFGTMREF
		public RuleCall getFeatureGroupTypeFeatureGroupTypeQFGTMREFParserRuleCall_0_0_0_1() { return cFeatureGroupTypeFeatureGroupTypeQFGTMREFParserRuleCall_0_0_0_1; }

		//"."
		public Keyword getFullStopKeyword_0_1() { return cFullStopKeyword_0_1; }

		//featureReference+=FeatureReference+
		public Assignment getFeatureReferenceAssignment_1() { return cFeatureReferenceAssignment_1; }

		//FeatureReference
		public RuleCall getFeatureReferenceFeatureReferenceParserRuleCall_1_0() { return cFeatureReferenceFeatureReferenceParserRuleCall_1_0; }
	}

	public class FeatureReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FeatureReference");
		private final Assignment cFeatureAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cFeatureFeatureCrossReference_0 = (CrossReference)cFeatureAssignment.eContents().get(0);
		private final RuleCall cFeatureFeatureIDTerminalRuleCall_0_1 = (RuleCall)cFeatureFeatureCrossReference_0.eContents().get(1);
		
		//FeatureReference:
		//	feature=[aadl2::Feature];
		public ParserRule getRule() { return rule; }

		//feature=[aadl2::Feature]
		public Assignment getFeatureAssignment() { return cFeatureAssignment; }

		//[aadl2::Feature]
		public CrossReference getFeatureFeatureCrossReference_0() { return cFeatureFeatureCrossReference_0; }

		//ID
		public RuleCall getFeatureFeatureIDTerminalRuleCall_0_1() { return cFeatureFeatureIDTerminalRuleCall_0_1; }
	}

	public class QFGTMREFElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QFGTMREF");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_0_0 = (RuleCall)cGroup_0.eContents().get(0);
		private final Keyword cColonColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//QFGTMREF:
		//	(ID "::")* ID;
		public ParserRule getRule() { return rule; }

		//(ID "::")* ID
		public Group getGroup() { return cGroup; }

		//(ID "::")*
		public Group getGroup_0() { return cGroup_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_0_0() { return cIDTerminalRuleCall_0_0; }

		//"::"
		public Keyword getColonColonKeyword_0_1() { return cColonColonKeyword_0_1; }

		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	
	
	private FGMGrammarRootElements pFGMGrammarRoot;
	private FGMLibraryElements pFGMLibrary;
	private FeatureMappingsetElements pFeatureMappingset;
	private FGMSubclauseElements pFGMSubclause;
	private AnnexLibraryElements pAnnexLibrary;
	private AnnexSubclauseElements pAnnexSubclause;
	private NamedElementElements pNamedElement;
	private ElementElements pElement;
	private FeatureMappingElements pFeatureMapping;
	private FeaturePathElements pFeaturePath;
	private FeatureReferenceElements pFeatureReference;
	private TerminalRule tSL_COMMENT;
	private TerminalRule tID;
	private QFGTMREFElements pQFGTMREF;
	private TerminalRule tWS;
	
	private final Grammar grammar;

	@Inject
	public FeatureGroupMappingGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.osate.xtext.aadl2.featuregroupmapping.FeatureGroupMapping".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	
	//// Xtext assumes a single grammar root. This rule is not actively interpreted.
	//// We actually have two separate ones, each identified in the Annex Parser interface
	//FGMGrammarRoot:
	//	"library" fgml=FGMLibrary | fgmsc=FGMSubclause;
	public FGMGrammarRootElements getFGMGrammarRootAccess() {
		return (pFGMGrammarRoot != null) ? pFGMGrammarRoot : (pFGMGrammarRoot = new FGMGrammarRootElements());
	}
	
	public ParserRule getFGMGrammarRootRule() {
		return getFGMGrammarRootAccess().getRule();
	}

	//// the root for  AnnexLibrary parsing
	//FGMLibrary:
	//	featuremappingset+=FeatureMappingset+;
	public FGMLibraryElements getFGMLibraryAccess() {
		return (pFGMLibrary != null) ? pFGMLibrary : (pFGMLibrary = new FGMLibraryElements());
	}
	
	public ParserRule getFGMLibraryRule() {
		return getFGMLibraryAccess().getRule();
	}

	//FeatureMappingset:
	//	name=ID ":" "mappings" ("extends" mappingset=[FeatureMappingset|QFGTMREF])? mapping+=FeatureMapping "end" "mappings"
	//	";";
	public FeatureMappingsetElements getFeatureMappingsetAccess() {
		return (pFeatureMappingset != null) ? pFeatureMappingset : (pFeatureMappingset = new FeatureMappingsetElements());
	}
	
	public ParserRule getFeatureMappingsetRule() {
		return getFeatureMappingsetAccess().getRule();
	}

	//FGMSubclause:
	//	"use" "mappings" mappingset=[FeatureMappingset|QFGTMREF] ";";
	public FGMSubclauseElements getFGMSubclauseAccess() {
		return (pFGMSubclause != null) ? pFGMSubclause : (pFGMSubclause = new FGMSubclauseElements());
	}
	
	public ParserRule getFGMSubclauseRule() {
		return getFGMSubclauseAccess().getRule();
	}

	//AnnexLibrary returns aadl2::AnnexLibrary:
	//	FGMLibrary;
	public AnnexLibraryElements getAnnexLibraryAccess() {
		return (pAnnexLibrary != null) ? pAnnexLibrary : (pAnnexLibrary = new AnnexLibraryElements());
	}
	
	public ParserRule getAnnexLibraryRule() {
		return getAnnexLibraryAccess().getRule();
	}

	//AnnexSubclause returns aadl2::AnnexSubclause:
	//	FGMSubclause;
	public AnnexSubclauseElements getAnnexSubclauseAccess() {
		return (pAnnexSubclause != null) ? pAnnexSubclause : (pAnnexSubclause = new AnnexSubclauseElements());
	}
	
	public ParserRule getAnnexSubclauseRule() {
		return getAnnexSubclauseAccess().getRule();
	}

	//// FGMLibrary is a named element that can be referenced by others	 
	//NamedElement returns aadl2::NamedElement:
	//	FeatureMappingset;
	public NamedElementElements getNamedElementAccess() {
		return (pNamedElement != null) ? pNamedElement : (pNamedElement = new NamedElementElements());
	}
	
	public ParserRule getNamedElementRule() {
		return getNamedElementAccess().getRule();
	}

	//// all the other FGM elements must be a subclass of (aadl2) Element
	//Element returns aadl2::Element:
	//	FeatureMapping | FeaturePath | FeatureReference;
	public ElementElements getElementAccess() {
		return (pElement != null) ? pElement : (pElement = new ElementElements());
	}
	
	public ParserRule getElementRule() {
		return getElementAccess().getRule();
	}

	//FeatureMapping:
	//	left=FeaturePath "<=>" right=FeaturePath ";";
	public FeatureMappingElements getFeatureMappingAccess() {
		return (pFeatureMapping != null) ? pFeatureMapping : (pFeatureMapping = new FeatureMappingElements());
	}
	
	public ParserRule getFeatureMappingRule() {
		return getFeatureMappingAccess().getRule();
	}

	//FeaturePath:
	//	(featureGroupType=[aadl2::FeatureGroupType|QFGTMREF] ".") featureReference+=FeatureReference+;
	public FeaturePathElements getFeaturePathAccess() {
		return (pFeaturePath != null) ? pFeaturePath : (pFeaturePath = new FeaturePathElements());
	}
	
	public ParserRule getFeaturePathRule() {
		return getFeaturePathAccess().getRule();
	}

	//FeatureReference:
	//	feature=[aadl2::Feature];
	public FeatureReferenceElements getFeatureReferenceAccess() {
		return (pFeatureReference != null) ? pFeatureReference : (pFeatureReference = new FeatureReferenceElements());
	}
	
	public ParserRule getFeatureReferenceRule() {
		return getFeatureReferenceAccess().getRule();
	}

	//terminal SL_COMMENT:
	//	"--" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return (tSL_COMMENT != null) ? tSL_COMMENT : (tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SL_COMMENT"));
	} 

	//terminal ID:
	//	("a".."z" | "A".."Z") ("_"? ("a".."z" | "A".."Z" | "0".."9"))*;
	public TerminalRule getIDRule() {
		return (tID != null) ? tID : (tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ID"));
	} 

	//QFGTMREF:
	//	(ID "::")* ID;
	public QFGTMREFElements getQFGTMREFAccess() {
		return (pQFGTMREF != null) ? pQFGTMREF : (pQFGTMREF = new QFGTMREFElements());
	}
	
	public ParserRule getQFGTMREFRule() {
		return getQFGTMREFAccess().getRule();
	}

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return (tWS != null) ? tWS : (tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "WS"));
	} 
}
