
package org.osate.xtext.aadl2.featuregroupmapping;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class FeatureGroupMappingStandaloneSetup extends FeatureGroupMappingStandaloneSetupGenerated{

	public static void doSetup() {
		new FeatureGroupMappingStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

