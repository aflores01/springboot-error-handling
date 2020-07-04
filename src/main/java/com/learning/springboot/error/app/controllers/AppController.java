package com.learning.springboot.error.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	
	@GetMapping("/index")
	private String index() {
		@SuppressWarnings("unused")
		Integer valor = 100/0;
		return "index";
	}

}
