package test;


import uni1a.*;
import org.junit.jupiter.api.*;

import repositorio.ArchivoContenidoRepository;

import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArchivoContenidoRepositoryTest {

    private static final String TEST_FILE = "test_peliculas.csv";

    @BeforeEach
    void setUp() throws Exception {
        // Crear archivo de prueba
        File f = new File(TEST_FILE);
        if (f.exists()) f.delete();
        try (var pw = new java.io.PrintWriter(f)) {
            pw.println("titulo,duracion,genero,estudio");
            pw.println("Avatar,162,Sci-Fi,20th Century");
        }
    }

    @Test
    void testLeerArchivo() {
        ArchivoContenidoRepository repo = new ArchivoContenidoRepository("pelicula", TEST_FILE);
        List<ContenidoAudiovisual> contenidos = repo.leer();

        assertEquals(1, contenidos.size());
        assertTrue(contenidos.get(0) instanceof Pelicula);
        assertEquals("Avatar", contenidos.get(0).getTitulo());
    }

    @Test
    void testGuardarArchivo() {
        ArchivoContenidoRepository repo = new ArchivoContenidoRepository("pelicula", TEST_FILE);
        List<ContenidoAudiovisual> contenidos = repo.leer();

        repo.guardar(contenidos);
        File file = new File(TEST_FILE);
        assertTrue(file.exists());
        assertTrue(file.length() > 0);
    }
}

