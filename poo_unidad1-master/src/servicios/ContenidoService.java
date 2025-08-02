package servicios;

import uni1a.ContenidoAudiovisual;
import java.util.*;

public class ContenidoService {
    private final List<ContenidoAudiovisual> contenidos = new ArrayList<>();

    public void agregarContenido(ContenidoAudiovisual c) {
        contenidos.add(c);
    }

    public List<ContenidoAudiovisual> getContenidos() {
        return contenidos;
    }

    public void mostrarTodo() {
        contenidos.forEach(c -> {
            c.mostrarDetalles();
            System.out.println("----------------------------------");
        });
    }
}
