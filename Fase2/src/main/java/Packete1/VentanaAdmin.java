package Packete1;

import java.util.ArrayList;

import javax.swing.*;

public class VentanaAdmin extends JFrame{
    private JTextField jTextField = new JTextField();
    public VentanaAdmin() {
        //Propiedades generales de la ventana
        this.setSize(1200, 850);
        this.setLocationRelativeTo(null);
        this.setTitle("ADMIN");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
   }

   public void crearJtextfield(){
        // short posx=400;
        // short posy=200;
        // short sizeX = 200;
        // short sizeY=35;
        this.jTextField = new JTextField();
        this.jTextField.setBounds(300, 200, 200, 30);
        this.add(this.jTextField);
   }
    public void crearTabla(){
        for(int i=0; i<10; i++){
            ArrayList<String> datos2 = new ArrayList<String>();
            datos2.add("DATO "+i);
            datos2.add("des1 ");
            datos2.add("des2 ");
            Main.datos.add(datos2);

        }
        String[] columnas = {"C1", "C2", "C3"};
        Object[][] filas = new Object[Main.datos.size()][columnas.length];

        for(int i=0; i<Main.datos.size(); i++){
            filas[i][0] = Main.datos.get(i).get(0);
            filas[i][1] = Main.datos.get(i).get(1);
            filas[i][2] = Main.datos.get(i).get(2);

        }
        JTable table = new JTable(filas, columnas) {
            //Esro es para que no se puedan editar las celdas
            public boolean editCellAt(int row, int column, java.util.EventObject e) {
               return false;
            }
         };

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(300, 500, 700, 100);
        this.add(scrollPane);


    }
    
}
