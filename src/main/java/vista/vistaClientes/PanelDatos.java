
package vista.vistaClientes;

import vista.componentes.SubPanelDatos;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import modelo.Cliente;

/**
 *
 * @author HernySenpai
 */
public class PanelDatos extends JPanel {
    
    private JLabel labNombres, labApellidos, labRut, labTelefono, labMovil, labDireccion, labCiudad, labRegion, labEmail;  
    private JLabel signos;
    public JTextField txtNombre, txtApellidos, txtTelefono, txtMovil, txtDireccion, txtEmail;  
    public JTextField rutParte1, rutParte2, rutParte3, rutParte4;
    public JComboBox cbCiudad, cbRegion;
    public JButton btnAgregarC, btnAgregarR, btnEliminarC, btnEliminarR, btnEditarC, btnEditarR;
    public SubPanelDatos subPanel;    

    public PanelDatos(Cliente c, String rutPart1,String rutPart2,String rutPart3,String rutPart4) {
        iniciarComponentes(c, rutPart1, rutPart2, rutPart3, rutPart4);
    }
                
    private void iniciarComponentes(Cliente c, String rutPart1,String rutPart2,String rutPart3,String rutPart4){
        TitledBorder border = new TitledBorder("");       
        this.setBorder(border);
        
        Box caja = Box.createVerticalBox();        
        
        subPanel = new SubPanelDatos();
        
        if(c != null){
            this.txtNombre = new JTextField(c.getNombre(),20);
            this.txtApellidos = new JTextField(c.getApellido(),20);
            this.txtDireccion = new JTextField(c.getDireccion(),20);
            this.txtTelefono = new JTextField(Integer.toString(c.getTelefono()), 20);
            this.txtMovil = new JTextField(Integer.toString(c.getMovil()),20);
            this.txtEmail = new JTextField(c.getEmail(),20);
        }else{
            this.txtNombre = new JTextField("",20);
            this.txtApellidos = new JTextField("",20);
            this.txtDireccion = new JTextField("",20);
            this.txtTelefono = new JTextField("", 20);
            this.txtMovil = new JTextField("",20);
            this.txtEmail = new JTextField("",20);
        }
        
        JPanel pnlNombres = new JPanel(new FlowLayout(FlowLayout.LEFT));        
        caja.add(this.subPanel.generarSubPanelTF(pnlNombres, labNombres, txtNombre, "Nombres   ", 134,204,161));
        
        JPanel pnlApellidos = new JPanel(new FlowLayout(FlowLayout.LEFT));               
        caja.add(this.subPanel.generarSubPanelTF(pnlApellidos, labApellidos, txtApellidos, "Apellidos   ", 134,204,161));
        
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
        
        JPanel pnlCiudad = new JPanel(new FlowLayout(FlowLayout.LEFT));      
        this.cbCiudad = new JComboBox();            
        this.btnAgregarC = new JButton("+");
        this.btnEliminarC = new JButton("-");
        this.btnEditarC = new JButton("edit");
        caja.add(this.subPanel.generarSubPanelCB(pnlCiudad, labCiudad, cbCiudad, "Ciudad       ", 134,204,161, btnAgregarC, btnEliminarC, btnEditarC));
        
        JPanel pnlRegion = new JPanel(new FlowLayout(FlowLayout.LEFT));    
        this.cbRegion = new JComboBox();
        this.btnAgregarR = new JButton("+");
        this.btnEliminarR = new JButton("-");
        this.btnEditarR = new JButton("edit");
        caja.add(this.subPanel.generarSubPanelCB(pnlRegion, labRegion, cbRegion, "Región       ", 134,204,161, btnAgregarR, btnEliminarR, btnEditarR));
        
        JPanel pnlDir = new JPanel(new FlowLayout(FlowLayout.LEFT));              
        caja.add(this.subPanel.generarSubPanelTF(pnlDir, labDireccion, txtDireccion, "Dirección   ", 134,204,161));
        
        JPanel pnlTelefono = new JPanel(new FlowLayout(FlowLayout.LEFT));        
        caja.add(this.subPanel.generarSubPanelTF(pnlTelefono, labTelefono, txtTelefono, "Teléfono    ", 134,204,161));
        
        JPanel pnlMovil = new JPanel(new FlowLayout(FlowLayout.LEFT));                        
        caja.add(this.subPanel.generarSubPanelTF(pnlMovil, labMovil, txtMovil, "Móvil           ", 134,204,161));
        
        JPanel pnlEmail = new JPanel(new FlowLayout(FlowLayout.LEFT));                      
        caja.add(this.subPanel.generarSubPanelTF(pnlEmail, labEmail, txtEmail, "Email         ", 134,204,161));                                
        
        this.setBackground(new java.awt.Color(134, 204, 161));
        this.add(caja);
                
    }
}
