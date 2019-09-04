package br.com.hospitalif.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Atendimento {

    @FXML
    private DatePicker txtData;

    @FXML
    private TextField txtPeso;

    @FXML
    private ListView<?> txtDoenca;

    @FXML
    private TextArea txtComentarioEnfermeiro;

    @FXML
    private Button btnVoltar;

    @FXML
    private Button btnCadastrar;

    @FXML
    private TextField txtAltura;

    @FXML
    private TextArea txtComentarioMedico;

  

    @FXML
    void cadastrarAtendimento(ActionEvent event) {
    	Chronology data = txtData.getChronology();
    	String peso = txtPeso.getText();
    	String doenca = txtDoenca.getCellFactory();
    	String ComentarioEnfermeiro = txtComentarioEnfermeiro.getText();
    	String altura = txtAltura.getText();
    	String ComentarioMedico = txtComentarioMedico.getText();

    }

    @FXML
    void Voltardash(ActionEvent event) {

    }


}

