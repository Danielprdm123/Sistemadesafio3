package br.com.hospitalif.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.model.Medico;

public class MedicoDAO {
	public void save(Medico m) throws SQLException  {
		Conexao conn = new  Conexao();
		Connection conexao =  conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "INSERT INTO MedicoVALUES(?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt.setInt(1, m.getIdFuncionario());
		stmt.setInt(2, m.getNumeroderegistro());
		stmt.setString(3, m.getEspecialidade());
		stmt.execute();
		
	}
	public void removeById(int id) throws SQLException {
		Conexao conn = new  Conexao();
		Connection conexao =  conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "DELETE from medico where id =(?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt.setInt(1,id);
		stmt.execute();
		
	}
	public void selecionar(Medico m) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "SELECT FROM Medico(?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt.setInt(1, m.getIdFuncionario());
		stmt.setInt(2, m.getNumeroderegistro());
		stmt.setString(3, m.getEspecialidade());
		stmt.execute();
	}
	public void alterar(Medico m) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "UPDATE Medico SET(?,?,?)";
		
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt.setInt(1, m.getIdFuncionario());
		stmt.setInt(2, m.getNumeroderegistro());
		stmt.setString(3, m.getEspecialidade());
				stmt.execute();
	}
}
