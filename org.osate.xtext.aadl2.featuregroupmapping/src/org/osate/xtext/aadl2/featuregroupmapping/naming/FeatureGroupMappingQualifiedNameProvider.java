package org.osate.xtext.aadl2.featuregroupmapping.naming;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.NamedElement;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FGMLibrary;
import org.osate.xtext.aadl2.featuregroupmapping.featureGroupMapping.FeatureMappingset;
import org.osate.xtext.aadl2.featuregroupmapping.util.FGMUtil;

public class FeatureGroupMappingQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	// Enable to limit indexing to global items
	// Duplicates checking only applies to global items
	@Override
	public QualifiedName getFullyQualifiedName(final EObject obj) {
		// for all globally visible Annex elements return a unqiue name
		if (obj instanceof FGMLibrary || obj instanceof FeatureMappingset){
			return getConverter().toQualifiedName(getTheName((NamedElement)obj));
		}
		return null;
	}
	
	protected String getTheName(NamedElement namedElement){
		NamedElement root = namedElement.getElementRoot();
		if (namedElement instanceof FGMLibrary){
			return root.getName() + "::"+FGMUtil.FGMAnnexName;
		} 
		return root.getName() + "::"+FGMUtil.FGMAnnexName+"::" + namedElement.getName();
	}
}
