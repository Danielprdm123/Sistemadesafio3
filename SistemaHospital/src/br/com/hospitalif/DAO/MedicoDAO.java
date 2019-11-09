package br.com.hospitalif.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.model.Medico;

public class MedicoDAO {
	public void save(Medico m) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "INSERT INTO Medico VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt.setInt(1, m.getIdFuncionario());
		stmt.setString(2, m.getNome());
		stmt.setString(3, m.getCpf());
		stmt.setInt(4, m.getIdade());
		stmt.setString(5, m.getTipoSanguineo());
		stmt.setString(6, m.getSexo());
		stmt.setString(7, m.getStatusPessoa());
		stmt.setString(8, m.getLogin());
		stmt.setString(9, m.getSenha());
		stmt.setString(10, m.getStatusDeUsuario());
		stmt.setInt(11, m.getNumeroderegistro());
		stmt.setString(12, m.getEspecialidade());

		stmt.execute();

	}

	public void removeById(int id) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "DELETE from medico where id =(?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt.setInt(1, id);
		stmt.execute();

	}

	public List<Medico> select() {
		List<Medico> medicos = new ArrayList<Medico>();
		try {
			Conexao conn = new Conexao();
			Connection conexao = conn.getConnection();
			System.out.println(conn.getStatus());
			String sqlInsere = "SELECT * FROM Medico ";
			PreparedStatement stmt = conexao.prepareStatement(sqlInsere);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Medico m1 = new Medico();
				m1.setIdFuncionario(rs.getInt("id"));
				m1.setNome(rs.getString("nome"));
				m1.setCpf(rs.getString("cpf"));
				m1.setIdade(rs.getInt("idade"));
				m1.setTipoSanguineo(rs.getString("tipoSanguineo"));
				m1.setSexo(rs.getString("sexo"));
				m1.setStatusPessoa(rs.getString("statusPessoa"));
				m1.setLogin(rs.getString("login"));
				m1.setSenha(rs.getString("senha"));
				m1.setStatusDeUsuario(rs.getString("statusUsuario"));
				m1.setNumeroderegistro(rs.getInt("numeroRegistro"));
				m1.setEspecialidade(rs.getString("especialidade"));
				medicos.add(m1);
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return medicos;

	}

	public void update(Medico m) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "UPDATE Medico SET nome = (?), cpf =(?), idade=(?), tipoSanguineo = (?), sexo = (?), statusPessoa = (?), login = (?),senha = (?), statusUsuario = (?), numeroRegistro = (?), especialidade = (?)  where id=(?)";

		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt.setInt(12, m.getIdFuncionario());
		stmt.setString(1, m.getNome());
		stmt.setString(2, m.getCpf());
		stmt.setInt(3, m.getIdade());
		stmt.setString(4, m.getTipoSanguineo());
		stmt.setString(5, m.getSexo());
		stmt.setString(6, m.getStatusPessoa());
		stmt.setString(7, m.getLogin());
		stmt.setString(8, m.getSenha());
		stmt.setString(9, m.getStatusDeUsuario());
		stmt.setInt(10, m.getNumeroderegistro());
		stmt.setString(11, m.getEspecialidade());
		stmt.executeUpdate();
	}
}
