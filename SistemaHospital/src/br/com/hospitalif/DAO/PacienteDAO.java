package br.com.hospitalif.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.model.Paciente;

public class PacienteDAO {
	public void save(Paciente p) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "INSERT INTO Paciente VALUES(?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
			stmt.setInt(1,p.getIdPaciente());	
			stmt.setString(2,p.getNome());
			stmt.setString(3, p.getCpf());
			stmt.setInt(4, p.getIdade());
			stmt.setString(5, p.getTipoSanguineo());
			stmt.setString(6,p.getSexo());
			stmt.setString(7, p.getStatusPessoa());
			stmt.setString(8,p.getDoenca());
			stmt.setString(9,p.getHistorico());
			stmt.execute();
	}
	public void removeById(int id) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "DELETE FROM Paciente WHERE id=(?)";
		
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
			stmt.setInt(1,id);	
			stmt.execute();
	}
	public List<Paciente> select() {
		List<Paciente> pacientes = new ArrayList<Paciente>();
		try {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "SELECT * FROM Paciente";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			Paciente p1 = new Paciente();
			p1.setNome(rs.getString("nome"));
			p1.setCpf(rs.getString("cpf"));
			p1.setIdade(rs.getInt("idade"));
			p1.setTipoSanguineo(rs.getString("tipoSanguineo"));
			p1.setSexo(rs.getString("sexo"));
			p1.setStatusPessoa(rs.getString("statusPessoa"));
			p1.setDoenca(rs.getString("doenca"));
			p1.setHistorico(rs.getString("historico"));
			pacientes.add(p1);
		}
		}catch (SQLException en) {
			// TODO: handle exception
		}
		return pacientes;
		
	}
	public void updade(Paciente p) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "UPDATE Paciente SET(?,?,?,?,?,?,?,?,?) where id=(?)";
		
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt.setInt(1,p.getIdPaciente());	
		stmt.setString(1,p.getNome());
		stmt.setString(2, p.getCpf());
		stmt.setInt(3, p.getIdade());
		stmt.setString(4, p.getTipoSanguineo());
		stmt.setString(5,p.getSexo());
		stmt.setString(6, p.getStatusPessoa());
		stmt.setString(7,p.getDoenca());
		stmt.setString(8,p.getHistorico());
		stmt.execute();
		
	}

}
