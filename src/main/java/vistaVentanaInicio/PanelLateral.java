/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaVentanaInicio;

import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Juan Carlos
 */
public class PanelLateral extends JPanel{
    
    public PanelBuscador pBus;
    public PanelOpciones pOpc;
    
    public PanelLateral(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
                       
        Box caja = Box.createHorizontalBox();
        TitledBorder border = new TitledBorder("");  
        
        this.pOpc = new PanelOpciones();
        caja.add(this.pOpc);
        
        this.pBus = new PanelBuscador();
        caja.add(this.pBus);
                                                
        this.add(caja);
        
        this.setBackground(new java.awt.Color(134,204,161));
        
        
    }
    
}
