package br.com.hospitalif.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.model.Gerente;

public class GerenteDAO {
	public void save(Gerente g) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "insert into Gerente VALUES(?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt.setInt(1, g.getIdFuncionario());
		stmt.setString(2,g.getCargo());
		stmt.execute();
	}
	public void removeById(int id) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "DELETE FROM Gerente WHERE id(?)";	
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
			stmt.setInt(1,id);	
			stmt.execute();
	}
	public void selecionar(Gerente g) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "SELECT FROM Gerente(?) where id(?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt.setInt(1, g.getIdFuncionario());
		stmt.setString(2,g.getCargo());
				stmt.execute();
	}
	public void alterar(Gerente g) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "UPDATE Gerente SET(?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt.setInt(1, g.getIdFuncionario());
		stmt.setString(2,g.getCargo());
				stmt.execute();
	}
	

}
