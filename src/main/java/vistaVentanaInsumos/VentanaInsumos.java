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
import vistaPacientes.PestagnaPacientes;

/**
 *
 * @author Juan Carlos
 */
public class VentanaInsumos extends JFrame implements ActionListener{
    
    public PanelTablaIns pnlTabla;
    public PanelIngresoIns pnlInsumo;
    public PanelBotones pnlBotones;
    
    public VentanaInsumos(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        Box caja = Box.createVerticalBox();
        
        this.pnlInsumo = new PanelIngresoIns();
        caja.add(this.pnlInsumo);        
        
        this.pnlBotones = new PanelBotones();
        this.pnlBotones.agregar.addActionListener(this);
        this.pnlBotones.eliminar.addActionListener(this);
        caja.add(this.pnlBotones);
        
        this.pnlTabla = new PanelTablaIns();
        caja.add(this.pnlTabla);
        
        this.add(caja);
        this.setBackground(new java.awt.Color(134, 204, 161));
        
        this.setVisible(true);        
        this.setTitle("Detalle de insumos");
        this.setLocation(100,100);
        this.setResizable(false);
        pack();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.pnlBotones.agregar == e.getSource()){
            JOptionPane.showMessageDialog(null,"Esta funcion aun no se implementa\n" + "Proximamente: Se agrega funcion para añadir el insumo o procedimiento ingresado en el panel superior"); 
        }else if(this.pnlBotones.eliminar == e.getSource()){
            JOptionPane.showMessageDialog(null,"Esta funcion aun no se implementa\n" + "Proximamente: Se agrega funcion para eliminar al insumo seleccionado en la tabla"); 
        }
    }
    
}
