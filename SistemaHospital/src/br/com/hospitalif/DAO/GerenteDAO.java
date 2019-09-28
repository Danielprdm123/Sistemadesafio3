package br.com.hospitalif.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.model.Gerente;

public class GerenteDAO {
	public void save(Gerente g) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "INSERT INTO  Gerente VALUES(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		
		stmt.setString(1,g.getNome());
		stmt.setString(2, g.getCpf());
		stmt.setInt(3, g.getIdade());
		stmt.setString(4, g.getTipoSanguineo());
		stmt.setString(5,g.getSexo());
		stmt.setString(6, g.getStatusPessoa());
		stmt.setString(7, g.getLogin());
		stmt.setString(8, g.getSenha());
		stmt.setString(9, g.getStatusDeUsuario());
		stmt.setString(10,g.getCargo());
		stmt.execute();
	}
	public void removeById(int id) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "DELETE FROM Gerente WHERE id=(?)";	
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
			stmt.setInt(1,id);	
			stmt.execute();
	}
	public void select(Gerente g) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "SELECT *  FROM Gerente";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		ResultSet rs = stmt.executeQuery();
		List <Gerente> gerentes = new ArrayList<Gerente>();
		while(rs.next()) {
			Gerente g1 = new Gerente();
			
			g1.setNome(rs.getString("nome"));
			g1.setCpf(rs.getString("cpf"));
			g1.setIdade(rs.getInt("idade"));
			g1.setTipoSanguineo(rs.getString("tipoSanguineo"));
			g1.setSexo(rs.getString("sexo"));
			g1.setStatusPessoa(rs.getString("statusPessoa"));
			g1.setLogin(rs.getString("login"));
			g1.setSenha(rs.getString("senha"));
			g1.setStatusDeUsuario(rs.getString("statusUsuario"));
			g1.setCargo(rs.getString("cargo"));
			gerentes.add(g1);
		}
		
	}
	public void update(Gerente g) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "UPDATE Gerente set(?,?,?,?,?,?,?,?,?,?) where id=(?) ";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt.setString(1,g.getNome());
		stmt.setString(2, g.getCpf());
		stmt.setInt(3, g.getIdade());
		stmt.setString(4, g.getTipoSanguineo());
		stmt.setString(5,g.getSexo());
		stmt.setString(6, g.getStatusPessoa());
		stmt.setString(7, g.getLogin());
		stmt.setString(8, g.getSenha());
		stmt.setString(9, g.getStatusDeUsuario());
		stmt.setString(10,g.getCargo());
				stmt.execute();
	}
	

}
