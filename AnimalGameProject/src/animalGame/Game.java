package animalGame;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Game extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		showMenu(primaryStage);		
	}
	public static void main(String[] args) {
		launch(args);
	}
	public void showMenu(Stage primaryStage) {
		Button lionButton = new Button("Lion");
		VBox buttons = new VBox(lionButton);

		Scene menu = new Scene(buttons, 300,400);
		primaryStage.setScene(menu);
		primaryStage.show();
	}
}
