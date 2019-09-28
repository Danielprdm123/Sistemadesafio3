package br.com.hospitalif.controller;



import java.sql.SQLException;

import br.com.hospitalif.DAO.PacienteDAO;
import br.com.hospitalif.model.Paciente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;



public class PacienteController {

    @FXML
    private Button btnCadastrar;

    @FXML
    private TextArea txtHistorico;

    @FXML
    private TextArea txtDoenca;

    @FXML
    private Button btnVoltar;

    @FXML
    void Voltardash(ActionEvent event) {
    	

    }

    @FXML
    void cadastrarPaciente(ActionEvent event) throws SQLException {
    	String historico = txtHistorico.getText();
    	String doenca = txtDoenca.getText();
    	Paciente p = new Paciente ();
    	PacienteDAO pDAO = new PacienteDAO();
    	p.setDoenca(doenca);
    	p.setHistorico(historico);
    	pDAO.save(p);

    }
}