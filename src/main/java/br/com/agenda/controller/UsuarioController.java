package br.com.agenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.agenda.dao.UsuarioDao;
import br.com.agenda.model.Usuario;

@Controller
public class UsuarioController {

@RequestMapping("novo/cadastrar")
public String cadastrar(Usuario usario,UsuarioDao dao){
	System.out.println("cadastrando");
	dao.salvar(usario);
		return "String";
	
	}	
}
