package br.com.hospitalif.controller;

import java.io.IOException;
import java.sql.SQLException;

import app.Main;
import br.com.hospitalif.DAO.MedicoDAO;
import br.com.hospitalif.model.Medico;
import br.com.hospitalif.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class MedicoController  extends Main {

    @FXML
    private TextField txtNumregistro;

    @FXML
    private TextField txtEspecialidade;

    @FXML
    private Button btnEnviar;

    @FXML
    private Button btnVolta;
    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtCpf;

    @FXML
    private TextField txtIdade;

    @FXML
    private TextField textSangue;

    @FXML
    private RadioButton cboSexo;

    @FXML
    private ToggleGroup sexo;

    @FXML
    private TextArea txtStatus;

    @FXML
    private TextField txtLogin;

    @FXML
    private PasswordField txtSenha;

    @FXML
    private TextArea txtStatusf;

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
    void Voltardash(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);

    }

}

