package repositorio;

import uni1a.*;
import interfaces.ContenidoRepository;
import java.io.*;
import java.util.*;

/**
 * Repositorio que lee/escribe contenidos desde archivos CSV.
 */
public class ArchivoContenidoRepository implements ContenidoRepository {
    private final String ruta;
    private final String tipo; // "pelicula", "serie", "documental"

    public ArchivoContenidoRepository(String tipo, String ruta) {
        this.tipo = tipo.toLowerCase();
        this.ruta = ruta;
    }

    @Override
    public List<ContenidoAudiovisual> leer() {
        List<ContenidoAudiovisual> contenidos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            br.readLine(); // saltar encabezado
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                switch (tipo) {
                    case "pelicula":
                        contenidos.add(new Pelicula(datos[0], Integer.parseInt(datos[1]), datos[2], datos[3], new ArrayList<>()));
                        break;
                    case "serie":
                        int numTemp = Integer.parseInt(datos[3]);
                        List<Temporada> temporadas = new ArrayList<>();
                        for (int i = 1; i <= numTemp; i++) temporadas.add(new Temporada(1+i, 0));
                        contenidos.add(new SerieDeTV(datos[0], Integer.parseInt(datos[1]), datos[2], temporadas));
                        break;
                    case "documental":
                        contenidos.add(new Documental(datos[0], Integer.parseInt(datos[1]), datos[2], datos[3], new ArrayList<>()));
                        break;
                }
            }
        } catch (IOException e) {
            System.err.println("Error leyendo archivo: " + e.getMessage());
        }
        return contenidos;
    }

    @Override
    public void guardar(List<ContenidoAudiovisual> contenidos) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(ruta))) {
            if ("pelicula".equals(tipo)) pw.println("titulo,duracion,genero,estudio");
            else if ("serie".equals(tipo)) pw.println("titulo,duracion,genero,temporadas");
            else if ("documental".equals(tipo)) pw.println("titulo,duracion,genero,tema");

            for (ContenidoAudiovisual c : contenidos) {
                if (c instanceof interfaces.GuardableCSV g) pw.println(g.toCSV());
            }
        } catch (IOException e) {
            System.err.println("Error guardando archivo: " + e.getMessage());
        }
    }
}
