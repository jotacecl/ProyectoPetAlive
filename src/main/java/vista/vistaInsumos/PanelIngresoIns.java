
package vista.vistaInsumos;

import vista.componentes.SubPanelDatos;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author HernySenpai
 */
public class PanelIngresoIns extends JPanel {
    
    private JLabel labInsumo, labCantidad, labCosto;       
    public JTextField txtInsumo, txtCantidad, txtCosto;    
    
    public SubPanelDatos subPanel;   

    public PanelIngresoIns() {
        this.iniciarComponentes();
    }
    
    
    
    private void iniciarComponentes(){
        TitledBorder border = new TitledBorder("Ingrese los datos solicitados");
        border.setTitleColor(new java.awt.Color(54,82,48));
        this.setBorder(border);
        
        Box caja = Box.createVerticalBox();        
        
        subPanel = new SubPanelDatos();                
        
        JPanel pnlInsumo = new JPanel(new FlowLayout(FlowLayout.LEFT));                      
        this.txtInsumo = new JTextField("",20);                
        caja.add(this.subPanel.generarSubPanelTF(pnlInsumo, labInsumo, txtInsumo, "Insumo/Procedimiento", 134,204,161));
        
        JPanel pnlCantidad = new JPanel(new FlowLayout(FlowLayout.LEFT));     
        this.txtCantidad = new JTextField("",20);
        caja.add(this.subPanel.generarSubPanelTF(pnlCantidad, labCantidad, txtCantidad, "Cantidad                          ", 134,204,161));
        
        JPanel pnlCosto = new JPanel(new FlowLayout(FlowLayout.LEFT));   
        this.txtCosto = new JTextField("",20);
        caja.add(this.subPanel.generarSubPanelTF(pnlCosto, labCosto, txtCosto, "Costo                                ", 134,204,161));
        
        this.setBackground(new java.awt.Color(134, 204, 161));        
        this.add(caja);
        
    }
    
}
