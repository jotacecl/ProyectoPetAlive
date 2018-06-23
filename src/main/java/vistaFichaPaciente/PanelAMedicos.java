/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaFichaPaciente;

import java.awt.FlowLayout;
import java.awt.TextArea;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

/**
 *
 * @author HernySenpai
 */
public class PanelAMedicos extends JPanel {
    
    private JLabel antecedentesMedicos;
    public JTextArea ingAntecedentesMedicos;
    public JScrollPane scroll;
    
    private void iniciarComponentes(String antMed){
        
        Box caja = Box.createVerticalBox(); 
        FlowLayout distribucion = new FlowLayout(FlowLayout.LEFT);
        
        TitledBorder border = new TitledBorder("");        
        this.setBorder(border);
        
        JPanel pnlLabAnt = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.antecedentesMedicos = new JLabel("Antecedentes Medicos");
        pnlLabAnt.add(this.antecedentesMedicos);
        pnlLabAnt.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlLabAnt);
        
        this.ingAntecedentesMedicos = new JTextArea(10,35);
        this.ingAntecedentesMedicos.setText(antMed);
        this.scroll = new JScrollPane(ingAntecedentesMedicos);
        caja.add(this.scroll);        
        
        this.add(caja);
        this.setBackground(new java.awt.Color(134, 204, 161));
        this.setLayout(distribucion);
        
    }

    public PanelAMedicos(String antMed) {
        this.iniciarComponentes(antMed);
    }
    
}
