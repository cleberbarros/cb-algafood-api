package br.com.cleberbarros.cbalgafoodapi.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import br.com.cleberbarros.cbalgafoodapi.domain.model.Cozinha;

@Component
public class CadastroCozinha {
	
	@PersistenceContext
	private EntityManager manager;
	
	public List<Cozinha> listar(){
		
		return manager.createQuery("from Cozinha", Cozinha.class)
				.getResultList();
		
	}
	
	public Cozinha buscar (Long id) {
		return manager.find(Cozinha.class, id);
	}
	
	@Transactional //Necessário ter uma transação de banco de dados
	public Cozinha salvar(Cozinha cozinha) {
		return manager.merge(cozinha);
	}
	
	@Transactional
	public void remover(Cozinha cozinha) {
		cozinha = buscar(cozinha.getId());
		manager.remove(cozinha);
	}

}
