package br.com.hospitalif.model;

public class Funcionario {
	private int idFuncionario;
	private String login;
	private String senha;
	private String statusDeUsuario;
	
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public int getIdFuncionario() {
		return idFuncionario;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	public String getLogin() {
		return login;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getSenha() {
		return senha;
	}
	
	public void setStatusDeUsuario(String statusDeUsuario) {
		this.statusDeUsuario = statusDeUsuario;
	}
	public String getStatusDeUsuario() {
		return statusDeUsuario;
	}
	

}
