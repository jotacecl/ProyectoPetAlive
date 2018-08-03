
package vista.vistaFichaPaciente;

import java.awt.BorderLayout;
import javax.swing.JFrame;import modelo.Paciente;
;

/**
 *
 * @author HernySenpai
 */
public class VentanaFichaPaciente extends JFrame{        
    
    public PanelDatos pnlDatos;
    public PanelAMedicos pnlAMedicos;
    public  PanelBotonesP pnlBotones;
    
    
    private void iniciarComponentes(Paciente p, boolean jaulaBoolean, int btnSeleccionado){        
        
        this.pnlDatos = new PanelDatos(p, jaulaBoolean);   
        
        this.pnlAMedicos = new PanelAMedicos(p);
        
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

    public VentanaFichaPaciente(Paciente p, boolean booleano, int btnSeleccionado) {
        iniciarComponentes(p, booleano, btnSeleccionado);
    }
   
    
    
    
}
