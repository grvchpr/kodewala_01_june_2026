package com.kodewala.gourav;

import java.io.File;
import java.io.IOException;

import javax.lang.model.element.Modifier;

import org.springframework.data.jpa.repository.JpaRepository;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeSpec;

public class RepositoryGen {

	public static void generate(ModuleInfo info) {
		TypeSpec repo = TypeSpec.interfaceBuilder(info.getModule() + "Repository").addModifiers(Modifier.PUBLIC)
				.addSuperinterface(ParameterizedTypeName.get(ClassName.get(JpaRepository.class), info.getModuleType(),
						ClassName.get(info.getPkType()).box()))
				.addJavadoc("@author:GOURAV CHOPRA \n Generated F/w:SHWR-Framework \n").build();

		JavaFile javaFile = JavaFile.builder(info.getBasePack() + ".repo", repo).indent("	").build();

		try {
			javaFile.writeTo(new File(info.getFileLoc()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
