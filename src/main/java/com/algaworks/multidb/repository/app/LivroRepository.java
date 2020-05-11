package com.algaworks.multidb.repository.app;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.multidb.model.app.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}
