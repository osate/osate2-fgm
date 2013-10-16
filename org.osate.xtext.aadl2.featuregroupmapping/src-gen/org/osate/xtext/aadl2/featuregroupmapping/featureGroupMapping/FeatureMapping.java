/**
 */
package org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureMapping#getLeft <em>Left</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureMapping#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingPackage#getFeatureMapping()
 * @model
 * @generated
 */
public interface FeatureMapping extends EObject, Element
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(FeaturePath)
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingPackage#getFeatureMapping_Left()
   * @model containment="true"
   * @generated
   */
  FeaturePath getLeft();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureMapping#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(FeaturePath value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(FeaturePath)
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingPackage#getFeatureMapping_Right()
   * @model containment="true"
   * @generated
   */
  FeaturePath getRight();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureMapping#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(FeaturePath value);

} // FeatureMapping
