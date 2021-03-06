
package vista.vistaInicio;

import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import vista.vistaCitas.PestagnaCitas;
import vista.vistaConfiguracion.PestagnaConfig;
import vista.vistaFicheros.PestagnaFicheros;
import vista.vistaJaulas.PestagnaJaulas;


/**
 *
 * @author Juan Carlos
 */
public class PestagnasInicio extends JTabbedPane{
    
    public PestagnaFicheros pFicheros;
    public PestagnaCitas pCitas;
    public PestagnaConfig pConfig;
    public PestagnaJaulas pJaulas;
    
    private final String Icono1 = "data/icon/citaIcon.png";
    private final String Icono2 = "data/icon/ficha.png";
    private final String Icono3 = "data/icon/small-cage.png";
    private final String Icono4= "data/icon/settings.png";
    
    public PestagnasInicio(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        
        this.pCitas = new PestagnaCitas();
        this.pFicheros = new PestagnaFicheros();        
        this.pJaulas = new PestagnaJaulas();
        this.pConfig = new PestagnaConfig();
        
        this.add(pCitas);
        this.add(pFicheros);
        this.add(pJaulas);
        this.add(pConfig);
                
        this.setIconAt(0, new ImageIcon(Icono1));
        this.setIconAt(1, new ImageIcon(Icono2));
        this.setIconAt(2, new ImageIcon(Icono3));
        this.setIconAt(3, new ImageIcon(Icono4));
    }
    
}
