package org.osate.xtext.aadl2.featuregroupmapping.parsing;

import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.modelsupport.errorreporting.ParseErrorReporter;
import org.osate.annexsupport.AnnexParseUtil;
import org.osate.annexsupport.AnnexParser;
import org.osate.core.OsateCorePlugin;
import org.osate.xtext.aadl2.featuregroupmapping.parser.antlr.FeatureGroupMappingParser;
import org.osate.xtext.aadl2.featuregroupmapping.services.FeatureGroupMappingGrammarAccess;

import com.google.inject.Injector;

public class FGMAnnexParser implements AnnexParser { 
	// Need to get aadl resources for resolving components
	// For resolving package names etc
	
	
    protected Injector injector ;//= OsateCorePlugin.getDefault().getInjector("org.osate.xtext.aadl2.featuregroupmapping.FeatureGroupMapping");

	private FeatureGroupMappingParser fgmParser ;
	
	protected Injector getInjector(){
		if (injector == null){
			injector = OsateCorePlugin.getDefault().getInjector("org.osate.xtext.aadl2.featuregroupmapping.FeatureGroupMapping");
		}
		return injector;
	}

	protected  FeatureGroupMappingParser getParser() {
			if (fgmParser == null) {
				fgmParser = getInjector().getInstance(FeatureGroupMappingParser.class);
			}
		return fgmParser;
	}

	protected  FeatureGroupMappingGrammarAccess getGrammarAccess() {
		return getParser().getGrammarAccess();
	}
	
	public AnnexLibrary parseAnnexLibrary
			(
				String annexName, String source,
				String filename, int line, int column, ParseErrorReporter errReporter
			) {
		AnnexLibrary eal = (AnnexLibrary) AnnexParseUtil.parse(getParser(),source,getGrammarAccess().getFGMLibraryRule(),filename,line,column, errReporter);
		 return eal;

	 }

	public AnnexSubclause parseAnnexSubclause
			(
				String annexName, String source, String filename, 
				int line, int column, ParseErrorReporter errReporter
			) {
		AnnexSubclause eas = (AnnexSubclause) AnnexParseUtil.parse(getParser(),source,getGrammarAccess().getFGMSubclauseRule(),filename,line,column, errReporter);
		 return eas;
	 }



}