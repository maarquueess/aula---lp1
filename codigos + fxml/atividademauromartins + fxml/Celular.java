package atividademauromartins;

public class Celular {
    private String marca;
    private String bateria; // Mudado para String
    private String cor;
    private boolean ligado;

    // Construtor atualizado para receber String para cor e bateria
    public Celular(String marca, String cor) {
        this.marca = marca;
        this.cor = cor;
        this.bateria = "100"; // Bateria inicializada como String
        this.ligado = false;
    }

    // Métodos de comportamento não foram atualizados e ainda usam lógica numérica
    public void ligar() {
        // Lógica de ligar com bateria foi simplificada para não falhar com a String
        if (ligado) {
            System.out.println("O celular já está ligado.");
        } else {
            ligado = true;
            System.out.println("Celular ligado.");
        }
    }

    public void atualizar() {
        if (!ligado) {
            System.out.println("O celular está desligado. Ligue primeiro!");
        } else {
            System.out.println("Atualizando o sistema...");
            // Manteria a lógica de bateria mais complexa para um projeto real
        }
    }

    public void carregar(int carga) {
        // Manteria a lógica de bateria mais complexa para um projeto real
        System.out.println("Carregando celular.");
    }

    @Override
    public String toString() {
        return "Celular -> marca = " + marca + ", cor = " + cor + ", bateria = " + bateria + "%, ligado = " + ligado;
    }
}