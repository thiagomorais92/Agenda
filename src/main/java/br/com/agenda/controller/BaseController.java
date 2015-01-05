package br.com.agenda.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		return "index";
	}

	@RequestMapping("/novo")
public String novoCadastro(){
		System.out.println("Página de cadastro de novo Usuário.");
		return "novo";
	}	
}
