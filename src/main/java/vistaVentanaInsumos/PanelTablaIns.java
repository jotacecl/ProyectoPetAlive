
package vistaVentanaInsumos;

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HernySenpai
 */
public class PanelTablaIns extends JPanel {
    
    public JTable tabla;
    public DefaultTableModel modelo;
    private JScrollPane scroll;
    private JLabel labTotal;
    public JTextField txtTotal;
    
    public PanelTablaIns() {
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        Box caja = Box.createVerticalBox();
        
        Font negrita = new Font("Arial", Font.BOLD, 16);
        
        JPanel pnlTabla = new JPanel();
        this.modelo = new DefaultTableModel();
        this.tabla = new JTable();
        this.tabla.setModel(modelo);
        this.modelo.addColumn("Nombre");
        this.modelo.addColumn("Cantidad");
        this.modelo.addColumn("Costo");
        this.scroll = new JScrollPane(tabla);
        pnlTabla.add(this.scroll);
        pnlTabla.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlTabla);
        
        TitledBorder border = new TitledBorder("");        
        pnlTabla.setBorder(border);
        
        JPanel pnlTotal = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        this.labTotal = new JLabel("Total");
        this.labTotal.setFont(negrita);
        this.txtTotal = new JTextField("", 10);
        pnlTotal.add(this.labTotal);
        pnlTotal.add(this.txtTotal);
        pnlTotal.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlTotal);        
        
        this.setBackground(new java.awt.Color(134, 204, 161));
        this.add(caja);
    }
    
}
