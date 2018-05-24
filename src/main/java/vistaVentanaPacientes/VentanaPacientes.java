/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaVentanaPacientes;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import vistaFichaPaciente.VentanaFichaPaciente;

/**
 *
 * @author Juan Carlos
 */
public class VentanaPacientes extends JFrame implements ActionListener{
    
    private VentanaFichaPaciente vFicha;
    private PanelTabla panelTabla;
    private PanelBotones panelBtn;
    
    public VentanaPacientes(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        this.panelTabla = new PanelTabla();
        this.add(this.panelTabla, BorderLayout.CENTER);
        
        this.panelBtn = new PanelBotones();
        this.panelBtn.btnAbrir.addActionListener(this);
        this.panelBtn.btnAnnadir.addActionListener(this);
        this.panelBtn.btnEliminar.addActionListener(this);
        this.add(this.panelBtn, BorderLayout.SOUTH);
        
        this.setDefaultCloseOperation(VentanaPacientes.HIDE_ON_CLOSE);
        this.setTitle("Pacientes");
        this.setLocation(100,100);
        this.setVisible(true);
        this.setResizable(false);
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.panelBtn.btnAbrir == e.getSource()){
            this.vFicha = new VentanaFichaPaciente();
        }else if(this.panelBtn.btnAnnadir == e.getSource()){
            this.vFicha = new VentanaFichaPaciente();
        }else if(this.panelBtn.btnEliminar == e.getSource()){
            JOptionPane.showMessageDialog(null,"Esta funcion aun no se implementa\n" + "Proximamente: Se agrega funcion para eliminar al paciente seleccionado"); 
        }
    }
    
}
