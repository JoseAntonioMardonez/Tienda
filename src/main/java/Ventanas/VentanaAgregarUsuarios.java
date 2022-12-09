package Ventanas;

import Tienda.Administrador;
import Tienda.Tienda;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaAgregarUsuarios extends Ventana {

    private JLabel textoMenu;
    private JButton botonAgregarAdministrador;
    private JButton botonAgregarVendedor;
    private JButton botonVolver;
    private Tienda tienda;

    public VentanaAgregarUsuarios(Tienda tienda) {
        super("Agregar Usuarios", 500, 500);
        this.tienda = tienda;
        generarElementosVentana();
    }

    private void generarElementosVentana() {
        generarMensajeEncabezado();
        generarBotonAgregarAdministrador();
        generarBotonAgregarVendedor();
        generarBotonVolver();
    }

    private void generarMensajeEncabezado() {
        String textoEncabezado = "Agregar Usuarios";
        super.generarJLabelEncabezado(this.textoMenu, textoEncabezado, 150, 30, 500, 30);
    }
    //Boton Agregar Administrador
    private void generarBotonAgregarAdministrador() {
        String textoBoton = "Agregar Administrador";
        this.botonAgregarAdministrador = super.generarBoton(textoBoton, 175, 240, 150, 40);
        this.add(this.botonAgregarAdministrador);
        this.botonAgregarAdministrador.addActionListener(this);
    }
    //Boton Agregar Vendedor
    private void generarBotonAgregarVendedor() {
        String textoBoton = "Agregar Vendedor";
        this.botonAgregarVendedor = super.generarBoton(textoBoton, 175, 340, 150, 40);
        this.add(this.botonAgregarVendedor);
        this.botonAgregarVendedor.addActionListener(this);
    }
    private void generarBotonVolver() {
        String textoBoton = "Volver";
        this.botonVolver = super.generarBoton(textoBoton, 175, 400, 150, 40);
        this.add(this.botonVolver);
        this.botonVolver.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonAgregarAdministrador) {
            new VentanaAgregarAdministrador(tienda);
            //Cierra la ventana actual
            this.dispose();
        }
        if (e.getSource() == this.botonAgregarVendedor) {
            new VentanaAgregarVendedor(tienda);
            //Cierra la ventana actual
            this.dispose();
        }
        if (e.getSource() == this.botonVolver) {
            new VentanaAdministrador(tienda);
            //Cierra la ventana actual
            this.dispose();
        }
    }
}
