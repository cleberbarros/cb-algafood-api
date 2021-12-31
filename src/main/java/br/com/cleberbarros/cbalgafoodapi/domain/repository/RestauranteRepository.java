package br.com.cleberbarros.cbalgafoodapi.domain.repository;

import java.util.List;

import br.com.cleberbarros.cbalgafoodapi.domain.model.Restaurante;

public interface RestauranteRepository {

	List<Restaurante> listar();
	Restaurante buscar(Long id);
	Restaurante salvar(Restaurante cozinha);
	void remover(Restaurante cozinha);
}
