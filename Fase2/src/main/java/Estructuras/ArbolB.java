package Estructuras;

public class ArbolB {
    NodoB raiz;

    public ArbolB() {
        this.raiz = null;
    }

    public void insertar(int dato){
        System.out.println("Entra");
        raiz=insertarNodo(raiz,dato);
    }

    private NodoB insertarNodo(NodoB raiz, int dato){

        if (raiz==null){
            System.out.println("null");
            raiz=new NodoB(dato);
        }
        else if(dato < raiz.dato){
            System.out.println(raiz.dato);
            raiz.izquierdo=insertarNodo(raiz.izquierdo,dato);
            System.out.println("sigue");
        }
        else if(dato > raiz.dato){
            System.out.println(raiz.dato);
            raiz.derecho=insertarNodo(raiz.derecho,dato);
        }
    System.out.println("retorna "+raiz.dato);
    return raiz;

    }

    public void preOrden(){
        preOrden(this.raiz);
    }
    private void preOrden(NodoB raiz){
        if(raiz!=null){
            System.out.print(raiz.dato+", ");
            preOrden(raiz.izquierdo);
            preOrden(raiz.derecho);
        }
    }
    
}
