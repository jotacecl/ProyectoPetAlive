/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaCitas;

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
public class PestagnaCitas extends JPanel implements ActionListener{
    
    private VentanaCita vCita;
    private PanelTabla pnlTabla;
    private PanelBotones pnlBotones;
    
    public PestagnaCitas(){
     this.iniciarComponentes();
    }            
    
    private void iniciarComponentes(){
        this.setLayout(new BorderLayout());
        this.setName("Citas");
        
        this.pnlTabla = new PanelTabla("Pacientes");
        this.pnlTabla.addColumn("ID Paciente");
        this.pnlTabla.addColumn("Paciente");
        this.pnlTabla.addColumn("RUT Cliente");
        this.pnlTabla.addColumn("Fecha ingreso");           
        this.pnlTabla.addColumn("Fecha cita");
        this.pnlTabla.addColumn("Motivo");
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
            this.vCita = new VentanaCita(2);
        }else if(this.pnlBotones.btnAnnadir == e.getSource()){
            this.vCita = new VentanaCita(3);
        }
        
    }
    
}
