/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaVentanaPrincipal;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Juan Carlos
 */
public class PanelJaulas extends JPanel{
    
    private int cantidadJaulasL = 6, cantidadJaulasM = 10, cantidadJaulasS = 15;
    
    public ArrayList<Jaula> jaulasL, jaulasS, jaulasM;
    
    public PanelJaulas(){
        this.inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        
        TitledBorder border = new TitledBorder("Jaulas");
        border.setTitleColor(new java.awt.Color(54,82,48));
        this.setBorder(border);
        
        Box caja = Box.createVerticalBox();
        Box caja2 = Box.createVerticalBox();
        Box caja3 = Box.createVerticalBox();
        
        JPanel panelL = new JPanel();        
        this.crearJaulas(jaulasL,cantidadJaulasL,"L", panelL);
                
        JPanel panelM = new JPanel();
        this.crearJaulas(jaulasM,cantidadJaulasM,"M", panelM);
        
        JPanel panelS = new JPanel();
        this.crearJaulas(jaulasS,cantidadJaulasS,"S", panelS);
        
        caja.add(panelL);
        
        caja2.add(panelM);
        
        caja3.add(panelS);
        
        this.add(caja, BorderLayout.WEST);
        this.add(caja2, BorderLayout.CENTER);
        this.add(caja3, BorderLayout.EAST);
        
        this.setBackground(new java.awt.Color(134,204,161));
        
    }
        
   private void crearJaulas(ArrayList<Jaula> jaulas, int tamanno, String letraTamanno, JPanel panel){
        
        jaulas = new ArrayList<>();
        
        TitledBorder border = new TitledBorder(letraTamanno);
        border.setTitleColor(new java.awt.Color(54,82,48));
        panel.setBorder(border);
        
        panel.setBackground(new java.awt.Color(134,204,161));
        
        if(tamanno<=10){
            GridLayout mgr = new GridLayout(tamanno/2,6);
            panel.setLayout(mgr);
        }else{
            GridLayout mgr = new GridLayout(tamanno/3,6);
            panel.setLayout(mgr);
        }
                        
        for(int i=0; i<tamanno; i++){
            jaulas.add(new Jaula());
            jaulas.get(i).setText(""+(i+1));
            jaulas.get(i).setForeground(new java.awt.Color(78,117,68));
            jaulas.get(i).setBackground(new java.awt.Color(227,225,143));
            jaulas.get(i).setToolTipText("Jaula "+(i+1)+" - Tamaño "+letraTamanno);
            panel.add(jaulas.get(i));
        }
            
    }        
    
}
