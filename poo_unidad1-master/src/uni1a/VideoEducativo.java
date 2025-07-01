package uni1a;

public class VideoEducativo extends ContenidoAudiovisual {
    private String plataforma;
    private Experto autor;

    public VideoEducativo(String titulo, int duracionEnMinutos, String genero, String plataforma, Experto autor) {
        super(titulo, duracionEnMinutos, genero);
        this.plataforma = plataforma;
        this.autor = autor;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public Experto getAutor() {
        return autor;
    }

    public void setAutor(Experto autor) {
        this.autor = autor;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del video educativo:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Autor: " + autor.getNombre() + " (Área: " + autor.getArea() + ")");
        System.out.println();
    }
}
