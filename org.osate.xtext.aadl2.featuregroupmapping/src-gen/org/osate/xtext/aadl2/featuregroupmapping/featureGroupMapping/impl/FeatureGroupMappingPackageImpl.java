/**
 */
package org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.osate.aadl2.Aadl2Package;

import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMGrammarRoot;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMLibrary;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMSubclause;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingFactory;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingPackage;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureMapping;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureMappingset;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeaturePath;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureGroupMappingPackageImpl extends EPackageImpl implements FeatureGroupMappingPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fgmGrammarRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fgmLibraryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureMappingsetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fgmSubclauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featurePathEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureReferenceEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private FeatureGroupMappingPackageImpl()
  {
    super(eNS_URI, FeatureGroupMappingFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link FeatureGroupMappingPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static FeatureGroupMappingPackage init()
  {
    if (isInited) return (FeatureGroupMappingPackage)EPackage.Registry.INSTANCE.getEPackage(FeatureGroupMappingPackage.eNS_URI);

    // Obtain or create and register package
    FeatureGroupMappingPackageImpl theFeatureGroupMappingPackage = (FeatureGroupMappingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FeatureGroupMappingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FeatureGroupMappingPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    Aadl2Package.eINSTANCE.eClass();

    // Create package meta-data objects
    theFeatureGroupMappingPackage.createPackageContents();

    // Initialize created meta-data
    theFeatureGroupMappingPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theFeatureGroupMappingPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(FeatureGroupMappingPackage.eNS_URI, theFeatureGroupMappingPackage);
    return theFeatureGroupMappingPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFGMGrammarRoot()
  {
    return fgmGrammarRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFGMGrammarRoot_Fgml()
  {
    return (EReference)fgmGrammarRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFGMGrammarRoot_Fgmsc()
  {
    return (EReference)fgmGrammarRootEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFGMLibrary()
  {
    return fgmLibraryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFGMLibrary_Featuremappingset()
  {
    return (EReference)fgmLibraryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureMappingset()
  {
    return featureMappingsetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureMappingset_Mappingset()
  {
    return (EReference)featureMappingsetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureMappingset_Mapping()
  {
    return (EReference)featureMappingsetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFGMSubclause()
  {
    return fgmSubclauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFGMSubclause_Mappingset()
  {
    return (EReference)fgmSubclauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureMapping()
  {
    return featureMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureMapping_Left()
  {
    return (EReference)featureMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureMapping_Right()
  {
    return (EReference)featureMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeaturePath()
  {
    return featurePathEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeaturePath_FeatureGroupType()
  {
    return (EReference)featurePathEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeaturePath_FeatureReference()
  {
    return (EReference)featurePathEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureReference()
  {
    return featureReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureReference_Feature()
  {
    return (EReference)featureReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureGroupMappingFactory getFeatureGroupMappingFactory()
  {
    return (FeatureGroupMappingFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    fgmGrammarRootEClass = createEClass(FGM_GRAMMAR_ROOT);
    createEReference(fgmGrammarRootEClass, FGM_GRAMMAR_ROOT__FGML);
    createEReference(fgmGrammarRootEClass, FGM_GRAMMAR_ROOT__FGMSC);

    fgmLibraryEClass = createEClass(FGM_LIBRARY);
    createEReference(fgmLibraryEClass, FGM_LIBRARY__FEATUREMAPPINGSET);

    featureMappingsetEClass = createEClass(FEATURE_MAPPINGSET);
    createEReference(featureMappingsetEClass, FEATURE_MAPPINGSET__MAPPINGSET);
    createEReference(featureMappingsetEClass, FEATURE_MAPPINGSET__MAPPING);

    fgmSubclauseEClass = createEClass(FGM_SUBCLAUSE);
    createEReference(fgmSubclauseEClass, FGM_SUBCLAUSE__MAPPINGSET);

    featureMappingEClass = createEClass(FEATURE_MAPPING);
    createEReference(featureMappingEClass, FEATURE_MAPPING__LEFT);
    createEReference(featureMappingEClass, FEATURE_MAPPING__RIGHT);

    featurePathEClass = createEClass(FEATURE_PATH);
    createEReference(featurePathEClass, FEATURE_PATH__FEATURE_GROUP_TYPE);
    createEReference(featurePathEClass, FEATURE_PATH__FEATURE_REFERENCE);

    featureReferenceEClass = createEClass(FEATURE_REFERENCE);
    createEReference(featureReferenceEClass, FEATURE_REFERENCE__FEATURE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    Aadl2Package theAadl2Package = (Aadl2Package)EPackage.Registry.INSTANCE.getEPackage(Aadl2Package.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    fgmLibraryEClass.getESuperTypes().add(theAadl2Package.getAnnexLibrary());
    featureMappingsetEClass.getESuperTypes().add(theAadl2Package.getNamedElement());
    fgmSubclauseEClass.getESuperTypes().add(theAadl2Package.getAnnexSubclause());
    featureMappingEClass.getESuperTypes().add(theAadl2Package.getElement());
    featurePathEClass.getESuperTypes().add(theAadl2Package.getElement());
    featureReferenceEClass.getESuperTypes().add(theAadl2Package.getElement());

    // Initialize classes and features; add operations and parameters
    initEClass(fgmGrammarRootEClass, FGMGrammarRoot.class, "FGMGrammarRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFGMGrammarRoot_Fgml(), this.getFGMLibrary(), null, "fgml", null, 0, 1, FGMGrammarRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFGMGrammarRoot_Fgmsc(), this.getFGMSubclause(), null, "fgmsc", null, 0, 1, FGMGrammarRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fgmLibraryEClass, FGMLibrary.class, "FGMLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFGMLibrary_Featuremappingset(), this.getFeatureMappingset(), null, "featuremappingset", null, 0, -1, FGMLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureMappingsetEClass, FeatureMappingset.class, "FeatureMappingset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeatureMappingset_Mappingset(), this.getFeatureMappingset(), null, "mappingset", null, 0, 1, FeatureMappingset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeatureMappingset_Mapping(), this.getFeatureMapping(), null, "mapping", null, 0, -1, FeatureMappingset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fgmSubclauseEClass, FGMSubclause.class, "FGMSubclause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFGMSubclause_Mappingset(), this.getFeatureMappingset(), null, "mappingset", null, 0, 1, FGMSubclause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureMappingEClass, FeatureMapping.class, "FeatureMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeatureMapping_Left(), this.getFeaturePath(), null, "left", null, 0, 1, FeatureMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeatureMapping_Right(), this.getFeaturePath(), null, "right", null, 0, 1, FeatureMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featurePathEClass, FeaturePath.class, "FeaturePath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeaturePath_FeatureGroupType(), theAadl2Package.getFeatureGroupType(), null, "featureGroupType", null, 0, 1, FeaturePath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeaturePath_FeatureReference(), this.getFeatureReference(), null, "featureReference", null, 0, -1, FeaturePath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureReferenceEClass, FeatureReference.class, "FeatureReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeatureReference_Feature(), theAadl2Package.getFeature(), null, "feature", null, 0, 1, FeatureReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //FeatureGroupMappingPackageImpl
