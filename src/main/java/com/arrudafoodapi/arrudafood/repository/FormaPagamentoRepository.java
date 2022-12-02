package com.arrudafoodapi.arrudafood.repository;

import java.util.List;

import com.arrudafoodapi.arrudafood.domain.model.FormaPagamento;

public interface FormaPagamentoRepository {

	List<FormaPagamento> listar();

	FormaPagamento buscar(Long id);

	FormaPagamento salvar(FormaPagamento formaPagamento);

	void remover(FormaPagamento formaPagamento);

}
