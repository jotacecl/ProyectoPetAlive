
package vista.vistaHorario;

import vista.componentes.PanelBotones;
import java.awt.BorderLayout;
import javax.swing.JFrame;
/**
 *
 * @author Juan Carlos
 */
public class VentanaHorario extends JFrame{
    
    public PanelHorario pnlHorario;
    public PanelBotones pnlBotones;
       
    public VentanaHorario(String hLV1, String mLV1, String hLV2,String mLV2, String hSD1, String mSD1, String hSD2,String mSD2){
        this.iniciarComponentes(hLV1,mLV1,hLV2,mLV2, hSD1,mSD1,hSD2,mSD2);
    }
    
    private void iniciarComponentes(String hLV1, String mLV1, String hLV2,String mLV2, String hSD1, String mSD1, String hSD2,String mSD2){
        
        this.pnlHorario = new PanelHorario(hLV1,mLV1,hLV2,mLV2, hSD1,mSD1,hSD2,mSD2);
        this.add(this.pnlHorario, BorderLayout.CENTER);
        
        this.pnlBotones = new PanelBotones(2);
        this.add(this.pnlBotones, BorderLayout.SOUTH);
        
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setTitle("Horario de atencion");
        this.setLocation(50,50);
        this.setResizable(false);
        pack();
        
    }
    
}
