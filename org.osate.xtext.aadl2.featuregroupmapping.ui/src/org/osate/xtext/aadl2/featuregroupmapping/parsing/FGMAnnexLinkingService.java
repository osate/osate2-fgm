package org.osate.xtext.aadl2.featuregroupmapping.parsing;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.linking.ILinkingService;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.osate.annexsupport.AnnexLinkingService;
import org.osate.core.OsateCorePlugin;
import org.osate.xtext.aadl2.featuregroupmapping.linking.FGMLinkingService;
import org.osate.xtext.aadl2.featuregroupmapping.naming.FeatureGroupMappingQualifiedNameProvider;
import org.osate.xtext.aadl2.featuregroupmapping.ui.FeatureGroupMappingUiModule;
import org.osate.xtext.aadl2.featuregroupmapping.util.FGMUtil;

import com.google.inject.Injector;


public class FGMAnnexLinkingService implements AnnexLinkingService{
	
    final private Injector injector = OsateCorePlugin.getDefault().getInjector("org.osate.xtext.aadl2.featuregroupmapping.FeatureGroupMapping");
	
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

	public List<EObject> resolveAnnexReference(String annexName,
			EObject context, EReference reference, INode node) {
		if (annexName.equalsIgnoreCase(FGMUtil.FGMAnnexName)){
			return getLinkingService().getLinkedObjects(context, reference, node) ;
		} else {
			return Collections.<EObject> emptyList();
		}
	}
	
	public QualifiedName getFullyQualifiedName(final EObject obj) {
		return getNameProvider().getFullyQualifiedName(obj);
	}
}
