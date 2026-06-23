package service;

import model.Tour;
import java.util.ArrayList;

/**
 * Clase que contiene operaciones sobre tours.
 *
 * @author Jorge Munoz Leon
 */
public class TourService {

    /**
     * Muestra todos los tours.
     *
     * @param lista lista de tours
     */
    public void mostrarTours(ArrayList<Tour> lista) {
        for (Tour t : lista) {
            System.out.println(t);
        }
    }

    /**
     * Busca tours por destino.
     *
     * @param lista lista de tours
     * @param destino destino a buscar
     */
    public void buscarPorDestino(ArrayList<Tour> lista, String destino) {
        for (Tour t : lista) {
            if (t.getDestino().equalsIgnoreCase(destino)) {
                System.out.println(t);
            }
        }
    }

    /**
     * Filtra tours por precio.
     *
     * @param lista lista de tours
     */
    public void filtrarPrecio(ArrayList<Tour> lista) {
        for (Tour t : lista) {
            if (t.getPrecio() > 10000) {
                System.out.println(t);
            }
        }
    }
}