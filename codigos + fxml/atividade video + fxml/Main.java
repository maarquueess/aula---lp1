package atividadevideo;

public class Main {
    public static void main(String [] args) {

        // Arco: Peso e Tamanho agora são Strings
        Arco arco = new Arco("2.5 kg", "Compósito", "1.2 metros");

        // Flecha: Comprimento agora é String
        Flecha flecha = new Flecha("0.75 m", "Carbono", "Vermelha");

        // Relogio: Permanece o mesmo (usa Strings)
        Relogio relogio = new Relogio("Bateria", "24h", "Preto");

        // --- Teste dos métodos ---

        arco.puxar();
        arco.carregar(flecha);

        // Ajustar agora recebe uma String
        arco.ajustar("1.1 m");

        arco.soltar(" torre do rei");

        relogio.contar();
        relogio.marcar("último segundo");
        relogio.despertar("00:59");

        System.out.println("\n--- Dados Finais ---");
        System.out.println(arco.toString());
        System.out.println(relogio.toString());

    }
}