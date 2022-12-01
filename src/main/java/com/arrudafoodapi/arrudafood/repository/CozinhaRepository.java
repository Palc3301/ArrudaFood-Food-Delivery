package com.arrudafoodapi.arrudafood.repository;

import java.util.List;

import com.arrudafoodapi.arrudafood.domain.model.Cozinha;

public interface CozinhaRepository {
	
	List<Cozinha> todas();
	
	Cozinha porID(Long id);
	
	Cozinha adicionar(Cozinha cozinha);
	
	void remover(Cozinha cozinha);
	

}
