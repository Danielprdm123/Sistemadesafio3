package br.com.hospitalif.model;

public class Enfermidade {
	private int idEnfermidade;
	private String nome;
	private String tipo;
	private String descricao;
	
	public void setIdEnfermidade(int idEnfermidade) {
		this.idEnfermidade = idEnfermidade;
	}
	public int getIdEnfermidade() {
		return idEnfermidade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
	


}
