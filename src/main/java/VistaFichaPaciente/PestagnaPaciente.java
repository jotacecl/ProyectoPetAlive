/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaFichaPaciente;

import java.awt.BorderLayout;
import javax.swing.JTabbedPane;

/**
 *
 * @author HernySenpai
 */
public class PestagnaPaciente extends JTabbedPane {
    private PestPacPanelSup panelSup;
    private PestPacPanelCen panelCen;
    private PestPacPanelInf panelInf;
    
    private void inicializarComponentes(){
        this.panelSup = new PestPacPanelSup();
        this.add(panelSup, BorderLayout.NORTH);
        
        this.panelCen = new PestPacPanelCen();
        this.add(this.panelCen, BorderLayout.CENTER);
        
        this.panelInf = new PestPacPanelInf();
        this.add(this.panelInf, BorderLayout.SOUTH);
        
        this.setName("Datos paciente");
    }

    public PestagnaPaciente() {
       inicializarComponentes();
    }
    
    
}
