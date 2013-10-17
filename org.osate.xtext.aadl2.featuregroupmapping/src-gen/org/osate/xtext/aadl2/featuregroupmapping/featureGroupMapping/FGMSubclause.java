/**
 */
package org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.AnnexSubclause;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FGM Subclause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMSubclause#getMappingset <em>Mappingset</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingPackage#getFGMSubclause()
 * @model
 * @generated
 */
public interface FGMSubclause extends EObject, AnnexSubclause
{
  /**
   * Returns the value of the '<em><b>Mappingset</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mappingset</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mappingset</em>' reference.
   * @see #setMappingset(FeatureMappingset)
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingPackage#getFGMSubclause_Mappingset()
   * @model
   * @generated
   */
  FeatureMappingset getMappingset();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMSubclause#getMappingset <em>Mappingset</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mappingset</em>' reference.
   * @see #getMappingset()
   * @generated
   */
  void setMappingset(FeatureMappingset value);

} // FGMSubclause
