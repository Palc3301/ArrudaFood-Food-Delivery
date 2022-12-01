package com.arrudafoodapi.arrudafood.repository;

import java.util.List;

import com.arrudafoodapi.arrudafood.domain.model.Restaurante;

public interface RestauranteRepository {
	
	List<Restaurante> todos();
	
	Restaurante porID(Long id);
	
	Restaurante adicionar(Restaurante restaurante);
	
	void remover(Restaurante restaurante);
	

}
