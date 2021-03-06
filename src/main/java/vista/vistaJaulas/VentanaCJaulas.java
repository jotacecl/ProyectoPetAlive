
package vista.vistaJaulas;

import vista.componentes.PanelBotones;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Juan Carlos
 */
public class VentanaCJaulas extends JFrame{
    
    public PanelCJaulas pnlCJaulas;
    public PanelBotones pnlBotones;
    public PanelJaulas pnlJaulas;
    public PestagnaJaulas pJaulas;
    
    public VentanaCJaulas(String L, String M, String S){        
        this.iniciarComponentes(L, M , S);
    }
    
    private void iniciarComponentes(String L, String M, String S){
        
        this.pnlCJaulas = new PanelCJaulas(L, M ,S);
        this.add(this.pnlCJaulas, BorderLayout.CENTER);
        
        this.pnlBotones = new PanelBotones(3);
        this.add(this.pnlBotones, BorderLayout.SOUTH);
               
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setTitle("Cantidad de jaulas");
        this.setLocation(50,50);        
        this.setResizable(false);
        this.setSize(300, 220);
        
    }

    
}
