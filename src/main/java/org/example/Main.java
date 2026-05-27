package org.example;


public class Main {
    public static void main(String[] args) {
        // 1. Instancias de objetos
        // Deben de cambiar estos objetos, creen los propios suyos, estos estan de referencia.

        Categoria animeCat = new Categoria("MangAnime", 50, 9.5);
        Categoria arteCat = new Categoria("Ilustraciónes", 30, 8.0);

        Cosplayer cosplayer1 = new Cosplayer("Juan", "Argentina", 23, 5, EstiloCosplay.COMICS);
        Artista artista1 = new Artista("Ana", "Estados Unidos", 19, "Wacom Intuos", 5);

        Agrupacion comunidadAnime = new Agrupacion("Team anime", animeCat);
        Panel panelPrincipal = new Panel(animeCat, "14:45 hrs");

        // --- SECCIÓN DE PRUEBAS ---
        // Ej: agregar personas a categorías, meter miembros a la agrupación, montar el panel y llamar a mostrarInformacion().

        cosplayer1.mostrarInformacion();
        animeCat.mostrarInformacion();
        comunidadAnime.mostrarInformacion();


    }
}