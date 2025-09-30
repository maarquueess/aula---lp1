package atividadeobra;

public class BaseDaObra {
    private String material;
    private String cor;
    private double largura; 

    public BaseDaObra(String material, String cor, double largura) {
        this.material = material;
        this.cor = cor;
        this.largura = largura;
    }

    public void apresentar() {
        System.out.println("Apresentando base de obra feita de " + material +
                ", cor: " + cor + ", largura: " + largura + "cm.");
    }

    public String toString() {
        return "BaseDaObra -> material = " + material + 
        		", cor = " + cor + 
        		", largura = " + largura;
    }
}
