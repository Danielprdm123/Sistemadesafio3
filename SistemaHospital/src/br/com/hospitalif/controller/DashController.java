package br.com.hospitalif.controller;

import java.io.IOException;

import app.Main;
import br.com.hospitalif.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;

public class DashController extends Main{

    @FXML
    private Hyperlink linkPaciente;
    

    @FXML
    private Hyperlink linkPessoa;

    @FXML
    private Hyperlink linkEntrada;

    @FXML
    private Hyperlink linkAtendente;

    @FXML
    private Hyperlink linkEnfermidadePessoal;

    @FXML
    private Hyperlink linkEnfermidade;

    @FXML
    private Hyperlink linkEnfermeiro;

    @FXML
    private Hyperlink linkAtendimento;

    @FXML
    private Hyperlink linkAdm;

    @FXML
    private Hyperlink linkFuncionario;

    @FXML
    private Hyperlink linkGerente;

    @FXML
    private Hyperlink linkMedico;

    @FXML
    void Enfermeiro(ActionEvent event) {

    }

    @FXML
    void Enfermidade(ActionEvent event) {

    }

    @FXML
    void EnfermidadePessoal(ActionEvent event) {

    }

    @FXML
    void Entrada(ActionEvent event) {

    }

    @FXML
    void Funcionario(ActionEvent event) {

    }

    @FXML
    void Gerente(ActionEvent event) {

    }

    @FXML
    void Atendente(ActionEvent event) {

    }

    @FXML
    void Medico(ActionEvent event) {

    }

    @FXML
    void Paciente(ActionEvent event) throws IOException {
    	openpage(Rotas.PACIENTE);

    }

    @FXML
    void Pessoa(ActionEvent event) {

    }

    @FXML
    void Administrador(ActionEvent event) {

    }

    @FXML
    void Atendimento(ActionEvent event) {

    }

}
