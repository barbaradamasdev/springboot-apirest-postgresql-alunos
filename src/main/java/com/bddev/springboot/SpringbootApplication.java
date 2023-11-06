package com.bddev.springboot;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Gerenciamento de alunos",
				version = "1.0.0",
				description = "Projeto usando Java 17, Springboot 3, PostgreSQL. Repositorio com readme: https://github.com/barbaradamasdev/springboot-postgresql-alunos",
				contact = @Contact(
						name = "Barbara Damasceno",
						email = "barbaradamas.dev@gmail.com"
				)
		)
)
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

}
