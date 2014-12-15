package br.com.agenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.agenda.dao.UsuarioDao;
import br.com.agenda.model.Usuario;

@Controller
@Transactional
public class UsuarioController {

@RequestMapping("novo/cadastrar")

public String cadastrar(Usuario usuario,UsuarioDao dao){
	dao.salvar(usuario);
		return "ok";
	
	}	
}
