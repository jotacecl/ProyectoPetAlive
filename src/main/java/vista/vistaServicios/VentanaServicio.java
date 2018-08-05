
package vista.vistaServicios;

import vista.componentes.PanelBotones;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import modelo.Servicio;

/**
 *
 * @author Juan Carlos
 */
public class VentanaServicio extends JFrame{
    
    public PanelDatosS pnlDatosS;
    public PanelBotones pnlBotones;
    
    public VentanaServicio(Servicio s, int btnSeleccionado){
        this.iniciarComponentes(s, btnSeleccionado);
    }
    
    private void iniciarComponentes(Servicio s, int btnSeleccionado){
        
        this.pnlDatosS = new PanelDatosS(s);
        this.add(this.pnlDatosS, BorderLayout.CENTER);
        
        this.pnlBotones = new PanelBotones(btnSeleccionado);
        this.add(this.pnlBotones, BorderLayout.SOUTH);
        
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setTitle("Servicios");
        this.setLocation(50,50);
        this.setResizable(false);
        pack();
    }
    
}
