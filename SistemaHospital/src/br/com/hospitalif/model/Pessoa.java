package br.com.hospitalif.model;

public class Pessoa {
	private int idPessoa;
	private String nome;
	private String cpf;
	private int idade;
	private String tipoSanguineo;
	private String sexo;
	private String statusPessoa;
	
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}
	public int getIdPessoa() {
		return this.idPessoa;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return this.cpf;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade() {
		return this.idade;
	}
	
	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}
	public String getTipoSanguineo() {
		return this.tipoSanguineo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getSexo() {
		return this.sexo;
	}
	
	public void setStatusPessoa(String statusPessoa) {
		this.statusPessoa = statusPessoa;
	}
	public String getStatusPessoa() {
		return this.statusPessoa;
	}
	
	
	

}
