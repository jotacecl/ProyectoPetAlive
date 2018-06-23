/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaFichaPaciente;

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
    public PanelTabla pnlTabla;
    public PanelBotones pnlBotones;
    
    public PestagnaPacientes(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        this.setLayout(new BorderLayout());
        this.setName("Pacientes");
        
        this.pnlTabla = new PanelTabla("Pacientes");
        this.pnlTabla.addColumn("ID");
        this.pnlTabla.addColumn("Nombre");
        this.pnlTabla.addColumn("Especie");
        this.pnlTabla.addColumn("Raza");           
        this.pnlTabla.addColumn("Color");
        this.pnlTabla.addColumn("F.Nacimiento");
        this.pnlTabla.addColumn("Sexo");
        this.pnlTabla.addColumn("Internado");
        this.pnlTabla.addColumn("Jaula");
        this.add(this.pnlTabla, BorderLayout.CENTER);
        
        this.pnlBotones = new PanelBotones(1);
        this.add(this.pnlBotones, BorderLayout.SOUTH);
                
    }
    
}
