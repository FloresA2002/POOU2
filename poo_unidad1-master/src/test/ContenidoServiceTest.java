package test;

import uni1a.Pelicula;
import org.junit.jupiter.api.Test;

import servicios.ContenidoService;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ContenidoServiceTest {

    @Test
    void testAgregarYMostrarContenidos() {
        ContenidoService service = new ContenidoService();
        Pelicula peli = new Pelicula("Matrix", 136, "Sci-Fi", "Warner Bros", List.of());

        service.agregarContenido(peli);
        assertEquals(1, service.getContenidos().size());
        assertTrue(service.getContenidos().contains(peli));
    }
}
