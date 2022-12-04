package com.arrudafoodapi.arrudafood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.arrudafoodapi.arrudafood.infrastrucuture.repository.CustomJpaRepositoryImpl;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = CustomJpaRepositoryImpl.class)
public class ArrudafoodApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArrudafoodApplication.class, args);
	}

}
