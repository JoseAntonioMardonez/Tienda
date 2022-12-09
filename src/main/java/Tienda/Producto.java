package Tienda;

public class Producto {
    private String nombre;
    private int precio;

    private String codigo;
    private int existencias;

    public Producto(String nombre, int precio, String codigo, int existencias){
        this.nombre = nombre;
        this.precio = precio;
        this.existencias = existencias;
        this.codigo = codigo;
    }

    public void sumarPrecio(int precio){
        this.precio = this.precio + precio;
    }


    public void setExistencias(int existencias){
        if(existencias>=0){
            this.existencias = existencias;
        } else if(existencias<0){
            System.out.println("la cantidad en exitencias no puede ser negativa");
        } else {
            System.out.println("El valor ingresado no es válido, intente denuevo");
        }
    }

    public void sumarExistencias(int suma){
        this.existencias = this.existencias + suma;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getPrecio(){
        return this.precio;
    }

    public int getExistencias(){
        return this.existencias;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public String toString() {
        return codigo+", "+nombre+", "+precio+", "+existencias;
    }
}