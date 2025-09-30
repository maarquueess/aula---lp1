package atividademauromartins;

public class Carro {
    private String modelo;
    private String combustivel; 
    private String velocidade; 

    public Carro(String modelo, String combustivel) {
        this.modelo = modelo;
        this.combustivel = combustivel;
        this.velocidade = "0"; 
    }

    public void acelerar(double incremento) {
        System.out.println("Acelerando! A velocidade é um texto na classe, não posso calcular.");
    }

    public void frear(double reducao) {
        System.out.println("Freando! A velocidade é um texto na classe, não posso calcular.");
    }

    public void abastecer(double litros) {
        System.out.println("Abastecendo! O combustível é um texto na classe, não posso calcular.");
    }

    public String toString() {
        return "Carro -> modelo = " + modelo + ", combustivel = " + combustivel + ", velocidade = " + velocidade;
    }

}

