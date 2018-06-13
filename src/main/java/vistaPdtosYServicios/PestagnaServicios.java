/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaPdtosYServicios;

import componentes.PanelBotones;
import componentes.PanelTabla;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author Juan Carlos
 */
public class PestagnaServicios extends JPanel implements ActionListener{
    
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
        this.pnlBotones.btnAbrir.addActionListener(this);
        this.pnlBotones.btnAnnadir.addActionListener(this);
        this.pnlBotones.btnEliminar.addActionListener(this);
        this.add(this.pnlBotones, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.pnlBotones.btnAbrir == e.getSource() ){
            this.vServicio = new VentanaServicio(2);
        }else if(this.pnlBotones.btnAnnadir == e.getSource()) {
            this.vServicio = new VentanaServicio(3);
        }
    }
    
}
