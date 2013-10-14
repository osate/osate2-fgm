/**
 */
package org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.impl.NamedElementImpl;

import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMMapping;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGTMappingset;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FGT Mappingset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FGTMappingsetImpl#getMappingset <em>Mappingset</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FGTMappingsetImpl#getMapping <em>Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FGTMappingsetImpl extends NamedElementImpl implements FGTMappingset
{
  /**
   * The cached value of the '{@link #getMappingset() <em>Mappingset</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappingset()
   * @generated
   * @ordered
   */
  protected FGTMappingset mappingset;

  /**
   * The cached value of the '{@link #getMapping() <em>Mapping</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMapping()
   * @generated
   * @ordered
   */
  protected EList<FGMMapping> mapping;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FGTMappingsetImpl()
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
    return FeatureGroupMappingPackage.Literals.FGT_MAPPINGSET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FGTMappingset getMappingset()
  {
    if (mappingset != null && mappingset.eIsProxy())
    {
      InternalEObject oldMappingset = (InternalEObject)mappingset;
      mappingset = (FGTMappingset)eResolveProxy(oldMappingset);
      if (mappingset != oldMappingset)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeatureGroupMappingPackage.FGT_MAPPINGSET__MAPPINGSET, oldMappingset, mappingset));
      }
    }
    return mappingset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FGTMappingset basicGetMappingset()
  {
    return mappingset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMappingset(FGTMappingset newMappingset)
  {
    FGTMappingset oldMappingset = mappingset;
    mappingset = newMappingset;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FeatureGroupMappingPackage.FGT_MAPPINGSET__MAPPINGSET, oldMappingset, mappingset));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FGMMapping> getMapping()
  {
    if (mapping == null)
    {
      mapping = new EObjectContainmentEList<FGMMapping>(FGMMapping.class, this, FeatureGroupMappingPackage.FGT_MAPPINGSET__MAPPING);
    }
    return mapping;
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
      case FeatureGroupMappingPackage.FGT_MAPPINGSET__MAPPING:
        return ((InternalEList<?>)getMapping()).basicRemove(otherEnd, msgs);
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
      case FeatureGroupMappingPackage.FGT_MAPPINGSET__MAPPINGSET:
        if (resolve) return getMappingset();
        return basicGetMappingset();
      case FeatureGroupMappingPackage.FGT_MAPPINGSET__MAPPING:
        return getMapping();
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
      case FeatureGroupMappingPackage.FGT_MAPPINGSET__MAPPINGSET:
        setMappingset((FGTMappingset)newValue);
        return;
      case FeatureGroupMappingPackage.FGT_MAPPINGSET__MAPPING:
        getMapping().clear();
        getMapping().addAll((Collection<? extends FGMMapping>)newValue);
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
      case FeatureGroupMappingPackage.FGT_MAPPINGSET__MAPPINGSET:
        setMappingset((FGTMappingset)null);
        return;
      case FeatureGroupMappingPackage.FGT_MAPPINGSET__MAPPING:
        getMapping().clear();
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
      case FeatureGroupMappingPackage.FGT_MAPPINGSET__MAPPINGSET:
        return mappingset != null;
      case FeatureGroupMappingPackage.FGT_MAPPINGSET__MAPPING:
        return mapping != null && !mapping.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FGTMappingsetImpl
