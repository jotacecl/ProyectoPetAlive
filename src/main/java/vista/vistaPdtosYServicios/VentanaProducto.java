
package vista.vistaPdtosYServicios;

import vista.componentes.PanelBotones;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Juan Carlos
 */
public class VentanaProducto extends JFrame{
    
    public PanelBotones pnlBotones;
    public PanelDatosP pnlDatos;
    
    public VentanaProducto(int btnSeleccionado,  String idProducto, String nombre, String descripcion, String stock, String precio){
        this.iniciarComponentes(btnSeleccionado,idProducto,nombre,descripcion,stock,precio);
    }
    
    private void iniciarComponentes(int btnSeleccionado, String idProducto, String nombre, String descripcion, String stock, String precio){
        
        this.pnlDatos = new PanelDatosP(idProducto,nombre,descripcion,stock,precio);
        this.add(pnlDatos, BorderLayout.CENTER);
        
        this.pnlBotones = new PanelBotones(btnSeleccionado);
        this.add(pnlBotones, BorderLayout.SOUTH);
        
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setTitle("Productos para el publico");
        this.setLocation(50,50);
        this.setResizable(false);
        pack();
        
    }
    
}
