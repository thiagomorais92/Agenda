package br.com.agenda.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import br.com.agenda.controller.BaseController;

public class AutenticadorInterceptor extends HandlerInterceptorAdapter {

	
		@Override
		public boolean preHandle(HttpServletRequest request,
				HttpServletResponse response, Object handler) throws Exception {
			String uri = request.getRequestURI();
			
			if(uri.endsWith("novo") ||
					uri.endsWith("main") ||
					uri.endsWith("agenda/") ||
					uri.contains("resources")){
				System.out.println("Interceptor: nos IFS que podem seguir");
				return true;
				}
			
			if(request.getSession().getAttribute("usuarioLogado") != null){
				System.out.println("Autenticador, OK!");
				return true;
			}
			System.out.println("qualquer requisição sem autenticação." );
			response.sendRedirect("redirect:/");
			return false;
		}
}
