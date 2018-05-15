/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaVentanaPrincipal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Juan Carlos
 */
public class PanelFicha extends JPanel{       
    
    private JLabel labNombrePaciente, labNombrePersona, labRut, labTelefono, labTAnimal, labRaza;
    private JTextField txtNombrePaciente, txtNombrePersona, txtRut, txtTelefono, txtRaza, txtTOtro;
    private JComboBox cbTAnimal;
    private JPanel pTAnimal1, pTAnimal2, pTAnimal, pNombPac, pNomPer, pRut, pTelf, pRaza;
    
    public PanelFicha(){
        this.inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        
        Box caja = Box.createVerticalBox();
        
        TitledBorder border = new TitledBorder(" Ficha Paciente ");
        this.setBorder(border);
       
        pNombPac = new JPanel (new BorderLayout());
        this.labNombrePaciente = new JLabel("Paciente ");
        this.txtNombrePaciente = new JTextField(" ", 20); 
        pNombPac.add(this.labNombrePaciente, BorderLayout.WEST);
        pNombPac.add(this.txtNombrePaciente, BorderLayout.EAST);
        caja.add(pNombPac);
        
        pTAnimal1 = new JPanel();
        pTAnimal1.setLayout(new BorderLayout());
        this.labTAnimal = new JLabel("Tipo de animal ");
        this.cbTAnimal = new JComboBox();
        this.cbTAnimal.addItem("Canis");
        this.cbTAnimal.addItem("Felido");
        this.cbTAnimal.addItem("Otro");
        pTAnimal1.add(this.labTAnimal, BorderLayout.WEST);
        pTAnimal1.add(this.cbTAnimal, BorderLayout.EAST);
        
        pTAnimal2 = new JPanel();
        pTAnimal2.setLayout(new BorderLayout());
        this.txtTOtro = new JTextField(" ", 20);
        this.txtTOtro.setEditable(false);        
        pTAnimal2.add(this.txtTOtro, BorderLayout.EAST);        
        
        pTAnimal = new JPanel(new BorderLayout());
        pTAnimal.add(pTAnimal1, BorderLayout.WEST);
        pTAnimal.add(pTAnimal2, BorderLayout.EAST);
        caja.add(pTAnimal);
        
        
        pRaza = new JPanel(new BorderLayout());
        this.labRaza = new JLabel("Raza ");
        this.txtRaza = new JTextField(" ", 20);
        pRaza.add(this.labRaza, BorderLayout.WEST);
        pRaza.add(this.txtRaza, BorderLayout.EAST);
        caja.add(pRaza);
        
        this.add(caja);
        
                
        
        
    }
    
}
