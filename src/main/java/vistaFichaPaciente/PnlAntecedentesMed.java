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
import javax.swing.border.TitledBorder;

/**
 *
 * @author HernySenpai
 */
public class PnlAntecedentesMed extends JPanel {
    private JLabel antecedentesMedicos;
    private TextArea ingAntecedentesMedicos;
    
    private void iniciarComponentes(){
        Box caja = Box.createVerticalBox(); 
        FlowLayout distribucion = new FlowLayout(FlowLayout.LEFT);
        
        TitledBorder border = new TitledBorder("");        
        this.setBorder(border);
        
        JPanel pnlLabAnt = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.antecedentesMedicos = new JLabel("Antecedentes Medicos");
        pnlLabAnt.add(this.antecedentesMedicos);
        pnlLabAnt.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlLabAnt);
        
        this.ingAntecedentesMedicos = new TextArea(6,45);
        caja.add(this.ingAntecedentesMedicos);        
        
        this.add(caja);
        this.setBackground(new java.awt.Color(134, 204, 161));
        this.setLayout(distribucion);
    }

    public PnlAntecedentesMed() {
        this.iniciarComponentes();
    }
    
}
