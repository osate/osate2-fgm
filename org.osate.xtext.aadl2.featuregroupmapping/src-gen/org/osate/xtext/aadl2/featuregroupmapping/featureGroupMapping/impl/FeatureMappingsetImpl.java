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

import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingPackage;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureMapping;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureMappingset;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Mappingset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeatureMappingsetImpl#getMappingset <em>Mappingset</em>}</li>
 *   <li>{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FeatureMappingsetImpl#getMapping <em>Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureMappingsetImpl extends NamedElementImpl implements FeatureMappingset
{
  /**
   * The cached value of the '{@link #getMappingset() <em>Mappingset</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappingset()
   * @generated
   * @ordered
   */
  protected FeatureMappingset mappingset;

  /**
   * The cached value of the '{@link #getMapping() <em>Mapping</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMapping()
   * @generated
   * @ordered
   */
  protected EList<FeatureMapping> mapping;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureMappingsetImpl()
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
    return FeatureGroupMappingPackage.Literals.FEATURE_MAPPINGSET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMappingset getMappingset()
  {
    if (mappingset != null && mappingset.eIsProxy())
    {
      InternalEObject oldMappingset = (InternalEObject)mappingset;
      mappingset = (FeatureMappingset)eResolveProxy(oldMappingset);
      if (mappingset != oldMappingset)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeatureGroupMappingPackage.FEATURE_MAPPINGSET__MAPPINGSET, oldMappingset, mappingset));
      }
    }
    return mappingset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMappingset basicGetMappingset()
  {
    return mappingset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMappingset(FeatureMappingset newMappingset)
  {
    FeatureMappingset oldMappingset = mappingset;
    mappingset = newMappingset;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FeatureGroupMappingPackage.FEATURE_MAPPINGSET__MAPPINGSET, oldMappingset, mappingset));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FeatureMapping> getMapping()
  {
    if (mapping == null)
    {
      mapping = new EObjectContainmentEList<FeatureMapping>(FeatureMapping.class, this, FeatureGroupMappingPackage.FEATURE_MAPPINGSET__MAPPING);
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
      case FeatureGroupMappingPackage.FEATURE_MAPPINGSET__MAPPING:
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
      case FeatureGroupMappingPackage.FEATURE_MAPPINGSET__MAPPINGSET:
        if (resolve) return getMappingset();
        return basicGetMappingset();
      case FeatureGroupMappingPackage.FEATURE_MAPPINGSET__MAPPING:
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
      case FeatureGroupMappingPackage.FEATURE_MAPPINGSET__MAPPINGSET:
        setMappingset((FeatureMappingset)newValue);
        return;
      case FeatureGroupMappingPackage.FEATURE_MAPPINGSET__MAPPING:
        getMapping().clear();
        getMapping().addAll((Collection<? extends FeatureMapping>)newValue);
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
      case FeatureGroupMappingPackage.FEATURE_MAPPINGSET__MAPPINGSET:
        setMappingset((FeatureMappingset)null);
        return;
      case FeatureGroupMappingPackage.FEATURE_MAPPINGSET__MAPPING:
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
      case FeatureGroupMappingPackage.FEATURE_MAPPINGSET__MAPPINGSET:
        return mappingset != null;
      case FeatureGroupMappingPackage.FEATURE_MAPPINGSET__MAPPING:
        return mapping != null && !mapping.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FeatureMappingsetImpl
