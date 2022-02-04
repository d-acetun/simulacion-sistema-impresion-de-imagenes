package Packete1;

public class Cliente {
    private String id_cliente;
    private String nombre_cliente;
    private String img_color;
    private String img_bw;

    public Cliente(String id_cliente, String nombre_cliente, String img_color, String img_bw) {
        this.id_cliente = id_cliente;
        this.nombre_cliente = nombre_cliente;
        this.img_color = img_color;
        this.img_bw = img_bw;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getImg_color() {
        return img_color;
    }

    public void setImg_color(String img_color) {
        this.img_color = img_color;
    }

    public String getImg_bw() {
        return img_bw;
    }

    public void setImg_bw(String img_bw) {
        this.img_bw = img_bw;
    }
}
