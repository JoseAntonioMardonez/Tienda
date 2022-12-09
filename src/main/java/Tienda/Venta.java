package Tienda;

import java.util.ArrayList;

public class Venta {

    private String nombre;
    private Tienda tienda;
    public ArrayList<ProductoCarrito> carrito;
    private Cliente cliente;


    public Venta(Tienda tienda,String nombre,Cliente cliente) {
        this.nombre = nombre;
        this.carrito = new ArrayList<ProductoCarrito>();
        this.cliente = cliente;
        this.tienda = tienda;
    }
    public ArrayList<ProductoCarrito> getCarrito() {
        return carrito;
    }
    public void agregarProducto(String codigo,int cantidad) {
        Producto producto = tienda.buscarProducto(codigo);
        ProductoCarrito productoCarrito = new ProductoCarrito(producto.getNombre(),producto.getPrecio(), producto.getCodigo(), cantidad);
        this.carrito.add(productoCarrito);
    }
    public int calcularTotal(){
        int total = 0;
        for(ProductoCarrito productoCarrito : this.carrito){
            total += productoCarrito.getPrecio()*productoCarrito.getCantidad();
        }
        return total;
    }

    public String getNombre() {
        return this.nombre;
    }

}
