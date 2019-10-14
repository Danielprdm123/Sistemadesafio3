package br.com.hospitalif.controller;

import java.io.IOException;
import java.sql.SQLException;

import app.Main;
import br.com.hospitalif.DAO.GerenteDAO;
import br.com.hospitalif.model.Gerente;
import br.com.hospitalif.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class GerenteController extends Main {

    @FXML
    private Button btnEnviar;

    @FXML
    private TextField txtCargo;

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
    void Enviargerente(ActionEvent event) throws SQLException, IOException {
    	String nome = txtNome.getText();
    	String cpf = txtCpf.getText();
    	int idade = Integer.parseInt(txtIdade.getText());
    	String tipoSangue = textSangue.getText();
    	String sexo = cboSexo.getText();
    	String status = txtStatus.getText();
    	String login = txtLogin.getText();
    	String senha = txtSenha.getText();
    	String statusF = txtStatusf.getText();
    	String cargo = txtCargo.getText();
    	
    	Gerente g = new Gerente();
    	GerenteDAO gDAO = new GerenteDAO();
    	g.setNome(nome);
    	g.setCpf(cpf);
    	g.setIdade(idade);
    	g.setTipoSanguineo(tipoSangue);
    	g.setSexo(sexo);
    	g.setStatusPessoa(status);
    	g.setLogin(login);
    	g.setSenha(senha);
    	g.setStatusDeUsuario(statusF);
    	g.setCargo(cargo);
    	gDAO.save(g);
    	 openpage(Rotas.DASH);
    }

    @FXML
    void Voltardash(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);

    }

}

