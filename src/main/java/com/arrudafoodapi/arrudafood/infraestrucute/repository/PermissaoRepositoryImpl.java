package com.arrudafoodapi.arrudafood.infraestrucute.repository;

import java.util.List;

import org.hibernate.Remove;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.arrudafoodapi.arrudafood.domain.model.Permissao;
import com.arrudafoodapi.arrudafood.repository.PermissaoRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class PermissaoRepositoryImpl implements PermissaoRepository {

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public List<Permissao> listar() {
		return manager.createQuery("FROM Permissao", Permissao.class).getResultList();
	}

	@Override
	public Permissao buscar(Long id) {
		return manager.find(Permissao.class, id);

	}
	
	@Transactional
	@Remove
	public Permissao salvar(Permissao permissao) {
		return manager.merge(permissao);
	}
	
	@Transactional
	@Override
	public void remover(Permissao permissao) {
		permissao = buscar(permissao.getId());
		manager.remove(permissao);
	}

}
