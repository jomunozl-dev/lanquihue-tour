package model;

/**
 * Interfaz que define un comportamiento común para las entidades
 * registrables de la agencia.
 * @author Jorge Munoz Leon
 */

public interface Registrable {

    /**
     * Devuelve un resumen de la entidad.
     *
     * @return Resumen de la entidad.
     */
    String mostrarResumen();

}