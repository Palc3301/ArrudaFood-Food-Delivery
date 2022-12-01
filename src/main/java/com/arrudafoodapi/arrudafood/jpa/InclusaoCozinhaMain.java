package com.arrudafoodapi.arrudafood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.arrudafoodapi.arrudafood.ArrudafoodApplication;
import com.arrudafoodapi.arrudafood.domain.model.Cozinha;
import com.arrudafoodapi.arrudafood.repository.CozinhaRepository;

public class InclusaoCozinhaMain {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationCOntext = new SpringApplicationBuilder(ArrudafoodApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		

		CozinhaRepository cozinhaRepository = applicationCOntext.getBean(CozinhaRepository.class);
		
		
		Cozinha cozinha1 = new Cozinha();
		cozinha1.setName("Brasileira");
		
		Cozinha cozinha2 = new Cozinha();
		cozinha2.setName("Japonesa");
		
		cozinha1 = cozinhaRepository.adicionar(cozinha1);
		cozinha2 = cozinhaRepository.adicionar(cozinha2);
		
		System.out.printf("%d - %s\n", cozinha1.getId(), cozinha1.getName());
		System.out.printf("%d - %s\n", cozinha2.getId(), cozinha2.getName());

	}

}
