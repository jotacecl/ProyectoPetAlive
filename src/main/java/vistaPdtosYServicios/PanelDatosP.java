/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaPdtosYServicios;

import componentes.SubPanelDatos;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Juan Carlos
 */
public class PanelDatosP extends JPanel{
    
    private JLabel labID, labNombre, labTipo, labDescripcion, labStock, labPrecio;
    public JTextField txtID, txtNombre, txtDescripcion, txtStock, txtPrecio;
    public JComboBox cbTipo;
    public JButton btnAgregar;
    public SubPanelDatos subPanel;
    
    public PanelDatosP(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        
        TitledBorder border = new TitledBorder("");       
        this.setBorder(border);
        
        Box caja = Box.createVerticalBox();        
        
        subPanel = new SubPanelDatos();
        
        JPanel pnlID = new JPanel();
        caja.add(this.subPanel.generarSubPanelTF(pnlID, labID, txtID, "ID Producto  ", 134, 204, 161));
        
        JPanel pnlNombre = new JPanel();
        caja.add(this.subPanel.generarSubPanelTF(pnlNombre, labNombre, txtNombre, "Producto       ", 134, 204, 161));
        
        JPanel pnlTipo = new JPanel();
        this.btnAgregar = new JButton("+");
        caja.add(this.subPanel.generarSubPanelCB(pnlTipo, labTipo, cbTipo, "Tipo               ", 134, 204, 161, btnAgregar));
        
        JPanel pnlDescripcion = new JPanel();
        caja.add(this.subPanel.generarSubPanelTF(pnlDescripcion, labDescripcion, txtDescripcion, "Descripcion ",  134, 204, 161));
        
        JPanel pnlStock = new JPanel();
        caja.add(this.subPanel.generarSubPanelTF(pnlStock, labStock, txtStock, "Stock             ", 134, 204, 161));
        
        JPanel pnlPrecio = new JPanel();
        caja.add(this.subPanel.generarSubPanelTF(pnlPrecio, labPrecio, txtPrecio, "Precio            ", 134, 204, 161));
        
        this.setBackground(new java.awt.Color(134,204,161));
        
        this.add(caja);
        
    }
    
}
