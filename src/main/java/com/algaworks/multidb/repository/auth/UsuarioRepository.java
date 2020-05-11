package com.algaworks.multidb.repository.auth;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.multidb.model.auth.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
