
package Proyecto;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Modelo extends AbstractTableModel{

    private String[] columnas = {"Iteraciones","Aleatorias"};
    private ArrayList<Fila> lista;
    
    public Modelo(ArrayList<Fila>lista){
        this.lista=lista;
    }
    
    public Modelo(){
        
    }
    
    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return lista.size();
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return columnas.length;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        
        switch(columna){
            case 0:
                return this.lista.get(fila).getI();
            case 1:
                return this.lista.get(fila).getAleatorio();
            default:
                return null;
        }
    }
   
    @Override
    public String getColumnName(int i) {
        return this.columnas[i];
    }
}
