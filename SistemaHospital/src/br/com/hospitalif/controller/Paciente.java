package br.com.hospitalif.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;


public class Paciente {

    @FXML
    private Button btnCadastrar;

    @FXML
    private ListView<?> txtDoenca;

    @FXML
    private ListView<?> txtHistorico;

    @FXML
    private Button btnVoltar;

    @FXML
    void Voltardash(ActionEvent event) {
    	

    }

    @FXML
    void cadastrarPaciente(ActionEvent event) {
    	String doenca = txtDoenca.getCellFactory();
    	String historico = txtHistorico.getCellFactory();

    }
}