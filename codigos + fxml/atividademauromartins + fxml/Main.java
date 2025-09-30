package atividademauromartins;

public class Main {
    public static void main(String[] args) {
        // Os construtores agora recebem Strings
        Xicara cafe = new Xicara("80.0", "branca", "200");
        Carro carro = new Carro("Fusca", "10.0"); // Agora usa Strings
        Celular celular = new Celular("Iphone", "preto"); // Agora usa Strings

        System.out.println("Estado inicial:");
        System.out.println(cafe);
        System.out.println(carro);
        System.out.println(celular);
        System.out.println();

        // Note: Para que estes métodos funcionem, eles ainda precisam de valores double.
        // A lógica interna das classes Xicara/Carro precisaria ser robusta para lidar
        // com a conversão de String para double se você fosse chamar esses métodos
        // com entradas da UI.

        cafe.encher(150.0);
        cafe.beber(50.0);
        cafe.esvaziar();
        System.out.println();

        // Como alteramos os atributos de Carro para String,
        // estes métodos de comportamento não funcionarão mais corretamente:
        carro.acelerar(30.0);
        carro.frear(10.0);
        carro.abastecer(5.0);
        System.out.println();

        // O Celular também teve seus atributos alterados para String.
        celular.ligar();
        celular.atualizar();
        celular.carregar(20);
    }
}