package br.com.hospitalif.model;

public class Medico extends Funcionario {
	
	private int numeroderegistro;
	private String especialidade;
	
	public void setNumeroderegistro(int numeroderegistro) {
		this.numeroderegistro = numeroderegistro;
	}
	public int getNumeroderegistro() {
		return numeroderegistro;
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	
	
}
