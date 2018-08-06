
package vista.vistaCitas;

import vista.componentes.PanelBotones;
import vista.componentes.PanelTabla;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import vista.componentes.PanelBuscador;

/**
 *
 * @author Juan Carlos
 */
public class PestagnaCitas extends JPanel{
        
    public PanelTabla pnlTabla;
    public PanelBotones pnlBotones;
    public PanelBuscador pnlBuscar;
    
    public PestagnaCitas(){
     this.iniciarComponentes();
    }            
    
    private void iniciarComponentes(){
        this.setLayout(new BorderLayout());
        this.setName("Citas");
        
        this.pnlBuscar = new PanelBuscador();
        this.add(this.pnlBuscar, BorderLayout.NORTH);
        
        this.pnlTabla = new PanelTabla("Citas programadas");       
        this.pnlTabla.addColumn("Paciente");
        this.pnlTabla.addColumn("RUT Cliente");
        this.pnlTabla.addColumn("Fecha ingreso");           
        this.pnlTabla.addColumn("Fecha cita");
        this.pnlTabla.addColumn("Motivo");
        this.add(this.pnlTabla, BorderLayout.CENTER);
        
        this.pnlBotones = new PanelBotones(1);
        this.add(this.pnlBotones, BorderLayout.SOUTH);
    }      
    
}
