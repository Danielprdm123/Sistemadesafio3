package br.com.hospitalif.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.model.Atendimento;
import br.com.hospitalif.model.Enfermeiro;

public class EnfermeiroDAO {
	public void save(Enfermeiro e) throws SQLException {
		Conexao conn = new  Conexao();
		Connection conexao =  conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere ="INSERT INTO Enfermeiro VALUES (?,?) ";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		
		stmt.setInt(1, e.getIdFuncionario());
		stmt.setInt(2, e.getNumeroderegistro());
		
		
		stmt.execute();
	}

	public void removeById(int id) throws SQLException {
		Conexao conn = new  Conexao();
		Connection conexao =  conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere ="DELETE from Enfermeiro where id =(?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		
		stmt.setInt(1,id);
		stmt.execute();
		stmt.execute();
		
	}
	
	public void selecionar (Enfermeiro e) throws SQLException {
		Conexao conn = new  Conexao();
		Connection conexao =  conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere ="select  from  Enfermeiro VALUES (?,?) ";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		
		stmt.setInt(1, e.getIdFuncionario());
		stmt.setInt(2, e.getNumeroderegistro());
		
		stmt.execute();
		
		
	}
	public void alterar (Enfermeiro e) throws SQLException {
		Conexao conn = new  Conexao();
		Connection conexao =  conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere ="update Enfermeiro set (?,?) ";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		
		stmt.setInt(1, e.getIdFuncionario());
		stmt.setInt(2, e.getNumeroderegistro());
		
		
		stmt.execute();

	}
}
