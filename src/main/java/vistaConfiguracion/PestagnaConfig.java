/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaConfiguracion;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import vistaDatosClinica.VentanaDClinica;
import vistaHorario.VentanaHorario;
import vistaJaulas.VentanaCJaulas;
import vistaPersonalizacion.VentanaPersonalizacion;

/**
 *
 * @author Juan Carlos
 */
public class PestagnaConfig extends JPanel {
    
    public PanelOpciones pOpciones;
    public PanelLogo pLogo;
    private VentanaDClinica vDClinica;
    private VentanaHorario vHorario;
    public VentanaCJaulas vCJaulas;
    private VentanaPersonalizacion vPersonalizar;
    private VentanaAcerca vAcerca;    
    
    public PestagnaConfig(){        
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        this.setLayout(new BorderLayout());
        
        this.setName("Configuración");
        
        this.pOpciones = new PanelOpciones();
        this.pLogo = new PanelLogo();
        
//        this.pOpciones.bDatosClinica.addActionListener(this);
//        this.pOpciones.bHorario.addActionListener(this);
//        this.pOpciones.bJaulas.addActionListener(this);
        
        this.pOpciones.bPersonalizar.setEnabled(false);
        
//        this.pOpciones.bPersonalizar.addActionListener(this);
//        this.pOpciones.bAcerca.addActionListener(this);
        
        this.add(pLogo, BorderLayout.EAST);
        this.add(pOpciones, BorderLayout.CENTER);                
        
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if(this.pOpciones.bDatosClinica == e.getSource()){
//            this.vDClinica = new VentanaDClinica();
//        }else if(this.pOpciones.bHorario == e.getSource()){
//            this.vHorario = new VentanaHorario();
//        }else if(this.pOpciones.bJaulas == e.getSource()){
//            this.vCJaulas = new VentanaCJaulas();
//        }else if(this.pOpciones.bPersonalizar == e.getSource()){
//            this.vPersonalizar = new VentanaPersonalizacion();
//        }else if(this.pOpciones.bAcerca == e.getSource()){
//            this.vAcerca = new VentanaAcerca();
//        }
//    }
    
}
