package uni1a;

import java.util.List;

public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private List<Actor> actores; // Agregación: relación con Actor

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio, List<Actor> actores) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.actores = actores;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public List<Actor> getActores() {
        return actores;
    }

    public void setActores(List<Actor> actores) {
        this.actores = actores;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
        System.out.println("Actores:");
        for (Actor actor : actores) {
            System.out.println("- " + actor.getNombre() + " (" + actor.getEdad() + " años)");
        }
        System.out.println();
    }
}
