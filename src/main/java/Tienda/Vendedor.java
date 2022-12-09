package Tienda;

public class Vendedor extends Usuario{
    //Atributos

    //Constructor
    public Vendedor (String nombreUsuario,String contrasena) {
        super(nombreUsuario,contrasena);
    }
    //Métodos
    public String getTipo() {
        return "Vendedor";
    }
}
