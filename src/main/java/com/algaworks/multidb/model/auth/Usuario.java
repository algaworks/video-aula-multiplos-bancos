package com.algaworks.multidb.model.auth;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name =  "usuario")
public class Usuario {

	@Id
	private Long codigo;

	private String nome;

	private String email;

	private String senha;
}
