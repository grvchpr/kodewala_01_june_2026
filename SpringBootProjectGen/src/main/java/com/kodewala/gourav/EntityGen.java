package com.kodewala.gourav;

import java.io.File;
import java.io.IOException;

import javax.lang.model.element.Modifier;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class EntityGen {

	public static void generate(ModuleInfo info) {
		TypeSpec model = TypeSpec.classBuilder(info.getModule()).addModifiers(Modifier.PUBLIC)
				.addAnnotation(Entity.class)
				.addAnnotation(AnnotationSpec.builder(Table.class)
						.addMember("name", "\"" + info.getModule().toLowerCase() + "_tab\"").build())
				.addAnnotation(AnnotationSpec.builder(Data.class).build())
				.addAnnotation(AnnotationSpec.builder(NoArgsConstructor.class).build())
				.addAnnotation(AnnotationSpec.builder(AllArgsConstructor.class).build())
				.addField(addPrimaryKeyFiled(info.getPkType()))
				.addJavadoc("@author:GOURAV CHOPRA \n Generated F/w:SHWR-Framework \n").build();

		JavaFile javaFile = JavaFile.builder(info.getBasePack() + ".entity", model).indent("	").build();

		try {
			javaFile.writeTo(new File(info.getFileLoc()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		// System.out.println("Model class Generated");
	}

	/** It generates Primary Key with annotations */
	private static FieldSpec addPrimaryKeyFiled(Class<?> clz) {
		return FieldSpec.builder(clz, "id").addModifiers(Modifier.PRIVATE).addAnnotation(Id.class)
				.addAnnotation(GeneratedValue.class)
				.addAnnotation(AnnotationSpec.builder(Column.class).addMember("name", "\"id\"").build()).build();
	}

}
