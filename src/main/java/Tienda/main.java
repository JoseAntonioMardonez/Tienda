package Tienda;

import Gestores.GestorDatos;
import Ventanas.VentanaPrincipal;

public class main {

    public static void main(String [] args){
        Tienda tienda = new Tienda();
        Producto producto1 = new Producto("Producto 1",20000,"P0001",10);
        Producto producto2 = new Producto("Producto 2",30000,"P0002",15);
        Producto producto3 = new Producto("Producto 3",23000,"P0003",45);
        Vendedor vendedor = new Vendedor("Vendedor","54321");
        Administrador administrador = new Administrador("Admin","12345");
        Cliente cliente = new Cliente("Cliente","11.111.111-1");
        tienda.agregarAdministrador(administrador);
        tienda.agregarVendedor(vendedor);
        tienda.agregarCliente(cliente);
        tienda.agregarProducto(producto1);
        tienda.agregarProducto(producto2);
        tienda.agregarProducto(producto3);
        new VentanaPrincipal(tienda);

    }
}