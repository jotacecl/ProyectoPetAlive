/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaDetalleInsumos;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author HernySenpai
 */
public class PanelBotonesDetalleIns extends JPanel {
    private JButton agregar;
    private JButton eliminar;

    public PanelBotonesDetalleIns() {
        this.inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        GridLayout distribucion = new GridLayout();
        
        this.agregar = new JButton("Agregar");
        this.add(this.agregar);
        
        this.eliminar = new JButton ("Eliminar");
        this.add(this.eliminar);
        
        this.setLayout(distribucion);
    }
}
