package br.com.hospitalif.controller;

import java.io.IOException;

import app.Main;
import br.com.hospitalif.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AtendenteController extends Main {

    @FXML
    private Button btnCadastrarpaciente;

    @FXML
    private Button btnVoltar;

    @FXML
    void cadastraratendente(ActionEvent event) throws IOException {
    	openpage(Rotas.PACIENTE);
    }

    @FXML
    void voltardash(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);
    }

}
