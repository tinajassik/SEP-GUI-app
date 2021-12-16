package application;

import java.io.IOException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	// this app is only in early development, but in the future it will be used to communicate
	//with the warehouse robots by sending them necessary information for execution
	

	public void start(Stage stage){

		stage.setTitle("Robot Controller");


		try {
			Parent root = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
			Scene scene= new Scene(root);
			stage.setScene(scene);
			stage.show();
		}
		catch (IOException e) {
			System.out.println("Failed to load the fxml file. :(");
			e.printStackTrace();
			System.exit(1);

		}

	}

	public static void main(String[] args){
		launch(args);
	}

}

