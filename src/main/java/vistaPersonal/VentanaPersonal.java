
package vistaPersonal;

import componentes.PanelBotones;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Juan Carlos
 */
public class VentanaPersonal extends JFrame implements ActionListener{
    
    public PanelDatos pnlDatos;
    public PanelBotones pnlBotones;    
    
    public VentanaPersonal(int btnSeleccionado, String nombre, String apellidos, String rutPart1,String rutPart2,String rutPart3,String rutPart4, String direccion, String telefono, String movil,  String email){
        this.iniciarComponentes(btnSeleccionado, nombre, apellidos, rutPart1, rutPart2, rutPart3, rutPart4, direccion, telefono, movil, email);
    }
    
    private void iniciarComponentes(int btnSeleccionado, String nombre, String apellidos, String rutPart1,String rutPart2,String rutPart3,String rutPart4, String direccion, String telefono, String movil,  String email){
        
        this.pnlDatos = new PanelDatos(nombre, apellidos, rutPart1, rutPart2, rutPart3, rutPart4, direccion, telefono, movil, email);
        this.add(this.pnlDatos, BorderLayout.CENTER);
        
        this.pnlBotones = new PanelBotones(btnSeleccionado);
        this.add(this.pnlBotones, BorderLayout.SOUTH);
        
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setTitle("Personal de la veterinaria");
        this.setLocation(50,50);
        this.setResizable(false);
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
