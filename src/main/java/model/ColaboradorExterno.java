package model;

/**
 * Representa un colaborador externo.
 * @author Jorge Munoz Leon
 */

public class ColaboradorExterno extends RecursoAgencia implements Registrable {

    private String empresa;

    /**
     * Constructor de la clase ColaboradorExterno.
     *
     * @param nombre Nombre del colaborador.
     * @param empresa Empresa a la que pertenece.
     */
    public ColaboradorExterno(String nombre, String empresa) {

        super(nombre);
        this.empresa = empresa;

    }

    @Override
    public String mostrarResumen() {

        return "Colaborador Externo"
                + "\nNombre: " + nombre
                + "\nEmpresa: " + empresa;

    }

}