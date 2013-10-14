package org.osate.xtext.aadl2.featuregroupmapping.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMGrammarRoot;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMLibrary;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMMapping;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMSubclause;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGTMappingset;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingPackage;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeaturePath;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureReference;
import org.osate.xtext.aadl2.featuregroupmapping.services.FeatureGroupMappingGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractFeatureGroupMappingSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FeatureGroupMappingGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == FeatureGroupMappingPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case FeatureGroupMappingPackage.FGM_GRAMMAR_ROOT:
				if(context == grammarAccess.getFGMGrammarRootRule()) {
					sequence_FGMGrammarRoot(context, (FGMGrammarRoot) semanticObject); 
					return; 
				}
				else break;
			case FeatureGroupMappingPackage.FGM_LIBRARY:
				if(context == grammarAccess.getAnnexLibraryRule() ||
				   context == grammarAccess.getFGMLibraryRule()) {
					sequence_FGMLibrary(context, (FGMLibrary) semanticObject); 
					return; 
				}
				else break;
			case FeatureGroupMappingPackage.FGM_MAPPING:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getFGMMappingRule()) {
					sequence_FGMMapping(context, (FGMMapping) semanticObject); 
					return; 
				}
				else break;
			case FeatureGroupMappingPackage.FGM_SUBCLAUSE:
				if(context == grammarAccess.getAnnexSubclauseRule() ||
				   context == grammarAccess.getFGMSubclauseRule()) {
					sequence_FGMSubclause(context, (FGMSubclause) semanticObject); 
					return; 
				}
				else break;
			case FeatureGroupMappingPackage.FGT_MAPPINGSET:
				if(context == grammarAccess.getFGTMappingsetRule() ||
				   context == grammarAccess.getNamedELementRule()) {
					sequence_FGTMappingset(context, (FGTMappingset) semanticObject); 
					return; 
				}
				else break;
			case FeatureGroupMappingPackage.FEATURE_PATH:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getFeaturePathRule()) {
					sequence_FeaturePath(context, (FeaturePath) semanticObject); 
					return; 
				}
				else break;
			case FeatureGroupMappingPackage.FEATURE_REFERENCE:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getFeatureReferenceRule()) {
					sequence_FeatureReference(context, (FeatureReference) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (fgml=FGMLibrary | fgmsc=FGMSubclause)
	 */
	protected void sequence_FGMGrammarRoot(EObject context, FGMGrammarRoot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     fgtmappingset+=FGTMappingset+
	 */
	protected void sequence_FGMLibrary(EObject context, FGMLibrary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=FeaturePath right=FeaturePath)
	 */
	protected void sequence_FGMMapping(EObject context, FGMMapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     mappingset=[FGTMappingset|QFGTMREF]
	 */
	protected void sequence_FGMSubclause(EObject context, FGMSubclause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID mappingset=[FGTMappingset|QFGTMREF]? mapping+=FGMMapping)
	 */
	protected void sequence_FGTMappingset(EObject context, FGTMappingset semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (featureGroupType=[FeatureGroupType|ID] featureReference+=FeatureReference+)
	 */
	protected void sequence_FeaturePath(EObject context, FeaturePath semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     feature=[Feature|ID]
	 */
	protected void sequence_FeatureReference(EObject context, FeatureReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
