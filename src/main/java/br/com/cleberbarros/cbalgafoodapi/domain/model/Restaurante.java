package br.com.cleberbarros.cbalgafoodapi.domain.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Restaurante {
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false) //Caso tenha sido criado as tabelas manualmente, não precisa do nullable=false
	private String nome;
	
	@Column(name = "taxa_frete", nullable = false) //nullable = false , estou dizendo que no momento de criação não aceitar nulo
	private String taxaFrete;						
	
	@ManyToOne
	//@JoinColumn(name = "cozinha_codigo")
	private Cozinha cozinha;
	
}
