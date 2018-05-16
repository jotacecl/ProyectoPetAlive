/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaVentanaPrincipal;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Juan Carlos
 */
public class PanelOpciones extends JPanel{
    
    public JButton btnTabla, btnAgregarJaula, btnNuevoPac, btnQuitarPac, btnQuitarJaula;
    
    public PanelOpciones(){
        this.inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        Box cajaTotal = Box.createHorizontalBox();
        Box cajaPacientes = Box.createVerticalBox();
        Box cajaJaulas = Box.createVerticalBox();
        
        FlowLayout distribucion = new FlowLayout();
        this.setLayout(distribucion);
        
        JPanel panelPaciente = new JPanel();
        panelPaciente.setLayout(new GridLayout(3,1));
        panelPaciente.setBackground(new java.awt.Color(134,204,161));
        
        JPanel panelJaulas = new JPanel();
        panelJaulas = new JPanel();
        panelJaulas.setLayout(new GridLayout(3,1));
        panelJaulas.setBackground(new java.awt.Color(134,204,161));
            
        this.btnTabla = new JButton("Ver pacientes");
        panelPaciente.add(this.btnTabla);
        
        this.btnAgregarJaula = new JButton("Agregar jaula");
        panelJaulas.add(this.btnAgregarJaula);
        
        this.btnNuevoPac = new JButton("Agregar Paciente");
        panelPaciente.add(this.btnNuevoPac);
        
        this.btnQuitarPac = new JButton("Quitar Paciente");
        panelPaciente.add(this.btnQuitarPac);
        
        this.btnQuitarJaula = new JButton("Quitar Jaula");
        panelJaulas.add(this.btnQuitarJaula);
        
        cajaTotal.add(panelPaciente);
        cajaTotal.add(panelJaulas);
        
        this.add(cajaTotal);
        
        this.setBackground(new java.awt.Color(134,204,161));
        
    }
    
}
