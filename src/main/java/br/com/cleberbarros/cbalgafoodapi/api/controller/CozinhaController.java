package br.com.cleberbarros.cbalgafoodapi.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.cleberbarros.cbalgafoodapi.domain.model.Cozinha;
import br.com.cleberbarros.cbalgafoodapi.domain.repository.CozinhaRepository;


@RestController //Substitutui as anotações @RequestBoby e @Controller

// procuces pode ser usando também no @RequestMapping
//@RequestMapping(value = "/cozinhas", produces = MediaType.APPLICATION_XML_VALUE)
@RequestMapping("/cozinhas")
public class CozinhaController {

	@Autowired
	private CozinhaRepository cozinhaRepository;
	
	//produces - especifica qual o tipo é produzido/retornado  
	@GetMapping (produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Cozinha> listar(){
	   return cozinhaRepository.listar();	
	}
	
	/*
	 * Uma outra forma possivel também seria usando um array do mediaType*/
	@GetMapping (value = "/allformat", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public List<Cozinha> listarQualquerFormato(){
	   return cozinhaRepository.listar();	
	}
	
	@ResponseStatus(value = HttpStatus.CREATED) //APENAS EXEMPLO, NÃO FAZ SENTINDO RETORNAR STATUS CREATED
	@GetMapping("/{cozinhaId}")
	public ResponseEntity<Cozinha> buscar(@PathVariable Long cozinhaId) {
	  	Cozinha cozinha = cozinhaRepository.buscar(cozinhaId);
		
		return ResponseEntity.ok(cozinha);
		
	}
	
	
}
