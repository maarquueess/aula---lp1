package atividadeobra;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Controller { // Classe renomeada para Controller

    // --- Obra 1: John Lennon (Grãos de Café usa TextField) ---
    @FXML private TextField txtGraosQuantidade;
    @FXML private TextField txtGraosTipo;
    @FXML private TextField txtGraosCor;

    // --- Obra 1: John Lennon (Xícara e Café Pronto usam TextArea) ---
    @FXML private TextArea txtXicaraMaterial;
    @FXML private TextArea txtXicaraCor;
    @FXML private TextArea txtXicaraCapacidade;

    @FXML private TextArea txtCafeTemperatura;
    @FXML private TextArea txtCafeVolume;
    @FXML private TextArea txtCafeTipo;

    // --- Obra 2: Medusa de Chocolate (Chocolate, Desenho, BaseDaObra usam TextArea) ---
    @FXML private TextArea txtChocolateTipo;
    @FXML private TextArea txtChocolateTextura;
    @FXML private TextArea txtChocolateRecheio;

    @FXML private TextArea txtDesenhoTitulo;
    @FXML private TextArea txtDesenhoArtista;
    @FXML private TextArea txtDesenhoCores;

    @FXML private TextArea txtBaseMaterial;
    @FXML private TextArea txtBaseCor;
    @FXML private TextArea txtBaseLargura;

    // --- Método Genérico para Salvar em CSV ---
    private void salvarEmCSV(String nomeArquivo, String cabecalho, String dados) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nomeArquivo + ".csv", true))) {

            java.io.File file = new java.io.File(nomeArquivo + ".csv");
            if (file.length() == 0) {
                writer.println(cabecalho);
            }

            String dadosFormatados = dados.replace("\n", " ").replace("\r", "");
            writer.println(dadosFormatados);
            System.out.println("Dados salvos em " + nomeArquivo + ".csv");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Erro ao salvar o arquivo CSV: " + e.getMessage());
        }
    }

    // --- Métodos OnAction para os Botões Salvar ---

    @FXML
    public void handleSalvarGraosCSV() {
        String cabecalho = "Quantidade,Tipo,Cor";
        String dados = txtGraosQuantidade.getText() + "," + txtGraosTipo.getText() + "," + txtGraosCor.getText();
        salvarEmCSV("GraosDeCafe", cabecalho, dados);
    }

    @FXML
    public void handleSalvarXicaraCSV() {
        String cabecalho = "Material,Cor,Capacidade";
        String dados = txtXicaraMaterial.getText() + "," + txtXicaraCor.getText() + "," + txtXicaraCapacidade.getText();
        salvarEmCSV("Xicara", cabecalho, dados);
    }

    @FXML
    public void handleSalvarCafeCSV() {
        String cabecalho = "Temperatura,Volume,Tipo";
        String dados = txtCafeTemperatura.getText() + "," + txtCafeVolume.getText() + "," + txtCafeTipo.getText();
        salvarEmCSV("CafePronto", cabecalho, dados);
    }

    @FXML
    public void handleSalvarChocolateCSV() {
        String cabecalho = "Tipo,Textura,Recheio";
        String dados = txtChocolateTipo.getText() + "," + txtChocolateTextura.getText() + "," + txtChocolateRecheio.getText();
        salvarEmCSV("Chocolate", cabecalho, dados);
    }

    @FXML
    public void handleSalvarDesenhoCSV() {
        String cabecalho = "Titulo,Artista,Cores";
        String dados = txtDesenhoTitulo.getText() + "," + txtDesenhoArtista.getText() + "," + txtDesenhoCores.getText();
        salvarEmCSV("Desenho", cabecalho, dados);
    }

    @FXML
    public void handleSalvarBaseCSV() {
        String cabecalho = "Material,Cor,Largura";
        String dados = txtBaseMaterial.getText() + "," + txtBaseCor.getText() + "," + txtBaseLargura.getText();
        salvarEmCSV("BaseDaObra", cabecalho, dados);
    }
}