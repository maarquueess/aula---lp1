package atividademusica;

public class Obstaculo {
    private String tipo;

    public Obstaculo(String tipo) {
        this.tipo = tipo;
    }

    public void receberImpacto(Pedra pedra) {
        System.out.println("Obstáculo do tipo " + tipo + " recebeu impacto de uma pedra -> " + pedra);
        double energia = pedra.getPeso() * pedra.getTamanho();
        System.out.println("Energia do impacto (simples calc): " + energia);
    }

    public String toString() {
        return "Obstaculo -> tipo = " + tipo;
    }
}
