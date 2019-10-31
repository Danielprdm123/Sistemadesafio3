package br.com.hospitalif.controller;



import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

import app.Main;
import br.com.hospitalif.DAO.PacienteDAO;
import br.com.hospitalif.model.Paciente;
import br.com.hospitalif.util.Rotas;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;



public class PacienteController extends Main implements Initializable{

    @FXML
    private Button btnCadastrar;

    @FXML
    private TextArea txtHistorico;

    @FXML
    private TextArea txtDoenca;

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
    private ToggleGroup sexo;

    @FXML
    private TextArea txtStatus;
   
    @FXML
    private RadioButton cboSexo1;
    @FXML
    private TableView<Paciente> listaPaiente;

    @FXML
    private TableColumn<Paciente, String> tableNome;

    @FXML
    private TableColumn<Paciente, String> tableIdade;

    @FXML
    private TableColumn<Paciente, String> tableCpf;

    @FXML
    private TableColumn<Paciente, String> tableSangue;

    @FXML
    private TableColumn<Paciente, String> tableSexo;

    @FXML
    private TableColumn<Paciente, String> tableStaPessoa;

    @FXML
    private TableColumn<Paciente, String> tableDoenca;

    @FXML
    private TableColumn<Paciente, String> tableHistorico;
    
    @FXML
    void Voltardash(ActionEvent event) throws IOException {
    	 openpage(Rotas.DASH);

    }

    @FXML
    void cadastrarPaciente(ActionEvent event) throws SQLException, IOException {
    	try {
    	String nome = txtNome.getText();
    	String cpf = txtCpf.getText();
    	int idade = Integer.parseInt(txtIdade.getText());
    	String tipoSangue = textSangue.getText();
    	String sexo = cboSexo.getText();
    	String sexo1 = cboSexo1.getText();
    	String status = txtStatus.getText();
    	String historico = txtHistorico.getText();
    	String doenca = txtDoenca.getText();
    	
    	Paciente p = new Paciente ();
    	PacienteDAO pDAO = new PacienteDAO();
    	p.setNome(nome);
    	p.setCpf(cpf);
    	p.setIdade(idade);
    	p.setTipoSanguineo(tipoSangue);
    	p.setSexo(sexo);
    	p.setSexo(sexo1);
    	p.setStatusPessoa(status);
    	p.setDoenca(doenca);
    	p.setHistorico(historico);
    	pDAO.save(p);
    	 openpage(Rotas.DASH);
    	}catch (NumberFormatException e) {
		System.out.println("Campo idade vazio");
		}

    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		tableNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		tableIdade.setCellValueFactory(new PropertyValueFactory<>("idade"));
		tableDoenca.setCellValueFactory(new PropertyValueFactory<>("doenca"));
		tableSexo.setCellValueFactory(new PropertyValueFactory<>("sexo"));
		tableCpf.setCellValueFactory(new PropertyValueFactory<>("cpf"));
		tableSangue.setCellValueFactory(new PropertyValueFactory<>("tipoSanguineo"));
		tableStaPessoa.setCellValueFactory(new PropertyValueFactory<>("statusPessoa"));
		tableHistorico.setCellValueFactory(new PropertyValueFactory<>("historico"));
		
		PacienteDAO pdao = new PacienteDAO();
    	List<Paciente> paciente = pdao.select();
    	ObservableList<Paciente> obsp = FXCollections.observableArrayList(paciente);
    	    	
    	listaPaiente.setItems(obsp);
	}
}