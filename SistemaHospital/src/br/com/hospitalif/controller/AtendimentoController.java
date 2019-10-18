package br.com.hospitalif.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;

import app.Main;
import br.com.hospitalif.DAO.AtendimentoDAO;
import br.com.hospitalif.model.Atendimento;
import br.com.hospitalif.model.EnfermidadePessoal;
import br.com.hospitalif.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.util.Callback;

public class AtendimentoController  extends Main {

    @FXML
    private DatePicker txtData;

    @FXML
    private TextField txtPeso;

    @FXML
    private TextArea txtDoenca;

    @FXML
    private TextArea txtComentarioEnfermeiro;

    @FXML
    private Button btnVoltar;

    @FXML
    private Button btnCadastrar;

    @FXML
    private TextField txtAltura;

    @FXML
    private TextArea txtComentarioMedico;

  

    @FXML
    void cadastrarAtendimento(ActionEvent event) throws SQLException, IOException {
    	try {
    	LocalDate data = txtData.getValue();
    	float peso = Float.parseFloat(txtPeso.getText());
    	String doenca = txtDoenca.getText();
    	String ComentarioEnfermeiro = txtComentarioEnfermeiro.getText();
    	float altura =Float.parseFloat(txtAltura.getText()) ;
    	String ComentarioMedico = txtComentarioMedico.getText();
    	
    	Atendimento a = new Atendimento();
    	AtendimentoDAO aDAO = new AtendimentoDAO();
    	a.setData(data);
    	a.setPeso(peso);
    	 a.setDoenca(doenca);
        a.setComentarioEnfermeiro(ComentarioEnfermeiro);
    	a.setAltura(altura);
    	a.setComentarioMedico(ComentarioMedico);
    	 aDAO.save(a);
    	 openpage(Rotas.DASH);
    	}catch (NumberFormatException e) {
    		System.out.println("Campo Peso e altura vazios");
    		}

    }

    @FXML
    void Voltardash(ActionEvent event) throws IOException {
    	 openpage(Rotas.DASH);

    }


}

