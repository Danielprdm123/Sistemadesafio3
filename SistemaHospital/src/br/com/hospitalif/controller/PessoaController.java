package br.com.hospitalif.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;

public class PessoaController {

    @FXML
    private Text lblPessoa;

    @FXML
    private Button btnCadastrar;

    @FXML
    private TextField textSangue;

    @FXML
    private TextField txtIdade;

    @FXML
    private TextField txtCpf;

    @FXML
    private TextField txtNome;

    @FXML
    private RadioButton cboSexo;

    @FXML
    private ToggleGroup sexo;

    @FXML
    private Button btnVoltar;

    @FXML
    private TextArea txtStatus;

    @FXML
    void VoltarDash(ActionEvent event) {

    }

    @FXML
    void cadastarPessoa(ActionEvent event) {
    	String nome = txtNome.getText();
    	String cpf = txtCpf.getText();
    	String idade = txtIdade.getText();
    	String tipoSangue = textSangue.getText();
    	String sexo = cboSexo.getText();
    	String status = txtStatus.getText();

    }

}



	


