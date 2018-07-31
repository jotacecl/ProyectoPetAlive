
package vista.vistaDatosClinica;

import vista.componentes.PanelBotones;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Juan Carlos
 */
public class VentanaDClinica extends JFrame{
    
    public PanelDatos pnlDatos;
    public PanelBotones pnlBotones;    
    
    public VentanaDClinica(String nombreS, String nombreF, String direccion, String ciudad, String region, String telefono, String email, String web){
        this.iniciarComponentes(nombreS, nombreF, direccion, ciudad, region, telefono, email, web);
    }
    
    private void iniciarComponentes(String nombreS, String nombreF, String direccion, String ciudad, String region, String telefono, String email, String web){
        
        this.pnlDatos = new PanelDatos(nombreS, nombreF, direccion, ciudad, region, telefono, email, web);
        this.add(pnlDatos, BorderLayout.CENTER);
        
        this.pnlBotones = new PanelBotones(3);
        this.add(pnlBotones, BorderLayout.SOUTH);
        
        this.setBackground(new java.awt.Color(134, 204, 161));        
        this.setTitle("Datos de la Clinica/Consulta");
        this.setLocation(100,100);
        this.setResizable(false);       
        pack();
        
    }    
        
}
