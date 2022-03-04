package Packete1;
// import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class TableModel {

    public DefaultTableModel mostrar(){

        String[] columns = {"id", "nombre"};
        String[] rows = new String[3];
        DefaultTableModel model = new DefaultTableModel(null, columns);

        for(int i=0; i<Main.datos.size(); i++){
            // rows[0] = Main.datos.get(i).get(0);
        }
        return model;

    }
    
}
