/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaVentanaInsumos;

import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author HernySenpai
 */
public class PanelIngresoIns extends JPanel {
    private JLabel insumo;
    private JLabel cantidad;
    private JLabel costo;
    
    private JTextField ingInsumo;
    private JTextField ingCantidad;
    private JTextField ingCosto;

    public PanelIngresoIns() {
        this.iniciarComponentes();
    }
    
    
    
    private void iniciarComponentes(){
        Box caja = Box.createVerticalBox();
        
        TitledBorder border = new TitledBorder("Ingrese los datos solicitados");
        border.setTitleColor(new java.awt.Color(54,82,48));
        this.setBorder(border);
        
        JPanel pnlInsumo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.insumo = new JLabel("Insumo/Procedimiento");
        pnlInsumo.add(this.insumo);        
        this.ingInsumo = new JTextField("",20);
        pnlInsumo.add(ingInsumo);
        pnlInsumo.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlInsumo);
        
        JPanel pnlCantidad = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.cantidad = new JLabel("Cantidad                          ");
        pnlCantidad.add(this.cantidad);        
        this.ingCantidad = new JTextField("",20);
        pnlCantidad.add(this.ingCantidad);
        pnlCantidad.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlCantidad);
        
        JPanel pnlCosto = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.costo = new JLabel("Costo                                ");
        pnlCosto.add(this.costo);        
        this.ingCosto = new JTextField("",20);
        pnlCosto.add(ingCosto);
        pnlCosto.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlCosto);
        
        this.setBackground(new java.awt.Color(134, 204, 161));
        
        this.add(caja);
        
    }
}
