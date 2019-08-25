package br.com.hospitalif.controller;

import com.gluonhq.charm.glisten.control.CharmListView;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Atendimento {

    @FXML
    private TextArea txtComentarioEnfermeiro;

    @FXML
    private TextArea txtComentarioMedico;

    @FXML
    private TextField txtPeso;

    @FXML
    private TextField txtAltura;

    @FXML
    private DatePicker dtData;

    @FXML
    private CharmListView<?, ?> txtDoenca;

    @FXML
    private Button btnVoltar;

    @FXML
    private Button btnEnviar;

    @FXML
    void EnviarAtendimento(ActionEvent event) {

    }

    @FXML
    void VoltarDash(ActionEvent event) {

    }

}
