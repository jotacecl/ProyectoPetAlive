/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaFichaPaciente;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author HernySenpai
 */
public class PestPacPanelInf extends JPanel{
    private JButton verTratamiento;
    private JButton verDiagnostico;

    public PestPacPanelInf() {
        this.inicializarComponentes();
    }
    
    
    
    private void inicializarComponentes(){
        GridLayout distribucion = new GridLayout();
        this.verTratamiento = new JButton("Ver tratamiento");
        this.add(this.verTratamiento);
        
        this.verDiagnostico = new JButton ("Ver diagnostico");
        this.add(this.verDiagnostico);
        this.setLayout(distribucion);
    }
    
}
