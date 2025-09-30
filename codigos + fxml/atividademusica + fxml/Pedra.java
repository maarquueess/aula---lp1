package atividademusica;

public class Pedra {
    private String tamanho;
    private String peso;
    private String cor;

    public Pedra(String tamanho, String peso, String cor) {
        this.tamanho = tamanho;
        this.peso = peso;
        this.cor = cor;
    }

    public void rolar() {
        System.out.println("A pedra está rolando (tamanho = " + tamanho +
                ", peso = " + peso + ").");
    }

    public String getTamanho() { return tamanho; }
    public void setTamanho(String tamanho) { this.tamanho = tamanho; }

    public String getPeso() { return peso; }
    public void setPeso(String peso) { this.peso = peso; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public String toString() {
        return "Pedra -> tamanho = " + tamanho +
                ", peso = " + peso +
                ", cor = " + cor;
    }

}