
package vistaDatosClinica;

import componentes.SubPanelDatos;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Juan Carlos
 */
public class PanelDatos extends JPanel{
    
    private JLabel labNombreS, labNombreF, labDireccion, labCiudad,labRegion, labTelefono, labEmail, labWeb;
    public JTextField txtNombreS, txtNombreF, txtDireccion, txtCiudad, txtRegion, txtTelefono, txtEmail, txtWeb;
    public SubPanelDatos subPanel;
    
    public PanelDatos(String nombreS, String nombreF, String direccion, String ciudad, String region, String telefono, String email, String web){
        this.iniciarComponentes(nombreS, nombreF, direccion, ciudad, region, telefono, email, web);
    }
    
    private void iniciarComponentes(String nombreS, String nombreF, String direccion, String ciudad, String region, String telefono, String email, String web){       
        
        TitledBorder border = new TitledBorder("");       
        this.setBorder(border);
        
        Box caja = Box.createVerticalBox();        
        
        subPanel = new SubPanelDatos();
        
        JPanel pnlNombreS = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.labNombreS = new JLabel("Nombre o Razón Social");
        pnlNombreS.add(this.labNombreS);
        pnlNombreS.setBackground(new java.awt.Color(134,204,161));
        caja.add(pnlNombreS);
        
        JPanel pnlNombreS2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.txtNombreS = new JTextField(nombreS,25);
        pnlNombreS2.add(this.txtNombreS);
        pnlNombreS2.setBackground(new java.awt.Color(134,204,161));
        caja.add(pnlNombreS2);
        
        
        JPanel pnlNombreF = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.labNombreF = new JLabel("Nombre fantasia (Ejemplo: Veterinario PetAlive)");
        pnlNombreF.add(this.labNombreF);
        pnlNombreF.setBackground(new java.awt.Color(134,204,161));
        caja.add(pnlNombreF);
        
        JPanel pnlNombreF2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.txtNombreF = new JTextField(nombreF,25);
        pnlNombreF2.add(this.txtNombreF);
        pnlNombreF2.setBackground(new java.awt.Color(134,204,161));
        caja.add(pnlNombreF2);
        
        JPanel pnlDireccion = new JPanel();
        txtDireccion = new JTextField(direccion,20);
        caja.add(this.subPanel.generarSubPanelTF(pnlDireccion, labDireccion, txtDireccion, "Direccion ", 134, 204, 161));
        
        JPanel pnlCiudad = new JPanel();
        txtCiudad = new JTextField(ciudad,20);
        caja.add(this.subPanel.generarSubPanelTF(pnlCiudad, labCiudad, txtCiudad, "Ciudad    ",  134, 204, 161));
        
        JPanel pnlRegion = new JPanel();
        txtRegion = new JTextField(region,20);
        caja.add(this.subPanel.generarSubPanelTF(pnlRegion, labRegion, txtRegion, "Region    ", 134, 204, 161));
        
        JPanel pnlTelefono = new JPanel();
        txtTelefono = new JTextField(telefono,20);
        caja.add(this.subPanel.generarSubPanelTF(pnlTelefono, labTelefono, txtTelefono, "Teléfono  ", 134, 204, 161));
        
        JPanel pnlEmail = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.labEmail = new JLabel("Email");
        pnlEmail.add(this.labEmail);
        pnlEmail.setBackground(new java.awt.Color(134,204,161));
        caja.add(pnlEmail);
        
        JPanel pnlEmail2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.txtEmail = new JTextField(email,25);
        pnlEmail2.add(this.txtEmail);
        pnlEmail2.setBackground(new java.awt.Color(134,204,161));
        caja.add(pnlEmail2);
        
        JPanel pnlWeb = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.labWeb = new JLabel("Sitio web");
        pnlWeb.add(this.labWeb);
        pnlWeb.setBackground(new java.awt.Color(134,204,161));
        caja.add(pnlWeb);
        
        JPanel pnlWeb2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.txtWeb = new JTextField(web,25);
        pnlWeb2.add(this.txtWeb);
        pnlWeb2.setBackground(new java.awt.Color(134,204,161));
        caja.add(pnlWeb2);
        
        this.setBackground(new java.awt.Color(134,204,161));
        
        this.add(caja);
        
    }
    
}
