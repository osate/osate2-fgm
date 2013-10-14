/**
 */
package org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.Element;
import org.osate.aadl2.FeatureGroupType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeaturePath#getFeatureGroupType <em>Feature Group Type</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeaturePath#getFeatureReference <em>Feature Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingPackage#getFeaturePath()
 * @model
 * @generated
 */
public interface FeaturePath extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Feature Group Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Group Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature Group Type</em>' reference.
   * @see #setFeatureGroupType(FeatureGroupType)
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingPackage#getFeaturePath_FeatureGroupType()
   * @model
   * @generated
   */
  FeatureGroupType getFeatureGroupType();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeaturePath#getFeatureGroupType <em>Feature Group Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature Group Type</em>' reference.
   * @see #getFeatureGroupType()
   * @generated
   */
  void setFeatureGroupType(FeatureGroupType value);

  /**
   * Returns the value of the '<em><b>Feature Reference</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureReference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Reference</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature Reference</em>' containment reference list.
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingPackage#getFeaturePath_FeatureReference()
   * @model containment="true"
   * @generated
   */
  EList<FeatureReference> getFeatureReference();

} // FeaturePath
