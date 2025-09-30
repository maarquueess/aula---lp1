package atividademauromartins;

public class Celular {
    private String marca;
    private String bateria; 
    private String cor;
    private boolean ligado;

    public Celular(String marca, String cor) {
        this.marca = marca;
        this.cor = cor;
        this.bateria = "100"; // Bateria inicializada como String
        this.ligado = false;
    }

    public void ligar() {
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
        }
    }

    public void carregar(int carga) {
        System.out.println("Carregando celular.");
    }

    @Override
    public String toString() {
        return "Celular -> marca = " + marca + ", cor = " + cor + ", bateria = " + bateria + "%, ligado = " + ligado;
    }

}
