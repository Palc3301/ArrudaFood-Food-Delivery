package com.arrudafoodapi.arrudafood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arrudafoodapi.arrudafood.domain.model.Cozinha;
import com.arrudafoodapi.arrudafood.domain.model.Restaurante;
import com.arrudafoodapi.arrudafood.exception.EntidadeNaoEncontradaException;
import com.arrudafoodapi.arrudafood.repository.CozinhaRepository;
import com.arrudafoodapi.arrudafood.repository.RestauranteRepository;

@Service
public class CadastroRestauranteService {

	@Autowired
	private RestauranteRepository restauranteRepository;
	
	@Autowired
	private CozinhaRepository cozinhaRepository;
	
	public Restaurante salvar(Restaurante restaurante) {
		Long cozinhaId = restaurante.getCozinha().getId();
		Cozinha cozinha = cozinhaRepository.buscar(cozinhaId);
		
		if (cozinha == null) {
			throw new EntidadeNaoEncontradaException(
				String.format("Não existe cadastro de cozinha com código %d", cozinhaId));
		}
		
		restaurante.setCozinha(cozinha);
		
		return restauranteRepository.salvar(restaurante);
	}
	

}
