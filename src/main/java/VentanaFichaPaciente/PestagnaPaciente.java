/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanaFichaPaciente;

import java.awt.BorderLayout;
import javax.swing.JTabbedPane;

/**
 *
 * @author HernySenpai
 */
public class PestagnaPaciente extends JTabbedPane {
    private PestPacPanelSup panelSup;
    
    private void inicializarComponentes(){
        this.panelSup = new PestPacPanelSup();
        this.add(panelSup, BorderLayout.NORTH);
    }

    public PestagnaPaciente() {
       inicializarComponentes();
    }
    
    
}
