/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaVentanaPrincipal;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Juan Carlos
 */
public class PanelLateral extends JPanel{
    
    private PanelBuscador pBus;
    private PanelOpciones pOpc;
    
    public PanelLateral(){
        this.inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        
        Box caja = Box.createVerticalBox();
        TitledBorder border = new TitledBorder("");  
        
        this.pBus = new PanelBuscador();
        caja.add(this.pBus, BorderLayout.NORTH);
        
        JPanel panelVacio = new JPanel();
        caja.add(panelVacio, BorderLayout.CENTER);
                
        this.pOpc = new PanelOpciones();
        caja.add(this.pOpc, BorderLayout.SOUTH);
        
        this.add(caja);
        
        
    }
    
}
