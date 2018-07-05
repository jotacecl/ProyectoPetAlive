
package vistaVentanaInsumos;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author HernySenpai
 */
public class PanelBotones extends JPanel {
    public JButton btnAgregar;
    public JButton btnEliminar;

    public PanelBotones() {
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        FlowLayout distribucion = new FlowLayout(FlowLayout.RIGHT);
        
        this.btnAgregar = new JButton("Agregar");
        this.add(this.btnAgregar);
        
        this.btnEliminar = new JButton ("Eliminar");
        this.add(this.btnEliminar);
        
        this.setBackground(new java.awt.Color(134, 204, 161));
        
        this.setLayout(distribucion);
    }
}
