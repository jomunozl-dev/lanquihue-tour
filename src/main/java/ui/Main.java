package ui;

import data.GestorDatos;
import model.Tour;

/**
 * Clase principal del sistema LlanquihueTourApp.
 * Permite cargar, mostrar y filtrar tours.
 * 
 * @author Jorge Munoz Leon
 */
public class Main {

    /**
     * Método principal de ejecución.
     * 
     * @param args argumentos del programa
     */
    public static void main(String[] args) {

        // Crear objeto gestor
        GestorDatos gestor = new GestorDatos();

        // Cargar datos desde archivo
        gestor.cargarDatos();

        // Mostrar todos los tours cargados
        System.out.println("LISTA DE TOURS");
        for (Tour t : gestor.getListaTours()) {
            System.out.println(t);
        }

        // Mostrar tours con precio mayor a 10000
        System.out.println("\nTOURS CON PRECIO MAYOR A 10000");

        for (Tour t : gestor.getListaTours()) {
            if (t.getPrecio() > 10000) {
                System.out.println(t);
            }
        }
    }
}