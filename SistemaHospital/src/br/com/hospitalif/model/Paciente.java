package br.com.hospitalif.model;

import java.awt.List;

public class Paciente {
	private int idPaciente;
	private List  doenca;
	private List historico;
	
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	public int getIdPaciente() {
		return idPaciente;
	}
	
	public void setDoenca(List doenca) {
		this.doenca = doenca;
	}
	public List getDoenca() {
		return doenca;
	}
	
	public void setHistorico(List historico) {
		this.historico = historico;
	}
	public List getHistorico() {
		return historico;
	}
	
}
