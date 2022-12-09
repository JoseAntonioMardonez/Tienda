package Tienda;

import Gestores.GestorDatos;
import Ventanas.VentanaPrincipal;

public class main {

    public static void main(String [] args){
        Tienda tienda = new Tienda();
        Producto producto1 = new Producto("Producto 1",20000,"P0001",10);
        Administrador administrador = new Administrador("Admin","12345");
        tienda = GestorDatos.leerArchivoProductos(tienda,"C:\\Users\\josem\\IdeaProjects\\Tienda\\src\\main\\java\\Archivos\\Productos");
        tienda.agregarAdministrador(administrador);
        tienda.agregarProducto(producto1);
        new VentanaPrincipal(tienda);

    }
}