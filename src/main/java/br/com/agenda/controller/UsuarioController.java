package br.com.agenda.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
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

	@RequestMapping(value = "cadastrar", method = RequestMethod.POST)
	public String cadastrar(@Valid Usuario usuario,
			@RequestParam(value = "foto", required = false) MultipartFile foto,
			BindingResult bindingResult, HttpSession session) {

		// este IF verifica se há erros na validação do formulário
		if (bindingResult.hasErrors()) {
			Map<String, Object> model = new HashMap<String, Object>();
			model.put("usuario", usuario);
			System.out.println("Erro na validação");
			return "/novo";
		}

		dao.adiciona(usuario);
		session.setAttribute("usuario", usuario);
		System.out.println("Novo usuário: " + usuario.getNome()
				+ " Cadastrado com sucesso!");

		// manipulando a foto(upload)
		if (!foto.isEmpty()) {
			try {
				processarFoto(usuario, foto);
			} catch (IOException e) {
				System.out.println("Erro ao fazer upload da imagem "
						+ e.getMessage());

			}
		}
		return "ok";
	}

	private void processarFoto(Usuario usuario, MultipartFile foto)
			throws IOException {
		byte[] conteudo = foto.getBytes();
		persistirConteudo(usuario, conteudo);

	}

	private void persistirConteudo(Usuario usuario, byte[] conteudo) {
		System.out.println("upload da imagem realizado com sucesso.");

	}

	// testa a sessao criada a partir do login, nesta requisição é possível
	// acessar o usuario
	@RequestMapping("usuario/{usuario.email}")
	public ModelAndView infoAutenticacao(@ModelAttribute("usuario") Usuario user) {
		ModelAndView mav = new ModelAndView("ok");
		mav.getModel().put("usuario", user);
		return mav;
	}

	//login do funcionario feito no index, com validações.
	@RequestMapping(value = "main", method = RequestMethod.POST)
	public String logar(@Valid Usuario usuario, BindingResult erros,
			HttpSession session) {
		//possue erro no preenchimento do email ou senha?
		if (erros.hasErrors()) {
			System.out.println("HAS errors");
			Map<String, Object> model = new HashMap<String, Object>();
			model.put("usuario", usuario);
			return new BaseController().welcome(model);
		} else {

			if (dao.logarUsuario(usuario)) {
				System.out.println(usuario.getEmail() + " Logado com sucesso!");
				session.setAttribute("usuario", usuario);
				return "main";
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
	
	
}
