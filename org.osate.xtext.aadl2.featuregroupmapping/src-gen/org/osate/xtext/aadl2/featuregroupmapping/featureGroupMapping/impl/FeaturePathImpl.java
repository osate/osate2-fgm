/**
 */
package org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.FeatureGroupType;

import org.osate.aadl2.impl.ElementImpl;

import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingPackage;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeaturePath;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeaturePathImpl#getFeatureGroupType <em>Feature Group Type</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeaturePathImpl#getFeatureReference <em>Feature Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeaturePathImpl extends ElementImpl implements FeaturePath
{
  /**
   * The cached value of the '{@link #getFeatureGroupType() <em>Feature Group Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatureGroupType()
   * @generated
   * @ordered
   */
  protected FeatureGroupType featureGroupType;

  /**
   * The cached value of the '{@link #getFeatureReference() <em>Feature Reference</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatureReference()
   * @generated
   * @ordered
   */
  protected EList<FeatureReference> featureReference;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeaturePathImpl()
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
    return FeatureGroupMappingPackage.Literals.FEATURE_PATH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureGroupType getFeatureGroupType()
  {
    if (featureGroupType != null && ((EObject)featureGroupType).eIsProxy())
    {
      InternalEObject oldFeatureGroupType = (InternalEObject)featureGroupType;
      featureGroupType = (FeatureGroupType)eResolveProxy(oldFeatureGroupType);
      if (featureGroupType != oldFeatureGroupType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeatureGroupMappingPackage.FEATURE_PATH__FEATURE_GROUP_TYPE, oldFeatureGroupType, featureGroupType));
      }
    }
    return featureGroupType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureGroupType basicGetFeatureGroupType()
  {
    return featureGroupType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeatureGroupType(FeatureGroupType newFeatureGroupType)
  {
    FeatureGroupType oldFeatureGroupType = featureGroupType;
    featureGroupType = newFeatureGroupType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FeatureGroupMappingPackage.FEATURE_PATH__FEATURE_GROUP_TYPE, oldFeatureGroupType, featureGroupType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FeatureReference> getFeatureReference()
  {
    if (featureReference == null)
    {
      featureReference = new EObjectContainmentEList<FeatureReference>(FeatureReference.class, this, FeatureGroupMappingPackage.FEATURE_PATH__FEATURE_REFERENCE);
    }
    return featureReference;
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
      case FeatureGroupMappingPackage.FEATURE_PATH__FEATURE_REFERENCE:
        return ((InternalEList<?>)getFeatureReference()).basicRemove(otherEnd, msgs);
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
      case FeatureGroupMappingPackage.FEATURE_PATH__FEATURE_GROUP_TYPE:
        if (resolve) return getFeatureGroupType();
        return basicGetFeatureGroupType();
      case FeatureGroupMappingPackage.FEATURE_PATH__FEATURE_REFERENCE:
        return getFeatureReference();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FeatureGroupMappingPackage.FEATURE_PATH__FEATURE_GROUP_TYPE:
        setFeatureGroupType((FeatureGroupType)newValue);
        return;
      case FeatureGroupMappingPackage.FEATURE_PATH__FEATURE_REFERENCE:
        getFeatureReference().clear();
        getFeatureReference().addAll((Collection<? extends FeatureReference>)newValue);
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
      case FeatureGroupMappingPackage.FEATURE_PATH__FEATURE_GROUP_TYPE:
        setFeatureGroupType((FeatureGroupType)null);
        return;
      case FeatureGroupMappingPackage.FEATURE_PATH__FEATURE_REFERENCE:
        getFeatureReference().clear();
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
      case FeatureGroupMappingPackage.FEATURE_PATH__FEATURE_GROUP_TYPE:
        return featureGroupType != null;
      case FeatureGroupMappingPackage.FEATURE_PATH__FEATURE_REFERENCE:
        return featureReference != null && !featureReference.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FeaturePathImpl
