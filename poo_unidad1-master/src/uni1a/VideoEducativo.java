package uni1a;

import interfaces.GuardableCSV;

public class VideoEducativo extends ContenidoAudiovisual implements GuardableCSV {
    private String materia;

    public VideoEducativo(String titulo, int duracion, String genero, String materia) {
        super(titulo, duracion, genero);
        this.materia = materia;
    }

    @Override
    public String obtenerDetalles() {
        return "Video Educativo [ID=" + getId() +
               ", Título=" + getTitulo() +
               ", Duración=" + getDuracionEnMinutos() + " min" +
               ", Género=" + getGenero() +
               ", Materia=" + materia + "]";
    }

    @Override
    public String toCSV() {
        return getTitulo() + "," + getDuracionEnMinutos() + "," + getGenero() + "," + materia;
    }
}

