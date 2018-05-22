/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaDetalleInsumos;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author HernySenpai
 */
public class PanelSupDetalleIns extends JPanel {
    private JLabel insumo;
    private JLabel cantidad;
    private JLabel costo;
    
    private JTextField ingInsumo;
    private JTextField ingCantidad;
    private JTextField ingCosto;

    public PanelSupDetalleIns() {
        this.inicializarComponentes();
    }
    
    
    
    private void inicializarComponentes(){
        GridLayout distribucion = new GridLayout(3,2);
        
        this.insumo = new JLabel("Insumo/Procedimiento");
        this.add(this.insumo);
        
        this.ingInsumo = new JTextField(6);
        this.add(ingInsumo);
        
        this.cantidad = new JLabel("Cantidad");
        this.add(this.cantidad);
        
        this.ingCantidad = new JTextField(6);
        this.add(this.ingCantidad);
        
        this.costo = new JLabel("Costo");
        this.add(this.costo);
        
        this.ingCosto = new JTextField(6);
        this.add(ingCosto);
        
        this.setLayout(distribucion);
    }
}
