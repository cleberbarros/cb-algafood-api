package br.com.cleberbarros.cbalgafoodapi.domain.repository;

import java.util.List;

import br.com.cleberbarros.cbalgafoodapi.domain.model.Cidade;

public interface CidadeRepository {

	List<Cidade> listar();
	Cidade buscar(Long id);
	Cidade salvar(Cidade cidade);
	void remover(Cidade cidade);
	
}
