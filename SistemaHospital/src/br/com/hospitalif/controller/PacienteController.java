package br.com.hospitalif.controller;



import java.io.IOException;
import java.sql.SQLException;

import app.Main;
import br.com.hospitalif.DAO.PacienteDAO;
import br.com.hospitalif.model.Paciente;
import br.com.hospitalif.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;



public class PacienteController extends Main {

    @FXML
    private Button btnCadastrar;

    @FXML
    private TextArea txtHistorico;

    @FXML
    private TextArea txtDoenca;

    @FXML
    private Button btnVoltar;

    @FXML
    void Voltardash(ActionEvent event) throws IOException {
    	 openpage(Rotas.DASH);

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