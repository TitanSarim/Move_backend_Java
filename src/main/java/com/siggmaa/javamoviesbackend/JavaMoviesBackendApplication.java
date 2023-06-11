package com.siggmaa.javamoviesbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaMoviesBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaMoviesBackendApplication.class, args);

	}
}
