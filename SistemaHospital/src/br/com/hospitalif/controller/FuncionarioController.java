package br.com.hospitalif.controller;

import java.io.IOException;
import java.sql.SQLException;

import app.Main;
import br.com.hospitalif.model.Funcionario;
import br.com.hospitalif.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FuncionarioController  extends Main{

    @FXML
    private TextField txtLogin;

    @FXML
    private PasswordField txtSenha;

    @FXML
    private TextArea txtStatus;

    @FXML
    private Button btnEnviar;

    @FXML
    private Button btnVoltar;

    @FXML
    void Enviarfuncionario(ActionEvent event) throws SQLException {
    	String login = txtLogin.getText();
    	String senha = txtSenha.getText();
    	String Status = txtStatus.getText();
    	Funcionario f = new Funcionario();
    //	FuncionarioDAO fDAO = new FuncionarioDAO();
    	f.setLogin(login);
    	f.setSenha(senha);
    	f.setStatusDeUsuario(Status);
    	//fDAO.save(f);

    }

    @FXML
    void Voltardash(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);
    }

}
