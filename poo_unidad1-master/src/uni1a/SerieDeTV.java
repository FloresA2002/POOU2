package uni1a;

import interfaces.GuardableCSV;
import java.util.List;

public class SerieDeTV extends ContenidoAudiovisual implements GuardableCSV {
    private List<Temporada> temporadas;

    public SerieDeTV(String titulo, int duracion, String genero, List<Temporada> temporadas) {
        super(titulo, duracion, genero);
        this.temporadas = temporadas;
    }

    @Override
    public String obtenerDetalles() {
        return "Serie [ID=" + getId() +
               ", Título=" + getTitulo() +
               ", Duración=" + getDuracionEnMinutos() + " min por episodio" +
               ", Género=" + getGenero() +
               ", Temporadas=" + (temporadas != null ? temporadas.size() : 0) + "]";
    }

    @Override
    public String toCSV() {
        return getTitulo() + "," + getDuracionEnMinutos() + "," + getGenero() + "," +
               (temporadas != null ? temporadas.size() : 0);
    }
}

