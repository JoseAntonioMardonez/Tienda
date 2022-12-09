package Ventanas;

import Tienda.*;

import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class VentanaCarro extends JFrame {

    private JTable tabla = null;
    private Venta venta;
    DefaultTableModel modelo = null;
    JScrollPane desplazamiento = null;

    public VentanaCarro(Venta venta) {
        String[] columnas = {"Código", "Nombre", "Precio", "Cantidad"};
        this.venta = venta;
        tabla = new JTable();
        modelo = new DefaultTableModel();
        desplazamiento = new JScrollPane(tabla);

        // Parametros de la ventana
        this.setTitle("Carro");
        this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        this.setLayout(new BorderLayout());

        // Modelo de la tabla
        modelo.setColumnIdentifiers(columnas);

        // Barras de desplazamiento
        desplazamiento.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        desplazamiento.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        // Propiedades de la tabla
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabla.setFillsViewportHeight(true);

        tabla.setModel(modelo);

        // Agregamos datos
        this.agregarDatos(modelo);


        // Agregando elementos a la ventana
        this.getContentPane().add(desplazamiento, BorderLayout.NORTH);
        this.pack();
    }

    private void agregarDatos(DefaultTableModel modelo) {
        // Borramos todas las filas en la tabla
        modelo.setRowCount(0);

        for (ProductoCarrito producto : venta.getCarrito()) {
            Object[] datosFila = {producto.getCodigo(), producto.getNombre(), producto.getPrecio(), producto.getCantidad()};
            modelo.addRow(datosFila);
        }
    }
}
