package com.arrudafoodapi.arrudafood.infraestrucute.repository;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;

import com.arrudafoodapi.arrudafood.domain.model.Cozinha;
import com.arrudafoodapi.arrudafood.repository.CozinhaRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Component
public class CozinhaRepositoryImpl implements CozinhaRepository {
	
	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public List<Cozinha> listar() {
		return manager.createQuery("from Cozinha", Cozinha.class)
				.getResultList();
	}
	
	@Override
	public Cozinha buscar(Long id) {
		return manager.find(Cozinha.class, id);
	}
	
	@Transactional
	@Override
	public Cozinha salvar(Cozinha cozinha) {
		return manager.merge(cozinha);
	}
	
	@Transactional
	@Override
	public void remover(Long id) {
		Cozinha cozinha = buscar(id);
		
		if (cozinha == null) {
			throw new EmptyResultDataAccessException(1);
		}
		
		manager.remove(cozinha);
	}
}
