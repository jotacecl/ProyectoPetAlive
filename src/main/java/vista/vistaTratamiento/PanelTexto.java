
package vista.vistaTratamiento;

import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Juan Carlos
 */
public class PanelTexto extends JPanel{
    
    public JTextArea areaTexto;
    private JLabel labTrat;
    
    public PanelTexto(String tratamiento){
        this.iniciarComponentes(tratamiento);
    }
    
    private void iniciarComponentes(String tratamiento){
        Box caja = Box.createVerticalBox();
        
        TitledBorder border = new TitledBorder("");       
        this.setBorder(border);
        
        JPanel pnlLabTrat = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.labTrat = new JLabel("Tratamiento ");
        pnlLabTrat.add(this.labTrat);
        pnlLabTrat.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlLabTrat);
        
        JPanel pnlArea = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.areaTexto = new JTextArea(20,45);
        this.areaTexto.setText(tratamiento);
        pnlArea.add(this.areaTexto);
        pnlArea.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlArea);
        
        this.add(caja);
        this.setBackground(new java.awt.Color(134,204,161));
    }
    
}
