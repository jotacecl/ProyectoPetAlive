
package vista.vistaServicios;

import vista.componentes.SubPanelDatos;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import modelo.Servicio;

/**
 *
 * @author Juan Carlos
 */
public class PanelDatosS extends JPanel{
    
    private JLabel labNombre, labDescripcion, labPrecio;
    public JTextField txtNombre, txtDescripcion, txtPrecio;
    public SubPanelDatos subPanel;
    
    public PanelDatosS(Servicio s){
        this.iniciarComponentes(s);
    }
    
    private void iniciarComponentes(Servicio s){
        
        TitledBorder border = new TitledBorder("");       
        this.setBorder(border);
        
        Box caja = Box.createVerticalBox();        
        
        subPanel = new SubPanelDatos();
        
        if(s!=null){
            this.txtNombre = new JTextField(s.getNombre(),20);
            this.txtDescripcion = new JTextField(s.getDescripcion(),20);
            this.txtPrecio = new JTextField(Integer.toString(s.getPrecio()),20);
        }else{
            this.txtNombre = new JTextField("",20);
            this.txtDescripcion = new JTextField("",20);
            this.txtPrecio = new JTextField("",20);
        }
        
        JPanel pnlNombre = new JPanel();        
        caja.add(this.subPanel.generarSubPanelTF(pnlNombre, labNombre, txtNombre, "Servicio         ", 134, 204, 161));
        
        JPanel pnlDescripcion = new JPanel();        
        caja.add(this.subPanel.generarSubPanelTF(pnlDescripcion, labDescripcion, txtDescripcion, "Descripción ", 134, 204, 161));
        
        JPanel pnlPrecio = new JPanel();        
        caja.add(this.subPanel.generarSubPanelTF(pnlPrecio, labPrecio, txtPrecio, "Precio           ", 134, 204, 161));
        
        this.setBackground(new java.awt.Color(134,204,161));
        this.add(caja);
        
    }
    
}
