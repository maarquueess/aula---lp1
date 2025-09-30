package atividademusica;

public class Vento {
	private double intensidade; 
	private double temperatura; 
	private String direcao; 
	
	public Vento(double intensidade, double temperatura, String direcao) {
		this.intensidade = intensidade; 
		this.temperatura = temperatura; 
		this.direcao = direcao; 
	}
	
	public void soprar () {
		System.out.println ("O vento sopra. -> Intensidade = " + intensidade +
				", direção = " + direcao +
				", temperatura = " + temperatura);
	}

	public double getIntensidade() { return intensidade; }
    public void setIntensidade(double intensidade) { this.intensidade = intensidade; }
    
    public double getTemperatura() { return temperatura; }
    public void setTemperatura(double temperatura) { this.temperatura = temperatura; }
    
	public String getDirecao() { return direcao; }
	public void setDirecao(String direcao) { this.direcao = direcao; }
	
	public String toString () {
		return "Vento -> intensidade = " + intensidade +
				", temperatura = " + temperatura +
				", direção = " + direcao; 
		
	}
	

}
