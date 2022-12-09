package Ventanas;

import Tienda.*;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaVenta extends Ventana {

    private JLabel textoMenu;
    private JLabel textoVenta;
    private JLabel textoCliente;
    private JTextField entradaTextoVenta;
    private JTextField entradaTextoCliente;

    private JButton botonAgregar;
    private JButton botonVolver;
    private Venta venta;
    private Tienda tienda;

    public VentanaVenta(Tienda tienda) {
        super("Venta", 500, 500);
        this.tienda = tienda;
        generarElementosVentana();
    }

    private void generarElementosVentana() {
        generarMensajeEncabezado();
        generarTextoVenta();
        generarEntradaDeTextoVenta();
        generarTextoCliente();
        generarEntradaDeTextoCliente();
        generarBotonAgregar();
        generarBotonVolver();
    }

    private void generarMensajeEncabezado() {
        String textoEncabezado = "Crear Venta";
        super.generarJLabelEncabezado(this.textoMenu, textoEncabezado, 150, 30, 500, 30);
    }
    //Venta
    private void generarTextoVenta() {
        String textoVenta = "Ingrese el nombre de la Venta:";
        super.generarJLabel(this.textoVenta, textoVenta, 150, 90, 500, 30);
    }
    private void generarEntradaDeTextoVenta() {

        this.entradaTextoVenta = super.generarJTextField(150, 120, 200, 20);
        this.add(this.entradaTextoVenta);
        this.entradaTextoVenta.addActionListener(this);

    }
    //rut Cliente
    private void generarTextoCliente() {
        String textoCliente = "Ingrese el RUT del Cliente:";
        super.generarJLabel(this.textoCliente, textoCliente, 150, 150, 500, 30);
    }
    private void generarEntradaDeTextoCliente() {

        this.entradaTextoCliente = super.generarJTextField(150, 180, 200, 20);
        this.add(this.entradaTextoCliente);
        this.entradaTextoCliente.addActionListener(this);

    }
    //Boton Agregar
    private void generarBotonAgregar() {
        String textoBoton = "Agregar";
        this.botonAgregar = super.generarBoton(textoBoton, 175, 340, 150, 40);
        this.add(this.botonAgregar);
        this.botonAgregar.addActionListener(this);
    }
    private void generarBotonVolver() {
        String textoBoton = "Volver";
        this.botonVolver = super.generarBoton(textoBoton, 175, 400, 150, 40);
        this.add(this.botonVolver);
        this.botonVolver.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonAgregar) {
            String codigo = entradaTextoVenta.getText();
            String rut = entradaTextoCliente.getText();
            Cliente cliente= tienda.buscarCliente(rut);
            Venta venta = new Venta(tienda,codigo,cliente);

            JOptionPane.showMessageDialog(this,"Venta Creada","Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);
            new VentanaVentaPrincipal(tienda,venta);
            //Cierra la ventana actual
            this.dispose();

        }
        if (e.getSource() == this.botonVolver) {
            new VentanaVendedor(tienda);
            //Cierra la ventana actual
            this.dispose();
        }
    }
}
