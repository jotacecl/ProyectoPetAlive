/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaFichaPaciente;

import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author HernySenpai
 */
public class PestDatosRespnPanelSup extends JPanel {
    private JLabel nombre;
    private JLabel rut;
    private JLabel contacto;
    private JLabel contacto2;
    private JLabel direccion;
    private JLabel metodoPago;
    
    private JTextField ingNombre;
    private JTextField ingRut;
    private JTextField ingContacto;
    private JTextField ingContacto2;
    private JTextField ingDireccion;
    private JComboBox ingMetodo;

    public PestDatosRespnPanelSup() {
        this.inicializarComponentes();
    }
    
    
    
    
    private void inicializarComponentes(){
        GridLayout distribucion = new GridLayout(6,2);
        
        this.nombre = new JLabel("Nombre");
        this.add(this.nombre);
        
        this.ingNombre = new JTextField(6);
        this.add(this.ingNombre);
        
        this.rut = new JLabel("RUT");
        this.add(this.ingRut);
        
        this.ingRut = new JTextField(6);
        this.add(this.ingRut);
        
        this.contacto = new JLabel("Contacto");
        this.add(this.contacto);
        
        this.contacto2 = new JLabel("Contacto 2");
        this.add(this.contacto2);
        
        this.ingContacto2 = new JTextField(6);
        this.add(this.ingContacto2);
        
        this.direccion = new JLabel("Dirección");
        this.add(this.direccion);
        
        this.ingDireccion = new JTextField(6);
        this.add(this.ingDireccion);
        
        this.metodoPago = new JLabel("Metodo de pago");
        this.add(this.metodoPago);
        
        this.ingMetodo = new JComboBox();
        this.add(this.ingMetodo);
        
        this.setLayout(distribucion);
    }
}
