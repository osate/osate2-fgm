/**
 */
package org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FGM Grammar Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMGrammarRoot#getFgml <em>Fgml</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMGrammarRoot#getFgmsc <em>Fgmsc</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingPackage#getFGMGrammarRoot()
 * @model
 * @generated
 */
public interface FGMGrammarRoot extends EObject
{
  /**
   * Returns the value of the '<em><b>Fgml</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fgml</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fgml</em>' containment reference.
   * @see #setFgml(FGMLibrary)
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingPackage#getFGMGrammarRoot_Fgml()
   * @model containment="true"
   * @generated
   */
  FGMLibrary getFgml();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMGrammarRoot#getFgml <em>Fgml</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fgml</em>' containment reference.
   * @see #getFgml()
   * @generated
   */
  void setFgml(FGMLibrary value);

  /**
   * Returns the value of the '<em><b>Fgmsc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fgmsc</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fgmsc</em>' containment reference.
   * @see #setFgmsc(FGMSubclause)
   * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingPackage#getFGMGrammarRoot_Fgmsc()
   * @model containment="true"
   * @generated
   */
  FGMSubclause getFgmsc();

  /**
   * Sets the value of the '{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMGrammarRoot#getFgmsc <em>Fgmsc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fgmsc</em>' containment reference.
   * @see #getFgmsc()
   * @generated
   */
  void setFgmsc(FGMSubclause value);

} // FGMGrammarRoot
