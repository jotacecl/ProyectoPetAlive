/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaVentanaInsumos;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author HernySenpai
 */
public class PanelBotones extends JPanel {
    public JButton agregar;
    public JButton eliminar;

    public PanelBotones() {
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        FlowLayout distribucion = new FlowLayout(FlowLayout.RIGHT);
        
        this.agregar = new JButton("Agregar");
        this.add(this.agregar);
        
        this.eliminar = new JButton ("Eliminar");
        this.add(this.eliminar);
        
        this.setBackground(new java.awt.Color(134, 204, 161));
        
        this.setLayout(distribucion);
    }
}
