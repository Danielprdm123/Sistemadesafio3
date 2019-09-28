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
import javafx.scene.control.TextField;


public class EnfermeiroController extends Main {

    @FXML
    private Button btnEnvirar;

    @FXML
    private TextField txtNumres;

    @FXML
    private Button btnVoltar;

    @FXML
    void enviarEnfermeiro(ActionEvent event) throws SQLException {
    	int  NumRegistroEnfermeiro = Integer.parseInt(txtNumres.getText());
    	
    	Enfermeiro e = new Enfermeiro();
    	EnfermeiroDAO eDAO = new EnfermeiroDAO();
        e.setNumeroderegistro(NumRegistroEnfermeiro);
    	eDAO.save(e);
    }

    @FXML
    void voltardash(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);
    }

}
