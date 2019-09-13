package app;

import java.io.IOException;

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
		System.out.println(conn.getStatus());
		// string insere = "insert into ...  values ?,?"
		//PreoaredStartement stm =?
		//smt.setInt(1,Integer.parceInt("3"); 
		// string n = 5 
		//string beto = "" + n;
		 launch(args);
	}

}
