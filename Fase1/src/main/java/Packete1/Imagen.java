package Packete1;

public class Imagen {
    private String tipo;
    private int idCliente;
    private int pasos;

    public Imagen(String tipo, int idCliente) {
        this.tipo = tipo;
        this.idCliente = idCliente;
        this.pasos = 0;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getPasos() {
        return pasos;
    }

    public void setPasos(int pasos) {
        this.pasos = pasos;
    }
}
