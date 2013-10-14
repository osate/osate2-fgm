/**
 */
package org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FGT Mappingset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGTMappingset#getMappingset <em>Mappingset</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGTMappingset#getMapping <em>Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingPackage#getFGTMappingset()
 * @model
 * @generated
 */
public interface FGTMappingset extends EObject, NamedElement
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
   * @see #setMappingset(FGTMappingset)
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingPackage#getFGTMappingset_Mappingset()
   * @model
   * @generated
   */
  FGTMappingset getMappingset();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGTMappingset#getMappingset <em>Mappingset</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mappingset</em>' reference.
   * @see #getMappingset()
   * @generated
   */
  void setMappingset(FGTMappingset value);

  /**
   * Returns the value of the '<em><b>Mapping</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMMapping}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapping</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapping</em>' containment reference list.
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingPackage#getFGTMappingset_Mapping()
   * @model containment="true"
   * @generated
   */
  EList<FGMMapping> getMapping();

} // FGTMappingset
