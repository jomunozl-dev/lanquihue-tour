package data;

import model.Tour;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Clase encargada de leer el archivo de datos
 * y almacenar los tours en una colección.
 * 
 * @author Jorge Munoz Leon
 */
public class GestorDatos {

    // Lista donde se guardan los tours
    private ArrayList<Tour> listaTours = new ArrayList<>();

    /**
     * Lee el archivo tours.txt línea por línea,
     * separa los datos y crea objetos Tour.
     */
    public void cargarDatos() {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("resources/tours.txt"));

            String linea;

            // Recorre todas las líneas del archivo
            while ((linea = br.readLine()) != null) {

                // Divide la línea usando ;
                String[] datos = linea.split(";");

                // Crea un nuevo objeto Tour
                Tour tour = new Tour(
                        datos[0],
                        datos[1],
                        Integer.parseInt(datos[2])
                );

                // Guarda el tour en la lista
                listaTours.add(tour);
            }

            br.close();

        } catch (Exception e) {
            System.out.println("Error al leer archivo");
        }
    }

    /**
     * Retorna la lista de tours cargados.
     * 
     * @return lista de tours
     */
    public ArrayList<Tour> getListaTours() {
        return listaTours;
    }
}
