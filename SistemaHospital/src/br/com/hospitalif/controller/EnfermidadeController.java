package br.com.hospitalif.controller;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

import app.Main;
import br.com.hospitalif.DAO.EnfermidadeDAO;
import br.com.hospitalif.model.Enfermidade;
import br.com.hospitalif.util.Rotas;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class EnfermidadeController extends Main implements Initializable{

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
    private TableView<Enfermidade> ListaEnfermidade;

    @FXML
    private TableColumn<Enfermidade, String> tableNome;

    @FXML
    private TableColumn<Enfermidade, String> tableTipo;

    @FXML
    private TableColumn<Enfermidade, String> tableDesc;

   

    @FXML
    void Enviarenfermidade(ActionEvent event) throws SQLException, IOException {
    	String TipoEnfermidade = txtTipo.getText();
    	String NomeEnfermidade = txtNome.getText();
    	String descricao = txtDesc.getText();
    	Enfermidade e = new Enfermidade();
    	EnfermidadeDAO  enDAO = new EnfermidadeDAO();
    	
    	e.setTipo(TipoEnfermidade);
    	e.setNome(NomeEnfermidade);
    	e.setDescricao(descricao);
        enDAO.save(e);
        openpage(Rotas.DASH);
    }


    @FXML
    void Voltardash(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);

    }
    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		tableNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		tableTipo.setCellValueFactory(new PropertyValueFactory<>("tipo"));
		tableDesc.setCellValueFactory(new PropertyValueFactory<>("descricao"));
		
		EnfermidadeDAO enfdao = new EnfermidadeDAO();
    	List<Enfermidade> enfermidade = enfdao.select();
    	ObservableList<Enfermidade> obsenf = FXCollections.observableArrayList(enfermidade);
    	    	
    	ListaEnfermidade.setItems(obsenf);
    	
		
		
	}

   

}

