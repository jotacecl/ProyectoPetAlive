/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaPersonal;

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
public class PanelDatos extends JPanel{
    
    private JLabel labID, labNombres, labApellidos, labDireccion, labCiudad , labRegion, labTelefono, labMovil, labEmail, labCargo;
    public JTextField txtID, txtNombres, txtApellidos, txtTelefono, txtMovil, txtEmail, txtDireccion;
    public JComboBox cbCiudad, cbRegion, cbCargo;
    public SubPanelDatos subPanel;
    public JButton btnAgregarC, btnAgregarR, btnAgregarCG;
    
    public PanelDatos(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        
        TitledBorder border = new TitledBorder("");       
        this.setBorder(border);
        
        Box caja = Box.createVerticalBox();        
        
        subPanel = new SubPanelDatos();
        
        JPanel pnlID = new JPanel();                                
        caja.add(this.subPanel.generarSubPanelTF(pnlID, labID, txtID, "ID                ", 134, 204, 161));
        
        JPanel pnlNombres = new JPanel();                        
        caja.add(this.subPanel.generarSubPanelTF(pnlNombres, labNombres, txtNombres, "Nombres   ", 134, 204, 161));
        
        JPanel pnlApellidos = new JPanel();
        caja.add(this.subPanel.generarSubPanelTF(pnlApellidos, labApellidos, txtApellidos, "Apellidos   ", 134, 204, 161));
        
        JPanel pnlDireccion = new JPanel();
        caja.add(this.subPanel.generarSubPanelTF(pnlDireccion, labDireccion, txtDireccion, "Dirección   ", 134, 204, 161));
        
        JPanel pnlCiudad = new JPanel();
        this.btnAgregarC = new JButton("+");
        caja.add(this.subPanel.generarSubPanelCB(pnlCiudad, labCiudad, cbCiudad, "Ciudad      ", 134, 204, 161, btnAgregarC));
        
        JPanel pnlRegion = new JPanel();
        this.btnAgregarR = new JButton("+");
        caja.add(this.subPanel.generarSubPanelCB(pnlRegion, labRegion, cbRegion, "Región      ", 134, 204, 161, btnAgregarR));
        
        JPanel pnlTelefono = new JPanel();
        caja.add(this.subPanel.generarSubPanelTF(pnlTelefono, labTelefono, txtTelefono, "Teléfono   ", 134, 204, 161));
        
        JPanel pnlMovil = new JPanel();   
        caja.add(this.subPanel.generarSubPanelTF(pnlMovil, labMovil, txtMovil, "Móvil         ", 134, 204, 161));
        
        JPanel pnlEmail = new JPanel();
        caja.add(this.subPanel.generarSubPanelTF(pnlEmail, labEmail, txtEmail, "Email       ", 134, 204, 161));
        
        JPanel pnlCargo = new JPanel();
        this.btnAgregarCG = new JButton("+");
        caja.add(this.subPanel.generarSubPanelCB(pnlCargo, labCargo, cbCargo, "Cargo       ", 134, 204, 161, btnAgregarCG));
        
        this.setBackground(new java.awt.Color(134,204,161));
        
        this.add(caja);
    }
    
}
