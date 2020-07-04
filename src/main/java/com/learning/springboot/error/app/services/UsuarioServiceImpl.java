package com.learning.springboot.error.app.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.learning.springboot.error.app.models.domain.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	private List<Usuario> lista;

	@Override
	public List<Usuario> listar() {
		return this.lista;
	}

	@Override
	public Usuario obtenerPorId(Integer id) {
		Usuario resultado = null;
		for(Usuario u: this.lista) {
			if (u.getId().equals(id)) {
				resultado = u;
				break;
			}
		}
		return resultado;
	}

	public UsuarioServiceImpl() {
		this.lista = new ArrayList<>();
		lista.add(new Usuario(1,"Mary","Stuart"));
		lista.add(new Usuario(2,"Joan","Robles"));
		lista.add(new Usuario(3,"Jaque","Max"));
		lista.add(new Usuario(4,"Rachel","Davis"));
		lista.add(new Usuario(5,"Michel","Korzh"));
		lista.add(new Usuario(6,"Ross","Finch"));
		lista.add(new Usuario(7,"Dave","Kurt"));
	}

	
}
