package Packete1;

public class Nodo {
    private Object dato;
    private Nodo siguiente;
    private Nodo siguienteAbajo;
//    private int posicion;

    public Nodo(Object dato) {
        this.dato = dato;
        this.siguiente = null;
        this.siguienteAbajo = null;
//        this.posicion = posicion;

    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getSiguienteAbajo() {
        return siguienteAbajo;
    }

    public void setSiguienteAbajo(Nodo siguienteAbajo) {
        this.siguienteAbajo = siguienteAbajo;
    }
//
//    public int getPosicion() {
//        return posicion;
//    }
//
//    public void setPosicion(int posicion) {
//        this.posicion = posicion;
//    }
}
