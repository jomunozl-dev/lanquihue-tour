package model;

/**
 * Representa una ruta gastronómica.
 * @author Jorge Munoz Leon
 */

public class RutaGastronomica extends ServicioTuristico {

    private int numeroDeParadas;

    public RutaGastronomica(String nombre, int duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }
    
     /**
     * Muestra la información de la ruta gastronómica.
     */
    @Override
    public void mostrarInformacion() {
        System.out.println(toString());
    }
    
    @Override
    public String toString() {
        return "Ruta Gastronómica: " + nombre +
               " | Duración: " + duracionHoras + " horas" +
               " | Paradas: " + numeroDeParadas;
    }
}