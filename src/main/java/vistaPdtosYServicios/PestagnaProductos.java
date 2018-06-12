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
        this.pnlBotones.btnAbrir.addActionListener(this);
        this.pnlBotones.btnAnnadir.addActionListener(this);
        this.pnlBotones.btnEliminar.addActionListener(this);
        this.add(this.pnlBotones, BorderLayout.SOUTH);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.pnlBotones.btnAbrir == e.getSource()){
            this.vProducto = new VentanaProducto(2);
        }else if(this.pnlBotones.btnAnnadir == e.getSource()){
            this.vProducto = new VentanaProducto(3);
        }
    }
    
}
