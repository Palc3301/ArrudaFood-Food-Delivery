package com.arrudafoodapi.arrudafood.repository;

import java.math.BigDecimal;
import java.util.List;

import com.arrudafoodapi.arrudafood.domain.model.Restaurante;

public interface RestauranteRepositoryQueries {

	List<Restaurante> find(String nome, BigDecimal taxaFreteInicial, BigDecimal taxaFreteFinal);

}