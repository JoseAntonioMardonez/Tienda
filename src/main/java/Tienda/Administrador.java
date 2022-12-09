package Tienda;

public class Administrador extends Usuario {
    //Atributos

    //Constructor
    public Administrador (String nombreUsuario,String contrasena) {
        super(nombreUsuario,contrasena);
    }
    //Métodos
    public String getTipo() {
        return "Administrador";
    }
}

