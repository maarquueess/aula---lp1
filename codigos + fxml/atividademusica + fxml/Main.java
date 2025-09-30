package atividademusica;

public class Main {
    public static void main(String[] args) {

        Agua agua = new Agua("25 C", "liquido", "1.0 L");

        Pedra pedra = new Pedra("0.3 m", "2.5 kg", "cinza");

        Vento vento = new Vento("7.0 km/h", "22 C", "Norte");

        Obstaculo muro = new Obstaculo("muro");

        System.out.println("Estado inicial:");
        System.out.println(agua);
        System.out.println(pedra);
        System.out.println(vento);
        System.out.println(muro);
        System.out.println();

        vento.soprar();
        agua.evaporar();
        System.out.println("Depois da evaporação: " + agua);
        System.out.println();

        pedra.rolar();
        muro.receberImpacto(pedra);
    }
}