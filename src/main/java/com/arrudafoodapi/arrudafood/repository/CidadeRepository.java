package com.arrudafoodapi.arrudafood.repository;

import java.util.List;

import com.arrudafoodapi.arrudafood.domain.model.Cidade;

public interface CidadeRepository {
	
	List<Cidade> listar();
	
	Cidade buscar(Long id);
	
	Cidade salvar(Cidade cidade);
	
	void remover(Long id);
}
