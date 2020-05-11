package com.algaworks.multidb.service;

import java.util.List;

import com.algaworks.multidb.model.app.Livro;

public interface LivroService {

	public List<Livro> obterLivros();
	
	public Livro criar(Livro livro);
}
