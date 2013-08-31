package br.com.sistemadelogin.servlets;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.sistemadelogin.exception.InvalidUserException;



public class LoginControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		processRequest(request, response);
	}


	private void processRequest(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		validaDadosRecebidos(req);
		RequestDispatcher rd = req.getRequestDispatcher("logado.jsp");
		rd.forward(req, resp);
		
	}


	private void validaDadosRecebidos(HttpServletRequest req) throws ServletException {
		String nomeUsuario = req.getParameter("txtUsuario");
		String nomeSenha = req.getParameter("txtSenha");
		 if(!nomeUsuario.trim().equals("emerson") || !nomeSenha.trim().equals("123"))
		throw new InvalidUserException("Login ou Senha Inválida");
  		HttpSession session = req.getSession();
  		session.setAttribute("usuarioautenticado", nomeUsuario);
  	}

}
