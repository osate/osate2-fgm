/**
 */
package org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.AnnexLibrary;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FGM Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMLibrary#getFgtmappingset <em>Fgtmappingset</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingPackage#getFGMLibrary()
 * @model
 * @generated
 */
public interface FGMLibrary extends EObject, AnnexLibrary
{
  /**
   * Returns the value of the '<em><b>Fgtmappingset</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGTMappingset}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fgtmappingset</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fgtmappingset</em>' containment reference list.
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingPackage#getFGMLibrary_Fgtmappingset()
   * @model containment="true"
   * @generated
   */
  EList<FGTMappingset> getFgtmappingset();

} // FGMLibrary
