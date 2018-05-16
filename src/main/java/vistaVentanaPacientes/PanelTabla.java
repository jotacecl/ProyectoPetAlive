/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaVentanaPacientes;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juan Carlos
 */
public class PanelTabla extends JPanel{        

    public JTable tabla;
    public DefaultTableModel modelo;
    private JScrollPane scroll;
    
    public PanelTabla() {
        inicializarComponente();
    }

    private void inicializarComponente() {                
        
        this.modelo = new DefaultTableModel();
        this.tabla = new JTable();        
        this.tabla.setGridColor(new java.awt.Color(227,225,143));
        this.tabla.setModel(modelo);
        this.modelo.addColumn("Paciente");
        this.modelo.addColumn("Tipo");
        this.modelo.addColumn("RUT Responsable");        
        this.scroll = new JScrollPane(tabla);
        this.add(this.scroll);
        this.setBackground(new java.awt.Color(134,204,161));
        
    }
    
}
