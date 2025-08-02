package controller;

import uni1a.*;
import servicios.ContenidoService;
import repositorio.ArchivoContenidoRepository;
import interfaces.ContenidoRepository;

import java.util.List;

public class ContenidoController {
    private final ContenidoService service;
    private final ContenidoRepository repoPeliculas;
    private final ContenidoRepository repoSeries;
    private final ContenidoRepository repoDocumentales;

    public ContenidoController(ContenidoService service) {
        this.service = service;
        this.repoPeliculas = new ArchivoContenidoRepository("pelicula", "peliculas.csv");
        this.repoSeries = new ArchivoContenidoRepository("serie", "series.csv");
        this.repoDocumentales = new ArchivoContenidoRepository("documental", "documentales.csv");
    }

    public void cargarDatos() {
        service.getContenidos().addAll(repoPeliculas.leer());
        service.getContenidos().addAll(repoSeries.leer());
        service.getContenidos().addAll(repoDocumentales.leer());
    }

    public void mostrarContenidos() {
        service.mostrarTodo();
    }

    public void guardarCambios() {
        List<ContenidoAudiovisual> contenidos = service.getContenidos();
        // Filtrar por tipo y guardar en archivos separados
        repoPeliculas.guardar(contenidos.stream().filter(c -> c instanceof Pelicula).toList());
        repoSeries.guardar(contenidos.stream().filter(c -> c instanceof SerieDeTV).toList());
        repoDocumentales.guardar(contenidos.stream().filter(c -> c instanceof Documental).toList());
        System.out.println("✅ Archivos guardados correctamente.");
    }

    public void agregarPelicula(String titulo, int duracion, String genero, String estudio) {
        service.agregarContenido(new Pelicula(titulo, duracion, genero, estudio, List.of()));
    }
}

