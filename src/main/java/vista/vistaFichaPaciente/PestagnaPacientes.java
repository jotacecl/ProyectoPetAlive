
package vista.vistaFichaPaciente;

import vista.componentes.PanelBotones;
import vista.componentes.PanelTabla;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import vista.componentes.PanelBuscador;

/**
 *
 * @author Juan Carlos
 */
public class PestagnaPacientes extends JPanel {
       
    public PanelTabla pnlTabla;
    public PanelBotones pnlBotones;
    public PanelBuscador pnlBuscar;
    
    public PestagnaPacientes(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        this.setLayout(new BorderLayout());
        this.setName("Pacientes");
        
        this.pnlBuscar = new PanelBuscador();
        this.add(this.pnlBuscar, BorderLayout.NORTH);
        
        this.pnlTabla = new PanelTabla("Pacientes");        
        this.pnlTabla.addColumn("Nombre");
        this.pnlTabla.addColumn("Especie");
        this.pnlTabla.addColumn("Raza");           
        this.pnlTabla.addColumn("Color");
        this.pnlTabla.addColumn("F.Nacimiento");
        this.pnlTabla.addColumn("Sexo");
        this.pnlTabla.addColumn("Internado");
        this.pnlTabla.addColumn("Jaula");
        this.add(this.pnlTabla, BorderLayout.CENTER);
        
        this.pnlBotones = new PanelBotones(1);
        this.add(this.pnlBotones, BorderLayout.SOUTH);
                
    }
    
}
