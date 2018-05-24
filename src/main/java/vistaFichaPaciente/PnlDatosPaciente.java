/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaFichaPaciente;

import java.awt.FlowLayout;
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
public class PnlDatosPaciente extends JPanel{
    private JLabel labPaciente, labRaza, labEspecie, labFechaNac, labSexo, labInternado, labJaula;    
    private JTextField txtPaciente, txtEspecie, txtRaza, txtFechaNacimiento, txtJaula;
    private JComboBox cbTipo;    
    private JRadioButton rbMacho, rbHembra;    
    private JRadioButton rbSi, rbNo; 
    
    private void iniciarComponentes(){
        Box caja = Box.createVerticalBox();
        
        TitledBorder border = new TitledBorder("");       
        this.setBorder(border);
        
        JPanel pnlPac = new JPanel(new FlowLayout());
        this.labPaciente = new JLabel("Nombre paciente");
        pnlPac.add(this.labPaciente);
        this.txtPaciente = new JTextField("", 20);
        pnlPac.add(this.txtPaciente);
        pnlPac.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlPac);
        
        JPanel pnlEspe = new JPanel(new FlowLayout());
        this.labEspecie = new JLabel("Especie                  ");
        pnlEspe.add(this.labEspecie); 
        this.cbTipo = new JComboBox();        
        this.cbTipo.addItem("Canis");
        this.cbTipo.addItem("Felido");
        this.cbTipo.addItem("Otro");
        pnlEspe.add(cbTipo);
        this.txtEspecie = new JTextField("",14);
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
        pnlFecha.add(this.txtFechaNacimiento);
        pnlFecha.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlFecha);
        
        JPanel pnlSexo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.labSexo = new JLabel("Genero    ");
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

    public PnlDatosPaciente() {
        iniciarComponentes();
    }
    
}
