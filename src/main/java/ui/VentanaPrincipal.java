package ui;

import data.GestorEntidades;
import javax.swing.JOptionPane;
import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Registrable;
import model.Vehiculo;

/**
 * Clase encargada de la interfaz gráfica del sistema.
 * @author Jorge Munoz Leon
 */

public class VentanaPrincipal {

    private GestorEntidades gestor;

    /**
     * Constructor de la clase VentanaPrincipal.
     */
    public VentanaPrincipal() {

        gestor = new GestorEntidades();

    }

    /**
     * Inicia el menú principal del sistema.
     */
    public void iniciar() {

        int opcion;

        do {
            String menu = """
                    ===== LLANQUIHUE TOUR =====

                    1. Registrar guía turístico
                    2. Registrar vehículo
                    3. Registrar colaborador externo
                    4. Mostrar entidades
                    5. Salir

                    Seleccione una opción:
                    """;

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    registrarGuia();
                    break;
                case 2:
                    registrarVehiculo();
                    break;
                case 3:
                    registrarColaborador();
                    break;
                case 4:
                    mostrarEntidades();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"Programa finalizado.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción no válida.");
            }
        } while (opcion != 5);
    }

    /**
     * Registra un guía turístico.
     */
    private void registrarGuia() {
        String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del guía:");
        String especialidad = JOptionPane.showInputDialog(null,"Ingrese la especialidad:");
        GuiaTuristico guia = new GuiaTuristico(
                nombre,
                especialidad);
        gestor.agregarEntidad(guia);
        JOptionPane.showMessageDialog(null,"Guía registrado correctamente.");
    }

    /**
     * Registra un vehículo.
     */
    private void registrarVehiculo() {
        String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del vehículo:");
        String patente = JOptionPane.showInputDialog(null,"Ingrese la patente:");
        Vehiculo vehiculo = new Vehiculo(
                nombre,
                patente);
        gestor.agregarEntidad(vehiculo);
        JOptionPane.showMessageDialog(null,"Vehículo registrado correctamente.");
    }
    
    /**
     * Registra un colaborador externo.
     */
    private void registrarColaborador() {
        String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del colaborador:");
        String empresa = JOptionPane.showInputDialog(null,"Ingrese la empresa:");
        
        ColaboradorExterno colaborador = new ColaboradorExterno(nombre,empresa);
        gestor.agregarEntidad(colaborador);
        
        JOptionPane.showMessageDialog(null,"Colaborador registrado correctamente.");
    }

    /**
     * Muestra todas las entidades registradas.
     */
    private void mostrarEntidades() {
        if (gestor.obtenerEntidades().isEmpty()) {
            JOptionPane.showMessageDialog(null,"No existen entidades registradas.");
            return;
        }

        String resumen = "";

        for (Registrable entidad : gestor.obtenerEntidades()) {
            if (entidad instanceof GuiaTuristico) {
                resumen += "Tipo: Guía Turístico\n";
            } else if (entidad instanceof Vehiculo) {
                resumen += "Tipo: Vehículo\n";
            } else if (entidad instanceof ColaboradorExterno) {
                resumen += "Tipo: Colaborador Externo\n";
            }
            resumen += entidad.mostrarResumen();
            resumen += "\n";
            resumen += "-----------------------------";
            resumen += "\n";
        }

        JOptionPane.showMessageDialog(null,resumen);
    }
}