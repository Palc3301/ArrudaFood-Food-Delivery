package com.arrudafoodapi.arrudafood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arrudafoodapi.arrudafood.domain.model.Cozinha;
import com.arrudafoodapi.arrudafood.domain.model.Restaurante;
import com.arrudafoodapi.arrudafood.exception.CidadeNaoEncontradaException;
import com.arrudafoodapi.arrudafood.repository.RestauranteRepository;

@Service
public class CadastroRestauranteService {

	private static final String MSG_RESTAURANTE_NÂO_ENCONTRADO = "Não existe cadastro de cozinha com código %d";

	@Autowired
	private RestauranteRepository restauranteRepository;

	@Autowired
	private CadastroCozinhaService cadastroCozinha;

	public Restaurante salvar(Restaurante restaurante) {
		Long cozinhaId = restaurante.getCozinha().getId();
		
		Cozinha cozinha = cadastroCozinha.buscarOuFalhar(cozinhaId);
//		Cozinha cozinha = cozinhaRepository.findById(cozinhaId)
//			.orElseThrow(() -> new EntidadeNaoEncontradaException(
//					String.format("Não existe cadastro de cozinha com código %d", cozinhaId)));
		
		restaurante.setCozinha(cozinha);
		
		return restauranteRepository.save(restaurante);
	}
	
	public Restaurante buscarOuFalhar(Long restauranteId) {
		return restauranteRepository.findById(restauranteId)
				.orElseThrow(()-> new CidadeNaoEncontradaException(
				String.format(MSG_RESTAURANTE_NÂO_ENCONTRADO, restauranteId)));
	}

}
