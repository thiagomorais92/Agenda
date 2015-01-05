package br.com.agenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {

	@RequestMapping("/")
	public String welcome() {
		return "index";
	}

	@RequestMapping("/novo")
public String novoCadastro(){
		System.out.println("P�gina de cadastro de novo Usu�rio.");
		return "novo";
	}	
}
