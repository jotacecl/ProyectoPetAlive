
package vista.vistaDirectorio;

import vista.componentes.PanelBotones;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Juan Carlos
 */
public class VentanaDirectorio extends JFrame{
    
    public PanelDatos pnlDatos;
    public PanelBotones pnlBotones;

    public VentanaDirectorio(String directorio) {
        this.iniciarComponentes(directorio);
    }
    
    private void iniciarComponentes(String directorio){
        
        this.pnlDatos = new PanelDatos(directorio);
        this.add(this.pnlDatos, BorderLayout.CENTER);
        
        this.pnlBotones = new PanelBotones(2);
        this.add(this.pnlBotones, BorderLayout.SOUTH);
        
        this.setBackground(new java.awt.Color(134, 204, 161));        
        this.setTitle("Escoge un directorio");
        this.setLocation(100,100);
        this.setResizable(false);       
        pack();                
        
    }
    
}
