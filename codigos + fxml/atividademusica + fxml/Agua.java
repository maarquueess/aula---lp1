package atividademusica;

public class Agua {
    private String temperatura;
    private String estado;
    private String volume;

    public Agua(String temperatura, String estado, String volume) {
        this.temperatura = temperatura;
        this.estado = estado;
        this.volume = volume;
    }

    public void evaporar() {
        if (estado.equalsIgnoreCase("gasoso")) {
            System.out.println("A água está no estado gasoso.");
            return;
        }
        System.out.println("Evaporando a água.");
        estado = "gasoso";
    }

    public String getTemperatura() { return temperatura; }
    public void setTemperatura(String temperatura) { this.temperatura = temperatura; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getVolume() { return volume; }
    public void setVolume(String volume) { this.volume = volume; }

    public String toString() {
        return "Agua -> temperatura = " + temperatura +
                ", estado = " + estado +
                ", volume = " + volume;

    }
}