/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaVentanaPrincipal;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Juan Carlos
 */
public class PanelSuperior extends JPanel{
    
    private JLabel labTitulo;
    private String nombreVeterinaria = "VidaPet";
    
    public PanelSuperior(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        
        Font font = new Font("Eras Bold ITC", Font.PLAIN, 24);
        
        this.labTitulo = new JLabel("Veterianaria "+nombreVeterinaria);
        this.labTitulo.setFont(font);
        this.labTitulo.setForeground(new java.awt.Color(235,234,175));
        
        this.add(this.labTitulo);
        
        this.setBackground(new java.awt.Color(134,204,161));
        
    }
    
}
