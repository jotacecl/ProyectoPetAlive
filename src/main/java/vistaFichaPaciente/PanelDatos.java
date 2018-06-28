/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaFichaPaciente;

import com.toedter.calendar.JDateChooser;
import componentes.BotonIcono;
import componentes.SubPanelDatos;
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
    
    private JLabel labPaciente, labRaza,labColor, labEspecie, labFechaNac, labSexo, labInternado, labJaula, labCliente;    
    public JTextField txtPaciente,txtColor, txtRaza, txtFechaNacimiento, txtCliente;
    public JComboBox cbTipo, cbTJaula, cbNJaula;    
    public JRadioButton rbMacho, rbHembra;    
    public JRadioButton rbSi, rbNo; 
    public ButtonGroup grupoRB,grupoRB2;
    public JDateChooser calendario;
    public BotonIcono btnBusqueda;
    public JButton btnAgregar;
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
        caja.add(this.subPanel.generarSubPanelCB(pnlEspe, labEspecie, cbTipo, "Especie                  ", 134,204,161, btnAgregar));
        
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
        JPanel subPanel = new JPanel();
        subPanel.setPreferredSize(new Dimension(226,25));
        subPanel.setLayout(new GridLayout(1,1));
        subPanel.add(this.calendario);
        
        String fechaSeleccionada = String.format(FORMATO, this.calendario.getDate());
        this.txtFechaNacimiento.setText(fechaSeleccionada);
        
        pnlFecha.add(subPanel);
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
