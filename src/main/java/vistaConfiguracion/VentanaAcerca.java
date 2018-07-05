
package vistaConfiguracion;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Juan Carlos
 */
public class VentanaAcerca extends JFrame{
    
    private PanelAcerca pnlAcerca;
    
    public VentanaAcerca(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        
        this.pnlAcerca = new PanelAcerca();
        this.add(this.pnlAcerca, BorderLayout.CENTER);       
        
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setTitle("Acerda de...");
        this.setLocation(50,50);
        this.setVisible(true);
        this.setResizable(false);
        pack();
        
    }
        
}



