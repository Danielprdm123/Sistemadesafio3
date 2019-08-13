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
		return this. idPaciente;
	}
	
	public void setDoenca(List<EnfermidadePessoal>  doenca) {
		this.doenca = doenca;
	}
	public List<EnfermidadePessoal>  getDoenca() {
		return this.doenca;
	}
	
	public void setHistorico(List <Entrada> historico) {
		this.historico = historico;
	}
	public List <Entrada> getHistorico() {
		return this. historico;
	}
	
}
