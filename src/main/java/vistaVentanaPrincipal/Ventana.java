/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaVentanaPrincipal;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Juan Carlos
 */
public class Ventana extends JFrame implements ActionListener{
    
    private PanelLateral pLat;
    private PanelFicha pFic;
    
    public Ventana(){
        this.inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        
       this.pLat = new PanelLateral();
       this.add(this.pLat, BorderLayout.WEST);
       
       this.pFic = new PanelFicha();
       this.add(this.pFic, BorderLayout.CENTER);
       
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Veterinaria");
        this.setSize(1000,600);
        this.setLocation(100,100);
        this.setVisible(true);
//        pack();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
