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
public class PestDatosResponsable extends JTabbedPane {
    private PestDatosRespnPanelSup panelSup;
    private PestDatosRespnPanelInf panelInf;
    
    private void inicializarComponentes(){
        this.panelSup = new PestDatosRespnPanelSup();
        this.add(panelSup, BorderLayout.NORTH);
        
        this.panelInf = new PestDatosRespnPanelInf();
        this.add(this.panelInf, BorderLayout.SOUTH);
        
        this.setName("Datos paciente");
    }
    
    public PestDatosResponsable(){
        inicializarComponentes();
    }
}
