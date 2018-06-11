/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaClientes;

import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author HernySenpai
 */
public class PanelDatos extends JPanel {
    
    private JLabel labNombres, labApellidos, labRut, labTelefono, labMovil, labDireccion, labCiudad, labRegion, labEmail;        
    private JTextField txtNombre, txtApellidos, txtRut, txtTelefono, txtMovil, txtDireccion, txtEmail;    
    private JComboBox cbCiudad, cbRegion;

    public PanelDatos() {
        iniciarComponentes();
    }
                
    private void iniciarComponentes(){
        Box caja = Box.createVerticalBox();     
        
        TitledBorder border = new TitledBorder("");
        this.setBorder(border);
        
        JPanel pnlNombres = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.labNombres = new JLabel("Nombres   ");
        pnlNombres.add(this.labNombres);        
        this.txtNombre = new JTextField("",20);
        pnlNombres.add(this.txtNombre);
        pnlNombres.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlNombres);
        
        JPanel pnlApellidos = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.labApellidos = new JLabel("Apellidos   ");
        pnlApellidos.add(this.labApellidos);        
        this.txtApellidos = new JTextField("",20);
        pnlApellidos.add(this.txtApellidos);
        pnlApellidos.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlApellidos);
        
        JPanel pnlRut = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.labRut = new JLabel("RUT            ");
        pnlRut.add(this.labRut);        
        this.txtRut = new JTextField("",20);
        pnlRut.add(this.txtRut);
        pnlRut.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlRut);
        
        JPanel pnlCiudad = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.labCiudad = new JLabel("Ciudad       ");
        pnlCiudad.add(this.labCiudad);        
        this.cbCiudad = new JComboBox();
        this.cbCiudad.addItem(" ");
        this.cbCiudad.addItem("Añadir nuevo...");
        pnlCiudad.add(this.cbCiudad);
        pnlCiudad.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlCiudad);
        
        JPanel pnlRegion = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.labRegion = new JLabel("Región       ");
        pnlRegion.add(this.labRegion);        
        this.cbRegion = new JComboBox();
        this.cbRegion.addItem(" ");
        this.cbRegion.addItem("Añadir nuevo...");
        pnlRegion.add(this.cbRegion);
        pnlRegion.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlRegion);
        
        JPanel pnlDir = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.labDireccion = new JLabel("Dirección   ");
        pnlDir.add(this.labDireccion);        
        this.txtDireccion = new JTextField("",20);
        pnlDir.add(this.txtDireccion);
        pnlDir.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlDir);
        
        JPanel pnlTelefono = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.labTelefono = new JLabel("Teléfono    ");
        pnlTelefono.add(this.labTelefono);
        this.txtTelefono = new JTextField("", 20);
        pnlTelefono.add(this.txtTelefono);
        pnlTelefono.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlTelefono);
        
        JPanel pnlMovil = new JPanel(new FlowLayout(FlowLayout.LEFT));        
        this.labMovil = new JLabel("Móvil           ");
        pnlMovil.add(this.labMovil);        
        this.txtMovil = new JTextField("",20);
        pnlMovil.add(this.txtMovil);
        pnlMovil.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlMovil);
        
        JPanel pnlEmail = new JPanel(new FlowLayout(FlowLayout.LEFT));        
        this.labEmail = new JLabel("Email         ");
        pnlEmail.add(this.labEmail);        
        this.txtEmail = new JTextField("",20);
        pnlEmail.add(this.txtEmail);
        pnlEmail.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlEmail);
                                
        
        this.setBackground(new java.awt.Color(134, 204, 161));
        this.add(caja);
                
    }
}
