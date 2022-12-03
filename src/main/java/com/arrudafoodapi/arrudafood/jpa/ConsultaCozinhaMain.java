package com.arrudafoodapi.arrudafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.arrudafoodapi.arrudafood.ArrudafoodApplication;
import com.arrudafoodapi.arrudafood.domain.model.Cozinha;
import com.arrudafoodapi.arrudafood.repository.CozinhaRepository;

public class ConsultaCozinhaMain {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationCOntext = new SpringApplicationBuilder(ArrudafoodApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CozinhaRepository cozinhas = applicationCOntext.getBean(CozinhaRepository.class);
		
		List<Cozinha> todasCozinhas = cozinhas.listar();
		
		for(Cozinha cozinha : todasCozinhas) {
			System.out.println(cozinha.getName());
		}
		
	}
}
