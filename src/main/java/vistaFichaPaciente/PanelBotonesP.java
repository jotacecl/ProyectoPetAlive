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
public class PanelBotonesP extends JPanel{
    
    public JButton btnTratamiento, btnDiagnostico, btnPagar;    

    public PanelBotonesP() {
        this.iniciarComponentes();
    }        
    
    private void iniciarComponentes(){
        FlowLayout distribucion = new FlowLayout(FlowLayout.RIGHT);
        this.btnTratamiento = new JButton("Tratamiento");
        this.add(this.btnTratamiento);        
        
        this.btnDiagnostico = new JButton ("Diagnostico");
        this.add(this.btnDiagnostico);
        
        this.btnPagar = new JButton("Pagar tratamiento");
        this.add(this.btnPagar);
        
        this.setLayout(distribucion);
        
        this.setBackground(new java.awt.Color(134, 204, 161));
    }
    
}
