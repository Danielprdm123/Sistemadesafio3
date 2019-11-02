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
		String sqlInsere = "insert into Entrada VALUES(?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt.setInt(1,en.getIdEntrada());
		 stmt.setDate(2, java.sql.Date.valueOf(en.getDataEntrada()));
		 stmt.setDate(3 ,java.sql.Date.valueOf(en.getDataDeSaida()));
		 stmt.setString(4,en.getStatusDeEntrada());
	     stmt.setString(5,en.getSituacaoDePaciente());
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
	public List<Entrada> select() {
		List <Entrada> entradas = new ArrayList<Entrada>();
		try {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "SELECT *  FROM Entrada";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			Entrada en1 = new Entrada();
			en1.setIdEntrada(rs.getInt("id"));
			en1.setDataEntrada(rs.getDate("dataEntrada").toLocalDate());
		    en1.setDataDeSaida(rs.getDate("dataSaida").toLocalDate());
			en1.setStatusDeEntrada(rs.getString("statusEntrada"));
			en1.setSituacaoDePaciente(rs.getString("situacaoPaciente"));
			entradas.add(en1);
		}
		}catch (SQLException e) {
			// TODO: handle exception
		}
		return entradas;

	}
	public void update(Entrada en) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "UPDATE Entrada SET(?,?,?,?,?) where id =(?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		                 
		stmt.setInt(1,en.getIdEntrada());
		 stmt.setDate(2, java.sql.Date.valueOf(en.getDataEntrada()));
		 stmt.setDate(3 ,java.sql.Date.valueOf(en.getDataDeSaida()));
		 stmt.setString(4,en.getStatusDeEntrada());
	     stmt.setString(5,en.getSituacaoDePaciente());
		    stmt.execute();
	}
}
