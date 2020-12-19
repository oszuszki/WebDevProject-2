package com.oszuszki.beadando;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.oszuszki.beadando")
@SpringBootApplication
public class BeadandoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeadandoApplication.class, args);
	}

}
