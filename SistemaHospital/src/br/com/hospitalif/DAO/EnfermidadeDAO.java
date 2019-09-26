package br.com.hospitalif.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.model.Enfermidade;

public class EnfermidadeDAO {
	public void save(Enfermidade e) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "insert into Enfermidade VALUES(?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
			stmt.setInt(1,e.getIdEnfermidade());
			stmt.setString(2,e.getNome());
			stmt.setString(3,e.getTipo());
			stmt.setString(4,e.getDescricao());
			stmt.execute();
	}
	public void  removeById(int id) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "DELETE FROM EnfermidadePessoal WHERE id(?)";	
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
			stmt.setInt(1,id);	
			stmt.execute();
	}

	public void selecionar(Enfermidade e) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "SELECT FROM Enfermidade(?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
			stmt.setInt(1,e.getIdEnfermidade());
			stmt.setString(2,e.getNome());
			stmt.setString(3,e.getTipo());
			stmt.setString(4,e.getDescricao());
			stmt.execute();
	}
	public void alterar(Enfermidade e) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "UPDATE Enfermidade SET(?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
			stmt.setInt(1,e.getIdEnfermidade());
			stmt.setString(2,e.getNome());
			stmt.setString(3,e.getTipo());
			stmt.setString(4,e.getDescricao());
			stmt.execute();
	}
	
}
