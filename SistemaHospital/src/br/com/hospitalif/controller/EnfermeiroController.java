package br.com.hospitalif.controller;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

import app.Main;
import br.com.hospitalif.DAO.EnfermeiroDAO;
import br.com.hospitalif.model.Enfermeiro;
import br.com.hospitalif.util.Rotas;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;


public class EnfermeiroController extends Main implements Initializable{

    @FXML
    private Button btnEnvirar;

    @FXML
    private TextField txtNumres;

    @FXML
    private Button btnVoltar;
    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtCpf;

    @FXML
    private TextField txtIdade;

    @FXML
    private TextField textSangue;

    @FXML
    private RadioButton cboSexo;

    @FXML
    private ToggleGroup Sexo;

    @FXML
    private TextArea txtStatus;

    @FXML
    private TextField txtLogin;

    @FXML
    private PasswordField txtSenha;

    @FXML
    private TextArea txtStatusf;
    @FXML
    private TableView<Enfermeiro> ListaEnfermeiro;
    @FXML
    private TableColumn<Enfermeiro, String> tableNome;

    @FXML
    private TableColumn<Enfermeiro, String> tableLogin;

    @FXML
    private TableColumn<Enfermeiro, Float> tabkeRegis;

    @FXML
    void enviarEnfermeiro(ActionEvent event) throws SQLException, IOException {
    	String nome = txtNome.getText();
    	String cpf = txtCpf.getText();
    	int idade = Integer.parseInt(txtIdade.getText());
    	String tipoSangue = textSangue.getText();
    	String sexo = cboSexo.getText();
    	String status = txtStatus.getText();
    	String login = txtLogin.getText();
    	String senha = txtSenha.getText();
    	String statusF = txtStatusf.getText();
    	int  NumRegistroEnfermeiro = Integer.parseInt(txtNumres.getText());
    	
    	Enfermeiro e = new Enfermeiro();
    	EnfermeiroDAO eDAO = new EnfermeiroDAO();
    	e.setNome(nome);
    	e.setCpf(cpf);
    	e.setIdade(idade);
    	e.setTipoSanguineo(tipoSangue);
    	e.setSexo(sexo);
    	e.setStatusPessoa(status);
    	e.setLogin(login);
    	e.setSenha(senha);
    	e.setStatusDeUsuario(statusF);
        e.setNumeroderegistro(NumRegistroEnfermeiro);
    	eDAO.save(e);
    	 openpage(Rotas.DASH);
    }

    @FXML
    void voltardash(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		tableNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		tableLogin.setCellValueFactory(new PropertyValueFactory<>("login"));
		tabkeRegis.setCellValueFactory(new PropertyValueFactory<>("numeroderegistro"));
		
		EnfermeiroDAO endao = new EnfermeiroDAO();
    	List<Enfermeiro> atendimentos = endao.select();
    	
    	System.out.println("Tamanho " + atendimentos.size());
    	ObservableList<Enfermeiro> obsen = FXCollections.observableArrayList(atendimentos);
    	    	
    	ListaEnfermeiro.setItems(obsen);
    	
		
		
	}

}
