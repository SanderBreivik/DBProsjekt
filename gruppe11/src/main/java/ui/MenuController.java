package ui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MenuController {

	
	@FXML Button exercise;
	@FXML Button logs;
	@FXML Button add;
	@FXML Button number;
	
	
	public void toExercise() {
		try {
	        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ExerciseGroups.fxml"));
	        Parent root1 = (Parent) fxmlLoader.load();
	        Stage stage = new Stage();
	        stage.setScene(new Scene(root1));  
	        stage.show();
		}
	        
	    catch(Exception e) {
	       e.printStackTrace();
	    }
	}
	
	public void toResult() {
		try {
	        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Result.fxml"));
	        Parent root1 = (Parent) fxmlLoader.load();
	        Stage stage = new Stage();
	        stage.setScene(new Scene(root1));  
	        stage.show();          
	    }
	        
	    catch(Exception e) {
	       e.printStackTrace();
	    }
	}
	
	public void toAdd() {
		try {
	        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addExercise.fxml"));
	        Parent root1 = (Parent) fxmlLoader.load();
	        Stage stage = new Stage();
	        stage.setScene(new Scene(root1));  
	        stage.show();          
	    }
	        
	    catch(Exception e) {
	       e.printStackTrace();
	    }
	}
}

	