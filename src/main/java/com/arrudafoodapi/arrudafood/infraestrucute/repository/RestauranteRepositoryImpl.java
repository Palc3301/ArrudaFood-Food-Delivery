package com.arrudafoodapi.arrudafood.infraestrucute.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.arrudafoodapi.arrudafood.domain.model.Restaurante;
import com.arrudafoodapi.arrudafood.repository.RestauranteRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Component
public class RestauranteRepositoryImpl implements RestauranteRepository {
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Restaurante> todos() {
		return manager.createQuery("FROM Cozinha", Restaurante.class)
		.getResultList();
	}
	
	@Transactional
	@Override
	public Restaurante adicionar(Restaurante restaurante) {
		return manager.merge(restaurante);
	}
	
	@Override
	public Restaurante porID(Long id) {
		return manager.find(Restaurante.class, id);
	}
	
	@Transactional
	@Override
	public void remover(Restaurante restaurante) {
		restaurante = porID(restaurante.getId());
		manager.remove(restaurante);
	}

}
