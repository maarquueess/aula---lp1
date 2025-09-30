package atividadevideo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class MainFX extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        // Certifique-se de que atividadevideo.fxml está em um local acessível,
        // por exemplo, na mesma pasta/pacote desta classe ou na pasta 'resources'
        FXMLLoader loader = new FXMLLoader(getClass().getResource("atividadevideo.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);

        primaryStage.setTitle("Cadastro de Itens");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Inicia a aplicação JavaFX
        launch(args);
    }
}