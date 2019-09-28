package br.com.hospitalif.controller;

import java.io.IOException;
import java.sql.SQLException;

import app.Main;
import br.com.hospitalif.DAO.EnfermidadeDAO;
import br.com.hospitalif.model.Enfermidade;
import br.com.hospitalif.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class EnfermidadeController extends Main{

    @FXML
    private Button btnEnviar;

    @FXML
    private TextField txtTipo;

    @FXML
    private Button btnVoltar;

    @FXML
    private TextField txtNome;

    @FXML
    private TextArea txtDesc;

   

    @FXML
    void Enviarenfermidade(ActionEvent event) throws SQLException {
    	String TipoEnfermidade = txtTipo.getText();
    	String NomeEnfermidade = txtNome.getText();
    	String descricao = txtDesc.getText();
    	Enfermidade e = new Enfermidade();
    	EnfermidadeDAO  enDAO = new EnfermidadeDAO();
    	
    	e.setTipo(TipoEnfermidade);
    	e.setNome(NomeEnfermidade);
    	e.setDescricao(descricao);
        enDAO.save(e);
    }


    @FXML
    void Voltardash(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);

    }

   

}

