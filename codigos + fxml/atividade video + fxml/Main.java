package atividadevideo;

public class Main {
    public static void main(String [] args) {

        Arco arco = new Arco("2.5 kg", "Compósito", "1.2 metros");

        Flecha flecha = new Flecha("0.75 m", "Carbono", "Vermelha");

        Relogio relogio = new Relogio("Bateria", "24h", "Preto");

        arco.puxar();
        arco.carregar(flecha);
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
