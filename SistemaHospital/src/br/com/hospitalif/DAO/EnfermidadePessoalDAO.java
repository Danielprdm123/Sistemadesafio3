package br.com.hospitalif.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.model.EnfermidadePessoal;
import br.com.hospitalif.model.Medico;

public class EnfermidadePessoalDAO {
public void save(EnfermidadePessoal e) throws SQLException {

	Conexao conn = new  Conexao();
	Connection conexao =  conn.getConnection();
	System.out.println(conn.getStatus());
	String sqlInsere = "INSERT INTO EnfermidadePessoal VALUES(?,?,?)";
	PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
	stmt.setInt(1, 1);
	stmt.setString(2, "come");
	stmt.setString(3, "testando123");
	stmt.execute();
		
	}
		
	

}