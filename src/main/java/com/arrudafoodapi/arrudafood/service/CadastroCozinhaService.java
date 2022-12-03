package com.arrudafoodapi.arrudafood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.arrudafoodapi.arrudafood.domain.model.Cozinha;
import com.arrudafoodapi.arrudafood.exception.EntidadeEmUsoException;
import com.arrudafoodapi.arrudafood.exception.EntidadeNaoEncontradaException;
import com.arrudafoodapi.arrudafood.repository.CozinhaRepository;

@Service
public class CadastroCozinhaService {

	@Autowired
	private CozinhaRepository cozinhaRepository;
	
	public Cozinha salvar(Cozinha cozinha) {
		return cozinhaRepository.salvar(cozinha);
	}
	
	public void excluir(Long cozinhaId) {
		try {
			cozinhaRepository.remover(cozinhaId);
			
		} catch (EmptyResultDataAccessException e) {
			throw new EntidadeNaoEncontradaException(
				String.format("Não existe um cadastro de cozinha com código %d", cozinhaId));
		
		} catch (DataIntegrityViolationException e) {
			throw new EntidadeEmUsoException(
				String.format("Cozinha de código %d não pode ser removida, pois está em uso", cozinhaId));
		}
	}
	
}
