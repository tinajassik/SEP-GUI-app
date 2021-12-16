package application;

import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ControllerRobot {
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public static int section;
	public static int rack; 
	
	public void handleLogOut(ActionEvent event)  {
			
			try {
				root = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
	
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
		
		public void handleCreateTask(ActionEvent event) {
			
			JTextField sectionField = new JTextField(5);
			JTextField rackField = new JTextField(5);
	
			JPanel myPanel = new JPanel();
			myPanel.add(new JLabel("Section: "));
			myPanel.add(sectionField);
			
			myPanel.add(new JLabel("Rack: "));
			myPanel.add(rackField);
			
	
			int result = JOptionPane.showConfirmDialog(null, myPanel, 
					"Select desired location", JOptionPane.OK_CANCEL_OPTION);
	
			if (result == JOptionPane.OK_OPTION) {
		         section = Integer.parseInt(sectionField.getText());
		         rack  = Integer.parseInt(rackField.getText());
		      }
			
		}
		
		public void handleUnderDevelopment(ActionEvent event) {
			
			JOptionPane.showMessageDialog(null, "Application under development. Available soon.",
					"Info",JOptionPane.INFORMATION_MESSAGE);
				
		}
		
		public void handleSupport(ActionEvent event) {
			JOptionPane.showInputDialog(null, "Your message will be directly forwared to the IT department", 
					"Contact IT Support ", JOptionPane.QUESTION_MESSAGE);
		}
		

}
