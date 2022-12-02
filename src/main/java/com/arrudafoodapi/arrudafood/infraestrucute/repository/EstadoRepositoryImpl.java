package com.arrudafoodapi.arrudafood.infraestrucute.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.arrudafoodapi.arrudafood.domain.model.Estado;
import com.arrudafoodapi.arrudafood.repository.EstadoRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Component
public class EstadoRepositoryImpl implements EstadoRepository {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Estado> listar() {
		return manager.createQuery("FROM Estado", Estado.class).getResultList();
	}

	@Override
	public Estado buscar(Long id) {
		return manager.find(Estado.class, id);
	}

	@Override
	public Estado salvar(Estado estado) {
		return manager.merge(estado);
	}

	@Transactional
	@Override
	public void remover(Estado estado) {
		estado = buscar(estado.getId());
		manager.remove(estado);
	}
}
