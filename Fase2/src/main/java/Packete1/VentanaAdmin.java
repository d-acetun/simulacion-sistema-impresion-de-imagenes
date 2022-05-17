package Packete1;

import java.util.ArrayList;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class VentanaAdmin extends JFrame implements KeyListener{
    private JTextField jTextField = new JTextField();
    private JTable table = new JTable();
         
    public VentanaAdmin() {
        //Propiedades generales de la ventana
        this.setSize(1200, 850);
        this.setLocationRelativeTo(null);
        this.setTitle("ADMIN");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(300, 500, 700, 100);
        this.add(scrollPane);
   }

   public void crearJtextfield(){
        // short posx=400;
        // short posy=200;
        // short sizeX = 200;
        // short sizeY=35;
        this.jTextField = new JTextField();
        this.jTextField.setBounds(300, 200, 200, 30);
        this.jTextField.addKeyListener(this);
        this.add(this.jTextField);
   }
    public void crearTabla(){
        
        TableModel modelo = new TableModel();
        this.table.setModel(modelo.mostrar());
        


    }

    public void buscar(){
        TableModel modelo = new TableModel();
        this.table.setModel(modelo.mostrar());
    }


    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        // System.out.println(this.jTextField.getText()+" funciona");
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // System.out.println(this.jTextField.getText()+" funciona");
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        TableModel modelo = new TableModel();
        this.table.setModel(modelo.buscar(this.jTextField.getText()));

        
    }
    
}
