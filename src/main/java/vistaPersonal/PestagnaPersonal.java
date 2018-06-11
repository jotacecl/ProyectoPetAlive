/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaPersonal;

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
public class PestagnaPersonal extends JPanel implements ActionListener{
    
    public PanelTabla pnlTabla;
    public PanelBotones pnlBotones;
    private VentanaPersonal vPersonal;
    
    public PestagnaPersonal(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        this.setLayout(new BorderLayout());
        this.setName("Personal");
        
        this.pnlTabla = new PanelTabla("Personal de la clinica/consulta");
        this.pnlTabla.addColumn("ID");
        this.pnlTabla.addColumn("Nombres");
        this.pnlTabla.addColumn("Apellidos");        
        this.pnlTabla.addColumn("Ciudad");
        this.pnlTabla.addColumn("Teléfono");
        this.pnlTabla.addColumn("Móvil");
        this.pnlTabla.addColumn("Email");
        this.pnlTabla.addColumn("Cargo");
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
            this.vPersonal = new VentanaPersonal(2);
        }else if(this.pnlBotones.btnAnnadir == e.getSource()){
            this.vPersonal = new VentanaPersonal(3);
        }
        
    }
    
}
