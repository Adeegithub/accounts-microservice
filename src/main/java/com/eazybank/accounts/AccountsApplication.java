package com.eazybank.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts Microservice REST API Documentation",
				description = "EasyBank Microservices REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Adeesha Gunawardana",
						email = "adeesha.ag@gmail.com",
						url = "https://adeegithub.github.io/my-portfolio/"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://adeegithub.github.io/my-portfolio/"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "EasyBank Accounts microservices REST API Documentation",
				url = "http://localhost:8080/swagger-ui/index.html#/accounts-controller/deleteAccountDetails"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
