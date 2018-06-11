/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaVentanaInicio;

import vistaJaulas.PanelJaulas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import vistaPacientes.PestagnaPacientes;

/**
 *
 * @author Juan Carlos
 */
public class VentanaInicio extends JFrame implements ActionListener{    
    
    public PestagnasInicio pPestagnas;
    
    public VentanaInicio(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
       
       try {
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
	} catch (Exception e) {
		e.printStackTrace();
	}        
       
        this.pPestagnas = new PestagnasInicio();        
        this.add(pPestagnas);        

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Veterinaria");
        this.setLocation(50,50);
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(1100, 720);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        if(this.pLat.pOpc.btnAgregarJaula == e.getSource()){
//            JOptionPane.showMessageDialog(null,"Esta funcion aun no se implementa\n" + "Proximamente: Se agrega funcion para añadir nuevas jaulas "); 
//        }else if(this.pLat.pOpc.btnNuevoPac == e.getSource()){
//            JOptionPane.showMessageDialog(null,"Esta funcion aun no esta completa\n"); 
//        }else if(this.pLat.pOpc.btnQuitarJaula == e.getSource()){
//            JOptionPane.showMessageDialog(null,"Esta funcion aun no se implementa\n" + "Proximamente: Se agrega funcion para quitar una jaula a eleccion "); 
//        }else if(this.pLat.pOpc.btnQuitarPac == e.getSource()){
//            JOptionPane.showMessageDialog(null,"Esta funcion aun no se implementa\n" + "Proximamente: Se agrega funcion para quitar a un paciente de una jaula "); 
//        }else if(this.pLat.pOpc.btnTabla == e.getSource()){
//            PestagnaPacientes venPac = new PestagnaPacientes();
//        }else if(this.pLat.pBus.btnBuscar == e.getSource()){
//            JOptionPane.showMessageDialog(null,"Esta funcion aun no se implementa\n" + "Proximamente: Se agrega funcion para buscar al paciente solicitado "); 
//        }
    }
    
}
