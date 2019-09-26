package br.com.hospitalif.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class EnfermidadeController {

    @FXML
    private Button btnEnviar;

    @FXML
    private TextField txtTipo;

    @FXML
    private Button btnVoltar;

    @FXML
    private TextField txtNome;

    @FXML
    private TextArea txtDesc;

   

    @FXML
    void Enviarenfermidade(ActionEvent event) {
    	String TipoEnfermidade = txtTipo.getText();
    	String NomeEnfermidade = txtNome.getText();
    	String descricao = txtDesc.getText();

    }


    @FXML
    void Voltardash(ActionEvent event) {

    }

   

}

