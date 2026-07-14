package data;

import java.util.ArrayList;
import model.Registrable;

/**
 * Clase encargada de gestionar las entidades registrables de la agencia.
 * @author Jorge Munoz Leon
 */
public class GestorEntidades {

    private ArrayList<Registrable> entidades;

    /**
     * Constructor de la clase GestorEntidades.
     */
    public GestorEntidades() {

        entidades = new ArrayList<>();

    }

    /**
     * Agrega una entidad a la colección.
     *
     * @param entidad Entidad que implementa la interfaz Registrable.
     */
    public void agregarEntidad(Registrable entidad) {

        entidades.add(entidad);

    }

    /**
     * Obtiene la colección de entidades.
     *
     * @return Lista de entidades registradas.
     */
    public ArrayList<Registrable> obtenerEntidades() {

        return entidades;

    }

}