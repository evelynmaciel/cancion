public class Cancion {

    private String titulo;
    private String autor;

    public void crearCancion() {
    }

    public void crearCancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
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

    @Override
    public String toString() {
        return "Cancion [titulo=" + titulo + ", autor=" + autor + "]";
    }
}