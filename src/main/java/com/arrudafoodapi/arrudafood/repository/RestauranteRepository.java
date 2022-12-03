package com.arrudafoodapi.arrudafood.repository;

import java.util.List;

import com.arrudafoodapi.arrudafood.domain.model.Restaurante;

public interface RestauranteRepository {
	
	List<Restaurante> listar();
	
	Restaurante buscar(Long id);
	
	Restaurante salvar(Restaurante restaurante);
	
	void remover(Restaurante restaurante);
	

}
