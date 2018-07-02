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
    
    public PanelDatos pnlDatos;
    public PanelAMedicos pnlAMedicos;
    public  PanelBotonesP pnlBotones;
    
    
    private void iniciarComponentes(String nombrePaciente, String raza, String color, String fNac, String rut, String tamannoJaula, String nroJaula, boolean jaulaBoolean, int btnSeleccionado, String antMed){        
        
        this.pnlDatos = new PanelDatos(nombrePaciente, raza, color, fNac, rut, tamannoJaula, nroJaula, jaulaBoolean);   
        
        this.pnlAMedicos = new PanelAMedicos(antMed);
        
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

    public VentanaFichaPaciente(String nombrePaciente, String raza, String color, String fNac, String rut, String tamannoJaula, String nroJaula, boolean booleano, int btnSeleccionado, String antMed) {
        iniciarComponentes(nombrePaciente, raza, color, fNac, rut, tamannoJaula, nroJaula, booleano, btnSeleccionado, antMed);
    }
   
    
    
    
}
