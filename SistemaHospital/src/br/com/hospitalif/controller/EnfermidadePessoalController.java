package br.com.hospitalif.controller;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

import app.Main;
import br.com.hospitalif.DAO.EnfermidadePessoalDAO;
import br.com.hospitalif.model.EnfermidadePessoal;
import br.com.hospitalif.util.Rotas;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

public class EnfermidadePessoalController extends Main {

    @FXML
    private Button btnEnviar;

    @FXML
    private Button btnVoltar;

    @FXML
    private TextArea txtStatusEnfermidade;

    @FXML
    private TextArea txtComentario;
    @FXML
    private TableView<EnfermidadePessoal> ListaEnfermidadePessoal;

    @FXML
    private TableColumn<EnfermidadePessoal, String> tableComentario;

    @FXML
    private TableColumn<EnfermidadePessoal, String> tableStatusEnf;


    @FXML
    void EnviarEnfermidadePessoal(ActionEvent event) throws SQLException, IOException {
    	String statusEnfermidade = txtStatusEnfermidade.getText();
    	String comentario = txtComentario.getText();
    	
    	EnfermidadePessoal ep = new EnfermidadePessoal();
    	EnfermidadePessoalDAO epDAO = new EnfermidadePessoalDAO();
    	ep.setStatusDeEnfermidade(statusEnfermidade);
    	ep.setComentario(comentario);
    	epDAO.save(ep);
    	 openpage(Rotas.DASH);
    }

    @FXML
    void voltarDash(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);
    }
    public void initialize(URL arg0, ResourceBundle arg1) {
    	tableComentario.setCellValueFactory(new PropertyValueFactory<>("comentario"));
    	tableStatusEnf.setCellValueFactory(new PropertyValueFactory<>("statusDeEnfermidade"));
		
		EnfermidadePessoalDAO enpdao = new EnfermidadePessoalDAO();
    	List<EnfermidadePessoal> enfermidadeP = enpdao.select();
    	ObservableList<EnfermidadePessoal> obsenp = FXCollections.observableArrayList(enfermidadeP);
    	    	
    	ListaEnfermidadePessoal.setItems(obsenp);
    	
		
		
	}

}

