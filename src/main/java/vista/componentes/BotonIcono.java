
package vista.componentes;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Juan Carlos
 */
public class BotonIcono extends JButton{
    
    private final String dir1; 
    private final String name;
    private final String dir2;
    
    public BotonIcono(String name, String dir1, String dir2){
        this.name = name;
        this.dir1 = dir1;
        this.dir2 = dir2;
        this.configurarBoton();
    }
    
    private void configurarBoton(){
        Font font = new Font("Arial", Font.PLAIN, 20);
        this.setText(name);
        this.setFont(font);
        this.setOpaque(true);        
        this.setBorder(null); 
        this.setBorderPainted(false);
        this.setContentAreaFilled(false);
        this.setPressedIcon(new ImageIcon(dir1));
        this.setIcon(new ImageIcon(dir1));
        this.setRolloverIcon(new ImageIcon(dir2));
    }
    
}
