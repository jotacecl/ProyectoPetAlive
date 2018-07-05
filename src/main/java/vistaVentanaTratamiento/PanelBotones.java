
package vistaVentanaTratamiento;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Juan Carlos
 */
public class PanelBotones extends JPanel{
    
    public JButton btnGuardar, btnInsumos, btnAceptar;    
    
    public PanelBotones(int btnSeleccionado){
        this.iniciarComponentes(btnSeleccionado);
    }
    
    private void iniciarComponentes(int btnSeleccionado){
        FlowLayout distribucion = new FlowLayout(FlowLayout.RIGHT);
        this.setLayout(distribucion);
        
        this.btnAceptar = new JButton("Aceptar");
        this.btnGuardar = new JButton("Guardar");
        if(btnSeleccionado == 1){            
            this.add(this.btnAceptar);
        }else if(btnSeleccionado == 2){            
            this.add(this.btnGuardar);  
        }
        
        
        this.btnInsumos = new JButton("Insumos/Tratamientos");
        this.add(this.btnInsumos);
        
        this.setBackground(new java.awt.Color(134,204,161));
        
    }
    
}
