package Packete1;

public class Imagen {
    private String tipo;
    private int idCliente;

    public Imagen(String tipo, int idCliente) {
        this.tipo = tipo;
        this.idCliente = idCliente;
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
}
