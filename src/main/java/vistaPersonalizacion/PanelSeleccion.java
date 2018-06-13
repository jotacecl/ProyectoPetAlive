/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaPersonalizacion;

import componentes.SubPanelDatos;
import java.awt.Color;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Juan Carlos
 */
public class PanelSeleccion extends JPanel{
    
    private JLabel labTema1, labTema2;
    public JRadioButton rbTema1, rbTema2;
    public int R, G, B;
    
    public SubPanelDatos subPanel;
    
    public PanelSeleccion(){
        this.iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        
        TitledBorder border = new TitledBorder("");       
        this.setBorder(border);
        
        Box caja = Box.createVerticalBox();
        
        this.subPanel = new SubPanelDatos();
        
        JPanel pnlTema1 = new JPanel();        
        caja.add(this.subPanel.generarSubPanelRB(pnlTema1, labTema1, rbTema1, "Tema 1", R, G, B));
        
        JPanel pnlTema2 = new JPanel();
        caja.add(this.subPanel.generarSubPanelRB(pnlTema2, labTema2, rbTema2, "Tema 2", R, G, B));        
        
        this.setBackground(new java.awt.Color(R, G, B));
        this.add(caja);
        
    }
    
    public  void setColorTemaR(int temaSeleccionado){        
        
        if(temaSeleccionado == 1){
            
            this.setBackground(Color.red);
            
        }else if(temaSeleccionado == 2){
                       
            this.setBackground(Color.CYAN);
               
        }else if(temaSeleccionado == 0){
            
            R = 134;
                                 
        }
                
    }
    
    public int setColorTemaG(int temaSeleccionado){
        
         if(temaSeleccionado == 1){            
            
            G = 204;
            
            B= 161;                        
            
        }else if(temaSeleccionado == 2){                       
            
            G = 255;
            
            B = 0;
                        
        }else if(temaSeleccionado == 0){                       
            
            G = 204;
            
            B= 161;                        
            
        }
        
        return G;        
    }
    
    public int setColorTemaB(int temaSeleccionado){
        
        if(temaSeleccionado == 1){            
            
            B= 161;                        
            
        }else if(temaSeleccionado == 2){                       
            
            B = 0;
                        
        }else if(temaSeleccionado == 0){                       
            
            B= 161;                        
            
        }
        
        return B; 
        
    }
       
    
}
    
    

