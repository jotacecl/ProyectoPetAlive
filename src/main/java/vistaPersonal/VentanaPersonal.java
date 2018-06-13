/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaPersonal;

import componentes.PanelBotones;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Juan Carlos
 */
public class VentanaPersonal extends JFrame implements ActionListener{
    
    public PanelDatos pnlDatos;
    public PanelBotones pnlBotones;    
    
    public VentanaPersonal(int btnSeleccionado){
        this.iniciarComponentes(btnSeleccionado);
    }
    
    private void iniciarComponentes(int btnSeleccionado){
        
        this.pnlDatos = new PanelDatos();
        this.add(this.pnlDatos, BorderLayout.CENTER);
        
        this.pnlBotones = new PanelBotones(btnSeleccionado);
        this.add(this.pnlBotones, BorderLayout.SOUTH);
        
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setTitle("Personal de la veterinaria");
        this.setLocation(50,50);
        this.setVisible(true);
        this.setResizable(false);
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
