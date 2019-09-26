package br.com.hospitalif.controller;

import java.sql.SQLException;

import br.com.hospitalif.DAO.MedicoDAO;
import br.com.hospitalif.model.Medico;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MedicoController {

    @FXML
    private TextField txtNumregistro;

    @FXML
    private TextField txtEspecialidade;

    @FXML
    private Button btnEnviar;

    @FXML
    private Button btnVolta;

    @FXML
    void Enviarmedico(ActionEvent event) throws SQLException {
    	int NumRegristroMedico = Integer.parseInt(txtNumregistro.getText());
    	String especialidade = txtEspecialidade.getText();
    	Medico m = new Medico(); 
		MedicoDAO  mDAO = new MedicoDAO();
		
		m.setEspecialidade(especialidade);
		m.setNumeroderegistro(NumRegristroMedico);
		mDAO.save(m);
      
    }

    @FXML
    void Voltardash(ActionEvent event) {

    }

}

