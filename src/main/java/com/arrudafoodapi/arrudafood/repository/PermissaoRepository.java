package com.arrudafoodapi.arrudafood.repository;

import java.util.List;

import com.arrudafoodapi.arrudafood.domain.model.Permissao;

public interface PermissaoRepository {

	List<Permissao> listar();

	Permissao porId(Long id);

	Permissao adicionar(Permissao permissao);

	void remover(Permissao permissao);

}
