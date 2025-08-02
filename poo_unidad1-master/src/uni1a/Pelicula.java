package uni1a;

import interfaces.GuardableCSV;
import java.util.List;

/**
 * Representa una película con actores.
 */
public class Pelicula extends ContenidoAudiovisual implements GuardableCSV {
    private String estudio;
    private List<Actor> actores;

    public Pelicula(String titulo, int duracionEnMinutos, String genero, 
                    String estudio, List<Actor> actores) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.actores = actores;
    }

    public String getEstudio() { return estudio; }
    public List<Actor> getActores() { return actores; }

    @Override
    public String obtenerDetalles() {
        StringBuilder sb = new StringBuilder();
        sb.append("Película [ID=").append(getId())
          .append(", Título=").append(getTitulo())
          .append(", Duración=").append(getDuracionEnMinutos())
          .append(" min, Género=").append(getGenero())
          .append(", Estudio=").append(estudio)
          .append("]\nActores:");
        if (actores != null && !actores.isEmpty()) {
            for (Actor a : actores) sb.append("\n - ").append(a.getNombre());
        } else sb.append(" Ninguno registrado.");
        return sb.toString();
    }

    @Override
    public String toCSV() {
        return String.format("%s,%d,%s,%s", getTitulo(), getDuracionEnMinutos(), getGenero(), estudio);
    }
}


