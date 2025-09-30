package atividademauromartins;

import java.io.FileWriter;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class Controller {

    // --- Campos da Xícara ---
    @FXML private TextField txtXicaraTemperatura;
    @FXML private TextField txtXicaraCor;
    @FXML private TextField txtXicaraCapacidade;

    // --- Campos do Celular ---
    @FXML private TextField txtCelularMarca;
    @FXML private TextField txtCelularBateria;
    @FXML private TextField txtCelularCor;

    // --- Campos do Carro ---
    @FXML private TextField txtCarroModelo;
    @FXML private TextField txtCarroCombustivel;
    @FXML private TextField txtCarroVelocidade;


    // --- 1. Ação para Salvar Xícara ---
    @FXML
    private void handleSalvarXicaraCSV() {
        String temperatura = txtXicaraTemperatura.getText();
        String cor = txtXicaraCor.getText();
        String capacidade = txtXicaraCapacidade.getText();

        if (temperatura.isEmpty() || cor.isEmpty() || capacidade.isEmpty()) {
            mostrarAlerta(Alert.AlertType.WARNING, "Atenção", "Preencha todos os campos da Xícara.");
            return;
        }

        // Cria o objeto Xicara com as Strings
        Xicara xicara = new Xicara(temperatura, cor, capacidade);

        // Salva no arquivo CSV
        String dadosCSV = temperatura + "," + cor + "," + capacidade + "\n";
        salvarDados(dadosCSV, "xicaras.csv", "Temperatura,Cor,Capacidade\n");

        limparXicara();
    }

    // --- 2. Ação para Salvar Celular ---
    @FXML
    private void handleSalvarCelularCSV() {
        String marca = txtCelularMarca.getText();
        String bateria = txtCelularBateria.getText();
        String cor = txtCelularCor.getText();

        if (marca.isEmpty() || bateria.isEmpty() || cor.isEmpty()) {
            mostrarAlerta(Alert.AlertType.WARNING, "Atenção", "Preencha todos os campos do Celular.");
            return;
        }

        // Cria o objeto Celular com as Strings (apenas Marca e Cor no construtor)
        Celular celular = new Celular(marca, cor);

        // Salva no arquivo CSV com todos os dados da UI
        String dadosCSV = marca + "," + bateria + "," + cor + "\n";
        salvarDados(dadosCSV, "celulares.csv", "Marca,Bateria,Cor\n");

        limparCelular();
    }

    // --- 3. Ação para Salvar Carro ---
    @FXML
    private void handleSalvarCarroCSV() {
        String modelo = txtCarroModelo.getText();
        String combustivel = txtCarroCombustivel.getText();
        String velocidade = txtCarroVelocidade.getText();

        if (modelo.isEmpty() || combustivel.isEmpty() || velocidade.isEmpty()) {
            mostrarAlerta(Alert.AlertType.WARNING, "Atenção", "Preencha todos os campos do Carro.");
            return;
        }

        // Cria o objeto Carro com as Strings (apenas Modelo e Combustível no construtor)
        Carro carro = new Carro(modelo, combustivel);

        // Salva no arquivo CSV com todos os dados da UI
        String dadosCSV = modelo + "," + combustivel + "," + velocidade + "\n";
        salvarDados(dadosCSV, "carros.csv", "Modelo,Combustivel,Velocidade\n");

        limparCarro();
    }

    // --- Lógica Comum de Salvamento e Limpeza ---

    private void salvarDados(String dados, String nomeArquivo, String cabecalho) {
        try (FileWriter writer = new FileWriter(nomeArquivo, true)) {
            // Verifica se o arquivo está vazio para escrever o cabeçalho
            java.io.File file = new java.io.File(nomeArquivo);
            if (file.length() == 0) {
                writer.write(cabecalho);
            }

            // Escreve os dados do novo objeto
            writer.write(dados);

            mostrarAlerta(Alert.AlertType.INFORMATION, "Sucesso", "Dados salvos com sucesso em " + nomeArquivo);

        } catch (IOException e) {
            System.err.println("Erro ao salvar dados: " + e.getMessage());
            mostrarAlerta(Alert.AlertType.ERROR, "Erro", "Não foi possível salvar os dados. Verifique as permissões.");
        }
    }

    private void mostrarAlerta(Alert.AlertType type, String title, String content) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    private void limparXicara() {
        txtXicaraTemperatura.clear();
        txtXicaraCor.clear();
        txtXicaraCapacidade.clear();
    }

    private void limparCelular() {
        txtCelularMarca.clear();
        txtCelularBateria.clear();
        txtCelularCor.clear();
    }

    private void limparCarro() {
        txtCarroModelo.clear();
        txtCarroCombustivel.clear();
        txtCarroVelocidade.clear();
    }
}