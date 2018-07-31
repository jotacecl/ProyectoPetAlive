
package vista.vistaClientes;

import vista.componentes.PanelBotones;
import vista.componentes.PanelTabla;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Juan Carlos
 */
public class PestagnaClientes extends JPanel{
    
    public PanelTabla pnlTabla;
    public PanelBotones pnlBotones;
    
    public PestagnaClientes(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        this.setLayout(new BorderLayout());
        this.setName("Clientes");
        
        this.pnlTabla = new PanelTabla("Clientes");
        this.pnlTabla.addColumn("Nombres");
        this.pnlTabla.addColumn("Apellidos");
        this.pnlTabla.addColumn("RUT");
        this.pnlTabla.addColumn("Ciudad");
        this.pnlTabla.addColumn("Teléfono");
        this.pnlTabla.addColumn("Móvil");
        this.pnlTabla.addColumn("Email");
        this.add(this.pnlTabla, BorderLayout.CENTER);
        
        this.pnlBotones = new PanelBotones(4);
        this.add(this.pnlBotones, BorderLayout.SOUTH);
    }

    
}
