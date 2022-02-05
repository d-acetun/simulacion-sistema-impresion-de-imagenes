package Packete1;

public class Ventanilla {
    private String numeroVentanilla;
    private ListaSimple listaImagenes;
    private boolean estaDisponible;

    public Ventanilla(String numeroVentanilla) {
        this.numeroVentanilla = numeroVentanilla;
        this.listaImagenes = null;
        this.estaDisponible = true;
    }

    public String getNumeroVentanilla() {
        return numeroVentanilla;
    }

    public void setNumeroVentanilla(String numeroVentanilla) {
        this.numeroVentanilla = numeroVentanilla;
    }

    public ListaSimple getListaImagenes() {
        return listaImagenes;
    }

    public void setListaImagenes(ListaSimple listaImagenes) {
        this.listaImagenes = listaImagenes;
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }

    public void setEstaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }
}
