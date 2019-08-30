package app;

import br.com.hospitalif.util.Rotas;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

	@Override
	public void start(Stage Stage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(Rotas.LOGIN));
		Parent root = loader.load();
		Scene scene = new Scene(root,600,400);
		scene.getStylesheets().add(getClass().getResource("/css/app.css").toExternalForm());
		Stage.setScene(scene);
		Stage.show();
	}
	public static void main (String[] args) {
		launch(args);
	}

}
