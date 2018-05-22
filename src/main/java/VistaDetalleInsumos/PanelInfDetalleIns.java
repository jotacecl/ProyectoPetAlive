/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaDetalleInsumos;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author HernySenpai
 */
public class PanelInfDetalleIns extends JPanel {
    private JLabel total;
    private JTextField mostrarTotal;
    
    public PanelInfDetalleIns() {
        this.inicializarComponentes();
    }
    
    
    private void inicializarComponentes(){
        GridLayout distribucion = new GridLayout();
        
        this.total = new JLabel("Total");
        this.add(this.total);
        
        this.mostrarTotal = new JTextField(8);
        this.add(this.mostrarTotal);
        
        this.setLayout(distribucion);
    }
}
