package br.com.sistemadelogin.conexao;


import java.sql.Connection;
import java.sql.SQLException;

import br.com.sistemadelogin.login.Login;
import br.com.sistemadelogin.login.LoginDAO;

public class Main {
	//<!-- emmerson.henrique@gmail.com -->
	public static void main(String[] args) throws SQLException{ 
		Connection con = CriarConexao.getConexao();
		
		Login l = new Login();
		l.setUsuario("emerson");
		l.setSenha("1234");
		
		LoginDAO dao = new LoginDAO(con);
		dao.adicionar(l);
		
		
		
	}

}
