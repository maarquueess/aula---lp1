package atividademusica;

public class Vento {
    private String intensidade;
    private String temperatura;
    private String direcao;

    public Vento(String intensidade, String temperatura, String direcao) {
        this.intensidade = intensidade;
        this.temperatura = temperatura;
        this.direcao = direcao;
    }

    public void soprar () {
        System.out.println ("O vento sopra. -> Intensidade = " + intensidade +
                ", direção = " + direcao +
                ", temperatura = " + temperatura);
    }

    public String getIntensidade() { return intensidade; }
    public void setIntensidade(String intensidade) { this.intensidade = intensidade; }

    public String getTemperatura() { return temperatura; }
    public void setTemperatura(String temperatura) { this.temperatura = temperatura; }

    public String getDirecao() { return direcao; }
    public void setDirecao(String direcao) { this.direcao = direcao; }

    public String toString () {
        return "Vento -> intensidade = " + intensidade +
                ", temperatura = " + temperatura +
                ", direção = " + direcao;

    }


}