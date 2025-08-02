package uni1a;

import interfaces.GuardableCSV;

public class Cortometraje extends ContenidoAudiovisual implements GuardableCSV {
    private String director;

    public Cortometraje(String titulo, int duracion, String genero, String director) {
        super(titulo, duracion, genero);
        this.director = director;
    }

    public String getDirector() { return director; }

    @Override
    public String obtenerDetalles() {
        return "Cortometraje [ID=" + getId() +
               ", Título=" + getTitulo() +
               ", Duración=" + getDuracionEnMinutos() + " min" +
               ", Género=" + getGenero() +
               ", Director=" + director + "]";
    }

    @Override
    public String toCSV() {
        return getTitulo() + "," + getDuracionEnMinutos() + "," + getGenero() + "," + director;
    }
}
