package br.com.agenda.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import br.com.agenda.dao.UsuarioDao;
import br.com.agenda.model.Usuario;

@Transactional(propagation=Propagation.REQUIRES_NEW,timeout=100)
@Controller
@SessionAttributes("usuario")
public class UsuarioController {

	@Autowired
	UsuarioDao dao;
	@Autowired
	HttpSession session;

	@RequestMapping("/novo")
	public String novoCadastro(){
			System.out.println("P�gina de cadastro de novo Usu�rio.");
			return "usuario/novo";
		}	
	
	@RequestMapping(value = "cadastrar", method = RequestMethod.POST)
	public String cadastrar(@Valid Usuario usuario,
			//@RequestParam(value = "foto", required = false) MultipartFile foto,
			BindingResult bindingResult, HttpSession session) {
		System.out.println("UsuarioController.cadastrar()");

		// este IF verifica se h� erros na valida��o do formul�rio
		if (bindingResult.hasErrors()) {
			Map<String, Object> model = new HashMap<String, Object>();
			model.put("usuario", usuario);
			System.out.println("Erro na valida��o: Campos n�o preenchidos corretamente.");
			return "/usuario/novo";
		}
		if(usuario.getNome()== null || usuario.getNome().equals("")){return this.novoCadastro();}
		dao.adiciona(usuario);
		session.setAttribute("usuario", usuario);
		System.out.println("Novo usu�rio: " + usuario.getNome()
				+ " Cadastrado com sucesso!");

		// manipulando a foto(upload)
//		if (!foto.isEmpty()) {
//			try {
//				processarFoto(usuario, foto);
//			} catch (IOException e) {
//				System.out.println("Erro ao fazer upload da imagem "
//						+ e.getMessage());
//
//			}
//		}
		return "main/main";
	}

	private void processarFoto(Usuario usuario, MultipartFile foto)
			throws IOException {
		byte[] conteudo = foto.getBytes();
		persistirConteudo(usuario, conteudo);

	}

	private void persistirConteudo(Usuario usuario, byte[] conteudo) {
		System.out.println("upload da imagem realizado com sucesso.");

	}

	// testa a sessao criada a partir do login, nesta requisi��o � poss�vel
	// acessar o usuario
	@RequestMapping("usuario/{usuario.email}")
	public ModelAndView infoAutenticacao(@ModelAttribute("usuario") Usuario user) {
		ModelAndView mav = new ModelAndView("ok");
		mav.getModel().put("usuario", user);
		return mav;
	}

	//login do Usu�rio feito no index, com valida��es.
	@RequestMapping(value = "main", method = RequestMethod.POST)
	public String logar(@Valid Usuario usuario, BindingResult erros,
			HttpSession session) {
		//possue erro no preenchimento do email ou senha?
		System.out.println("UsuarioController: logar()");
		if (erros.hasErrors()) {
			System.out.println("HAS errors");
			return new BaseController().welcome();
		} else {
				Usuario logado = dao.logarUsuario(usuario);
			if (logado != null) {
				
				System.out.println(logado.getNome() + " Logado com sucesso!");
				session.setAttribute("usuarioLogado", logado);
				return "/main/main";
			} else {
				
				return "redirect:/";
			}

		}

	}

	//logout
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		session.invalidate();
		return "redirect:/";
	}
	@RequestMapping("/lista")
	public ModelAndView lista(){
		
		ModelAndView mav = new ModelAndView("ok");
		List<Usuario> usuarios = dao.listar();
		mav.addObject("usuarios", usuarios);
		return mav;
	}
	
}
