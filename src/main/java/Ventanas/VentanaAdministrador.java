package Ventanas;

import Tienda.Tienda;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaAdministrador extends Ventana{
    private JButton botonMostrarInventario;
    private JButton botonBuscarProducto;
    private JButton botonAgregarProducto;
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
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonMostrarInventario) {
            //Cierra la ventana actual
            //this.dispose();
        }
    }
}
