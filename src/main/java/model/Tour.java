package model;

/**
 * Clase que representa un tour turístico.
 * Contiene nombre, destino y precio del tour.
 * 
 * @author Jorge Munoz Leon
 */
public class Tour {

    // Atributos de la clase
    private String nombre;
    private String destino;
    private int precio;

    /**
     * Constructor que inicializa los datos del tour.
     * 
     * @param nombre Nombre del tour
     * @param destino Lugar de destino del tour
     * @param precio Precio del tour
     */
    public Tour(String nombre, String destino, int precio) {
        this.nombre = nombre;
        this.destino = destino;
        this.precio = precio;
    }

    /**
     * Obtiene el nombre del tour.
     * 
     * @return nombre del tour
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el destino del tour.
     * 
     * @return destino del tour
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Obtiene el precio del tour.
     * 
     * @return precio del tour
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Modifica el nombre del tour.
     * 
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Modifica el destino del tour.
     * 
     * @param destino nuevo destino
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * Modifica el precio del tour.
     * 
     * @param precio nuevo precio
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Devuelve la información completa del tour.
     * 
     * @return información del tour en texto
     */
    @Override
    public String toString() {
        return "Tour: " + nombre +
                " | Destino: " + destino +
                " | Precio: $" + precio;
    }
}