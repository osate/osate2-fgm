/**
 */
package org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.impl.AnnexLibraryImpl;

import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMLibrary;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGTMappingset;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FGM Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FGMLibraryImpl#getFgtmappingset <em>Fgtmappingset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FGMLibraryImpl extends AnnexLibraryImpl implements FGMLibrary
{
  /**
   * The cached value of the '{@link #getFgtmappingset() <em>Fgtmappingset</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFgtmappingset()
   * @generated
   * @ordered
   */
  protected EList<FGTMappingset> fgtmappingset;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FGMLibraryImpl()
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
    return FeatureGroupMappingPackage.Literals.FGM_LIBRARY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FGTMappingset> getFgtmappingset()
  {
    if (fgtmappingset == null)
    {
      fgtmappingset = new EObjectContainmentEList<FGTMappingset>(FGTMappingset.class, this, FeatureGroupMappingPackage.FGM_LIBRARY__FGTMAPPINGSET);
    }
    return fgtmappingset;
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
      case FeatureGroupMappingPackage.FGM_LIBRARY__FGTMAPPINGSET:
        return ((InternalEList<?>)getFgtmappingset()).basicRemove(otherEnd, msgs);
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
      case FeatureGroupMappingPackage.FGM_LIBRARY__FGTMAPPINGSET:
        return getFgtmappingset();
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
      case FeatureGroupMappingPackage.FGM_LIBRARY__FGTMAPPINGSET:
        getFgtmappingset().clear();
        getFgtmappingset().addAll((Collection<? extends FGTMappingset>)newValue);
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
      case FeatureGroupMappingPackage.FGM_LIBRARY__FGTMAPPINGSET:
        getFgtmappingset().clear();
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
      case FeatureGroupMappingPackage.FGM_LIBRARY__FGTMAPPINGSET:
        return fgtmappingset != null && !fgtmappingset.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FGMLibraryImpl
