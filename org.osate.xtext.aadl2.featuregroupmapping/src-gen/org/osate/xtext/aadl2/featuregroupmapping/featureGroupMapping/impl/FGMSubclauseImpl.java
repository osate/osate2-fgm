/**
 */
package org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMSubclause;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingPackage;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureMappingset;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FGM Subclause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FGMSubclauseImpl#getMappingset <em>Mappingset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FGMSubclauseImpl extends MinimalEObjectImpl.Container implements FGMSubclause
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FGMSubclauseImpl()
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
    return FeatureGroupMappingPackage.Literals.FGM_SUBCLAUSE;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeatureGroupMappingPackage.FGM_SUBCLAUSE__MAPPINGSET, oldMappingset, mappingset));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FeatureGroupMappingPackage.FGM_SUBCLAUSE__MAPPINGSET, oldMappingset, mappingset));
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
      case FeatureGroupMappingPackage.FGM_SUBCLAUSE__MAPPINGSET:
        if (resolve) return getMappingset();
        return basicGetMappingset();
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
      case FeatureGroupMappingPackage.FGM_SUBCLAUSE__MAPPINGSET:
        setMappingset((FeatureMappingset)newValue);
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
      case FeatureGroupMappingPackage.FGM_SUBCLAUSE__MAPPINGSET:
        setMappingset((FeatureMappingset)null);
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
      case FeatureGroupMappingPackage.FGM_SUBCLAUSE__MAPPINGSET:
        return mappingset != null;
    }
    return super.eIsSet(featureID);
  }

} //FGMSubclauseImpl
