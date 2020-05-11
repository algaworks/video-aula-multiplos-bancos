package com.algaworks.multidb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.multidb.model.app.Livro;
import com.algaworks.multidb.service.LivroService;

@RestController
@RequestMapping("/livros")
public class LivroController {

	@Autowired
	private LivroService livroService;

	@GetMapping
	public List<Livro> obterLivros() {
		return this.livroService.obterLivros();
	}

	@PostMapping
	public ResponseEntity<Livro> criar(@RequestBody Livro livro) {
		
		try {
			
			return ResponseEntity
					.status(HttpStatus.CREATED)
					.body(this.livroService.criar(livro));
			
		} catch (IllegalArgumentException e) {
			
			return ResponseEntity.badRequest().build();
		}
	}
}
