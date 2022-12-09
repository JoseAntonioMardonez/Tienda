package Ventanas;

import Tienda.Tienda;

import javax.swing.*;

public class VentanaVendedor extends Ventana{
    private JButton botonMostrarInventario;
    private JButton botonBuscarProducto;
    private JButton botonAgregarProducto;
    private Tienda tienda;

    public VentanaVendedor(Tienda tienda) {
        super("Vendedor",500,500);
        this.tienda = tienda;
        generarElementosVentana();
    }

    private void generarElementosVentana() {
        //generarBoton();
        //generarBoton();
        //generarBoton();
    }
}
