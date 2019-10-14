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
    void Enfermeiro(ActionEvent event) throws IOException {
    	openpage(Rotas.ENFERMEIRO);
    }

    @FXML
    void Enfermidade(ActionEvent event) throws IOException {
    	openpage(Rotas.ENFERMIDADE);
    }

    @FXML
    void EnfermidadePessoal(ActionEvent event) throws IOException {
    	openpage(Rotas.ENFERMIDADEPESSOAL);
    }

    @FXML
    void Entrada(ActionEvent event) throws IOException {
    	openpage(Rotas.ENTRADA);
    }

    @FXML
    void Funcionario(ActionEvent event) throws IOException {
    	openpage(Rotas.FUNCIONARIO);
    }

    @FXML
    void Gerente(ActionEvent event) throws IOException {
    	openpage(Rotas.GERENTE);
    }

    @FXML
    void Atendente(ActionEvent event) throws IOException {
    	openpage(Rotas.PACIENTE);
    }

    @FXML
    void Medico(ActionEvent event) throws IOException {
    	openpage(Rotas.MEDICO);
    }

    @FXML
    void Paciente(ActionEvent event) throws IOException {
    	openpage(Rotas.PACIENTE);

    }

    @FXML
    void Administrador(ActionEvent event) throws IOException {
    	openpage(Rotas.ADMINISTRADOR);

    }

    @FXML
    void Atendimento(ActionEvent event) throws IOException {
    	openpage(Rotas.ATENDIMENTO);

    }

}
