package Tienda;

import java.util.ArrayList;

public class Tienda {
    //Atributos
    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    /*private ArrayList<Administrador> administradores = new ArrayList<Administrador>();
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();*/
    //Constructor
    public Tienda() {
        /*this.clientes = new ArrayList<Cliente>();
        this.administradores = new ArrayList<Administrador>();*/
        this.usuarios = new ArrayList<Usuario>();
    }
    //Métodos
    /*public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public ArrayList<Administrador> getAdministradores() {
        return administradores;
    }*/
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    public void agregarAdministrador(Administrador administrador) {
        this.usuarios.add(administrador);
    }
    public void agregarCliente(Cliente cliente) {
        this.usuarios.add(cliente);
    }
    public boolean comprobarUsuario(String nombreUsuario, char[] contrasena){
        String contrasena2 = new String(contrasena);
        for(Usuario usuario : this.usuarios){
            if(usuario.getNombreUsuario().equals(nombreUsuario) && usuario.getContrasena().equals(contrasena2)){
                System.out.println("si");
                return true;
            }
        }
        System.out.println("no");
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

}
