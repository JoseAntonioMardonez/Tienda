package Ventanas;

import Tienda.Tienda;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaVendedor extends Ventana{
    private JButton botonMostrarInventario;
    private JButton botonBuscarProducto;
    private JButton botonVenta;
    private JButton botonVolver;
    private Tienda tienda;
    private JLabel textoMenu;

    public VentanaVendedor(Tienda tienda) {
        super("Vendedor",500,500);
        this.tienda = tienda;
        generarElementosVentana();
    }

    private void generarElementosVentana() {
        generarMensajeEncabezado();
        generarBotonMostrarInventario();
        generarBotonBuscarProducto();
        generarBotonVenta();
        generarBotonVolver();
    }
    private void generarMensajeEncabezado() {
        String textoEncabezado = "Vendedor";
        super.generarJLabelEncabezado(this.textoMenu, textoEncabezado, 150, 30, 500, 30);
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
    private void generarBotonVenta() {
        String textoBoton = "Venta";
        this.botonVenta = super.generarBoton(textoBoton, 175, 260, 150, 40);
        this.add(this.botonVenta);
        this.botonVenta.addActionListener(this);
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
        if (e.getSource() == this.botonVenta) {
            VentanaVenta venta = new VentanaVenta(tienda);
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
