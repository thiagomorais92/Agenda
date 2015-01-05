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
		System.out.println("Página de cadastro de novo Usuário.");
		return "novo";
	}	
}
