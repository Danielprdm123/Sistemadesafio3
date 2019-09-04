package br.com.hospitalif.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Enfermeiro {

    @FXML
    private Button btnEnvirar;

    @FXML
    private TextField txtNumres;

    @FXML
    private Button btnVoltar;

    @FXML
    void enviarEnfermeiro(ActionEvent event) {
    	String NumRegistroEnfermeiro = txtNumres.getText();

    }

    @FXML
    void voltardash(ActionEvent event) {

    }

}
