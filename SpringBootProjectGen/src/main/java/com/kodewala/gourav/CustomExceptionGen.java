package com.kodewala.gourav;

import java.io.File;
import java.io.IOException;

import javax.lang.model.element.Modifier;

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

public class CustomExceptionGen {

	public static void generate(ModuleInfo info) {
		TypeSpec service=TypeSpec.classBuilder(info.getModule()+"NotFoundException")
				.superclass(RuntimeException.class)
				.addMethod(MethodSpec.constructorBuilder()
						.addModifiers(Modifier.PUBLIC)
						.build())
				.addMethod(MethodSpec.constructorBuilder()
						.addParameter(String.class, "message")
						.addStatement("super(message)")
						.addModifiers(Modifier.PUBLIC)
						.build())
				.addModifiers(Modifier.PUBLIC)
				.build();
		JavaFile javaFile = JavaFile.builder(info.getBasePack()+".exception", service).build();

		try {
			javaFile.writeTo(new File(info.getFileLoc()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
