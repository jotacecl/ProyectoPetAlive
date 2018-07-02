/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaConfiguracion;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Juan Carlos
 */
public class PestagnaConfig extends JPanel {
    
    public PanelOpciones pOpciones;
    public PanelLogo pLogo;   
    
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
