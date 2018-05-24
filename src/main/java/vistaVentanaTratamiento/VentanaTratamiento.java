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
public class VentanaTratamiento extends JFrame{
    private PanelBotones pBtn;
    private PanelTexto pText;
    
    public VentanaTratamiento(){
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){                
        
        this.pText = new PanelTexto();
        this.add(this.pText, BorderLayout.CENTER);
        
        this.pBtn = new PanelBotones();
        this.add(this.pBtn, BorderLayout.SOUTH);
                
        this.setDefaultCloseOperation(VentanaTratamiento.HIDE_ON_CLOSE);
        this.setTitle("Tratamiento Paciente");
        this.setLocation(100,100);
        this.setVisible(true);
        this.setResizable(false);
        pack();
    }
    
    
}
