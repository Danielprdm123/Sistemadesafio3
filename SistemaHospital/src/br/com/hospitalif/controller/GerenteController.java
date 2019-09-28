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
import javafx.scene.control.TextField;

public class GerenteController extends Main {

    @FXML
    private Button btnEnviar;

    @FXML
    private TextField txtCargo;

    @FXML
    private Button btnVoltar;

    @FXML
    void Enviargerente(ActionEvent event) throws SQLException {
    	String cargo = txtCargo.getText();
    	Gerente g = new Gerente();
    	GerenteDAO gDAO = new GerenteDAO();
    	g.setCargo(cargo);
    	gDAO.save(g);
    }

    @FXML
    void Voltardash(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);

    }

}

