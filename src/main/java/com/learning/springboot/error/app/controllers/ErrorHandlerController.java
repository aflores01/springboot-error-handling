package com.learning.springboot.error.app.controllers;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//Handling errors
//Mapping to an exception not a path
@ControllerAdvice
public class ErrorHandlerController {
	
	@ExceptionHandler(ArithmeticException.class)
	public String arithmeticError(Exception ex, Model model) {
		model.addAttribute("error","Error Aritmético");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp",new Date());
		return "error/arithmetic";
	}
	
	@ExceptionHandler(NumberFormatException.class)
	public String numberFormatException(NumberFormatException ex, Model model) {
		model.addAttribute("error","Formato incorrecto!");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp",new Date());
		return "error/numberFormat";
		//Return a generic view if all the fields are the same
		//return "error/generic";
	}
	
	@ExceptionHandler(com.learning.springboot.error.app.errors.UserNotFoundException.class)
	public String UserNotFoundException(com.learning.springboot.error.app.errors.UserNotFoundException ex, Model model) {
		model.addAttribute("error","Erro: El usuario no fue encontrado");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp",new Date());
		//return "error/numberFormat";
		//Return a generic view if all the fields are the same
		return "error/generic";
	}

}
