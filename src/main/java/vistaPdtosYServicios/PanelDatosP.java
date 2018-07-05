
package vistaPdtosYServicios;

import componentes.SubPanelDatos;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Juan Carlos
 */
public class PanelDatosP extends JPanel{
    
    private JLabel labID, labNombre, labTipo, labDescripcion, labStock, labPrecio;
    public JTextField txtID, txtNombre, txtDescripcion, txtStock, txtPrecio;
    public JComboBox cbTipo;
    public JButton btnAgregar, btnEliminar, btnEditar;
    public SubPanelDatos subPanel;
    
    public PanelDatosP(String idProducto, String nombre, String descripcion, String stock, String precio){
        this.iniciarComponentes(idProducto,nombre,descripcion,stock,precio);
    }
    
    private void iniciarComponentes(String idProducto, String nombre, String descripcion, String stock, String precio){
        
        TitledBorder border = new TitledBorder("");       
        this.setBorder(border);
        
        Box caja = Box.createVerticalBox();        
        
        subPanel = new SubPanelDatos();
        
        JPanel pnlID = new JPanel();
        this.txtID = new JTextField(idProducto,20);
        caja.add(this.subPanel.generarSubPanelTF(pnlID, labID, txtID, "ID Producto  ", 134, 204, 161));
        
        JPanel pnlNombre = new JPanel();
        this.txtNombre = new JTextField(nombre,20);
        caja.add(this.subPanel.generarSubPanelTF(pnlNombre, labNombre, txtNombre, "Producto       ", 134, 204, 161));
        
        JPanel pnlTipo = new JPanel();
        this.cbTipo = new JComboBox();
        this.btnAgregar = new JButton("+");
        this.btnEliminar = new JButton("-");
        this.btnEditar = new JButton("edit");
        caja.add(this.subPanel.generarSubPanelCB(pnlTipo, labTipo, cbTipo, "Tipo               ", 134, 204, 161, btnAgregar, btnEliminar, btnEditar));
        
        JPanel pnlDescripcion = new JPanel();
        this.txtDescripcion = new JTextField(descripcion,20);
        caja.add(this.subPanel.generarSubPanelTF(pnlDescripcion, labDescripcion, txtDescripcion, "Descripcion ",  134, 204, 161));
        
        JPanel pnlStock = new JPanel();
        this.txtStock = new JTextField(stock,20);
        caja.add(this.subPanel.generarSubPanelTF(pnlStock, labStock, txtStock, "Stock             ", 134, 204, 161));
        
        JPanel pnlPrecio = new JPanel();
        this.txtPrecio = new JTextField(precio,20);
        caja.add(this.subPanel.generarSubPanelTF(pnlPrecio, labPrecio, txtPrecio, "Precio            ", 134, 204, 161));
        
        this.setBackground(new java.awt.Color(134,204,161));
        
        this.add(caja);
        
    }
    
}
