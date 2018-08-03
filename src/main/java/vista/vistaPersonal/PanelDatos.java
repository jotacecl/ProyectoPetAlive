
package vista.vistaPersonal;

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
import modelo.Personal;

/**
 *
 * @author Juan Carlos
 */
public class PanelDatos extends JPanel{
    
    private JLabel labRut;
    private JLabel labNombres;
    private JLabel labApellidos;
    private JLabel signos;
    private JLabel labDireccion;
    private JLabel labCiudad;
    private JLabel labRegion;
    private JLabel labTelefono;
    private JLabel labMovil;
    private JLabel labEmail;
    private JLabel labCargo;
    
    public JTextField  txtNombres;
    public JTextField txtApellidos;
    public JTextField txtTelefono;
    public JTextField txtMovil;
    public JTextField txtEmail;
    public JTextField txtDireccion;
    public JTextField rutParte1;
    public JTextField rutParte2;
    public JTextField rutParte3;
    public JTextField rutParte4;
    public JComboBox cbCiudad;
    public JComboBox cbRegion;
    public JComboBox cbCargo;
    public SubPanelDatos subPanel;
    public JButton btnAgregarC;
    public JButton btnAgregarR;
    public JButton btnEliminarC;
    public JButton btnEliminarR;
    public JButton btnEditarC;
    public JButton btnEditarR;
    public JButton btnAgregarCG;
    public JButton btnEliminarCG;
    public JButton btnEditarCG;
    
    public PanelDatos(Personal personal, String rutPart1,String rutPart2,String rutPart3,String rutPart4){
        this.iniciarComponentes(personal, rutPart1, rutPart2, rutPart3, rutPart4);
    }
    
    private void iniciarComponentes(Personal personal, String rutPart1,String rutPart2,String rutPart3,String rutPart4){
        
        TitledBorder border = new TitledBorder("");       
        this.setBorder(border);
        
        Box caja = Box.createVerticalBox();        
        
        subPanel = new SubPanelDatos();               
        
        if(personal!=null){
            this.txtNombres = new JTextField(personal.getNombre(),20);
            this.txtApellidos = new JTextField(personal.getApellido(),20);
            this.txtDireccion = new JTextField(personal.getDireccion(),20);
            this.txtTelefono = new JTextField(Integer.toString(personal.getTelefono()),20);
            this.txtMovil = new JTextField(Integer.toString(personal.getMovil()),20);
            this.txtEmail = new JTextField(personal.getEmail(),20);
        }else{
            this.txtNombres = new JTextField("",20);
            this.txtApellidos = new JTextField("",20);
            this.txtDireccion = new JTextField("",20);
            this.txtTelefono = new JTextField("",20);
            this.txtMovil = new JTextField("",20);
            this.txtEmail = new JTextField("",20);
        }
        
        JPanel pnlNombres = new JPanel();         
        caja.add(this.subPanel.generarSubPanelTF(pnlNombres, labNombres, txtNombres, "Nombres   ", 134, 204, 161));                
        
        JPanel pnlApellidos = new JPanel();        
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
        caja.add(this.subPanel.generarSubPanelTF(pnlDireccion, labDireccion, txtDireccion, "Dirección   ", 134, 204, 161));
        
        JPanel pnlCiudad = new JPanel();
        this.btnAgregarC = new JButton("+");
        this.btnEliminarC = new JButton("-");
        this.btnEditarC = new JButton("edit");
        this.cbCiudad = new JComboBox();
        caja.add(this.subPanel.generarSubPanelCB(pnlCiudad, labCiudad, cbCiudad, "Ciudad      ", 134, 204, 161, btnAgregarC, btnEliminarC, btnEditarC));
        
        JPanel pnlRegion = new JPanel();
        this.btnAgregarR = new JButton("+");
        this.btnEliminarR = new JButton("-");
        this.btnEditarR = new JButton("edit");
        this.cbRegion = new JComboBox();
        caja.add(this.subPanel.generarSubPanelCB(pnlRegion, labRegion, cbRegion, "Región      ", 134, 204, 161, btnAgregarR, btnEliminarR, btnEditarR));
        
        JPanel pnlTelefono = new JPanel();        
        caja.add(this.subPanel.generarSubPanelTF(pnlTelefono, labTelefono, txtTelefono, "Teléfono   ", 134, 204, 161));
        
        JPanel pnlMovil = new JPanel();           
        caja.add(this.subPanel.generarSubPanelTF(pnlMovil, labMovil, txtMovil, "Móvil          ", 134, 204, 161));
        
        JPanel pnlEmail = new JPanel();        
        caja.add(this.subPanel.generarSubPanelTF(pnlEmail, labEmail, txtEmail, "Email        ", 134, 204, 161));
        
        JPanel pnlCargo = new JPanel();
        this.btnAgregarCG = new JButton("+");
        this.btnEliminarCG = new JButton("-");
        this.btnEditarCG = new JButton("edit");
        this.cbCargo = new JComboBox();
        caja.add(this.subPanel.generarSubPanelCB(pnlCargo, labCargo, cbCargo, "Cargo       ", 134, 204, 161, btnAgregarCG, btnEliminarCG, btnEditarCG));
        
        this.setBackground(new java.awt.Color(134,204,161));
        
        this.add(caja);
    }
    
}
