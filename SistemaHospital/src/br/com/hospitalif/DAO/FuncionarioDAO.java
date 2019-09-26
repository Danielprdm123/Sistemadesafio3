package br.com.hospitalif.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.model.Funcionario;

public class FuncionarioDAO {
	public void save(Funcionario f) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "insert into Gerente VALUES(?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt.setInt(1,f.getIdFuncionario());
		stmt.setString(2,f.getLogin());
		stmt.setString(3,f.getSenha());
		stmt.setString(4,f.getStatusDeUsuario());
		stmt.execute();
	}
	
	public void removeById(int id) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "DELETE FROM Funcionario WHERE id(?)";	
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
			stmt.setInt(1,id);	
			stmt.execute();
	}
	public void selecionar(Funcionario f) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "SELECT FROM Funcionario(?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
				stmt.setInt(1,f.getIdFuncionario());
				stmt.setString(2,f.getLogin());
				stmt.setString(3,f.getSenha());
				stmt.setString(4,f.getStatusDeUsuario());
				stmt.execute();
	}
	public void alterar(Funcionario f) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "UPDATE Funcionario SET(?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
				stmt.setInt(1,f.getIdFuncionario());
				stmt.setString(2,f.getLogin());
				stmt.setString(3,f.getSenha());
				stmt.setString(4,f.getStatusDeUsuario());
				stmt.execute();
	}
}
