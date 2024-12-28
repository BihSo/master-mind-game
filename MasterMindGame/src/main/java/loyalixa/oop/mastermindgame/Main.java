package loyalixa.oop.mastermindgame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("master_mind.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 500);
        stage.setMinWidth(600);
        stage.setMinHeight(500);
        stage.setTitle("MasterMind Game by Loyalixa");
        stage.getIcons().add(new Image(getClass().getResource("logo.png").toExternalForm()));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}