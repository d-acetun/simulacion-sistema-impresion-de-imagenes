package Packete1;

public class ListaSimple {
    public Nodo primero;
    public Nodo ultimo;
    public int size;

    public ListaSimple() {
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }

    public void insertarInicio(Object dato){
        this.size+=1;
        if (estaVacia()){
            this.primero = this.ultimo = new Nodo(dato);
        }
        else {
            Nodo aux = this.primero;
            this.primero = new Nodo(dato);
            this.primero.setSiguiente(aux);
        }



    }

    public void insertarFinal(Object dato){
        this.size+=1;
        if(estaVacia()){
            this.primero = this.ultimo = new Nodo(dato);
        }
        else {
            Nodo aux = this.ultimo;
            this.ultimo = new Nodo(dato);
            aux.setSiguiente(this.ultimo);
        }

    }

    public void recorrer(){
        Nodo aux = this.primero;
        while (aux != null){
            System.out.print(aux.getDato()+"-->");
            aux = aux.getSiguiente();

        }

    }
    public void recorrerColaRecepcion(){
        Nodo aux = this.primero;
        while (aux != null){
            Cliente cliente = (Cliente) aux.getDato();
            System.out.println(cliente.mostrarDatos());
            aux = aux.getSiguiente();

        }
    }

    public boolean estaVacia(){
        return this.primero == null;
    }
}
