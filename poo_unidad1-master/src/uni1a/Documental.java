package uni1a;

import interfaces.GuardableCSV;
import java.util.List;

public class Documental extends ContenidoAudiovisual implements GuardableCSV {
    private String tema;
    private List<Investigador> investigadores;

    public Documental(String titulo, int duracion, String genero, String tema, List<Investigador> investigadores) {
        super(titulo, duracion, genero);
        this.tema = tema;
        this.investigadores = investigadores;
    }

    @Override
    public String obtenerDetalles() {
        StringBuilder sb = new StringBuilder();
        sb.append("Documental [ID=").append(getId())
          .append(", Título=").append(getTitulo())
          .append(", Duración=").append(getDuracionEnMinutos()).append(" min")
          .append(", Género=").append(getGenero())
          .append(", Tema=").append(tema).append("]");
        if (investigadores != null && !investigadores.isEmpty()) {
            sb.append("\nInvestigadores:");
            for (Investigador i : investigadores) {
                sb.append("\n - ").append(i.getNombre());
            }
        }
        return sb.toString();
    }

    @Override
    public String toCSV() {
        return getTitulo() + "," + getDuracionEnMinutos() + "," + getGenero() + "," + tema;
    }
}

