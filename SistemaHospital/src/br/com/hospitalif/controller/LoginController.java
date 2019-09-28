package br.com.hospitalif.controller;

import java.io.IOException;

import app.Main;
import br.com.hospitalif.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController  extends Main {

    @FXML
    private TextField txtLogin;

    @FXML
    private Button btnEnviar;

    @FXML
    private PasswordField txtSenha;

   

    @FXML
    void Entrar(ActionEvent event) throws IOException {
    	
    	String Login = txtLogin.getText();
    	String senha = txtSenha.getText();
    	System.out.println(txtLogin.getText());
    	//Alert msg = new Alert (AlertType.INFORMATION,"Usuario: " + txtLogin.getText());
    	//msg.setContentText("Minha msg aqui");
    	//msg.setHeaderText("fff");
    	openpage(Rotas.DASH);
    }

  

}
