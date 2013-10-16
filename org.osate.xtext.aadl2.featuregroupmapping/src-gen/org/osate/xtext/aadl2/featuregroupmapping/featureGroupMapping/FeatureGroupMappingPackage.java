/**
 */
package org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.osate.aadl2.Aadl2Package;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingFactory
 * @model kind="package"
 * @generated
 */
public interface FeatureGroupMappingPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "featureGroupMapping";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.aadl.info/FGM";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "featureGroupMapping";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FeatureGroupMappingPackage eINSTANCE = org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeatureGroupMappingPackageImpl.init();

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FGMGrammarRootImpl <em>FGM Grammar Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FGMGrammarRootImpl
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeatureGroupMappingPackageImpl#getFGMGrammarRoot()
   * @generated
   */
  int FGM_GRAMMAR_ROOT = 0;

  /**
   * The feature id for the '<em><b>Fgml</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FGM_GRAMMAR_ROOT__FGML = 0;

  /**
   * The feature id for the '<em><b>Fgmsc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FGM_GRAMMAR_ROOT__FGMSC = 1;

  /**
   * The number of structural features of the '<em>FGM Grammar Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FGM_GRAMMAR_ROOT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FGMLibraryImpl <em>FGM Library</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FGMLibraryImpl
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeatureGroupMappingPackageImpl#getFGMLibrary()
   * @generated
   */
  int FGM_LIBRARY = 1;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FGM_LIBRARY__OWNED_ELEMENT = Aadl2Package.ANNEX_LIBRARY__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FGM_LIBRARY__OWNED_COMMENT = Aadl2Package.ANNEX_LIBRARY__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FGM_LIBRARY__NAME = Aadl2Package.ANNEX_LIBRARY__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FGM_LIBRARY__QUALIFIED_NAME = Aadl2Package.ANNEX_LIBRARY__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FGM_LIBRARY__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.ANNEX_LIBRARY__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Featuremappingset</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FGM_LIBRARY__FEATUREMAPPINGSET = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>FGM Library</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FGM_LIBRARY_FEATURE_COUNT = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeatureMappingsetImpl <em>Feature Mappingset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeatureMappingsetImpl
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeatureGroupMappingPackageImpl#getFeatureMappingset()
   * @generated
   */
  int FEATURE_MAPPINGSET = 2;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAPPINGSET__OWNED_ELEMENT = Aadl2Package.ANNEX_SUBCLAUSE__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAPPINGSET__OWNED_COMMENT = Aadl2Package.ANNEX_SUBCLAUSE__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAPPINGSET__NAME = Aadl2Package.ANNEX_SUBCLAUSE__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAPPINGSET__QUALIFIED_NAME = Aadl2Package.ANNEX_SUBCLAUSE__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAPPINGSET__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.ANNEX_SUBCLAUSE__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>In Mode</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAPPINGSET__IN_MODE = Aadl2Package.ANNEX_SUBCLAUSE__IN_MODE;

  /**
   * The feature id for the '<em><b>Mappingset</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAPPINGSET__MAPPINGSET = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Mapping</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAPPINGSET__MAPPING = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Feature Mappingset</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAPPINGSET_FEATURE_COUNT = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FGMSubclauseImpl <em>FGM Subclause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FGMSubclauseImpl
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeatureGroupMappingPackageImpl#getFGMSubclause()
   * @generated
   */
  int FGM_SUBCLAUSE = 3;

  /**
   * The feature id for the '<em><b>Mappingset</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FGM_SUBCLAUSE__MAPPINGSET = 0;

  /**
   * The number of structural features of the '<em>FGM Subclause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FGM_SUBCLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeatureMappingImpl <em>Feature Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeatureMappingImpl
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeatureGroupMappingPackageImpl#getFeatureMapping()
   * @generated
   */
  int FEATURE_MAPPING = 4;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAPPING__OWNED_ELEMENT = Aadl2Package.ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAPPING__OWNED_COMMENT = Aadl2Package.ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAPPING__LEFT = Aadl2Package.ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAPPING__RIGHT = Aadl2Package.ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Feature Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_MAPPING_FEATURE_COUNT = Aadl2Package.ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeaturePathImpl <em>Feature Path</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeaturePathImpl
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeatureGroupMappingPackageImpl#getFeaturePath()
   * @generated
   */
  int FEATURE_PATH = 5;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_PATH__OWNED_ELEMENT = Aadl2Package.ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_PATH__OWNED_COMMENT = Aadl2Package.ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Feature Group Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_PATH__FEATURE_GROUP_TYPE = Aadl2Package.ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Feature Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_PATH__FEATURE_REFERENCE = Aadl2Package.ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Feature Path</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_PATH_FEATURE_COUNT = Aadl2Package.ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeatureReferenceImpl <em>Feature Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeatureReferenceImpl
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeatureGroupMappingPackageImpl#getFeatureReference()
   * @generated
   */
  int FEATURE_REFERENCE = 6;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_REFERENCE__OWNED_ELEMENT = Aadl2Package.ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_REFERENCE__OWNED_COMMENT = Aadl2Package.ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_REFERENCE__FEATURE = Aadl2Package.ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Feature Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_REFERENCE_FEATURE_COUNT = Aadl2Package.ELEMENT_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMGrammarRoot <em>FGM Grammar Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FGM Grammar Root</em>'.
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMGrammarRoot
   * @generated
   */
  EClass getFGMGrammarRoot();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMGrammarRoot#getFgml <em>Fgml</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fgml</em>'.
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMGrammarRoot#getFgml()
   * @see #getFGMGrammarRoot()
   * @generated
   */
  EReference getFGMGrammarRoot_Fgml();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMGrammarRoot#getFgmsc <em>Fgmsc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fgmsc</em>'.
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMGrammarRoot#getFgmsc()
   * @see #getFGMGrammarRoot()
   * @generated
   */
  EReference getFGMGrammarRoot_Fgmsc();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMLibrary <em>FGM Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FGM Library</em>'.
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMLibrary
   * @generated
   */
  EClass getFGMLibrary();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMLibrary#getFeaturemappingset <em>Featuremappingset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Featuremappingset</em>'.
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMLibrary#getFeaturemappingset()
   * @see #getFGMLibrary()
   * @generated
   */
  EReference getFGMLibrary_Featuremappingset();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureMappingset <em>Feature Mappingset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Mappingset</em>'.
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureMappingset
   * @generated
   */
  EClass getFeatureMappingset();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureMappingset#getMappingset <em>Mappingset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Mappingset</em>'.
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureMappingset#getMappingset()
   * @see #getFeatureMappingset()
   * @generated
   */
  EReference getFeatureMappingset_Mappingset();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureMappingset#getMapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mapping</em>'.
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureMappingset#getMapping()
   * @see #getFeatureMappingset()
   * @generated
   */
  EReference getFeatureMappingset_Mapping();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMSubclause <em>FGM Subclause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FGM Subclause</em>'.
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMSubclause
   * @generated
   */
  EClass getFGMSubclause();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMSubclause#getMappingset <em>Mappingset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Mappingset</em>'.
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMSubclause#getMappingset()
   * @see #getFGMSubclause()
   * @generated
   */
  EReference getFGMSubclause_Mappingset();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureMapping <em>Feature Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Mapping</em>'.
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureMapping
   * @generated
   */
  EClass getFeatureMapping();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureMapping#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureMapping#getLeft()
   * @see #getFeatureMapping()
   * @generated
   */
  EReference getFeatureMapping_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureMapping#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureMapping#getRight()
   * @see #getFeatureMapping()
   * @generated
   */
  EReference getFeatureMapping_Right();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeaturePath <em>Feature Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Path</em>'.
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeaturePath
   * @generated
   */
  EClass getFeaturePath();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeaturePath#getFeatureGroupType <em>Feature Group Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature Group Type</em>'.
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeaturePath#getFeatureGroupType()
   * @see #getFeaturePath()
   * @generated
   */
  EReference getFeaturePath_FeatureGroupType();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeaturePath#getFeatureReference <em>Feature Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Feature Reference</em>'.
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeaturePath#getFeatureReference()
   * @see #getFeaturePath()
   * @generated
   */
  EReference getFeaturePath_FeatureReference();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureReference <em>Feature Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Reference</em>'.
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureReference
   * @generated
   */
  EClass getFeatureReference();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureReference#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureReference#getFeature()
   * @see #getFeatureReference()
   * @generated
   */
  EReference getFeatureReference_Feature();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FeatureGroupMappingFactory getFeatureGroupMappingFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FGMGrammarRootImpl <em>FGM Grammar Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FGMGrammarRootImpl
     * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeatureGroupMappingPackageImpl#getFGMGrammarRoot()
     * @generated
     */
    EClass FGM_GRAMMAR_ROOT = eINSTANCE.getFGMGrammarRoot();

    /**
     * The meta object literal for the '<em><b>Fgml</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FGM_GRAMMAR_ROOT__FGML = eINSTANCE.getFGMGrammarRoot_Fgml();

    /**
     * The meta object literal for the '<em><b>Fgmsc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FGM_GRAMMAR_ROOT__FGMSC = eINSTANCE.getFGMGrammarRoot_Fgmsc();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FGMLibraryImpl <em>FGM Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FGMLibraryImpl
     * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeatureGroupMappingPackageImpl#getFGMLibrary()
     * @generated
     */
    EClass FGM_LIBRARY = eINSTANCE.getFGMLibrary();

    /**
     * The meta object literal for the '<em><b>Featuremappingset</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FGM_LIBRARY__FEATUREMAPPINGSET = eINSTANCE.getFGMLibrary_Featuremappingset();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeatureMappingsetImpl <em>Feature Mappingset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeatureMappingsetImpl
     * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeatureGroupMappingPackageImpl#getFeatureMappingset()
     * @generated
     */
    EClass FEATURE_MAPPINGSET = eINSTANCE.getFeatureMappingset();

    /**
     * The meta object literal for the '<em><b>Mappingset</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_MAPPINGSET__MAPPINGSET = eINSTANCE.getFeatureMappingset_Mappingset();

    /**
     * The meta object literal for the '<em><b>Mapping</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_MAPPINGSET__MAPPING = eINSTANCE.getFeatureMappingset_Mapping();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FGMSubclauseImpl <em>FGM Subclause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FGMSubclauseImpl
     * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeatureGroupMappingPackageImpl#getFGMSubclause()
     * @generated
     */
    EClass FGM_SUBCLAUSE = eINSTANCE.getFGMSubclause();

    /**
     * The meta object literal for the '<em><b>Mappingset</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FGM_SUBCLAUSE__MAPPINGSET = eINSTANCE.getFGMSubclause_Mappingset();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeatureMappingImpl <em>Feature Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeatureMappingImpl
     * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeatureGroupMappingPackageImpl#getFeatureMapping()
     * @generated
     */
    EClass FEATURE_MAPPING = eINSTANCE.getFeatureMapping();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_MAPPING__LEFT = eINSTANCE.getFeatureMapping_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_MAPPING__RIGHT = eINSTANCE.getFeatureMapping_Right();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeaturePathImpl <em>Feature Path</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeaturePathImpl
     * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeatureGroupMappingPackageImpl#getFeaturePath()
     * @generated
     */
    EClass FEATURE_PATH = eINSTANCE.getFeaturePath();

    /**
     * The meta object literal for the '<em><b>Feature Group Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_PATH__FEATURE_GROUP_TYPE = eINSTANCE.getFeaturePath_FeatureGroupType();

    /**
     * The meta object literal for the '<em><b>Feature Reference</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_PATH__FEATURE_REFERENCE = eINSTANCE.getFeaturePath_FeatureReference();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeatureReferenceImpl <em>Feature Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeatureReferenceImpl
     * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeatureGroupMappingPackageImpl#getFeatureReference()
     * @generated
     */
    EClass FEATURE_REFERENCE = eINSTANCE.getFeatureReference();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_REFERENCE__FEATURE = eINSTANCE.getFeatureReference_Feature();

  }

} //FeatureGroupMappingPackage
