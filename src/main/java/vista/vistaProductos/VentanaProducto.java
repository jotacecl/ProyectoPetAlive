
package vista.vistaProductos;

import vista.componentes.PanelBotones;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import modelo.Producto;

/**
 *
 * @author Juan Carlos
 */
public class VentanaProducto extends JFrame{
    
    public PanelBotones pnlBotones;
    public PanelDatosP pnlDatos;
    
    public VentanaProducto(int btnSeleccionado, Producto p){
        this.iniciarComponentes(btnSeleccionado, p);
    }
    
    private void iniciarComponentes(int btnSeleccionado, Producto p){
        
        this.pnlDatos = new PanelDatosP(p);
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
