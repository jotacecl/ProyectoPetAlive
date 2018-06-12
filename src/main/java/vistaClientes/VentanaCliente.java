/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaClientes;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Carlos
 */
public class VentanaCliente extends JFrame implements ActionListener{
    
    public PanelBotones pnlBotones;
    public PanelDatos pnlDatos;
    
    public VentanaCliente(int btnSeleccionado){
        this.iniciarComponentes(btnSeleccionado);
    }
    
    private void iniciarComponentes(int btnSeleccionado){
                     
        this.pnlDatos = new PanelDatos();
        this.add(this.pnlDatos, BorderLayout.CENTER);
        
        this.pnlBotones = new PanelBotones(btnSeleccionado);
        this.add(this.pnlBotones, BorderLayout.SOUTH);
        
        this.setBackground(new java.awt.Color(134, 204, 161));
        this.setName("Datos Cliente");
        
        this.pnlBotones.btnGuardar.addActionListener(this);
        this.pnlBotones.btnCancelar.addActionListener(this);
        
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setTitle("Datos del Cliente");
        this.setLocation(50,50);
        this.setVisible(true);
        this.setResizable(false);
        pack();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.pnlBotones.btnGuardar == e.getSource()){
                JOptionPane.showMessageDialog(null,"Esta funcion aun no se implementa\n" + "Proximamente: Se agrega funcion para desplegar documento de texto del diagnostico.\n"+"En caso de no ser posible, el diagnostico se desplegara en una ventana distinta."); 
            }else if(this.pnlBotones.btnCancelar == e.getSource()){
                JOptionPane.showMessageDialog(null,"Esta funcion aun no se implementa\n" + "Proximamente: Se agrega funcion para desplegar documento de texto del diagnostico.\n"+"En caso de no ser posible, el diagnostico se desplegara en una ventana distinta."); 
            }    
        }
    
}
