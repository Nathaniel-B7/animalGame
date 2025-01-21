package animalGame;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Game extends Application {
	//Declaring Variables
	int day = 0;
	
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		showMenu(primaryStage);		
	}
	
	public void showMenu(Stage primaryStage) {
		primaryStage.setTitle("AnimalMenu: Main Menu");
		Label welcomeMessage = new Label("Welcome to the animal survival game! Choose one of the following animals to play as..."
				+ "\nYou will need to keep your hunger, thirst, and warmth levels high enough to survive!"
				+ "\nWho would you like to play as \n1. Lion \n2. Giraffe \n3. Fish");
		welcomeMessage.setStyle("-fx-background-color: white; -fx-font-size: 20px; -fx-font-weight: bold;");
		
		
		Button lionButton = new Button("Lion");
		Button giraffeButton = new Button("Giraffe");
		Button fishButton = new Button("Fish");
		VBox buttons = new VBox(15, welcomeMessage,lionButton, giraffeButton, fishButton);
		buttons.setAlignment(Pos.CENTER);

		Image mainMenuBackground = new Image("file:src/animalGame/MainMenuBackground.jpg");
		ImageView imageView = new ImageView(mainMenuBackground);
		StackPane MenuBackground = new StackPane();
		
		lionButton.setOnAction(e -> {
			
		});
		
		giraffeButton.setOnAction(e -> {
			
		});
		
		fishButton.setOnAction(e -> {
			
		});
		
		
//		Button giraffeButton = new Button("Lion");
//		VBox buttons = new VBox(lionButton);
//		Button fishButton = new Button("Lion");
//		VBox buttons = new VBox(lionButton);
		MenuBackground.getChildren().addAll(imageView, buttons);
		Scene menu = new Scene(MenuBackground, 300,400);
		primaryStage.setScene(menu);
		primaryStage.setMaximized(true);
		primaryStage.show();
	}
	
	
	
	
	public void nextDay() {
		day++;
		toString();
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
