
package vista.vistaProductos;

import vista.componentes.SubPanelDatos;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import modelo.Producto;

/**
 *
 * @author Juan Carlos
 */
public class PanelDatosP extends JPanel{
        
    private JLabel labTipo;
    private JLabel labDescripcion;
    private JLabel labStock;
    private JLabel labPrecio;
    private JLabel labNombre;    
    public JTextField txtNombre;
    public JTextField txtDescripcion;
    public JTextField txtStock;
    public JTextField txtPrecio;
    public JComboBox cbTipo;
    public JButton btnAgregar; 
    public JButton btnEliminar;
    public JButton btnEditar;
    public SubPanelDatos subPanel;
    
    public PanelDatosP(Producto p){
        this.iniciarComponentes(p);
    }
    
    private void iniciarComponentes(Producto p){
        
        TitledBorder border = new TitledBorder("");       
        this.setBorder(border);
        
        Box caja = Box.createVerticalBox();        
        
        subPanel = new SubPanelDatos();
        
        if(p!=null){            
            this.txtNombre = new JTextField(p.getNombre(),20);
            this.txtDescripcion = new JTextField(p.getDescripcion(),20);
            this.txtStock = new JTextField(Integer.toString(p.getStock()),20);
            this.txtPrecio = new JTextField(Integer.toString(p.getPrecio()),20);
        }else{            
            this.txtNombre = new JTextField("",20);
            this.txtDescripcion = new JTextField("",20);
            this.txtStock = new JTextField("",20);
            this.txtPrecio = new JTextField("",20);
        }                
        
        JPanel pnlNombre = new JPanel();        
        caja.add(this.subPanel.generarSubPanelTF(pnlNombre, labNombre, txtNombre, "Producto       ", 134, 204, 161));
        
        JPanel pnlTipo = new JPanel();
        this.cbTipo = new JComboBox();
        this.btnAgregar = new JButton("+");
        this.btnEliminar = new JButton("-");
        this.btnEditar = new JButton("edit");
        caja.add(this.subPanel.generarSubPanelCB(pnlTipo, labTipo, cbTipo, "Tipo               ", 134, 204, 161, btnAgregar, btnEliminar, btnEditar));
        
        JPanel pnlDescripcion = new JPanel();        
        caja.add(this.subPanel.generarSubPanelTF(pnlDescripcion, labDescripcion, txtDescripcion, "Descripcion ",  134, 204, 161));
        
        JPanel pnlStock = new JPanel();        
        caja.add(this.subPanel.generarSubPanelTF(pnlStock, labStock, txtStock, "Stock             ", 134, 204, 161));
        
        JPanel pnlPrecio = new JPanel();        
        caja.add(this.subPanel.generarSubPanelTF(pnlPrecio, labPrecio, txtPrecio, "Precio            ", 134, 204, 161));
        
        this.setBackground(new java.awt.Color(134,204,161));
        
        this.add(caja);
        
    }
    
}
