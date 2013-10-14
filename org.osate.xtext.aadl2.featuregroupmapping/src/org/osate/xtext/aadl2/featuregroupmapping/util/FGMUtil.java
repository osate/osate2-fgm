package org.osate.xtext.aadl2.featuregroupmapping.util;

import org.osate.aadl2.util.Aadl2Util;


public class FGMUtil {
	public final static String FGMAnnexName = "FGM";
	
	public static String fixQualifiedName(String name){
		String packname = Aadl2Util.getPackageName(name);
		String itemName = Aadl2Util.getItemNameWithoutQualification(name);
		if (packname == null) return name;
		return packname + "::" + FGMUtil.FGMAnnexName+"::"+itemName;
	}
	

}
