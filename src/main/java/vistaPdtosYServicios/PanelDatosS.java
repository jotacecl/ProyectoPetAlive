/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaPdtosYServicios;

import componentes.SubPanelDatos;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Juan Carlos
 */
public class PanelDatosS extends JPanel{
    
    private JLabel labNombre, labDescripcion, labPrecio;
    public JTextField txtNombre, txtDescripcion, txtPrecio;
    public SubPanelDatos subPanel;
    
    public PanelDatosS(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        
        TitledBorder border = new TitledBorder("");       
        this.setBorder(border);
        
        Box caja = Box.createVerticalBox();        
        
        subPanel = new SubPanelDatos();
        
        JPanel pnlNombre = new JPanel();
        caja.add(this.subPanel.generarSubPanelTF(pnlNombre, labNombre, txtNombre, "Servicio         ", 134, 204, 161));
        
        JPanel pnlDescripcion = new JPanel();
        caja.add(this.subPanel.generarSubPanelTF(pnlDescripcion, labDescripcion, txtDescripcion, "Descripción ", 134, 204, 161));
        
        JPanel pnlPrecion = new JPanel();
        caja.add(this.subPanel.generarSubPanelTF(pnlDescripcion, labPrecio, txtPrecio, "Precio           ", 134, 204, 161));
        
        this.setBackground(new java.awt.Color(134,204,161));
        this.add(caja);
        
    }
    
}
