/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
        txt = new JTextField("",20);
        panel.add(txt);
        panel.setBackground(new java.awt.Color(R, G, B));    
        return panel;
    }
    
    public JPanel generarSubPanelCB(JPanel panel, JLabel label, JComboBox cb, String sLabel, int R, int G, int B){
        panel = new JPanel(new FlowLayout(FlowLayout.LEFT)); 
        label = new JLabel(sLabel);
        cb = new JComboBox();
        cb.addItem("");
        cb.addItem("Añadir nuevo...");
        panel.add(label);
        panel.add(cb);    
        panel.setBackground(new java.awt.Color(R, G, B)); 
        return panel;
    }
    
}
