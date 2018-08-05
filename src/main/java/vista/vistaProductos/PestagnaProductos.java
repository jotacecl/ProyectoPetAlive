
package vista.vistaProductos;

import vista.componentes.PanelTabla;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import vista.componentes.PanelBotones;

/**
 *
 * @author Juan Carlos
 */
public class PestagnaProductos extends JPanel{
    
    public PanelTabla pnlTabla;
    public PanelBotones pnlBotones;
    private VentanaProducto vProducto;
    
    public PestagnaProductos(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        this.setLayout(new BorderLayout());
        this.setName("Productos");
        
        this.pnlTabla = new PanelTabla("Productos disponibles al publico");
        this.pnlTabla.addColumn("ID");
        this.pnlTabla.addColumn("Nombre");
        this.pnlTabla.addColumn("Tipo");
        this.pnlTabla.addColumn("Descripción");
        this.pnlTabla.addColumn("Stock");
        this.pnlTabla.addColumn("Precio Und");
        this.add(this.pnlTabla, BorderLayout.CENTER);
        
        this.pnlBotones = new PanelBotones(1);
        this.add(this.pnlBotones, BorderLayout.SOUTH);
        
    }   
    
}
