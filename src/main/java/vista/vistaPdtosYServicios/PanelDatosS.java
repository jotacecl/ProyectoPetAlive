
package vista.vistaPdtosYServicios;

import vista.componentes.SubPanelDatos;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Juan Carlos
 */
public class PanelDatosS extends JPanel{
    
    private JLabel labNombre, labDescripcion, labPrecio;
    public JTextField txtNombre, txtDescripcion, txtPrecio;
    public SubPanelDatos subPanel;
    
    public PanelDatosS(String nombre, String descripcion, String precio){
        this.iniciarComponentes(nombre,descripcion,precio);
    }
    
    private void iniciarComponentes(String nombre, String descripcion, String precio){
        
        TitledBorder border = new TitledBorder("");       
        this.setBorder(border);
        
        Box caja = Box.createVerticalBox();        
        
        subPanel = new SubPanelDatos();
        
        JPanel pnlNombre = new JPanel();
        this.txtNombre = new JTextField(nombre,20);
        caja.add(this.subPanel.generarSubPanelTF(pnlNombre, labNombre, txtNombre, "Servicio         ", 134, 204, 161));
        
        JPanel pnlDescripcion = new JPanel();
        this.txtDescripcion = new JTextField(descripcion,20);
        caja.add(this.subPanel.generarSubPanelTF(pnlDescripcion, labDescripcion, txtDescripcion, "Descripción ", 134, 204, 161));
        
        JPanel pnlPrecio = new JPanel();
        this.txtPrecio = new JTextField(precio,20);;
        caja.add(this.subPanel.generarSubPanelTF(pnlPrecio, labPrecio, txtPrecio, "Precio           ", 134, 204, 161));
        
        this.setBackground(new java.awt.Color(134,204,161));
        this.add(caja);
        
    }
    
}
