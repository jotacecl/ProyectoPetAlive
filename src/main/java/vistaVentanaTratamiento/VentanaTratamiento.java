/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaVentanaTratamiento;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import vistaVentanaInsumos.VentanaInsumos;

/**
 *
 * @author Juan Carlos
 */
public class VentanaTratamiento extends JFrame implements ActionListener{
    private PanelBotones pBtn;
    private PanelTexto pText;
    private VentanaInsumos vIns;
    
    public VentanaTratamiento(){
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){                
        
        this.pText = new PanelTexto();
        this.add(this.pText, BorderLayout.CENTER);
        
        this.pBtn = new PanelBotones();
        this.add(this.pBtn, BorderLayout.SOUTH);
        
        this.pBtn.btnGuardar.addActionListener(this);
        this.pBtn.btnInsumos.addActionListener(this);
                
        this.setDefaultCloseOperation(VentanaTratamiento.HIDE_ON_CLOSE);
        this.setTitle("Tratamiento Paciente");
        this.setLocation(100,100);
        this.setVisible(true);
        this.setResizable(false);
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.pBtn.btnInsumos == e.getSource()){
            this.vIns = new VentanaInsumos();
        }
    }
    
    
}
