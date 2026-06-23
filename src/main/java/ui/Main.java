package ui;

import data.GestorDatos;
import service.TourService;

/**
 * Clase principal del sistema.
 *
 *@author Jorge Munoz Leon
 */
public class Main {

    /**
     * Método principal.
     *
     * @param args argumentos
     */
    public static void main(String[] args) {

        // Crear gestor
        GestorDatos gestor = new GestorDatos();

        // Cargar archivo
        gestor.cargarDatos();

        // Crear servicio
        TourService servicio = new TourService();

        // Mostrar todos
        System.out.println("LISTA DE TOURS");
        servicio.mostrarTours(gestor.getListaTours());

        // Buscar por destino
        System.out.println("\nBUSQUEDA POR DESTINO: PuertoVaras");
        servicio.buscarPorDestino(gestor.getListaTours(),"PuertoVaras");

        // Filtrar por precio
        System.out.println("\nTOURS MAYORES A $10000");
        servicio.filtrarPrecio(gestor.getListaTours());
    }
}