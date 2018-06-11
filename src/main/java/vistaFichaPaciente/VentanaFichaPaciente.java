/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaFichaPaciente;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import vistaVentanaInsumos.VentanaInsumos;
import vistaVentanaTratamiento.VentanaTratamiento;

/**
 *
 * @author HernySenpai
 */
public class VentanaFichaPaciente extends JFrame implements ActionListener{
    
    private VentanaInsumos vIns;
    private VentanaTratamiento vTrat;
    public PanelDatos pnlDatos;
    public PanelAMedicos pnlAMedicos;
    public  PanelBotonesP pnlBotones;
    
    
    private void iniciarComponentes(){        
        
        this.pnlDatos = new PanelDatos();   
        
        this.pnlAMedicos = new PanelAMedicos();
        
        this.pnlBotones = new PanelBotonesP();
        
                
        this.setBackground(new java.awt.Color(134, 204, 161));
        this.setName("Datos paciente");
                
        this.pnlBotones.btnDiagnostico.addActionListener(this);        
        this.pnlBotones.btnTratamiento.addActionListener(this);
        this.add(this.pnlDatos, BorderLayout.NORTH);
        this.add(this.pnlAMedicos, BorderLayout.CENTER);
        this.add(this.pnlBotones, BorderLayout.SOUTH);
        
        this.setBackground(new java.awt.Color(134, 204, 161));
        this.setVisible(true);
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
        if(this.pnlBotones.btnDiagnostico == e.getSource()){
            JOptionPane.showMessageDialog(null,"Esta funcion aun no se implementa\n" + "Proximamente: Se agrega funcion para desplegar documento de texto del diagnostico.\n"+"En caso de no ser posible, el diagnostico se desplegara en una ventana distinta."); 
        }else if(this.pnlBotones.btnTratamiento == e.getSource()){
            this.vTrat = new VentanaTratamiento();
        }
    }
    
    
    
}
