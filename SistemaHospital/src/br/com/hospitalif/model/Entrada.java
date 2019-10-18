package br.com.hospitalif.model;

import java.time.LocalDate;

public class Entrada {
	private int idEntrada;
	private LocalDate  dataEntrada;
	private LocalDate  dataDeSaida;
	private String statusDeEntrada;
	private String situacaoDePaciente;
	
	public void setIdEntrada(int idEntrada) {
		this.idEntrada = idEntrada;
	}
	public int getIdEntrada() {
		return this. idEntrada;
	}

	public void setDataEntrada(LocalDate  dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public LocalDate  getDataEntrada() {
		return this. dataEntrada;
	}
	
	public void setDataDeSaida(LocalDate  dataDeSaida) {
		this.dataDeSaida = dataDeSaida;
	}
	public LocalDate  getDataDeSaida() {
		return this.dataDeSaida;
	}
	
	public void setStatusDeEntrada(String statusDeEntrada) {
		this.statusDeEntrada = statusDeEntrada;
	}
	public String getStatusDeEntrada() {
		return this.statusDeEntrada;
	}
	
	public void setSituacaoDePaciente(String situacaoDePaciente) {
		this.situacaoDePaciente = situacaoDePaciente;
	}
	public String getSituacaoDePaciente() {
		return this.situacaoDePaciente;
	}
	
	

}
