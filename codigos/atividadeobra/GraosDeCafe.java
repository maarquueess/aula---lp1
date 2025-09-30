package atividadeobra;

public class GraosDeCafe {
    private int quantidade;
    private String tipo;
    private String cor;

    public GraosDeCafe(int quantidade, String tipo, String cor) {
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.cor = cor;
    }

    public void moer() {
        if (quantidade <= 0) {
            System.out.println("Não há grãos suficientes para moer.");
        } else {
            System.out.println("Moendo " + quantidade + 
            		"g de grãos de café do tipo " + tipo + 
            		"+ cor");
            quantidade = 0; 
        }
    }

    public String toString() {
        return "GraosDeCafe -> quantidade = " + quantidade + 
        		", tipo = " + tipo + 
        		", cor = " + cor;
    }
}
