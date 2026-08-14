package com.kodewala.gourav;

import com.squareup.javapoet.ClassName;

public class ModuleInfo {

	public String module;
	public String basePack;
	public Class<?> pkType;
	public String fileLoc;

	private ClassName moduleType;

	public ModuleInfo(String module, String packageName, Class<?> pkType, String fileLoc) {
		super();
		this.module = module;
		this.basePack = packageName;
		this.pkType = pkType;
		this.fileLoc = fileLoc;
		this.moduleType = ClassName.get(basePack + ".entity", module);
	}

	public String getModule() {
		return module;
	}

	public String getBasePack() {
		return basePack;
	}

	public Class<?> getPkType() {
		return pkType;
	}

	public String getFileLoc() {
		return fileLoc;
	}

	public ClassName getModuleType() {
		return moduleType;
	}

}
