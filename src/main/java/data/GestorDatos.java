package data;

import model.Tour;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Clase encargada de cargar datos desde archivo.
 *
 * @author Jorge Munoz Leon
 */
public class GestorDatos {

    private ArrayList<Tour> listaTours = new ArrayList<>();

    /**
     * Carga los tours desde archivo.
     */
    public void cargarDatos() {

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("resources/tours.txt"));

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");

                try {
                    Tour tour = new Tour(
                            datos[0],
                            datos[1],
                            datos[2],
                            Integer.parseInt(datos[3])
                    );

                    listaTours.add(tour);

                } catch (NumberFormatException e) {
                    System.out.println("Error en precio: " + linea);
                }
            }

            br.close();

        } catch (Exception e) {
            System.out.println("Error al cargar archivo.");
        }
    }

    /**
     * Retorna la lista de tours.
     *
     * @return lista de tours
     */
    public ArrayList<Tour> getListaTours() {
        return listaTours;
    }
}