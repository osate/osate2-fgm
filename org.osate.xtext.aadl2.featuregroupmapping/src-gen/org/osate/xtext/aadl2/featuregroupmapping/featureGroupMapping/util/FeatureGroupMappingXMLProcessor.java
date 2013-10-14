/**
 */
package org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureGroupMappingXMLProcessor extends XMLProcessor
{

  /**
   * Public constructor to instantiate the helper.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureGroupMappingXMLProcessor()
  {
    super((EPackage.Registry.INSTANCE));
    FeatureGroupMappingPackage.eINSTANCE.eClass();
  }
  
  /**
   * Register for "*" and "xml" file extensions the FeatureGroupMappingResourceFactoryImpl factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Map<String, Resource.Factory> getRegistrations()
  {
    if (registrations == null)
    {
      super.getRegistrations();
      registrations.put(XML_EXTENSION, new FeatureGroupMappingResourceFactoryImpl());
      registrations.put(STAR_EXTENSION, new FeatureGroupMappingResourceFactoryImpl());
    }
    return registrations;
  }

} //FeatureGroupMappingXMLProcessor
