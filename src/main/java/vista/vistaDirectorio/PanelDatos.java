
package vista.vistaDirectorio;


import vista.componentes.BotonIcono;
import java.awt.Color;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Juan Carlos
 */
public class PanelDatos extends JPanel{
    
    private JLabel labDirectorio;
    public JTextField txtDirectorio;
    public BotonIcono btnBuscar;

    public PanelDatos(String directorio) {
        this.iniciarComponentes(directorio);
    }
    
    private void iniciarComponentes(String directorio){
        TitledBorder border = new TitledBorder("");       
        this.setBorder(border);
        
        Box caja = Box.createVerticalBox();        
        
        this.labDirectorio = new JLabel("Ingrese el directorio para documentos como:");
        caja.add(this.labDirectorio);
        this.labDirectorio = new JLabel("- Diagnosticos");
        caja.add(this.labDirectorio);
        this.labDirectorio = new JLabel("- Tratamientos ");
        caja.add(this.labDirectorio);
        
        JPanel subPanel = new JPanel();
        this.txtDirectorio = new JTextField(directorio, 27);  
        subPanel.add(this.txtDirectorio);
        this.btnBuscar = new BotonIcono("","data/icon/search.png","data/icon/search.png");
        subPanel.add(this.btnBuscar);
        subPanel.setBackground(new Color(134,204,161));
        caja.add(subPanel);                                              
        
        this.setBackground(new Color(134,204,161));
        this.add(caja);
        
    }
    
}
