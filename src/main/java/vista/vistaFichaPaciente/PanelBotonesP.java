
package vista.vistaFichaPaciente;

import vista.componentes.PanelBotones;
import vista.componentes.SubPanelDatos;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author HernySenpai
 */
public class PanelBotonesP extends JPanel{
    
    public JButton btnDocumentos;
    public JButton btnTratamiento;
    public PanelBotones pnlBotones;
    public SubPanelDatos subPanel;

    public PanelBotonesP(int btnSeleccionado) {
        this.iniciarComponentes(btnSeleccionado);
    }        
    
    private void iniciarComponentes(int btnSeleccionado){
        this.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        Box caja = Box.createVerticalBox();        
        
        subPanel = new SubPanelDatos();
        
        
        JPanel pnlBotones1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));        
        this.btnTratamiento = new JButton("Tratamiento");
        pnlBotones1.add(this.btnTratamiento);        
        
        this.btnDocumentos = new JButton ("Documentos");
        pnlBotones1.add(this.btnDocumentos);                
        
        pnlBotones1.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlBotones1);
        
        this.pnlBotones = new PanelBotones(btnSeleccionado);
        caja.add(this.pnlBotones);
        
        this.add(caja);
        
        this.setBackground(new java.awt.Color(134, 204, 161));
    }
    
}
