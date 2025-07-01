package uni1a;

import java.util.List;

public class SerieDeTV extends ContenidoAudiovisual {
    private List<Temporada> temporadas;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, List<Temporada> temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
    }

    public List<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(List<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la serie:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración por episodio: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas:");

        for (Temporada t : temporadas) {
            System.out.println("- Temporada " + t.getNumero() + ": " + t.getCantidadEpisodios() + " episodios");
        }

        System.out.println();
    }
}
