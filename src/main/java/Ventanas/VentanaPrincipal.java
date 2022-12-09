package Ventanas;

import Tienda.*;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends Ventana{

    private JLabel textoMenu;
    private JLabel textoUsuario;
    private JLabel textoContrasena;
    private JLabel imagenUsuario;
    private JTextField entradaTextoUsuario;
    private JPasswordField entradaTextoContrasena;
    private JButton botonIngresar;
    private JButton botonSalida;
    private Tienda tienda;

    public VentanaPrincipal(Tienda tienda) {
        super("Tienda",500,500);
        this.tienda = tienda;
        generarElementosVentana();
    }

    private void generarElementosVentana(){
        generarMensajeMenu();
        generarImagenUsuario();
        generarTextoUsuario();
        generarEntradaDeTextoNombre();
        generarTextoContrasena();
        generarEntradaDeTextoContrasena();
        generarBotonIngresar();
        generarBotonSalir();
    }
    private void generarMensajeMenu() {
        String textoBienvenida = "Sistema Tienda - SMS";
        super.generarJLabelEncabezado(this.textoMenu, textoBienvenida, 150, 30, 500, 30);
    }
    private void generarTextoUsuario() {
        String textoUsuario = "Usuario:";
        super.generarJLabel(this.textoUsuario, textoUsuario, 150, 90, 500, 30);
    }
    private void generarImagenUsuario(){
        String rutaImagen = "C:\\Users\\josem\\IdeaProjects\\Tienda\\src\\main\\java\\Imagenes\\usuario.jpg";
        super.generarJLabelImagen(this.imagenUsuario,rutaImagen,150,400,150,150);
    }

    private void generarEntradaDeTextoNombre() {

        this.entradaTextoUsuario = super.generarJTextField(150,120,200,20);
        this.add(this.entradaTextoUsuario);
        this.entradaTextoUsuario.addActionListener(this);

    }
    private void generarTextoContrasena() {
        String textoContrasena = "Contraseña:";
        super.generarJLabel(this.textoContrasena, textoContrasena, 150, 160, 500, 30);
    }
    private void generarEntradaDeTextoContrasena() {

        this.entradaTextoContrasena = super.generarJPaswordField(150,190,200,20);
        this.add(this.entradaTextoContrasena);
        this.entradaTextoContrasena.addActionListener(this);

    }

    private void generarBotonIngresar() {
        String textoBoton = "Ingresar";
        this.botonIngresar = super.generarBoton(textoBoton, 175, 240, 150, 40);
        this.add(this.botonIngresar);
        this.botonIngresar.addActionListener(this);
    }
    private void generarBotonSalir() {
        String textoBoton = "Salir";
        this.botonSalida = super.generarBoton(textoBoton, 175, 380, 150, 40);
        this.add(this.botonSalida);
        this.botonSalida.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonIngresar) {
            String nombreUsuario = entradaTextoUsuario.getText();
            char[] contrasena = entradaTextoContrasena.getPassword();
            boolean comprobarUsuario = tienda.comprobarUsuario(nombreUsuario,contrasena);
            if(comprobarUsuario == true){
                Usuario usuario = tienda.getUsuario(nombreUsuario,contrasena);
                String TipoUsuario = usuario.getTipo();
                switch(TipoUsuario) {
                    case "Administrador":
                        new VentanaAdministrador(tienda);
                        break;
                    case "Cliente":
                        new VentanaVendedor(tienda);
                        break;
                }
            }else{
                JOptionPane.showMessageDialog(this,"Usuario o Contraseña Incorrecta","Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);
            }
            //Cierra la ventana actual
            this.dispose();
        }
        if(e.getSource() == this.botonSalida){
            //HospitalController.almacenarDatos(this.hospital);
            this.dispose();
            System.exit(0);
        }
    }

}
