/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaVentanaInsumos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import vistaVentanaPacientes.VentanaPacientes;

/**
 *
 * @author Juan Carlos
 */
public class VentanaInsumos extends JFrame implements ActionListener{
    
    public PanelTablaIns pTabla;
    public PanelIngresoIns pInsumo;
    public PanelBotones pBotones;
    
    public VentanaInsumos(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        Box caja = Box.createVerticalBox();
        
        this.pInsumo = new PanelIngresoIns();
        caja.add(this.pInsumo);        
        
        this.pBotones = new PanelBotones();
        this.pBotones.agregar.addActionListener(this);
        this.pBotones.eliminar.addActionListener(this);
        caja.add(this.pBotones);
        
        this.pTabla = new PanelTablaIns();
        caja.add(this.pTabla);
        
        this.add(caja);
        this.setBackground(new java.awt.Color(134, 204, 161));
        
        this.setVisible(true);
        this.setDefaultCloseOperation(VentanaPacientes.HIDE_ON_CLOSE);
        this.setTitle("Detalle de insumos");
        this.setLocation(100,100);
        this.setResizable(false);
        pack();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.pBotones.agregar == e.getSource()){
            JOptionPane.showMessageDialog(null,"Esta funcion aun no se implementa\n" + "Proximamente: Se agrega funcion para añadir el insumo o procedimiento ingresado en el panel superior"); 
        }else if(this.pBotones.eliminar == e.getSource()){
            JOptionPane.showMessageDialog(null,"Esta funcion aun no se implementa\n" + "Proximamente: Se agrega funcion para eliminar al insumo seleccionado en la tabla"); 
        }
    }
    
}
