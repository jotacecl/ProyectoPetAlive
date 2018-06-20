/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaVentanaInicio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import modelo.Sistema;
import vistaConfiguracion.VentanaAcerca;


/**
 *
 * @author Juan Carlos
 */
public class VentanaInicio extends JFrame implements ActionListener{    
       
    public VentanaAcerca vAcerca;
    private Sistema system;
    
    
    public VentanaInicio(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        
        system = new Sistema();
       
        try {
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
	} catch (Exception e) {
		e.printStackTrace();
	}        
                     
        this.add(this.system.pPestagnas);                                          
        
        this.system.pPestagnas.pConfig.pOpciones.bJaulas.addActionListener(this);
        this.system.pPestagnas.pConfig.pOpciones.bDatosClinica.addActionListener(this);
        this.system.pPestagnas.pConfig.pOpciones.bHorario.addActionListener(this);
        this.system.pPestagnas.pConfig.pOpciones.bAcerca.addActionListener(this);
        this.system.pPestagnas.pFicheros.pClientes.panelBtn.btnAbrir.addActionListener(this);
        this.system.pPestagnas.pFicheros.pClientes.panelBtn.btnAnnadir.addActionListener(this);
        this.system.pPestagnas.pFicheros.pPacientes.panelBtn.btnAbrir.addActionListener(this);
        this.system.pPestagnas.pFicheros.pPacientes.panelBtn.btnAnnadir.addActionListener(this);
        this.system.vCliente.pnlDatos.btnAgregarC.addActionListener(this);
        this.system.vCliente.pnlDatos.btnAgregarR.addActionListener(this);
        this.system.vCJaulas.pnlBotones.btnGuardar.addActionListener(this);
        this.system.vDClinica.pnlBotones.btnGuardar.addActionListener(this);
        this.system.vCHorario.pnlBotones.btnAceptar.addActionListener(this);
        this.system.vCliente.pnlBotones.btnGuardar.addActionListener(this);
        this.system.vCliente.pnlBotones.btnAceptar.addActionListener(this);
        this.system.vFPaciente.pnlBotones.pnlBotones.btnGuardar.addActionListener(this);
        this.system.vFPaciente.pnlBotones.pnlBotones.btnAceptar.addActionListener(this);
        this.system.vFPaciente.pnlDatos.btnBusqueda.addActionListener(this);
        this.system.vFPaciente.pnlDatos.btnAgregar.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Veterinaria");
        this.setLocation(50,50);
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(1100, 720);
        
    }        

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.system.pPestagnas.pConfig.pOpciones.bJaulas == e.getSource()){
            this.system.iniciarCJaulas();
            this.system.vCJaulas.pnlBotones.btnGuardar.addActionListener(this);
            this.system.vCJaulas.setVisible(true);            
        }else if(this.system.vCJaulas.pnlBotones.btnGuardar == e.getSource()){
            this.system.setDatosJaula();
            this.system.vCJaulas.hide();
            this.system.actualizarJaulas();
        }else if(this.system.pPestagnas.pConfig.pOpciones.bDatosClinica == e.getSource()){
            this.system.iniciarDClinica();
            this.system.vDClinica.pnlBotones.btnGuardar.addActionListener(this);
            this.system.vDClinica.setVisible(true);                                
        }else if(this.system.vDClinica.pnlBotones.btnGuardar == e.getSource()){
            this.system.setDatosClinica();          
            this.system.vDClinica.hide();
        }else if(this.system.pPestagnas.pConfig.pOpciones.bHorario == e.getSource()){
            this.system.iniciarCHorario();
            this.system.vCHorario.pnlBotones.btnAceptar.addActionListener(this);
            this.system.vCHorario.setVisible(true);
        }else if(this.system.vCHorario.pnlBotones.btnAceptar == e.getSource()){
            this.system.setDatosHorario();
            this.system.vCHorario.hide();
        }else if(this.system.pPestagnas.pConfig.pOpciones.bAcerca == e.getSource()){
            this.vAcerca = new VentanaAcerca();            
        }else if(this.system.pPestagnas.pFicheros.pClientes.panelBtn.btnAbrir == e.getSource()){
            this.system.iniciarCliente(1);
            this.system.vCliente.pnlBotones.btnAceptar.addActionListener(this);
            this.system.vCliente.pnlDatos.btnAgregarC.addActionListener(this);
            this.system.vCliente.pnlDatos.btnAgregarR.addActionListener(this);
            this.system.vCliente.setVisible(true);
        }else if(this.system.vCliente.pnlDatos.btnAgregarC == e.getSource()){
            String ciudad = JOptionPane.showInputDialog(null, "Introduce la ciudad");            
            this.system.setCiudades(ciudad);           
        }else if(this.system.vCliente.pnlDatos.btnAgregarR == e.getSource()){
            String region = JOptionPane.showInputDialog(null, "Introduce la region");            
            this.system.setRegiones(region);
        }else if(this.system.pPestagnas.pFicheros.pClientes.panelBtn.btnAnnadir == e.getSource()){           
            this.system.iniciarCliente(2);
            this.system.vCliente.pnlBotones.btnGuardar.addActionListener(this);
            this.system.vCliente.pnlDatos.btnAgregarC.addActionListener(this);
            this.system.vCliente.pnlDatos.btnAgregarR.addActionListener(this);
            this.system.vCliente.setVisible(true);
        }else if(this.system.vCliente.pnlBotones.btnGuardar == e.getSource()){
            this.system.crearCliente();
            this.system.vCliente.hide();            
        }else if(this.system.vCliente.pnlBotones.btnAceptar == e.getSource()){
            int index = this.system.pPestagnas.pFicheros.pClientes.panelTabla.tabla.getSelectedRow();
            this.system.editarCliente(index);
        }else if(this.system.pPestagnas.pFicheros.pPacientes.panelBtn.btnAbrir == e.getSource()){
            this.system.iniciarFPaciente(1);
            this.system.vFPaciente.pnlBotones.pnlBotones.btnAceptar.addActionListener(this);
            this.system.vFPaciente.pnlDatos.btnBusqueda.addActionListener(this);
            this.system.vFPaciente.pnlDatos.btnAgregar.addActionListener(this);
            this.system.vFPaciente.setVisible(true);
        }else if(this.system.pPestagnas.pFicheros.pPacientes.panelBtn.btnAnnadir == e.getSource()){
            this.system.iniciarFPaciente(2);
            this.system.vFPaciente.pnlBotones.pnlBotones.btnGuardar.addActionListener(this);
            this.system.vFPaciente.pnlDatos.btnBusqueda.addActionListener(this);
            this.system.vFPaciente.pnlDatos.btnAgregar.addActionListener(this);
            this.system.vFPaciente.setVisible(true);
        }else if(this.system.vFPaciente.pnlBotones.pnlBotones.btnGuardar == e.getSource()){            
            this.system.crearFPaciente();
            this.system.vFPaciente.hide();
        }else if(this.system.vFPaciente.pnlDatos.btnAgregar == e.getSource()){
            String especie = JOptionPane.showInputDialog(null, "Introduce una nueva especie");
            this.system.setEspecie(especie);
        }else if(this.system.vFPaciente.pnlBotones.pnlBotones.btnAceptar == e.getSource()){
            int index = this.system.pPestagnas.pFicheros.pPacientes.panelTabla.tabla.getSelectedRow();
            this.system.editarFPaciente(index);
        }
    }
    
}
