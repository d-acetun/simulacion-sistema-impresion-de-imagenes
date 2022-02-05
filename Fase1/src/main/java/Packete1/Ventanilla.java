package Packete1;

public class Ventanilla {
    private int numeroVentanilla;
    private ListaSimple listaImagenes;

    public Ventanilla(int numeroVentanilla) {
        this.numeroVentanilla = numeroVentanilla;
        this.listaImagenes = null;
    }
    public int getNumeroVentanilla() {
        return numeroVentanilla;
    }

    public void setNumeroVentanilla(int numeroVentanilla) {
        this.numeroVentanilla = numeroVentanilla;
    }

    public ListaSimple getListaImagenes() {
        return listaImagenes;
    }

    public void setListaImagenes(ListaSimple listaImagenes) {
        this.listaImagenes = listaImagenes;
    }


}
