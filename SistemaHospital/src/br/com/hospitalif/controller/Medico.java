package br.com.hospitalif.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Medico {

    @FXML
    private TextField txtNumregistro;

    @FXML
    private TextField txtEspecialidade;

    @FXML
    private Button btnEnviar;

    @FXML
    private Button btnVolta;

    @FXML
    void Enviarmedico(ActionEvent event) {
    	String NumRegristroMedico = txtNumregistro.getText();
    	String especialidade = txtEspecialidade.getText();
    	Medico m = new Medico(); 
    	m.set
    }

    @FXML
    void Voltardash(ActionEvent event) {

    }

}

