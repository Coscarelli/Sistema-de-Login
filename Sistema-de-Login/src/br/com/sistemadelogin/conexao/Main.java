package br.com.sistemadelogin.conexao;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
	//<!-- emmerson.henrique@gmail.com -->
	public static void main(String[] args) throws SQLException {
		Connection con = CriarConexao.getConexao();
	}

}
