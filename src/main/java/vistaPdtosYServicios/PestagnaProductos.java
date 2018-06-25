/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaPdtosYServicios;

import componentes.PanelTabla;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import componentes.PanelBotones;

/**
 *
 * @author Juan Carlos
 */
public class PestagnaProductos extends JPanel{
    
    public PanelTabla pnlTabla;
    public PanelBotones pnlBotones;
    private VentanaProducto vProducto;
    
    public PestagnaProductos(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        this.setLayout(new BorderLayout());
        this.setName("Productos");
        
        this.pnlTabla = new PanelTabla("Productos disponibles al publico");
        this.pnlTabla.addColumn("ID");
        this.pnlTabla.addColumn("Nombre");
        this.pnlTabla.addColumn("Tipo");
        this.pnlTabla.addColumn("Descripción");
        this.pnlTabla.addColumn("Stock");
        this.pnlTabla.addColumn("Precio Und");
        this.add(this.pnlTabla, BorderLayout.CENTER);
        
        this.pnlBotones = new PanelBotones(1);
        this.add(this.pnlBotones, BorderLayout.SOUTH);
        
    }   
    
}
