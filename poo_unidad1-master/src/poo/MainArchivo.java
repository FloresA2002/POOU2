//package poo;
//
//import uni1a.*;
//import java.util.*;
//
//public class MainArchivo {
//    public static void main(String[] args) {
//        System.out.println("=== PRUEBA LECTURA DE ARCHIVOS CSV ===\n");
//
//        // Rutas de los archivos CSV
//        String rutaPeliculas = "src/poo/peliculas.csv";
//        String rutaSeries = "src/poo/series.csv";
//        String rutaDocumentales = "src/poo/documentales.csv";
//
//        // Leer datos
//        List<Pelicula> peliculas = ArchivoManager.leerPeliculas(rutaPeliculas);
//        List<SerieDeTV> series = ArchivoManager.leerSeries(rutaSeries);
//        List<Documental> documentales = ArchivoManager.leerDocumentales(rutaDocumentales);
//
//        // Mostrar películas
//        System.out.println("Películas leídas:");
//        for (Pelicula p : peliculas) {
//            p.mostrarDetalles();
//            System.out.println("----------------------------------");
//        }
//
//        // Mostrar series
//        System.out.println("\nSeries de TV leídas:");
//        for (SerieDeTV s : series) {
//            s.mostrarDetalles();
//            System.out.println("----------------------------------");
//        }
//
//        // Mostrar documentales
//        System.out.println("\nDocumentales leídos:");
//        for (Documental d : documentales) {
//            d.mostrarDetalles();
//            System.out.println("----------------------------------");
//        }
//
//        // Guardar el estado actual en archivos nuevos
//        ArchivoManager.guardarPeliculas("peliculas_out.csv", peliculas);
//        ArchivoManager.guardarSeries("series_out.csv", series);
//        ArchivoManager.guardarDocumentales("documentales_out.csv", documentales);
//
//        System.out.println("\nArchivos guardados como *_out.csv correctamente.");
//    }
//}
