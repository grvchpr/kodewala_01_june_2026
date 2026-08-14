package com.kodewala.gourav;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.lang.model.element.Modifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.MethodSpec.Builder;
import com.squareup.javapoet.ParameterSpec;
import com.squareup.javapoet.TypeSpec;

public class ControllerGen {

	public static void generate(ModuleInfo info) {
		TypeSpec controller = TypeSpec.classBuilder(info.getModule() + "Controller").addModifiers(Modifier.PUBLIC)
				.addAnnotation(Controller.class)
				.addAnnotation(AnnotationSpec.builder(RequestMapping.class)
						.addMember("value", "\"/$L\"", info.getModule().toLowerCase()).build())
				// IService Dependency
				.addField(
						FieldSpec
								.builder(ClassName.get(info.getBasePack() + ".service",
										"I" + info.getModule() + "Service"), "service", Modifier.PRIVATE)
								.addAnnotation(Autowired.class).build())

				.addMethod(addOperation(info, "register")).addMethod(addOperation(info, "save"))
				.addMethod(addOperation(info, "getAll")).addMethod(addOperation(info, "delete"))
				.addMethod(addOperation(info, "edit")).addMethod(addOperation(info, "update"))
				.addJavadoc("@author:GOURAV CHOPRA \n Generated F/w:SHWR-Framework \n").build();
		JavaFile javaFile = JavaFile.builder(info.getBasePack() + ".controller", controller).indent("	").build();

		try {
			javaFile.writeTo(new File(info.getFileLoc()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/** Method Parameter as ModuleName */
	private static ParameterSpec addModuleNameParam(ModuleInfo info) {
		return ParameterSpec.builder(info.getModuleType(), info.getModule().toLowerCase())
				.addAnnotation(ModelAttribute.class).build();
	}

	/** Method Parameter as PrimaryKey **/
	private static ParameterSpec addPrimaryKeyParam(ModuleInfo info) {
		return ParameterSpec.builder(info.getPkType(), "id").addAnnotation(RequestParam.class).build();
	}

	private static ParameterSpec addMessageKeyParam(ModuleInfo info) {
		return ParameterSpec.builder(String.class, "message")
				.addAnnotation(AnnotationSpec.builder(RequestParam.class).addMember("value", "\"message\"")
						.addMember("required", "false").build())

				.build();
	}

	/** save Operation of module -abstract method */
	private static MethodSpec addOperation(ModuleInfo info, String operationName) {
		Builder method = MethodSpec
				.methodBuilder(operationName.equals("getAll") ? operationName + info.getModule() + "s"
						: operationName + info.getModule())
				.addModifiers(Modifier.PUBLIC);

		switch (operationName) {
		case "register":
			method.addParameter(ParameterSpec.builder(Model.class, "model").build())
					.addAnnotation(AnnotationSpec.builder(GetMapping.class).addMember("value", "\"/register\"").build())
					.addStatement("model.addAttribute(\"$L\",new $T())", info.getModule().toLowerCase(),
							info.getModuleType())
					.addStatement("return \"" + info.getModule() + "Register\"").returns(String.class);
			break;
		case "save":
			method.addAnnotation(AnnotationSpec.builder(PostMapping.class).addMember("value", "\"/save\"").build())
					.addParameter(addModuleNameParam(info))
					.addParameter(ParameterSpec.builder(Model.class, "model").build())
					.addStatement(info.getPkType().getName() + " id=service.save$L($L)", info.getModule(),
							info.getModule().toLowerCase())
					.addStatement("model.addAttribute(\"message\",\"$L created with Id:\"+id)", info.getModule())
					.addStatement("model.addAttribute(\"$L\",new $T()) ", info.getModule().toLowerCase(),
							info.getModuleType())

					.addStatement("return \"" + info.getModule() + "Register\"").returns(String.class);
			break;

		case "getAll":
			method.addParameter(ParameterSpec.builder(Model.class, "model").build())
					.addParameter((addMessageKeyParam(info)))
					.addAnnotation(AnnotationSpec.builder(GetMapping.class).addMember("value", "\"/all\"").build())
					.addStatement("$T<$L> list=service.getAll$Ls()", List.class, info.getModule(), info.getModule())
					.addStatement("model.addAttribute(\"list\",list)")
					.addStatement("model.addAttribute(\"message\",message)")
					.addStatement("return \"" + info.getModule() + "Data\"").returns(String.class);
			break;

		case "delete":
			method.addParameter(addPrimaryKeyParam(info))
					.addParameter(ParameterSpec.builder(RedirectAttributes.class, "attributes").build())
					.addAnnotation(AnnotationSpec.builder(GetMapping.class).addMember("value", "\"/delete\"").build())
					.beginControlFlow("try").addStatement("service.delete$L($L)", info.getModule(), "id")
					.addStatement("attributes.addAttribute(\"message\",\"$L deleted with Id:\"+id)", info.getModule())
					.nextControlFlow("catch($T e)",
							ClassName.get(info.getBasePack() + ".exception", info.getModule() + "NotFoundException"))
					.addStatement("e.printStackTrace() ")
					.addStatement("attributes.addAttribute(\"message\",e.getMessage())").endControlFlow()

					.addStatement("return \"redirect:all\"").returns(String.class);

			break;

		case "edit":
			method.addParameter(addPrimaryKeyParam(info))
					.addParameter(ParameterSpec.builder(Model.class, "model").build())
					.addParameter(ParameterSpec.builder(RedirectAttributes.class, "attributes").build())
					.addAnnotation(AnnotationSpec.builder(GetMapping.class).addMember("value", "\"/edit\"").build())

					.addStatement("String page=null").beginControlFlow("try")
					.addStatement("$L ob=service.getOne$L($L)", info.getModule(), info.getModule(), "id")
					.addStatement("model.addAttribute(\"$L\",ob)", info.getModule().toLowerCase())
					.addStatement("page=\"$LEdit\"", info.getModule())

					.nextControlFlow("catch($LNotFoundException e)", info.getModule())
					.addStatement("e.printStackTrace() ")
					.addStatement("attributes.addAttribute(\"message\",e.getMessage())")
					.addStatement("page=\"redirect:all\"").endControlFlow()

					.addStatement("return page").returns(String.class);

			break;

		case "update":
			method.addAnnotation(AnnotationSpec.builder(PostMapping.class).addMember("value", "\"/update\"").build())
					.addParameter(addModuleNameParam(info))
					.addParameter(ParameterSpec.builder(RedirectAttributes.class, "attributes").build())
					.addStatement("service.update$L($L)", info.getModule(), info.getModule().toLowerCase())
					.addStatement("attributes.addAttribute(\"message\",\"$L updated\")", info.getModule())
					.addStatement("return \"redirect:all\"").returns(String.class);
			break;
		}
		return method.build();
	}
}
