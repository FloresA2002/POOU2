package uni1a;

public class Cortometraje extends ContenidoAudiovisual {
    private String director;
    private boolean premiado;

    public Cortometraje(String titulo, int duracionEnMinutos, String genero, String director, boolean premiado) {
        super(titulo, duracionEnMinutos, genero);
        this.director = director;
        this.premiado = premiado;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public boolean isPremiado() {
        return premiado;
    }

    public void setPremiado(boolean premiado) {
        this.premiado = premiado;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del cortometraje:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Director: " + director);
        System.out.println("Premiado: " + (premiado ? "Sí" : "No"));
        System.out.println();
    }
}
