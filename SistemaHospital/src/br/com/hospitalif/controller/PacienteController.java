package br.com.hospitalif.controller;



import java.io.IOException;
import java.sql.SQLException;

import app.Main;
import br.com.hospitalif.DAO.PacienteDAO;
import br.com.hospitalif.model.Paciente;
import br.com.hospitalif.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;



public class PacienteController extends Main {

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
    void Voltardash(ActionEvent event) throws IOException {
    	 openpage(Rotas.DASH);

    }

    @FXML
    void cadastrarPaciente(ActionEvent event) throws SQLException, IOException {
    	String nome = txtNome.getText();
    	String cpf = txtCpf.getText();
    	int idade = Integer.parseInt(txtIdade.getText());
    	String tipoSangue = textSangue.getText();
    	String sexo = cboSexo.getText();
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
    	p.setStatusPessoa(status);
    	p.setDoenca(doenca);
    	p.setHistorico(historico);
    	pDAO.save(p);
    	 openpage(Rotas.DASH);

    }
}