package proyecto.poo.paquete.principal;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Master extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hola");

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Group root = new Group();
		Scene scene = new Scene(root) ;
		Stage stage = new Stage();

		stage.setScene(scene);
		stage.show();


	}



}
