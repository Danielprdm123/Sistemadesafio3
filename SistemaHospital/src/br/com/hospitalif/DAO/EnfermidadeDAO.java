package br.com.hospitalif.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.model.Enfermidade;

public class EnfermidadeDAO {
	public void save(Enfermidade e) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "insert into Enfermidade VALUES(?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
			stmt.setString(1,e.getNome());
			stmt.setString(2,e.getTipo());
			stmt.setString(3,e.getDescricao());
			stmt.execute();
	}
	public void  removeById(int id) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "DELETE  FROM Enfermidade WHERE id=(?)";	
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt.setInt(1,id);
		stmt.execute();

	}

	public void select(Enfermidade e) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "SELECT *  FROM Enfermidade";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		ResultSet rs = stmt.executeQuery();
		List<Enfermidade> enfermidades = new ArrayList<Enfermidade>();
		while(rs.next()) {
			Enfermidade e1 = new Enfermidade();
			e1.setNome(rs.getString("nome"));
			e1.setTipo(rs.getString("tipo"));
			e1.setDescricao(rs.getString("tipo"));
			enfermidades.add(e1);
			
		}
			
	}
	public void updade(Enfermidade e) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "UPDATE Enfermidade SET(?,?,?) where id =(?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
			stmt.setInt(1,e.getIdEnfermidade());
			stmt.setString(1,e.getNome());
			stmt.setString(2,e.getTipo());
			stmt.setString(3,e.getDescricao());
			stmt.execute();
	}
	
}
