package poo;

import servicios.ContenidoService;
import controller.ContenidoController;
import view.ConsolaView;

public class MainMVC {
    public static void main(String[] args) {
        ContenidoService service = new ContenidoService();
        ContenidoController controller = new ContenidoController(service);

        // Cargar datos desde CSV
        controller.cargarDatos();

        // Iniciar vista de consola
        ConsolaView view = new ConsolaView(controller);
        view.mostrarMenu();
    }
}
