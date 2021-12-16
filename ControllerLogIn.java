package application;

import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.scene.text.Text;

import java.io.IOException;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ControllerLogIn {
	
	@FXML private TextField text;
	@FXML private Text hint;
	private Stage stage;
	private Scene scene;
	private Parent root;
	private final String code = "0000";
	
	public void handleConfirm(ActionEvent event)  {
		
		
		if (code.equals(text.getText())) {
			
			try {
				root = FXMLLoader.load(getClass().getResource("RobotController.fxml"));
			} 
			catch (IOException e) {
				System.out.println("Failed to load the fxml file. :(");
				e.printStackTrace();
				System.exit(1);
			}
		
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		}
		
		
		else {
			JOptionPane.showMessageDialog(null, "Access Denied - Incorrect Password",
					"Alert",JOptionPane.WARNING_MESSAGE);
				
			text.clear();
			
		}
	
		
	}
	
	public void handleHint(ActionEvent event) {
		hint.setVisible(true);
	}

}
