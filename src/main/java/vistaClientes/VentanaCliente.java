/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaClientes;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Juan Carlos
 */
public class VentanaCliente extends JFrame{
    
    public PanelBotones pnlBotones;
    public PanelDatos pnlDatos;
    
    public VentanaCliente(int btnSelect, String nombre, String apellidos, String rut, String direccion, String telefono, String movil,  String email){
        this.iniciarComponentes(btnSelect, nombre, apellidos, rut, direccion, telefono, movil, email);
    }
    
    private void iniciarComponentes(int btnSelect, String nombre, String apellidos, String rut, String direccion, String telefono, String movil,  String email){
                     
        this.pnlDatos = new PanelDatos(nombre, apellidos, rut, direccion, telefono, movil, email);
        this.add(this.pnlDatos, BorderLayout.CENTER);
        
        this.pnlBotones = new PanelBotones(btnSelect);
        this.add(this.pnlBotones, BorderLayout.SOUTH);
        
        this.setBackground(new java.awt.Color(134, 204, 161));
        this.setName("Datos Cliente");        
        
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setTitle("Datos del Cliente");
        this.setLocation(50,50);        
        this.setResizable(false);
        pack();
        
    }
    
    
}
