/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaJaulas;

import componentes.PanelBotones;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Juan Carlos
 */
public class VentanaCJaulas extends JFrame{
    
    public PanelCJaulas pnlCJaulas;
    public PanelBotones pnlBotones;
    
    public VentanaCJaulas(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        
        this.pnlCJaulas = new PanelCJaulas();
        this.add(this.pnlCJaulas, BorderLayout.CENTER);
        
        this.pnlBotones = new PanelBotones(3);
        this.add(this.pnlBotones, BorderLayout.SOUTH);
        
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setTitle("Cantidad de jaulas");
        this.setLocation(50,50);
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(300, 220);
        
    }
    
}
