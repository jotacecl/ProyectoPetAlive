
package vista.componentes;

import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juan Carlos
 */
public class PanelTabla extends JPanel{        

    public JTable tabla;
    public DefaultTableModel modelo;
    private JScrollPane scroll;
    int fila;
    
    public PanelTabla(String nameTable) {
        iniciarComponentes(nameTable);
    }

    private void iniciarComponentes(String nameTable) { 
        
        TitledBorder border = new TitledBorder(nameTable);
        border.setTitleColor(new java.awt.Color(54,82,48));
        this.setBorder(border);
        
        this.modelo = new DefaultTableModel(){
            public boolean isCellEditable(int rowIndex,int columnIndex){return false;}
        };
        
        this.tabla = new JTable();            
        
        this.tabla.setGridColor(new java.awt.Color(227,225,143));
        this.tabla.setModel(modelo);              
        this.scroll = new JScrollPane(tabla);
        Dimension dimVentana = new Dimension(1050,500);
        this.scroll.setPreferredSize(dimVentana);
        this.add(this.scroll);
        this.setBackground(new java.awt.Color(134,204,161));
        
    }
    
    public void addColumn(String nameColumn){
        
        this.modelo.addColumn(nameColumn);
        
    }    
    
}
