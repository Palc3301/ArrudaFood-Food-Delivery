package com.arrudafoodapi.arrudafood.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode()
@Entity
public class FormaPagamento {

	@Column(name = "descri_pagamento")
	private String descricao;
}
