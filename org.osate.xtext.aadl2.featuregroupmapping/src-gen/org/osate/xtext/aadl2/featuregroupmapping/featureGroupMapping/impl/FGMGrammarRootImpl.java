/**
 */
package org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMGrammarRoot;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMLibrary;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMSubclause;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FGM Grammar Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FGMGrammarRootImpl#getFgml <em>Fgml</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FGMGrammarRootImpl#getFgmsc <em>Fgmsc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FGMGrammarRootImpl extends MinimalEObjectImpl.Container implements FGMGrammarRoot
{
  /**
   * The cached value of the '{@link #getFgml() <em>Fgml</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFgml()
   * @generated
   * @ordered
   */
  protected FGMLibrary fgml;

  /**
   * The cached value of the '{@link #getFgmsc() <em>Fgmsc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFgmsc()
   * @generated
   * @ordered
   */
  protected FGMSubclause fgmsc;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FGMGrammarRootImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FeatureGroupMappingPackage.Literals.FGM_GRAMMAR_ROOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FGMLibrary getFgml()
  {
    return fgml;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFgml(FGMLibrary newFgml, NotificationChain msgs)
  {
    FGMLibrary oldFgml = fgml;
    fgml = newFgml;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureGroupMappingPackage.FGM_GRAMMAR_ROOT__FGML, oldFgml, newFgml);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFgml(FGMLibrary newFgml)
  {
    if (newFgml != fgml)
    {
      NotificationChain msgs = null;
      if (fgml != null)
        msgs = ((InternalEObject)fgml).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureGroupMappingPackage.FGM_GRAMMAR_ROOT__FGML, null, msgs);
      if (newFgml != null)
        msgs = ((InternalEObject)newFgml).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureGroupMappingPackage.FGM_GRAMMAR_ROOT__FGML, null, msgs);
      msgs = basicSetFgml(newFgml, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FeatureGroupMappingPackage.FGM_GRAMMAR_ROOT__FGML, newFgml, newFgml));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FGMSubclause getFgmsc()
  {
    return fgmsc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFgmsc(FGMSubclause newFgmsc, NotificationChain msgs)
  {
    FGMSubclause oldFgmsc = fgmsc;
    fgmsc = newFgmsc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureGroupMappingPackage.FGM_GRAMMAR_ROOT__FGMSC, oldFgmsc, newFgmsc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFgmsc(FGMSubclause newFgmsc)
  {
    if (newFgmsc != fgmsc)
    {
      NotificationChain msgs = null;
      if (fgmsc != null)
        msgs = ((InternalEObject)fgmsc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureGroupMappingPackage.FGM_GRAMMAR_ROOT__FGMSC, null, msgs);
      if (newFgmsc != null)
        msgs = ((InternalEObject)newFgmsc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureGroupMappingPackage.FGM_GRAMMAR_ROOT__FGMSC, null, msgs);
      msgs = basicSetFgmsc(newFgmsc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FeatureGroupMappingPackage.FGM_GRAMMAR_ROOT__FGMSC, newFgmsc, newFgmsc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FeatureGroupMappingPackage.FGM_GRAMMAR_ROOT__FGML:
        return basicSetFgml(null, msgs);
      case FeatureGroupMappingPackage.FGM_GRAMMAR_ROOT__FGMSC:
        return basicSetFgmsc(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FeatureGroupMappingPackage.FGM_GRAMMAR_ROOT__FGML:
        return getFgml();
      case FeatureGroupMappingPackage.FGM_GRAMMAR_ROOT__FGMSC:
        return getFgmsc();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FeatureGroupMappingPackage.FGM_GRAMMAR_ROOT__FGML:
        setFgml((FGMLibrary)newValue);
        return;
      case FeatureGroupMappingPackage.FGM_GRAMMAR_ROOT__FGMSC:
        setFgmsc((FGMSubclause)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FeatureGroupMappingPackage.FGM_GRAMMAR_ROOT__FGML:
        setFgml((FGMLibrary)null);
        return;
      case FeatureGroupMappingPackage.FGM_GRAMMAR_ROOT__FGMSC:
        setFgmsc((FGMSubclause)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FeatureGroupMappingPackage.FGM_GRAMMAR_ROOT__FGML:
        return fgml != null;
      case FeatureGroupMappingPackage.FGM_GRAMMAR_ROOT__FGMSC:
        return fgmsc != null;
    }
    return super.eIsSet(featureID);
  }

} //FGMGrammarRootImpl
