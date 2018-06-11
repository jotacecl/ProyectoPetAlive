/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaCitas;

import componentes.PanelBotones;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Juan Carlos
 */
public class VentanaCita extends JFrame implements ActionListener{
    
    public PanelDatos pnlDatos;
    public PanelBotones pnlBotones;
    
    public VentanaCita(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        
        this.pnlDatos = new PanelDatos();
        this.add(pnlDatos, BorderLayout.CENTER);
        
        this.pnlBotones = new PanelBotones(3);
        this.add(this.pnlBotones, BorderLayout.SOUTH);
        
        this.pnlBotones.btnGuardar.addActionListener(this);
        this.pnlBotones.btnCancelar.addActionListener(this);
        
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setTitle("Datos del Cliente");
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
