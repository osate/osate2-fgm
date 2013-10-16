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
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingPackage;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureMappingset;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FGM Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.impl.FGMLibraryImpl#getFeaturemappingset <em>Featuremappingset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FGMLibraryImpl extends AnnexLibraryImpl implements FGMLibrary
{
  /**
   * The cached value of the '{@link #getFeaturemappingset() <em>Featuremappingset</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeaturemappingset()
   * @generated
   * @ordered
   */
  protected EList<FeatureMappingset> featuremappingset;

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
  public EList<FeatureMappingset> getFeaturemappingset()
  {
    if (featuremappingset == null)
    {
      featuremappingset = new EObjectContainmentEList<FeatureMappingset>(FeatureMappingset.class, this, FeatureGroupMappingPackage.FGM_LIBRARY__FEATUREMAPPINGSET);
    }
    return featuremappingset;
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
      case FeatureGroupMappingPackage.FGM_LIBRARY__FEATUREMAPPINGSET:
        return ((InternalEList<?>)getFeaturemappingset()).basicRemove(otherEnd, msgs);
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
      case FeatureGroupMappingPackage.FGM_LIBRARY__FEATUREMAPPINGSET:
        return getFeaturemappingset();
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
      case FeatureGroupMappingPackage.FGM_LIBRARY__FEATUREMAPPINGSET:
        getFeaturemappingset().clear();
        getFeaturemappingset().addAll((Collection<? extends FeatureMappingset>)newValue);
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
      case FeatureGroupMappingPackage.FGM_LIBRARY__FEATUREMAPPINGSET:
        getFeaturemappingset().clear();
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
      case FeatureGroupMappingPackage.FGM_LIBRARY__FEATUREMAPPINGSET:
        return featuremappingset != null && !featuremappingset.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FGMLibraryImpl
