package org.example;

public class Cosplayer extends Persona implements Interactivable {
    private int cantidadTrajes;
    private EstiloCosplay estiloPreferido;

    public Cosplayer(String nombre, String paisOrigen, int edad, int cantidadTrajes, EstiloCosplay estiloPreferido) {
        super(nombre, paisOrigen, edad);
        this.cantidadTrajes = cantidadTrajes;
        this.estiloPreferido = estiloPreferido;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(" ");
        System.out.println("Informacion del Cosplayer: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Pais: " + paisOrigen);
        System.out.println("edad: " + edad);
        System.out.println("Cantidad de trajes: " + cantidadTrajes);
        System.out.println("Estilo Preferido: " + estiloPreferido);
        // TODO: Completar lógica método (imprimir datos base de Persona y específicos de Cosplayer)
    }

    @Override
    public void realizarPresentacion() {
        int tiempoest = cantidadTrajes * 10;
        System.out.println("Presentacion de  " + nombre );
        System.out.println("Con pais de origen de  "+ paisOrigen);
        System.out.println("con su estilo preferido "+ estiloPreferido);
        System.out.println("Duracion de la presentacion " + tiempoest + " minutos");
        // TODO: Completar lógica método (simular presentación e imprimir tiempo estimado de preparación)
    }

    // Getters y Setters
    public int getCantidadTrajes() { return cantidadTrajes; }
    public void setCantidadTrajes(int cantidadTrajes) { this.cantidadTrajes = cantidadTrajes; }
    public EstiloCosplay getEstiloPreferido() { return estiloPreferido; }
    public void setEstiloPreferido(EstiloCosplay estiloPreferido) { this.estiloPreferido = estiloPreferido; }
}
