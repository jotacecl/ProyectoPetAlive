
package vista.vistaFichaPaciente;

import com.toedter.calendar.JDateChooser;
import vista.componentes.BotonIcono;
import vista.componentes.SubPanelDatos;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author HernySenpai
 */
public class PanelDatos extends JPanel{
    
    private JLabel labCliente;
    private JLabel labInternado;
    private JLabel labPaciente;
    private JLabel labJaula;
    
    private JLabel labRaza;
    private JLabel labColor;
    private JLabel labEspecie;
    private JLabel labSexo;
    private JLabel labFechaNac;
    public JTextField txtFechaNacimiento;
    public JTextField txtPaciente;
    public JTextField txtRaza;
    public JTextField txtColor;
    public JTextField txtCliente;
    
    public JComboBox cbNJaula;    
    public JComboBox cbTipo;
    public JComboBox cbTJaula;
    public JRadioButton rbHembra;    
    public JRadioButton rbMacho;
    public JRadioButton rbNo;
    public JRadioButton rbSi;
    public ButtonGroup grupoRB2;
    public ButtonGroup grupoRB;
    public JDateChooser calendario;
    public BotonIcono btnBusqueda;
    public JButton btnAgregar;
    public JButton btnEliminar;
    public JButton btnEditar;
    public static final String FORMATO = "%1$td-%1$tm-%1$tY";
    public SubPanelDatos subPanel;
    
    private void iniciarComponentes(String nombrePaciente, String raza, String color, String fNac, String rut, String tamannoJaula, String nroJaula, boolean jaulaEnable){
        TitledBorder border = new TitledBorder("");       
        this.setBorder(border);
        
        Box caja = Box.createVerticalBox();        
        
        subPanel = new SubPanelDatos();
        
        calendario = new JDateChooser();               
        
        JPanel pnlPac = new JPanel(new FlowLayout());        
        this.txtPaciente = new JTextField(nombrePaciente, 20);        
        caja.add(this.subPanel.generarSubPanelTF(pnlPac, labPaciente, txtPaciente, "Nombre paciente ", 134,204,161));
        
        JPanel pnlEspe = new JPanel(new FlowLayout());        
        this.cbTipo = new JComboBox();      
        this.btnAgregar = new JButton("+");
        this.btnEliminar = new JButton("-");
        this.btnEditar = new JButton("edit");
        caja.add(this.subPanel.generarSubPanelCB(pnlEspe, labEspecie, cbTipo, "Especie                  ", 134,204,161, btnAgregar, btnEliminar, btnEditar));
        
        JPanel pnlRaza = new JPanel(new FlowLayout());
        this.txtRaza = new JTextField(raza,20);
        caja.add(this.subPanel.generarSubPanelTF(pnlRaza, labRaza, txtRaza, "Raza                        ", 134,204,161));
        
        JPanel pnlColor = new JPanel(new FlowLayout());
        this.txtColor = new JTextField(color, 20);
        caja.add(this.subPanel.generarSubPanelTF(pnlColor, labColor, txtColor, "Color                       ", 134,204,161));
        
        JPanel pnlFecha = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.labFechaNac = new JLabel("Fecha Nac.             ");
        pnlFecha.add(this.labFechaNac);
        this.txtFechaNacimiento = new JTextField(fNac,20);
        JPanel sPanel = new JPanel();
        sPanel.setPreferredSize(new Dimension(226,25));
        sPanel.setLayout(new GridLayout(1,1));
        sPanel.add(this.calendario);
        
        String fechaSeleccionada = String.format(FORMATO, this.calendario.getDate());
        this.txtFechaNacimiento.setText(fechaSeleccionada);
        
        pnlFecha.add(sPanel);
        pnlFecha.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlFecha);
        
        JPanel pnlCliente = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.labCliente = new JLabel("RUT Cliente            ");
        pnlCliente.add(this.labCliente);
        this.txtCliente = new JTextField(rut,17);
        pnlCliente.add(this.txtCliente);
        this.txtCliente.setEditable(false);
        this.btnBusqueda = new BotonIcono("","data/icon/search.png","data/icon/search.png");
        pnlCliente.add(this.btnBusqueda);
        pnlCliente.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlCliente);
        
        JPanel pnlSexo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.labSexo = new JLabel("Sexo        ");
        pnlSexo.add(this.labSexo);
        this.grupoRB = new ButtonGroup();
        this.rbMacho = new JRadioButton("Macho");
        grupoRB.add(this.rbMacho);
        this.rbHembra = new JRadioButton("Hembra");
        grupoRB.add(this.rbHembra);
        pnlSexo.add(this.rbMacho);
        pnlSexo.add(this.rbHembra);        
        pnlSexo.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlSexo);
        
        JPanel pnlInternado = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.labInternado = new JLabel("Internado");
        pnlInternado.add(this.labInternado);
        this.grupoRB2 = new ButtonGroup();
        this.rbSi = new JRadioButton("SI");
        grupoRB2.add(this.rbSi);
        this.rbNo = new JRadioButton("NO");
        grupoRB2.add(this.rbNo);
        pnlInternado.add(this.rbSi);
        pnlInternado.add(this.rbNo);
        this.labJaula = new JLabel(" || Tamaño Jaula");
        pnlInternado.add(this.labJaula);
        this.cbTJaula = new JComboBox();
        this.cbTJaula.addItem("S");
        this.cbTJaula.addItem("M");
        this.cbTJaula.addItem("L");
        this.cbTJaula.setEnabled(jaulaEnable);
        pnlInternado.add(this.cbTJaula);
        this.labJaula = new JLabel("Nro Jaula");
        pnlInternado.add(this.labJaula);
        this.cbNJaula = new JComboBox();
        this.cbNJaula.setEnabled(jaulaEnable);
        pnlInternado.add(this.cbNJaula);
        pnlInternado.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlInternado);
        
        this.setBackground(new java.awt.Color(134, 204, 161));
        this.add(caja);        
    }

    public PanelDatos(String nombrePaciente, String raza, String color, String fNac, String rut, String tamannoJaula, String nroJaula, boolean jaulaEnable) {
        iniciarComponentes(nombrePaciente, raza, color, fNac, rut, tamannoJaula, nroJaula , jaulaEnable);
    }
    
}
