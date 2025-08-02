package uni1a;

import interfaces.Detallable;

/**
 * Clase base abstracta para todo contenido audiovisual.
 */
public abstract class ContenidoAudiovisual implements Detallable {
    private static int contador = 0;
    private final int id;
    private String titulo;
    private int duracionEnMinutos;
    private String genero;

    public ContenidoAudiovisual(String titulo, int duracionEnMinutos, String genero) {
        this.id = ++contador;
        this.titulo = titulo;
        this.duracionEnMinutos = duracionEnMinutos;
        this.genero = genero;
    }

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public int getDuracionEnMinutos() { return duracionEnMinutos; }
    public void setDuracionEnMinutos(int duracionEnMinutos) { this.duracionEnMinutos = duracionEnMinutos; }
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public void mostrarDetalles() {
        System.out.println(obtenerDetalles());
    }
}



