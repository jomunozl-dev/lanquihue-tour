package model;

/**
 * Clase base que representa un recurso de la agencia.
 * @Author Jorge Munoz Leon
 */

public class RecursoAgencia {

    protected String nombre;

    /**
     * Constructor de la clase RecursoAgencia.
     *
     * @param nombre Nombre del recurso.
     */
    public RecursoAgencia(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre.
     *
     * @return nombre del recurso.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre.
     *
     * @param nombre Nuevo nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}