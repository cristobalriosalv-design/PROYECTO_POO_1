package paquete_proyecto_poo_equipo_3.datos;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args) ;
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
