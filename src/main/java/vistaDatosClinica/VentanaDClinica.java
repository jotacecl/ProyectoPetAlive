/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaDatosClinica;

import componentes.PanelBotones;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Juan Carlos
 */
public class VentanaDClinica extends JFrame{
    
    public PanelDatos pnlDatos;
    public PanelBotones pnlBotones;
    
    public VentanaDClinica(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        
        this.pnlDatos = new PanelDatos();
        this.add(pnlDatos, BorderLayout.CENTER);
        
        this.pnlBotones = new PanelBotones(3);
        this.add(pnlBotones, BorderLayout.SOUTH);
        
        this.setBackground(new java.awt.Color(134, 204, 161));
        this.setVisible(true);
        this.setTitle("Datos de la Clinica/Consulta");
        this.setLocation(100,100);
        this.setResizable(false);       
        pack();
        
    }
    
}
