package test;

import org.junit.jupiter.api.Test;

import uni1a.SerieDeTV;
import uni1a.Temporada;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SerieDeTVTest {

    @Test
    void testObtenerDetalles() {
        List<Temporada> temporadas = List.of(new Temporada(1, 10));
        SerieDeTV serie = new SerieDeTV("Dark", 50, "Sci-Fi", temporadas);

        String detalles = serie.obtenerDetalles();
        assertNotNull(detalles);
        assertTrue(detalles.contains("Dark"));
        assertTrue(detalles.contains("1")); // número de temporadas
    }

    @Test
    void testToCSV() {
        SerieDeTV serie = new SerieDeTV("Dark", 50, "Sci-Fi", List.of(new Temporada(1, 10)));
        String csv = serie.toCSV();

        assertEquals("Dark,50,Sci-Fi,1", csv);
    }
}
