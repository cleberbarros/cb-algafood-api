package br.com.cleberbarros.cbalgafoodapi.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import br.com.cleberbarros.cbalgafoodapi.CbAlgafoodApiApplication;
import br.com.cleberbarros.cbalgafoodapi.domain.model.Cozinha;
import br.com.cleberbarros.cbalgafoodapi.domain.repository.CozinhaRepository;

public class ConsultaCozinhaMain {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new SpringApplicationBuilder(CbAlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
				
		CozinhaRepository cadastroCozinha = applicationContext.getBean(CozinhaRepository.class);
		
		Cozinha cozinha = cadastroCozinha.buscar(1L);
		
		System.out.println(cozinha.getNome());
		
		
	}
}
