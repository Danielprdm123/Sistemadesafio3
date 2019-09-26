package br.com.hospitalif.controller;

import java.sql.SQLException;

import br.com.hospitalif.DAO.GerenteDAO;
import br.com.hospitalif.model.Gerente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class GerenteController {

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
    void Voltardash(ActionEvent event) {

    }

}

