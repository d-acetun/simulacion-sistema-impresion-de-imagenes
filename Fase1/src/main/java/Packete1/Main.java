package Packete1;
public class Main {
    public static void main(String[] args) {

        Funciones inicio = new Funciones();
//        inicio.leerArchivo();
        ListaSimple colaImpresoras = new ListaSimple();
        inicio.menu();
//        inicio.crearGraphviz();
//        inicio.listas();

//        prueba();
    }

//    public static void prueba(){
//        ListaSimple l = new ListaSimple();
//        Cliente c0 = new Cliente(6, "6", 0, 5);
//        Cliente c1 = new Cliente(0, "1", 2, 3);
//        Cliente c2 = new Cliente(1, "2", 5, 1);
//        Cliente c3 = new Cliente(5, "1", 2, 3);
//        l.insertarFinal(c0);
//        l.insertarFinal(c1);
//        l.insertarFinal(c2);
//        l.insertarFinal(c3);
//        l.eliminarCliente(6);
//
//        Nodo aux = l.getPrimero();
//        while (aux!=null){
//            Cliente cliente = (Cliente) aux.getDato();
//            System.out.println(cliente.getId_cliente());
//            aux = aux.getSiguiente();
//        }
//    }


}
