/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaFichaPaciente;

import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 *
 * @author HernySenpai
 */
public class PnlDatosResp extends JPanel {
    private JLabel labNombre, labRut, labContacto, labContacto2, labDireccion, labMetodoPago;    
    
    private JTextField txtNombre, txtRut, txtContacto, txtContacto2, txtDireccion;    
    private JComboBox cbMetodo;

    public PnlDatosResp() {
        iniciarComponentes();
    }
                
    private void iniciarComponentes(){
        Box caja = Box.createVerticalBox(); 
        
        TitledBorder border = new TitledBorder("");
        this.setBorder(border);
        
        JPanel pnlNombre = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.labNombre = new JLabel("Nombre     ");
        pnlNombre.add(this.labNombre);        
        this.txtNombre = new JTextField("",20);
        pnlNombre.add(this.txtNombre);
        pnlNombre.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlNombre);
        
        JPanel pnlRut = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.labRut = new JLabel("RUT            ");
        pnlRut.add(this.labRut);        
        this.txtRut = new JTextField("",20);
        pnlRut.add(this.txtRut);
        pnlRut.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlRut);
        
        JPanel pnlContacto = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.labContacto = new JLabel("Contacto   ");
        pnlContacto.add(this.labContacto);
        this.txtContacto = new JTextField("", 20);
        pnlContacto.add(this.txtContacto);
        pnlContacto.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlContacto);
        
        JPanel pnlContacto2 = new JPanel(new FlowLayout(FlowLayout.LEFT));        
        this.labContacto2 = new JLabel("Contacto 2");
        pnlContacto2.add(this.labContacto2);        
        this.txtContacto2 = new JTextField("",20);
        pnlContacto2.add(this.txtContacto2);
        pnlContacto2.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlContacto2);
        
        JPanel pnlDir = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.labDireccion = new JLabel("Dirección  ");
        pnlDir.add(this.labDireccion);        
        this.txtDireccion = new JTextField("",20);
        pnlDir.add(this.txtDireccion);
        pnlDir.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlDir);
        
        JPanel pnlMetodo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.labMetodoPago = new JLabel("Metodo de pago");
        pnlMetodo.add(this.labMetodoPago);        
        this.cbMetodo = new JComboBox();
        this.cbMetodo.addItem("Efectivo");
        this.cbMetodo.addItem("Debito");
        this.cbMetodo.addItem("Credito");
        pnlMetodo.add(this.cbMetodo);
        pnlMetodo.setBackground(new java.awt.Color(134, 204, 161));
        caja.add(pnlMetodo);
        
        this.setBackground(new java.awt.Color(134, 204, 161));
        this.add(caja);
                
    }
}
