package br.com.hospitalif.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Login {

    @FXML
    private TextField txtLogin;

    @FXML
    private Button btnEnviar;

    @FXML
    private PasswordField txtSenha;

   

    @FXML
    void Entrar(ActionEvent event) {
    	//System.out.println(txtLogin.getText());
    	//Alert msg = new Alert (AlertType.INFORMATION,"Usuario: " + txtLogin.getText());
    	//msg.setContentText("Minha msg aqui");
    	//msg.setHeaderText("fff");
    	String Login = txtLogin.getText();
    	String senha = txtSenha.getText();
    }

  

}
