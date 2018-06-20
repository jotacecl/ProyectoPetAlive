/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaPacientes;

import componentes.PanelBotones;
import componentes.PanelTabla;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import vistaFichaPaciente.VentanaFichaPaciente;

/**
 *
 * @author Juan Carlos
 */
public class PestagnaPacientes extends JPanel {
    
    private VentanaFichaPaciente vFicha;
    public PanelTabla panelTabla;
    public PanelBotones panelBtn;
    
    public PestagnaPacientes(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        this.setLayout(new BorderLayout());
        this.setName("Pacientes");
        
        this.panelTabla = new PanelTabla("Pacientes");
        this.panelTabla.addColumn("ID");
        this.panelTabla.addColumn("Nombre");
        this.panelTabla.addColumn("Especie");
        this.panelTabla.addColumn("Raza");           
        this.panelTabla.addColumn("Color");
        this.panelTabla.addColumn("F.Nacimiento");
        this.panelTabla.addColumn("Sexo");
        this.panelTabla.addColumn("Internado");
        this.panelTabla.addColumn("Jaula");
        this.add(this.panelTabla, BorderLayout.CENTER);
        
        this.panelBtn = new PanelBotones(1);
        this.add(this.panelBtn, BorderLayout.SOUTH);
                
    }
    
}
