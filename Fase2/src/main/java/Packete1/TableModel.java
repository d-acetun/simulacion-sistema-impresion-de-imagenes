package Packete1;
import javax.naming.ldap.ManageReferralControl;
// import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class TableModel {

    public DefaultTableModel mostrar(){

        String[] columns = {"id", "nombre", "apellido"};
        String[] rows = new String[3];
        DefaultTableModel model = new DefaultTableModel(null, columns);

        for(int i=0; i<Main.datos.size(); i++){
            rows[0] = (String) Main.datos.get(i).get(0);
            rows[1] = (String) Main.datos.get(i).get(1);
            rows[2] = (String) Main.datos.get(i).get(2);
            model.addRow(rows);
        }
        return model;

    }

    public DefaultTableModel buscar(String texto){

        String[] columns = {"id", "nombre", "apellido"};
        String[] rows = new String[3];
        DefaultTableModel model = new DefaultTableModel(null, columns);

        for(int i=0; i<Main.datos.size(); i++){
        
            // Check with string ignore case
            String dato = (String) Main.datos.get(i).get(0);
            boolean containsStr = dato.contains(texto.toLowerCase());
            if(containsStr){
            rows[0] = (String) Main.datos.get(i).get(0);
            rows[1] = (String) Main.datos.get(i).get(1);
            rows[2] = (String) Main.datos.get(i).get(2);
            model.addRow(rows);
            }
            
        }
        return model;

    }
    
}
