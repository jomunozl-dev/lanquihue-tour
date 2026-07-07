package data;

import java.util.ArrayList;
import java.util.List;
import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

/**
 * Clase encargada de gestionar los servicios turísticos.
 * @author Jorge Munoz Leon
 */

public class GestorServicios {

    private List<ServicioTuristico> servicios;

    /**
     * Constructor de la clase GestorServicios.
     */
    public GestorServicios() {
        servicios = new ArrayList<>();
    }

    /**
     * Carga servicios turísticos de prueba en la colección.
     */
    public void cargarServicios() {

        servicios.add(new RutaGastronomica(
                "Sabores de Frutillar", 4, 5));

        servicios.add(new RutaGastronomica(
                "Ruta del Curanto", 3, 3));

        servicios.add(new PaseoLacustre(
                "Lago Llanquihue", 2, "Lancha"));

        servicios.add(new PaseoLacustre(
                "Lago Todos los Santos", 3, "Catamarán"));

        servicios.add(new ExcursionCultural(
                "Museo Colonial Alemán", 2, "Frutillar"));

        servicios.add(new ExcursionCultural(
                "Fuerte de Maullín", 4, "Maullín"));
    }

    /**
     * Recorre la colección y muestra la información de cada servicio.
     */
    public void mostrarServicios() {

        for (ServicioTuristico servicio : servicios) {
            servicio.mostrarInformacion();
        }
    }

}