
package vista.vistaJaulas;

import vista.componentes.SubPanelDatos;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Juan Carlos
 */
public class PanelCJaulas extends JPanel{
    
    private JLabel labCL; 
    private JLabel labCM;
    private JLabel labCS;
    public JTextField txtCM;
    public JTextField txtCL;
    public JTextField txtCS;
    public SubPanelDatos subPanel;
    
    public PanelCJaulas(String L, String M, String S){
        this.iniciarComponentes(L, M, S);
    }
    
    private void iniciarComponentes(String L, String M, String S){
        
        TitledBorder border = new TitledBorder("");       
        this.setBorder(border);
        
        Box caja = Box.createVerticalBox();
        
        this.subPanel = new SubPanelDatos();
        
        JPanel pnlCS = new JPanel();
        this.txtCS = new JTextField(S,3);
        caja.add(subPanel.generarSubPanelTFP(pnlCS, labCS, txtCS, "Jaulas S(Pequeñas) ", 134, 204, 161));
        
        JPanel pnlCM = new JPanel();
        this.txtCM = new JTextField(M,3);
        caja.add(subPanel.generarSubPanelTFP(pnlCM, labCM, txtCM, "Jaulas M(Medias)      ", 134, 204, 161));
        
        JPanel pnlCL = new JPanel();
        this.txtCL = new JTextField(L,3);
        caja.add(subPanel.generarSubPanelTFP(pnlCL, labCL, txtCL, "Jaulas L(Grandes)    ", 134, 204, 161));        
        
        this.setBackground(new java.awt.Color(134, 204, 161));
        this.add(caja);
        
    }
        
    
}
