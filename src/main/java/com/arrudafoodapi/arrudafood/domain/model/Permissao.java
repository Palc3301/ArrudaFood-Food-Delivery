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
@EqualsAndHashCode
@Entity
public class Permissao {
	
	private String name;
	
	@Column(name = "descri_permissao")
	private String descricao;
	
}
