package com.arrudafoodapi.arrudafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.arrudafoodapi.arrudafood.ArrudafoodApplication;
import com.arrudafoodapi.arrudafood.domain.model.Cidade;
import com.arrudafoodapi.arrudafood.repository.CidadeRepository;

public class ConsultaCidadeMain {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(ArrudafoodApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);

		CidadeRepository cidadeRepository = applicationContext.getBean(CidadeRepository.class);
		
		List<Cidade> todasCidades = cidadeRepository.findAll();
		
		for (Cidade cidade : todasCidades) {
			System.out.printf("%s - %s \n", cidade.getNome(), cidade.getEstado().getNome());
		}
	}

}
