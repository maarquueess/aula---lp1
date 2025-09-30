package atividademauromartins;

public class Main {
    public static void main(String[] args) {
        Xicara cafe = new Xicara("80.0", "branca", "200");
        Carro carro = new Carro("Fusca", "10.0"); 
        Celular celular = new Celular("Iphone", "preto"); 

        System.out.println("Estado inicial:");
        System.out.println(cafe);
        System.out.println(carro);
        System.out.println(celular);
        System.out.println();

        cafe.encher(150.0);
        cafe.beber(50.0);
        cafe.esvaziar();
        System.out.println();

        carro.acelerar(30.0);
        carro.frear(10.0);
        carro.abastecer(5.0);
        System.out.println();

        celular.ligar();
        celular.atualizar();
        celular.carregar(20);
    }

}
