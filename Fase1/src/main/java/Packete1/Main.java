package Packete1;
public class Main {
    public static void main(String[] args) {

        Funciones inicio = new Funciones();
//        inicio.leerArchivo();
        inicio.menu();
//        inicio.crearGraphviz();
//        inicio.listas();

//        prueba();
    }

    public static void prueba(){
        ListaSimple l1 = new ListaSimple();
        ListaSimple l2 = new ListaSimple();
        ListaSimple l3 = new ListaSimple();
        ListaSimple l4 = new ListaSimple();
        ListaSimple l = new ListaSimple();
        Cliente c0 = new Cliente(6, "6", 0, 5, 0, 5);
        Cliente c1 = new Cliente(0, "1", 2, 3, 2, 3);
        Cliente c2 = new Cliente(1, "2", 5, 1, 5, 1);
        Cliente c3 = new Cliente(5, "1", 2, 3,2, 3);
        l1.insertarFinal(c0);
        l2.insertarFinal(c1);
        l3.insertarFinal(c2);
        l4.insertarFinal(c3);

        l.insertarFinal(l1);
        l.insertarFinal(l2);
        l.insertarFinal(l3);
//        l.insertarFinal(l4);
        l.eliminarEspera(c1);
        l.insertarFinal(l4);
        l.eliminarEspera(c0);
        l.insertarFinal(l1);
        l.eliminarEspera(c2);
        Nodo aux = l.getPrimero();
        while (aux!=null){
            ListaSimple jj = (ListaSimple) aux.getDato();
            Cliente cliente = (Cliente) jj.getPrimero().getDato();
            System.out.println(cliente.getId_cliente());
            aux = aux.getSiguiente();
        }
    }


}
