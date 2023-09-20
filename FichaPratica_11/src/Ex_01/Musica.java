package Ex_01;

public class Musica {

    private String titulo, genero, artista;
    private int duracaoSeg;

    public Musica(String titulo, String genero, String artista, int duracaoSeg) {
        this.titulo = titulo;
        this.genero = genero;
        this.artista = artista;
        this.duracaoSeg = duracaoSeg;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracaoSeg() {
        return duracaoSeg;
    }
}
