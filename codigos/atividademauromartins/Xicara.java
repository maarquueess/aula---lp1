package atividademauromartins;

public class Xicara {
	private double temperatura; 
	private String cor;
	private double capacidade; 
	private double volumeAtual; 
	
	public Xicara(double temperatura, String cor, double capacidade) {
		this.temperatura = temperatura; 
		this.cor = cor; 
		this.capacidade = capacidade; 
		
	}
	
	public void beber(double quantidade) {
		if (volumeAtual <= 0) {
			System.out.println("A xícara está vazia.");
		} else {
			volumeAtual -= quantidade;
			if (volumeAtual < 0) volumeAtual = 0; 
			System.out.println("Bebendo " + quantidade + "ml, restante: " + volumeAtual + "ml.");
		}
	}
	
	public void encher(double quantidade) {
        if (volumeAtual + quantidade > capacidade) {
            volumeAtual = capacidade;
            System.out.println("A xícara foi cheia até a capacidade máxima (" + capacidade + "ml).");
        } else {
            volumeAtual += quantidade;
            System.out.println("Enchendo xícara: agora tem " + volumeAtual + "ml.");
        }
    }
	
public void esvaziar() {
	volumeAtual = 0;
	System.out.println("A xícara foi esvaziada.");
}

public String toString() {
	return "Xícara -> temperatura = " + temperatura +
			", cor = " + cor +
			", capacidade = " + capacidade +
			", volume atual = " + volumeAtual;
	}
}
