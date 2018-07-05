
package vistaConfiguracion;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Juan Carlos
 */
public class PanelAcerca extends JPanel{
    
    private JLabel texto;
    
    public PanelAcerca(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
                
        TitledBorder border = new TitledBorder("");       
        this.setBorder(border);
        
        Box caja = Box.createVerticalBox();
        
        this.texto = new JLabel("                                       Proyecto PetAlive");
        caja.add(this.texto);
        
        this.texto = new JLabel(" ");
        caja.add(this.texto);
        
        this.texto = new JLabel("Una aplicacion diseñada para la organizacion de tu veterinaria.");
        caja.add(this.texto);
         
        
        this.setBackground(new java.awt.Color(134, 204, 161));
        this.add(caja);
        
    }
    
}
;