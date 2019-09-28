package br.com.hospitalif.model;

import java.util.List;

public class Paciente {
	private int idPaciente;
	private String doenca;
	private String historico;
	
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	public int getIdPaciente() {
		return this. idPaciente;
	}
	
	public void setDoenca(String  doenca) {
		this.doenca = doenca;
	}
	public String  getDoenca() {
		return this.doenca;
	}
	
	public void setHistorico(String historico) {
		this.historico = historico;
	}
	public String getHistorico() {
		return this. historico;
	}
	
}
