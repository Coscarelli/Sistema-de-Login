package br.com.sistemadelogin.login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sistemadelogin.conexao.CriarConexao;

/**
 * Servlet implementation class CadastroLoginServlet
 */
public class CadastroLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroLoginServlet() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		
  Connection con;
try {
	con = CriarConexao.getConexao();
	
	Login l = new Login();
	l.setUsuario(usuario);
	l.setSenha(senha);
	
	LoginDAO dao = new LoginDAO(con);
	dao.adicionar(l);
	
  } catch (SQLException e) {
	e.printStackTrace();
   }		
		
	}

}
