package br.com.sistemadelogin.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CriarConexao {
//<!-- emmerson.henrique@gmail.com -->
	
	public static Connection getConexao() throws SQLException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.print("conectou");
			return DriverManager.getConnection("jdbc:mysql://localhost/sistemaLoginBd","root","123");
		}  catch (SQLException e) {
			throw new SQLException(e);
		}catch (ClassNotFoundException e1) {
			throw new SQLException(e1);
			}	
	
	}
	
}
