package Packete1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static String[] users = {"Diego", "Luis"};
    public static ArrayList<ArrayList> datos = new ArrayList<ArrayList>();
    public static void main(String[] args) {

        
        // System.out.println(containsStr);
        String [] nombres = {"juan", "juana", "alex", "alexa", "alejandro", "alejandra"
    , "paola", "paolo", "mario", "maria"};
        for(int i=0; i<10; i++){
            ArrayList<String> datos2 = new ArrayList<String>();
            Random random = new Random();
            int numero = random.nextInt(nombres.length);
            datos2.add(nombres[numero]);
            datos2.add("des1 ");
            datos2.add("des2 ");
            Main.datos.add(datos2);

        }
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
