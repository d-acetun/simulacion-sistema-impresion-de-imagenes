package Packete1;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Set;

public class Funciones {
    public String leerArchivo(){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String contenido="";

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File ("prueba.json");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while((linea=br.readLine())!=null) {
                contenido+=linea;
            }
            convertirAJson(contenido);
        }
        catch(Exception e){
            e.printStackTrace();
        }finally{
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta
            // una excepcion.
            try{
                if( null != fr ){
                    fr.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();

            }
        }
        return contenido;
    }
    public String convertirAJson(String contenido){
        ListaSimple colaRecepcion = new ListaSimple();
        Gson gson = new Gson();
        //Convirtiendo el contenido a diccionario, esto devuelve
        //Cliente1 que es otro json
        HashMap diccionarioClienteN = gson.fromJson(contenido, HashMap.class);
        Set<String> keys = diccionarioClienteN.keySet();
        for(String key:keys){
            //Covertimos el diccionario a string para poder generar
            //otro diccionario pasando el string
            String json = gson.toJson(diccionarioClienteN.get(key));
            //Creamos el diccionario con los atributos de los clientes
            HashMap diccionarioValores = gson.fromJson(json, HashMap.class);
//            System.out.println(diccionarioValores);
//            Set<String> keysA = diccionarioValores.keySet();
            int id_cliente = Integer.parseInt(diccionarioValores.get("id_cliente").toString());
            int img_bw = Integer.parseInt(diccionarioValores.get("img_bw").toString());
            int img_color = Integer.parseInt(diccionarioValores.get("img_color").toString());
            String nombre_cliente = diccionarioValores.get("nombre_cliente").toString();

            Cliente nuevoCliente = new Cliente(id_cliente, nombre_cliente, img_color, img_bw);
            System.out.println("insertando al inicio... "+nuevoCliente.getId_cliente());
            colaRecepcion.insertarInicio(nuevoCliente);
//            System.out.println(nuevoCliente.mostrarDatos());
            //Usar la siguiente sintaxis si no se saben las claves
//            for(String keyA:keysA){
//                System.out.print(keyA+" ");
//                String valor = diccionarioValores.get(keyA).toString();
//                System.out.print(valor+" ");
//            }
//            System.out.println();
        }
        colaRecepcion.recorrerColaRecepcion();


        return "";
    }
    public void listas(){
        ListaSimple lista = new ListaSimple();
        lista.insertarFinal("jajaj");
        lista.insertarFinal("ssx");
        lista.insertarFinal("xsx");
        lista.insertarFinal("ddd");
//        System.out.println(lista.primero.getDato());
//        lista.recorrer();

    }
}
