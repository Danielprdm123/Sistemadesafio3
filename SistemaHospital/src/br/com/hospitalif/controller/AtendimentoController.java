  package br.com.hospitalif.controller;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;

import app.Main;
import br.com.hospitalif.DAO.AtendimentoDAO;
import br.com.hospitalif.model.Atendimento;
import br.com.hospitalif.util.Rotas;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class AtendimentoController  extends Main implements Initializable {

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
    private TableView<Atendimento> listAtendimento;
    @FXML
    private TableColumn<Atendimento, String> tableCoEnf;

    @FXML
    private TableColumn<Atendimento, String> tableCoMedi;

    @FXML
    private TableColumn<Atendimento, String> tableDonca;
    @FXML
    private TableColumn<Atendimento, String> tablePeso;

    @FXML
    private TableColumn<Atendimento, String> tableAltura;

    @FXML
    private TableColumn<Atendimento, String> tableData;
    @FXML
    private Button remove;
    
    
    public AtendimentoController() {
		// TODO Auto-generated constructor stub
    	
		 
	}
    

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
    
   

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		tableCoEnf.setCellValueFactory(new PropertyValueFactory<>("comentarioEnfermeiro"));
		tableCoMedi.setCellValueFactory(new PropertyValueFactory<>("comentarioMedico"));
		tableDonca.setCellValueFactory(new PropertyValueFactory<>("doenca"));
		tablePeso.setCellValueFactory(new PropertyValueFactory<>("peso"));
		tableAltura.setCellValueFactory(new PropertyValueFactory<>("altura"));
		tableData.setCellValueFactory(new PropertyValueFactory<>("data"));
		
		AtendimentoDAO adao = new AtendimentoDAO();
    	List<Atendimento> atendimentos = adao.select();
    	
    	System.out.println("Tamanho " + atendimentos.size());
    	ObservableList<Atendimento> obsA = FXCollections.observableArrayList(atendimentos);
    	    	
    	listAtendimento.setItems(obsA);
    	
    	
		
		
	}
	@FXML
    void excluir(ActionEvent event) throws SQLException {
		
		Atendimento a= listAtendimento.getSelectionModel().getSelectedItem();
		System.out.println(a.getIdAtendimento());
		AtendimentoDAO adao = new AtendimentoDAO();
		adao.removeById(a.getIdAtendimento());
		
		
		
    }


}

