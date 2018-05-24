/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaFichaPaciente;

import javax.swing.Box;
import javax.swing.JPanel;

/**
 *
 * @author HernySenpai
 */
public class PestagnaPaciente extends JPanel {
    private PnlDatosPaciente panelSup;
    private PnlAntecedentesMed panelCen;
    PnlBotonesPac panelInf;
    
    private void iniciarComponentes(){
        Box caja = Box.createVerticalBox();
        
        this.panelSup = new PnlDatosPaciente();
        caja.add(panelSup);
        
        this.panelCen = new PnlAntecedentesMed();
        caja.add(this.panelCen);
        
        this.panelInf = new PnlBotonesPac();
        caja.add(this.panelInf);
        
        this.add(caja);
        this.setBackground(new java.awt.Color(134, 204, 161));
        this.setName("Datos paciente");
    }

    public PestagnaPaciente() {
       iniciarComponentes();
    }
    
    
}
