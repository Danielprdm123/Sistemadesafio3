package br.com.hospitalif.controller;

import java.sql.SQLException;

import br.com.hospitalif.DAO.EnfermidadePessoalDAO;
import br.com.hospitalif.model.EnfermidadePessoal;
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
    void EnviarEnfermidadePessoal(ActionEvent event) throws SQLException {
    	String statusEnfermidade = txtStatusEnfermidade.getText();
    	String comentario = txtComentario.getText();
    	
    	EnfermidadePessoal ep = new EnfermidadePessoal();
    	EnfermidadePessoalDAO epDAO = new EnfermidadePessoalDAO();
    	ep.setStatusDeEnfermidade(statusEnfermidade);
    	ep.setComentario(comentario);
    	epDAO.save(ep);
    }

    @FXML
    void voltarDash(ActionEvent event) {

    }

}

