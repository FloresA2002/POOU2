package uni1a;

import java.io.*;
import java.util.*;

/**
// * Clase encargada de leer y escribir datos de contenidos audiovisuales en archivos CSV.
// */
//public class ArchivoManager {
//
//    /**
//     * Método genérico para leer un CSV y devolver una lista de líneas divididas por comas.
//     */
//    private static List<String[]> leerArchivoCSV(String ruta) throws IOException {
//        List<String[]> datos = new ArrayList<>();
//        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
//            br.readLine(); // Saltar encabezado
//            String linea;
//            while ((linea = br.readLine()) != null) {
//                datos.add(linea.split(","));
//            }
//        }
//        return datos;
//    }
//
//    // ======================
//    // MÉTODOS DE LECTURA
//    // ======================
//
//    public static List<Pelicula> leerPeliculas(String rutaArchivo) {
//        List<Pelicula> peliculas = new ArrayList<>();
//        try {
//            for (String[] datos : leerArchivoCSV(rutaArchivo)) {
//                String titulo = datos[0];
//                int duracion = Integer.parseInt(datos[1]);
//                String genero = datos[2];
//                String estudio = datos[3];
//
//                // Inicializamos la lista de actores vacía por defecto
//                peliculas.add(new Pelicula(titulo, duracion, genero, estudio, new ArrayList<>()));
//            }
//        } catch (IOException e) {
//            System.err.println("Error al leer archivo de películas: " + e.getMessage());
//        }
//        return peliculas;
//    }
//
//    public static List<SerieDeTV> leerSeries(String rutaArchivo) {
//        List<SerieDeTV> series = new ArrayList<>();
//        try {
//            for (String[] datos : leerArchivoCSV(rutaArchivo)) {
//                String titulo = datos[0];
//                int duracion = Integer.parseInt(datos[1]);
//                String genero = datos[2];
//                // Por ahora el CSV indica número de temporadas, pero no episodios
//                int numeroTemporadas = Integer.parseInt(datos[3]);
//
//                // Generamos una lista vacía de Temporadas o ficticia
//                List<Temporada> temporadas = new ArrayList<>();
//                for (int i = 1; i <= numeroTemporadas; i++) {
//                    temporadas.add(new Temporada(0 + i, 0)); // episodios 0 por defecto
//                }
//
//                series.add(new SerieDeTV(titulo, duracion, genero, temporadas));
//            }
//        } catch (IOException e) {
//            System.err.println("Error al leer archivo de series: " + e.getMessage());
//        }
//        return series;
//    }
//
//    public static List<Documental> leerDocumentales(String rutaArchivo) {
//        List<Documental> documentales = new ArrayList<>();
//        try {
//            for (String[] datos : leerArchivoCSV(rutaArchivo)) {
//                String titulo = datos[0];
//                int duracion = Integer.parseInt(datos[1]);
//                String genero = datos[2];
//                String tema = datos[3];
//
//                // Inicializamos la lista de investigadores vacía por defecto
//                documentales.add(new Documental(titulo, duracion, genero, tema, new ArrayList<>()));
//            }
//        } catch (IOException e) {
//            System.err.println("Error al leer archivo de documentales: " + e.getMessage());
//        }
//        return documentales;
//    }
//
//    // ======================
//    // MÉTODOS DE ESCRITURA
//    // ======================
//
//    public static void guardarPeliculas(String rutaArchivo, List<Pelicula> peliculas) {
//        try (PrintWriter pw = new PrintWriter(new FileWriter(rutaArchivo))) {
//            pw.println("titulo,duracion,genero,estudio");
//            for (Pelicula p : peliculas) {
//                pw.printf("%s,%d,%s,%s\n", 
//                          p.getTitulo(), p.getDuracionEnMinutos(), 
//                          p.getGenero(), p.getEstudio());
//            }
//        } catch (IOException e) {
//            System.err.println("Error al guardar películas: " + e.getMessage());
//        }
//    }
//
//    public static void guardarSeries(String rutaArchivo, List<SerieDeTV> series) {
//        try (PrintWriter pw = new PrintWriter(new FileWriter(rutaArchivo))) {
//            pw.println("titulo,duracion,genero,temporadas");
//            for (SerieDeTV s : series) {
//                pw.printf("%s,%d,%s,%d\n", 
//                          s.getTitulo(), s.getDuracionEnMinutos(), 
//                          s.getGenero(), s.getTemporadas().size());
//            }
//        } catch (IOException e) {
//            System.err.println("Error al guardar series: " + e.getMessage());
//        }
//    }
//
//    public static void guardarDocumentales(String rutaArchivo, List<Documental> documentales) {
//        try (PrintWriter pw = new PrintWriter(new FileWriter(rutaArchivo))) {
//            pw.println("titulo,duracion,genero,tema");
//            for (Documental d : documentales) {
//                pw.printf("%s,%d,%s,%s\n", 
//                          d.getTitulo(), d.getDuracionEnMinutos(), 
//                          d.getGenero(), d.getTema());
//            }
//        } catch (IOException e) {
//            System.err.println("Error al guardar documentales: " + e.getMessage());
//        }
//    }
//}
