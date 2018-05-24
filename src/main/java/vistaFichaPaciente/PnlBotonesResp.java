/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaFichaPaciente;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author HernySenpai
 */
public class PnlBotonesResp extends JPanel {
    public JButton verDetalle;
    
    public PnlBotonesResp(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        
        FlowLayout distribucion = new FlowLayout(FlowLayout.RIGHT);
        this.verDetalle = new JButton("Ver detalle insumos");
        this.add(this.verDetalle);
        
        this.setBackground(new java.awt.Color(134, 204, 161));
        this.setLayout(distribucion);
    }
    
}
