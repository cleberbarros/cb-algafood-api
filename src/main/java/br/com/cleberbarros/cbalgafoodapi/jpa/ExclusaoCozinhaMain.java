package br.com.cleberbarros.cbalgafoodapi.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import br.com.cleberbarros.cbalgafoodapi.CbAlgafoodApiApplication;
import br.com.cleberbarros.cbalgafoodapi.domain.model.Cozinha;

public class ExclusaoCozinhaMain {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new SpringApplicationBuilder(CbAlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
				
		CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);
		
		Cozinha cozinha = new Cozinha();
		cozinha.setId(1L);
		
		cadastroCozinha.remover(cozinha);
		
	}
}
