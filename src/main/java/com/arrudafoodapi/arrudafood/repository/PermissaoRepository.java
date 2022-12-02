package com.arrudafoodapi.arrudafood.repository;

import java.util.List;

import com.arrudafoodapi.arrudafood.domain.model.Permissao;

public interface PermissaoRepository {

	List<Permissao> listar();

	Permissao buscar(Long id);

	Permissao salvar(Permissao permissao);

	void remover(Permissao permissao);

}
