package com.arrudafoodapi.arrudafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.arrudafoodapi.arrudafood.ArrudafoodApplication;
import com.arrudafoodapi.arrudafood.domain.model.Restaurante;
import com.arrudafoodapi.arrudafood.repository.RestauranteRepository;

public class ConsultaRestaurante {
public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationCOntext = new SpringApplicationBuilder(ArrudafoodApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		RestauranteRepository restauranteRepository = applicationCOntext.getBean(RestauranteRepository.class);
		
		List<Restaurante> todosRestaurante = restauranteRepository.todos();
		
		for(Restaurante restaurante : todosRestaurante) {
			System.out.printf("%s - %f - %s\n", restaurante.getName(), restaurante.getShippingFee(),
					restaurante.getCozinha().getName());
		
		}
		
	}

}
