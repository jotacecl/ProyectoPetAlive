/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaVentanaInicio;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import vistaVentanaPacientes.VentanaPacientes;

/**
 *
 * @author Juan Carlos
 */
public class VentanaInicio extends JFrame implements ActionListener{
    
    private PanelLateral pLat;
    private PanelJaulas pJail;
    private PanelSuperior pTitulo;
    
    
    public VentanaInicio(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
       
       try {
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
	} catch (Exception e) {
		e.printStackTrace();
	}
        
       this.pLat = new PanelLateral();
       this.add(this.pLat, BorderLayout.SOUTH);
       
       this.pLat.pOpc.btnAgregarJaula.addActionListener(this);
       this.pLat.pOpc.btnNuevoPac.addActionListener(this);
       this.pLat.pOpc.btnQuitarJaula.addActionListener(this);
       this.pLat.pOpc.btnQuitarPac.addActionListener(this);
       this.pLat.pOpc.btnTabla.addActionListener(this);
       this.pLat.pBus.btnBuscar.addActionListener(this);
       
       this.pJail = new PanelJaulas();
       this.add(this.pJail, BorderLayout.CENTER);
       
       this.pTitulo = new PanelSuperior();
       this.add(this.pTitulo, BorderLayout.NORTH);
       
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Veterinaria");
        this.setLocation(100,100);
        this.setVisible(true);
        pack();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.pLat.pOpc.btnAgregarJaula == e.getSource()){
            JOptionPane.showMessageDialog(null,"Esta funcion aun no se implementa\n" + "Proximamente: Se agrega funcion para añadir nuevas jaulas "); 
        }else if(this.pLat.pOpc.btnNuevoPac == e.getSource()){
            JOptionPane.showMessageDialog(null,"Esta funcion aun no esta completa\n"); 
        }else if(this.pLat.pOpc.btnQuitarJaula == e.getSource()){
            JOptionPane.showMessageDialog(null,"Esta funcion aun no se implementa\n" + "Proximamente: Se agrega funcion para quitar una jaula a eleccion "); 
        }else if(this.pLat.pOpc.btnQuitarPac == e.getSource()){
            JOptionPane.showMessageDialog(null,"Esta funcion aun no se implementa\n" + "Proximamente: Se agrega funcion para quitar a un paciente de una jaula "); 
        }else if(this.pLat.pOpc.btnTabla == e.getSource()){
            VentanaPacientes venPac = new VentanaPacientes();
        }else if(this.pLat.pBus.btnBuscar == e.getSource()){
            JOptionPane.showMessageDialog(null,"Esta funcion aun no se implementa\n" + "Proximamente: Se agrega funcion para buscar al paciente solicitado "); 
        }
    }
    
}
