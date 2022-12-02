package com.arrudafoodapi.arrudafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.arrudafoodapi.arrudafood.ArrudafoodApplication;
import com.arrudafoodapi.arrudafood.domain.model.FormaPagamento;
import com.arrudafoodapi.arrudafood.repository.FormaPagamentoRepository;

public class ConsultaFormaPagamentoMain {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(ArrudafoodApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);

		FormaPagamentoRepository formaPagamentoRepository = applicationContext.getBean(FormaPagamentoRepository.class);
		
		List<FormaPagamento> todasFormasPagamentos = formaPagamentoRepository.listar();
		
		for (FormaPagamento formaPagamento : todasFormasPagamentos) {
			System.out.println(formaPagamento.getDescricao());
		}	

	}

}
