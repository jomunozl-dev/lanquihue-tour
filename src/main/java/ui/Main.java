package ui;

import data.GestorServicios;

/**
 * Clase principal del programa.
 * @author Jorge Munoz Leon
 */
public class Main {

    /**
     * Método principal del programa.
     *
     */
    public static void main(String[] args) {

        GestorServicios gestor = new GestorServicios();

        gestor.cargarServicios();

        gestor.mostrarServicios();

    }

}
