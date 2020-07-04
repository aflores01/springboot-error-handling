package com.learning.springboot.error.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	
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

}
