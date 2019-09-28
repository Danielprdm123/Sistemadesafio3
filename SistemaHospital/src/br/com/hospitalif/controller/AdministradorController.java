package br.com.hospitalif.controller;

import java.io.IOException;

import app.Main;
import br.com.hospitalif.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AdministradorController  extends Main {

    @FXML
    private Button btnCadastrarFuncionario;

    @FXML
    private Button btnvoltar;

  

    @FXML
    void CadastrarFuncionario(ActionEvent event) throws IOException {
    	openpage(Rotas.FUNCIONARIO);
    }


    @FXML
    void voltadash(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);
    }

 

}
