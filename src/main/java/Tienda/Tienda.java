package Tienda;

import java.util.ArrayList;

public class Tienda {
    //Atributos
    private ArrayList<Usuario> usuarios;
    public ArrayList<Producto> productos;
    public ArrayList<Venta> ventas;
    public ArrayList<Cliente> clientes;

    //Constructor
    public Tienda() {
        this.usuarios = new ArrayList<Usuario>();
        this.ventas = new ArrayList<Venta>();
        this.productos = new ArrayList<Producto>();
        this.clientes = new ArrayList<Cliente>();
    }

    //Métodos
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    public ArrayList<Producto> getProductos() {
        return productos;
    }
    public ArrayList<Venta> getVentas() {
        return ventas;
    }
    public void agregarAdministrador(Administrador administrador) {
        this.usuarios.add(administrador);
    }
    public void agregarVendedor(Vendedor vendedor) {
        this.usuarios.add(vendedor);
    }
    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }
    public void agregarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    //Métodos para Ventanas
    public boolean comprobarUsuario(String nombreUsuario, char[] contrasena){
        String contrasena2 = new String(contrasena);
        for(Usuario usuario : this.usuarios){
            if(usuario.getNombreUsuario().equals(nombreUsuario) && usuario.getContrasena().equals(contrasena2)){
                return true;
            }
        }
        return false;
    }
    public Usuario getUsuario(String nombreUsuario, char[] contrasena){
        String contrasena2 = new String(contrasena);
        for(Usuario usuario : this.usuarios){
            if(usuario.getNombreUsuario().equals(nombreUsuario) && usuario.getContrasena().equals(contrasena2)){
                return usuario;
            }
        }
        return null;
    }
    public Producto buscarProducto(String codigo){
        for(Producto producto : this.productos){
            if(producto.getCodigo().equals(codigo)){
                return producto;
            }
        }
        return null;


    }

}
