package Tienda;

import Ventanas.VentanaPrincipal;

public class main {

    public static void main(String [] args){
        Tienda tienda = new Tienda();
        Administrador administrador = new Administrador("Admin","12345");
        tienda.agregarAdministrador(administrador);
        new VentanaPrincipal(tienda);

    }
}