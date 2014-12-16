package br.com.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;



import br.com.agenda.dao.JpaUsuarioDao;
import br.com.agenda.interfaces.UsuarioDao;
import br.com.agenda.model.Usuario;

@Transactional
@Controller
public class UsuarioController {

	@Autowired
	JpaUsuarioDao dao = new JpaUsuarioDao();

	@RequestMapping("novo/cadastrar")
	public String cadastrar(Usuario usuario) {

		dao.adiciona(usuario);
		return "ok";
	}

	
}
