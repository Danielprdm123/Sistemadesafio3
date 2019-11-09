package br.com.hospitalif.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.model.Enfermeiro;

public class EnfermeiroDAO {
	public void save(Enfermeiro e) throws SQLException {
		Conexao conn = new  Conexao();
		Connection conexao =  conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere ="INSERT INTO Enfermeiro VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		
		stmt.setInt(1, e.getIdFuncionario());
		stmt.setString(2,e.getNome());
		stmt.setString(3, e.getCpf());
		stmt.setInt(4, e.getIdade());
		stmt.setString(5, e.getTipoSanguineo());
		stmt.setString(6, e.getSexo());
		stmt.setString(7, e.getStatusPessoa());
		stmt.setString(8, e.getLogin());
		stmt.setString(9, e.getSenha());
		stmt.setString(10, e.getStatusDeUsuario());
		stmt.setInt(11, e.getNumeroderegistro());
		
		
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
		
	}
	
	public List<Enfermeiro> select()  {
		List <Enfermeiro> enfermeiros = new ArrayList<Enfermeiro>();
		try {
			
		Conexao conn = new  Conexao();
		Connection conexao =  conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere ="SELECT * FROM  Enfermeiro ";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			Enfermeiro e1 = new Enfermeiro();
			e1.setIdFuncionario(rs.getInt("id"));
			e1.setNome(rs.getString("nome"));
			e1.setCpf(rs.getString("cpf"));
			e1.setIdade(rs.getInt("idade"));
			e1.setTipoSanguineo(rs.getString("tipoSanguineo"));
			e1.setSexo(rs.getString("sexo"));
			e1.setStatusPessoa(rs.getString("statusPessoa"));
			e1.setLogin(rs.getString("login"));
			e1.setSenha(rs.getString("senha"));
			e1.setStatusDeUsuario(rs.getString("statusUsuario"));
			e1.setNumeroderegistro(rs.getInt("numeroRegistro"));
			enfermeiros.add(e1);
		}
		}catch (SQLException en) {
			// TODO: handle exception
		}
		return enfermeiros;
		
	}
	public void update (Enfermeiro e) throws SQLException {
		Conexao conn = new  Conexao();
		Connection conexao =  conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere ="UPDATE Enfermeiro set nome =(?), cpf=(?),idade=(?),tipoSanguineo=(?),sexo=(?),statusPessoa=(?),login=(?),senha=(?),statusUsuario=(?),numeroRegistro=(?) where id=(?) ";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		
		stmt.setInt(11, e.getIdFuncionario());
		stmt.setString(1,e.getNome());
		stmt.setString(2, e.getCpf());
		stmt.setInt(3, e.getIdade());
		stmt.setString(4, e.getTipoSanguineo());
		stmt.setString(5, e.getSexo());
		stmt.setString(6, e.getStatusPessoa());
		stmt.setString(7, e.getLogin());
		stmt.setString(8, e.getSenha());
		stmt.setString(9, e.getStatusDeUsuario());
		stmt.setInt(10, e.getNumeroderegistro());
		
		
		stmt.execute();

	}
}
