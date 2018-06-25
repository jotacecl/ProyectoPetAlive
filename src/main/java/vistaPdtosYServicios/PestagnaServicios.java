/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaPdtosYServicios;

import componentes.PanelBotones;
import componentes.PanelTabla;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Juan Carlos
 */
public class PestagnaServicios extends JPanel{
    
    public PanelTabla pnlTabla;
    public PanelBotones pnlBotones;
    private VentanaServicio vServicio;
    
    public PestagnaServicios(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        this.setLayout(new BorderLayout());
        this.setName("Servicios");
        
        this.pnlTabla = new PanelTabla("Servicios (Vacunas, Baños, Peluqueria, etc)");
        this.pnlTabla.addColumn("Nombre");
        this.pnlTabla.addColumn("Descripción");        
        this.pnlTabla.addColumn("Precio");
        this.add(this.pnlTabla, BorderLayout.CENTER);
        
        this.pnlBotones = new PanelBotones(1);
        this.add(this.pnlBotones, BorderLayout.SOUTH);
    }
    
}
