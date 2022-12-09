package Tienda;

public class Cliente{
    //Atributos
    private String nombre;
    private String rut;

    //Constructor
    public Cliente (String nombre,String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }
    //Métodos
    public String getRut(){
        return this.rut;
    }
    /*public String getTipo() {
        return "Cliente";
    }*/
}
