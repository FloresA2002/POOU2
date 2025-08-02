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
   
>> Estructura del Proyecto
   Proyecto/
├─ src/
│ ├─ uni1a/ # Modelo (Clases de dominio)
│ │ ├─ ContenidoAudiovisual.java
│ │ ├─ Pelicula.java
│ │ ├─ SerieDeTV.java
│ │ ├─ Documental.java
│ │ ├─ Cortometraje.java
│ │ ├─ VideoEducativo.java
│ │ ├─ Actor.java
│ │ ├─ Temporada.java
│ │ └─ Investigador.java
│ │
│ ├─ uni1a/servicio/ # Lógica de negocio
│ │ └─ ContenidoService.java
│ │
│ ├─ uni1a/repositorio/ # Persistencia
│ │ └─ ArchivoContenidoRepository.java
│ │
│ ├─ uni1a/controlador/ # Controlador MVC
│ │ └─ ContenidoController.java
│ │
│ └─ uni1a/vista/ # Vista en consola
│ └─ ConsolaView.java
│
├─ resources/ # Archivos CSV
│ ├─ peliculas.csv
│ ├─ series.csv
│ └─ documentales.csv
│
├─ test/ # Pruebas unitarias con JUnit 5
│ ├─ PeliculaTest.java
│ ├─ SerieDeTVTest.java
│ ├─ ContenidoServiceTest.java
│ └─ ArchivoContenidoRepositoryTest.java
│
└─ README.md # Este archivo

>> MEJORAS ADICIONALES IMPLEMENTADAS

- ✅ Se añadieron **nuevas clases**: `Actor`, `Temporada`, `Investigador`, `Cortometraje`, `VideoEducativo`.  
- ✅ Se implementó **composición**:  
  - `Pelicula` contiene `Actor`  
  - `SerieDeTV` contiene `Temporada`  
  - `Documental` contiene `Investigador`  
- ✅ Se implementó **MVC** con `ContenidoController` y `ConsolaView`.  
- ✅ Se agregó **persistencia con CSV** mediante `ArchivoContenidoRepository`.  
- ✅ Se aplicaron principios **SOLID y Código Limpio**.  
- ✅ Se añadieron **pruebas unitarias con JUnit 5** cubriendo modelo, servicio y repositorio.

>> Cómo Ejecutar las Pruebas Unitarias
Agregar JUnit 5 a tu proyecto

En Eclipse: Build Path → Add Libraries → JUnit 5

O si es Maven:

xml
Copiar
Editar
<dependency>
   <groupId>org.junit.jupiter</groupId>
   <artifactId>junit-jupiter</artifactId>
   <version>5.10.2</version>
   <scope>test</scope>
</dependency>
Ejecutar pruebas

En Eclipse: Right Click → Run As → JUnit Test

O con Maven:

bash
Copiar
Editar
mvn clean test
Medir cobertura

Eclipse: Run → Coverage As → JUnit Test

Maven: mvn jacoco:report genera reporte en target/site/jacoco/index.html

>> POSIBLES EXTENSIONES FUTURAS

Implementar GUI con JavaFX o Swing.

Añadir búsqueda y filtrado avanzado por género, duración o actores.

Integrar Base de Datos para reemplazar CSV.

Agregar pipeline de CI/CD con GitHub Actions y reportes de cobertura automáticos.

>> DIAGRAMA UML
![Image_Alt](https://github.com/FloresA2002/POOU2/blob/f14af99d3e734ee1dbc15ae233accc75840df955/image.png)
