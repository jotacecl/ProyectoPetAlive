/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaVentanaTratamiento;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Juan Carlos
 */
public class PanelBotones extends JPanel{
    
    public JButton btnGuardar;
    
    public PanelBotones(){
        this.inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        FlowLayout distribucion = new FlowLayout(FlowLayout.RIGHT);
        this.setLayout(distribucion);
        
        this.btnGuardar = new JButton("Guardar");
        this.add(this.btnGuardar);
        
        this.setBackground(new java.awt.Color(134,204,161));
        
    }
    
}
