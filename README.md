========================================
Proyecto de Contenido Audiovisual
========================================

>> OBJETIVOS Y PROPÓSITO DEL PROYECTO

Este proyecto tiene como propósito aplicar los principios de la Programación Orientada a Objetos (POO) en Java para modelar un sistema de gestión de contenido audiovisual. El sistema permite crear, almacenar y visualizar diferentes tipos de contenido (películas, series, documentales, etc.), así como establecer relaciones entre estos y otras entidades como actores, temporadas e investigadores.

>> CLASES Y FUNCIONALIDADES NUEVAS AÑADIDAS

Clases creadas:
- Actor: Representa a un actor asociado a una película (Agregación).
- Temporada: Representa temporadas asociadas a una serie de TV (Composición).
- Investigador: Representa investigadores relacionados a un documental (Agregación).
- Cortometraje: Subclase de ContenidoAudiovisual que representa un cortometraje.
- VideoEducativo: Subclase de ContenidoAudiovisual para representar un video con contenido educativo.
- Experto: Representa al profesional asociado a un VideoEducativo.

Funcionalidades clave:
- Capacidad para añadir múltiples actores, temporadas e investigadores.
- Visualización detallada de cada contenido creado.
- Organización de datos en listas (ArrayList) para mayor flexibilidad.

>> INSTRUCCIONES PARA CLONAR Y EJECUTAR EL PROYECTO

1. Clonar el repositorio o copiar el código fuente a tu entorno local.
2. Asegúrate de tener configurado tu entorno de desarrollo Java (Eclipse, IntelliJ o consola con JDK 17+).
3. Estructura recomendada del proyecto:

   ├── src/
   │   ├── poo/
   │   │   └── PruebaAudioVisual.java
   │   ├── uni1a/
   │       ├── ContenidoAudiovisual.java
   │       ├── Pelicula.java
   │       ├── SerieDeTV.java
   │       ├── Documental.java
   │       ├── Cortometraje.java
   │       ├── VideoEducativo.java
   │       ├── Actor.java
   │       ├── Temporada.java
   │       ├── Investigador.java
   │       └── Experto.java

4. Ejecuta la clase `PruebaAudioVisual.java` desde tu entorno o terminal.

>> MEJORAS ADICIONALES IMPLEMENTADAS

- Validación básica de entrada en consola.
- Relaciones correctamente diferenciadas: agregación vs. composición.
- Separación clara de responsabilidades en cada clase.
- Uso de listas dinámicas para mayor escalabilidad del sistema.
- Estructura preparada para futuras extensiones como persistencia de datos en archivos o bases de datos.

>> POSIBLES EXTENSIONES FUTURAS

- Agregar guardado/carga desde archivos `.txt` o `.json`.
- Incorporar interfaz gráfica (JavaFX o Swing).
- Añadir pruebas unitarias con JUnit para asegurar el correcto funcionamiento del sistema.
- Implementar patrón de diseño (como MVC) para mayor escalabilidad.


