
package vista.vistaJaulas;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Juan Carlos
 */
public class Jaula extends JButton{
    
    private boolean ocupada;
    private final String dir1 = "data/icon/MiddleCage.png";
    private final String dir2 = "data/icon/MiddleCage2.png";
    private final String imgOcupada = "data/icon/MiddleCageOcupada.png";   
    
    public Jaula(){
        Font font = new Font("Arial", Font.PLAIN, 20);        
        this.setFont(font);
        this.setOpaque(true);        
        this.setBorder(null); 
        this.setBorderPainted(false);
        this.setContentAreaFilled(false);        
        this.pintar();
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocuapada) {
        this.ocupada = ocuapada;
    }
    
    public void pintar(){
        if(this.isOcupada()==true){
            this.setPressedIcon(new ImageIcon(imgOcupada));
            this.setIcon(new ImageIcon(imgOcupada));
            this.setRolloverIcon(new ImageIcon(imgOcupada));  
        }else if(this.isOcupada()==false){
            this.setPressedIcon(new ImageIcon(dir1));
            this.setIcon(new ImageIcon(dir1));
            this.setRolloverIcon(new ImageIcon(dir2));
        }
    }
    
}
