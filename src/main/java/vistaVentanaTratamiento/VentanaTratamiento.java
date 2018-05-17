/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaVentanaTratamiento;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import vistaVentanaPacientes.VentanaPacientes;

/**
 *
 * @author Juan Carlos
 */
public class VentanaTratamiento extends JFrame{
    private PanelBotones pBtn;
    private PanelTexto pText;
    
    public VentanaTratamiento(){
        inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        this.pText = new PanelTexto();
        this.add(this.pText, BorderLayout.CENTER);
        
        this.pBtn = new PanelBotones();
        this.add(this.pBtn, BorderLayout.SOUTH);
                
        this.setDefaultCloseOperation(VentanaTratamiento.HIDE_ON_CLOSE);
        this.setTitle("Veterinaria"+"- Tratamiento Paciente");
//        this.setSize(1000,600);
        this.setLocation(100,100);
        this.setVisible(true);
        pack();
    }
    
    
}
