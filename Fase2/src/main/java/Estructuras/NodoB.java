package Estructuras;

class NodoB{
    int dato;
    NodoB izquierdo, derecho;

    public NodoB(int dato){
        this.dato=dato;
        this.izquierdo=this.derecho=null;
    }

    public String toString(){
        return "Dato "+this.dato;
    }

}
