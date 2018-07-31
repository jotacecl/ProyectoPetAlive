
package vista.vistaInsumos;


import javax.swing.Box;
import javax.swing.JFrame;


/**
 *
 * @author Juan Carlos
 */
public class VentanaInsumos extends JFrame{
    
    public PanelTablaIns pnlTabla;
    public PanelIngresoIns pnlInsumo;
    public PanelBotones pnlBotones;
    
    public VentanaInsumos(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        Box caja = Box.createVerticalBox();
        
        this.pnlInsumo = new PanelIngresoIns();
        caja.add(this.pnlInsumo);        
        
        this.pnlBotones = new PanelBotones();
        caja.add(this.pnlBotones);
        
        this.pnlTabla = new PanelTablaIns();
        caja.add(this.pnlTabla);
        
        this.add(caja);
        this.setBackground(new java.awt.Color(134, 204, 161));
                      
        this.setTitle("Detalle de insumos");
        this.setLocation(100,100);
        this.setResizable(false);
        pack();
        
    }   
    
}
