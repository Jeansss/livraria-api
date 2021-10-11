package br.com.alura.livraria.modelo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "autores")
public class Autor {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long Id;

	 private String nome;
	 private String email;
	 private LocalDate data;
	
	

}
