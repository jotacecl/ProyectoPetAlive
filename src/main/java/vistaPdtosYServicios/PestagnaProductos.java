/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaPdtosYServicios;

import componentes.PanelTabla;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import componentes.PanelBotones;

/**
 *
 * @author Juan Carlos
 */
public class PestagnaProductos extends JPanel implements ActionListener{
    
    public PanelTabla panelTabla;
    public PanelBotones panelBtn;
    
    public PestagnaProductos(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        this.setLayout(new BorderLayout());
        this.setName("Productos");
        
        this.panelTabla = new PanelTabla("Productos disponibles al publico");
        this.panelTabla.addColumn("ID");
        this.panelTabla.addColumn("Nombre");
        this.panelTabla.addColumn("Tipo");
        this.panelTabla.addColumn("Descripción");
        this.panelTabla.addColumn("Stock");
        this.panelTabla.addColumn("Precio Und");
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
