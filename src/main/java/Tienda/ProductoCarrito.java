package Tienda;

public class ProductoCarrito {
    private String nombre;
    private int precio;

    private String codigo;
    private int cantidad;

    public ProductoCarrito(String nombre, int precio, String codigo, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.codigo = codigo;
    }

    public void sumarPrecio(int precio){
        this.precio = this.precio + precio;
    }


    public void setCantidad(int cantidad){
        if(cantidad>=0){
            this.cantidad = cantidad;
        } else if(cantidad<0){
            System.out.println("la cantidad en exitencias no puede ser negativa");
        } else {
            System.out.println("El valor ingresado no es válido, intente denuevo");
        }
    }

    public void sumarCantidad(int suma){
        this.cantidad = this.cantidad + suma;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getPrecio(){
        return this.precio;
    }

    public int getCantidad(){
        return this.cantidad;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public String toString() {
        return codigo+", "+nombre+", "+precio+", "+cantidad;
    }
}
