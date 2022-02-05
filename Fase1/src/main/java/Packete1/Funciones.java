package Packete1;

import com.google.gson.Gson;
import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
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
            Scanner Entradaruta = new Scanner(System.in);
            System.out.print("Ingresar ruta del archivo:  ");
            String ruta = Entradaruta.nextLine();

            archivo = new File (ruta);
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while((linea=br.readLine())!=null) {
                contenido+=linea;
            }
            crearClientes(contenido);
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
    public String crearClientes(String contenido){

        try{
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

            System.out.println("Clientes Cargados exitosamente");
            verColaRecepcion(colaRecepcion);
            menu();
        }catch (Exception e){
            System.out.println("Error al cargar clientes");
//            e.printStackTrace();

        }
        return "";
    }

    public void crearGraphviz(ListaSimple lista){
        try {
            String ruta = "graph.dot";
            String contenido = "Contenido de ejemplo";
            StringBuilder nodos = new StringBuilder();
            StringBuilder conectarNodos = new StringBuilder();
            nodos.append("digraph ejemplo {\n");
            Nodo aux = lista.getPrimero();
            int id=0;
            int idAnterior=0;
            while (aux != null){
                Cliente cliente = (Cliente) aux.getDato();
                nodos.append(String.format("%d [label=\"%s\"]", id, cliente.getNombre_cliente()));
                nodos.append("\n");
                aux = aux.getSiguiente();
                if(id>0){
                    conectarNodos.append(idAnterior+"->"+id+"\n");
                }
                idAnterior = id;
                id++;


            }
            nodos.append(conectarNodos);
            nodos.append("rankdir=TB\n}");
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(nodos.toString());
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String parametros[] = new String[5];
        parametros[0] = "C:\\Program Files\\Graphviz\\bin\\dot.exe";
        parametros[1] = "-Tpng";
        parametros[2] = "C:\\Users\\diego\\Desktop\\USAC\\EstructurasDeDatos\\EDD_UDRAWING_FASE_201903909\\Fase1\\graph.dot";
        parametros[3] = "-o";
        parametros[4] = "C:\\Users\\diego\\Desktop\\USAC\\EstructurasDeDatos\\EDD_UDRAWING_FASE_201903909\\Fase1\\g.png";

        try {
            Process proceso = Runtime.getRuntime().exec(parametros, null);
            proceso.waitFor();
        } catch (IOException | InterruptedException e) {
            System.out.println("errror");
            e.printStackTrace();
        }

    }
    
    public String crearVentanillas(int numeroVentanillas){
        try{
            ListaSimple listaVentanillas = new ListaSimple();
            for(int i=1; i<=numeroVentanillas; i++){
                Ventanilla nuevaVentanilla = new Ventanilla("Ventanilla"+i);
                listaVentanillas.insertarFinal(nuevaVentanilla);
            }
            System.out.println("Ventanillas creadas exitosamente");
        }catch (Exception e){
            e.printStackTrace();
        }
        
        return "";
    }
    public void menu(){
        Scanner entradaEscaner = new Scanner(System.in);
        System.out.println("*****MENU*****");
        System.out.println("1. Parametros Iniciales");
        System.out.println("2. Ejecutar Paso");
        System.out.println("3. Estado en memoria de las estructuras");
        System.out.println("4. Reportes");
        System.out.println("5. Datos del estudiante");
        System.out.println("6. Salir");
        System.out.print("Seleccionar Opcion:  ");
        String opcion = entradaEscaner.nextLine();
        switch (opcion){
            case "1":
                Scanner entradaParametros = new Scanner(System.in);
                System.out.println("1. Carga Masiva de clientes");
                System.out.println("2. Cantidad de ventanillas");
                System.out.println("Seleccionar Opcion:  ");
                String opcionParametros = entradaParametros.nextLine();
                if (opcionParametros.equals("1")){
                    leerArchivo();
            }else if (opcionParametros.equals("2")){
                    Scanner entradaCantidadVentanillas = new Scanner(System.in);
                    System.out.print("Ingresar la cantidad de ventanillas ");
                    int numeroVentanillas = entradaCantidadVentanillas.nextInt();
                    crearVentanillas(numeroVentanillas);

                }
                break;

            case "6":
                break;
            default:
                System.out.println("Opcion no disponible");
                break;

        }
        System.out.println();
    }
    public void verColaRecepcion(ListaSimple colaRecepcion){
        try {
            String ruta = "graph.dot";
            String contenido = "Contenido de ejemplo";
            StringBuilder nodos = new StringBuilder();
            StringBuilder conectarNodos = new StringBuilder();
            nodos.append("digraph ejemplo {\n");
            Nodo aux = colaRecepcion.getPrimero();
            int id=0;
            int idAnterior=0;
            while (aux != null){
                Cliente cliente = (Cliente) aux.getDato();
                nodos.append(String.format("%d [label=\"%s\\nIMG C %d\\nIMG BN %d\"]", id,
                        cliente.getNombre_cliente(), cliente.getImg_color(), cliente.getImg_bw()
                ));
                nodos.append("\n");
                aux = aux.getSiguiente();
                if(id>0){
                    conectarNodos.append(idAnterior+"->"+id+"\n");
                }
                idAnterior = id;
                id++;


            }
            nodos.append(conectarNodos);
            nodos.append("rankdir=TB\n}");
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(nodos.toString());
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String parametros[] = new String[5];
        parametros[0] = "C:\\Program Files\\Graphviz\\bin\\dot.exe";
        parametros[1] = "-Tpng";
        parametros[2] = "C:\\Users\\diego\\Desktop\\USAC\\EstructurasDeDatos\\EDD_UDRAWING_FASE_201903909\\Fase1\\graph.dot";
        parametros[3] = "-o";
        parametros[4] = "C:\\Users\\diego\\Desktop\\USAC\\EstructurasDeDatos\\EDD_UDRAWING_FASE_201903909\\Fase1\\g.png";

        try {
            Process proceso = Runtime.getRuntime().exec(parametros, null);
            proceso.waitFor();
        } catch (IOException | InterruptedException e) {
            System.out.println("errror");
            e.printStackTrace();
        }

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
