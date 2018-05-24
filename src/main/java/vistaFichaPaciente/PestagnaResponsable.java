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
public class PestagnaResponsable extends JPanel{
    private PnlDatosResp panelSup;
    public PnlBotonesResp panelInf;
    
    private void iniciarComponentes(){
        Box caja = Box.createVerticalBox();
        
        this.panelSup = new PnlDatosResp();
        caja.add(panelSup);
        
        this.panelInf = new PnlBotonesResp();
        caja.add(this.panelInf);
        
        this.add(caja);
        
        this.setBackground(new java.awt.Color(134, 204, 161));
        this.setName("Datos responsable");
    }
    
    public PestagnaResponsable(){
        iniciarComponentes();
    }
}
