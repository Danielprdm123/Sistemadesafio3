package br.com.hospitalif.controller;

import java.sql.SQLException;
import java.time.LocalDate;

import br.com.hospitalif.DAO.AtendimentoDAO;
import br.com.hospitalif.model.Atendimento;
import br.com.hospitalif.model.EnfermidadePessoal;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.util.Callback;

public class AtendimentoController {

    @FXML
    private DatePicker txtData;

    @FXML
    private TextField txtPeso;

    @FXML
    private ListView<EnfermidadePessoal> txtDoenca;

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
    void cadastrarAtendimento(ActionEvent event) throws SQLException {
    	LocalDate data = txtData.getValue();
    	float peso = Float.parseFloat(txtPeso.getText());
    	Callback<?, ?> doenca = txtDoenca.getCellFactory();
    	String ComentarioEnfermeiro = txtComentarioEnfermeiro.getText();
    	float altura =Float.parseFloat(txtAltura.getText()) ;
    	String ComentarioMedico = txtComentarioMedico.getText();
    	
    	Atendimento a = new Atendimento();
    	AtendimentoDAO aDAO = new AtendimentoDAO();
    	// a.setData(data);
    	a.setPeso(peso);
    	// a.setDoenca(doenca);
        a.setComentarioEnfermeiro(ComentarioEnfermeiro);
    	a.setAltura(altura);
    	a.setComentarioMedico(ComentarioMedico);
    	 aDAO.save(a);

    }

    @FXML
    void Voltardash(ActionEvent event) {

    }


}

