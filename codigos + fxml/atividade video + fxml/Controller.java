package atividadevideo;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label; // Importar Label
import atividadevideo.Arco;
import atividadevideo.Flecha;
import atividadevideo.Relogio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
// Importações para threads e cores
import javafx.scene.paint.Color;
import javafx.animation.PauseTransition;
import javafx.util.Duration;

public class Controller {

    // Aba Arco
    @FXML private TextField txtArcoPeso;
    @FXML private TextField txtArcoMaterial;
    @FXML private TextField txtArcoTamanho;
    @FXML private Label lblStatusArco; // NOVO: Label de status para Arco

    // Aba Flecha
    @FXML private TextField txtFlechaComprimento;
    @FXML private TextField txtFlechaMaterial;
    @FXML private TextField txtFlechaCor;
    @FXML private Label lblStatusFlecha; // NOVO: Label de status para Flecha

    // Aba Relógio
    @FXML private TextField txtRelogioFonte;
    @FXML private TextField txtRelogioFormato;
    @FXML private TextField txtRelogioCor;
    @FXML private Label lblStatusRelogio; // NOVO: Label de status para Relógio

    // Método auxiliar para escrever a linha no arquivo CSV E mostrar o status
    private void escreverEmCSV(String nomeArquivo, String cabecalho, String linhaDados, Label statusLabel) {

        statusLabel.setText(""); // Limpa qualquer status anterior

        try (FileWriter fileWriter = new FileWriter(nomeArquivo, true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {

            // Verifica se o arquivo está vazio para adicionar o cabeçalho
            if (new java.io.File(nomeArquivo).length() == 0) {
                printWriter.println(cabecalho);
            }

            // Escreve a linha de dados
            printWriter.println(linhaDados);
            System.out.println("Salvo com sucesso em: " + nomeArquivo);

            // AVISO: Mostra a mensagem de sucesso no Label
            statusLabel.setTextFill(Color.web("#00cc00")); // Verde
            statusLabel.setText("Salvo em CSV!");

            // Opcional: Faz a mensagem desaparecer após 3 segundos
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

    /**
     * Lógica para o botão Salvar da Aba Arco.
     */
    @FXML
    private void handleSalvarArcoCSV() {
        String peso = txtArcoPeso.getText();
        String material = txtArcoMaterial.getText();
        String tamanho = txtArcoTamanho.getText();

        // Dados no formato CSV: "Peso,Material,Tamanho"
        String linhaCSV = String.join(",", peso, material, tamanho);
        String cabecalho = "Peso,Material,Tamanho";

        // Passa o Label correto para a função auxiliar
        escreverEmCSV("arco.csv", cabecalho, linhaCSV, lblStatusArco);
    }

    /**
     * Lógica para o botão Salvar da Aba Flecha.
     */
    @FXML
    private void handleSalvarFlechaCSV() {
        String comprimento = txtFlechaComprimento.getText();
        String material = txtFlechaMaterial.getText();
        String cor = txtFlechaCor.getText();

        // Dados no formato CSV: "Comprimento,Material,Cor"
        String linhaCSV = String.join(",", comprimento, material, cor);
        String cabecalho = "Comprimento,Material,Cor";

        // Passa o Label correto para a função auxiliar
        escreverEmCSV("flecha.csv", cabecalho, linhaCSV, lblStatusFlecha);
    }

    /**
     * Lógica para o botão Salvar da Aba Relógio.
     */
    @FXML
    private void handleSalvarRelogioCSV() {
        String fonte = txtRelogioFonte.getText();
        String formato = txtRelogioFormato.getText();
        String cor = txtRelogioCor.getText();

        // Dados no formato CSV: "Fonte,Formato,Cor"
        String linhaCSV = String.join(",", fonte, formato, cor);
        String cabecalho = "Fonte,Formato,Cor";

        // Passa o Label correto para a função auxiliar
        escreverEmCSV("relogio.csv", cabecalho, linhaCSV, lblStatusRelogio);
    }

    public void initialize() {
        // Garante que os Labels comecem vazios
        lblStatusArco.setText("");
        lblStatusFlecha.setText("");
        lblStatusRelogio.setText("");
    }
}