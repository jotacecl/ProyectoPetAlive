/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaPersonalizacion;

import componentes.PanelBotones;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Juan Carlos
 */
public class VentanaPersonalizacion extends JFrame implements ActionListener{
    
    public PanelSeleccion pnlSeleccion;
    public PanelBotones pnlBotones;
    private int temaSeleccionado = 0;
    
    public VentanaPersonalizacion(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        
        this.pnlSeleccion = new PanelSeleccion();
        this.add(this.pnlSeleccion, BorderLayout.CENTER);
        
        this.pnlBotones = new PanelBotones(3);
        this.add(this.pnlBotones, BorderLayout.SOUTH);
        
        this.pnlBotones.btnGuardar.addActionListener(this);
//                
//        this.pnlSeleccion.rbTema2.addActionListener(this);
        
        this.setBackground(new java.awt.Color(134, 204, 161));
        this.setVisible(true);
        this.setTitle("Seleccion de tema");
        this.setLocation(100,100);
        this.setResizable(false);       
        pack();
    }
    
     public void actualizarVentana(){        
//        SwingUtilities.updateComponentTreeUI(this);
//        synchronized(getTreeLock()) {
//            validateTree();
//        }
        this.pnlSeleccion.updateUI();
        this.pnlSeleccion.repaint();        
    }   

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.pnlBotones.btnGuardar == e.getSource()){
            this.pnlSeleccion.setColorTemaR(1);
//            this.pnlSeleccion.setColorTemaG(2);
//            this.pnlSeleccion.setColorTemaB(2);
//            this.actualizarVentana();
//            this.pnlSeleccion.repaint();
//            this.pnlSeleccion.updateUI();            
//            removeAll();
//            revalidate();
//            repaint();
        }else if(this.pnlSeleccion.rbTema2.isSelected()){            
        }
    }
    
}
