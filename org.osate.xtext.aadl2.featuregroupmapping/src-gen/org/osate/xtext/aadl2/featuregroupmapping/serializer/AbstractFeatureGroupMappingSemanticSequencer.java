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
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMSubclause;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingPackage;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureMapping;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureMappingset;
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
			case FeatureGroupMappingPackage.FGM_SUBCLAUSE:
				if(context == grammarAccess.getAnnexSubclauseRule() ||
				   context == grammarAccess.getFGMSubclauseRule()) {
					sequence_FGMSubclause(context, (FGMSubclause) semanticObject); 
					return; 
				}
				else break;
			case FeatureGroupMappingPackage.FEATURE_MAPPING:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getFeatureMappingRule()) {
					sequence_FeatureMapping(context, (FeatureMapping) semanticObject); 
					return; 
				}
				else break;
			case FeatureGroupMappingPackage.FEATURE_MAPPINGSET:
				if(context == grammarAccess.getFeatureMappingsetRule() ||
				   context == grammarAccess.getNamedElementRule()) {
					sequence_FeatureMappingset(context, (FeatureMappingset) semanticObject); 
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
	 *     featuremappingset+=FeatureMappingset+
	 */
	protected void sequence_FGMLibrary(EObject context, FGMLibrary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     mappingset=[FeatureMappingset|QFGTMREF]
	 */
	protected void sequence_FGMSubclause(EObject context, FGMSubclause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=FeaturePath right=FeaturePath)
	 */
	protected void sequence_FeatureMapping(EObject context, FeatureMapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID mappingset=[FeatureMappingset|QFGTMREF]? mapping+=FeatureMapping)
	 */
	protected void sequence_FeatureMappingset(EObject context, FeatureMappingset semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (featureGroupType=[FeatureGroupType|QFGTMREF] featureReference+=FeatureReference+)
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
