package br.com.hospitalif.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.model.Atendimento;


public class AtendimentoDAO {

	public void save(Atendimento a) throws SQLException {
		Conexao conn = new  Conexao();
		Connection conexao =  conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere ="INSERT INTO Atendimento VALUES (?,?,?,?,?,?) ";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		
		stmt.setString(1, a.getComentarioEnfermeiro());
		stmt.setString(2, a.getComentarioMedico());
		stmt.setFloat(3, a.getPeso());
		stmt.setFloat(4, a.getAltura());
		stmt.setDate(5, a.getData());
		stmt.setString(6, a.getDoenca());
		stmt.execute();
	}
	public void removeById(int id) throws SQLException {
		Conexao conn = new  Conexao();
		Connection conexao =  conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "DELETE from Atendimento where id =(?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt.setInt(1,id);
		stmt.execute();
		
	}
	public void select (Atendimento a) throws SQLException {
		Conexao conn = new  Conexao();
		Connection conexao =  conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "select from Atendimento(?,?,?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		
		stmt.setInt(1, a.getIdAtendimento());
		stmt.setString(2, a.getComentarioEnfermeiro());
		stmt.setString(3, a.getComentarioMedico());
		stmt.setFloat(4, a.getPeso());
		stmt.setFloat(5, a.getAltura());
		stmt.setDate(6, a.getData());
		// stmt.setString(7, a.getDoenca());
		stmt.execute();
		
	}
	
	public void update (Atendimento a) throws SQLException {
		Conexao conn = new  Conexao();
		Connection conexao =  conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "update Atendimento set (?,?,?,?,?,?) where id=(?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		
		stmt.setString(1, a.getComentarioEnfermeiro());
		stmt.setString(2, a.getComentarioMedico());
		stmt.setFloat(3, a.getPeso());
		stmt.setFloat(4, a.getAltura());
		stmt.setDate(5, a.getData());
		stmt.setString(6, a.getDoenca());
		stmt.execute();
		
	}
	
	
}
