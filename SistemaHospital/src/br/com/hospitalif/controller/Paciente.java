package br.com.hospitalif.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.util.Callback;


public class Paciente {

    @FXML
    private Button btnCadastrar;

    @FXML
    private ListView<EnfermidadePessoal> txtDoenca;

    @FXML
    private ListView<Entrada> txtHistorico;

    @FXML
    private Button btnVoltar;

    @FXML
    void Voltardash(ActionEvent event) {
    	

    }

    @FXML
    void cadastrarPaciente(ActionEvent event) {
    	Callback<?, ?> doenca = txtDoenca.getCellFactory();
    	Callback<?, ?> historico = txtHistorico.getCellFactory();

    }
}