package com.kodewala.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

	@Bean
	public OpenAPI employeeManagementOpenAPI() {
		return new OpenAPI().info(new Info()
				.title("Employee Management API")
				.description("Swagger API for frontend integration and testing")
				.version("v1")
				.contact(new Contact().name("Employee Management Team")));
	}
}
