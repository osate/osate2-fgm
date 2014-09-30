package org.osate.xtext.aadl2.featuregroupmapping.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.osate.aadl2.Aadl2Package;
import org.osate.aadl2.ArrayRange;
import org.osate.aadl2.BasicPropertyAssociation;
import org.osate.aadl2.BooleanLiteral;
import org.osate.aadl2.ClassifierValue;
import org.osate.aadl2.ComputedValue;
import org.osate.aadl2.ContainedNamedElement;
import org.osate.aadl2.ContainmentPathElement;
import org.osate.aadl2.IntegerLiteral;
import org.osate.aadl2.ListValue;
import org.osate.aadl2.ModalPropertyValue;
import org.osate.aadl2.NamedValue;
import org.osate.aadl2.Operation;
import org.osate.aadl2.PropertyAssociation;
import org.osate.aadl2.RangeValue;
import org.osate.aadl2.RealLiteral;
import org.osate.aadl2.RecordValue;
import org.osate.aadl2.ReferenceValue;
import org.osate.aadl2.StringLiteral;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMGrammarRoot;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMLibrary;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMSubclause;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingPackage;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureMapping;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureMappingset;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeaturePath;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureReference;
import org.osate.xtext.aadl2.featuregroupmapping.services.FeatureGroupMappingGrammarAccess;
import org.osate.xtext.aadl2.properties.serializer.PropertiesSemanticSequencer;

@SuppressWarnings("all")
public abstract class AbstractFeatureGroupMappingSemanticSequencer extends PropertiesSemanticSequencer {

	@Inject
	private FeatureGroupMappingGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == Aadl2Package.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case Aadl2Package.ARRAY_RANGE:
				if(context == grammarAccess.getArrayRangeRule()) {
					sequence_ArrayRange(context, (ArrayRange) semanticObject); 
					return; 
				}
				else break;
			case Aadl2Package.BASIC_PROPERTY_ASSOCIATION:
				if(context == grammarAccess.getFieldPropertyAssociationRule()) {
					sequence_FieldPropertyAssociation(context, (BasicPropertyAssociation) semanticObject); 
					return; 
				}
				else break;
			case Aadl2Package.BOOLEAN_LITERAL:
				if(context == grammarAccess.getBooleanLiteralRule() ||
				   context == grammarAccess.getPropertyExpressionRule()) {
					sequence_BooleanLiteral(context, (BooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case Aadl2Package.CLASSIFIER_VALUE:
				if(context == grammarAccess.getComponentClassifierTermRule() ||
				   context == grammarAccess.getPropertyExpressionRule()) {
					sequence_ComponentClassifierTerm(context, (ClassifierValue) semanticObject); 
					return; 
				}
				else break;
			case Aadl2Package.COMPUTED_VALUE:
				if(context == grammarAccess.getComputedTermRule() ||
				   context == grammarAccess.getPropertyExpressionRule()) {
					sequence_ComputedTerm(context, (ComputedValue) semanticObject); 
					return; 
				}
				else break;
			case Aadl2Package.CONTAINED_NAMED_ELEMENT:
				if(context == grammarAccess.getContainmentPathRule()) {
					sequence_ContainmentPath(context, (ContainedNamedElement) semanticObject); 
					return; 
				}
				else break;
			case Aadl2Package.CONTAINMENT_PATH_ELEMENT:
				if(context == grammarAccess.getContainmentPathElementRule()) {
					sequence_ContainmentPathElement(context, (ContainmentPathElement) semanticObject); 
					return; 
				}
				else break;
			case Aadl2Package.INTEGER_LITERAL:
				if(context == grammarAccess.getIntegerTermRule() ||
				   context == grammarAccess.getNumAltRule() ||
				   context == grammarAccess.getPropertyExpressionRule()) {
					sequence_IntegerTerm(context, (IntegerLiteral) semanticObject); 
					return; 
				}
				else break;
			case Aadl2Package.LIST_VALUE:
				if(context == grammarAccess.getListTermRule() ||
				   context == grammarAccess.getPropertyExpressionRule()) {
					sequence_ListTerm(context, (ListValue) semanticObject); 
					return; 
				}
				else break;
			case Aadl2Package.MODAL_PROPERTY_VALUE:
				if(context == grammarAccess.getModalPropertyValueRule()) {
					sequence_ModalPropertyValue(context, (ModalPropertyValue) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getOptionalModalPropertyValueRule()) {
					sequence_OptionalModalPropertyValue(context, (ModalPropertyValue) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPropertyValueRule()) {
					sequence_PropertyValue(context, (ModalPropertyValue) semanticObject); 
					return; 
				}
				else break;
			case Aadl2Package.NAMED_VALUE:
				if(context == grammarAccess.getConstantValueRule() ||
				   context == grammarAccess.getNumAltRule()) {
					sequence_ConstantValue(context, (NamedValue) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getLiteralorReferenceTermRule() ||
				   context == grammarAccess.getPropertyExpressionRule()) {
					sequence_LiteralorReferenceTerm(context, (NamedValue) semanticObject); 
					return; 
				}
				else break;
			case Aadl2Package.OPERATION:
				if(context == grammarAccess.getNumAltRule() ||
				   context == grammarAccess.getSignedConstantRule()) {
					sequence_SignedConstant(context, (Operation) semanticObject); 
					return; 
				}
				else break;
			case Aadl2Package.PROPERTY_ASSOCIATION:
				if(context == grammarAccess.getBasicPropertyAssociationRule()) {
					sequence_BasicPropertyAssociation(context, (PropertyAssociation) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getContainedPropertyAssociationRule() ||
				   context == grammarAccess.getPModelRule()) {
					sequence_ContainedPropertyAssociation(context, (PropertyAssociation) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPropertyAssociationRule()) {
					sequence_PropertyAssociation(context, (PropertyAssociation) semanticObject); 
					return; 
				}
				else break;
			case Aadl2Package.RANGE_VALUE:
				if(context == grammarAccess.getNumericRangeTermRule() ||
				   context == grammarAccess.getPropertyExpressionRule()) {
					sequence_NumericRangeTerm(context, (RangeValue) semanticObject); 
					return; 
				}
				else break;
			case Aadl2Package.REAL_LITERAL:
				if(context == grammarAccess.getNumAltRule() ||
				   context == grammarAccess.getPropertyExpressionRule() ||
				   context == grammarAccess.getRealTermRule()) {
					sequence_RealTerm(context, (RealLiteral) semanticObject); 
					return; 
				}
				else break;
			case Aadl2Package.RECORD_VALUE:
				if(context == grammarAccess.getOldRecordTermRule()) {
					sequence_OldRecordTerm(context, (RecordValue) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPropertyExpressionRule() ||
				   context == grammarAccess.getRecordTermRule()) {
					sequence_RecordTerm(context, (RecordValue) semanticObject); 
					return; 
				}
				else break;
			case Aadl2Package.REFERENCE_VALUE:
				if(context == grammarAccess.getPropertyExpressionRule() ||
				   context == grammarAccess.getReferenceTermRule()) {
					sequence_ReferenceTerm(context, (ReferenceValue) semanticObject); 
					return; 
				}
				else break;
			case Aadl2Package.STRING_LITERAL:
				if(context == grammarAccess.getPropertyExpressionRule() ||
				   context == grammarAccess.getStringTermRule()) {
					sequence_StringTerm(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == FeatureGroupMappingPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
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
