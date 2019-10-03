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
    	String nome = txtNome.getText();
    	String cpf = txtCpf.getText();
    	int idade = Integer.parseInt(txtIdade.getText());
    	String tipoSangue = textSangue.getText();
    	String sexo = cboSexo.getText();
    	String status = txtStatus.getText();
    	String login = txtLogin.getText();
    	String senha = txtSenha.getText();
    	String statusF = txtStatusf.getText();
    	int NumRegristroMedico = Integer.parseInt(txtNumregistro.getText());
    	String especialidade = txtEspecialidade.getText();
    	Medico m = new Medico(); 
		MedicoDAO  mDAO = new MedicoDAO();
		m.setNome(nome);
    	m.setCpf(cpf);
    	m.setIdade(idade);
    	m.setTipoSanguineo(tipoSangue);
    	m.setSexo(sexo);
    	m.setStatusPessoa(status);
    	m.setLogin(login);
    	m.setSenha(senha);
    	m.setStatusDeUsuario(statusF);
		m.setEspecialidade(especialidade);
		m.setNumeroderegistro(NumRegristroMedico);
		mDAO.save(m);
      
    }

    @FXML
    void Voltardash(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);

    }

}

