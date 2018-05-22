/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaFichaPaciente;

import java.awt.GridLayout;
import java.awt.TextArea;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author HernySenpai
 */
public class PestPacPanelCen extends JPanel {
    private JLabel antecedentesMedicos;
    private TextArea ingAntecedentesMedicos;
    
    private void inicializarComponentes(){
        GridLayout distribucion = new GridLayout(2,1);
        
        this.antecedentesMedicos = new JLabel("Antecedentes Medicos");
        this.add(this.antecedentesMedicos);
        
        this.ingAntecedentesMedicos = new TextArea(6,1);
        this.add(this.ingAntecedentesMedicos);
        
        this.setLayout(distribucion);
    }

    public PestPacPanelCen() {
        this.inicializarComponentes();
    }
    
}
