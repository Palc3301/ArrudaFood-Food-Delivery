package com.arrudafoodapi.arrudafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.arrudafoodapi.arrudafood.ArrudafoodApplication;
import com.arrudafoodapi.arrudafood.domain.model.Cozinha;

public class BuscaCozinhaMain {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationCOntext = new SpringApplicationBuilder(ArrudafoodApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CadastroCozinha cadastroCozinha = applicationCOntext.getBean(CadastroCozinha.class);
		
		Cozinha cozinha = cadastroCozinha.buscarCozinha(1L);
		
		System.out.println(cozinha.getNome());

	}

}
