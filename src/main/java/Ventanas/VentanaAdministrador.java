package Ventanas;

import Tienda.Tienda;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaAdministrador extends Ventana{
    private JButton botonMostrarInventario;
    private JButton botonBuscarProducto;
    private JButton botonAgregarProducto;
    private JButton botonVolver;
    private Tienda tienda;

    public VentanaAdministrador(Tienda tienda) {
        super("Administrador",500,500);
        this.tienda = tienda;
        generarElementosVentana();
    }

    private void generarElementosVentana() {
        generarBotonMostrarInventario();
        generarBotonBuscarProducto();
        generarBotonAgregarProducto();
        generarBotonVolver();
    }
    private void generarBotonMostrarInventario() {
        String textoBoton = "Mostrar Inventario";
        this.botonMostrarInventario = super.generarBoton(textoBoton, 175, 100, 150, 40);
        this.add(this.botonMostrarInventario);
        this.botonMostrarInventario.addActionListener(this);
    }
    private void generarBotonBuscarProducto() {
        String textoBoton = "Buscar Producto";
        this.botonBuscarProducto = super.generarBoton(textoBoton, 175, 180, 150, 40);
        this.add(this.botonBuscarProducto);
        this.botonBuscarProducto.addActionListener(this);
    }
    private void generarBotonAgregarProducto() {
        String textoBoton = "Agregar Producto";
        this.botonAgregarProducto = super.generarBoton(textoBoton, 175, 260, 150, 40);
        this.add(this.botonAgregarProducto);
        this.botonAgregarProducto.addActionListener(this);
    }
    private void generarBotonVolver() {
        String textoBoton = "Volver";
        this.botonVolver = super.generarBoton(textoBoton, 175, 380, 150, 40);
        this.add(this.botonVolver);
        this.botonVolver.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonMostrarInventario) {
            VentanaInventario inventario = new VentanaInventario(tienda);
            inventario.setLocationRelativeTo(null);
            inventario.setVisible(true);
        }
        if (e.getSource() == this.botonBuscarProducto) {
            VentanaBuscarProducto buscarProducto = new VentanaBuscarProducto(tienda);
            //Cierra la ventana actual
            this.dispose();
        }
        if (e.getSource() == this.botonVolver) {
            new VentanaPrincipal(tienda);
            //Cierra la ventana actual
            this.dispose();
        }
    }
}
