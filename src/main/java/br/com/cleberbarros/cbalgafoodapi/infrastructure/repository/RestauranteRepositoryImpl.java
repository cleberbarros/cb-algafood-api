package br.com.cleberbarros.cbalgafoodapi.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import br.com.cleberbarros.cbalgafoodapi.domain.model.Restaurante;
import br.com.cleberbarros.cbalgafoodapi.domain.repository.RestauranteRepository;

@Component 
public class RestauranteRepositoryImpl implements RestauranteRepository {

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public List<Restaurante> listar() {
		
		return manager.createQuery("from Restaurante", Restaurante.class)
				.getResultList();
	}

	@Override
	public Restaurante buscar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Restaurante salvar(Restaurante cozinha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(Restaurante cozinha) {
		// TODO Auto-generated method stub
		
	}

}
