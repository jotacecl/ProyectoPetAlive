/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaFichaPaciente;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author HernySenpai
 */
public class PestPacPanelSup extends JPanel{
    private JLabel paciente;
    private JLabel tipo;
    private JLabel raza;
    private JLabel fechaNac;
    private JLabel sexo;
    private JLabel internado;
    private JLabel jaula;
    private JTextField ingPaciente;
    private JComboBox comboTipo;
    private JTextField ingTipo;
    private JTextField ingRaza;
    private JTextField ingFechaNacimiento;
    private JRadioButton macho;
    private JRadioButton hembra;
    private JRadioButton si;
    private JRadioButton no;
    private JTextField ingJaula;
    
    private void inicializarComponentes(){
        GridLayout distribucion = new GridLayout(7,3);
        
        this.paciente = new JLabel("Nombre paciente");
        this.add(this.paciente);
        this.ingPaciente = new JTextField();
        this.add(this.ingPaciente);
        
        this.tipo = new JLabel("Tipo");
        this.add(this.tipo);
        this.comboTipo = new JComboBox();
        this.add(this.comboTipo);
        this.ingTipo = new JTextField();
        this.add(this.ingTipo);
        
        this.raza = new JLabel("Raza");
        this.add(this.raza);
        this.ingRaza = new JTextField();
        this.add(this.ingRaza);
        
        this.fechaNac = new JLabel();
        this.add(this.fechaNac);
        this.ingFechaNacimiento = new JTextField();
        this.add(this.ingFechaNacimiento);
        
        this.sexo = new JLabel();
        this.add(this.sexo);
        this.macho = new JRadioButton("Macho");
        this.add(this.macho);
        this.hembra = new JRadioButton("Hembra");
        this.add(this.hembra);
        
        this.internado = new JLabel("Internado");
        this.add(this.internado);
        this.si = new JRadioButton("SI");
        this.add(this.si);
        this.no = new JRadioButton("NO");
        this.add(this.no);
        
        this.jaula = new JLabel("Jaula");
        this.add(this.jaula);
        this.ingJaula = new JTextField();
        this.add(this.ingJaula);
        
        this.setLayout(distribucion);
    }

    public PestPacPanelSup() {
        inicializarComponentes();
    }
    
}
