package br.com.hospitalif.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Gerente {

    @FXML
    private Button btnEnviar;

    @FXML
    private TextField txtCargo;

    @FXML
    private Button btnVoltar;

    @FXML
    void Enviargerente(ActionEvent event) {
    	String cargo = txtCargo.getText();
    }

    @FXML
    void Voltardash(ActionEvent event) {

    }

}

