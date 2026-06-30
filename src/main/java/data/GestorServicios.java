package data;

import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;

/**
 * Clase encargada de crear servicios turísticos de prueba.
 * @author Jorge Munoz Leon
 */

public class GestorServicios {

    public void mostrarServicios() {

        // Rutas gastronómicas
        RutaGastronomica ruta1 = new RutaGastronomica(
                "Sabores de Frutillar", 4, 5);

        RutaGastronomica ruta2 = new RutaGastronomica(
                "Ruta del Curanto", 3, 3);

        // Paseos lacustres
        PaseoLacustre paseo1 = new PaseoLacustre(
                "Lago Llanquihue", 2, "Lancha");

        PaseoLacustre paseo2 = new PaseoLacustre(
                "Todos los Santos", 3, "Catamarán");

        // Excursiones culturales
        ExcursionCultural excursion1 = new ExcursionCultural(
                "Museo Colonial Alemán", 2, "Frutillar");

        ExcursionCultural excursion2 = new ExcursionCultural(
                "Fuerte de Maullín", 4, "Maullín");

        System.out.println(ruta1);
        System.out.println(ruta2);
        System.out.println(paseo1);
        System.out.println(paseo2);
        System.out.println(excursion1);
        System.out.println(excursion2);
    }
}