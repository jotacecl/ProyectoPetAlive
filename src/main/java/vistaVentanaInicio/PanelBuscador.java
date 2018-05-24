/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaVentanaInicio;

import java.awt.GridLayout;
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
public class PanelBuscador extends JPanel{
    
    private JLabel labNombre, labTipo, labRutDuenno;
    private JTextField txtNombre, txtRutDuenno; 
    private JComboBox cbTipo;
    public JButton btnBuscar;
    
    public PanelBuscador(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        
        TitledBorder border = new TitledBorder(" Busqueda Avanzada ");
        border.setTitleColor(new java.awt.Color(54,82,48));
        this.setBorder(border);
        
        GridLayout distribucion = new GridLayout(4,2);
        this.setLayout(distribucion);
        
        this.labNombre = new JLabel("Nombre paciente");
        this.txtNombre = new JTextField("");
        this.add(this.labNombre);
        this.add(this.txtNombre);
        
        this.labTipo = new JLabel("Tipo de Animal");
        this.cbTipo = new JComboBox();
        this.cbTipo.addItem("Canis");
        this.cbTipo.addItem("Felis");
        this.cbTipo.addItem("Otro");
        this.add(this.labTipo);
        this.add(this.cbTipo);
        
        this.labRutDuenno = new JLabel("RUT Dueño");
        this.txtRutDuenno = new JTextField("");
        this.add(this.labRutDuenno);
        this.add(this.txtRutDuenno);                
        
        this.labNombre = new JLabel("");
        this.add(this.labNombre);
        
        this.btnBuscar = new JButton("Buscar");
        this.add(this.btnBuscar);
        
        this.setBackground(new java.awt.Color(134, 204, 161));
        
    }
    
}
