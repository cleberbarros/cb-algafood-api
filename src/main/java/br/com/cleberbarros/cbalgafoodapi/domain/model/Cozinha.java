package br.com.cleberbarros.cbalgafoodapi.domain.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Cozinha {

  @EqualsAndHashCode.Include 	//Configurando apenas o atributo Id para o Equals e HashCode
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  //@JsonIgnore - ignora a representacao no retorno
  @JsonProperty("TITULO")
  private String nome;
  
}
