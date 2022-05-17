package Packete1;

import java.util.ArrayList;
import java.util.Random;
import Estructuras.ArbolB;
public class Main {
    public static String[] users = {"Diego", "Luis"};
    public static ArrayList<ArrayList> datos = new ArrayList<ArrayList>();
    public static void main(String[] args) {
        estructuras();
        
        
    //     // System.out.println(containsStr);
    //     String [] nombres = {"juan", "juana", "alex", "alexa", "alejandro", "alejandra"
    // , "paola", "paolo", "mario", "maria"};
    //     for(int i=0; i<10; i++){
    //         ArrayList<String> datos2 = new ArrayList<String>();
    //         Random random = new Random();
    //         int numero = random.nextInt(nombres.length);
    //         datos2.add(nombres[numero]);
    //         datos2.add("des1 ");
    //         datos2.add("des2 ");
    //         Main.datos.add(datos2);

    //     }
    //     // System.out.println("a");
    //     // VentanaLogin ventanaLogin = new VentanaLogin();
    //     // ventanaLogin.crearLabel();
    //     // ventanaLogin.crearTextBox();       
    //     // ventanaLogin.crearBotones(); 
    //     // ventanaLogin.setVisible(true);
    //     VentanaAdmin ventanaAdmin = new VentanaAdmin();
    //     ventanaAdmin.crearTabla();
    //     ventanaAdmin.crearJtextfield();
    //     ventanaAdmin.setVisible(true);
        
    }
    public static void estructuras(){
        ArbolB arbolB = new ArbolB();
        arbolB.insertar(10);
        arbolB.insertar(5);
        arbolB.insertar(15);
        arbolB.insertar(3);
        arbolB.insertar(7);
        arbolB.insertar(1);
        arbolB.insertar(4);
        arbolB.insertar(9);
        arbolB.insertar(15);
        arbolB.insertar(14);
        arbolB.insertar(17);
        arbolB.insertar(16);
        arbolB.insertar(28);

        // arbolB.preOrden();
    }
    
}
