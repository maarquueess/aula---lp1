package atividademusica;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

public class Controller {

    @FXML private TextField txtAguaTemperatura;
    @FXML private TextField txtAguaEstado;
    @FXML private TextField txtAguaVolume;

    @FXML private TextField txtPedraTamanho;
    @FXML private TextField txtPedraPeso;
    @FXML private TextField txtPedraCor;

    @FXML private TextField txtVentoIntensidade;
    @FXML private TextField txtVentoTemperatura;
    @FXML private TextField txtVentoDirecao;

    @FXML private TextArea consoleOutput;


    // B. MÉTODO AUXILIAR PARA ESCREVER NO CSV
    private void escreverCSV(String filename, String header, String data) {
        File file = new File(filename);
        boolean fileExists = file.exists() && file.length() > 0;

        try (PrintWriter writer = new PrintWriter(new FileWriter(filename, true))) {

            if (!fileExists) {
                writer.println(header);
            }
            writer.println(data);

            consoleOutput.appendText("Sucesso: Dados de " + filename + " registrados.\n");

        } catch (IOException e) {
            consoleOutput.appendText("ERRO: Falha ao escrever no CSV " + filename + ": " + e.getMessage() + "\n");
        }
    }


    @FXML
    public void handleSalvarAguaCSV() {
        String temperatura = txtAguaTemperatura.getText();
        String estado = txtAguaEstado.getText();
        String volume = txtAguaVolume.getText();

        Agua novaAgua = new Agua(temperatura, estado, volume);

        String filename = "agua_registro.csv";
        String header = "Temperatura,Estado,Volume";
        String data = String.format("%s,%s,%s", novaAgua.getTemperatura(), novaAgua.getEstado(), novaAgua.getVolume());

        escreverCSV(filename, header, data);
    }

    @FXML
    public void handleSalvarPedraCSV() {
        String tamanho = txtPedraTamanho.getText();
        String peso = txtPedraPeso.getText();
        String cor = txtPedraCor.getText();

        Pedra novaPedra = new Pedra(tamanho, peso, cor);

        String filename = "pedra_registro.csv";
        String header = "Tamanho,Peso,Cor";
        String data = String.format("%s,%s,%s", novaPedra.getTamanho(), novaPedra.getPeso(), novaPedra.getCor());

        escreverCSV(filename, header, data);
    }

    @FXML
    public void handleSalvarVentoCSV() {
        String intensidade = txtVentoIntensidade.getText();
        String temperatura = txtVentoTemperatura.getText();
        String direcao = txtVentoDirecao.getText();

        Vento novoVento = new Vento(intensidade, temperatura, direcao);

        String filename = "vento_registro.csv";
        String header = "Intensidade,Temperatura,Direcao";
        String data = String.format("%s,%s,%s", novoVento.getIntensidade(), novoVento.getTemperatura(), novoVento.getDirecao());

        escreverCSV(filename, header, data);
    }
}