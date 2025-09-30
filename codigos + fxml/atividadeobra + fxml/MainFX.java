package atividadeobra;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFX extends Application { 

    @Override
    public void start(Stage primaryStage) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("atividadeobra.fxml"));

        Parent root = loader.load();

        primaryStage.setScene(new Scene(root, 700, 450));
        primaryStage.setTitle("Atividade Obra de Arte");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Calls the start() method
    }

}
