package com.arrudafoodapi.arrudafood.repository;

import java.util.List;

import com.arrudafoodapi.arrudafood.domain.model.Cozinha;

public interface CozinhaRepository {
	

	List<Cozinha> listar();
	
	List<Cozinha> consultarPorNome(String name);
	
	Cozinha buscar(Long id);
	
	Cozinha salvar(Cozinha cozinha);
	
	void remover(Long id);
	

}
