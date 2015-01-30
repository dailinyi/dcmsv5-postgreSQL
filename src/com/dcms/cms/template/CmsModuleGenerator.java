package com.dcms.cms.template;


public class CmsModuleGenerator {
	private static String packName = "com.dcms.cms.template";
	private static String fileName = "dcms.properties";

	public static void main(String[] args) {
		new ModuleGenerator(packName, fileName).generate();
	}
}
