package Ventanas;

import Tienda.Tienda;

import javax.swing.*;

public class VentanaInventario extends Ventana{
    private JButton botonMostrarInventario;
    private JButton botonBuscarProducto;
    private JButton botonAgregarProducto;
    private Tienda tienda;

    public VentanaInventario(Tienda tienda) {
        super("Inventario",500,500);
        this.tienda = tienda;
        generarElementosVentana();
    }

    private void generarElementosVentana() {
        //generarBoton();
        //generarBoton();
        //generarBoton();
    }
}
