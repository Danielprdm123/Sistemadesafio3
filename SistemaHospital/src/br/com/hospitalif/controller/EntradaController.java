package br.com.hospitalif.controller;

import java.sql.SQLException;
import java.time.Instant;

import br.com.hospitalif.DAO.EntradaDAO;
import br.com.hospitalif.model.Entrada;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.util.Callback;

public class EntradaController {

    @FXML
    private DatePicker dtDataEntrada;

    @FXML
    private DatePicker dtDataSaida;

    
    @FXML
    private TextArea txtSituacaoPaciente;

    @FXML
    private TextArea txtStatusEntrada;

    @FXML
    private Button btnEnviar;

    @FXML
    private Button btnVoltar;

    @FXML
    void enviarEntrada(ActionEvent event) throws SQLException {
    	Instant dataEntrada = dtDataEntrada.get;
    	Instant dataSaida = dtDataSaida.getValue();
    	String SituacaoPaciente = txtSituacaoPaciente.getText();
    	String statusEntrada = txtStatusEntrada.getText();
    	EntradaDAO enDAO = new EntradaDAO();
    	Entrada en = new Entrada();
    	
    	 en.setDataEntrada(dataEntrada);
    	 en.setDataDeSaida(dataSaida);
    	 en.setSituacaoDePaciente(SituacaoPaciente);
    	en.setStatusDeEntrada(statusEntrada);
    	enDAO.save(en);
    }

    @FXML
    void voltarDash(ActionEvent event) {

    }

}
