package interfaces;

import uni1a.ContenidoAudiovisual;
import java.util.List;

/**
 * Interface para repositorios de contenidos audiovisuales.
 */
public interface ContenidoRepository {
    List<ContenidoAudiovisual> leer();
    void guardar(List<ContenidoAudiovisual> contenidos);
}
