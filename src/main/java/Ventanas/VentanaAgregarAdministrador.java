package Ventanas;

import Tienda.*;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaAgregarAdministrador extends Ventana {

    private JLabel textoMenu;
    private JLabel textoContrasena;
    private JLabel textoNombreUsuario;
    private JTextField entradaTextoContrasena;
    private JTextField entradaTextoNombreUsuario;

    private JButton botonAgregar;
    private JButton botonVolver;
    private Tienda tienda;

    public VentanaAgregarAdministrador(Tienda tienda) {
        super("Agregar Usuario", 500, 500);
        this.tienda = tienda;
        generarElementosVentana();
    }

    private void generarElementosVentana() {
        generarMensajeEncabezado();
        generarTextoContrasena();
        generarEntradaDeTextoContrasena();
        generarTextoNombreUsuario();
        generarEntradaDeTextoNombreUsuario();
        generarBotonAgregar();
        generarBotonVolver();
    }

    private void generarMensajeEncabezado() {
        String textoEncabezado = "Agregar Administrador";
        super.generarJLabelEncabezado(this.textoMenu, textoEncabezado, 150, 30, 500, 30);
    }
    //Nombre
    private void generarTextoNombreUsuario() {
        String textoNombreUsuario = "Ingrese el Nombre de Usuario:";
        super.generarJLabel(this.textoNombreUsuario, textoNombreUsuario, 150, 90, 500, 30);
    }
    private void generarEntradaDeTextoNombreUsuario() {

        this.entradaTextoNombreUsuario = super.generarJTextField(150, 120, 200, 20);
        this.add(this.entradaTextoNombreUsuario);
        this.entradaTextoNombreUsuario.addActionListener(this);

    }
    //Ingrese Contraseña
    private void generarTextoContrasena() {
        String textoContrasena = "Ingrese Contraseña:";
        super.generarJLabel(this.textoContrasena, textoContrasena, 150, 150, 500, 30);
    }
    private void generarEntradaDeTextoContrasena() {

        this.entradaTextoContrasena = super.generarJTextField(150, 180, 200, 20);
        this.add(this.entradaTextoContrasena);
        this.entradaTextoContrasena.addActionListener(this);

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
            String contrasena = entradaTextoContrasena.getText();
            String nombreUsuario = entradaTextoNombreUsuario.getText();
            Administrador administrador = new Administrador(nombreUsuario,contrasena);
            tienda.agregarAdministrador(administrador);

            JOptionPane.showMessageDialog(this,"Vendedor Agregado","Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);
            new VentanaAdministrador(tienda);
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
