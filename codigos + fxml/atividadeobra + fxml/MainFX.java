package atividadeobra;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFX extends Application { // Must extend Application

    @Override
    public void start(Stage primaryStage) throws IOException {

        // Use the relative path since your MainFX class and FXML file are in the same package (atividadeobra)
        FXMLLoader loader = new FXMLLoader(getClass().getResource("atividadeobra.fxml"));

        Parent root = loader.load();

        primaryStage.setScene(new Scene(root, 700, 450));
        primaryStage.setTitle("Atividade Obra de Arte");
        primaryStage.show();
    }

    // REQUIRED: This is the standard Java entry point that initializes the JavaFX framework.
    public static void main(String[] args) {
        launch(args); // Calls the start() method
    }
}