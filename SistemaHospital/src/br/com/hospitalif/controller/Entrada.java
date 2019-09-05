package br.com.hospitalif.controller;

import java.time.LocalDate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

public class Entrada {

    @FXML
    private DatePicker dtDataEntrada;

    @FXML
    private DatePicker dtDataSaida;

    @FXML
    private ListView<?> txtSituacaoPaciente;

    @FXML
    private TextArea txtStatusEntrada;

    @FXML
    private Button btnEnviar;

    @FXML
    private Button btnVoltar;

    @FXML
    void enviarEntrada(ActionEvent event) {
    	LocalDate dataEntrada = dtDataEntrada.getValue();
    	LocalDate dataSaida = dtDataSaida.getValue();
    	String SituacaoPaciente = txtSituacaoPaciente.getCellFactory();
    	String statusEntrada = txtStatusEntrada.getText();

    }

    @FXML
    void voltarDash(ActionEvent event) {

    }

}
