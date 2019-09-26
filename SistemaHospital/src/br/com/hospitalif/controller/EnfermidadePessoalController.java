package br.com.hospitalif.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class EnfermidadePessoalController {

    @FXML
    private Button btnEnviar;

    @FXML
    private Button btnVoltar;

    @FXML
    private TextArea txtStatusEnfermidade;

    @FXML
    private TextArea txtComentario;

    @FXML
    void EnviarEnfermidadePessoal(ActionEvent event) {
    	String statusEnfermidade = txtStatusEnfermidade.getText();
    	String comentario = txtComentario.getText();

    }

    @FXML
    void voltarDash(ActionEvent event) {

    }

}

