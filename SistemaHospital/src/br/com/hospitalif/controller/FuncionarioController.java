package br.com.hospitalif.controller;

import java.io.IOException;
import app.Main;
import br.com.hospitalif.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class FuncionarioController  extends Main{

	 @FXML
	    private Button btnGerente;

	    @FXML
	    private Button btnMedico;

	    @FXML
	    private Button btnEnfermeiro;

	    @FXML
	    void irEnfermeiro(ActionEvent event) throws IOException {
	    	openpage(Rotas.ENFERMEIRO);
	    }

	    @FXML
	    void irGerente(ActionEvent event) throws IOException {
	    	openpage(Rotas.GERENTE);

	    }

	    @FXML
	    void irMedico(ActionEvent event) throws IOException {
	    	openpage(Rotas.MEDICO);
	    }

}
