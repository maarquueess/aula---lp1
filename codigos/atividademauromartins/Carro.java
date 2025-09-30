package atividademauromartins;

public class Carro {
    private String modelo;
    private double combustivel; 
    private double velocidade; 

    public Carro(String modelo, double combustivel) {
        this.modelo = modelo;
        this.combustivel = combustivel;
        this.velocidade = 0;
    }

    public void acelerar(double incremento) {
        if (combustivel <= 0) {
            System.out.println("Sem combustível! Não é possível acelerar.");
        } else {
            velocidade += incremento;
            combustivel -= incremento * 0.05;
            if (combustivel < 0) combustivel = 0;
            System.out.println("Acelerando! Velocidade atual: " + velocidade + " km/h");
        }
    }

    public void frear(double reducao) {
        velocidade -= reducao;
        if (velocidade < 0) velocidade = 0;
        System.out.println("Freando... Velocidade atual: " + velocidade + " km/h");
    }

    public void abastecer(double litros) {
        combustivel += litros;
        System.out.println("Abastecendo: agora o carro tem " + combustivel + "L de combustível.");
    }

    public String toString() {
        return "Carro -> modelo = " + modelo + ", combustivel = " + combustivel + ", velocidade = " + velocidade;
    }
}

