package atividademusica;

public class Pedra {
	private double tamanho; 
	private double peso; 
	private String cor; 

	public Pedra(double tamanho, double peso, String cor) {
		this.tamanho = tamanho; 
		this.peso = peso; 
		this.cor = cor; 
	}
	
	public void rolar() {
		System.out.println("A pedra está rolando (tamanho = " + tamanho + 
				"m, peso = " + peso + "kg."); 
	}

	public double getTamanho() { return tamanho; } 
	public void setTamanho(double tamanho) { this.tamanho = tamanho; }

	public double getPeso() { return peso; }
	public void setPeso(double peso) { this.peso = peso; }

	public String getCor() { return cor; }
	public void setCor(String cor) { this.cor = cor; }
	
	public String toString() {
		return "Pedra -> tamanho = " + tamanho +
				", peso = " + peso +
				", cor = " + cor;
	}
	
}
	
