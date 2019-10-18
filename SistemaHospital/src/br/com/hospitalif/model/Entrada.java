package br.com.hospitalif.model;


public class Entrada {
	private int idEntrada;
	private long  dataEntrada;
	private long  dataDeSaida;
	private String statusDeEntrada;
	private String situacaoDePaciente;
	
	public void setIdEntrada(int idEntrada) {
		this.idEntrada = idEntrada;
	}
	public int getIdEntrada() {
		return this. idEntrada;
	}

	public void setDataEntrada(long  dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public long  getDataEntrada() {
		return this. dataEntrada;
	}
	
	public void setDataDeSaida(long  dataDeSaida) {
		this.dataDeSaida = dataDeSaida;
	}
	public long  getDataDeSaida() {
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
