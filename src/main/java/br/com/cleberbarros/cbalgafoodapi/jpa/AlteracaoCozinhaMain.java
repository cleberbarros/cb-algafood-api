package br.com.cleberbarros.cbalgafoodapi.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import br.com.cleberbarros.cbalgafoodapi.CbAlgafoodApiApplication;
import br.com.cleberbarros.cbalgafoodapi.domain.model.Cozinha;
import br.com.cleberbarros.cbalgafoodapi.domain.repository.CozinhaRepository;

public class AlteracaoCozinhaMain {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new SpringApplicationBuilder(CbAlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
				
		CozinhaRepository cadastroCozinha = applicationContext.getBean(CozinhaRepository.class);
		
		Cozinha cozinha1 = new Cozinha();
		cozinha1.setNome("BR");
		
		Cozinha cozinha2 = new Cozinha();
		cozinha2.setNome("PT");
		
	 	cozinha1 = cadastroCozinha.salvar(cozinha1);
		cozinha2 = cadastroCozinha.salvar(cozinha2);
		
		System.out.println("Cozinha1 = "+cozinha1.getId()+" - "+cozinha1.getNome());
		System.out.println("Cozinha2 = "+cozinha2.getId()+" - "+cozinha2.getNome());
		
		
	}
}
