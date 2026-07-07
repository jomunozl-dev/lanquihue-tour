package model;

/**
 * Representa una excursión cultural.
 * @author Jorge Munoz Leon
 */

public class ExcursionCultural extends ServicioTuristico {

    private String lugarHistorico;

    public ExcursionCultural(String nombre, int duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }
    
     /**
     * Muestra la información de la excursión cultural.
     */
    @Override
    public void mostrarInformacion() {
        System.out.println(toString());
    }
    
    @Override
    public String toString() {
        return "Excursión Cultural: " + nombre +
               " | Duración: " + duracionHoras + " horas" +
               " | Lugar histórico: " + lugarHistorico;
    }
}