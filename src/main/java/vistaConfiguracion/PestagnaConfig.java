/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaConfiguracion;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import vistaDatosClinica.VentanaDClinica;
import vistaHorario.VentanaHorario;
import vistaJaulas.VentanaCJaulas;
import vistaPersonalizacion.VentanaPersonalizacion;

/**
 *
 * @author Juan Carlos
 */
public class PestagnaConfig extends JPanel {
    
    public PanelOpciones pOpciones;
    public PanelLogo pLogo;
    private VentanaDClinica vDClinica;
    private VentanaHorario vHorario;
    public VentanaCJaulas vCJaulas;
    private VentanaPersonalizacion vPersonalizar;
    private VentanaAcerca vAcerca;    
    
    public PestagnaConfig(){        
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        this.setLayout(new BorderLayout());
        
        this.setName("Configuración");
        
        this.pOpciones = new PanelOpciones();
        this.pLogo = new PanelLogo();                        
                
        this.add(pLogo, BorderLayout.EAST);
        this.add(pOpciones, BorderLayout.CENTER);                
        
    }

    
}
