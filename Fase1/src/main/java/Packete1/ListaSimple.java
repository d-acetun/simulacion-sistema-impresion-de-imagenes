package Packete1;

public class ListaSimple {
    private Nodo primero;
    private Nodo ultimo;
    private Nodo primeroAbajo;
    private Nodo ultimoAbajo;
    private int size;
    private int sizeAbajo;

    public ListaSimple() {
        this.primero = null;
        this.ultimo = null;
        this.primeroAbajo = null;
        this.ultimoAbajo = null;
        this.sizeAbajo = 0;
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
    public void insertarInicioAbajo(Object dato){
        this.sizeAbajo+=1;
        if (estaVaciaAbajo()){
            this.primeroAbajo = this.ultimoAbajo = new Nodo(dato);
        }
        else {
            Nodo aux = this.primeroAbajo;
            this.primeroAbajo = new Nodo(dato);
            this.primeroAbajo.setSiguienteAbajo(aux);
        }

    }
    public void insertarFinalAbajo(Object dato){
        this.sizeAbajo+=1;
        if(estaVaciaAbajo()){
            this.primeroAbajo = this.ultimoAbajo = new Nodo(dato);
        }
        else {
            Nodo aux = this.ultimoAbajo;
            this.ultimoAbajo = new Nodo(dato);
            aux.setSiguienteAbajo(this.ultimoAbajo);
        }

    }

    public void recorrer(){
        Nodo aux = this.primero;
        while (aux != null){
            System.out.print(aux.getDato()+"-->");
            aux = aux.getSiguiente();

        }

    }

    public void recorrerAbajo(){
        Nodo aux = this.primeroAbajo;
        while (aux!=null){
            System.out.println(aux.getDato()+"-->");
            aux = aux.getSiguienteAbajo();
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

    public boolean estaVaciaAbajo(){
        return this.primeroAbajo == null;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Nodo getPrimeroAbajo() {
        return primeroAbajo;
    }

    public void setPrimeroAbajo(Nodo primeroAbajo) {
        this.primeroAbajo = primeroAbajo;
    }

    public Nodo getUltimoAbajo() {
        return ultimoAbajo;
    }

    public void setUltimoAbajo(Nodo ultimoAbajo) {
        this.ultimoAbajo = ultimoAbajo;
    }

    public int getSizeAbajo() {
        return sizeAbajo;
    }

    public void setSizeAbajo(int sizeAbajo) {
        this.sizeAbajo = sizeAbajo;
    }
}


