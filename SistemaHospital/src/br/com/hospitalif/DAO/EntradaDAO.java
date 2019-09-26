package br.com.hospitalif.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.model.Entrada;

public class EntradaDAO {

	public void save(Entrada en) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "insert into Entrada VALUES(?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		    stmt.setInt(1,en.getIdEntrada());
		// stmt.setString(2, en.getDataEntrada());
      //   stmt.setString(3, en.getDataDeSaida());
		    stmt.setString(4,en.getStatusDeEntrada());
	 //   stmt.setString(5,en.getSituacaoDePaciente());
		    stmt.execute();
	}
	public void removeById(int id) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "DELETE FROM Entrada WHERE id(?)";	
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
			stmt.setInt(1,id);	
			stmt.execute();
	}
	public void selecionar(Entrada en) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "SELECT FROM Entrada(?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
	   
		        stmt.setInt(1,en.getIdEntrada());
			// stmt.setString(2, en.getDataEntrada());
	      //   stmt.setString(3, en.getDataDeSaida());
			    stmt.setString(4,en.getStatusDeEntrada());
		 //   stmt.setString(5,en.getSituacaoDePaciente());
				stmt.execute();
	}
	public void alterar(Entrada en) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "UPDATE Entrada SET(?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		                 stmt.setInt(1,en.getIdEntrada());
					// stmt.setString(2, en.getDataEntrada());
			      //   stmt.setString(3, en.getDataDeSaida());
					    stmt.setString(4,en.getStatusDeEntrada());
				 //   stmt.setString(5,en.getSituacaoDePaciente());
						stmt.execute();
				stmt.execute();
	}
}
