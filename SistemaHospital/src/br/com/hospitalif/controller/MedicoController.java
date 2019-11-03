package br.com.hospitalif.controller;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

import app.Main;
import br.com.hospitalif.DAO.MedicoDAO;
import br.com.hospitalif.model.Medico;
import br.com.hospitalif.util.Rotas;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;

public class MedicoController extends Main implements Initializable {

	@FXML
	private TextField txtNumregistro;

	@FXML
	private TextField txtEspecialidade;

	@FXML
	private Button btnEnviar;

	@FXML
	private Button btnVolta;
	@FXML
	private TextField txtNome;

	@FXML
	private TextField txtCpf;

	@FXML
	private TextField txtIdade;

	@FXML
	private TextField textSangue;

	@FXML
	private RadioButton cboSexo;

	@FXML
	private ToggleGroup sexo;

	@FXML
	private TextArea txtStatus;

	@FXML
	private TextField txtLogin;

	@FXML
	private PasswordField txtSenha;

	@FXML
	private TextArea txtStatusf;

	@FXML
	private RadioButton cboSexo1;
	@FXML
	private TableView<Medico> ListaMedico;

	@FXML
	private TableColumn<Medico, String> TableNome;

	@FXML
	private TableColumn<Medico, String> tableIdade;

	@FXML
	private TableColumn<Medico, String> tableCpf;

	@FXML
	private TableColumn<Medico, String> tableSangue;

	@FXML
	private TableColumn<Medico, String> tableSexo;

	@FXML
	private TableColumn<Medico, String> tableStaP;

	@FXML
	private TableColumn<Medico, String> tableLogin;

	@FXML
	private TableColumn<Medico, String> tableStaF;

	@FXML
	private TableColumn<Medico, String> tableNumR;

	@FXML
	private TableColumn<Medico, String> tableEspecialidade;
	@FXML
	private Button remover;

	@FXML
	private Button atualizar;

	@FXML
	void Enviarmedico(ActionEvent event) throws SQLException, IOException {
		try {
			String nome = txtNome.getText();
			String cpf = txtCpf.getText();
			int idade = Integer.parseInt(txtIdade.getText());
			String tipoSangue = textSangue.getText();
			String sexo = cboSexo.getText();
			String sexo1 = cboSexo1.getText();
			String status = txtStatus.getText();
			String login = txtLogin.getText();
			String senha = txtSenha.getText();
			String statusF = txtStatusf.getText();
			int NumRegristroMedico = Integer.parseInt(txtNumregistro.getText());
			String especialidade = txtEspecialidade.getText();
			Medico m = new Medico();
			MedicoDAO mDAO = new MedicoDAO();
			m.setNome(nome);
			m.setCpf(cpf);
			m.setIdade(idade);
			m.setTipoSanguineo(tipoSangue);
			m.setSexo(sexo);
			m.setSexo(sexo1);
			m.setStatusPessoa(status);
			m.setLogin(login);
			m.setSenha(senha);
			m.setStatusDeUsuario(statusF);
			m.setEspecialidade(especialidade);
			m.setNumeroderegistro(NumRegristroMedico);
			mDAO.save(m);
			openpage(Rotas.DASH);
		} catch (NumberFormatException e) {
			System.out.println("Campo idade vazio e num registro");
		}

	}

	@FXML
	void Voltardash(ActionEvent event) throws IOException {
		openpage(Rotas.DASH);

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		TableNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		tableLogin.setCellValueFactory(new PropertyValueFactory<>("login"));
		tableNumR.setCellValueFactory(new PropertyValueFactory<>("numeroderegistro"));
		tableSexo.setCellValueFactory(new PropertyValueFactory<>("sexo"));
		tableCpf.setCellValueFactory(new PropertyValueFactory<>("cpf"));
		tableSangue.setCellValueFactory(new PropertyValueFactory<>("tipoSanguineo"));
		tableStaF.setCellValueFactory(new PropertyValueFactory<>("statusDeUsuario"));
		tableStaP.setCellValueFactory(new PropertyValueFactory<>("statusPessoa"));
		tableIdade.setCellValueFactory(new PropertyValueFactory<>("idade"));
		tableEspecialidade.setCellValueFactory(new PropertyValueFactory<>("especialidade"));
		MedicoDAO mdao = new MedicoDAO();
		List<Medico> medico = mdao.select();
		ObservableList<Medico> obsm = FXCollections.observableArrayList(medico);

		ListaMedico.setItems(obsm);

	}

	@FXML
	void editar(ActionEvent event) {

	}

	@FXML
	void excluir(ActionEvent event) {
		try {
			Medico m = ListaMedico.getSelectionModel().getSelectedItem();
			MedicoDAO mdao = new MedicoDAO();
			mdao.removeById(m.getIdFuncionario());
			openpage(Rotas.MEDICO);
		} catch (SQLException e) {

		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {

		}

	}

}
