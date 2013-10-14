package org.osate.xtext.aadl2.featuregroupmapping.linking;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.linking.ILinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.osate.aadl2.Aadl2Package;
import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.Element;
import org.osate.aadl2.Feature;
import org.osate.aadl2.FeatureGroup;
import org.osate.aadl2.FeatureGroupType;
import org.osate.aadl2.PackageSection;
import org.osate.aadl2.modelsupport.util.AadlUtil;
import org.osate.aadl2.util.Aadl2Util;
import org.osate.core.OsateCorePlugin;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMLibrary;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGTMappingset;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureGroupMappingPackage;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeaturePath;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureReference;
import org.osate.xtext.aadl2.featuregroupmapping.naming.FeatureGroupMappingQualifiedNameProvider;
import org.osate.xtext.aadl2.featuregroupmapping.util.FGMUtil;
import org.osate.xtext.aadl2.properties.linking.PropertiesLinkingService;

import com.google.inject.Injector;

public class FGMLinkingService extends PropertiesLinkingService {
	
	public FGMLinkingService(){
		super();
	}
// This provides access to the getFUllyQualifiedName method for the global index mechanism.	
    final private Injector injector = OsateCorePlugin.getDefault().getInjector("org.osate.xtext.aadl2.errormodel.ErrorModel");
	
	private ILinkingService linkingService;
	
	private IQualifiedNameProvider nameProvider;
	
	protected  ILinkingService getLinkingService(){
		if (linkingService == null){
			linkingService =  injector.getInstance(FGMLinkingService.class);
		}
		return linkingService;
	}
	
	protected  IQualifiedNameProvider getNameProvider(){
		if (nameProvider == null){
			nameProvider =  injector.getInstance(FeatureGroupMappingQualifiedNameProvider.class);
		}
		return nameProvider;
	}
	
	public QualifiedName getFullyQualifiedName(final EObject obj) {
		return getNameProvider().getFullyQualifiedName(obj);
	}

	/**
	 * this method is used to resolve individual references in an Xtext setting
	 * @param annexName
	 * @param context
	 * @param reference
	 * @param node
	 * @return
	 */
	public List<EObject> resolveAnnexReference(String annexName,
			EObject context, EReference reference, INode node) {
		if (annexName.equalsIgnoreCase(FGMUtil.FGMAnnexName)){
		return getLinkingService().getLinkedObjects(context, reference, node) ;
		} else {
			return Collections.<EObject> emptyList();
		}
	}

	@Override
	public List<EObject> getLinkedObjects(EObject context,
			EReference reference, INode node) throws IllegalNodeException {
		final EClass requiredType = reference.getEReferenceType();
		EObject searchResult = null;
		if (requiredType == null)
			return Collections.<EObject> emptyList();
		Element cxt = (Element) context;
		final String name = getCrossRefNodeAsString(node);
		if (Aadl2Package.eINSTANCE.getFeature() == requiredType) {
			// feature in FGT
			searchResult = findFeature(context, name);
// FeatureGroupType is handled by PropertiesLinkingService
//		} else if (Aadl2Package.eINSTANCE.getFeatureGroupType() == requiredType) {
//			searchResult = findFeatureGroupType(context, name, reference);
		} else 	if (FeatureGroupMappingPackage.eINSTANCE.getFGTMappingset() == requiredType) {
			// reference to FGMLibrary
			// first look it up in global index
			String fixedName = FGMUtil.fixQualifiedName(name);
			EObject gobj = getIndexedObject(context, reference, fixedName);
			if (gobj != null ){
				if( gobj.eClass() == requiredType){
					return Collections.singletonList(gobj);
				} else {
					System.out.println("Global lookup of type did not match "+name);
				}
			}
			searchResult = findFGTMappingSet(context, name);
		}
		if (searchResult != null) {
			return Collections.singletonList(searchResult);
		}
		return Collections.<EObject> emptyList();
	}
	/**
	 * find the FGMlibrary. The String name refers to the package and the default EML name is added ("emv2")
	 * @param context context of search to identify package and EML
	 * @param name fully qualified name including FGM
	 * @return FGMLibrary
	 */
	public FGTMappingset findFGTMappingSet(EObject context, String name){
		String packName = Aadl2Util.getPackageName(name);
		String itemName = Aadl2Util.getItemNameWithoutQualification(name);
		AadlPackage ap = findAadlPackageReference(packName, AadlUtil.getContainingPackageSection(context));
		if (ap == null)
			return null;
		PackageSection ps = ap.getOwnedPublicSection();
		EList<AnnexLibrary>all=ps.getOwnedAnnexLibraries();
		for (AnnexLibrary al : all){
			if (al instanceof FGMLibrary){
				// find in FGMLibraries
				return (FGTMappingset)AadlUtil.findNamedElementInList(((FGMLibrary)al).getFgtmappingset(), itemName);
			}
		}
		return null;
	}
	
	public Feature findFeature(EObject context, String name){
		FeaturePath path = (FeaturePath) context.eContainer();
		EList<FeatureReference> frlist = path.getFeatureReference();
		FeatureGroupType fgt = path.getFeatureGroupType();
		int idx = frlist.indexOf(context);
		if (idx > 0){
			FeatureReference fr = frlist.get(idx-1);
			Feature f = fr.getFeature();
			if (f instanceof FeatureGroup){
				fgt = ((FeatureGroup)f).getFeatureGroupType();
			} else {
				return null;
			}
		}
		if (fgt != null)
			return (Feature) fgt.findNamedElement(name);
		return null;
	}
	

}
