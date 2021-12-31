package br.com.cleberbarros.cbalgafoodapi.domain.repository;

import java.util.List;

import br.com.cleberbarros.cbalgafoodapi.domain.model.Estado;

public interface EstadoRepository {

	List<Estado> listar();
	Estado buscar(Long id);
	Estado salvar(Estado estado);
	void remover(Estado estado);
	
}
