package Ventanas;

import Tienda.*;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaAgregarProducto extends Ventana {

    private JLabel textoMenu;
    private JLabel textoCodigo;
    private JLabel textoNombre;
    private JLabel textoPrecio;
    private JLabel textoExistencias;
    private JTextField entradaTextoCodigo;
    private JTextField entradaTextoNombre;
    private JTextField entradaTextoPrecio;
    private JTextField entradaTextoExistencias;

    private JButton botonAgregar;
    private JButton botonVolver;
    private Tienda tienda;

    public VentanaAgregarProducto(Tienda tienda) {
        super("Agregar Producto", 500, 500);
        this.tienda = tienda;
        generarElementosVentana();
    }

    private void generarElementosVentana() {
        generarMensajeEncabezado();
        generarTextoCodigo();
        generarEntradaDeTextoCodigo();
        generarTextoNombre();
        generarEntradaDeTextoNombre();
        generarTextoPrecio();
        generarEntradaDeTextoPrecio();
        generarTextoExistencias();
        generarEntradaDeTextoExistencias();
        generarBotonAgregar();
        generarBotonVolver();
    }

    private void generarMensajeEncabezado() {
        String textoEncabezado = "Agregar Producto";
        super.generarJLabelEncabezado(this.textoMenu, textoEncabezado, 150, 30, 500, 30);
    }
    //Codigo Producto
    private void generarTextoCodigo() {
        String textoCodigo = "Ingrese el Código:";
        super.generarJLabel(this.textoCodigo, textoCodigo, 150, 90, 500, 30);
    }
    private void generarEntradaDeTextoCodigo() {

        this.entradaTextoCodigo = super.generarJTextField(150, 120, 200, 20);
        this.add(this.entradaTextoCodigo);
        this.entradaTextoCodigo.addActionListener(this);

    }
    //Nombre Producto
    private void generarTextoNombre() {
        String textoNombre = "Ingrese el Nombre:";
        super.generarJLabel(this.textoNombre, textoNombre, 150, 150, 500, 30);
    }
    private void generarEntradaDeTextoNombre() {

        this.entradaTextoNombre = super.generarJTextField(150, 180, 200, 20);
        this.add(this.entradaTextoNombre);
        this.entradaTextoNombre.addActionListener(this);

    }
    //Precio Producto
    private void generarTextoPrecio() {
        String textoPrecio = "Ingrese el Precio:";
        super.generarJLabel(this.textoPrecio, textoPrecio, 150, 210, 500, 30);
    }
    private void generarEntradaDeTextoPrecio() {

        this.entradaTextoPrecio = super.generarJTextField(150, 240, 200, 20);
        this.add(this.entradaTextoPrecio);
        this.entradaTextoPrecio.addActionListener(this);

    }
    //Exitencias
    private void generarTextoExistencias() {
        String textoExistencias = "Ingrese el número de existencias:";
        super.generarJLabel(this.textoExistencias, textoExistencias, 150, 270, 500, 30);
    }
    private void generarEntradaDeTextoExistencias() {

        this.entradaTextoExistencias = super.generarJTextField(150, 300, 200, 20);
        this.add(this.entradaTextoExistencias);
        this.entradaTextoExistencias.addActionListener(this);

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
            String codigo = entradaTextoCodigo.getText();
            String nombre = entradaTextoNombre.getText();
            int precio = Integer.parseInt(entradaTextoPrecio.getText());
            int existencias = Integer.parseInt(entradaTextoExistencias.getText());
            Producto producto = new Producto(nombre,precio,codigo,existencias);
            tienda.agregarProducto(producto);

            JOptionPane.showMessageDialog(this,"Producto Agregado","Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);
            new VentanaAgregarProducto(tienda);
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
