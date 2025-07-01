package uni1a;

import java.util.List;

public class Documental extends ContenidoAudiovisual {
    private String tema;
    private List<Investigador> investigadores;

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema, List<Investigador> investigadores) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigadores = investigadores;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public List<Investigador> getInvestigadores() {
        return investigadores;
    }

    public void setInvestigadores(List<Investigador> investigadores) {
        this.investigadores = investigadores;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del documental:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + tema);

        if (investigadores != null && !investigadores.isEmpty()) {
            System.out.println("Investigadores:");
            for (Investigador inv : investigadores) {
                System.out.println("- " + inv.getNombre() + " (Especialidad: " + inv.getEspecialidad() + ")");
            }
        }

        System.out.println();
    }
}
