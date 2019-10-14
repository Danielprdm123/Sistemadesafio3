package br.com.hospitalif.controller;

import java.io.IOException;
import java.sql.SQLException;

import app.Main;
import br.com.hospitalif.DAO.EnfermeiroDAO;
import br.com.hospitalif.model.Enfermeiro;
import br.com.hospitalif.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;


public class EnfermeiroController extends Main {

    @FXML
    private Button btnEnvirar;

    @FXML
    private TextField txtNumres;

    @FXML
    private Button btnVoltar;
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
    private ToggleGroup Sexo;

    @FXML
    private TextArea txtStatus;

    @FXML
    private TextField txtLogin;

    @FXML
    private PasswordField txtSenha;

    @FXML
    private TextArea txtStatusf;

    @FXML
    void enviarEnfermeiro(ActionEvent event) throws SQLException, IOException {
    	String nome = txtNome.getText();
    	String cpf = txtCpf.getText();
    	int idade = Integer.parseInt(txtIdade.getText());
    	String tipoSangue = textSangue.getText();
    	String sexo = cboSexo.getText();
    	String status = txtStatus.getText();
    	String login = txtLogin.getText();
    	String senha = txtSenha.getText();
    	String statusF = txtStatusf.getText();
    	int  NumRegistroEnfermeiro = Integer.parseInt(txtNumres.getText());
    	
    	Enfermeiro e = new Enfermeiro();
    	EnfermeiroDAO eDAO = new EnfermeiroDAO();
    	e.setNome(nome);
    	e.setCpf(cpf);
    	e.setIdade(idade);
    	e.setTipoSanguineo(tipoSangue);
    	e.setSexo(sexo);
    	e.setStatusPessoa(status);
    	e.setLogin(login);
    	e.setSenha(senha);
    	e.setStatusDeUsuario(statusF);
        e.setNumeroderegistro(NumRegistroEnfermeiro);
    	eDAO.save(e);
    	 openpage(Rotas.DASH);
    }

    @FXML
    void voltardash(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);
    }

}
