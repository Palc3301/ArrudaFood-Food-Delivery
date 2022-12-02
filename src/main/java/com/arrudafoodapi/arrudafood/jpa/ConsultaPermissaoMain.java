package com.arrudafoodapi.arrudafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.arrudafoodapi.arrudafood.ArrudafoodApplication;
import com.arrudafoodapi.arrudafood.domain.model.Permissao;
import com.arrudafoodapi.arrudafood.repository.PermissaoRepository;

public class ConsultaPermissaoMain {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(ArrudafoodApplication.class)
				.web(WebApplicationType.NONE).run(args);

		PermissaoRepository permissaoRepository = applicationContext.getBean(PermissaoRepository.class);

		List<Permissao> todasPermissoes = permissaoRepository.listar();

		for (Permissao permissao : todasPermissoes) {
			System.out.printf("%s - %s \n", permissao.getName(), permissao.getDescricao());
		}
	}

}
