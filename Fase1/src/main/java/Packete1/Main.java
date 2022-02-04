package Packete1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.google.gson.Gson;
public class Main {
    public static void main(String[] args) {
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
            Set<String> keysA = diccionarioValores.keySet();
            for(String keyA:keysA){
                System.out.print(keyA+" ");
                String valor = diccionarioValores.get(keyA).toString();
                System.out.print(valor+" ");
            }
            System.out.println("");
        }
//        //Convertimos el objeto a string para poder obtener sus valores
//        String sss = diccionarioClienteN.get("Cliente1").toString();
//        //Convirtiendo otra vez el string a diccionario
//        String json = gson.toJson(diccionarioClienteN.get("Cliente1"));
////        System.out.println(json);
//        HashMap diccionarioValores = gson.fromJson(json, HashMap.class);
////        System.out.println(diccionarioValores.get("img_bw"));






    }
}
