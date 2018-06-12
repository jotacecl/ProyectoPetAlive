/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaHorario;

import componentes.PanelBotones;
import java.awt.BorderLayout;
import javax.swing.JFrame;
/**
 *
 * @author Juan Carlos
 */
public class VentanaHorario extends JFrame{
    
    public PanelHorario pnlHorario;
    public PanelBotones pnlBotones;
       
    public VentanaHorario(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        
        this.pnlHorario = new PanelHorario();
        this.add(this.pnlHorario, BorderLayout.CENTER);
        
        this.pnlBotones = new PanelBotones(2);
        this.add(this.pnlBotones, BorderLayout.SOUTH);
        
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setTitle("Horario de atencion");
        this.setLocation(50,50);
        this.setVisible(true);
        this.setResizable(false);
        pack();
        
    }
    
}
