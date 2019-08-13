package br.com.hospitalif.model;

public class EnfermidadePessoal {
	private int idEnfermidadePessoal;
	private String  comentario;
	private String  statusDeEnfermidade;
	
	public void setIdEnfermidadePessoal(int idEnfermidadePessoal) {
		this.idEnfermidadePessoal = idEnfermidadePessoal;
	}
	public int getIdEnfermidadePessoal() {
		return this. idEnfermidadePessoal;
	}
	
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public String getComentario() {
		return this.comentario;
	}
	
	public void setStatusDeEnfermidade(String statusDeEnfermidade) {
		this.statusDeEnfermidade = statusDeEnfermidade;
	}
	public String getStatusDeEnfermidade() {
		return this.statusDeEnfermidade;
	}
	
	
}
