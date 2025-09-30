package atividadeobra;

public class CafePronto {
    private double temperatura; 
    private double volume; 
    private String tipo;

    public CafePronto(double temperatura, double volume, String tipo) {
        this.temperatura = temperatura;
        this.volume = volume;
        this.tipo = tipo;
    }

    public void servir() {
        System.out.println("Servindo café: " + volume + "ml a " + temperatura + "°C, tipo: " + tipo + ".");
    }

    @Override
    public String toString() {
        return "CafePronto -> temperatura = " + temperatura + 
        		", volume = " + volume + 
        		", tipo = " + tipo;
    }
}
