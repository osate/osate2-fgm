/**
 */
package org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingPackage
 * @generated
 */
public interface FeatureGroupMappingFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FeatureGroupMappingFactory eINSTANCE = org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeatureGroupMappingFactoryImpl.init();

  /**
   * Returns a new object of class '<em>FGM Grammar Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>FGM Grammar Root</em>'.
   * @generated
   */
  FGMGrammarRoot createFGMGrammarRoot();

  /**
   * Returns a new object of class '<em>FGM Library</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>FGM Library</em>'.
   * @generated
   */
  FGMLibrary createFGMLibrary();

  /**
   * Returns a new object of class '<em>FGT Mappingset</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>FGT Mappingset</em>'.
   * @generated
   */
  FGTMappingset createFGTMappingset();

  /**
   * Returns a new object of class '<em>FGM Subclause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>FGM Subclause</em>'.
   * @generated
   */
  FGMSubclause createFGMSubclause();

  /**
   * Returns a new object of class '<em>FGM Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>FGM Mapping</em>'.
   * @generated
   */
  FGMMapping createFGMMapping();

  /**
   * Returns a new object of class '<em>Feature Path</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Path</em>'.
   * @generated
   */
  FeaturePath createFeaturePath();

  /**
   * Returns a new object of class '<em>Feature Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Reference</em>'.
   * @generated
   */
  FeatureReference createFeatureReference();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  FeatureGroupMappingPackage getFeatureGroupMappingPackage();

} //FeatureGroupMappingFactory
