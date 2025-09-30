package atividadevideo;

public class Arco {
    private String peso; 
    private String material;
    private String tamanho; 
    private Flecha flechaCarregada;

    // Construtor atualizado
    public Arco(String peso, String material, String tamanho) {
        this.peso = peso;
        this.material = material;
        this.tamanho = tamanho;
    }


    public String getPeso() { return peso; } 
    public void setPeso(String peso) { this.peso = peso; } 

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    public String getTamanho() { return tamanho; } 
    public void setTamanho(String tamanho) { this.tamanho = tamanho; } 

    public Flecha getFlechaCarregada() { return flechaCarregada; }

    public void puxar() {
        System.out.println("Arco: corda puxada.");
    }

    public void ajustar(String novoTamanho) {
        setTamanho(novoTamanho);
        System.out.println("Arco ajustado para tamanho: " + novoTamanho);
    }

    public void carregar(Flecha flecha) {
        this.flechaCarregada = flecha;
        System.out.println("Arco: flecha carregada (" + flecha + ").");
    }

    public Flecha soltar(String alvo) {
        if (flechaCarregada == null) {
            System.out.println("Arco: nenhuma flecha carregada!");
            return null;
        }
        System.out.println("Arco: flecha solta!");
        flechaCarregada.mirar(alvo);
        flechaCarregada.voar();
        flechaCarregada.atingir(alvo);
        return flechaCarregada = null;
    }

    public String toString() {
        return "Arco ->" +
                "peso = " + peso +
                ", material = " + material +
                ", tamanho = " + tamanho;

    }

}
