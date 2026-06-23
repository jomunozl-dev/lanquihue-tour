package model;

/**
 * Clase que representa un tour turístico.
 * Guarda información básica de cada tour.
 *
 * @author Jorge Munoz Leon
 */
public class Tour {

    // Atributos privados
    private String nombre;
    private String destino;
    private String tipo;
    private int precio;

    /**
     * Constructor de la clase Tour.
     *
     * @param nombre nombre del tour
     * @param destino destino del tour
     * @param tipo tipo de tour
     * @param precio precio del tour
     */
    public Tour(String nombre, String destino, String tipo, int precio) {
        this.nombre = nombre;
        this.destino = destino;
        this.tipo = tipo;
        this.precio = precio;
    }

    /**
     * Obtiene el nombre.
     *
     * @return nombre del tour
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el destino.
     *
     * @return destino del tour
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Obtiene el tipo.
     *
     * @return tipo del tour
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Obtiene el precio.
     *
     * @return precio del tour
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Modifica el nombre.
     *
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Modifica el destino.
     *
     * @param destino nuevo destino
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * Modifica el tipo.
     *
     * @param tipo nuevo tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Modifica el precio.
     *
     * @param precio nuevo precio
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Muestra información completa del tour.
     *
     * @return información del tour
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre +
                " | Destino: " + destino +
                " | Tipo: " + tipo +
                " | Precio: $" + precio;
    }
}