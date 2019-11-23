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
import br.com.hospitalif.report.PrintReport;
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
import net.sf.jasperreports.engine.JRException;

public class AtendimentoController extends Main implements Initializable {

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
	@FXML
	private Button atualizar;
	@FXML
	private Button btnUpdate;
	@FXML
	private Button btnRel;

	@FXML
	void cadastrarAtendimento(ActionEvent event) {
		try {
			LocalDate data = txtData.getValue();
			float peso = Float.parseFloat(txtPeso.getText());
			String doenca = txtDoenca.getText();
			String ComentarioEnfermeiro = txtComentarioEnfermeiro.getText();
			float altura = Float.parseFloat(txtAltura.getText());
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
			try {
				openpage(Rotas.DASH);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NumberFormatException e) {
			System.out.println("Campo Peso e altura vazios");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
	void excluir(ActionEvent event) {
		try {
			Atendimento a = listAtendimento.getSelectionModel().getSelectedItem();
			System.out.println(a.getIdAtendimento());
			AtendimentoDAO adao = new AtendimentoDAO();
			adao.removeById(a.getIdAtendimento());
			openpage(Rotas.ATENDIMENTO);
		} catch (SQLException e) {

		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {

		}
	}

	@FXML
	void editar(ActionEvent event) {

		try {
			Atendimento a = listAtendimento.getSelectionModel().getSelectedItem();

			txtComentarioEnfermeiro.setText(a.getComentarioEnfermeiro());
			txtPeso.setText("" + a.getPeso());
			txtDoenca.setText(a.getDoenca());
			txtAltura.setText("" + a.getAltura());
			txtComentarioMedico.setText(a.getComentarioMedico());
			txtData.setValue(a.getData());

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@FXML
	void atualizarAtendimento(ActionEvent event) {
		try {
			// somente para pegar ID
			Atendimento getId = listAtendimento.getSelectionModel().getSelectedItem();
			LocalDate data = txtData.getValue();
			float peso = Float.parseFloat(txtPeso.getText());
			String doenca = txtDoenca.getText();
			String ComentarioEnfermeiro = txtComentarioEnfermeiro.getText();
			float altura = Float.parseFloat(txtAltura.getText());
			String ComentarioMedico = txtComentarioMedico.getText();
			Atendimento a = new Atendimento();
			AtendimentoDAO aDAO = new AtendimentoDAO();
			a.setIdAtendimento(getId.getIdAtendimento());
			a.setData(data);
			a.setPeso(peso);
			a.setDoenca(doenca);
			a.setComentarioEnfermeiro(ComentarioEnfermeiro);
			a.setAltura(altura);
			a.setComentarioMedico(ComentarioMedico);
			aDAO.update(a);
			openpage(Rotas.ATENDIMENTO);
		} catch (NumberFormatException e) {
			System.out.println("Campo Peso e altura vazios");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@FXML
    void relatorio(ActionEvent event) {
		String relatorio = "AtendimentoRel.jrxml";
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
