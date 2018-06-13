/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaPdtosYServicios;

import componentes.PanelBotones;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Juan Carlos
 */
public class VentanaServicio extends JFrame{
    
    public PanelDatosS pnlDatosS;
    public PanelBotones pnlBotones;
    
    public VentanaServicio(int btnSeleccionado){
        this.iniciarComponentes(btnSeleccionado);
    }
    
    private void iniciarComponentes(int btnSeleccionado){
        
        this.pnlDatosS = new PanelDatosS();
        this.add(this.pnlDatosS, BorderLayout.CENTER);
        
        this.pnlBotones = new PanelBotones(btnSeleccionado);
        this.add(this.pnlBotones, BorderLayout.SOUTH);
        
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setTitle("Servicios");
        this.setLocation(50,50);
        this.setVisible(true);
        this.setResizable(false);
        pack();
    }
    
}
