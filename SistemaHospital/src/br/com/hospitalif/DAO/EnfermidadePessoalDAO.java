package br.com.hospitalif.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.model.EnfermidadePessoal;
import br.com.hospitalif.model.Medico;

public class EnfermidadePessoalDAO {
	
public void save(EnfermidadePessoal ep) throws SQLException {

	Conexao conn = new  Conexao();
	Connection conexao =  conn.getConnection();
	System.out.println(conn.getStatus());
	String sqlInsere = "INSERT INTO EnfermidadePessoal VALUES(?,?)";
	PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
	stmt.setString(1,ep.getComentario());
	stmt.setString(2,ep.getStatusDeEnfermidade());
	stmt.execute();	
	}
public void removeById(int id) throws SQLException {
	Conexao conn = new Conexao();
	Connection conexao = conn.getConnection();
	System.out.println(conn.getStatus());
	String sqlInsere = "DELETE FROM EnfermidadePessoal WHERE id=(?)";	
	PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt.setInt(1,id);	
		stmt.execute();
}
public void update(EnfermidadePessoal ep) throws SQLException {
	Conexao conn = new Conexao();
	Connection conexao = conn.getConnection();
	System.out.println(conn.getStatus());
	String sqlInsere = "SELECT * FROM EnfermidadePessoal";
	PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
	ResultSet rs = stmt.executeQuery();
	List<EnfermidadePessoal> enfermidadePessoais = new ArrayList<EnfermidadePessoal>();
	while(rs.next()) {
		EnfermidadePessoal ep1 = new EnfermidadePessoal();
		ep1.setComentario(rs.getString("comentario"));
		ep1.setStatusDeEnfermidade(rs.getString("comentario"));
		enfermidadePessoais .add(ep1);
		
	}	
	
}
public void alterar(EnfermidadePessoal e) throws SQLException {
	Conexao conn = new Conexao();
	Connection conexao = conn.getConnection();
	System.out.println(conn.getStatus());
	String sqlInsere = "UPDATE EnfermidadePessoal SET(?,?) where id =(?)";
	PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
			stmt.setInt(1,e.getIdEnfermidadePessoal());
			stmt.setString(2,e.getComentario());
			stmt.setString(3,e.getStatusDeEnfermidade());
			stmt.execute();
}
	

}
