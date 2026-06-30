package ui;

import data.GestorServicios;

/**
 * Clase principal del programa.
 * @author Jorge Munoz Leon
 */

public class Main {

    public static void main(String[] args) {

        GestorServicios gestor = new GestorServicios();
        gestor.mostrarServicios();
    }
}

