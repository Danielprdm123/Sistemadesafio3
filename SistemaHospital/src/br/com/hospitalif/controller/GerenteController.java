package br.com.hospitalif.controller;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

import app.Main;
import br.com.hospitalif.DAO.GerenteDAO;
import br.com.hospitalif.model.Gerente;
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

public class GerenteController extends Main implements Initializable {

	@FXML
	private Button btnEnviar;

	@FXML
	private TextField txtCargo;

	@FXML
	private Button btnVoltar;
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
	private ToggleGroup Sexo;

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
	private TableView<Gerente> listaGerente;
	@FXML
	private TableColumn<Gerente, String> tableNome;

	@FXML
	private TableColumn<Gerente, String> tableIdade;

	@FXML
	private TableColumn<Gerente, String> tableCpf;

	@FXML
	private TableColumn<Gerente, String> tableSangue;

	@FXML
	private TableColumn<Gerente, String> tableSexo;

	@FXML
	private TableColumn<Gerente, String> tableLogin;

	@FXML
	private TableColumn<Gerente, String> tableStaF;

	@FXML
	private TableColumn<Gerente, String> tableStaP;

	@FXML
	private TableColumn<Gerente, String> tableCargo;
	@FXML
	private Button Remover;
	@FXML
	private Button atualizar;

	@FXML
	void Enviargerente(ActionEvent event) throws SQLException, IOException {
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
			String cargo = txtCargo.getText();

			Gerente g = new Gerente();
			GerenteDAO gDAO = new GerenteDAO();
			g.setNome(nome);
			g.setCpf(cpf);
			g.setIdade(idade);
			g.setTipoSanguineo(tipoSangue);
			g.setSexo(sexo);
			g.setSexo(sexo1);
			g.setStatusPessoa(status);
			g.setLogin(login);
			g.setSenha(senha);
			g.setStatusDeUsuario(statusF);
			g.setCargo(cargo);
			gDAO.save(g);
			openpage(Rotas.DASH);
		} catch (NumberFormatException e) {
			System.out.println("Campo idade vazio");
		}
	}

	@FXML
	void Voltardash(ActionEvent event) throws IOException {
		openpage(Rotas.DASH);

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		tableNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		tableLogin.setCellValueFactory(new PropertyValueFactory<>("login"));
		tableSexo.setCellValueFactory(new PropertyValueFactory<>("sexo"));
		tableCpf.setCellValueFactory(new PropertyValueFactory<>("cpf"));
		tableSangue.setCellValueFactory(new PropertyValueFactory<>("tipoSanguineo"));
		tableStaF.setCellValueFactory(new PropertyValueFactory<>("statusDeUsuario"));
		tableStaP.setCellValueFactory(new PropertyValueFactory<>("statusPessoa"));
		tableIdade.setCellValueFactory(new PropertyValueFactory<>("idade"));
		tableCargo.setCellValueFactory(new PropertyValueFactory<>("cargo"));
		GerenteDAO gdao = new GerenteDAO();
		List<Gerente> gerente = gdao.select();
		ObservableList<Gerente> obsg = FXCollections.observableArrayList(gerente);

		listaGerente.setItems(obsg);

	}

	@FXML
	void editar(ActionEvent event) {
		Gerente g = listaGerente.getSelectionModel().getSelectedItem();
		txtNome.setText(g.getNome());
		txtCpf.setText(g.getCpf());
		txtIdade.setText("" + g.getIdade());
		textSangue.setText(g.getTipoSanguineo());
		cboSexo.setText(g.getSexo());
		cboSexo1.setText(g.getSexo());
		txtStatus.setText(g.getStatusPessoa());
		txtLogin.setText(g.getLogin());
		txtSenha.setText(g.getSenha());
		txtStatusf.setText(g.getStatusDeUsuario());
		txtCargo.setText(g.getCargo());

	}

	@FXML
	void excluir(ActionEvent event) {
		try {
			Gerente g = listaGerente.getSelectionModel().getSelectedItem();
			GerenteDAO gdao = new GerenteDAO();
			gdao.removeById(g.getIdFuncionario());
			openpage(Rotas.GERENTE);
		} catch (SQLException e) {

		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {

		}

	}
}
