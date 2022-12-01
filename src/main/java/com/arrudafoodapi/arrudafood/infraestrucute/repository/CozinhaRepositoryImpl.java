package com.arrudafoodapi.arrudafood.infraestrucute.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.arrudafoodapi.arrudafood.domain.model.Cozinha;
import com.arrudafoodapi.arrudafood.repository.CozinhaRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Component
public class CozinhaRepositoryImpl implements CozinhaRepository{
	
	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public List<Cozinha> todas() {
		return manager.createQuery("FROM Cozinha", Cozinha.class)
		.getResultList();
	}
	
	@Transactional
	@Override
	public Cozinha adicionar(Cozinha cozinha) {
		return manager.merge(cozinha);
	}
	
	@Override
	public Cozinha porID(Long id) {
		return manager.find(Cozinha.class, id);
	}
	
	@Transactional
	@Override
	public void remover(Cozinha cozinha) {
		cozinha = porID(cozinha.getId());
		manager.remove(cozinha);
	}

}
