/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaFichaPaciente;

import componentes.PanelBotones;
import componentes.SubPanelDatos;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author HernySenpai
 */
public class PanelBotonesP extends JPanel{
    
    public JButton btnTratamiento, btnDiagnostico, btnPagar;  
    public PanelBotones pnlBotones;
    public SubPanelDatos subPanel;

    public PanelBotonesP(int btnSeleccionado) {
        this.iniciarComponentes(btnSeleccionado);
    }        
    
    private void iniciarComponentes(int btnSeleccionado){
        
        Box caja = Box.createVerticalBox();        
        
        subPanel = new SubPanelDatos();
        
        
        JPanel pnlBotones1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));        
        this.btnTratamiento = new JButton("Tratamiento");
        pnlBotones1.add(this.btnTratamiento);        
        
        this.btnDiagnostico = new JButton ("Diagnostico");
        pnlBotones1.add(this.btnDiagnostico);
        
        this.btnPagar = new JButton("Pagar tratamiento");
        pnlBotones1.add(this.btnPagar);
        
        pnlBotones1.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlBotones1);
        
        this.pnlBotones = new PanelBotones(btnSeleccionado);
        caja.add(this.pnlBotones);
        
        this.add(caja);
        
        this.setBackground(new java.awt.Color(134, 204, 161));
    }
    
}
