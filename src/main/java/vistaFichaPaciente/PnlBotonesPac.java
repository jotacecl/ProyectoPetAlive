/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaFichaPaciente;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author HernySenpai
 */
public class PnlBotonesPac extends JPanel{
    public JButton verTratamiento;
    public JButton verDiagnostico;

    public PnlBotonesPac() {
        this.iniciarComponentes();
    }        
    
    private void iniciarComponentes(){
        FlowLayout distribucion = new FlowLayout(FlowLayout.RIGHT);
        this.verTratamiento = new JButton("Ver tratamiento");
        this.add(this.verTratamiento);        
        
        this.verDiagnostico = new JButton ("Ver diagnostico");
        this.add(this.verDiagnostico);
        this.setLayout(distribucion);
        
        this.setBackground(new java.awt.Color(134, 204, 161));
    }
    
}
