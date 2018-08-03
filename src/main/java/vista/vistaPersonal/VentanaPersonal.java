
package vista.vistaPersonal;

import vista.componentes.PanelBotones;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import modelo.Personal;

/**
 *
 * @author Juan Carlos
 */
public class VentanaPersonal extends JFrame{
    
    public PanelDatos pnlDatos;
    public PanelBotones pnlBotones;    
    
    public VentanaPersonal(int btnSeleccionado, Personal personal, String rutPart1,String rutPart2,String rutPart3,String rutPart4){
        this.iniciarComponentes(btnSeleccionado, personal, rutPart1, rutPart2, rutPart3, rutPart4);
    }
    
    private void iniciarComponentes(int btnSeleccionado, Personal personal, String rutPart1,String rutPart2,String rutPart3,String rutPart4){
        
        this.pnlDatos = new PanelDatos(personal, rutPart1, rutPart2, rutPart3, rutPart4);
        this.add(this.pnlDatos, BorderLayout.CENTER);
        
        this.pnlBotones = new PanelBotones(btnSeleccionado);
        this.add(this.pnlBotones, BorderLayout.SOUTH);
        
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setTitle("Personal de la veterinaria");
        this.setLocation(50,50);
        this.setResizable(false);
        pack();
    }   
    
}
