package model;

/**
 * Representa un paseo lacustre.
 * @author Jorge Munoz Leon
 */

public class PaseoLacustre extends ServicioTuristico {

    private String tipoEmbarcacion;

    public PaseoLacustre(String nombre, int duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public String toString() {
        return "Paseo Lacustre: " + nombre +
               " | Duración: " + duracionHoras + " horas" +
               " | Embarcación: " + tipoEmbarcacion;
    }
}