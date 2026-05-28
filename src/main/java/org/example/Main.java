package org.example;


public class Main {
    public static void main(String[] args) {
        // 1. Instancias de objetos
        // Deben de cambiar estos objetos, creen los propios suyos, estos estan de referencia.

        Categoria animecon = new Categoria("MangAnime", 50, 9.5 );
        Categoria NArt = new Categoria("Ilustraciónes", 30, 8.0);

        Cosplayer cosplayer1 = new Cosplayer("Juan pablo", "Argentina", 23, 5, EstiloCosplay.COMICS);
        Cosplayer cosplayer2 = new Cosplayer("Jonh wick", "Salvador", 25, 3, EstiloCosplay.ANIME);


        Artista artista1 = new Artista("Ana", "Estados Unidos", 19, "Wacom Intuos", 5);
        Artista artista2 = new Artista("Akari", "Japon", 21, "Huion", 5);

        Agrupacion comunidadAnime = new Agrupacion("Team anime", animecon);
        Panel panelPrincipal = new Panel(animecon, "14:45 hrs");

        // --- SECCIÓN DE PRUEBAS ---
        // Ej: agregar personas a categorías, meter miembros a la agrupación, montar el panel y llamar a mostrarInformacion().

        cosplayer1.mostrarInformacion();
        animecon.mostrarInformacion();
        comunidadAnime.mostrarInformacion();
        comunidadAnime.agregarMiembro(cosplayer1);
        comunidadAnime.agregarMiembro(cosplayer2);
        comunidadAnime.mostrarInformacion();
        comunidadAnime.eliminarMiembro(cosplayer2);
        comunidadAnime.mostrarInformacion();
        panelPrincipal.mostrarInformacion();
        panelPrincipal.agregarPanelista(artista1);
        panelPrincipal.mostrarInformacion();


    }
}