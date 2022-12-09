package Ventanas;

import Tienda.Tienda;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaAdministrador extends Ventana{
    private JButton botonMostrarInventario;
    private JButton botonBuscarProducto;
    private JButton botonAgregarProducto;
    private JButton botonAgregarUsuario;
    private JButton botonVolver;
    private JLabel textoMenu;
    private Tienda tienda;

    public VentanaAdministrador(Tienda tienda) {
        super("Administrador",500,500);
        this.tienda = tienda;
        generarElementosVentana();
    }

    private void generarElementosVentana() {
        generarMensajeEncabezado();
        generarBotonMostrarInventario();
        generarBotonBuscarProducto();
        generarBotonAgregarProducto();
        generarBotonAgregarUsuario();
        generarBotonVolver();
    }
    private void generarMensajeEncabezado() {
        String textoEncabezado = "Administrador";
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
        this.botonBuscarProducto = super.generarBoton(textoBoton, 175, 160, 150, 40);
        this.add(this.botonBuscarProducto);
        this.botonBuscarProducto.addActionListener(this);
    }
    private void generarBotonAgregarProducto() {
        String textoBoton = "Agregar Producto";
        this.botonAgregarProducto = super.generarBoton(textoBoton, 175, 240, 150, 40);
        this.add(this.botonAgregarProducto);
        this.botonAgregarProducto.addActionListener(this);
    }
    private void generarBotonAgregarUsuario() {
        String textoBoton = "Agregar Usuario";
        this.botonAgregarUsuario = super.generarBoton(textoBoton, 175, 300, 150, 40);
        this.add(this.botonAgregarUsuario);
        this.botonAgregarUsuario.addActionListener(this);
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
        if (e.getSource() == this.botonAgregarProducto) {
            VentanaAgregarProducto agregarProducto = new VentanaAgregarProducto(tienda);
            //Cierra la ventana actual
            this.dispose();
        }
        if (e.getSource() == this.botonAgregarUsuario) {
            VentanaAgregarUsuarios agregarUsuario = new VentanaAgregarUsuarios(tienda);
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
