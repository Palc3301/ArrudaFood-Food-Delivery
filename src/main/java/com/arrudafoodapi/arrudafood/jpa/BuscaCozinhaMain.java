package com.arrudafoodapi.arrudafood.jpa;

import java.util.Optional;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.arrudafoodapi.arrudafood.ArrudafoodApplication;
import com.arrudafoodapi.arrudafood.domain.model.Cozinha;
import com.arrudafoodapi.arrudafood.repository.CozinhaRepository;

public class BuscaCozinhaMain {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationCOntext = new SpringApplicationBuilder(ArrudafoodApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CozinhaRepository cozinhaRepository = applicationCOntext.getBean(CozinhaRepository.class);
		
		Optional<Cozinha> cozinha = cozinhaRepository.findById(1L);

		
		System.out.println(cozinha.getClass());

	}

}
