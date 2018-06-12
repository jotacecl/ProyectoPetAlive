/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaJaulas;

import componentes.SubPanelDatos;
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
    
    private JLabel labCL, labCM, labCS;
    public JTextField txtCL, txtCM, txtCS;
    public SubPanelDatos subPanel;
    
    public PanelCJaulas(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        
        TitledBorder border = new TitledBorder("");       
        this.setBorder(border);
        
        Box caja = Box.createVerticalBox();
        
        this.subPanel = new SubPanelDatos();
        
        JPanel pnlCS = new JPanel();
        caja.add(subPanel.generarSubPanelTFP(pnlCS, labCS, txtCS, "Jaulas S(Pequeñas) ", 134, 204, 161));
        
        JPanel pnlCM = new JPanel();
        caja.add(subPanel.generarSubPanelTFP(pnlCM, labCM, txtCM, "Jaulas M(Medias)      ", 134, 204, 161));
        
        JPanel pnlCL = new JPanel();
        caja.add(subPanel.generarSubPanelTFP(pnlCL, labCL, txtCL, "Jaulas L(Grandes)    ", 134, 204, 161));
        
        this.setBackground(new java.awt.Color(134, 204, 161));
        this.add(caja);
        
    }
    
}
