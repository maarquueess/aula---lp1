package atividademauromartins;

public class Xicara {
    private String temperatura;
    private String cor;
    private String capacidade;
    private double volumeAtual; // Mantido como double para a lógica interna de beber/encher

    public Xicara(String temperatura, String cor, String capacidade) {
        this.temperatura = temperatura;
        this.cor = cor;
        this.capacidade = capacidade;
        // Assumimos que a capacidade é um número para a lógica abaixo.
        // Como o FXML permite letras, se for usar a lógica de beber/encher,
        // você precisará de uma versão limpa (numérica) da capacidade.
        try {
            this.volumeAtual = 0;
            // Para que o método encher() funcione com capacidade máxima,
            // vamos tentar extrair o número da capacidade, se possível.
            // Para simplificar, vou manter volumeAtual inicial em 0.
        } catch (NumberFormatException e) {
            this.volumeAtual = 0;
        }
    }

    // NOTA: Os métodos beber/encher/esvaziar foram mantidos, mas a lógica
    // interna deles (que usa 'double') pode precisar de ajustes se a
    // capacidade for fornecida com letras na UI.

    // Para simplificar, vou assumir que você não vai usar a lógica de
    // beber/encher/esvaziar a partir da UI.

    public void beber(double quantidade) {
        if (volumeAtual <= 0) {
            System.out.println("A xícara está vazia.");
        } else {
            volumeAtual -= quantidade;
            if (volumeAtual < 0) volumeAtual = 0;
            System.out.println("Bebendo " + quantidade + "ml, restante: " + volumeAtual + "ml.");
        }
    }

    public void encher(double quantidade) {
        // Precisa de um Double.parseDouble(capacidade) aqui para funcionar a regra,
        // mas isso pode falhar com strings como "200ml".
        // Para manter o foco na UI/CSV, vou simplificar a regra.

        double maxCapacidade = 0;
        try {
            maxCapacidade = Double.parseDouble(this.capacidade.replaceAll("[^0-9.]", "")); // Tenta limpar e pegar o número
        } catch (Exception e) {
            // Ignora se não for possível converter
        }

        if (volumeAtual + quantidade > maxCapacidade && maxCapacidade > 0) {
            volumeAtual = maxCapacidade;
            System.out.println("A xícara foi cheia até a capacidade máxima (" + maxCapacidade + "ml).");
        } else {
            volumeAtual += quantidade;
            System.out.println("Enchendo xícara: agora tem " + volumeAtual + "ml.");
        }
    }

    public void esvaziar() {
        volumeAtual = 0;
        System.out.println("A xícara foi esvaziada.");
    }

    public String toString() {
        return "Xícara -> temperatura = " + temperatura +
                ", cor = " + cor +
                ", capacidade = " + capacidade +
                ", volume atual = " + volumeAtual;
    }
}