package atividademauromartins;

public class Xicara {
    private String temperatura;
    private String cor;
    private String capacidade;// Mantido como double para a lógica interna de beber/encher

    public Xicara(String temperatura, String cor, String capacidade) {
        this.temperatura = temperatura;
        this.cor = cor;
        this.capacidade = capacidade;
        try {
            this.volumeAtual = 0;
        } catch (NumberFormatException e) {
            this.volumeAtual = 0;
        }
    }

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

        double maxCapacidade = 0;
        try {
            maxCapacidade = Double.parseDouble(this.capacidade.replaceAll("[^0-9.]", "")); 
        } catch (Exception e) {
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
