package br.com.hospitalif.model;

import java.util.List;

public class Paciente {
	private int idPaciente;
	private List <EnfermidadePessoal> doenca;
	private List <Entrada>historico;
	
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
