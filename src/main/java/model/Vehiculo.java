package model;

/**
 * Representa un vehículo de la agencia.
 * @author Jorge Munoz Leon
 */

public class Vehiculo extends RecursoAgencia implements Registrable {

    private String patente;

    /**
     * Constructor de la clase Vehiculo.
     *
     * @param nombre Nombre del vehículo.
     * @param patente Patente del vehículo.
     */
    public Vehiculo(String nombre, String patente) {

        super(nombre);
        this.patente = patente;

    }

    @Override
    public String mostrarResumen() {

        return "Vehículo"
                + "\nNombre: " + nombre
                + "\nPatente: " + patente;

    }

}