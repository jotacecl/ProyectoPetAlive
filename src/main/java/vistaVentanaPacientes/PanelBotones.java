/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaVentanaPacientes;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Juan Carlos
 */
public class PanelBotones extends JPanel{
    
    public JButton btnEliminar, btnAbrir, btnAnnadir;
    
    public PanelBotones(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        this.btnAbrir = new JButton("Abrir");
        this.add(this.btnAbrir);
        
        this.btnAnnadir = new JButton("Añadir");
        this.add(this.btnAnnadir);
        
        this.btnEliminar = new JButton("Eliminar");
        this.add(this.btnEliminar);
        
        this.setBackground(new java.awt.Color(134,204,161));
    }
    
}
