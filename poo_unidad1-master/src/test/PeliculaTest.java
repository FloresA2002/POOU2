package test;

import org.junit.jupiter.api.Test;

import uni1a.Pelicula;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class PeliculaTest {

    @Test
    void testObtenerDetalles() {
        Pelicula peli = new Pelicula("Inception", 148, "Sci-Fi", "Warner Bros", List.of());
        String detalles = peli.obtenerDetalles();

        assertNotNull(detalles);
        assertTrue(detalles.contains("Inception"));
        assertTrue(detalles.contains("Sci-Fi"));
    }

    @Test
    void testToCSV() {
        Pelicula peli = new Pelicula("Inception", 148, "Sci-Fi", "Warner Bros", List.of());
        String csv = peli.toCSV();

        assertEquals("Inception,148,Sci-Fi,Warner Bros", csv);
    }
}
