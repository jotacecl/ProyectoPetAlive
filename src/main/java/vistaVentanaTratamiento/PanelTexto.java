/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaVentanaTratamiento;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Juan Carlos
 */
public class PanelTexto extends JPanel{
    
    private JTextArea areaTexto;
    private JLabel labTrat;
    
    public PanelTexto(){
        this.inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        
        this.labTrat = new JLabel("Tratamiento ");
        this.add(this.labTrat);
        
        this.areaTexto = new JTextArea("");
        this.add(this.areaTexto);
        
        this.setBackground(new java.awt.Color(134,204,161));
    }
    
}
