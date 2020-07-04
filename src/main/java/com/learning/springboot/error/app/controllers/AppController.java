package com.learning.springboot.error.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.learning.springboot.error.app.errors.UserNotFoundException;
import com.learning.springboot.error.app.models.domain.Usuario;
import com.learning.springboot.error.app.services.UsuarioService;

@Controller
public class AppController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@SuppressWarnings("unused")
	@GetMapping("/index")
	private String index() {
		//
		//Arithmetic Exception
		//Integer valor = 100/0;
		//
		//NumberFormatException
		Integer valor = Integer.parseInt("10x");
		return "index";
	}
	
	@GetMapping("ver/{id}")
	public String ver(@PathVariable Integer id, Model model) {
		Usuario usuario = usuarioService.obtenerPorId(id);
		if (usuario == null) {
			throw new UserNotFoundException(id.toString());
		}
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Detalle de usuario: ".concat(usuario.getNombre()));
		return "ver";
	}

}
