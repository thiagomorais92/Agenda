package br.com.agenda.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;






import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import br.com.agenda.dao.JpaUsuarioDao;
import br.com.agenda.interfaces.UsuarioDao;
import br.com.agenda.model.Usuario;

@Transactional
@Controller
@SessionAttributes("usuario")
public class UsuarioController {

	@Autowired
	JpaUsuarioDao dao;

	@RequestMapping("cadastrar")
	public String cadastrar(@Valid Usuario usuario,BindingResult bindingResult) {
		if(bindingResult.hasErrors()){
			System.out.println("Erro na validação");
			return "/novo";
		}
		
		dao.adiciona(usuario);
		return "ok";
	}
	
	@RequestMapping("usuario/autenticado")
	public ModelAndView infoAutenticacao(@ModelAttribute("usuario") Usuario user){
		ModelAndView mav = new ModelAndView("ok");
		mav.getModel().put("usuario", user);
		return mav;
	}
	
	
	@RequestMapping(value="logar", method=RequestMethod.POST)
	public String logar(Usuario user, HttpSession session){
		if( dao.logarUsuario(user)){
			session.setAttribute("usuario", user);
			return "ok";
		}else{return "redirect:/";}
		
	}
	@RequestMapping("listar")
	public ModelAndView listarUsuarios(JpaUsuarioDao dao){
		List<Usuario> lista = dao.listar();
		ModelAndView mv = new ModelAndView("listar");
		mv.addObject("listarUsuarios",lista);
		return mv;
	}
	
}
