package Packete1;

import java.util.ArrayList;

public class Main {
    public static String[] users = {"Diego", "Luis"};
    public static ArrayList<ArrayList> datos = new ArrayList<ArrayList>();
    public static void main(String[] args) {
        // System.out.println("a");
        // VentanaLogin ventanaLogin = new VentanaLogin();
        // ventanaLogin.crearLabel();
        // ventanaLogin.crearTextBox();       
        // ventanaLogin.crearBotones(); 
        // ventanaLogin.setVisible(true);
        VentanaAdmin ventanaAdmin = new VentanaAdmin();
        ventanaAdmin.crearTabla();
        ventanaAdmin.crearJtextfield();
        ventanaAdmin.setVisible(true);
        
    }
    
}
