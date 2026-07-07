package model;

/**
 * Clase base que representa un servicio turístico.
 * @author Jorge Munoz Leon
 */

public class ServicioTuristico {

    protected String nombre;
    protected int duracionHoras;

    /**
     * Constructor de la clase ServicioTuristico.
     * @param nombre Nombre del servicio.
     * @param duracionHoras Duración en horas.
     */
    public ServicioTuristico(String nombre, int duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }
    
    /**
     * Muestra la información del servicio turístico.
     */
    public void mostrarInformacion() {
        System.out.println(toString());
    }
    
    @Override
    public String toString() {
        return "Servicio: " + nombre +
               " | Duración: " + duracionHoras + " horas";
    }
}