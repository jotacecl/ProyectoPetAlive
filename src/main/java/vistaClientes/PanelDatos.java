/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaClientes;

import componentes.SubPanelDatos;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.JButton;
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
    public JTextField txtNombre, txtApellidos, txtRut, txtTelefono, txtMovil, txtDireccion, txtEmail;    
    public JComboBox cbCiudad, cbRegion;
    public JButton btnAgregarC, btnAgregarR;
    public SubPanelDatos subPanel;

    public PanelDatos(String nombre, String apellidos, String rut, String direccion, String telefono, String movil,  String email) {
        iniciarComponentes(nombre, apellidos, rut, direccion, telefono, movil, email);
    }
                
    private void iniciarComponentes(String nombre, String apellidos, String rut, String direccion, String telefono, String movil,  String email){
        TitledBorder border = new TitledBorder("");       
        this.setBorder(border);
        
        Box caja = Box.createVerticalBox();        
        
        subPanel = new SubPanelDatos();
        
        JPanel pnlNombres = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtNombre = new JTextField(nombre,20);
        caja.add(this.subPanel.generarSubPanelTF(pnlNombres, labNombres, txtNombre, "Nombres   ", 134,204,161));
        
        JPanel pnlApellidos = new JPanel(new FlowLayout(FlowLayout.LEFT));       
        this.txtApellidos = new JTextField(apellidos,20);
        caja.add(this.subPanel.generarSubPanelTF(pnlApellidos, labApellidos, txtApellidos, "Apellidos   ", 134,204,161));
        
        JPanel pnlRut = new JPanel(new FlowLayout(FlowLayout.LEFT));   
        this.txtRut = new JTextField(rut,20);
        caja.add(this.subPanel.generarSubPanelTF(pnlRut, labRut, txtRut, "RUT            ", 134,204,161));
        
        JPanel pnlCiudad = new JPanel(new FlowLayout(FlowLayout.LEFT));      
        this.cbCiudad = new JComboBox();            
        this.btnAgregarC = new JButton("+");
        caja.add(this.subPanel.generarSubPanelCB(pnlCiudad, labCiudad, cbCiudad, "Ciudad       ", 134,204,161, btnAgregarC));
        
        JPanel pnlRegion = new JPanel(new FlowLayout(FlowLayout.LEFT));    
        this.cbRegion = new JComboBox();
        this.btnAgregarR = new JButton("+");
        caja.add(this.subPanel.generarSubPanelCB(pnlRegion, labRegion, cbRegion, "Región       ", 134,204,161, btnAgregarR));
        
        JPanel pnlDir = new JPanel(new FlowLayout(FlowLayout.LEFT));      
        this.txtDireccion = new JTextField(direccion,20);
        caja.add(this.subPanel.generarSubPanelTF(pnlDir, labDireccion, txtDireccion, "Dirección   ", 134,204,161));
        
        JPanel pnlTelefono = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.txtTelefono = new JTextField(telefono, 20);
        caja.add(this.subPanel.generarSubPanelTF(pnlTelefono, labTelefono, txtTelefono, "Teléfono    ", 134,204,161));
        
        JPanel pnlMovil = new JPanel(new FlowLayout(FlowLayout.LEFT));                
        this.txtMovil = new JTextField(movil,20);
        caja.add(this.subPanel.generarSubPanelTF(pnlMovil, labMovil, txtMovil, "Móvil           ", 134,204,161));
        
        JPanel pnlEmail = new JPanel(new FlowLayout(FlowLayout.LEFT));              
        this.txtEmail = new JTextField(email,20);
        caja.add(this.subPanel.generarSubPanelTF(pnlEmail, labEmail, txtEmail, "Email         ", 134,204,161));                                
        
        this.setBackground(new java.awt.Color(134, 204, 161));
        this.add(caja);
                
    }
}
