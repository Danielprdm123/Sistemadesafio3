package br.com.hospitalif.model;

import java.awt.List;
import java.sql.Date;

public class Atendimento {
	private int idAtendimento;
	private String comentarioEnfermeiro;
	private String comentarioMedico;
	private float peso;
	private float altura;
	private Date data;
	private List doenca;
	
	public void setIdAtendimento(int idAtendimento) {
		this.idAtendimento = idAtendimento;
	}
	public int getIdAtendimento() {
		return idAtendimento;
	}
	
	public void setComentarioEnfermeiro(String comentarioEnfermeiro) {
		this.comentarioEnfermeiro = comentarioEnfermeiro;
	}
	public String getComentarioEnfermeiro() {
		return comentarioEnfermeiro;
	}
	
	public void setComentarioMedico(String comentarioMedico) {
		this.comentarioMedico = comentarioMedico;
	}
	public String getComentarioMedico() {
		return comentarioMedico;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getPeso() {
		return peso;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getAltura() {
		return altura;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	public Date getData() {
		return data;
	}
	
	public void setDoenca(List doenca) {
		this.doenca = doenca;
	}
	public List getDoenca() {
		return doenca;
	}
	

}
