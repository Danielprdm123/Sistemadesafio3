package br.com.hospitalif.controller;

import br.com.hospitalif.model.Medico;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MedicoController {

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
      
    }

    @FXML
    void Voltardash(ActionEvent event) {

    }

}

