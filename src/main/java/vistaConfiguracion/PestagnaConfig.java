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

/**
 *
 * @author Juan Carlos
 */
public class PestagnaConfig extends JPanel implements ActionListener{
    
    public PanelOpciones pOpciones;
    public PanelLogo pLogo;
    private VentanaDClinica vDClinica;
    private VentanaHorario vHorario;
    private VentanaCJaulas vCJaulas;
    
    public PestagnaConfig(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        this.setLayout(new BorderLayout());
        
        this.setName("Configuración");
        
        this.pOpciones = new PanelOpciones();
        this.pLogo = new PanelLogo();
        
        this.pOpciones.bDatosClinica.addActionListener(this);
        this.pOpciones.bHorario.addActionListener(this);
        this.pOpciones.bJaulas.addActionListener(this);
        this.pOpciones.bPersonalizar.addActionListener(this);
        this.pOpciones.bAcerca.addActionListener(this);
        
        this.add(pLogo, BorderLayout.EAST);
        this.add(pOpciones, BorderLayout.CENTER);                
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.pOpciones.bDatosClinica == e.getSource()){
            this.vDClinica = new VentanaDClinica();
        }else if(this.pOpciones.bHorario == e.getSource()){
            this.vHorario = new VentanaHorario();
        }else if(this.pOpciones.bJaulas == e.getSource()){
            this.vCJaulas = new VentanaCJaulas();
        }
    }
    
}
