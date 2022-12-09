package Ventanas;

import Tienda.*;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaVentaPrincipal extends Ventana {

    private JLabel textoMenu;

    private JButton botonCrearVenta;
    private JButton botonVerCarrito;
    private JButton botonVender;
    private JButton botonVolver;
    private Tienda tienda;

    public VentanaVentaPrincipal(Tienda tienda) {
        super("Venta", 500, 500);
        this.tienda = tienda;
        generarElementosVentana();
    }

    private void generarElementosVentana() {
        generarMensajeEncabezado();
        generarBotonAgregarProductos();
        generarBotonAgregar();
        generarBotonVolver();
    }

    private void generarMensajeEncabezado() {
        String textoEncabezado = "Ventas";
        super.generarJLabelEncabezado(this.textoMenu, textoEncabezado, 150, 30, 500, 30);
    }
    //Crear Venta
    private void generarBotonAgregarProductos() {
        String textoBoton = "Agregar Productos al Carro";
        this.botonCrearVenta = super.generarBoton(textoBoton, 175, 180, 150, 40);
        this.add(this.botonCrearVenta);
        this.botonCrearVenta.addActionListener(this);
    }
    //Ver carrito
    private void generarBotonVerCarrito() {
        String textoBoton = "Ver Carrito";
        this.botonVerCarrito = super.generarBoton(textoBoton, 175, 260, 150, 40);
        this.add(this.botonVerCarrito);
        this.botonVerCarrito.addActionListener(this);
    }
    //Boton Agregar
    private void generarBotonAgregar() {
        String textoBoton = "Agregar";
        this.botonVender = super.generarBoton(textoBoton, 175, 340, 150, 40);
        this.add(this.botonVender);
        this.botonVender.addActionListener(this);
    }
    private void generarBotonVolver() {
        String textoBoton = "Volver";
        this.botonVolver = super.generarBoton(textoBoton, 175, 400, 150, 40);
        this.add(this.botonVolver);
        this.botonVolver.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonCrearVenta) {
            VentanaVenta ventanaVenta = new VentanaVenta(tienda);
            //Cierra la ventana actual
            this.dispose();

        }
        if (e.getSource() == this.botonVolver) {
            new VentanaVentaPrincipal(tienda);
            //Cierra la ventana actual
            this.dispose();
        }
    }
}
