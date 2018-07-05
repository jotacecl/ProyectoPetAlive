
package componentes;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Juan Carlos
 */
public class SubPanelDatos {
    
    public JPanel generarSubPanelTF(JPanel panel, JLabel label, JTextField txt, String sLabel, int R, int G, int B){
        panel = new JPanel(new FlowLayout(FlowLayout.LEFT));        
        label = new JLabel(sLabel);
        panel.add(label);                
        panel.add(txt);
        panel.setBackground(new java.awt.Color(R, G, B));    
        return panel;
    }
    
    public JPanel generarSubPanelTFP(JPanel panel, JLabel label, JTextField txt, String sLabel, int R, int G, int B){
        panel = new JPanel(new FlowLayout(FlowLayout.LEFT));        
        label = new JLabel(sLabel);
        panel.add(label);                
        panel.add(txt);
        panel.setBackground(new java.awt.Color(R, G, B));    
        return panel;
    }
    
    public JPanel generarSubPanelCB(JPanel panel, JLabel label, JComboBox cb, String sLabel, int R, int G, int B, JButton btnAgregar, JButton btnEliminar, JButton btnEditar){
        panel = new JPanel(new FlowLayout(FlowLayout.LEFT)); 
        label = new JLabel(sLabel);
        cb.addItem("    ");
        panel.add(label);
        panel.add(cb);    
        panel.add(btnAgregar);
        panel.add(btnEliminar);
        panel.add(btnEditar);
        panel.setBackground(new java.awt.Color(R, G, B)); 
        return panel;
    }
    
    public JPanel generarSubPanelRB(JPanel panel, JLabel label, JRadioButton rd, String sLabel, int R, int G, int B){
        panel = new JPanel(new FlowLayout(FlowLayout.LEFT));        
        label = new JLabel(sLabel);
        panel.add(label);        
        rd = new JRadioButton("");
        panel.add(rd);
        panel.setBackground(new java.awt.Color(R, G, B));    
        return panel;
    }
    
}
