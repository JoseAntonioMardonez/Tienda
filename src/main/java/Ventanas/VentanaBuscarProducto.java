package Ventanas;

import Gestores.GestorDatos;
import Tienda.*;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaBuscarProducto extends Ventana {

    private JLabel textoMenu;
    private JLabel textoUsuario;
    private JLabel textoContrasena;
    private JTextField entradaTextoUsuario;

    private JButton botonBuscar;
    private JButton botonVolver;
    private Tienda tienda;

    public VentanaBuscarProducto(Tienda tienda) {
        super("Buscar Producto", 500, 500);
        this.tienda = tienda;
        generarElementosVentana();
    }

    private void generarElementosVentana() {
        generarMensajeMenu();
        generarTextoUsuario();
        generarEntradaDeTextoNombre();
        generarBotonBuscar();
        generarBotonVolver();
    }

    private void generarMensajeMenu() {
        String textoBienvenida = "Sistema Tienda - SMS";
        super.generarJLabelEncabezado(this.textoMenu, textoBienvenida, 150, 30, 500, 30);
    }

    private void generarTextoUsuario() {
        String textoUsuario = "Ingrese el Código:";
        super.generarJLabel(this.textoUsuario, textoUsuario, 150, 90, 500, 30);
    }

    private void generarEntradaDeTextoNombre() {

        this.entradaTextoUsuario = super.generarJTextField(150, 120, 200, 20);
        this.add(this.entradaTextoUsuario);
        this.entradaTextoUsuario.addActionListener(this);

    }
    private void generarBotonBuscar() {
        String textoBoton = "Buscar";
        this.botonBuscar = super.generarBoton(textoBoton, 175, 240, 150, 40);
        this.add(this.botonBuscar);
        this.botonBuscar.addActionListener(this);
    }
    private void generarBotonVolver() {
        String textoBoton = "Volver";
        this.botonVolver = super.generarBoton(textoBoton, 175, 380, 150, 40);
        this.add(this.botonVolver);
        this.botonVolver.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonBuscar) {
            String codigo = entradaTextoUsuario.getText();
            Producto productoBuscado = tienda.buscarProducto(codigo);
            JOptionPane.showMessageDialog(this,"Nombre: "+productoBuscado.getNombre()+" | Existencias: "+productoBuscado.getExistencias()+" | Precio: "+productoBuscado.getPrecio(),"Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);

        }
        if (e.getSource() == this.botonVolver) {
            new VentanaAdministrador(tienda);
            //Cierra la ventana actual
            this.dispose();
        }
    }
}
