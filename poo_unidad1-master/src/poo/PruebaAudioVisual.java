package poo;

import java.util.*;
import uni1a.*;

public class PruebaAudioVisual {
    public static void main(String[] args) {

        // ==== Película ====
        List<Actor> actoresAvatar = new ArrayList<>();
        actoresAvatar.add(new Actor("Sam Worthington", 47));
        actoresAvatar.add(new Actor("Zoe Saldaña", 45));
        List<Actor> actoresAvengers = new ArrayList<>();
        actoresAvengers.add(new Actor("Tom Holland", 47));
        actoresAvengers.add(new Actor("Chris Hemsworth", 45));
        

        Pelicula avatar = new Pelicula("Avatar", 162, "Ciencia Ficción", "20th Century Studios", actoresAvatar);
        Pelicula avengers = new Pelicula("Avengers", 200, "Heroes", "Marvel", actoresAvengers);
       

        // ==== Serie de TV ====
        List<Temporada> temporadasGOT = new ArrayList<>();
        temporadasGOT.add(new Temporada(1, 10));
        temporadasGOT.add(new Temporada(2, 10));
        temporadasGOT.add(new Temporada(3, 10));
        SerieDeTV got = new SerieDeTV("Game of Thrones", 60, "Fantasía", temporadasGOT);

        // ==== Documental ====
        List<Investigador> investigadoresCosmos = new ArrayList<>();
        investigadoresCosmos.add(new Investigador("Carl Sagan", "Astronomía"));
        investigadoresCosmos.add(new Investigador("Neil deGrasse Tyson", "Astrofísica"));
        Documental cosmos = new Documental("Cosmos", 45, "Ciencia", "El universo", investigadoresCosmos);

        // ==== Cortometraje ====
        //Cortometraje corto = new Cortometraje("La Jetée", 28, "Ciencia Ficción", "Chris Marker", true);
        //Cortometraje corto2 = new Cortometraje("Lava", 12, "Infantil", "Ana Luan", true);

        // ==== Video Educativo ====
        Experto experto = new Experto("Dra. Ana Pérez", "Biología Molecular");
        //VideoEducativo videoEdu = new VideoEducativo("ADN explicado", 12, "Educación", "YouTube", experto);

        // ==== Lista de contenidos ====
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[7];
        contenidos[0] = avatar;
        contenidos[1] = avengers;
        contenidos[2] = got;
        contenidos[3] = cosmos;
        //contenidos[4] = corto;
        //contenidos[5] = corto2;
        //contenidos[6] = videoEdu;

        // ==== Mostrar detalles ====
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}
