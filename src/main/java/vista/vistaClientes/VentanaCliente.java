
package vista.vistaClientes;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Juan Carlos
 */
public class VentanaCliente extends JFrame{
    
    public PanelBotones pnlBotones;
    public PanelDatos pnlDatos;
    
    public VentanaCliente(int btnSelect, String nombre, String apellidos, String rutPart1,String rutPart2,String rutPart3,String rutPart4, String direccion, String telefono, String movil,  String email, String deuda){
        this.iniciarComponentes(btnSelect, nombre, apellidos, rutPart1, rutPart2, rutPart3, rutPart4, direccion, telefono, movil, email, deuda);
    }
    
    private void iniciarComponentes(int btnSelect, String nombre, String apellidos, String rutPart1,String rutPart2,String rutPart3,String rutPart4, String direccion, String telefono, String movil,  String email, String deuda){
                     
        this.pnlDatos = new PanelDatos(nombre, apellidos, rutPart1, rutPart2, rutPart3, rutPart4, direccion, telefono, movil, email);
        this.add(this.pnlDatos, BorderLayout.CENTER);
        
        this.pnlBotones = new PanelBotones(btnSelect, deuda);
        this.add(this.pnlBotones, BorderLayout.SOUTH);
        
        this.setBackground(new java.awt.Color(134, 204, 161));
        this.setName("Datos Cliente");        
        
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setTitle("Datos del Cliente");
        this.setLocation(50,50);        
        this.setResizable(false);
        pack();
        
    }
    
    
}
