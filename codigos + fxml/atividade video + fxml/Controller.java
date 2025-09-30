package atividadevideo;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import atividadevideo.Arco;
import atividadevideo.Flecha;
import atividadevideo.Relogio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javafx.scene.paint.Color;
import javafx.animation.PauseTransition;
import javafx.util.Duration;

public class Controller {

    @FXML private TextField txtArcoPeso;
    @FXML private TextField txtArcoMaterial;
    @FXML private TextField txtArcoTamanho;
    @FXML private Label lblStatusArco; // NOVO: Label de status para Arco

    @FXML private TextField txtFlechaComprimento;
    @FXML private TextField txtFlechaMaterial;
    @FXML private TextField txtFlechaCor;
    @FXML private Label lblStatusFlecha; // NOVO: Label de status para Flecha

    @FXML private TextField txtRelogioFonte;
    @FXML private TextField txtRelogioFormato;
    @FXML private TextField txtRelogioCor;
    @FXML private Label lblStatusRelogio; // NOVO: Label de status para Relógio

    private void escreverEmCSV(String nomeArquivo, String cabecalho, String linhaDados, Label statusLabel) {

        statusLabel.setText(""); 

        try (FileWriter fileWriter = new FileWriter(nomeArquivo, true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {

            if (new java.io.File(nomeArquivo).length() == 0) {
                printWriter.println(cabecalho);
            }

            printWriter.println(linhaDados);
            System.out.println("Salvo com sucesso em: " + nomeArquivo);

            statusLabel.setTextFill(Color.web("#00cc00")); // Verde
            statusLabel.setText("Salvo em CSV!");

            PauseTransition visiblePause = new PauseTransition(Duration.seconds(3));
            visiblePause.setOnFinished(event -> statusLabel.setText(""));
            visiblePause.play();

        } catch (IOException e) {
            System.err.println("Erro ao salvar o arquivo CSV " + nomeArquivo + ": " + e.getMessage());

            // AVISO: Mostra a mensagem de erro no Label
            statusLabel.setTextFill(Color.RED); // Vermelho
            statusLabel.setText("Erro ao salvar!");
        }
    }

    @FXML
    private void handleSalvarArcoCSV() {
        String peso = txtArcoPeso.getText();
        String material = txtArcoMaterial.getText();
        String tamanho = txtArcoTamanho.getText();

        String linhaCSV = String.join(",", peso, material, tamanho);
        String cabecalho = "Peso,Material,Tamanho";

        escreverEmCSV("arco.csv", cabecalho, linhaCSV, lblStatusArco);
    }

    @FXML
    private void handleSalvarFlechaCSV() {
        String comprimento = txtFlechaComprimento.getText();
        String material = txtFlechaMaterial.getText();
        String cor = txtFlechaCor.getText();

        String linhaCSV = String.join(",", comprimento, material, cor);
        String cabecalho = "Comprimento,Material,Cor";

        escreverEmCSV("flecha.csv", cabecalho, linhaCSV, lblStatusFlecha);
    }

    @FXML
    private void handleSalvarRelogioCSV() {
        String fonte = txtRelogioFonte.getText();
        String formato = txtRelogioFormato.getText();
        String cor = txtRelogioCor.getText();

        String linhaCSV = String.join(",", fonte, formato, cor);
        String cabecalho = "Fonte,Formato,Cor";

        escreverEmCSV("relogio.csv", cabecalho, linhaCSV, lblStatusRelogio);
    }

    public void initialize() {
        lblStatusArco.setText("");
        lblStatusFlecha.setText("");
        lblStatusRelogio.setText("");
    }

}
