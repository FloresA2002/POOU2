package view;

import controller.ContenidoController;
import java.util.Scanner;

public class ConsolaView {
    private final ContenidoController controller;
    private final Scanner scanner;

    public ConsolaView(ContenidoController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Listar contenidos");
            System.out.println("2. Agregar película");
            System.out.println("3. Guardar cambios");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> controller.mostrarContenidos();
                case 2 -> agregarPelicula();
                case 3 -> controller.guardarCambios();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("❌ Opción no válida");
            }
        } while (opcion != 0);
    }

    private void agregarPelicula() {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Duración en minutos: ");
        int duracion = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Género: ");
        String genero = scanner.nextLine();
        System.out.print("Estudio: ");
        String estudio = scanner.nextLine();

        controller.agregarPelicula(titulo, duracion, genero, estudio);
        System.out.println("✅ Película agregada correctamente.");
    }
}
