/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaVentanaPacientes;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Juan Carlos
 */
public class VentanaPacientes extends JFrame{
    
    private PanelTabla panelTabla;
    private PanelBotones panelBtn;
    
    public VentanaPacientes(){
        this.inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        this.panelTabla = new PanelTabla();
        this.add(this.panelTabla, BorderLayout.CENTER);
        
        this.panelBtn = new PanelBotones();
        this.add(this.panelBtn, BorderLayout.SOUTH);
        
        this.setDefaultCloseOperation(VentanaPacientes.HIDE_ON_CLOSE);
        this.setTitle("Veterinaria"+"- Pacientes");
//        this.setSize(1000,600);
        this.setLocation(100,100);
        this.setVisible(true);
        pack();
    }
    
}
