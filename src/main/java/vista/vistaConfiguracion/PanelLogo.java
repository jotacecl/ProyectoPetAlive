
package vista.vistaConfiguracion;

import java.awt.Font;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Juan Carlos
 */
public class PanelLogo extends JPanel{
    public JLabel logoApp;
    public JLabel nombreApp;
    public JLabel versionApp;
    public JLabel infoExtra;
    
    public PanelLogo(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        Font font = new Font("Arial", Font.CENTER_BASELINE, 30);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        this.logoApp = new JLabel();
        this.logoApp.setIcon(new ImageIcon("data/icon/LogoPetAlive.png"));        
        
        this.nombreApp = new JLabel("         PetAlive");
        this.nombreApp.setFont(font);       
        
        this.versionApp = new JLabel("                                    Ver. 1.0");
        this.infoExtra = new JLabel("                               Proyecto PetAlive");
        
        this.add(this.logoApp);        
        this.add(this.nombreApp);
        this.add(this.versionApp);
        this.add(Box.createVerticalGlue());
        this.add(this.infoExtra);
        
        this.infoExtra = new JLabel("                                    2018-2019");
        this.add(this.infoExtra);
    }
    
}
