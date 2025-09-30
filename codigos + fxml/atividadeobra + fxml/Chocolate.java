package atividadeobra;

public class Chocolate {
    private String tipo;
    private String textura;
    private String recheio;

    public Chocolate(String tipo, String textura, String recheio) {
        this.tipo = tipo;
        this.textura = textura;
        this.recheio = recheio;
    }

    public void derreter() {
        System.out.println("Derretendo chocolate " + tipo + 
        		" com textura " + textura +
                " e recheio de " + recheio + ".");
    }

    public String toString() {
        return "Chocolate -> tipo = " + tipo + 
        		", textura = " + textura + 
        		", recheio = " + recheio;
    }
}
