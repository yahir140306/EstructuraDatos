
public class Canciones {
    private String titulo;
    private String artista;
    private String autor;

    public Canciones(String titulo, String artista, String autor) {
        this.titulo = titulo;
        this.artista = artista;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public String getAutor() {
        return autor;
    }
}
