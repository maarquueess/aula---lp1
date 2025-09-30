package atividademusica;

public class Obstaculo {
    private String tipo;

    public Obstaculo(String tipo) {
        this.tipo = tipo;
    }

    public void receberImpacto(Pedra pedra) {
        System.out.println("Obstáculo do tipo " + tipo + " recebeu impacto de uma pedra -> " + pedra);

        System.out.println("Energia do impacto: Não calculada, pois o peso (" + pedra.getPeso() + ") e tamanho (" + pedra.getTamanho() + ") incluem unidades de medida (texto).");
    }

    public String toString() {
        return "Obstaculo -> tipo = " + tipo;
    }
}
