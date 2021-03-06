package br.com.hospitalif.controller;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;

import app.Main;
import br.com.hospitalif.DAO.EntradaDAO;
import br.com.hospitalif.model.Entrada;
import br.com.hospitalif.report.PrintReport;
import br.com.hospitalif.util.Rotas;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import net.sf.jasperreports.engine.JRException;

public class EntradaController extends Main implements Initializable {

	@FXML
	private DatePicker dtDataEntrada;

	@FXML
	private DatePicker dtDataSaida;

	@FXML
	private TextArea txtSituacaoPaciente;

	@FXML
	private TextArea txtStatusEntrada;

	@FXML
	private Button btnEnviar;

	@FXML
	private Button btnVoltar;
	@FXML
	private TableView<Entrada> ListaEntrada;

	@FXML
	private TableColumn<Entrada, String> tableDtEntr;

	@FXML
	private TableColumn<Entrada, String> tableDtSai;

	@FXML
	private TableColumn<Entrada, String> tableStaEn;

	@FXML
	private TableColumn<Entrada, String> tableSitua;
	@FXML
	private Button Remover;
	@FXML
	private Button atualizar;
    @FXML
    private Button btnUpdate;
    @FXML
	private Button btnRel;

	@FXML
	void enviarEntrada(ActionEvent event)  {
	
		LocalDate dataEntrada = dtDataEntrada.getValue();
		LocalDate dataSaida = dtDataSaida.getValue();
		String SituacaoPaciente = txtSituacaoPaciente.getText();
		String statusEntrada = txtStatusEntrada.getText();
		EntradaDAO enDAO = new EntradaDAO();
		Entrada en = new Entrada();
		en.setDataEntrada(dataEntrada);
		en.setDataDeSaida(dataSaida);
		en.setSituacaoDePaciente(SituacaoPaciente);
		en.setStatusDeEntrada(statusEntrada);
		try {
			enDAO.save(en);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			openpage(Rotas.DASH);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@FXML
	void voltarDash(ActionEvent event) throws IOException {
		openpage(Rotas.DASH);

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		tableDtEntr.setCellValueFactory(new PropertyValueFactory<>("dataEntrada"));
		tableDtSai.setCellValueFactory(new PropertyValueFactory<>("dataDeSaida"));
		tableStaEn.setCellValueFactory(new PropertyValueFactory<>("statusDeEntrada"));
		tableSitua.setCellValueFactory(new PropertyValueFactory<>("situacaoDePaciente"));

		EntradaDAO endao = new EntradaDAO();
		List<Entrada> entrada = endao.select();
		ObservableList<Entrada> obsen = FXCollections.observableArrayList(entrada);

		ListaEntrada.setItems(obsen);
	}

	@FXML
	void excluir(ActionEvent event) {
		try {
			Entrada e = ListaEntrada.getSelectionModel().getSelectedItem();
			System.out.println(e.getIdEntrada());
			EntradaDAO edao = new EntradaDAO();
			edao.removeById(e.getIdEntrada());
			openpage(Rotas.ENTRADA);
		} catch (SQLException e) {

		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {

		}
	}
	@FXML
    void editar(ActionEvent event) {
		Entrada e = ListaEntrada.getSelectionModel().getSelectedItem();
		txtSituacaoPaciente.setText(e.getSituacaoDePaciente());
		txtStatusEntrada.setText(e.getStatusDeEntrada());
		dtDataEntrada.setValue(e.getDataEntrada());
		dtDataSaida.setValue(e.getDataDeSaida());

    }
	@FXML
    void atualizarEntrada(ActionEvent event) { 
		Entrada getId = ListaEntrada.getSelectionModel().getSelectedItem();
		LocalDate dataEntrada = dtDataEntrada.getValue();
		LocalDate dataSaida = dtDataSaida.getValue();
		String SituacaoPaciente = txtSituacaoPaciente.getText();
		String statusEntrada = txtStatusEntrada.getText();
		EntradaDAO enDAO = new EntradaDAO();
		Entrada en = new Entrada();
		en.setIdEntrada(getId.getIdEntrada());
		en.setDataEntrada(dataEntrada);
		en.setDataDeSaida(dataSaida);
		en.setSituacaoDePaciente(SituacaoPaciente);
		en.setStatusDeEntrada(statusEntrada);
		try {
			enDAO.update(en);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			openpage(Rotas.ENTRADA);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

    }
	@FXML
    void relatorio(ActionEvent event) {
		String relatorio = "EntradaRel.jrxml";
		try {
			new PrintReport().showReport(relatorio);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
