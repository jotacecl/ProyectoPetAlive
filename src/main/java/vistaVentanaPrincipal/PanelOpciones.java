/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaVentanaPrincipal;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Juan Carlos
 */
public class PanelOpciones extends JPanel{
    
    public JButton btnTabla, btnJaula;
    
    public PanelOpciones(){
        this.inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        GridLayout distribucion = new GridLayout(2,1);
        this.setLayout(distribucion);
        
        this.btnTabla = new JButton("Ver pacientes");
        this.add(this.btnTabla);
        
        this.btnJaula = new JButton("Ver Jaulas");
        this.add(this.btnJaula);
        
    }
    
}
