/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaDetalleInsumos;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HernySenpai
 */
public class PanelTablaDetalleIns extends JPanel {
    
    public JTable tabla;
    public DefaultTableModel modelo;
    private JScrollPane scroll;
    public PanelTablaDetalleIns() {
        inicializarComponente();
    }

    private void inicializarComponente() {
        this.modelo = new DefaultTableModel();
        this.tabla = new JTable();
        this.tabla.setModel(modelo);
        this.modelo.addColumn("Nombre");
        this.modelo.addColumn("Cantidad");
        this.modelo.addColumn("Costo");
        this.scroll = new JScrollPane(tabla);
        this.add(this.scroll);
    }
    
}
