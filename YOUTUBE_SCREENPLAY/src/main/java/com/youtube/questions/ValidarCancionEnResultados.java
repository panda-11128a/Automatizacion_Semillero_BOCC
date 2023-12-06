package com.youtube.questions;

import com.youtube.UI.YouTubeVideoPage;
import com.youtube.interactions.SeleccionaCancionAleatoria;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarCancionEnResultados implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String tituloDuranteReproduccion = Text.of(YouTubeVideoPage.PRIMER_VIDEO_TITLE).answeredBy(actor).toLowerCase();
        String nombreCancionSeleccionada = SeleccionaCancionAleatoria.getNombreCancionSeleccionada().toLowerCase();

        // Imprime en consola el nombre de la canción durante la reproducción
        System.out.println("Nombre de la canción durante la reproducción: " + tituloDuranteReproduccion);

        // Imprime en consola el nombre de la canción seleccionada durante la interacción
        System.out.println("Nombre de la canción seleccionada durante la interacción: " + nombreCancionSeleccionada);


        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            // Maneja la excepción de interrupción
            e.printStackTrace();
        }
            boolean esValido = !tituloDuranteReproduccion.isEmpty() && tituloDuranteReproduccion.equals(nombreCancionSeleccionada);

            // Imprime en consola el resultado de la validación
            if (esValido) {
                System.out.println("Validación exitosa: El nombre al seleccionaar la canción es "+ nombreCancionSeleccionada +" y el nombre de la cancion al reproducirse es "+ tituloDuranteReproduccion + " son iguales");
            }
            return esValido;

    }

    public static ValidarCancionEnResultados conTituloIgual() {
        return new ValidarCancionEnResultados();
    }
}
