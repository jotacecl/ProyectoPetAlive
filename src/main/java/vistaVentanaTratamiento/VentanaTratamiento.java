/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaVentanaTratamiento;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Juan Carlos
 */
public class VentanaTratamiento extends JFrame {
    public PanelBotones pnlBotones;
    public PanelTexto pnlTexto;  
    
    public VentanaTratamiento(int btnSeleccionado, String tratamiento){
        iniciarComponentes(btnSeleccionado, tratamiento);
    }
    
    private void iniciarComponentes(int btnSeleccionado, String tratamiento){                
        
        this.pnlTexto = new PanelTexto(tratamiento);
        this.add(this.pnlTexto, BorderLayout.CENTER);
        
        this.pnlBotones = new PanelBotones(btnSeleccionado);
        this.add(this.pnlBotones, BorderLayout.SOUTH);        
                
        this.setDefaultCloseOperation(VentanaTratamiento.HIDE_ON_CLOSE);
        this.setTitle("Tratamiento Paciente");
        this.setLocation(100,100);        
        this.setResizable(false);
        pack();
        
    }   
        
}
