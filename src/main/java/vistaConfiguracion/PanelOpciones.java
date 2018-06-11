/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaConfiguracion;

import componentes.BotonIcono;
import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.JPanel;

/**
 *
 * @author Juan Carlos
 */
public class PanelOpciones extends JPanel{
    
    public BotonIcono bDatosClinica, bPersonalizar, bHorario, bJaulas, bAcerca;        
    
    public PanelOpciones(){        
        this.iniciarComponentes();        
    }
    
    private void iniciarComponentes(){       
                
        this.setLayout(new GridLayout(1,2));
        Box caja1 = Box.createVerticalBox(); 
        Box caja2 = Box.createVerticalBox(); 
                
        this.bDatosClinica = new BotonIcono("Datos de la Clínica","data/icon/clinic-icon.png","data/icon/clinic-icon2.png");                
        this.bHorario = new BotonIcono("Horario de atención","data/icon/clock.png","data/icon/clock2.png");               
        this.bJaulas = new BotonIcono("Cantidad de Jaulas","data/icon/cage.png","data/icon/cage2.png");                
        this.bPersonalizar = new BotonIcono("Cambiar tema","data/icon/theme.png","data/icon/theme2.png");                
        this.bAcerca = new BotonIcono("Acerca de...","data/icon/info.png","data/icon/info2.png");        
                
        caja1.add(bDatosClinica);
        caja1.add(bHorario);
        caja1.add(bJaulas);
        caja2.add(bPersonalizar);
        caja2.add(bAcerca);
                        
        this.add(caja1);
        this.add(caja2);    
        
       
    }
        
    
}
