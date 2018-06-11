/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaFichaPaciente;

import com.toedter.calendar.JDateChooser;
import componentes.BotonIcono;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.Box;
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
    
    private JLabel labPaciente, labRaza, labEspecie, labFechaNac, labSexo, labInternado, labJaula, labCliente;    
    private JTextField txtPaciente, txtEspecie, txtRaza, txtFechaNacimiento, txtJaula, txtCliente;
    private JComboBox cbTipo;    
    private JRadioButton rbMacho, rbHembra;    
    private JRadioButton rbSi, rbNo; 
    public JDateChooser calendario;
    public BotonIcono btnBusqueda;
    private static final String FORMATO = "%1$td-%1$tm-%1$tY";
    
    private void iniciarComponentes(){
        Box caja = Box.createVerticalBox();
        
        calendario = new JDateChooser();
        
        TitledBorder border = new TitledBorder("");       
        this.setBorder(border);
        
        JPanel pnlPac = new JPanel(new FlowLayout());
        this.labPaciente = new JLabel("Nombre paciente ");
        pnlPac.add(this.labPaciente);
        this.txtPaciente = new JTextField("", 20);
        pnlPac.add(this.txtPaciente);
        pnlPac.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlPac);
        
        JPanel pnlEspe = new JPanel(new FlowLayout());
        this.labEspecie = new JLabel("Especie                  ");
        pnlEspe.add(this.labEspecie); 
        this.cbTipo = new JComboBox();        
        this.cbTipo.addItem("Cánido");
        this.cbTipo.addItem("Félido");
        this.cbTipo.addItem("Otro");
        pnlEspe.add(cbTipo);
        this.txtEspecie = new JTextField("",13);
        pnlEspe.add(this.txtEspecie);
        pnlEspe.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlEspe);
        
        JPanel pnlRaza = new JPanel(new FlowLayout());
        this.labRaza = new JLabel("Raza                        ");
        pnlRaza.add(this.labRaza);
        this.txtRaza = new JTextField("",20);
        pnlRaza.add(this.txtRaza);
        pnlRaza.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlRaza);
        
        JPanel pnlFecha = new JPanel(new FlowLayout());
        this.labFechaNac = new JLabel("Fecha Nac.             ");
        pnlFecha.add(this.labFechaNac);
        this.txtFechaNacimiento = new JTextField("",20);
        JPanel subPanel = new JPanel();
        subPanel.setPreferredSize(new Dimension(226,25));
        subPanel.setLayout(new GridLayout(1,1));
        subPanel.add(this.calendario);
        pnlFecha.add(subPanel);
        pnlFecha.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlFecha);
        
        JPanel pnlCliente = new JPanel(new FlowLayout());
        this.labCliente = new JLabel("RUT Cliente            ");
        pnlCliente.add(this.labCliente);
        this.txtCliente = new JTextField("",17);
        pnlCliente.add(this.txtCliente);
        this.txtCliente.setEditable(false);
        this.btnBusqueda = new BotonIcono("","data/icon/search.png","data/icon/search.png");
        pnlCliente.add(this.btnBusqueda);
        pnlCliente.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlCliente);
        
        JPanel pnlSexo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.labSexo = new JLabel("Sexo        ");
        pnlSexo.add(this.labSexo);
        this.rbMacho = new JRadioButton("Macho");
        pnlSexo.add(this.rbMacho);
        this.rbHembra = new JRadioButton("Hembra");
        pnlSexo.add(this.rbHembra);
        pnlSexo.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlSexo);
        
        JPanel pnlInternado = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.labInternado = new JLabel("Internado");
        pnlInternado.add(this.labInternado);
        this.rbSi = new JRadioButton("SI");
        pnlInternado.add(this.rbSi);
        this.rbNo = new JRadioButton("NO");
        pnlInternado.add(this.rbNo);
        this.labJaula = new JLabel("Jaula");
        pnlInternado.add(this.labJaula);
        this.txtJaula = new JTextField("", 2);
        pnlInternado.add(this.txtJaula);
        pnlInternado.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlInternado);
        
        this.setBackground(new java.awt.Color(134, 204, 161));
        this.add(caja);        
    }

    public PanelDatos() {
        iniciarComponentes();
    }
    
}
