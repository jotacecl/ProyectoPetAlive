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
public class VentanaProducto extends JFrame{
    
    public PanelBotones pnlBotones;
    public PanelDatosP pnlDatos;
    
    public VentanaProducto(int btnSeleccionado){
        this.iniciarComponentes(btnSeleccionado);
    }
    
    private void iniciarComponentes(int btnSeleccionado){
        
        this.pnlDatos = new PanelDatosP();
        this.add(pnlDatos, BorderLayout.CENTER);
        
        this.pnlBotones = new PanelBotones(btnSeleccionado);
        this.add(pnlBotones, BorderLayout.SOUTH);
        
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setTitle("Productos para el publico");
        this.setLocation(50,50);
        this.setVisible(true);
        this.setResizable(false);
        pack();
        
    }
    
}
