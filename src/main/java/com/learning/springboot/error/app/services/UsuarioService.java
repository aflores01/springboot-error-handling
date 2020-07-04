package com.learning.springboot.error.app.services;

import java.util.List;
import java.util.Optional;

import com.learning.springboot.error.app.models.domain.Usuario;

public interface UsuarioService {

	public List<Usuario> listar();
	public Usuario obtenerPorId(Integer id);
	public Optional<Usuario> obtenerPorIdOptional(Integer id);
	
}
