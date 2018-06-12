/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaClientes;

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
public class PestagnaClientes extends JPanel implements ActionListener{
    
    public PanelTabla panelTabla;
    public PanelBotones panelBtn;
    private VentanaCliente vCliente;
    
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
        this.panelBtn.btnAbrir.addActionListener(this);
        this.panelBtn.btnAnnadir.addActionListener(this);
        this.panelBtn.btnEliminar.addActionListener(this);
        this.add(this.panelBtn, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.panelBtn.btnAbrir == e.getSource()){
            this.vCliente = new VentanaCliente(1);
        }else if(this.panelBtn.btnAnnadir == e.getSource()){
            this.vCliente = new VentanaCliente(2);
        }else if(this.panelBtn.btnEliminar == e.getSource()){            
        }
    }
    
}
