package com.learning.springboot.error.app.services;

import java.util.List;

import com.learning.springboot.error.app.models.domain.Usuario;

public interface UsuarioService {

	public List<Usuario> listar();
	public Usuario obtenerPorId(Integer id);
	
}
