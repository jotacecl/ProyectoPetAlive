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
    
    public PanelTabla panelTabla;
    public PanelBotones panelBtn;
    
    public PestagnaServicios(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        this.setLayout(new BorderLayout());
        this.setName("Servicios");
        
        this.panelTabla = new PanelTabla("Servicios (Vacunas, Baños, Peluqueria, etc)");
        this.panelTabla.addColumn("Nombre");
        this.panelTabla.addColumn("Descripción");        
        this.panelTabla.addColumn("Precio");
        this.add(this.panelTabla, BorderLayout.CENTER);
        
        this.panelBtn = new PanelBotones(1);
        this.panelBtn.btnAbrir.addActionListener(this);
        this.panelBtn.btnAnnadir.addActionListener(this);
        this.panelBtn.btnEliminar.addActionListener(this);
        this.add(this.panelBtn, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
