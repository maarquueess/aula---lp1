package atividadeobra;

public class Main {
    public static void main(String[] args) {
        GraosDeCafe graos = new GraosDeCafe(250, "Arábica", "marrom");
        CafePronto cafe = new CafePronto(75.0, 200, "Espresso");
        Xicara xicara = new Xicara("Cerâmica", "branca", 250);
        Chocolate chocolate = new Chocolate("Amargo", "cremosa", "avelã");
        BaseDaObra base = new BaseDaObra("Madeira", "preta", 40.0);
        Desenho desenho = new Desenho("Amanhecer", "John Doe", "vermelho, azul, amarelo");

        System.out.println("Estado inicial:");
        System.out.println(graos);
        System.out.println(cafe);
        System.out.println(xicara);
        System.out.println(chocolate);
        System.out.println(base);
        System.out.println(desenho);
        System.out.println();

        graos.moer();
        cafe.servir();
        xicara.encher(200);
        chocolate.derreter();
        base.apresentar();
        desenho.expressar();
    }
}
