package com.kodewala.gourav;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.lang.model.element.Modifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.MethodSpec.Builder;
import com.squareup.javapoet.ParameterSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeSpec;

public class ServiceImplGen {
	public static void generate(ModuleInfo info) {
		TypeSpec service = TypeSpec.classBuilder(info.getModule() + "ServiceImpl").addModifiers(Modifier.PUBLIC)
				.addAnnotation(
						Service.class)
				.addField(
						FieldSpec.builder(ClassName.get(info.getBasePack() + ".repo", info.getModule() + "Repository"),
								"repo", Modifier.PRIVATE).addAnnotation(Autowired.class).build())
				.addSuperinterface(ClassName.get(info.getBasePack() + ".service", "I" + info.getModule() + "Service"))
				.addMethod(addOperation(info, "save")).addMethod(addOperation(info, "update"))
				.addMethod(addOperation(info, "delete")).addMethod(addOperation(info, "getOne"))
				.addMethod(addOperation(info, "getAll"))
				.addJavadoc("@author:GOURAV CHOPRA \n Generated F/w:SHWR-Framework \n").build();
		JavaFile javaFile = JavaFile.builder(info.getBasePack() + ".service.impl", service).build();

		try {
			javaFile.writeTo(new File(info.getFileLoc()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		// System.out.println("ServiceImpl Generated");
	}

	/** Method Parameter as ModuleName */
	private static ParameterSpec addModuleNameParam(ModuleInfo info) {
		return ParameterSpec.builder(info.getModuleType(), info.getModule().toLowerCase()).build();
	}

	/** Method Parameter as PrimaryKey **/
	private static ParameterSpec addPrimaryKeyParam(ModuleInfo info) {
		return ParameterSpec.builder(info.getPkType(), "id").build();
	}

	/** save Operation of module -abstract method */
	private static MethodSpec addOperation(ModuleInfo info, String operationName) {
		Builder method = MethodSpec
				.methodBuilder(operationName.equals("getAll") ? operationName + info.getModule() + "s"
						: operationName + info.getModule())
				.addModifiers(Modifier.PUBLIC).addAnnotation(Override.class);

		switch (operationName) {
		case "save":
			method.addParameter(addModuleNameParam(info)).addAnnotation(Transactional.class)
					.addStatement("return repo.save($L).getId()", info.getModule().toLowerCase())
					.returns(info.getPkType());
			break;
		case "update":
			method.addParameter(addModuleNameParam(info)).addAnnotation(Transactional.class)
					.addStatement("repo.save($L)", info.getModule().toLowerCase()).returns(void.class);
			break;
		case "delete":
			method.addParameter(addPrimaryKeyParam(info)).addAnnotation(Transactional.class)
					.addStatement("repo.deleteById($L)", "id").returns(void.class);
			break;
		case "getOne":
			method.addParameter(addPrimaryKeyParam(info))
					.addAnnotation(AnnotationSpec.builder(Transactional.class).addMember("readOnly", "true").build())
					.addStatement("return repo.findById($L).get()", "id").returns(info.getModuleType());
			break;
		case "getAll":
			method.addAnnotation(AnnotationSpec.builder(Transactional.class).addMember("readOnly", "true").build())
					.addStatement("return repo.findAll()").returns(
							ParameterizedTypeName.get(ClassName.bestGuess(List.class.getName()), info.getModuleType()));
		}
		return method.build();
	}
}
