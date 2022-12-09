package Ventanas;

import Tienda.*;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaVentaPrincipal extends Ventana {

    private JLabel textoMenu;

    private JButton botonVender;
    private JButton botonVerCarrito;
    private JButton botonAgregarProductos;
    private JButton botonVolver;
    private JLabel textoTotal;
    private Tienda tienda;
    private Venta venta;

    public VentanaVentaPrincipal(Tienda tienda,Venta venta) {
        super("Venta", 500, 500);
        this.tienda = tienda;
        this.venta = venta;
        generarElementosVentana();
    }

    private void generarElementosVentana() {
        generarMensajeEncabezado();
        generarBotonAgregarProductos();
        generarBotonVerCarrito();
        generarTextoTotal();
        generarBotonVolver();
    }

    private void generarMensajeEncabezado() {
        String textoEncabezado = "Ventas";
        super.generarJLabelEncabezado(this.textoMenu, textoEncabezado, 150, 30, 500, 30);
    }
    //Crear Venta
    private void generarBotonAgregarProductos() {
        String textoBoton = "Agregar Productos al Carro";
        this.botonAgregarProductos = super.generarBoton(textoBoton, 100, 180, 250, 40);
        this.add(this.botonAgregarProductos);
        this.botonAgregarProductos.addActionListener(this);
    }
    //Ver carrito
    private void generarBotonVerCarrito() {
        String textoBoton = "Ver Carrito";
        this.botonVerCarrito = super.generarBoton(textoBoton, 175, 260, 150, 40);
        this.add(this.botonVerCarrito);
        this.botonVerCarrito.addActionListener(this);
    }
    //Boton Agregar
    /*private void generarBotonAgregar() {
        String textoBoton = "Agregar";
        this.botonVender = super.generarBoton(textoBoton, 175, 340, 150, 40);
        this.add(this.botonVender);
        this.botonVender.addActionListener(this);
    }*/
    private void generarTextoTotal() {
        String textoUsuario = "Total: $"+venta.calcularTotal();
        super.generarJLabel(this.textoTotal, textoUsuario, 150, 340, 500, 30);
    }
    private void generarBotonVolver() {
        String textoBoton = "Volver";
        this.botonVolver = super.generarBoton(textoBoton, 175, 400, 150, 40);
        this.add(this.botonVolver);
        this.botonVolver.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonAgregarProductos) {
            VentanaAgregarProductoCarrito ventanaAgregarProductoCarrito = new VentanaAgregarProductoCarrito(tienda,venta);
            //Cierra la ventana actual
            this.dispose();

        }
        if (e.getSource() == this.botonVerCarrito) {
            VentanaCarro carrito = new VentanaCarro(venta);
            carrito.setLocationRelativeTo(null);
            carrito.setVisible(true);
            //Cierra la ventana actual
            //this.dispose();

        }
        if (e.getSource() == this.botonVolver) {
            new VentanaVendedor(tienda);
            //Cierra la ventana actual
            this.dispose();
        }
    }
}
