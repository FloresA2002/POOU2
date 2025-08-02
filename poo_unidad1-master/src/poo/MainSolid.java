package poo;

import uni1a.*;
import repositorio.*;
import servicios.*;
import interfaces.ContenidoRepository;
import java.util.*;

public class MainSolid {
    public static void main(String[] args) {
        ContenidoService service = new ContenidoService();

        // Cargar películas desde CSV
        ContenidoRepository repoPeliculas = new ArchivoContenidoRepository("pelicula", "peliculas.csv");
        service.getContenidos().addAll(repoPeliculas.leer());

        // Mostrar contenido
        System.out.println("=== Contenidos cargados ===");
        service.mostrarTodo();
    }
}
