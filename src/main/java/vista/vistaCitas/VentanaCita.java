
package vista.vistaCitas;

import vista.componentes.PanelBotones;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import modelo.Cita;

/**
 *
 * @author Juan Carlos
 */
public class VentanaCita extends JFrame{
    
    public PanelDatos pnlDatos;
    public PanelBotones pnlBotones;
    
    public VentanaCita(int btnSeleccionado, Cita cita){
        this.iniciarComponentes(btnSeleccionado, cita);
    }
    
    private void iniciarComponentes(int btnSeleccionado, Cita cita){
        
        this.pnlDatos = new PanelDatos(cita);
        this.add(pnlDatos, BorderLayout.CENTER);
        
        this.pnlBotones = new PanelBotones(btnSeleccionado);
        this.add(this.pnlBotones, BorderLayout.SOUTH);        
        
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setTitle("Citas programadas");
        this.setLocation(50,50);        
        this.setResizable(false);
        pack();
        
    }      
    
}
