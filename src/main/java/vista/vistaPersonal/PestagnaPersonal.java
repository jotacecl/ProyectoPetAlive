
package vista.vistaPersonal;

import vista.componentes.PanelBotones;
import vista.componentes.PanelTabla;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import vista.componentes.PanelBuscador;

/**
 *
 * @author Juan Carlos
 */
public class PestagnaPersonal extends JPanel{
    
    public PanelTabla pnlTabla;
    public PanelBotones pnlBotones;  
    public PanelBuscador pnlBuscar;
    
    public PestagnaPersonal(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        this.setLayout(new BorderLayout());
        this.setName("Personal");
        
        this.pnlBuscar = new PanelBuscador();
        this.add(this.pnlBuscar, BorderLayout.NORTH);
        
        this.pnlTabla = new PanelTabla("Personal de la clinica/consulta");        
        this.pnlTabla.addColumn("Nombres");
        this.pnlTabla.addColumn("Apellidos");   
        this.pnlTabla.addColumn("RUT"); 
        this.pnlTabla.addColumn("Ciudad");
        this.pnlTabla.addColumn("Teléfono");
        this.pnlTabla.addColumn("Móvil");
        this.pnlTabla.addColumn("Email");
        this.pnlTabla.addColumn("Cargo");
        this.add(this.pnlTabla, BorderLayout.CENTER);
        
        this.pnlBotones = new PanelBotones(1);
        this.add(this.pnlBotones, BorderLayout.SOUTH);
    }
       
}
