package com.kodewala.gourav;

import java.io.File;
import java.io.IOException;

import javax.lang.model.element.Modifier;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.MethodSpec.Builder;
import com.squareup.javapoet.ParameterSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeSpec;

public class ServiceGen {

	public static void generate(ModuleInfo info) {
		TypeSpec service = TypeSpec.interfaceBuilder("I" + info.getModule() + "Service").addModifiers(Modifier.PUBLIC)
				.addMethod(addMethod(info, "save")).addMethod(addMethod(info, "update"))
				.addMethod(addMethod(info, "delete")).addMethod(addMethod(info, "getOne"))
				.addMethod(addMethod(info, "getAll"))
				.addJavadoc("@author:GOURAV CHOPRA \n Generated F/w:SHWR-Framework \n").build();

		JavaFile javaFile = JavaFile.builder(info.getBasePack() + ".service", service).indent("	").build();

		try {
			javaFile.writeTo(new File(info.getFileLoc()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static MethodSpec addMethod(ModuleInfo info, String operationName) {
		Builder builder = MethodSpec
				.methodBuilder(operationName.equals("getAll") ? operationName + info.getModule() + "s"
						: operationName + info.getModule())
				.addModifiers(Modifier.PUBLIC).addModifiers(Modifier.ABSTRACT);

		switch (operationName) {
		case "save":
			builder.addParameter(addModuleNameParameter(info)).returns(info.getPkType());
			break;

		case "update":
			builder.addParameter(addModuleNameParameter(info)).returns(void.class);
			break;

		case "delete":
			builder.addParameter(addModulePkIdParameter(info)).returns(void.class);
			break;

		case "getOne":
			builder.addParameter(addModulePkIdParameter(info)).returns(info.getModuleType());
			break;

		case "getAll":
			builder.returns(ParameterizedTypeName.get(ClassName.bestGuess("java.util.List"), info.getModuleType()));
			break;

		}

		return builder.build();

	}

	private static ParameterSpec addModulePkIdParameter(ModuleInfo info) {
		return ParameterSpec.builder(info.getPkType(), "id").build();
	}

	private static ParameterSpec addModuleNameParameter(ModuleInfo info) {
		return ParameterSpec.builder(info.getModuleType(), info.getModule().toLowerCase()).build();
	}
}
