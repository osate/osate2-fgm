/**
 */
package org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureGroupMappingFactoryImpl extends EFactoryImpl implements FeatureGroupMappingFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FeatureGroupMappingFactory init()
  {
    try
    {
      FeatureGroupMappingFactory theFeatureGroupMappingFactory = (FeatureGroupMappingFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.aadl.info/FGM"); 
      if (theFeatureGroupMappingFactory != null)
      {
        return theFeatureGroupMappingFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FeatureGroupMappingFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureGroupMappingFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FeatureGroupMappingPackage.FGM_GRAMMAR_ROOT: return createFGMGrammarRoot();
      case FeatureGroupMappingPackage.FGM_LIBRARY: return createFGMLibrary();
      case FeatureGroupMappingPackage.FEATURE_MAPPINGSET: return createFeatureMappingset();
      case FeatureGroupMappingPackage.FGM_SUBCLAUSE: return createFGMSubclause();
      case FeatureGroupMappingPackage.FEATURE_MAPPING: return createFeatureMapping();
      case FeatureGroupMappingPackage.FEATURE_PATH: return createFeaturePath();
      case FeatureGroupMappingPackage.FEATURE_REFERENCE: return createFeatureReference();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FGMGrammarRoot createFGMGrammarRoot()
  {
    FGMGrammarRootImpl fgmGrammarRoot = new FGMGrammarRootImpl();
    return fgmGrammarRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FGMLibrary createFGMLibrary()
  {
    FGMLibraryImpl fgmLibrary = new FGMLibraryImpl();
    return fgmLibrary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMappingset createFeatureMappingset()
  {
    FeatureMappingsetImpl featureMappingset = new FeatureMappingsetImpl();
    return featureMappingset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FGMSubclause createFGMSubclause()
  {
    FGMSubclauseImpl fgmSubclause = new FGMSubclauseImpl();
    return fgmSubclause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMapping createFeatureMapping()
  {
    FeatureMappingImpl featureMapping = new FeatureMappingImpl();
    return featureMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeaturePath createFeaturePath()
  {
    FeaturePathImpl featurePath = new FeaturePathImpl();
    return featurePath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureReference createFeatureReference()
  {
    FeatureReferenceImpl featureReference = new FeatureReferenceImpl();
    return featureReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureGroupMappingPackage getFeatureGroupMappingPackage()
  {
    return (FeatureGroupMappingPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FeatureGroupMappingPackage getPackage()
  {
    return FeatureGroupMappingPackage.eINSTANCE;
  }

} //FeatureGroupMappingFactoryImpl
