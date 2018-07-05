
package vistaHorario;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Juan Carlos
 */
public class PanelHorario extends JPanel{
    
    private JLabel labLV, labSD;
    public JTextField txtLV1, txtLV2, txtLV3, txtLV4, txtSD1, txtSD2, txtSD3, txtSD4;    
    
    public PanelHorario(String hLV1, String mLV1, String hLV2,String mLV2, String hSD1, String mSD1, String hSD2,String mSD2){
        this.iniciarComponentes(hLV1,mLV1,hLV2,mLV2, hSD1,mSD1,hSD2,mSD2);
    }
    
    private void iniciarComponentes(String hLV1, String mLV1, String hLV2,String mLV2, String hSD1, String mSD1, String hSD2,String mSD2){
        
        TitledBorder border = new TitledBorder("");       
        this.setBorder(border);
        
        Box caja = Box.createVerticalBox();  
        
        JPanel pnlLV1 = new JPanel();
        this.labLV = new JLabel("Lunes a Viernes: ");
        pnlLV1.add(this.labLV);
        pnlLV1.setBackground(new java.awt.Color(134, 204, 161));
        
        caja.add(pnlLV1);
        
        JPanel pnlLV2 = new JPanel();
        this.labLV = new JLabel("Desde ");
        this.txtLV1 = new JTextField(hLV1,2);
        pnlLV2.add(this.labLV);
        pnlLV2.add(this.txtLV1);
        this.labLV = new JLabel(":");
        this.txtLV2 = new JTextField(mLV1,2);
        pnlLV2.add(this.labLV);
        pnlLV2.add(this.txtLV2);
        this.labLV = new JLabel(" hasta ");
        this.txtLV3 = new JTextField(hLV2,2);
        pnlLV2.add(this.labLV);
        pnlLV2.add(this.txtLV3);
        this.labLV = new JLabel(":");
        this.txtLV4 = new JTextField(mLV2,2);
        pnlLV2.add(this.labLV);
        pnlLV2.add(this.txtLV4);
        pnlLV2.setBackground(new java.awt.Color(134, 204, 161));
        
        caja.add(pnlLV2);
        
        JPanel pnlSD1 = new JPanel();
        this.labSD = new JLabel("Sabado y Domingo: ");
        pnlSD1.add(this.labSD);
        pnlSD1.setBackground(new java.awt.Color(134, 204, 161));
        
        caja.add(pnlSD1);
        
        JPanel pnlSD2 = new JPanel();
        this.labSD = new JLabel("Desde ");
        this.txtSD1 = new JTextField(hSD1,2);
        pnlSD2.add(this.labSD);
        pnlSD2.add(this.txtSD1);
        this.labSD = new JLabel(":");
        this.txtSD2 = new JTextField(mSD1,2);
        pnlSD2.add(this.labSD);
        pnlSD2.add(this.txtSD2);
        this.labSD = new JLabel(" hasta ");
        this.txtSD3 = new JTextField(hSD2,2);
        pnlSD2.add(this.labSD);
        pnlSD2.add(this.txtSD3);
        this.labSD = new JLabel(":");
        this.txtSD4 = new JTextField(mSD2,2);
        pnlSD2.add(this.labSD);
        pnlSD2.add(this.txtSD4);
        pnlSD2.setBackground(new java.awt.Color(134, 204, 161));
        
        caja.add(pnlSD2);
        
        this.setBackground(new java.awt.Color(134, 204, 161));
        this.add(caja);
                
    }
    
}
