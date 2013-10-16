/**
 */
package org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.Element;
import org.osate.aadl2.ModalElement;
import org.osate.aadl2.NamedElement;

import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingPackage
 * @generated
 */
public class FeatureGroupMappingSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FeatureGroupMappingPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureGroupMappingSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = FeatureGroupMappingPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case FeatureGroupMappingPackage.FGM_GRAMMAR_ROOT:
      {
        FGMGrammarRoot fgmGrammarRoot = (FGMGrammarRoot)theEObject;
        T result = caseFGMGrammarRoot(fgmGrammarRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FeatureGroupMappingPackage.FGM_LIBRARY:
      {
        FGMLibrary fgmLibrary = (FGMLibrary)theEObject;
        T result = caseFGMLibrary(fgmLibrary);
        if (result == null) result = caseAnnexLibrary(fgmLibrary);
        if (result == null) result = caseNamedElement(fgmLibrary);
        if (result == null) result = caseElement(fgmLibrary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FeatureGroupMappingPackage.FEATURE_MAPPINGSET:
      {
        FeatureMappingset featureMappingset = (FeatureMappingset)theEObject;
        T result = caseFeatureMappingset(featureMappingset);
        if (result == null) result = caseAnnexSubclause(featureMappingset);
        if (result == null) result = caseModalElement(featureMappingset);
        if (result == null) result = caseNamedElement(featureMappingset);
        if (result == null) result = caseElement(featureMappingset);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FeatureGroupMappingPackage.FGM_SUBCLAUSE:
      {
        FGMSubclause fgmSubclause = (FGMSubclause)theEObject;
        T result = caseFGMSubclause(fgmSubclause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FeatureGroupMappingPackage.FEATURE_MAPPING:
      {
        FeatureMapping featureMapping = (FeatureMapping)theEObject;
        T result = caseFeatureMapping(featureMapping);
        if (result == null) result = caseElement(featureMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FeatureGroupMappingPackage.FEATURE_PATH:
      {
        FeaturePath featurePath = (FeaturePath)theEObject;
        T result = caseFeaturePath(featurePath);
        if (result == null) result = caseElement(featurePath);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FeatureGroupMappingPackage.FEATURE_REFERENCE:
      {
        FeatureReference featureReference = (FeatureReference)theEObject;
        T result = caseFeatureReference(featureReference);
        if (result == null) result = caseElement(featureReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FGM Grammar Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FGM Grammar Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFGMGrammarRoot(FGMGrammarRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FGM Library</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FGM Library</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFGMLibrary(FGMLibrary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Mappingset</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Mappingset</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureMappingset(FeatureMappingset object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FGM Subclause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FGM Subclause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFGMSubclause(FGMSubclause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureMapping(FeatureMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Path</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Path</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeaturePath(FeaturePath object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureReference(FeatureReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedElement(NamedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annex Library</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annex Library</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnexLibrary(AnnexLibrary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Modal Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Modal Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModalElement(ModalElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annex Subclause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annex Subclause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnexSubclause(AnnexSubclause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //FeatureGroupMappingSwitch
