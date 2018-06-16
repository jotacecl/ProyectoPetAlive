/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaVentanaInicio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import vistaJaulas.VentanaCJaulas;
import modelo.Sistema;
import vistaDatosClinica.VentanaDClinica;

/**
 *
 * @author Juan Carlos
 */
public class VentanaInicio extends JFrame implements ActionListener{    
    
    public PestagnasInicio pPestagnas;
    public VentanaCJaulas vJaulas;  
    public VentanaDClinica vDClinica;
    private Sistema system;
    
    
    public VentanaInicio(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        
        system = new Sistema();
       
       try {
//		UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
	} catch (Exception e) {
		e.printStackTrace();
	}        
       
        this.pPestagnas = new PestagnasInicio();        
        this.add(pPestagnas);        
        
        this.vJaulas = new VentanaCJaulas();
        this.vJaulas.setVisible(false);
        
        this.system.iniciarDClinica();
        
        this.pPestagnas.pConfig.pOpciones.bJaulas.addActionListener(this);
        this.pPestagnas.pConfig.pOpciones.bDatosClinica.addActionListener(this);
        this.vJaulas.pnlBotones.btnGuardar.addActionListener(this);
        this.system.vDClinica.pnlBotones.btnGuardar.addActionListener(this);
                           

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Veterinaria");
        this.setLocation(50,50);
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(1100, 720);
        
    }
    
    public void capturarDatos(){
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.pPestagnas.pConfig.pOpciones.bJaulas == e.getSource()){
            this.vJaulas.setVisible(true);            
        }else if(this.vJaulas.pnlBotones.btnGuardar == e.getSource()){
            system.actualizarJaulas(pPestagnas, vJaulas);
        }else if(this.pPestagnas.pConfig.pOpciones.bDatosClinica == e.getSource()){
            this.system.iniciarDClinica();
            this.system.vDClinica.pnlBotones.btnGuardar.addActionListener(this);
            this.system.vDClinica.setVisible(true);                    
            
        }else if(this.system.vDClinica.pnlBotones.btnGuardar == e.getSource()){
            this.system.setDatosClinica();            
        }
    }
    
}
