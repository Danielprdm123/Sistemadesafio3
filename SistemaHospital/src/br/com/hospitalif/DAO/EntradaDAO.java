package br.com.hospitalif.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.model.Entrada;

public class EntradaDAO {

	public void save(Entrada en) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "insert into Entrada VALUES(?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		 //stmt.setString(1, en.getDataEntrada());
         //stmt.setString(2, en.getDataDeSaida());
		 stmt.setString(3,en.getStatusDeEntrada());
	     stmt.setString(4,en.getSituacaoDePaciente());
		    stmt.execute();
	}
	public void removeById(int id) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "DELETE FROM Entrada WHERE id=(?)";	
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
			stmt.setInt(1,id);	
			stmt.execute();
	}
	public void update(Entrada en) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "SELECT *  FROM Entrada";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		ResultSet rs = stmt.executeQuery();
		List <Entrada> entradas = new ArrayList<Entrada>();
		while(rs.next()) {
			Entrada en1 = new Entrada();
			en1.setDataEntrada(rs.getDate("dataEntrada"));
			en1.setDataDeSaida(rs.getDate("dataSaida"));
			en1.setStatusDeEntrada(rs.getString("statusEntrada"));
			en1.setSituacaoDePaciente(rs.getString("situacaoPaciente"));
			entradas.add(en1);
		}

	}
	public void alterar(Entrada en) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "UPDATE Entrada SET(?,?,?,?) where id =(?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		                 
		 //stmt.setString(1, en.getDataEntrada());
        //stmt.setString(2, en.getDataDeSaida());
		 stmt.setString(3,en.getStatusDeEntrada());
	     stmt.setString(4,en.getSituacaoDePaciente());
		    stmt.execute();
	}
}
