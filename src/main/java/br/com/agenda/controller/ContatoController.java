package br.com.agenda.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import br.com.agenda.dao.ContatoDao;
import br.com.agenda.model.Contato;
import br.com.agenda.model.Usuario;

@Controller
@Transactional
@SessionAttributes("usuario")
public class ContatoController {

	@Autowired
	ContatoDao dao;
	@Autowired
	HttpSession session;
	
	@RequestMapping("contato/add")
	public ModelAndView addContato(){
		Usuario teste = (Usuario) session.getAttribute("usuarioLogado");
		System.out.println("fazendo um teste: "+teste.getId()+teste.getEmail());
		ModelAndView mav = new ModelAndView("contato/add");
		return mav;
	}
	@RequestMapping("contato/salvar")
	public String salvar(Contato c){
		dao.adiciona(c);
		return "ok";
		
	}
	
}
