package atividadeobra;

public class Desenho {
    private String titulo;
    private String artista;
    private String cores;

    public Desenho(String titulo, String artista, String cores) {
        this.titulo = titulo;
        this.artista = artista;
        this.cores = cores;
    }

    public void expressar() {
        System.out.println("Expressando desenho " + titulo + 
        		" de " + artista +
                " com as cores: " + cores + ".");
    }

    
    public String toString() {
        return "Desenho -> titulo = " + titulo + 
        		", artista = " + artista + 
        		", cores = " + cores;
    }
}
