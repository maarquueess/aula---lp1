package atividadeobra;

public class Xicara {
    private String material;
    private String cor;
    private double capacidade; 
    private double conteudo;
    
    public Xicara(String material, String cor, double capacidade) {
        this.material = material;
        this.cor = cor;
        this.capacidade = capacidade;
        this.conteudo = 0;
    }

    public void encher(double volume) {
        if (conteudo + volume > capacidade) {
            conteudo = capacidade;
            System.out.println("Xícara cheia até a capacidade máxima (" + capacidade + "ml).");
        } else {
            conteudo += volume;
            System.out.println("Xícara preenchida: " + conteudo + "ml.");
        }
    }

    public String toString() {
        return "Xicara -> material = " + material + 
        		", cor = " + cor + 
        		", capacidade = " + capacidade +
                ", conteudo = " + conteudo;
    }
}
