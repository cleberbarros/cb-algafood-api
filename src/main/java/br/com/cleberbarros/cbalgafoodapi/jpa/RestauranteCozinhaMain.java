package br.com.cleberbarros.cbalgafoodapi.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import br.com.cleberbarros.cbalgafoodapi.CbAlgafoodApiApplication;
import br.com.cleberbarros.cbalgafoodapi.domain.model.Cozinha;
import br.com.cleberbarros.cbalgafoodapi.domain.model.Restaurante;
import br.com.cleberbarros.cbalgafoodapi.domain.repository.CozinhaRepository;
import br.com.cleberbarros.cbalgafoodapi.domain.repository.RestauranteRepository;

public class RestauranteCozinhaMain {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new SpringApplicationBuilder(CbAlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
				
		RestauranteRepository cadastroResturante = applicationContext.getBean(RestauranteRepository.class);
		
		List<Restaurante> restaurantes = cadastroResturante.listar();
		
		for (Restaurante restaurante : restaurantes) {
			System.out.printf("%s - %s - %s\n", restaurante.getId(),restaurante.getNome(),restaurante.getCozinha().getNome());
		}
		
	}
}
