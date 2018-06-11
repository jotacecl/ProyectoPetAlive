/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaJaulas;

import componentes.PanelBotones;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Juan Carlos
 */
public class PestagnaJaulas extends JPanel{
    
    public PanelJaulas pJaulas;
    public PanelBotones pBotones;
    
    public PestagnaJaulas(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        this.setLayout(new BorderLayout());
        this.setName("Jaulas");
        
        this.pJaulas = new PanelJaulas();
        this.add(this.pJaulas, BorderLayout.CENTER);
    }
    
}
