package br.com.hospitalif.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.model.Paciente;

public class PacienteDAO {
	public void save(Paciente p) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "insert into Paciente VALUES(?,?,?)";
		
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
				stmt.setInt(1,p.getIdPaciente());
				//stmt.setString(2,p.getDoenca());
				//stmt.setString(3,p.getHistorico());
				stmt.execute();
	}
	public void removeById(int id) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "DELETE FROM Paciente WHERE id(?)";
		
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
			stmt.setInt(1,id);	
			stmt.execute();
	}
	public void selecionar(Paciente p) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "SELECT FROM Paciente(?,?,?)";
		
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
				stmt.setInt(1,p.getIdPaciente());
				//stmt.setString(2,p.getDoenca());
				//stmt.setString(3,p.getHistorico());
				stmt.execute();
	}
	public void alterar(Paciente p) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "UPDATE Paciente SET(?,?,?)";
		
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
				stmt.setInt(1,p.getIdPaciente());
				//stmt.setString(2,p.getDoenca());
				//stmt.setString(3,p.getHistorico());
				stmt.execute();
	}

}
