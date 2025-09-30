package atividademauromartins;

public class Celular {
    private String marca;
    private int bateria; 
    private String cor;
    private boolean ligado;

    public Celular(String marca, String cor) {
        this.marca = marca;
        this.cor = cor;
        this.bateria = 100;
        this.ligado = false;
    }

    public void ligar() {
        if (bateria <= 0) {
            System.out.println("Bateria esgotada! Não é possível ligar.");
        } else if (ligado) {
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
            bateria -= 5;
            if (bateria < 0) bateria = 0;
        }
    }

    public void carregar(int carga) {
        bateria += carga;
        if (bateria > 100) bateria = 100;
        System.out.println("Carregando celular: bateria agora em " + bateria + "%");
    }

    @Override
    public String toString() {
        return "Celular -> marca = " + marca + ", cor = " + cor + ", bateria = " + bateria + "%, ligado = " + ligado;
    }
}
