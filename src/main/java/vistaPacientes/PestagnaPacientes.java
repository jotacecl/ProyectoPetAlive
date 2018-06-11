/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaPacientes;

import componentes.PanelBotones;
import componentes.PanelTabla;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import vistaFichaPaciente.VentanaFichaPaciente;

/**
 *
 * @author Juan Carlos
 */
public class PestagnaPacientes extends JPanel implements ActionListener{
    
    private VentanaFichaPaciente vFicha;
    private PanelTabla panelTabla;
    private PanelBotones panelBtn;
    
    public PestagnaPacientes(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        this.setLayout(new BorderLayout());
        this.setName("Pacientes");
        
        this.panelTabla = new PanelTabla("Pacientes");
        this.panelTabla.addColumn("ID");
        this.panelTabla.addColumn("Nombre");
        this.panelTabla.addColumn("Especie");
        this.panelTabla.addColumn("Raza");           
        this.panelTabla.addColumn("Color");
        this.panelTabla.addColumn("F.Nacimiento");
        this.panelTabla.addColumn("Sexo");
        this.panelTabla.addColumn("Internado");
        this.panelTabla.addColumn("Jaula");
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
            this.vFicha = new VentanaFichaPaciente();
        }else if(this.panelBtn.btnAnnadir == e.getSource()){
            this.vFicha = new VentanaFichaPaciente();
        }else if(this.panelBtn.btnEliminar == e.getSource()){
            JOptionPane.showMessageDialog(null,"Esta funcion aun no se implementa\n" + "Proximamente: Se agrega funcion para eliminar al paciente seleccionado"); 
        }
    }
    
}
