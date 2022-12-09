package Ventanas;

import Tienda.*;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaAgregarProductoCarrito extends Ventana {

    private JLabel textoMenu;
    private JLabel textoProducto1;
    private JLabel textoProducto2;
    private JLabel textoProducto3;
    private JLabel textoProducto4;
    private JTextField entradaTextoProducto1;
    private JTextField entradaTextoProducto2;
    private JTextField entradaTextoProducto3;
    private JTextField entradaTextoProducto4;

    private JButton botonVender;
    private JButton botonVolver;
    private Venta venta;
    private Tienda tienda;

    public VentanaAgregarProductoCarrito(Tienda tienda,Venta venta) {
        super("Venta", 500, 500);
        this.venta = venta;
        this.tienda = tienda;
        generarElementosVentana();
    }

    private void generarElementosVentana() {
        generarMensajeEncabezado();
        generarTextoProducto1();
        generarEntradaDeTextoProducto1();
        generarTextoProducto2();
        generarEntradaDeTextoProducto2();
        generarBotonAgregar();
        generarBotonVolver();
    }

    private void generarMensajeEncabezado() {
        String textoEncabezado = "Agregar Producto al Carro";
        super.generarJLabelEncabezado(this.textoMenu, textoEncabezado, 150, 30, 500, 30);
    }
    //Producto 1
    private void generarTextoProducto1() {
        String textoProducto1 = "Ingrese el Código:";
        super.generarJLabel(this.textoProducto1, textoProducto1, 150, 90, 500, 30);
    }
    private void generarEntradaDeTextoProducto1() {

        this.entradaTextoProducto1 = super.generarJTextField(150, 120, 200, 20);
        this.add(this.entradaTextoProducto1);
        this.entradaTextoProducto1.addActionListener(this);

    }
    //Producto 2
    private void generarTextoProducto2() {
        String textoProducto2 = "Ingrese la Cantidad:";
        super.generarJLabel(this.textoProducto2, textoProducto2, 150, 150, 500, 30);
    }
    private void generarEntradaDeTextoProducto2() {

        this.entradaTextoProducto2 = super.generarJTextField(150, 180, 200, 20);
        this.add(this.entradaTextoProducto2);
        this.entradaTextoProducto2.addActionListener(this);

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
        if (e.getSource() == this.botonVender) {
            String codigo = entradaTextoProducto1.getText();
            int cantidad = Integer.parseInt(entradaTextoProducto2.getText());
            venta.agregarProducto(codigo,cantidad);

            JOptionPane.showMessageDialog(this,"Producto Agregado","Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);
            new VentanaAgregarProductoCarrito(tienda,venta);
            //Cierra la ventana actual
            this.dispose();

        }
        if (e.getSource() == this.botonVolver) {
            new VentanaVentaPrincipal(tienda,venta);
            //Cierra la ventana actual
            this.dispose();
        }
    }
}

