package br.com.hospitalif.model;

public class Gerente extends Funcionario {
	private String cargo;

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getCargo() {
		return this.cargo;
	}
}
