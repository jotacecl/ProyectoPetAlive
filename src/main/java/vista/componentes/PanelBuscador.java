/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.componentes;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Juan Carlos
 */
public class PanelBuscador extends JPanel{
    
    private JLabel labBuscar;
    public JTextField txtBuscar;
    public BotonIcono btnBuscar, btnActualizar;

    public PanelBuscador() {
        this.generarPanel();
    }        
    
    public void generarPanel(){
        this.btnBuscar = new BotonIcono("","data/icon/search.png","data/icon/search.png");
        this.btnActualizar = new BotonIcono("","data/icon/refresh.png","data/icon/refresh.png");
        this.setLayout(new FlowLayout(FlowLayout.RIGHT));
        this.labBuscar = new JLabel("RUT");
        this.txtBuscar = new JTextField("EJ: xx.xxx.xxx-x",20);
        this.txtBuscar.setForeground(Color.gray);
                                       
        this.add(this.labBuscar);
        this.add(this.txtBuscar);
        this.add(this.btnBuscar);
        this.add(this.btnActualizar);
        
        this.setBackground(new java.awt.Color(134,204,161));
    }
    
}
