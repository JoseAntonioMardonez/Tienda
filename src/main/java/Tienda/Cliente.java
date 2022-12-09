package Tienda;

public class Cliente extends Usuario{
    //Atributos
    private String nombre;
    private String rut;

    //Constructor
    public Cliente (String nombre,String rut,String nombreUsuario,String contrasena) {
        super(nombreUsuario,contrasena);
        this.nombre = nombre;
        this.rut = rut;
    }
    //Métodos
    public String getTipo() {
        return "Cliente";
    }
}
