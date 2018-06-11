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
    private PanelTabla panelTabla;
    private PanelBotones panelBtn;
    
    public PestagnaCitas(){
     this.iniciarComponentes();
    }            
    
    private void iniciarComponentes(){
        this.setLayout(new BorderLayout());
        this.setName("Citas");
        
        this.panelTabla = new PanelTabla("Pacientes");
        this.panelTabla.addColumn("ID Paciente");
        this.panelTabla.addColumn("Paciente");
        this.panelTabla.addColumn("RUT Cliente");
        this.panelTabla.addColumn("Fecha ingreso");           
        this.panelTabla.addColumn("Fecha cita");
        this.panelTabla.addColumn("Motivo");
        this.add(this.panelTabla, BorderLayout.CENTER);
        
        this.panelBtn = new PanelBotones(1);
        this.panelBtn.btnAbrir.addActionListener(this);
        this.panelBtn.btnAnnadir.addActionListener(this);
        this.panelBtn.btnEliminar.addActionListener(this);
        this.add(this.panelBtn, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.panelBtn.btnAbrir == e.getSource()){
            this.vCita = new VentanaCita();
        }
    }
    
}
