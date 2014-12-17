package br.com.agenda.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;





import br.com.agenda.dao.JpaUsuarioDao;
import br.com.agenda.interfaces.UsuarioDao;
import br.com.agenda.model.Usuario;

@Transactional
@Controller
public class UsuarioController {

	@Autowired
	JpaUsuarioDao dao = new JpaUsuarioDao();

	@RequestMapping("cadastrar")
	public String cadastrar(@Valid Usuario usuario,BindingResult bindingResult) {
		if(bindingResult.hasErrors()){
			System.out.println("Erro na validação");
			return "novo";
		}
		
		dao.adiciona(usuario);
		return "ok";
	}
	
	@RequestMapping("logar")
	public String logar(Usuario user){
		dao.logarUsuario(user);
		return "ok";
	}

	
}
