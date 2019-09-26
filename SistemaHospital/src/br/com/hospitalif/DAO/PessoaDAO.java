package br.com.hospitalif.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.model.Pessoa;

public class PessoaDAO {
	public void save(Pessoa p) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "insert into Pessoa VALUES(?,?,?,?,?,?,?)";
		
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
				stmt.setInt(1,p.getIdPessoa());
				stmt.setString(2,p.getNome());
				stmt.setString(3,p.getCpf());
				stmt.setInt(4,p.getIdade());
				stmt.setString(5,p.getTipoSanguineo());
				stmt.setString(6,p.getSexo());
				stmt.setString(7,p.getStatusPessoa());
				
				stmt.execute();
	}
	public void removeById(int id) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "DELETE FROM Pessoa WHERE id(?)";
		
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
			stmt.setInt(1,id);	
			stmt.execute();
	}
	public void selecionar(Pessoa p) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "SELECT FROM Pessoa(?,?,?,?,?,?,?)";
		
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt.setInt(1,p.getIdPessoa());
		stmt.setString(2,p.getNome());
		stmt.setString(3,p.getCpf());
		stmt.setInt(4,p.getIdade());
		stmt.setString(5,p.getTipoSanguineo());
		stmt.setString(6,p.getSexo());
		stmt.setString(7,p.getStatusPessoa());
				stmt.execute();
	}	
	public void alterar(Pessoa p) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String alterar = "UPDATE Pessoa SET(?,?,?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(alterar);
		stmt.setInt(1,p.getIdPessoa());
		stmt.setString(2,p.getNome());
		stmt.setString(3,p.getCpf());
		stmt.setInt(4,p.getIdade());
		stmt.setString(5,p.getTipoSanguineo());
		stmt.setString(6,p.getSexo());
		stmt.setString(7,p.getStatusPessoa());
				stmt.execute();
	}
}
