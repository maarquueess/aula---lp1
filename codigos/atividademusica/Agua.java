package atividademusica;

public class Agua {
	private double temperatura; 
	private String estado; 
	private double volume; 
	
	public Agua(double temperatura, String estado, double volume) {
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
		volume = volume * 0.5;
	}

	public double getTemperatura() { return temperatura; }
    public void setTemperatura(double temperatura) { this.temperatura = temperatura; }

	public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

	public double getVolume() { return volume; }
    public void setVolume(double volume) { this.volume = volume; }
    
    public String toString() {
    	return "Agua -> temperatura = " + temperatura +
    			", estado = " + estado +
    			", volume = " + volume; 
    	
    }

}
