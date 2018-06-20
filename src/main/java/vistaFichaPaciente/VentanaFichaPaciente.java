/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaFichaPaciente;

import java.awt.BorderLayout;
import javax.swing.JFrame;;
import vistaVentanaInsumos.VentanaInsumos;
import vistaVentanaTratamiento.VentanaTratamiento;

/**
 *
 * @author HernySenpai
 */
public class VentanaFichaPaciente extends JFrame{
    
    private VentanaInsumos vIns;
    private VentanaTratamiento vTrat;
    public PanelDatos pnlDatos;
    public PanelAMedicos pnlAMedicos;
    public  PanelBotonesP pnlBotones;
    
    
    private void iniciarComponentes(String nombrePaciente, String raza, String color, String fNac, String rut, String jaula, boolean booleano, int btnSeleccionado){        
        
        this.pnlDatos = new PanelDatos(nombrePaciente, raza, color, fNac, rut, jaula, booleano);   
        
        this.pnlAMedicos = new PanelAMedicos();
        
        this.pnlBotones = new PanelBotonesP(btnSeleccionado);
                                
        this.setName("Datos paciente");
                
        this.add(this.pnlDatos, BorderLayout.NORTH);
        this.add(this.pnlAMedicos, BorderLayout.CENTER);
        this.add(this.pnlBotones, BorderLayout.SOUTH);
        
        this.setBackground(new java.awt.Color(134, 204, 161));        
        this.setTitle("Ficha del paciente");
        this.setLocation(100,100);
        this.setResizable(false);       
        pack();
    }

    public VentanaFichaPaciente(String nombrePaciente, String raza, String color, String fNac, String rut, String jaula, boolean booleano, int btnSeleccionado) {
        iniciarComponentes(nombrePaciente, raza, color, fNac, rut, jaula, booleano, btnSeleccionado);
    }
   
    
    
    
}
