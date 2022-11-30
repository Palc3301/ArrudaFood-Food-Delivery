package com.arrudafoodapi.arrudafood.jpa;

import java.util.List;

import org.springframework.stereotype.Component;

import com.arrudafoodapi.arrudafood.domain.model.Cozinha;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Component
public class CadastroCozinha {
	
	@PersistenceContext
	private EntityManager manager;
	
	
	public List<Cozinha> listar(){
		
		TypedQuery<Cozinha> query = manager.createQuery("FROM Cozinha", Cozinha.class);
		return query.getResultList();
	}
	
	@Transactional
	public Cozinha adicionar(Cozinha cozinha) {
		return manager.merge(cozinha);
	}
	
	public Cozinha buscarCozinha(Long id) {
		return manager.find(Cozinha.class, id);
	}
}
