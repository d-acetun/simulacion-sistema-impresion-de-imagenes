package Packete1;

public class Nodo {
    private Object dato;
    private Nodo siguiente;
    private Nodo siguienteAbajo;

    public Nodo(Object dato) {
        this.dato = dato;
        this.siguiente = null;
        this.siguienteAbajo = null;

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
}
