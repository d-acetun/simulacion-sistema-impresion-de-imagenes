package Packete1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

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

//        System.out.println(contenido);
        Gson gson = new Gson();
//        Map<?,?> userMap = gson.fromJson(contenido, Map.class);
        HashMap mapa = gson.fromJson(contenido, HashMap.class);
        String sss = mapa.get("Cliente1").toString();
        HashMap nuevo = new HashMap<>();
//        nuevo = (HashMap) sss;
        Gson gg = new Gson();
        String json = gg.toJson(mapa.get("Cliente1"));
        System.out.println(json);
        Gson tt = new Gson();
        HashMap mm = gson.fromJson(json, HashMap.class);
        System.out.println(mm.get("img_bw"));

//        System.out.println(mapa.get("Cliente1").getClass().getSimpleName());


//        System.out.println(userMap.get("Cliente1").getClass().getSimpleName());



    }
}
