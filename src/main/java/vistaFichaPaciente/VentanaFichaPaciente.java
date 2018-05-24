/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaFichaPaciente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import vistaVentanaInsumos.VentanaInsumos;
import vistaVentanaPacientes.VentanaPacientes;
import vistaVentanaTratamiento.VentanaTratamiento;

/**
 *
 * @author HernySenpai
 */
public class VentanaFichaPaciente extends JFrame implements ActionListener{
    
    private VentanaInsumos vIns;
    private VentanaTratamiento vTrat;
    private PestagnaPaciente pestPaciente;
    private PestagnaResponsable pestResponsable;
    
    private Pestagna pest;
    
    private void iniciarComponentes(){
        
        this.pest = new Pestagna();
        this.pest.pPac.panelInf.verDiagnostico.addActionListener(this);
        this.pest.pResp.panelInf.verDetalle.addActionListener(this);
        this.pest.pPac.panelInf.verTratamiento.addActionListener(this);
        this.add(this.pest);
        
        this.setBackground(new java.awt.Color(134, 204, 161));
        this.setVisible(true);
        this.setDefaultCloseOperation(VentanaPacientes.HIDE_ON_CLOSE);
        this.setTitle("Ficha del paciente");
        this.setLocation(100,100);
        this.setResizable(false);
        
        pack();
    }

    public VentanaFichaPaciente() {
        iniciarComponentes();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.pest.pPac.panelInf.verDiagnostico == e.getSource()){
            JOptionPane.showMessageDialog(null,"Esta funcion aun no se implementa\n" + "Proximamente: Se agrega funcion para desplegar documento de texto del diagnostico.\n"+"En caso de no ser posible, el diagnostico se desplegara en una ventana distinta."); 
        }else if(this.pest.pPac.panelInf.verTratamiento == e.getSource()){
            this.vTrat = new VentanaTratamiento();
        }else if(this.pest.pResp.panelInf.verDetalle == e.getSource()){
            this.vIns = new VentanaInsumos();
        }
    }
    
    
    
}
