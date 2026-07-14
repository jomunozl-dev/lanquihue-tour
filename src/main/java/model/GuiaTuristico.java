package model;

/**
 * Representa un guía turístico.
 * @author Jorge Munoz Leon
 */

public class GuiaTuristico extends RecursoAgencia implements Registrable {

    private String especialidad;

    /**
     * Constructor de la clase GuiaTuristico.
     *
     * @param nombre Nombre del guía.
     * @param especialidad Especialidad del guía.
     */
    public GuiaTuristico(String nombre, String especialidad) {

        super(nombre);
        this.especialidad = especialidad;

    }

    @Override
    public String mostrarResumen() {

        return "Guía Turístico"
                + "\nNombre: " + nombre
                + "\nEspecialidad: " + especialidad;

    }

}