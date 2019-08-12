package br.com.hospitalif.model;

public class Pessoa {
	private int idPessoa;
	private String nome;
	private String cpf;
	private int idade;
	private String tipoSanguineo;
	private char sexo;
	private String statusPessoa;
	
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}
	public int getIdPessoa() {
		return idPessoa;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return cpf;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade() {
		return idade;
	}
	
	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}
	public String getTipoSanguineo() {
		return tipoSanguineo;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public char getSexo() {
		return sexo;
	}
	
	public void setStatusPessoa(String statusPessoa) {
		this.statusPessoa = statusPessoa;
	}
	public String getStatusPessoa() {
		return statusPessoa;
	}
	
	
	

}
