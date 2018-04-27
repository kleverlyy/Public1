package net.ubilife.hellogit;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {

	public static void display() {
		Stage window = new Stage();
		window.getIcons().add(new Image("/Exclamation-mark-icon.jpg"));
		
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle("Error Window");
		//window.setMinWidth(250);
		
		Label label1 = new Label();
		label1.setText("This is an error.");
		Label label2 = new Label();
		label2.setText("Please close the window and try again in a few minutes.");
		Button closeButton = new Button ("Close");
		closeButton.setOnAction(e -> window.close());
		
		VBox layout = new VBox(10);
		layout.setStyle("-fx-background-color: #f5fffa");
		layout.setPadding(new Insets(30));
		Region emptyRegion1 = new Region();
		layout.getChildren().addAll(label1, label2, emptyRegion1, closeButton);
		layout.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout, 400, 150);
		window.setScene(scene);
		window.show();
	}	
}









