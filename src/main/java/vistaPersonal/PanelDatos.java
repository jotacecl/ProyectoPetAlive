/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaPersonal;

import componentes.SubPanelDatos;
import java.awt.Color;
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
 * @author Juan Carlos
 */
public class PanelDatos extends JPanel{
    
    private JLabel labRut, labNombres, labApellidos, labDireccion, labCiudad , labRegion, labTelefono, labMovil, labEmail, labCargo;
    private JLabel signos;
    public JTextField  txtNombres, txtApellidos, txtTelefono, txtMovil, txtEmail, txtDireccion;
    public JTextField rutParte1, rutParte2, rutParte3, rutParte4;
    public JComboBox cbCiudad, cbRegion, cbCargo;
    public SubPanelDatos subPanel;
    public JButton btnAgregarC, btnAgregarR, btnAgregarCG;
    
    public PanelDatos(String nombre, String apellidos, String rutPart1,String rutPart2,String rutPart3,String rutPart4, String direccion, String telefono, String movil,  String email){
        this.iniciarComponentes(nombre, apellidos, rutPart1, rutPart2, rutPart3, rutPart4, direccion, telefono, movil, email);
    }
    
    private void iniciarComponentes(String nombre, String apellidos, String rutPart1,String rutPart2,String rutPart3,String rutPart4, String direccion, String telefono, String movil,  String email){
        
        TitledBorder border = new TitledBorder("");       
        this.setBorder(border);
        
        Box caja = Box.createVerticalBox();        
        
        subPanel = new SubPanelDatos();               
        
        JPanel pnlNombres = new JPanel(); 
        this.txtNombres = new JTextField(nombre,20);
        caja.add(this.subPanel.generarSubPanelTF(pnlNombres, labNombres, txtNombres, "Nombres   ", 134, 204, 161));                
        
        JPanel pnlApellidos = new JPanel();
        this.txtApellidos = new JTextField(apellidos,20);
        caja.add(this.subPanel.generarSubPanelTF(pnlApellidos, labApellidos, txtApellidos, "Apellidos   ", 134, 204, 161));
        
        JPanel pnlRut = new JPanel(new FlowLayout(FlowLayout.LEFT));   
        this.labRut = new JLabel("RUT            ");
        this.rutParte1 = new JTextField(rutPart1,2);              
        this.rutParte2 = new JTextField(rutPart2,2);     
        this.rutParte3 = new JTextField(rutPart3,2);    
        this.rutParte4 = new JTextField(rutPart4,2);
        pnlRut.add(this.labRut);
        pnlRut.add(this.rutParte1);
        this.signos = new JLabel(".");  
        pnlRut.add(this.signos);
        pnlRut.add(this.rutParte2);
        this.signos = new JLabel(".");
        pnlRut.add(this.signos);
        pnlRut.add(this.rutParte3);
        this.signos = new JLabel("-");
        pnlRut.add(this.signos);
        pnlRut.add(this.rutParte4);
        pnlRut.setBackground(new Color(134,204,161));
        caja.add(pnlRut);  
        
        JPanel pnlDireccion = new JPanel();
        this.txtDireccion = new JTextField(direccion,20);
        caja.add(this.subPanel.generarSubPanelTF(pnlDireccion, labDireccion, txtDireccion, "Dirección   ", 134, 204, 161));
        
        JPanel pnlCiudad = new JPanel();
        this.btnAgregarC = new JButton("+");
        this.cbCiudad = new JComboBox();
        caja.add(this.subPanel.generarSubPanelCB(pnlCiudad, labCiudad, cbCiudad, "Ciudad      ", 134, 204, 161, btnAgregarC));
        
        JPanel pnlRegion = new JPanel();
        this.btnAgregarR = new JButton("+");
        this.cbRegion = new JComboBox();
        caja.add(this.subPanel.generarSubPanelCB(pnlRegion, labRegion, cbRegion, "Región      ", 134, 204, 161, btnAgregarR));
        
        JPanel pnlTelefono = new JPanel();
        this.txtTelefono = new JTextField(telefono,20);
        caja.add(this.subPanel.generarSubPanelTF(pnlTelefono, labTelefono, txtTelefono, "Teléfono   ", 134, 204, 161));
        
        JPanel pnlMovil = new JPanel();   
        this.txtMovil = new JTextField(movil,20);
        caja.add(this.subPanel.generarSubPanelTF(pnlMovil, labMovil, txtMovil, "Móvil          ", 134, 204, 161));
        
        JPanel pnlEmail = new JPanel();
        this.txtEmail = new JTextField(email,20);
        caja.add(this.subPanel.generarSubPanelTF(pnlEmail, labEmail, txtEmail, "Email        ", 134, 204, 161));
        
        JPanel pnlCargo = new JPanel();
        this.btnAgregarCG = new JButton("+");
        this.cbCargo = new JComboBox();
        caja.add(this.subPanel.generarSubPanelCB(pnlCargo, labCargo, cbCargo, "Cargo       ", 134, 204, 161, btnAgregarCG));
        
        this.setBackground(new java.awt.Color(134,204,161));
        
        this.add(caja);
    }
    
}
