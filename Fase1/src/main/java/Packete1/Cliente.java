package Packete1;

public class Cliente {
    private int id_cliente;
    private String nombre_cliente;
    private int img_color;
    private int img_bw;
    private int imgColorConstante;
    private int imgBNConstante;
    public Cliente(int id_cliente, String nombre_cliente, int img_color, int img_bw, int imgColorConstante, int imgBNConstante) {
        this.id_cliente = id_cliente;
        this.nombre_cliente = nombre_cliente;
        this.img_color = img_color;
        this.img_bw = img_bw;
        this.imgColorConstante = imgColorConstante;
        this.imgBNConstante = imgBNConstante;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public int getImg_color() {
        return img_color;
    }

    public void setImg_color(int img_color) {
        this.img_color = img_color;
    }

    public int getImg_bw() {
        return img_bw;
    }

    public void setImg_bw(int img_bw) {
        this.img_bw = img_bw;
    }

    public int getImgColorConstante() {
        return imgColorConstante;
    }

    public void setImgColorConstante(int imgColorConstante) {
        this.imgColorConstante = imgColorConstante;
    }

    public int getImgBNConstante() {
        return imgBNConstante;
    }

    public void setImgBNConstante(int imgBNConstante) {
        this.imgBNConstante = imgBNConstante;
    }

    public String mostrarDatos(){
        return String.format("id: %d nombre: %s imgColor: %d imgBw:%d", this.id_cliente, this.nombre_cliente,
                this.img_color, this.img_bw);
    }
}
