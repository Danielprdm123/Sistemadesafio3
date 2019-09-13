package app;

import java.io.IOException;
import java.sql.PreparedStatement;

import br.com.hospitalif.conexao.Conexao;
import br.com.hospitalif.util.Rotas;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	
	static Stage stageAtual;
	static FXMLLoader loader;
	
	@Override
	public void start(Stage Stage) throws Exception {
		stageAtual = Stage;
		FXMLLoader loader = new FXMLLoader(getClass().getResource(Rotas.LOGIN));
		
		
	try {
		Parent root = loader.load();
		Scene scene = new Scene(root,600,400);
		scene.getStylesheets().add(getClass().getResource("/css/app.css").toExternalForm());
		Stage.setScene(scene);
		Stage.show();
		}catch(IOException a) {
			
		}
	}
	
	
	
	
	
	
	
	public void openpage(String rota) throws IOException {
		
		  loader = new FXMLLoader(getClass().getResource(rota));
			Scene scene = new Scene(loader.load());
			stageAtual.setScene(scene);
			stageAtual.show();
		
		
		
	}
	public static void main (String[] args) {
		Conexao conn = new  Conexao();
		conn.getConnection();
		
		String sql = "INSERT INTO Funcionario ("
																					+ "idFuncionario,"
																				    + "login,"
																				    + "senha,"
																				    + "statusFuncionario,"
																				    + "idPessoa)"
																				    + " VALUES ("
																				    + "?,?,?,?,?)";
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1,1);
		stmt.setString(2, "teste");
		stmt.setString(3, "senha123");
		stmt.setString(4, "testando123");
		stmt.setInt(5, 2);
		stmt.execute();
		
		//smt.setInt(1,Integer.parceInt("3"); 
		// string n = 5 
		//string beto = "" + n;
		// snt.setInt(4,txtLogin.getText())
		 launch(args);
	}

}
