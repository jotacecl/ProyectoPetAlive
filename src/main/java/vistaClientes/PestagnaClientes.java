/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaClientes;

import componentes.PanelBotones;
import componentes.PanelTabla;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Juan Carlos
 */
public class PestagnaClientes extends JPanel{
    
    public PanelTabla panelTabla;
    public PanelBotones panelBtn;
    
    public PestagnaClientes(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        this.setLayout(new BorderLayout());
        this.setName("Clientes");
        
        this.panelTabla = new PanelTabla("Clientes");
        this.panelTabla.addColumn("Nombres");
        this.panelTabla.addColumn("Apellidos");
        this.panelTabla.addColumn("RUT");
        this.panelTabla.addColumn("Ciudad");
        this.panelTabla.addColumn("Teléfono");
        this.panelTabla.addColumn("Móvil");
        this.panelTabla.addColumn("Email");
        this.add(this.panelTabla, BorderLayout.CENTER);
        
        this.panelBtn = new PanelBotones(1);
        this.add(this.panelBtn, BorderLayout.SOUTH);
    }

    
}
