/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaPersonal;

import componentes.PanelBotones;
import componentes.PanelTabla;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Juan Carlos
 */
public class PestagnaPersonal extends JPanel{
    
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
        this.pnlTabla.addColumn("Nombres");
        this.pnlTabla.addColumn("Apellidos");   
        this.pnlTabla.addColumn("RUT"); 
        this.pnlTabla.addColumn("Ciudad");
        this.pnlTabla.addColumn("Teléfono");
        this.pnlTabla.addColumn("Móvil");
        this.pnlTabla.addColumn("Email");
        this.pnlTabla.addColumn("Cargo");
        this.add(this.pnlTabla, BorderLayout.CENTER);
        
        this.pnlBotones = new PanelBotones(1);
        this.add(this.pnlBotones, BorderLayout.SOUTH);
    }
       
}
