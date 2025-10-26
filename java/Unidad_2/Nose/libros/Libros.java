
public class Libros {
    private String titulo;
    private String autor;
    private int year;
    private String genero;
    private boolean disponible;

    public Libros(String titulo, String autor, int year, String genero, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.year = year;
        this.genero = genero;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}
