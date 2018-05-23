/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaFichaPaciente;

import javax.swing.JFrame;
import vistaVentanaPacientes.VentanaPacientes;

/**
 *
 * @author HernySenpai
 */
public class VentanaFichaPaciente extends JFrame {
    private PestagnaPaciente pestPaciente;
    private PestDatosResponsable pestResponsable;
    
    private void inicializarComponentes(){
        this.pestResponsable = new PestDatosResponsable();
        this.add(this.pestResponsable);

        this.pestPaciente = new PestagnaPaciente();
        this.add(this.pestPaciente);
        

        
        this.setVisible(true);
        this.setDefaultCloseOperation(VentanaPacientes.HIDE_ON_CLOSE);
        this.setTitle("Pestañas");
        this.setLocation(100,100);
        
        pack();
    }

    public VentanaFichaPaciente() {
        inicializarComponentes();
    }
    
    
    
}
