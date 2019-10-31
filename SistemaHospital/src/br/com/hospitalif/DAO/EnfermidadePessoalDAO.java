package br.com.hospitalif.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.model.EnfermidadePessoal;

public class EnfermidadePessoalDAO {
	
public void save(EnfermidadePessoal ep) throws SQLException {

	Conexao conn = new  Conexao();
	Connection conexao =  conn.getConnection();
	System.out.println(conn.getStatus());
	String sqlInsere = "INSERT INTO EnfermidadePessoal VALUES(?,?,?)";
	PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
	stmt.setInt(1,ep.getIdEnfermidadePessoal());
	stmt.setString(2,ep.getComentario());
	stmt.setString(3,ep.getStatusDeEnfermidade());
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
public List<EnfermidadePessoal> select() {
	List<EnfermidadePessoal> enfermidadePessoais = new ArrayList<EnfermidadePessoal>();
	try {
	Conexao conn = new Conexao();
	Connection conexao = conn.getConnection();
	System.out.println(conn.getStatus());
	String sqlInsere = "SELECT * FROM enfermidadepessoal";
	PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
	ResultSet rs = stmt.executeQuery();
	while(rs.next()) {
		EnfermidadePessoal ep1 = new EnfermidadePessoal();
		ep1.setComentario(rs.getString("comentario"));
		ep1.setStatusDeEnfermidade(rs.getString("statusDeEnfermidade"));
		enfermidadePessoais .add(ep1);
		
	}
	}catch (SQLException e) {
		// TODO: handle exception
	}
	return enfermidadePessoais;
	
}
public void update(EnfermidadePessoal ep) throws SQLException {
	Conexao conn = new Conexao();
	Connection conexao = conn.getConnection();
	System.out.println(conn.getStatus());
	String sqlInsere = "UPDATE EnfermidadePessoal SET(?,?,?) where id =(?)";
	PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
	stmt.setInt(1,ep.getIdEnfermidadePessoal());
	stmt.setString(2,ep.getComentario());
	stmt.setString(3,ep.getStatusDeEnfermidade());
	stmt.execute();	
}
	

}
