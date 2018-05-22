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
public class PestDatosRespnPanelInf extends JPanel {
    private JButton verDetalle;
    
    private void inicializarComponentes(){
        
        GridLayout distribucion = new GridLayout();
        this.verDetalle = new JButton("Ver detalle insumos");
        this.add(this.verDetalle);
        
        this.setLayout(distribucion);
    }
    
}
